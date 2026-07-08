package sd;

import ft.g;
import ft.u0;
import java.io.IOException;
import ur.en;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class xc implements en {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pv.s f7803f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long[] f7804fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7807t;
    public int w;
    public final g y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final qg.n3 f7808v = new qg.n3();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7805p = -9223372036854775807L;

    public xc(pv.s sVar, g gVar, boolean z) {
        this.y = gVar;
        this.f7803f = sVar;
        this.f7804fb = sVar.n3;
        gv(sVar, z);
    }

    @Override // ur.en
    public int a(u0 u0Var, di.fb fbVar, int i) {
        int i5 = this.w;
        boolean z = i5 == this.f7804fb.length;
        if (z && !this.f7806s) {
            fbVar.w(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f7807t) {
            u0Var.n3 = this.y;
            this.f7807t = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.w = i5 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrY = this.f7808v.y(this.f7803f.y[i5]);
            fbVar.mt(bArrY.length);
            fbVar.f3179fb.put(bArrY);
        }
        fbVar.f3178f = this.f7804fb[i5];
        fbVar.w(1);
        return -4;
    }

    public void gv(pv.s sVar, boolean z) {
        int i = this.w;
        long j = i == 0 ? -9223372036854775807L : this.f7804fb[i - 1];
        this.f7806s = z;
        this.f7803f = sVar;
        long[] jArr = sVar.n3;
        this.f7804fb = jArr;
        long j4 = this.f7805p;
        if (j4 != -9223372036854775807L) {
            zn(j4);
        } else if (j != -9223372036854775807L) {
            this.w = ut.v(jArr, j, false, false);
        }
    }

    @Override // ur.en
    public boolean isReady() {
        return true;
    }

    @Override // ur.en
    public int w(long j) {
        int iMax = Math.max(this.w, ut.v(this.f7804fb, j, true, false));
        int i = iMax - this.w;
        this.w = iMax;
        return i;
    }

    public String y() {
        return this.f7803f.y();
    }

    public void zn(long j) {
        int iV = ut.v(this.f7804fb, j, true, false);
        this.w = iV;
        if (!this.f7806s || iV != this.f7804fb.length) {
            j = -9223372036854775807L;
        }
        this.f7805p = j;
    }

    @Override // ur.en
    public void n3() throws IOException {
    }
}
