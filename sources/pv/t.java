package pv;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import v0.qn;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f7396gv;
    public final long n3;
    public final long y;
    public final String zn;

    public t(@Nullable String str, long j, long j4) {
        this.zn = str == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : str;
        this.y = j;
        this.n3 = j4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.y == tVar.y && this.n3 == tVar.n3 && this.zn.equals(tVar.zn);
    }

    public int hashCode() {
        if (this.f7396gv == 0) {
            this.f7396gv = ((((527 + ((int) this.y)) * 31) + ((int) this.n3)) * 31) + this.zn.hashCode();
        }
        return this.f7396gv;
    }

    public Uri n3(String str) {
        return qn.v(str, this.zn);
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.zn + ", start=" + this.y + ", length=" + this.n3 + ")";
    }

    @Nullable
    public t y(@Nullable t tVar, String str) {
        String strZn = zn(str);
        if (tVar != null && strZn.equals(tVar.zn(str))) {
            long j = this.n3;
            if (j != -1) {
                long j4 = this.y;
                if (j4 + j == tVar.y) {
                    long j7 = tVar.n3;
                    return new t(strZn, j4, j7 != -1 ? j + j7 : -1L);
                }
            }
            long j8 = tVar.n3;
            if (j8 != -1) {
                long j9 = tVar.y;
                if (j9 + j8 == this.y) {
                    return new t(strZn, j9, j != -1 ? j8 + j : -1L);
                }
            }
        }
        return null;
    }

    public String zn(String str) {
        return qn.gv(str, this.zn);
    }
}
