package mn;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final float n3;
    public final int y;

    public c(int i, float f3) {
        this.y = i;
        this.n3 = f3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.y == cVar.y && Float.compare(cVar.n3, this.n3) == 0;
    }

    public int hashCode() {
        return ((527 + this.y) * 31) + Float.floatToIntBits(this.n3);
    }
}
