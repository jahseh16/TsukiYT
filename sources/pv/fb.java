package pv;

import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    @Nullable
    public final String n3;
    public final String y;

    @Nullable
    public final String zn;

    public fb(String str, @Nullable String str2, @Nullable String str3) {
        this.y = str;
        this.n3 = str2;
        this.zn = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fb.class != obj.getClass()) {
            return false;
        }
        fb fbVar = (fb) obj;
        return ut.zn(this.y, fbVar.y) && ut.zn(this.n3, fbVar.n3) && ut.zn(this.zn, fbVar.zn);
    }

    public int hashCode() {
        int iHashCode = this.y.hashCode() * 31;
        String str = this.n3;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zn;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
