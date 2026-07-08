package jn;

import b1.ta;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5821a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f5822fb;
    public ta n3;
    public final hx.s y;
    public int zn;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f5823gv = -9223372036854775807L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5824v = -1;

    public c5(hx.s sVar) {
        this.y = sVar;
    }

    public static int v(d dVar) {
        int iY = n4.n3.y(dVar.v(), new byte[]{0, 0, 1, -74});
        if (iY == -1) {
            return 0;
        }
        dVar.oz(iY + 4);
        return (dVar.i9() >> 6) == 0 ? 1 : 0;
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        int iN3;
        v0.y.c5(this.n3);
        int i5 = this.f5824v;
        if (i5 != -1 && i != (iN3 = hx.v.n3(i5))) {
            r.c5("RtpMpeg4Reader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iN3), Integer.valueOf(i)));
        }
        int iY = dVar.y();
        this.n3.n3(dVar, iY);
        if (this.f5822fb == 0) {
            this.zn = v(dVar);
        }
        this.f5822fb += iY;
        if (z) {
            if (this.f5823gv == -9223372036854775807L) {
                this.f5823gv = j;
            }
            this.n3.a(tl.y(this.f5821a, j, this.f5823gv, 90000), this.zn, this.f5822fb, 0, null);
            this.f5822fb = 0;
        }
        this.f5824v = i;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.f5823gv = j;
        this.f5821a = j4;
        this.f5822fb = 0;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 2);
        this.n3 = taVarA;
        ((ta) ut.i9(taVarA)).y(this.y.zn);
    }

    @Override // jn.f
    public void n3(long j, int i) {
    }
}
