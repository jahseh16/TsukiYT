package hl1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final Map<String, Object> n3;
    public final xk1.y y;

    public n3(xk1.y _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.y = _koin;
        this.n3 = ml1.y.y.gv();
    }

    public final <T> void n3(String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.n3.put(key, value);
    }

    public final <T> T y(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.n3.get(key);
    }
}
