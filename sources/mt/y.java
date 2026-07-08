package mt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import mt.n3;

/* JADX INFO: loaded from: classes.dex */
public class y<K, V> extends n3<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<K, n3.zn<K, V>> f6745f = new HashMap<>();

    @Override // mt.n3
    public V a(@NonNull K k3, @NonNull V v6) {
        n3.zn<K, V> znVarN3 = n3(k3);
        if (znVarN3 != null) {
            return znVarN3.f6744v;
        }
        this.f6745f.put(k3, v(k3, v6));
        return null;
    }

    public boolean contains(K k3) {
        return this.f6745f.containsKey(k3);
    }

    @Override // mt.n3
    public V fb(@NonNull K k3) {
        V v6 = (V) super.fb(k3);
        this.f6745f.remove(k3);
        return v6;
    }

    @Override // mt.n3
    @Nullable
    public n3.zn<K, V> n3(K k3) {
        return this.f6745f.get(k3);
    }

    @Nullable
    public Map.Entry<K, V> s(K k3) {
        if (contains(k3)) {
            return this.f6745f.get(k3).f6743s;
        }
        return null;
    }
}
