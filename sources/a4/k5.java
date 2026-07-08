package a4;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k5 {
    public final Map y;

    public final Map y(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        for (String str : this.y.keySet()) {
            if (this.y.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.y.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.emptySet();
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }
}
