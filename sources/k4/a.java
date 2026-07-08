package k4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k4.ej;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<K, V> implements d<K, V> {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public transient Collection<V> f5984fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient Map<K, Collection<V>> f5985s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient Set<K> f5986v;
    public transient Collection<Map.Entry<K, V>> y;

    public class n3 extends AbstractCollection<V> {
        public n3() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return a.this.r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a.this.size();
        }
    }

    public class y extends ej.n3<K, V> {
        public y() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return a.this.z();
        }

        @Override // k4.ej.n3
        public d<K, V> y() {
            return a.this;
        }
    }

    public boolean a(Object obj) {
        Iterator<Collection<V>> it = n3().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Collection<V> co();

    public boolean equals(Object obj) {
        return ej.y(this, obj);
    }

    @Override // k4.d
    public boolean gv(Object obj, Object obj2) {
        Collection<V> collection = n3().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public int hashCode() {
        return n3().hashCode();
    }

    @Override // k4.d
    public Set<K> keySet() {
        Set<K> set = this.f5986v;
        if (set != null) {
            return set;
        }
        Set<K> setP = p();
        this.f5986v = setP;
        return setP;
    }

    @Override // k4.d
    public Map<K, Collection<V>> n3() {
        Map<K, Collection<V>> map = this.f5985s;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapT = t();
        this.f5985s = mapT;
        return mapT;
    }

    public abstract Set<K> p();

    public abstract Iterator<V> r();

    @Override // k4.d
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = n3().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public abstract Map<K, Collection<V>> t();

    public String toString() {
        return n3().toString();
    }

    @Override // k4.d
    public Collection<V> values() {
        Collection<V> collection = this.f5984fb;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCo = co();
        this.f5984fb = collectionCo;
        return collectionCo;
    }

    public abstract Collection<Map.Entry<K, V>> w();

    @Override // k4.d
    public Collection<Map.Entry<K, V>> y() {
        Collection<Map.Entry<K, V>> collection = this.y;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionW = w();
        this.y = collectionW;
        return collectionW;
    }

    public abstract Iterator<Map.Entry<K, V>> z();
}
