package jn;

import b1.ta;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements f {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public ta f5835gv;
    public final boolean n3;
    public final hx.s y;
    public final int zn;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f5832s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final int[] f5831c5 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5836v = -9223372036854775807L;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f5834fb = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5833a = 0;

    public gv(hx.s sVar) {
        this.y = sVar;
        this.n3 = "audio/amr-wb".equals(v0.y.v(sVar.zn.f3));
        this.zn = sVar.n3;
    }

    public static int v(int i, boolean z) {
        boolean z5 = (i >= 0 && i <= 8) || i == 15;
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(z ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        v0.y.n3(z5, sb.toString());
        return z ? f5831c5[i] : f5832s[i];
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        int iN3;
        v0.y.c5(this.f5835gv);
        int i5 = this.f5834fb;
        if (i5 != -1 && i != (iN3 = hx.v.n3(i5))) {
            r.c5("RtpAmrReader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iN3), Integer.valueOf(i)));
        }
        dVar.ut(1);
        int iV = v((dVar.i9() >> 3) & 15, this.n3);
        int iY = dVar.y();
        v0.y.n3(iY == iV, "compound payload not supported currently");
        this.f5835gv.n3(dVar, iY);
        this.f5835gv.a(tl.y(this.f5833a, j, this.f5836v, this.zn), 1, iY, 0, null);
        this.f5834fb = i;
    }

    @Override // jn.f
    public void n3(long j, int i) {
        this.f5836v = j;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.f5836v = j;
        this.f5833a = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 1);
        this.f5835gv = taVarA;
        taVarA.y(this.y.zn);
    }
}
