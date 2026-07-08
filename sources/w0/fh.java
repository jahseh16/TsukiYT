package w0;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import ft.g;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public interface fh {

    public static final class y {

        @Nullable
        public final fh n3;

        @Nullable
        public final Handler y;

        public y(@Nullable Handler handler, @Nullable fh fhVar) {
            this.y = fhVar != null ? (Handler) v0.y.v(handler) : null;
            this.n3 = fhVar;
        }

        public final /* synthetic */ void c(mg mgVar) {
            ((fh) ut.i9(this.n3)).onVideoSizeChanged(mgVar);
        }

        public final /* synthetic */ void co(di.v vVar) {
            vVar.zn();
            ((fh) ut.i9(this.n3)).x4(vVar);
        }

        public void d0(final Object obj) {
            if (this.y != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.y.post(new Runnable() { // from class: w0.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.i4(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void f(final String str, final long j, final long j4) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.f3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.p(str, j, j4);
                    }
                });
            }
        }

        public final /* synthetic */ void f3(long j, int i) {
            ((fh) ut.i9(this.n3)).f3(j, i);
        }

        public void fh(final long j, final int i) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.f3(j, i);
                    }
                });
            }
        }

        public final /* synthetic */ void i4(Object obj, long j) {
            ((fh) ut.i9(this.n3)).mt(obj, j);
        }

        public void mg(final mg mgVar) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.mt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.c(mgVar);
                    }
                });
            }
        }

        public final /* synthetic */ void mt(String str) {
            ((fh) ut.i9(this.n3)).n3(str);
        }

        public final /* synthetic */ void n(Exception exc) {
            ((fh) ut.i9(this.n3)).tl(exc);
        }

        public final /* synthetic */ void p(String str, long j, long j4) {
            ((fh) ut.i9(this.n3)).v(str, j, j4);
        }

        public final /* synthetic */ void r(di.v vVar) {
            ((fh) ut.i9(this.n3)).c5(vVar);
        }

        public void rz(final Exception exc) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.i4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.n(exc);
                    }
                });
            }
        }

        public void t(final String str) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.mt(str);
                    }
                });
            }
        }

        public void tl(final di.v vVar) {
            vVar.zn();
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.x4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.co(vVar);
                    }
                });
            }
        }

        public void w(final g gVar, @Nullable final di.c5 c5Var) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.x4(gVar, c5Var);
                    }
                });
            }
        }

        public void wz(final int i, final long j) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.co
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.z(i, j);
                    }
                });
            }
        }

        public final /* synthetic */ void x4(g gVar, di.c5 c5Var) {
            ((fh) ut.i9(this.n3)).n(gVar);
            ((fh) ut.i9(this.n3)).t(gVar, c5Var);
        }

        public void xc(final di.v vVar) {
            Handler handler = this.y;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w0.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.r(vVar);
                    }
                });
            }
        }

        public final /* synthetic */ void z(int i, long j) {
            ((fh) ut.i9(this.n3)).p(i, j);
        }
    }

    void c5(di.v vVar);

    void f3(long j, int i);

    void mt(Object obj, long j);

    @Deprecated
    void n(g gVar);

    void n3(String str);

    void onVideoSizeChanged(mg mgVar);

    void p(int i, long j);

    void t(g gVar, @Nullable di.c5 c5Var);

    void tl(Exception exc);

    void v(String str, long j, long j4);

    void x4(di.v vVar);
}
