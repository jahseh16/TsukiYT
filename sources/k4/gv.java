package k4;

import g4.xc;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import k4.a;
import k4.ta;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv<K, V> extends k4.a<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map<K, Collection<V>> f6007f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient int f6008t;

    public class a extends gv<K, V>.c5 implements NavigableMap<K, Collection<V>> {
        public a(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k3) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = i9().ceilingEntry(k3);
            if (entryCeilingEntry == null) {
                return null;
            }
            return fb(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k3) {
            return i9().ceilingKey(k3);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new a(i9().descendingMap());
        }

        @Override // k4.gv.c5
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> s() {
            return new fb(i9());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = i9().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return fb(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k3) {
            Map.Entry<K, Collection<V>> entryFloorEntry = i9().floorEntry(k3);
            if (entryFloorEntry == null) {
                return null;
            }
            return fb(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k3) {
            return i9().floorKey(k3);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k3) {
            Map.Entry<K, Collection<V>> entryHigherEntry = i9().higherEntry(k3);
            if (entryHigherEntry == null) {
                return null;
            }
            return fb(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k3) {
            return i9().higherKey(k3);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = i9().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return fb(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k3) {
            Map.Entry<K, Collection<V>> entryLowerEntry = i9().lowerEntry(k3);
            if (entryLowerEntry == null) {
                return null;
            }
            return fb(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k3) {
            return i9().lowerKey(k3);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return c5();
        }

        @Override // k4.gv.c5, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k3) {
            return tailMap(k3, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return wz(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return wz(descendingMap().entrySet().iterator());
        }

        @Override // k4.gv.c5, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k3) {
            return headMap(k3, false);
        }

        @Override // k4.gv.c5, k4.gv.zn, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // k4.gv.c5, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k3, K k7) {
            return subMap(k3, true, k7, false);
        }

        public Map.Entry<K, Collection<V>> wz(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionYt = gv.this.yt();
            collectionYt.addAll(next.getValue());
            it.remove();
            return ta.gv(next.getKey(), gv.this.ct(collectionYt));
        }

        @Override // k4.gv.c5
        /* JADX INFO: renamed from: xc, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i9() {
            return (NavigableMap) super.i9();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k3, boolean z) {
            return new a(i9().headMap(k3, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k3, boolean z, K k7, boolean z5) {
            return new a(i9().subMap(k3, z, k7, z5));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k3, boolean z) {
            return new a(i9().tailMap(k3, z));
        }
    }

    public class c5 extends gv<K, V>.zn implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SortedSet<K> f6009f;

        public c5(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // k4.gv.zn, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: c5 */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f6009f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetS = s();
            this.f6009f = sortedSetS;
            return sortedSetS;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return i9().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return i9().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k3) {
            return new c5(i9().headMap(k3));
        }

        public SortedMap<K, Collection<V>> i9() {
            return (SortedMap) this.f6023fb;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return i9().lastKey();
        }

        public SortedSet<K> s() {
            return new i9(i9());
        }

        public SortedMap<K, Collection<V>> subMap(K k3, K k7) {
            return new c5(i9().subMap(k3, k7));
        }

        public SortedMap<K, Collection<V>> tailMap(K k3) {
            return new c5(i9().tailMap(k3));
        }
    }

    public class f extends AbstractCollection<V> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final gv<K, V>.f f6012fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Collection<V> f6013s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Collection<V> f6014v;
        public final K y;

        public f(K k3, Collection<V> collection, gv<K, V>.f fVar) {
            this.y = k3;
            this.f6014v = collection;
            this.f6012fb = fVar;
            this.f6013s = fVar == null ? null : fVar.zn();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v6) {
            v();
            boolean zIsEmpty = this.f6014v.isEmpty();
            boolean zAdd = this.f6014v.add(v6);
            if (zAdd) {
                gv.c(gv.this);
                if (zIsEmpty) {
                    y();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f6014v.addAll(collection);
            if (zAddAll) {
                gv.mg(gv.this, this.f6014v.size() - size);
                if (size == 0) {
                    y();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f6014v.clear();
            gv.ta(gv.this, size);
            fb();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            v();
            return this.f6014v.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            v();
            return this.f6014v.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            v();
            return this.f6014v.equals(obj);
        }

        public void fb() {
            gv<K, V>.f fVar = this.f6012fb;
            if (fVar != null) {
                fVar.fb();
            } else if (this.f6014v.isEmpty()) {
                gv.this.f6007f.remove(this.y);
            }
        }

        public K gv() {
            return this.y;
        }

        @Override // java.util.Collection
        public int hashCode() {
            v();
            return this.f6014v.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            v();
            return new y(this);
        }

        public gv<K, V>.f n3() {
            return this.f6012fb;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            v();
            boolean zRemove = this.f6014v.remove(obj);
            if (zRemove) {
                gv.rz(gv.this);
                fb();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f6014v.removeAll(collection);
            if (zRemoveAll) {
                gv.mg(gv.this, this.f6014v.size() - size);
                fb();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            xc.t(collection);
            int size = size();
            boolean zRetainAll = this.f6014v.retainAll(collection);
            if (zRetainAll) {
                gv.mg(gv.this, this.f6014v.size() - size);
                fb();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            v();
            return this.f6014v.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            v();
            return this.f6014v.toString();
        }

        public void v() {
            Collection<V> collection;
            gv<K, V>.f fVar = this.f6012fb;
            if (fVar != null) {
                fVar.v();
                if (this.f6012fb.zn() != this.f6013s) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f6014v.isEmpty() || (collection = (Collection) gv.this.f6007f.get(this.y)) == null) {
                    return;
                }
                this.f6014v = collection;
            }
        }

        public void y() {
            gv<K, V>.f fVar = this.f6012fb;
            if (fVar != null) {
                fVar.y();
            } else {
                gv.this.f6007f.put(this.y, this.f6014v);
            }
        }

        public Collection<V> zn() {
            return this.f6014v;
        }
    }

    public class fb extends gv<K, V>.i9 implements NavigableSet<K> {
        public fb(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // k4.gv.i9, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k3) {
            return tailSet(k3, true);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k3) {
            return n3().ceilingKey(k3);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new fb(n3().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k3) {
            return n3().floorKey(k3);
        }

        @Override // k4.gv.i9
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> n3() {
            return (NavigableMap) super.n3();
        }

        @Override // java.util.NavigableSet
        public K higher(K k3) {
            return n3().higherKey(k3);
        }

        @Override // java.util.NavigableSet
        public K lower(K k3) {
            return n3().lowerKey(k3);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) d0.xc(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) d0.xc(descendingIterator());
        }

        @Override // k4.gv.i9, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k3, K k7) {
            return subSet(k3, true, k7, false);
        }

        @Override // k4.gv.i9, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k3) {
            return headSet(k3, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k3, boolean z) {
            return new fb(n3().headMap(k3, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k3, boolean z, K k7, boolean z5) {
            return new fb(n3().subMap(k3, z, k7, z5));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k3, boolean z) {
            return new fb(n3().tailMap(k3, z));
        }
    }

    /* JADX INFO: renamed from: k4.gv$gv, reason: collision with other inner class name */
    public abstract class AbstractC0113gv<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> y;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public K f6019v = null;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public Collection<V> f6017fb = null;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Iterator<V> f6018s = d0.s();

        public AbstractC0113gv() {
            this.y = gv.this.f6007f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.y.hasNext() || this.f6018s.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f6018s.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.y.next();
                this.f6019v = next.getKey();
                Collection<V> value = next.getValue();
                this.f6017fb = value;
                this.f6018s = value.iterator();
            }
            return y(x.y(this.f6019v), this.f6018s.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f6018s.remove();
            Collection<V> collection = this.f6017fb;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.y.remove();
            }
            gv.rz(gv.this);
        }

        public abstract T y(K k3, V v6);
    }

    public class i9 extends gv<K, V>.v implements SortedSet<K> {
        public i9(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return n3().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return n3().firstKey();
        }

        public SortedSet<K> headSet(K k3) {
            return new i9(n3().headMap(k3));
        }

        @Override // java.util.SortedSet
        public K last() {
            return n3().lastKey();
        }

        public SortedMap<K, Collection<V>> n3() {
            return (SortedMap) super.y();
        }

        public SortedSet<K> subSet(K k3, K k7) {
            return new i9(n3().subMap(k3, k7));
        }

        public SortedSet<K> tailSet(K k3) {
            return new i9(n3().tailMap(k3));
        }
    }

    public class n3 extends gv<K, V>.AbstractC0113gv<Map.Entry<K, V>> {
        public n3(gv gvVar) {
            super();
        }

        @Override // k4.gv.AbstractC0113gv
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> y(K k3, V v6) {
            return ta.gv(k3, v6);
        }
    }

    public class s extends gv<K, V>.t implements RandomAccess {
        public s(gv gvVar, K k3, List<V> list, gv<K, V>.f fVar) {
            super(k3, list, fVar);
        }
    }

    public class v extends ta.gv<K, Collection<V>> {
        public v(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.zn(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return y().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || y().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return y().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new y(this, y().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = y().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                gv.ta(gv.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public class zn extends ta.a<K, Collection<V>> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f6023fb;

        public zn(Map<K, Collection<V>> map) {
            this.f6023fb = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f6023fb.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionYt = gv.this.yt();
            collectionYt.addAll(collectionRemove);
            gv.ta(gv.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionYt;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f6023fb == gv.this.f6007f) {
                gv.this.clear();
            } else {
                d0.zn(new n3(this));
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ta.fb(this.f6023fb, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f6023fb.equals(obj);
        }

        public Map.Entry<K, Collection<V>> fb(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return ta.gv(key, gv.this.rs(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f6023fb.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return gv.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f6023fb.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f6023fb.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) ta.s(this.f6023fb, obj);
            if (collection == null) {
                return null;
            }
            return gv.this.rs(obj, collection);
        }

        @Override // k4.ta.a
        public Set<Map.Entry<K, Collection<V>>> y() {
            return new y(this);
        }
    }

    public gv(Map<K, Collection<V>> map) {
        xc.gv(map.isEmpty());
        this.f6007f = map;
    }

    public static /* synthetic */ int c(gv gvVar) {
        int i = gvVar.f6008t;
        gvVar.f6008t = i + 1;
        return i;
    }

    public static <E> Iterator<E> f7(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public static /* synthetic */ int mg(gv gvVar, int i) {
        int i5 = gvVar.f6008t + i;
        gvVar.f6008t = i5;
        return i5;
    }

    public static /* synthetic */ int rz(gv gvVar) {
        int i = gvVar.f6008t;
        gvVar.f6008t = i - 1;
        return i;
    }

    public static /* synthetic */ int ta(gv gvVar, int i) {
        int i5 = gvVar.f6008t - i;
        gvVar.f6008t = i5;
        return i5;
    }

    @Override // k4.d
    public void clear() {
        Iterator<Collection<V>> it = this.f6007f.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f6007f.clear();
        this.f6008t = 0;
    }

    @Override // k4.a
    public Collection<V> co() {
        return new a.n3();
    }

    public abstract <E> Collection<E> ct(Collection<E> collection);

    public final List<V> eb(K k3, List<V> list, gv<K, V>.f fVar) {
        return list instanceof RandomAccess ? new s(this, k3, list, fVar) : new t(k3, list, fVar);
    }

    public Map<K, Collection<V>> ej() {
        return this.f6007f;
    }

    @Override // k4.d
    public Collection<V> get(K k3) {
        Collection<V> collectionJ = this.f6007f.get(k3);
        if (collectionJ == null) {
            collectionJ = j(k3);
        }
        return rs(k3, collectionJ);
    }

    public Collection<V> j(K k3) {
        return yt();
    }

    public final void jz(Object obj) {
        Collection collection = (Collection) ta.c5(this.f6007f, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f6008t -= size;
        }
    }

    public final Set<K> k() {
        Map<K, Collection<V>> map = this.f6007f;
        return map instanceof NavigableMap ? new fb((NavigableMap) this.f6007f) : map instanceof SortedMap ? new i9((SortedMap) this.f6007f) : new v(this.f6007f);
    }

    public final Map<K, Collection<V>> oz() {
        Map<K, Collection<V>> map = this.f6007f;
        return map instanceof NavigableMap ? new a((NavigableMap) this.f6007f) : map instanceof SortedMap ? new c5((SortedMap) this.f6007f) : new zn(this.f6007f);
    }

    @Override // k4.d
    public boolean put(K k3, V v6) {
        Collection<V> collection = this.f6007f.get(k3);
        if (collection != null) {
            if (!collection.add(v6)) {
                return false;
            }
            this.f6008t++;
            return true;
        }
        Collection<V> collectionJ = j(k3);
        if (!collectionJ.add(v6)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f6008t++;
        this.f6007f.put(k3, collectionJ);
        return true;
    }

    @Override // k4.a
    public Iterator<V> r() {
        return new y(this);
    }

    public abstract Collection<V> rs(K k3, Collection<V> collection);

    @Override // k4.d
    public int size() {
        return this.f6008t;
    }

    public final void u(Map<K, Collection<V>> map) {
        this.f6007f = map;
        this.f6008t = 0;
        for (Collection<V> collection : map.values()) {
            xc.gv(!collection.isEmpty());
            this.f6008t += collection.size();
        }
    }

    @Override // k4.a, k4.d
    public Collection<V> values() {
        return super.values();
    }

    @Override // k4.a
    public Collection<Map.Entry<K, V>> w() {
        return new a.y();
    }

    @Override // k4.a, k4.d
    public Collection<Map.Entry<K, V>> y() {
        return super.y();
    }

    public abstract Collection<V> yt();

    @Override // k4.a
    public Iterator<Map.Entry<K, V>> z() {
        return new n3(this);
    }

    public class t extends gv<K, V>.f implements List<V> {
        public t(K k3, List<V> list, gv<K, V>.f fVar) {
            super(k3, list, fVar);
        }

        @Override // java.util.List
        public void add(int i, V v6) {
            v();
            boolean zIsEmpty = zn().isEmpty();
            s().add(i, v6);
            gv.c(gv.this);
            if (zIsEmpty) {
                y();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = s().addAll(i, collection);
            if (zAddAll) {
                gv.mg(gv.this, zn().size() - size);
                if (size == 0) {
                    y();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i) {
            v();
            return s().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            v();
            return s().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            v();
            return s().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            v();
            return new y(this);
        }

        @Override // java.util.List
        public V remove(int i) {
            v();
            V vRemove = s().remove(i);
            gv.rz(gv.this);
            fb();
            return vRemove;
        }

        public List<V> s() {
            return (List) zn();
        }

        @Override // java.util.List
        public V set(int i, V v6) {
            v();
            return s().set(i, v6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i5) {
            v();
            return gv.this.eb(gv(), s().subList(i, i5), n3() == null ? this : n3());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            v();
            return new y(this, i);
        }
    }

    public class y extends gv<K, V>.AbstractC0113gv<V> {
        public y(gv gvVar) {
            super();
        }

        @Override // k4.gv.AbstractC0113gv
        public V y(K k3, V v6) {
            return v6;
        }
    }
}
