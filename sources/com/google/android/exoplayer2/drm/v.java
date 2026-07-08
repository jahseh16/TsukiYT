package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;
import ur.mg;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public interface v {

    public static class y {

        @Nullable
        public final mg.n3 n3;
        public final int y;
        public final CopyOnWriteArrayList<C0050y> zn;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.v$y$y, reason: collision with other inner class name */
        public static final class C0050y {
            public v n3;
            public Handler y;

            public C0050y(Handler handler, v vVar) {
                this.y = handler;
                this.n3 = vVar;
            }
        }

        public y() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void c5() {
            for (C0050y c0050y : this.zn) {
                final v vVar = c0050y.n3;
                ut.oa(c0050y.y, new Runnable() { // from class: v5.xc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.xc(vVar);
                    }
                });
            }
        }

        public final /* synthetic */ void co(v vVar) {
            vVar.xc(this.y, this.n3);
        }

        public void f(final int i) {
            for (C0050y c0050y : this.zn) {
                final v vVar = c0050y.n3;
                ut.oa(c0050y.y, new Runnable() { // from class: v5.wz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.p(vVar, i);
                    }
                });
            }
        }

        public void fb(Handler handler, v vVar) {
            v0.y.v(handler);
            v0.y.v(vVar);
            this.zn.add(new C0050y(handler, vVar));
        }

        public void i9() {
            for (C0050y c0050y : this.zn) {
                final v vVar = c0050y.n3;
                ut.oa(c0050y.y, new Runnable() { // from class: v5.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.w(vVar);
                    }
                });
            }
        }

        public final /* synthetic */ void mt(v vVar, Exception exc) {
            vVar.w(this.y, this.n3, exc);
        }

        public final /* synthetic */ void p(v vVar, int i) {
            vVar.d0(this.y, this.n3);
            vVar.y(this.y, this.n3, i);
        }

        @CheckResult
        public y r(int i, @Nullable mg.n3 n3Var) {
            return new y(this.zn, i, n3Var);
        }

        public void s() {
            for (C0050y c0050y : this.zn) {
                final v vVar = c0050y.n3;
                ut.oa(c0050y.y, new Runnable() { // from class: v5.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.wz(vVar);
                    }
                });
            }
        }

        public void t(final Exception exc) {
            for (C0050y c0050y : this.zn) {
                final v vVar = c0050y.n3;
                ut.oa(c0050y.y, new Runnable() { // from class: v5.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.mt(vVar, exc);
                    }
                });
            }
        }

        public void tl() {
            for (C0050y c0050y : this.zn) {
                final v vVar = c0050y.n3;
                ut.oa(c0050y.y, new Runnable() { // from class: v5.tl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.co(vVar);
                    }
                });
            }
        }

        public final /* synthetic */ void w(v vVar) {
            vVar.z(this.y, this.n3);
        }

        public final /* synthetic */ void wz(v vVar) {
            vVar.zn(this.y, this.n3);
        }

        public final /* synthetic */ void xc(v vVar) {
            vVar.c(this.y, this.n3);
        }

        public void z(v vVar) {
            for (C0050y c0050y : this.zn) {
                if (c0050y.n3 == vVar) {
                    this.zn.remove(c0050y);
                }
            }
        }

        public y(CopyOnWriteArrayList<C0050y> copyOnWriteArrayList, int i, @Nullable mg.n3 n3Var) {
            this.zn = copyOnWriteArrayList;
            this.y = i;
            this.n3 = n3Var;
        }
    }

    void c(int i, @Nullable mg.n3 n3Var);

    @Deprecated
    void d0(int i, @Nullable mg.n3 n3Var);

    void w(int i, @Nullable mg.n3 n3Var, Exception exc);

    void xc(int i, @Nullable mg.n3 n3Var);

    void y(int i, @Nullable mg.n3 n3Var, int i5);

    void z(int i, @Nullable mg.n3 n3Var);

    void zn(int i, @Nullable mg.n3 n3Var);
}
