package ud;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import w.ct;
import w.eb;
import w.o4;
import w.rs;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public static final n3 f8391v = new n3(0, 0, 0, 0);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f8392gv;
    public final int n3;
    public final int y;
    public final int zn;

    public static class y {
        public static Insets y(int i, int i5, int i8, int i10) {
            return Insets.of(i, i5, i8, i10);
        }
    }

    public n3(int i, int i5, int i8, int i10) {
        this.y = i;
        this.n3 = i5;
        this.zn = i8;
        this.f8392gv = i10;
    }

    @NonNull
    public static n3 gv(@NonNull Insets insets) {
        return n3(ct.y(insets), rs.y(insets), o4.y(insets), eb.y(insets));
    }

    @NonNull
    public static n3 n3(int i, int i5, int i8, int i10) {
        return (i == 0 && i5 == 0 && i8 == 0 && i10 == 0) ? f8391v : new n3(i, i5, i8, i10);
    }

    @NonNull
    public static n3 y(@NonNull n3 n3Var, @NonNull n3 n3Var2) {
        return n3(Math.max(n3Var.y, n3Var2.y), Math.max(n3Var.n3, n3Var2.n3), Math.max(n3Var.zn, n3Var2.zn), Math.max(n3Var.f8392gv, n3Var2.f8392gv));
    }

    @NonNull
    public static n3 zn(@NonNull Rect rect) {
        return n3(rect.left, rect.top, rect.right, rect.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.f8392gv == n3Var.f8392gv && this.y == n3Var.y && this.zn == n3Var.zn && this.n3 == n3Var.n3;
    }

    public int hashCode() {
        return (((((this.y * 31) + this.n3) * 31) + this.zn) * 31) + this.f8392gv;
    }

    @NonNull
    public String toString() {
        return "Insets{left=" + this.y + ", top=" + this.n3 + ", right=" + this.zn + ", bottom=" + this.f8392gv + '}';
    }

    @NonNull
    public Insets v() {
        return y.y(this.y, this.n3, this.zn, this.f8392gv);
    }
}
