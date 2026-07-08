package ix;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class k5 {
    public static final Set<k5> zn = new HashSet();
    public final String n3;
    public final String y;

    public static class n3 extends k5 {
        public n3(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    public static class y extends k5 {
        public y(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }

    public k5(@NonNull String str, @NonNull String str2) {
        this.y = str;
        this.n3 = str2;
        zn.add(this);
    }
}
