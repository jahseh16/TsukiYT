package jn;

import android.util.Log;
import b1.ta;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class t implements f {
    public ta n3;
    public final hx.s y;
    public long zn = -9223372036854775807L;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f5852gv = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5853v = -1;

    public t(hx.s sVar) {
        this.y = sVar;
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        int iN3;
        v0.y.v(this.n3);
        int i5 = this.f5853v;
        if (i5 != -1 && i != (iN3 = hx.v.n3(i5))) {
            Log.w("RtpPcmReader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iN3), Integer.valueOf(i)));
        }
        long jY = tl.y(this.f5852gv, j, this.zn, this.y.n3);
        int iY = dVar.y();
        this.n3.n3(dVar, iY);
        this.n3.a(jY, 1, iY, 0, null);
        this.f5853v = i;
    }

    @Override // jn.f
    public void n3(long j, int i) {
        this.zn = j;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.zn = j;
        this.f5852gv = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 1);
        this.n3 = taVarA;
        taVarA.y(this.y.zn);
    }
}
