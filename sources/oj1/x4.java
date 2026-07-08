package oj1;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x4 {
    public final Map<kj1.a, Map<y<Object>, Object>> y = r.y(1);

    public static final class y<T> {
    }

    public final <T> T n3(kj1.a descriptor, y<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t3 = (T) y(descriptor, key);
        if (t3 != null) {
            return t3;
        }
        T tInvoke = defaultValue.invoke();
        zn(descriptor, key, tInvoke);
        return tInvoke;
    }

    public final <T> T y(kj1.a descriptor, y<T> key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<y<Object>, Object> map = this.y.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> void zn(kj1.a descriptor, y<T> key, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<kj1.a, Map<y<Object>, Object>> map = this.y;
        Map<y<Object>, Object> mapY = map.get(descriptor);
        if (mapY == null) {
            mapY = r.y(1);
            map.put(descriptor, mapY);
        }
        mapY.put(key, value);
    }
}
