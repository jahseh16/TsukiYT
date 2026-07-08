package a4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final Map y = new HashMap();

    public final k5 n3() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.y.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new k5(Collections.unmodifiableMap(map), null);
    }

    public final x y(String str, String str2, String str3) {
        if (!this.y.containsKey(str2)) {
            this.y.put(str2, new HashMap());
        }
        ((Map) this.y.get(str2)).put(str, str3);
        return this;
    }
}
