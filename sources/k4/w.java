package k4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<K, V> extends p implements Map<K, V> {
    public boolean a(Object obj) {
        return ta.zn(this, obj);
    }

    @Override // java.util.Map
    public void clear() {
        zn().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return zn().containsKey(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return zn().entrySet();
    }

    public int fb() {
        return oz.gv(entrySet());
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return zn().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zn().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return zn().keySet();
    }

    @Override // java.util.Map
    public V put(K k3, V v6) {
        return zn().put(k3, v6);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        zn().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return zn().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zn().size();
    }

    public boolean v(Object obj) {
        return ta.n3(this, obj);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return zn().values();
    }

    public abstract Map<K, V> zn();
}
