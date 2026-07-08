package j5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class zn {

    public static class y {
        public static int n3(Object... objArr) {
            return Objects.hash(objArr);
        }

        public static boolean y(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    @NonNull
    public static <T> T gv(@Nullable T t3, @NonNull String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    public static int n3(@Nullable Object... objArr) {
        return y.n3(objArr);
    }

    public static boolean y(@Nullable Object obj, @Nullable Object obj2) {
        return y.y(obj, obj2);
    }

    @NonNull
    public static <T> T zn(@Nullable T t3) {
        t3.getClass();
        return t3;
    }
}
