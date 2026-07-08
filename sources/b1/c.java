package b1;

import b1.fh;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class c implements fh {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f1247gv;
    public final long[] n3;
    public final long[] y;
    public final long zn;

    public c(long[] jArr, long[] jArr2, long j) {
        v0.y.y(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f1247gv = z;
        if (!z || jArr2[0] <= 0) {
            this.y = jArr;
            this.n3 = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.y = jArr3;
            long[] jArr4 = new long[i];
            this.n3 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.zn = j;
    }

    @Override // b1.fh
    public long c5() {
        return this.zn;
    }

    @Override // b1.fh
    public boolean s() {
        return this.f1247gv;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        if (!this.f1247gv) {
            return new fh.y(rz.zn);
        }
        int iC5 = ut.c5(this.n3, j, true, true);
        rz rzVar = new rz(this.n3[iC5], this.y[iC5]);
        if (rzVar.y == j || iC5 == this.n3.length - 1) {
            return new fh.y(rzVar);
        }
        int i = iC5 + 1;
        return new fh.y(rzVar, new rz(this.n3[i], this.y[i]));
    }
}
