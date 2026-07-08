package v3;

/* JADX INFO: loaded from: classes.dex */
public final class rs {
    public static void n3(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object y(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }
}
