package nj1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x4 {
    public final Map<String, s> y = new LinkedHashMap();

    public final s n3(String key, s element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return this.y.put(key, element);
    }

    public final r y() {
        return new r(this.y);
    }
}
