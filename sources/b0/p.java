package b0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import ft.g;
import ft.k3;
import ft.u0;
import k4.r;
import v0.n;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ft.a implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1222b;

    @Nullable
    public final Handler c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f1223d;
    public final w d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f1224ej;
    public long f7;
    public final t fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public int f1225hw;

    @Nullable
    public xc j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @Nullable
    public g f1226j5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1227k;

    @Nullable
    public wz o;

    @Nullable
    public xc oz;
    public long q9;

    @Nullable
    public i9 qn;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public int f1228ut;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1229x;

    public p(w wVar, @Nullable Looper looper) {
        this(wVar, looper, t.y);
    }

    private long o(long j) {
        v0.y.fb(j != -9223372036854775807L);
        v0.y.fb(this.f1227k != -9223372036854775807L);
        return j - this.f1227k;
    }

    @Override // ft.hk
    public boolean a() {
        return this.f1229x;
    }

    @Override // ft.a
    public void b(g[] gVarArr, long j, long j4) {
        this.f1227k = j4;
        this.f1226j5 = gVarArr[0];
        if (this.qn != null) {
            this.f1225hw = 1;
        } else {
            oz();
        }
    }

    @Override // ft.hk
    public void co(long j, long j4) throws di.a {
        boolean z;
        this.f7 = j;
        if (wz()) {
            long j7 = this.q9;
            if (j7 != -9223372036854775807L && j >= j7) {
                q9();
                this.f1229x = true;
            }
        }
        if (this.f1229x) {
            return;
        }
        if (this.oz == null) {
            ((i9) v0.y.v(this.qn)).y(j);
            try {
                this.oz = ((i9) v0.y.v(this.qn)).n3();
            } catch (f e4) {
                j(e4);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.j != null) {
            long jQn = qn();
            z = false;
            while (jQn <= j) {
                this.f1228ut++;
                jQn = qn();
                z = true;
            }
        } else {
            z = false;
        }
        xc xcVar = this.oz;
        if (xcVar != null) {
            if (xcVar.t()) {
                if (!z && qn() == Long.MAX_VALUE) {
                    if (this.f1225hw == 2) {
                        f7();
                    } else {
                        q9();
                        this.f1229x = true;
                    }
                }
            } else if (xcVar.f3195v <= j) {
                xc xcVar2 = this.j;
                if (xcVar2 != null) {
                    xcVar2.p();
                }
                this.f1228ut = xcVar.y(j);
                this.j = xcVar;
                this.oz = null;
                z = true;
            }
        }
        if (z) {
            v0.y.v(this.j);
            jz(new a(this.j.n3(j), o(j5(j))));
        }
        if (this.f1225hw == 2) {
            return;
        }
        while (!this.f1224ej) {
            try {
                wz wzVarGv = this.o;
                if (wzVarGv == null) {
                    wzVarGv = ((i9) v0.y.v(this.qn)).gv();
                    if (wzVarGv == null) {
                        return;
                    } else {
                        this.o = wzVarGv;
                    }
                }
                if (this.f1225hw == 1) {
                    wzVarGv.w(4);
                    ((i9) v0.y.v(this.qn)).zn(wzVarGv);
                    this.o = null;
                    this.f1225hw = 2;
                    return;
                }
                int iK5 = k5(this.f1223d, wzVarGv, 0);
                if (iK5 == -4) {
                    if (wzVarGv.t()) {
                        this.f1224ej = true;
                        this.f1222b = false;
                    } else {
                        g gVar = this.f1223d.n3;
                        if (gVar == null) {
                            return;
                        }
                        wzVarGv.f1240co = gVar.fh;
                        wzVarGv.co();
                        this.f1222b &= !wzVarGv.wz();
                    }
                    if (!this.f1222b) {
                        ((i9) v0.y.v(this.qn)).zn(wzVarGv);
                        this.o = null;
                    }
                } else if (iK5 == -3) {
                    return;
                }
            } catch (f e5) {
                j(e5);
                return;
            }
        }
    }

    @Override // ft.a
    public void d() {
        this.f1226j5 = null;
        this.q9 = -9223372036854775807L;
        hw();
        this.f1227k = -9223372036854775807L;
        this.f7 = -9223372036854775807L;
        k();
    }

    @Override // ft.a
    public void ej(long j, boolean z) {
        this.f7 = j;
        hw();
        this.f1224ej = false;
        this.f1229x = false;
        this.q9 = -9223372036854775807L;
        if (this.f1225hw != 0) {
            f7();
        } else {
            q9();
            ((i9) v0.y.v(this.qn)).flush();
        }
    }

    public void en(long j) {
        v0.y.fb(wz());
        this.q9 = j;
    }

    public final void f7() {
        k();
        oz();
    }

    @Override // ft.hk, ft.ic
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        ut((a) message.obj);
        return true;
    }

    public final void hw() {
        jz(new a(r.yt(), o(this.f7)));
    }

    @Override // ft.hk
    public boolean isReady() {
        return true;
    }

    public final void j(f fVar) {
        v0.r.gv("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f1226j5, fVar);
        hw();
        f7();
    }

    public final long j5(long j) {
        int iY = this.j.y(j);
        if (iY == 0 || this.j.gv() == 0) {
            return this.j.f3195v;
        }
        if (iY != -1) {
            return this.j.zn(iY - 1);
        }
        return this.j.zn(r2.gv() - 1);
    }

    public final void jz(a aVar) {
        Handler handler = this.c;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            ut(aVar);
        }
    }

    public final void k() {
        q9();
        ((i9) v0.y.v(this.qn)).release();
        this.qn = null;
        this.f1225hw = 0;
    }

    @Override // ft.ic
    public int n3(g gVar) {
        if (this.fh.n3(gVar)) {
            return k3.y(gVar.u == 0 ? 4 : 2);
        }
        return n.mt(gVar.f3) ? k3.y(1) : k3.y(0);
    }

    public final void oz() {
        this.f1222b = true;
        this.qn = this.fh.zn((g) v0.y.v(this.f1226j5));
    }

    public final void q9() {
        this.o = null;
        this.f1228ut = -1;
        xc xcVar = this.j;
        if (xcVar != null) {
            xcVar.p();
            this.j = null;
        }
        xc xcVar2 = this.oz;
        if (xcVar2 != null) {
            xcVar2.p();
            this.oz = null;
        }
    }

    public final long qn() {
        if (this.f1228ut == -1) {
            return Long.MAX_VALUE;
        }
        v0.y.v(this.j);
        if (this.f1228ut >= this.j.gv()) {
            return Long.MAX_VALUE;
        }
        return this.j.zn(this.f1228ut);
    }

    public final void ut(a aVar) {
        this.d0.onCues(aVar.y);
        this.d0.onCues(aVar);
    }

    public p(w wVar, @Nullable Looper looper, t tVar) {
        super(3);
        this.d0 = (w) v0.y.v(wVar);
        this.c = looper == null ? null : ut.x4(looper, this);
        this.fh = tVar;
        this.f1223d = new u0();
        this.q9 = -9223372036854775807L;
        this.f1227k = -9223372036854775807L;
        this.f7 = -9223372036854775807L;
    }
}
