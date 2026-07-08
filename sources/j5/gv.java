package j5;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class gv<F, S> {
    public final S n3;
    public final F y;

    public gv(F f3, S s3) {
        this.y = f3;
        this.n3 = s3;
    }

    @NonNull
    public static <A, B> gv<A, B> y(A a6, B b4) {
        return new gv<>(a6, b4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        return zn.y(gvVar.y, this.y) && zn.y(gvVar.n3, this.n3);
    }

    public int hashCode() {
        F f3 = this.y;
        int iHashCode = f3 == null ? 0 : f3.hashCode();
        S s3 = this.n3;
        return iHashCode ^ (s3 != null ? s3.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.y + " " + this.n3 + "}";
    }
}
