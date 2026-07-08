package b0;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xc extends di.s implements c5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1241f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public c5 f1242s;

    @Override // di.y
    public void a() {
        super.a();
        this.f1242s = null;
    }

    @Override // b0.c5
    public int gv() {
        return ((c5) v0.y.v(this.f1242s)).gv();
    }

    public void mt(long j, c5 c5Var, long j4) {
        this.f3195v = j;
        this.f1242s = c5Var;
        if (j4 != Long.MAX_VALUE) {
            j = j4;
        }
        this.f1241f = j;
    }

    @Override // b0.c5
    public List<n3> n3(long j) {
        return ((c5) v0.y.v(this.f1242s)).n3(j - this.f1241f);
    }

    @Override // b0.c5
    public int y(long j) {
        return ((c5) v0.y.v(this.f1242s)).y(j - this.f1241f);
    }

    @Override // b0.c5
    public long zn(int i) {
        return ((c5) v0.y.v(this.f1242s)).zn(i) + this.f1241f;
    }
}
