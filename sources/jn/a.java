package jn;

import b1.ta;
import ft.q;
import v0.c;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f5816c5;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public ta f5818gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5819s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5820v;
    public final hx.s zn;
    public final d n3 = new d(c.y);
    public final d y = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5815a = -9223372036854775807L;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f5817fb = -1;

    public a(hx.s sVar) {
        this.zn = sVar;
    }

    public static int v(int i) {
        return i == 5 ? 1 : 0;
    }

    public final void a(d dVar, int i) {
        byte b4 = dVar.v()[0];
        byte b6 = dVar.v()[1];
        int i5 = (b4 & 224) | (b6 & 31);
        boolean z = (b6 & 128) > 0;
        boolean z5 = (b6 & 64) > 0;
        if (z) {
            this.f5819s += c5();
            dVar.v()[1] = (byte) i5;
            this.y.qn(dVar.v());
            this.y.oz(1);
        } else {
            int iN3 = hx.v.n3(this.f5817fb);
            if (i != iN3) {
                r.c5("RtpH264Reader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iN3), Integer.valueOf(i)));
                return;
            } else {
                this.y.qn(dVar.v());
                this.y.oz(2);
            }
        }
        int iY = this.y.y();
        this.f5818gv.n3(this.y, iY);
        this.f5819s += iY;
        if (z5) {
            this.f5820v = v(i5 & 31);
        }
    }

    public final int c5() {
        this.n3.oz(0);
        int iY = this.n3.y();
        ((ta) v0.y.v(this.f5818gv)).n3(this.n3, iY);
        return iY;
    }

    public final void fb(d dVar) {
        int iY = dVar.y();
        this.f5819s += c5();
        this.f5818gv.n3(dVar, iY);
        this.f5819s += iY;
        this.f5820v = v(dVar.v()[0] & 31);
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) throws q {
        try {
            int i5 = dVar.v()[0] & 31;
            v0.y.c5(this.f5818gv);
            if (i5 > 0 && i5 < 24) {
                fb(dVar);
            } else if (i5 == 24) {
                s(dVar);
            } else {
                if (i5 != 28) {
                    throw q.gv(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i5)), null);
                }
                a(dVar, i);
            }
            if (z) {
                if (this.f5815a == -9223372036854775807L) {
                    this.f5815a = j;
                }
                this.f5818gv.a(tl.y(this.f5816c5, j, this.f5815a, 90000), this.f5820v, this.f5819s, 0, null);
                this.f5819s = 0;
            }
            this.f5817fb = i;
        } catch (IndexOutOfBoundsException e4) {
            throw q.gv(null, e4);
        }
    }

    public final void s(d dVar) {
        dVar.ej();
        while (dVar.y() > 4) {
            int iYt = dVar.yt();
            this.f5819s += c5();
            this.f5818gv.n3(dVar, iYt);
            this.f5819s += iYt;
        }
        this.f5820v = 0;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.f5815a = j;
        this.f5819s = 0;
        this.f5816c5 = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 2);
        this.f5818gv = taVarA;
        ((ta) ut.i9(taVarA)).y(this.zn.zn);
    }

    @Override // jn.f
    public void n3(long j, int i) {
    }
}
