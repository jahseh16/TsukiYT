package v0;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static <T> T a(@Nullable T t3, Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T c5(@Nullable T t3) {
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException();
    }

    public static void fb(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static String gv(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T i9(@Nullable T t3, Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void n3(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void s(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T v(@Nullable T t3) {
        t3.getClass();
        return t3;
    }

    public static void y(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int zn(int i, int i5, int i8) {
        if (i < i5 || i >= i8) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }
}
