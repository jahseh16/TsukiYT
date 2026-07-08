package wj1;

import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final Logger f9020i9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<wj1.gv> f9022a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Runnable f9023fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f9024gv;
    public int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<wj1.gv> f9025v;
    public final y y;
    public boolean zn;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n3 f9021s = new n3(null);

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final v f9019c5 = new v(new zn(tj1.gv.vl(Intrinsics.stringPlus(tj1.gv.f8211c5, " TaskRunner"), true)));

    public static final class gv implements Runnable {
        public gv() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wj1.y yVarGv;
            long jNanoTime;
            while (true) {
                v vVar = v.this;
                synchronized (vVar) {
                    yVarGv = vVar.gv();
                }
                if (yVarGv == null) {
                    return;
                }
                wj1.gv gvVarGv = yVarGv.gv();
                Intrinsics.checkNotNull(gvVarGv);
                v vVar2 = v.this;
                boolean zIsLoggable = v.f9021s.y().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = gvVarGv.s().fb().nanoTime();
                    wj1.n3.zn(yVarGv, gvVarGv, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    try {
                        vVar2.i9(yVarGv);
                        Unit unit = Unit.INSTANCE;
                        if (zIsLoggable) {
                            wj1.n3.zn(yVarGv, gvVarGv, Intrinsics.stringPlus("finished run in ", wj1.n3.n3(gvVarGv.s().fb().nanoTime() - jNanoTime)));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        wj1.n3.zn(yVarGv, gvVarGv, Intrinsics.stringPlus("failed a run in ", wj1.n3.n3(gvVarGv.s().fb().nanoTime() - jNanoTime)));
                    }
                    throw th;
                }
            }
        }
    }

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger y() {
            return v.f9020i9;
        }

        public n3() {
        }
    }

    public interface y {
        void execute(Runnable runnable);

        void n3(v vVar);

        long nanoTime();

        void y(v vVar, long j);
    }

    public static final class zn implements y {
        public final ThreadPoolExecutor y;

        public zn(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.y = new ThreadPoolExecutor(0, Reader.READ_DONE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // wj1.v.y
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.y.execute(runnable);
        }

        @Override // wj1.v.y
        public void n3(v taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // wj1.v.y
        public long nanoTime() {
            return System.nanoTime();
        }

        @Override // wj1.v.y
        public void y(v taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j4 = j / 1000000;
            long j7 = j - (1000000 * j4);
            if (j4 > 0 || j > 0) {
                taskRunner.wait(j4, (int) j7);
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(v.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f9020i9 = logger;
    }

    public v(y backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.y = backend;
        this.n3 = 10000;
        this.f9025v = new ArrayList();
        this.f9022a = new ArrayList();
        this.f9023fb = new gv();
    }

    public final void a() {
        int size = this.f9025v.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                this.f9025v.get(size).n3();
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        int size2 = this.f9022a.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i5 = size2 - 1;
            wj1.gv gvVar = this.f9022a.get(size2);
            gvVar.n3();
            if (gvVar.v().isEmpty()) {
                this.f9022a.remove(size2);
            }
            if (i5 < 0) {
                return;
            } else {
                size2 = i5;
            }
        }
    }

    public final wj1.gv c5() {
        int i;
        synchronized (this) {
            i = this.n3;
            this.n3 = i + 1;
        }
        return new wj1.gv(this, Intrinsics.stringPlus("Q", Integer.valueOf(i)));
    }

    public final y fb() {
        return this.y;
    }

    public final wj1.y gv() {
        boolean z;
        if (tj1.gv.f8214s && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f9022a.isEmpty()) {
            long jNanoTime = this.y.nanoTime();
            Iterator<wj1.gv> it = this.f9022a.iterator();
            long jMin = Long.MAX_VALUE;
            wj1.y yVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                wj1.y yVar2 = it.next().v().get(0);
                long jMax = Math.max(0L, yVar2.zn() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (yVar != null) {
                        z = true;
                        break;
                    }
                    yVar = yVar2;
                }
            }
            if (yVar != null) {
                v(yVar);
                if (z || (!this.zn && !this.f9022a.isEmpty())) {
                    this.y.execute(this.f9023fb);
                }
                return yVar;
            }
            if (this.zn) {
                if (jMin < this.f9024gv - jNanoTime) {
                    this.y.n3(this);
                }
                return null;
            }
            this.zn = true;
            this.f9024gv = jNanoTime + jMin;
            try {
                try {
                    this.y.y(this, jMin);
                } catch (InterruptedException unused) {
                    a();
                }
            } finally {
                this.zn = false;
            }
        }
        return null;
    }

    public final void i9(wj1.y yVar) {
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(yVar.n3());
        try {
            long jA = yVar.a();
            synchronized (this) {
                zn(yVar, jA);
                Unit unit = Unit.INSTANCE;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                zn(yVar, -1L);
                Unit unit2 = Unit.INSTANCE;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void s(wj1.gv taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (tj1.gv.f8214s && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.zn() == null) {
            if (taskQueue.v().isEmpty()) {
                this.f9022a.remove(taskQueue);
            } else {
                tj1.gv.zn(this.f9022a, taskQueue);
            }
        }
        if (this.zn) {
            this.y.n3(this);
        } else {
            this.y.execute(this.f9023fb);
        }
    }

    public final void v(wj1.y yVar) {
        if (tj1.gv.f8214s && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        yVar.fb(-1L);
        wj1.gv gvVarGv = yVar.gv();
        Intrinsics.checkNotNull(gvVarGv);
        gvVarGv.v().remove(yVar);
        this.f9022a.remove(gvVarGv);
        gvVarGv.t(yVar);
        this.f9025v.add(gvVarGv);
    }

    public final void zn(wj1.y yVar, long j) {
        if (tj1.gv.f8214s && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        wj1.gv gvVarGv = yVar.gv();
        Intrinsics.checkNotNull(gvVarGv);
        if (gvVarGv.zn() != yVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zGv = gvVarGv.gv();
        gvVarGv.tl(false);
        gvVarGv.t(null);
        this.f9025v.remove(gvVarGv);
        if (j != -1 && !zGv && !gvVarGv.fb()) {
            gvVarGv.f(yVar, j, true);
        }
        if (gvVarGv.v().isEmpty()) {
            return;
        }
        this.f9022a.add(gvVarGv);
    }
}
