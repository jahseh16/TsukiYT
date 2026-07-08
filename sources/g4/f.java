package g4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public static int n3(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean y(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
