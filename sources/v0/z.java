package v0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import v0.wz;

/* JADX INFO: loaded from: classes.dex */
public final class z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<Runnable> f8775a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f8776c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Object f8777fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final CopyOnWriteArraySet<zn<T>> f8778gv;
    public final p n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8779s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayDeque<Runnable> f8780v;
    public final v y;
    public final n3<T> zn;

    public interface n3<T> {
        void y(T t3, wz wzVar);
    }

    public interface y<T> {
        void invoke(T t3);
    }

    public static final class zn<T> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f8781gv;
        public wz.n3 n3 = new wz.n3();
        public final T y;
        public boolean zn;

        public zn(T t3) {
            this.y = t3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || zn.class != obj.getClass()) {
                return false;
            }
            return this.y.equals(((zn) obj).y);
        }

        public int hashCode() {
            return this.y.hashCode();
        }

        public void n3(n3<T> n3Var) {
            if (this.f8781gv || !this.zn) {
                return;
            }
            wz wzVarV = this.n3.v();
            this.n3 = new wz.n3();
            this.zn = false;
            n3Var.y(this.y, wzVarV);
        }

        public void y(int i, y<T> yVar) {
            if (this.f8781gv) {
                return;
            }
            if (i != -1) {
                this.n3.y(i);
            }
            this.zn = true;
            yVar.invoke(this.y);
        }

        public void zn(n3<T> n3Var) {
            this.f8781gv = true;
            if (this.zn) {
                this.zn = false;
                n3Var.y(this.y, this.n3.v());
            }
        }
    }

    public z(Looper looper, v vVar, n3<T> n3Var) {
        this(new CopyOnWriteArraySet(), looper, vVar, n3Var);
    }

    public static /* synthetic */ void s(CopyOnWriteArraySet copyOnWriteArraySet, int i, y yVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zn) it.next()).y(i, yVar);
        }
    }

    public void a() {
        tl();
        if (this.f8775a.isEmpty()) {
            return;
        }
        if (!this.n3.zn(0)) {
            p pVar = this.n3;
            pVar.y(pVar.n3(0));
        }
        boolean zIsEmpty = this.f8780v.isEmpty();
        this.f8780v.addAll(this.f8775a);
        this.f8775a.clear();
        if (zIsEmpty) {
            while (!this.f8780v.isEmpty()) {
                this.f8780v.peekFirst().run();
                this.f8780v.removeFirst();
            }
        }
    }

    public void c5(final int i, final y<T> yVar) {
        tl();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f8778gv);
        this.f8775a.add(new Runnable() { // from class: v0.mt
            @Override // java.lang.Runnable
            public final void run() {
                z.s(copyOnWriteArraySet, i, yVar);
            }
        });
    }

    public void f(T t3) {
        tl();
        for (zn<T> znVar : this.f8778gv) {
            if (znVar.y.equals(t3)) {
                znVar.zn(this.zn);
                this.f8778gv.remove(znVar);
            }
        }
    }

    public final boolean fb(Message message) {
        Iterator<zn<T>> it = this.f8778gv.iterator();
        while (it.hasNext()) {
            it.next().n3(this.zn);
            if (this.n3.zn(0)) {
                return true;
            }
        }
        return true;
    }

    @CheckResult
    public z<T> gv(Looper looper, v vVar, n3<T> n3Var) {
        return new z<>(this.f8778gv, looper, vVar, n3Var);
    }

    public void i9() {
        tl();
        synchronized (this.f8777fb) {
            this.f8779s = true;
        }
        Iterator<zn<T>> it = this.f8778gv.iterator();
        while (it.hasNext()) {
            it.next().zn(this.zn);
        }
        this.f8778gv.clear();
    }

    public void t(int i, y<T> yVar) {
        c5(i, yVar);
        a();
    }

    public final void tl() {
        if (this.f8776c5) {
            v0.y.fb(Thread.currentThread() == this.n3.fb().getThread());
        }
    }

    @CheckResult
    public z<T> v(Looper looper, n3<T> n3Var) {
        return gv(looper, this.y, n3Var);
    }

    public void zn(T t3) {
        v0.y.v(t3);
        synchronized (this.f8777fb) {
            try {
                if (this.f8779s) {
                    return;
                }
                this.f8778gv.add(new zn<>(t3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public z(CopyOnWriteArraySet<zn<T>> copyOnWriteArraySet, Looper looper, v vVar, n3<T> n3Var) {
        this.y = vVar;
        this.f8778gv = copyOnWriteArraySet;
        this.zn = n3Var;
        this.f8777fb = new Object();
        this.f8780v = new ArrayDeque<>();
        this.f8775a = new ArrayDeque<>();
        this.n3 = vVar.n3(looper, new Handler.Callback() { // from class: v0.co
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.y.fb(message);
            }
        });
        this.f8776c5 = true;
    }
}
