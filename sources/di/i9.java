package di;

import androidx.annotation.Nullable;
import di.a;
import di.fb;
import di.s;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class i9<I extends fb, O extends s, E extends a> implements gv<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O[] f3184a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public I f3185c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3186f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f3187fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public E f3189i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3191t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f3192tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final I[] f3193v;
    public final Thread y;
    public final Object n3 = new Object();
    public final ArrayDeque<I> zn = new ArrayDeque<>();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final ArrayDeque<O> f3188gv = new ArrayDeque<>();

    public class y extends Thread {
        public y(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            i9.this.z();
        }
    }

    public i9(I[] iArr, O[] oArr) {
        this.f3193v = iArr;
        this.f3187fb = iArr.length;
        for (int i = 0; i < this.f3187fb; i++) {
            ((I[]) this.f3193v)[i] = fb();
        }
        this.f3184a = oArr;
        this.f3190s = oArr.length;
        for (int i5 = 0; i5 < this.f3190s; i5++) {
            ((O[]) this.f3184a)[i5] = s();
        }
        y yVar = new y("ExoPlayer:SimpleDecoder");
        this.y = yVar;
        yVar.start();
    }

    public final boolean a() {
        return !this.zn.isEmpty() && this.f3190s > 0;
    }

    public abstract E c5(Throwable th);

    public final void co(O o) {
        o.a();
        O[] oArr = this.f3184a;
        int i = this.f3190s;
        this.f3190s = i + 1;
        oArr[i] = o;
    }

    public final boolean f() throws InterruptedException {
        E e4;
        synchronized (this.n3) {
            while (!this.f3191t && !a()) {
                try {
                    this.n3.wait();
                } finally {
                }
            }
            if (this.f3191t) {
                return false;
            }
            I iRemoveFirst = this.zn.removeFirst();
            O[] oArr = this.f3184a;
            int i = this.f3190s - 1;
            this.f3190s = i;
            O o = oArr[i];
            boolean z = this.f3186f;
            this.f3186f = false;
            if (iRemoveFirst.t()) {
                o.v(4);
            } else {
                if (iRemoveFirst.i9()) {
                    o.v(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.tl()) {
                    o.v(134217728);
                }
                try {
                    e4 = (E) i9(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e5) {
                    e4 = (E) c5(e5);
                } catch (RuntimeException e6) {
                    e4 = (E) c5(e6);
                }
                if (e4 != null) {
                    synchronized (this.n3) {
                        this.f3189i9 = e4;
                    }
                    return false;
                }
            }
            synchronized (this.n3) {
                try {
                    if (this.f3186f) {
                        o.p();
                    } else if (o.i9()) {
                        this.f3192tl++;
                        o.p();
                    } else {
                        o.f3194fb = this.f3192tl;
                        this.f3192tl = 0;
                        this.f3188gv.addLast(o);
                    }
                    p(iRemoveFirst);
                } finally {
                }
            }
            return true;
        }
    }

    public abstract I fb();

    @Override // di.gv
    public final void flush() {
        synchronized (this.n3) {
            try {
                this.f3186f = true;
                this.f3192tl = 0;
                I i = this.f3185c5;
                if (i != null) {
                    p(i);
                    this.f3185c5 = null;
                }
                while (!this.zn.isEmpty()) {
                    p(this.zn.removeFirst());
                }
                while (!this.f3188gv.isEmpty()) {
                    this.f3188gv.removeFirst().p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public abstract E i9(I i, O o, boolean z);

    public void mt(O o) {
        synchronized (this.n3) {
            co(o);
            wz();
        }
    }

    public final void p(I i) {
        i.a();
        I[] iArr = this.f3193v;
        int i5 = this.f3187fb;
        this.f3187fb = i5 + 1;
        iArr[i5] = i;
    }

    public final void r(int i) {
        v0.y.fb(this.f3187fb == this.f3193v.length);
        for (I i5 : this.f3193v) {
            i5.mt(i);
        }
    }

    @Override // di.gv
    public void release() {
        synchronized (this.n3) {
            this.f3191t = true;
            this.n3.notify();
        }
        try {
            this.y.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public abstract O s();

    @Override // di.gv
    @Nullable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final I gv() throws a {
        I i;
        synchronized (this.n3) {
            xc();
            v0.y.fb(this.f3185c5 == null);
            int i5 = this.f3187fb;
            if (i5 == 0) {
                i = null;
            } else {
                I[] iArr = this.f3193v;
                int i8 = i5 - 1;
                this.f3187fb = i8;
                i = iArr[i8];
            }
            this.f3185c5 = i;
        }
        return i;
    }

    @Override // di.gv
    @Nullable
    /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
    public final O n3() throws a {
        synchronized (this.n3) {
            try {
                xc();
                if (this.f3188gv.isEmpty()) {
                    return null;
                }
                return this.f3188gv.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // di.gv
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void zn(I i) throws a {
        synchronized (this.n3) {
            xc();
            v0.y.y(i == this.f3185c5);
            this.zn.addLast(i);
            wz();
            this.f3185c5 = null;
        }
    }

    public final void wz() {
        if (a()) {
            this.n3.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends di.a */
    public final void xc() throws E, a {
        E e4 = this.f3189i9;
        if (e4 != null) {
            throw e4;
        }
    }

    public final void z() {
        do {
            try {
            } catch (InterruptedException e4) {
                throw new IllegalStateException(e4);
            }
        } while (f());
    }
}
