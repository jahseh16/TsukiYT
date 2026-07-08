package yk;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public final Set<y> y = new HashSet();

    public static final class y {
        public final boolean n3;

        @NonNull
        public final Uri y;

        public y(@NonNull Uri uri, boolean z) {
            this.y = uri;
            this.n3 = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || y.class != obj.getClass()) {
                return false;
            }
            y yVar = (y) obj;
            return this.n3 == yVar.n3 && this.y.equals(yVar.y);
        }

        public int hashCode() {
            return (this.y.hashCode() * 31) + (this.n3 ? 1 : 0);
        }

        public boolean n3() {
            return this.n3;
        }

        @NonNull
        public Uri y() {
            return this.y;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zn.class != obj.getClass()) {
            return false;
        }
        return this.y.equals(((zn) obj).y);
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    @NonNull
    public Set<y> n3() {
        return this.y;
    }

    public void y(@NonNull Uri uri, boolean z) {
        this.y.add(new y(uri, z));
    }

    public int zn() {
        return this.y.size();
    }
}
