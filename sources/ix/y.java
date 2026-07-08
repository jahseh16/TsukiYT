package ix;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements d {
    public static final Set<y> zn = new HashSet();
    public final String n3;
    public final String y;

    public static class a extends y {
        public a(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public final boolean zn() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class c5 extends y {
        public c5(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public final boolean zn() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public static class fb extends y {
        public fb(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public final boolean zn() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class gv extends y {
        public gv(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public final boolean zn() {
            return false;
        }
    }

    public static class n3 extends y {
        public n3(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public final boolean zn() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    public static class s extends y {
        public s(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public final boolean zn() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class v extends y {
        public v(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public final boolean zn() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: renamed from: ix.y$y, reason: collision with other inner class name */
    public static class C0109y {
        public static final Set<String> y = new HashSet(Arrays.asList(qn.zn().y()));
    }

    public static class zn extends y {
        public zn(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public final boolean zn() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    public y(@NonNull String str, @NonNull String str2) {
        this.y = str;
        this.n3 = str2;
        zn.add(this);
    }

    @NonNull
    public static Set<y> v() {
        return Collections.unmodifiableSet(zn);
    }

    public boolean gv() {
        return kk1.y.n3(C0109y.y, this.n3);
    }

    @Override // ix.d
    public boolean n3() {
        return zn() || gv();
    }

    @Override // ix.d
    @NonNull
    public String y() {
        return this.y;
    }

    public abstract boolean zn();
}
