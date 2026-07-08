package wj1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9016a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public y f9017gv;
    public final String n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<y> f9018v;
    public final v y;
    public boolean zn;

    public gv(v taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.y = taskRunner;
        this.n3 = name;
        this.f9018v = new ArrayList();
    }

    public static /* synthetic */ void i9(gv gvVar, y yVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        gvVar.c5(yVar, j);
    }

    public final String a() {
        return this.n3;
    }

    public final void c5(y task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.y) {
            if (!fb()) {
                if (f(task, j, false)) {
                    s().s(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.y()) {
                if (v.f9021s.y().isLoggable(Level.FINE)) {
                    n3.zn(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (v.f9021s.y().isLoggable(Level.FINE)) {
                    n3.zn(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean f(y task, long j, boolean z) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.v(this);
        long jNanoTime = this.y.fb().nanoTime();
        long j4 = jNanoTime + j;
        int iIndexOf = this.f9018v.indexOf(task);
        if (iIndexOf != -1) {
            if (task.zn() <= j4) {
                if (v.f9021s.y().isLoggable(Level.FINE)) {
                    n3.zn(task, this, "already scheduled");
                }
                return false;
            }
            this.f9018v.remove(iIndexOf);
        }
        task.fb(j4);
        if (v.f9021s.y().isLoggable(Level.FINE)) {
            n3.zn(task, this, z ? Intrinsics.stringPlus("run again after ", n3.n3(j4 - jNanoTime)) : Intrinsics.stringPlus("scheduled after ", n3.n3(j4 - jNanoTime)));
        }
        Iterator<y> it = this.f9018v.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().zn() - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f9018v.size();
        }
        this.f9018v.add(size, task);
        return size == 0;
    }

    public final boolean fb() {
        return this.zn;
    }

    public final boolean gv() {
        return this.f9016a;
    }

    public final boolean n3() {
        y yVar = this.f9017gv;
        if (yVar != null) {
            Intrinsics.checkNotNull(yVar);
            if (yVar.y()) {
                this.f9016a = true;
            }
        }
        int size = this.f9018v.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (this.f9018v.get(size).y()) {
                    y yVar2 = this.f9018v.get(size);
                    if (v.f9021s.y().isLoggable(Level.FINE)) {
                        n3.zn(yVar2, this, "canceled");
                    }
                    this.f9018v.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    public final v s() {
        return this.y;
    }

    public final void t(y yVar) {
        this.f9017gv = yVar;
    }

    public final void tl(boolean z) {
        this.f9016a = z;
    }

    public String toString() {
        return this.n3;
    }

    public final List<y> v() {
        return this.f9018v;
    }

    public final void wz(boolean z) {
        this.zn = z;
    }

    public final void xc() {
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.y) {
            try {
                wz(true);
                if (n3()) {
                    s().s(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y() {
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.y) {
            try {
                if (n3()) {
                    s().s(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final y zn() {
        return this.f9017gv;
    }
}
