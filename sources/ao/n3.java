package ao;

import b1.fh;
import b1.rz;
import v0.ut;
import v0.x4;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements fb {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f1172gv;
    public final x4 n3;
    public final long y;
    public final x4 zn;

    public n3(long j, long j4, long j7) {
        this.f1172gv = j;
        this.y = j7;
        x4 x4Var = new x4();
        this.n3 = x4Var;
        x4 x4Var2 = new x4();
        this.zn = x4Var2;
        x4Var.y(0L);
        x4Var2.y(j4);
    }

    @Override // ao.fb
    public long a() {
        return this.y;
    }

    @Override // b1.fh
    public long c5() {
        return this.f1172gv;
    }

    public void gv(long j) {
        this.f1172gv = j;
    }

    @Override // ao.fb
    public long n3(long j) {
        return this.n3.n3(ut.fb(this.zn, j, true, true));
    }

    @Override // b1.fh
    public boolean s() {
        return true;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        int iFb = ut.fb(this.n3, j, true, true);
        rz rzVar = new rz(this.n3.n3(iFb), this.zn.n3(iFb));
        if (rzVar.y == j || iFb == this.n3.zn() - 1) {
            return new fh.y(rzVar);
        }
        int i = iFb + 1;
        return new fh.y(rzVar, new rz(this.n3.n3(i), this.zn.n3(i)));
    }

    public boolean y(long j) {
        x4 x4Var = this.n3;
        return j - x4Var.n3(x4Var.zn() - 1) < 100000;
    }

    public void zn(long j, long j4) {
        if (y(j)) {
            return;
        }
        this.n3.y(j);
        this.zn.y(j4);
    }
}
