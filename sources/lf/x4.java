package lf;

import ft.g;
import lf.ud;
import v0.hw;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements fh {
    public hw n3;
    public g y;
    public b1.ta zn;

    public x4(String str) {
        this.y = new g.n3().o4(str).z6();
    }

    @Override // lf.fh
    public void n3(hw hwVar, b1.wz wzVar, ud.gv gvVar) {
        this.n3 = hwVar;
        gvVar.y();
        b1.ta taVarA = wzVar.a(gvVar.zn(), 5);
        this.zn = taVarA;
        taVarA.y(this.y);
    }

    @Override // lf.fh
    public void y(v0.d dVar) {
        zn();
        long jGv = this.n3.gv();
        long jV = this.n3.v();
        if (jGv == -9223372036854775807L || jV == -9223372036854775807L) {
            return;
        }
        g gVar = this.y;
        if (jV != gVar.fh) {
            g gVarZ6 = gVar.n3().nf(jV).z6();
            this.y = gVarZ6;
            this.zn.y(gVarZ6);
        }
        int iY = dVar.y();
        this.zn.n3(dVar, iY);
        this.zn.a(jGv, 1, iY, 0, null);
    }

    public final void zn() {
        v0.y.c5(this.n3);
        ut.i9(this.zn);
    }
}
