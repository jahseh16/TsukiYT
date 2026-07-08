package pv;

import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final String f7388gv;

    @Nullable
    public final String n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f7389v;

    @Nullable
    public final String y;

    @Nullable
    public final String zn;

    public f(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.y = str;
        this.n3 = str2;
        this.zn = str3;
        this.f7388gv = str4;
        this.f7389v = str5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ut.zn(this.y, fVar.y) && ut.zn(this.n3, fVar.n3) && ut.zn(this.zn, fVar.zn) && ut.zn(this.f7388gv, fVar.f7388gv) && ut.zn(this.f7389v, fVar.f7389v);
    }

    public int hashCode() {
        String str = this.y;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n3;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zn;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f7388gv;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7389v;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
