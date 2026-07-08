package u0;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public androidx.navigation.t n3;
    public final int y;
    public Bundle zn;

    public gv(int i, androidx.navigation.t tVar, Bundle bundle) {
        this.y = i;
        this.n3 = tVar;
        this.zn = bundle;
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        if (this.y == gvVar.y && Intrinsics.areEqual(this.n3, gvVar.n3)) {
            if (Intrinsics.areEqual(this.zn, gvVar.zn)) {
                return true;
            }
            Bundle bundle = this.zn;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    Bundle bundle2 = this.zn;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = gvVar.zn;
                    if (!Intrinsics.areEqual(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void gv(Bundle bundle) {
        this.zn = bundle;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.y * 31;
        androidx.navigation.t tVar = this.n3;
        int iHashCode = i + (tVar != null ? tVar.hashCode() : 0);
        Bundle bundle = this.zn;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i5 = iHashCode * 31;
                Bundle bundle2 = this.zn;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode = i5 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode;
    }

    public final int n3() {
        return this.y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(gv.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.y));
        sb.append(")");
        if (this.n3 != null) {
            sb.append(" navOptions=");
            sb.append(this.n3);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final void v(androidx.navigation.t tVar) {
        this.n3 = tVar;
    }

    public final Bundle y() {
        return this.zn;
    }

    public final androidx.navigation.t zn() {
        return this.n3;
    }

    public /* synthetic */ gv(int i, androidx.navigation.t tVar, Bundle bundle, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i5 & 2) != 0 ? null : tVar, (i5 & 4) != 0 ? null : bundle);
    }
}
