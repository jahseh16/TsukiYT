package mn;

import android.os.Handler;
import androidx.annotation.Nullable;
import ft.g;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public interface r {

    public static final class y {

        @Nullable
        public final r n3;

        @Nullable
        public final Handler y;

        public y(@Nullable Handler handler, @Nullable r rVar) {
            this.y = rVar != null ? (Handler) v0.y.v(handler) : null;
            this.n3 = rVar;
        }

        public final /* synthetic */ void c(boolean z) {
            ((r) ut.i9(this.n3)).onSkipSilenceEnabledChanged(z);
        }

        public final /* synthetic */ void co(Exception exc) {
            ((r) ut.i9(this.n3)).gv(exc);
        }

        public final /* synthetic */ void d0(int i, long j, long j4) {
            ((r) ut.i9(this.n3)).i4(i, j, j4);
        }

        public void f(final Exception exc) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.tl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.mt(exc);
                    }
                });
            }
        }

        public final /* synthetic */ void f3(g gVar, di.c5 c5Var) {
            ((r) ut.i9(this.n3)).c(gVar);
            ((r) ut.i9(this.n3)).co(gVar, c5Var);
        }

        public void fh(final long j) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.wz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.n(j);
                    }
                });
            }
        }

        public final /* synthetic */ void i4(di.v vVar) {
            ((r) ut.i9(this.n3)).wz(vVar);
        }

        public void mg(final int i, final long j, final long j4) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.co
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.d0(i, j, j4);
                    }
                });
            }
        }

        public final /* synthetic */ void mt(Exception exc) {
            ((r) ut.i9(this.n3)).r(exc);
        }

        public final /* synthetic */ void n(long j) {
            ((r) ut.i9(this.n3)).f(j);
        }

        public void p(final g gVar, @Nullable final di.c5 c5Var) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.f3(gVar, c5Var);
                    }
                });
            }
        }

        public final /* synthetic */ void r(String str) {
            ((r) ut.i9(this.n3)).fb(str);
        }

        public void rz(final boolean z) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.c(z);
                    }
                });
            }
        }

        public void t(final Exception exc) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.mt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.co(exc);
                    }
                });
            }
        }

        public void tl(final String str, final long j, final long j4) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.z(str, j, j4);
                    }
                });
            }
        }

        public void w(final di.v vVar) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.xc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.i4(vVar);
                    }
                });
            }
        }

        public void wz(final String str) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.r(str);
                    }
                });
            }
        }

        public final /* synthetic */ void x4(di.v vVar) {
            vVar.zn();
            ((r) ut.i9(this.n3)).i9(vVar);
        }

        public void xc(final di.v vVar) {
            vVar.zn();
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mn.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.x4(vVar);
                    }
                });
            }
        }

        public final /* synthetic */ void z(String str, long j, long j4) {
            ((r) ut.i9(this.n3)).s(str, j, j4);
        }
    }

    @Deprecated
    void c(g gVar);

    void co(g gVar, @Nullable di.c5 c5Var);

    void f(long j);

    void fb(String str);

    void gv(Exception exc);

    void i4(int i, long j, long j4);

    void i9(di.v vVar);

    void onSkipSilenceEnabledChanged(boolean z);

    void r(Exception exc);

    void s(String str, long j, long j4);

    void wz(di.v vVar);
}
