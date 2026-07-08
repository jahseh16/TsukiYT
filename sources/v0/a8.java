package v0;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a8 {
    public final int n3;
    public final int y;
    public static final a8 zn = new a8(-1, -1);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final a8 f8711gv = new a8(0, 0);

    public a8(int i, int i5) {
        y.y((i == -1 || i >= 0) && (i5 == -1 || i5 >= 0));
        this.y = i;
        this.n3 = i5;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        return this.y == a8Var.y && this.n3 == a8Var.n3;
    }

    public int hashCode() {
        int i = this.n3;
        int i5 = this.y;
        return i ^ ((i5 >>> 16) | (i5 << 16));
    }

    public int n3() {
        return this.y;
    }

    public String toString() {
        return this.y + "x" + this.n3;
    }

    public int y() {
        return this.n3;
    }
}
