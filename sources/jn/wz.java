package jn;

import b1.ta;
import ft.g;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements f {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f5864c5;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f5867i9;
    public ta n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5868s;
    public final hx.s y;
    public long zn = -9223372036854775807L;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f5866gv = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5869v = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5863a = -9223372036854775807L;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f5865fb = 0;

    public wz(hx.s sVar) {
        this.y = sVar;
    }

    private void v() {
        ta taVar = (ta) v0.y.v(this.n3);
        long j = this.f5863a;
        boolean z = this.f5864c5;
        taVar.a(j, z ? 1 : 0, this.f5869v, 0, null);
        this.f5869v = -1;
        this.f5863a = -9223372036854775807L;
        this.f5868s = false;
    }

    public final boolean a(d dVar, int i) {
        int iEj = dVar.ej();
        if ((iEj & 16) == 16 && (iEj & 7) == 0) {
            if (this.f5868s && this.f5869v > 0) {
                v();
            }
            this.f5868s = true;
        } else {
            if (!this.f5868s) {
                r.c5("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int iN3 = hx.v.n3(this.f5866gv);
            if (i < iN3) {
                r.c5("RtpVP8Reader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iN3), Integer.valueOf(i)));
                return false;
            }
        }
        if ((iEj & 128) != 0) {
            int iEj2 = dVar.ej();
            if ((iEj2 & 128) != 0 && (dVar.ej() & 128) != 0) {
                dVar.ut(1);
            }
            if ((iEj2 & 64) != 0) {
                dVar.ut(1);
            }
            if ((iEj2 & 32) != 0 || (iEj2 & 16) != 0) {
                dVar.ut(1);
            }
        }
        return true;
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        v0.y.c5(this.n3);
        if (a(dVar, i)) {
            if (this.f5869v == -1 && this.f5868s) {
                this.f5864c5 = (dVar.i9() & 1) == 0;
            }
            if (!this.f5867i9) {
                int iA = dVar.a();
                dVar.oz(iA + 6);
                int iC = dVar.c() & 16383;
                int iC2 = dVar.c() & 16383;
                dVar.oz(iA);
                g gVar = this.y.zn;
                if (iC != gVar.f4779d || iC2 != gVar.f4780ej) {
                    this.n3.y(gVar.n3().s8(iC).o(iC2).z6());
                }
                this.f5867i9 = true;
            }
            int iY = dVar.y();
            this.n3.n3(dVar, iY);
            int i5 = this.f5869v;
            if (i5 == -1) {
                this.f5869v = iY;
            } else {
                this.f5869v = i5 + iY;
            }
            this.f5863a = tl.y(this.f5865fb, j, this.zn, 90000);
            if (z) {
                v();
            }
            this.f5866gv = i;
        }
    }

    @Override // jn.f
    public void n3(long j, int i) {
        v0.y.fb(this.zn == -9223372036854775807L);
        this.zn = j;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.zn = j;
        this.f5869v = -1;
        this.f5865fb = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 2);
        this.n3 = taVarA;
        taVarA.y(this.y.zn);
    }
}
