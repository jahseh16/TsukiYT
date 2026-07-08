package jn;

import b1.ta;
import ft.q;
import v0.c;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements f {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f5826c5;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public ta f5828gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5829s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5830v;
    public final hx.s zn;
    public final d y = new d();
    public final d n3 = new d(c.y);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5825a = -9223372036854775807L;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f5827fb = -1;

    public fb(hx.s sVar) {
        this.zn = sVar;
    }

    private void a(d dVar, int i) throws q {
        if (dVar.v().length < 3) {
            throw q.gv("Malformed FU header.", null);
        }
        int i5 = dVar.v()[1] & 7;
        byte b4 = dVar.v()[2];
        int i8 = b4 & 63;
        boolean z = (b4 & 128) > 0;
        boolean z5 = (b4 & 64) > 0;
        if (z) {
            this.f5829s += s();
            dVar.v()[1] = (byte) ((i8 << 1) & 127);
            dVar.v()[2] = (byte) i5;
            this.y.qn(dVar.v());
            this.y.oz(1);
        } else {
            int i10 = (this.f5827fb + 1) % 65535;
            if (i != i10) {
                r.c5("RtpH265Reader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i10), Integer.valueOf(i)));
                return;
            } else {
                this.y.qn(dVar.v());
                this.y.oz(3);
            }
        }
        int iY = this.y.y();
        this.f5828gv.n3(this.y, iY);
        this.f5829s += iY;
        if (z5) {
            this.f5830v = v(i8);
        }
    }

    private void fb(d dVar) {
        int iY = dVar.y();
        this.f5829s += s();
        this.f5828gv.n3(dVar, iY);
        this.f5829s += iY;
        this.f5830v = v((dVar.v()[0] >> 1) & 63);
    }

    private int s() {
        this.n3.oz(0);
        int iY = this.n3.y();
        ((ta) v0.y.v(this.f5828gv)).n3(this.n3, iY);
        return iY;
    }

    private static int v(int i) {
        return (i == 19 || i == 20) ? 1 : 0;
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) throws q {
        if (dVar.v().length == 0) {
            throw q.gv("Empty RTP data packet.", null);
        }
        int i5 = (dVar.v()[0] >> 1) & 63;
        v0.y.c5(this.f5828gv);
        if (i5 >= 0 && i5 < 48) {
            fb(dVar);
        } else {
            if (i5 == 48) {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (i5 != 49) {
                throw q.gv(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i5)), null);
            }
            a(dVar, i);
        }
        if (z) {
            if (this.f5825a == -9223372036854775807L) {
                this.f5825a = j;
            }
            this.f5828gv.a(tl.y(this.f5826c5, j, this.f5825a, 90000), this.f5830v, this.f5829s, 0, null);
            this.f5829s = 0;
        }
        this.f5827fb = i;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.f5825a = j;
        this.f5829s = 0;
        this.f5826c5 = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 2);
        this.f5828gv = taVarA;
        taVarA.y(this.zn.zn);
    }

    @Override // jn.f
    public void n3(long j, int i) {
    }
}
