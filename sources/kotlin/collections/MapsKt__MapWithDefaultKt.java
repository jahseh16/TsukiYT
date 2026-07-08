package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
class MapsKt__MapWithDefaultKt {
    public static final <K, V> V getOrImplicitDefaultNullable(Map<K, ? extends V> map, K k3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof MapWithDefault) {
            return (V) ((MapWithDefault) map).getOrImplicitDefault(k3);
        }
        V v6 = map.get(k3);
        if (v6 != null || map.containsKey(k3)) {
            return v6;
        }
        throw new NoSuchElementException("Key " + k3 + " is missing in the map.");
    }
}
