package uo;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class b<T> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Executor f8395v = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public volatile a8<T> f8396gv;
    public final Set<d<Throwable>> n3;
    public final Set<d<T>> y;
    public final Handler zn;

    public class y extends FutureTask<a8<T>> {
        public y(Callable<a8<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                b.this.f(get());
            } catch (InterruptedException | ExecutionException e4) {
                b.this.f(new a8(e4));
            }
        }
    }

    public b(Callable<a8<T>> callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.n3);
        if (arrayList.isEmpty()) {
            ic.a.gv("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).onResult(th);
        }
    }

    public synchronized b<T> c5(d<Throwable> dVar) {
        this.n3.remove(dVar);
        return this;
    }

    public final void f(@Nullable a8<T> a8Var) {
        if (this.f8396gv != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f8396gv = a8Var;
        fb();
    }

    public final void fb() {
        this.zn.post(new Runnable() { // from class: uo.x
            @Override // java.lang.Runnable
            public final void run() {
                this.y.v();
            }
        });
    }

    public synchronized b<T> gv(d<T> dVar) {
        try {
            a8<T> a8Var = this.f8396gv;
            if (a8Var != null && a8Var.n3() != null) {
                dVar.onResult(a8Var.n3());
            }
            this.y.add(dVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized b<T> i9(d<T> dVar) {
        this.y.remove(dVar);
        return this;
    }

    public final synchronized void s(T t3) {
        Iterator it = new ArrayList(this.y).iterator();
        while (it.hasNext()) {
            ((d) it.next()).onResult(t3);
        }
    }

    public final /* synthetic */ void v() {
        a8<T> a8Var = this.f8396gv;
        if (a8Var == null) {
            return;
        }
        if (a8Var.n3() != null) {
            s(a8Var.n3());
        } else {
            a(a8Var.y());
        }
    }

    public synchronized b<T> zn(d<Throwable> dVar) {
        try {
            a8<T> a8Var = this.f8396gv;
            if (a8Var != null && a8Var.y() != null) {
                dVar.onResult(a8Var.y());
            }
            this.n3.add(dVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public b(Callable<a8<T>> callable, boolean z) {
        this.y = new LinkedHashSet(1);
        this.n3 = new LinkedHashSet(1);
        this.zn = new Handler(Looper.getMainLooper());
        this.f8396gv = null;
        if (!z) {
            f8395v.execute(new y(callable));
            return;
        }
        try {
            f(callable.call());
        } catch (Throwable th) {
            f(new a8<>(th));
        }
    }
}
