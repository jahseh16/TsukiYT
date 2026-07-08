package pv;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f7392gv;
    public final String n3;
    public final String y;
    public final int zn;

    public n3(String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.zn == n3Var.zn && this.f7392gv == n3Var.f7392gv && g4.f.y(this.y, n3Var.y) && g4.f.y(this.n3, n3Var.n3);
    }

    public int hashCode() {
        return g4.f.n3(this.y, this.n3, Integer.valueOf(this.zn), Integer.valueOf(this.f7392gv));
    }

    public n3(String str, String str2, int i, int i5) {
        this.y = str;
        this.n3 = str2;
        this.zn = i;
        this.f7392gv = i5;
    }
}
