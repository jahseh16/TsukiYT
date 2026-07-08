package g4;

/* JADX INFO: loaded from: classes.dex */
public final class xc {
    public static void a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(z.n3(str, Integer.valueOf(i)));
        }
    }

    public static void c5(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(z.n3(str, Long.valueOf(j)));
        }
    }

    public static void co(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(z.n3(str, Integer.valueOf(i)));
        }
    }

    public static int f(int i, int i5, String str) {
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(y(i, i5, str));
        }
        return i;
    }

    public static void fb(boolean z, String str, int i, int i5) {
        if (!z) {
            throw new IllegalArgumentException(z.n3(str, Integer.valueOf(i), Integer.valueOf(i5)));
        }
    }

    public static void gv(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int i9(int i, int i5) {
        return f(i, i5, "index");
    }

    public static void mt(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String n3(int i, int i5, String str) {
        if (i < 0) {
            return z.n3("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i5 >= 0) {
            return z.n3("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void p(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void s(boolean z, String str, int i, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(z.n3(str, Integer.valueOf(i), obj));
        }
    }

    public static <T> T t(T t3) {
        t3.getClass();
        return t3;
    }

    public static <T> T tl(T t3, Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void v(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void w(int i, int i5, int i8) {
        if (i < 0 || i5 < i || i5 > i8) {
            throw new IndexOutOfBoundsException(zn(i, i5, i8));
        }
    }

    public static int wz(int i, int i5) {
        return xc(i, i5, "index");
    }

    public static int xc(int i, int i5, String str) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(n3(i, i5, str));
        }
        return i;
    }

    public static String y(int i, int i5, String str) {
        if (i < 0) {
            return z.n3("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i5 >= 0) {
            return z.n3("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void z(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(z.n3(str, obj));
        }
    }

    public static String zn(int i, int i5, int i8) {
        return (i < 0 || i > i8) ? n3(i, i8, "start index") : (i5 < 0 || i5 > i8) ? n3(i5, i8, "end index") : z.n3("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i));
    }
}
