package di;

import androidx.annotation.Nullable;
import ft.g;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f3171gv;
    public final g n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f3172v;
    public final String y;
    public final g zn;

    public c5(String str, g gVar, g gVar2, int i, int i5) {
        v0.y.y(i == 0 || i5 == 0);
        this.y = v0.y.gv(str);
        this.n3 = (g) v0.y.v(gVar);
        this.zn = (g) v0.y.v(gVar2);
        this.f3171gv = i;
        this.f3172v = i5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c5.class != obj.getClass()) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return this.f3171gv == c5Var.f3171gv && this.f3172v == c5Var.f3172v && this.y.equals(c5Var.y) && this.n3.equals(c5Var.n3) && this.zn.equals(c5Var.zn);
    }

    public int hashCode() {
        return ((((((((527 + this.f3171gv) * 31) + this.f3172v) * 31) + this.y.hashCode()) * 31) + this.n3.hashCode()) * 31) + this.zn.hashCode();
    }
}
