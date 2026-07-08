package jn;

import mn.n3;
import v0.d;
import v0.ta;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5879a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f5880fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f5881gv;
    public final ta n3 = new ta();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5882v = -9223372036854775807L;
    public final hx.s y;
    public b1.ta zn;

    public zn(hx.s sVar) {
        this.y = sVar;
    }

    public final void a() {
        ((b1.ta) ut.i9(this.zn)).a(this.f5879a, 1, this.f5881gv, 0, null);
        this.f5881gv = 0;
    }

    public final void c5(d dVar, long j) {
        int iY = dVar.y();
        ((b1.ta) v0.y.v(this.zn)).n3(dVar, iY);
        ((b1.ta) ut.i9(this.zn)).a(j, 1, iY, 0, null);
    }

    public final void fb(d dVar, boolean z, int i, long j) {
        int iY = dVar.y();
        ((b1.ta) v0.y.v(this.zn)).n3(dVar, iY);
        this.f5881gv += iY;
        this.f5879a = j;
        if (z && i == 3) {
            a();
        }
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        int iEj = dVar.ej() & 3;
        int iEj2 = dVar.ej() & 255;
        long jY = tl.y(this.f5880fb, j, this.f5882v, this.y.n3);
        if (iEj == 0) {
            v();
            if (iEj2 == 1) {
                c5(dVar, jY);
                return;
            } else {
                s(dVar, iEj2, jY);
                return;
            }
        }
        if (iEj == 1 || iEj == 2) {
            v();
        } else if (iEj != 3) {
            throw new IllegalArgumentException(String.valueOf(iEj));
        }
        fb(dVar, z, iEj, jY);
    }

    @Override // jn.f
    public void n3(long j, int i) {
        v0.y.fb(this.f5882v == -9223372036854775807L);
        this.f5882v = j;
    }

    public final void s(d dVar, int i, long j) {
        this.n3.wz(dVar.v());
        this.n3.co(2);
        for (int i5 = 0; i5 < i; i5++) {
            n3.C0131n3 c0131n3A = mn.n3.a(this.n3);
            ((b1.ta) v0.y.v(this.zn)).n3(dVar, c0131n3A.f6646v);
            ((b1.ta) ut.i9(this.zn)).a(j, 1, c0131n3A.f6646v, 0, null);
            j += ((long) (c0131n3A.f6643a / c0131n3A.zn)) * 1000000;
            this.n3.co(c0131n3A.f6646v);
        }
    }

    public final void v() {
        if (this.f5881gv > 0) {
            a();
        }
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.f5882v = j;
        this.f5880fb = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        b1.ta taVarA = wzVar.a(i, 1);
        this.zn = taVarA;
        taVarA.y(this.y.zn);
    }
}
