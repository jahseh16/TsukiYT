package k4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yt {
    public static <K, V> Map<K, V> gv() {
        return f.yt();
    }

    public static <T> T[] n3(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    public static <T> T[] y(Object[] objArr, int i, int i5, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i5, tArr.getClass());
    }

    public static <K, V> Map<K, V> zn(int i) {
        return f.jz(i);
    }
}
