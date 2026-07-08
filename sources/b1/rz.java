package b1;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class rz {
    public static final rz zn = new rz(0, 0);
    public final long n3;
    public final long y;

    public rz(long j, long j4) {
        this.y = j;
        this.n3 = j4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz.class != obj.getClass()) {
            return false;
        }
        rz rzVar = (rz) obj;
        return this.y == rzVar.y && this.n3 == rzVar.n3;
    }

    public int hashCode() {
        return (((int) this.y) * 31) + ((int) this.n3);
    }

    public String toString() {
        return "[timeUs=" + this.y + ", position=" + this.n3 + "]";
    }
}
