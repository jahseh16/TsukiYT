package d;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j5.s;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public final LocusId n3;
    public final String y;

    public zn(@NonNull String str) {
        this.y = (String) s.c5(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.n3 = y.y(str);
        } else {
            this.n3 = null;
        }
    }

    @NonNull
    public static zn gv(@NonNull LocusId locusId) {
        s.s(locusId, "locusId cannot be null");
        return new zn((String) s.c5(y.n3(locusId), "id cannot be empty"));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zn.class != obj.getClass()) {
            return false;
        }
        zn znVar = (zn) obj;
        String str = this.y;
        return str == null ? znVar.y == null : str.equals(znVar.y);
    }

    public int hashCode() {
        String str = this.y;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public final String n3() {
        return this.y.length() + "_chars";
    }

    @NonNull
    public String toString() {
        return "LocusIdCompat[" + n3() + "]";
    }

    @NonNull
    public String y() {
        return this.y;
    }

    @NonNull
    public LocusId zn() {
        return this.n3;
    }
}
