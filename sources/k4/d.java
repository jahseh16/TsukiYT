package k4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface d<K, V> {
    void clear();

    Collection<V> get(K k3);

    boolean gv(Object obj, Object obj2);

    Set<K> keySet();

    Map<K, Collection<V>> n3();

    boolean put(K k3, V v6);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();

    Collection<Map.Entry<K, V>> y();
}
