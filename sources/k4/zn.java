package k4;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn<K, V> extends gv<K, V> implements fh<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public zn(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // k4.gv
    public <E> Collection<E> ct(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // k4.a
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // k4.gv, k4.d
    /* JADX INFO: renamed from: lc, reason: merged with bridge method [inline-methods] */
    public List<V> get(K k3) {
        return (List) super.get(k3);
    }

    @Override // k4.a, k4.d
    public Map<K, Collection<V>> n3() {
        return super.n3();
    }

    @Override // k4.gv, k4.d
    public boolean put(K k3, V v6) {
        return super.put(k3, v6);
    }

    @Override // k4.gv
    public Collection<V> rs(K k3, Collection<V> collection) {
        return eb(k3, (List) collection, null);
    }
}
