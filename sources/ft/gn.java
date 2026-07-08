package ft;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class gn {
    public static final gn n3 = new gn(false);
    public final boolean y;

    public gn(boolean z) {
        this.y = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gn.class == obj.getClass() && this.y == ((gn) obj).y;
    }

    public int hashCode() {
        return !this.y ? 1 : 0;
    }
}
