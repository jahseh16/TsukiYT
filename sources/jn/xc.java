package jn;

import b1.ta;
import ft.g;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class xc implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5872f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f5875i9;
    public ta n3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5877t;
    public final hx.s y;
    public long zn = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5870a = -1;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f5873fb = -9223372036854775807L;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f5874gv = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5878v = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5876s = -1;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f5871c5 = -1;

    public xc(hx.s sVar) {
        this.y = sVar;
    }

    private void v() {
        ta taVar = (ta) v0.y.v(this.n3);
        long j = this.f5873fb;
        boolean z = this.f5877t;
        taVar.a(j, z ? 1 : 0, this.f5870a, 0, null);
        this.f5870a = -1;
        this.f5873fb = -9223372036854775807L;
        this.f5875i9 = false;
    }

    public final boolean a(d dVar, int i) {
        int iEj = dVar.ej();
        if ((iEj & 8) == 8) {
            if (this.f5875i9 && this.f5870a > 0) {
                v();
            }
            this.f5875i9 = true;
        } else {
            if (!this.f5875i9) {
                r.c5("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int iN3 = hx.v.n3(this.f5878v);
            if (i < iN3) {
                r.c5("RtpVp9Reader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iN3), Integer.valueOf(i)));
                return false;
            }
        }
        if ((iEj & 128) != 0 && (dVar.ej() & 128) != 0 && dVar.y() < 1) {
            return false;
        }
        int i5 = iEj & 16;
        v0.y.n3(i5 == 0, "VP9 flexible mode is not supported.");
        if ((iEj & 32) != 0) {
            dVar.ut(1);
            if (dVar.y() < 1) {
                return false;
            }
            if (i5 == 0) {
                dVar.ut(1);
            }
        }
        if ((iEj & 2) != 0) {
            int iEj2 = dVar.ej();
            int i8 = (iEj2 >> 5) & 7;
            if ((iEj2 & 16) != 0) {
                int i10 = i8 + 1;
                if (dVar.y() < i10 * 4) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    this.f5876s = dVar.yt();
                    this.f5871c5 = dVar.yt();
                }
            }
            if ((iEj2 & 8) != 0) {
                int iEj3 = dVar.ej();
                if (dVar.y() < iEj3) {
                    return false;
                }
                for (int i12 = 0; i12 < iEj3; i12++) {
                    int iYt = (dVar.yt() & 12) >> 2;
                    if (dVar.y() < iYt) {
                        return false;
                    }
                    dVar.ut(iYt);
                }
            }
        }
        return true;
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        int i5;
        int i8;
        v0.y.c5(this.n3);
        if (a(dVar, i)) {
            if (this.f5870a == -1 && this.f5875i9) {
                this.f5877t = (dVar.i9() & 4) == 0;
            }
            if (!this.f5872f && (i5 = this.f5876s) != -1 && (i8 = this.f5871c5) != -1) {
                g gVar = this.y.zn;
                if (i5 != gVar.f4779d || i8 != gVar.f4780ej) {
                    this.n3.y(gVar.n3().s8(this.f5876s).o(this.f5871c5).z6());
                }
                this.f5872f = true;
            }
            int iY = dVar.y();
            this.n3.n3(dVar, iY);
            int i10 = this.f5870a;
            if (i10 == -1) {
                this.f5870a = iY;
            } else {
                this.f5870a = i10 + iY;
            }
            this.f5873fb = tl.y(this.f5874gv, j, this.zn, 90000);
            if (z) {
                v();
            }
            this.f5878v = i;
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
        this.f5870a = -1;
        this.f5874gv = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 2);
        this.n3 = taVarA;
        taVarA.y(this.y.zn);
    }
}
