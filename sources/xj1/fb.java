package xj1;

import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xj1.v;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f9190a = new y(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final n3 f9191gv;
    public final long n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConcurrentLinkedQueue<a> f9192v;
    public final int y;
    public final wj1.gv zn;

    public static final class n3 extends wj1.y {
        public n3(String str) {
            super(str, false, 2, null);
        }

        @Override // wj1.y
        public long a() {
            return fb.this.n3(System.nanoTime());
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public fb(wj1.v taskRunner, int i, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.y = i;
        this.n3 = timeUnit.toNanos(j);
        this.zn = taskRunner.c5();
        this.f9191gv = new n3(Intrinsics.stringPlus(tj1.gv.f8211c5, " ConnectionPool"));
        this.f9192v = new ConcurrentLinkedQueue<>();
        if (j <= 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    public final int gv(a aVar, long j) {
        if (tj1.gv.f8214s && !Thread.holdsLock(aVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + aVar);
        }
        List<Reference<v>> listP = aVar.p();
        int i = 0;
        while (i < listP.size()) {
            Reference<v> reference = listP.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                ck1.i9.y.fb().tl("A connection to " + aVar.n3().y().t() + " was leaked. Did you forget to close a response body?", ((v.n3) reference).y());
                listP.remove(i);
                aVar.mg(true);
                if (listP.isEmpty()) {
                    aVar.rz(j - this.n3);
                    return 0;
                }
            }
        }
        return listP.size();
    }

    public final long n3(long j) {
        int i = 0;
        long j4 = Long.MIN_VALUE;
        a aVar = null;
        int i5 = 0;
        for (a connection : this.f9192v) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (gv(connection, j) > 0) {
                    i5++;
                } else {
                    i++;
                    long jMt = j - connection.mt();
                    if (jMt > j4) {
                        aVar = connection;
                        j4 = jMt;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        long j7 = this.n3;
        if (j4 < j7 && i <= this.y) {
            if (i > 0) {
                return j7 - j4;
            }
            if (i5 > 0) {
                return j7;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(aVar);
        synchronized (aVar) {
            if (!aVar.p().isEmpty()) {
                return 0L;
            }
            if (aVar.mt() + j4 != j) {
                return 0L;
            }
            aVar.mg(true);
            this.f9192v.remove(aVar);
            tj1.gv.wz(aVar.ta());
            if (this.f9192v.isEmpty()) {
                this.zn.y();
            }
            return 0L;
        }
    }

    public final void v(a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!tj1.gv.f8214s || Thread.holdsLock(connection)) {
            this.f9192v.add(connection);
            wj1.gv.i9(this.zn, this.f9191gv, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:8:0x0024, B:15:0x0033, B:13:0x002d, B:18:0x0037), top: B:26:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(sj1.y r4, xj1.v r5, java.util.List<sj1.ta> r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<xj1.a> r0 = r3.f9192v
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            xj1.a r1 = (xj1.a) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.f3()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L2d
            goto L33
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.x4(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L37
        L33:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L37:
            r5.gv(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xj1.fb.y(sj1.y, xj1.v, java.util.List, boolean):boolean");
    }

    public final boolean zn(a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (tj1.gv.f8214s && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
        }
        if (!connection.co() && this.y != 0) {
            wj1.gv.i9(this.zn, this.f9191gv, 0L, 2, null);
            return false;
        }
        connection.mg(true);
        this.f9192v.remove(connection);
        if (this.f9192v.isEmpty()) {
            this.zn.y();
        }
        return true;
    }
}
