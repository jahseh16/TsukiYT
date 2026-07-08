package k4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class z<K, V> extends v<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    public z(K k3, V v6) {
        this.key = k3;
        this.value = v6;
    }

    @Override // k4.v, java.util.Map.Entry
    public final K getKey() {
        return this.key;
    }

    @Override // k4.v, java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v6) {
        throw new UnsupportedOperationException();
    }
}
