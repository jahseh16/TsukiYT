package i0;

import b0.c5;
import java.util.Collections;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements c5 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long[] f5431v;
    public final b0.n3[] y;

    public n3(b0.n3[] n3VarArr, long[] jArr) {
        this.y = n3VarArr;
        this.f5431v = jArr;
    }

    @Override // b0.c5
    public int gv() {
        return this.f5431v.length;
    }

    @Override // b0.c5
    public List<b0.n3> n3(long j) {
        b0.n3 n3Var;
        int iC5 = ut.c5(this.f5431v, j, true, false);
        return (iC5 == -1 || (n3Var = this.y[iC5]) == b0.n3.f1194ej) ? Collections.emptyList() : Collections.singletonList(n3Var);
    }

    @Override // b0.c5
    public int y(long j) {
        int iV = ut.v(this.f5431v, j, false, false);
        if (iV < this.f5431v.length) {
            return iV;
        }
        return -1;
    }

    @Override // b0.c5
    public long zn(int i) {
        v0.y.y(i >= 0);
        v0.y.y(i < this.f5431v.length);
        return this.f5431v[i];
    }
}
