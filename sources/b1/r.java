package b1;

import b1.fh;
import b1.x4;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class r implements fh {
    public final long n3;
    public final x4 y;

    public r(x4 x4Var, long j) {
        this.y = x4Var;
        this.n3 = j;
    }

    @Override // b1.fh
    public long c5() {
        return this.y.a();
    }

    @Override // b1.fh
    public boolean s() {
        return true;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        v0.y.c5(this.y.f1286f);
        x4 x4Var = this.y;
        x4.y yVar = x4Var.f1286f;
        long[] jArr = yVar.y;
        long[] jArr2 = yVar.n3;
        int iC5 = ut.c5(jArr, x4Var.c5(j), true, false);
        rz rzVarY = y(iC5 == -1 ? 0L : jArr[iC5], iC5 != -1 ? jArr2[iC5] : 0L);
        if (rzVarY.y == j || iC5 == jArr.length - 1) {
            return new fh.y(rzVarY);
        }
        int i = iC5 + 1;
        return new fh.y(rzVarY, y(jArr[i], jArr2[i]));
    }

    public final rz y(long j, long j4) {
        return new rz((j * 1000000) / ((long) this.y.f1292v), this.n3 + j4);
    }
}
