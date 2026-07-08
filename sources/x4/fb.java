package x4;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class fb<K, V> {

    @Nullable
    public fb<K, V>.zn n3;

    @Nullable
    public fb<K, V>.n3 y;

    @Nullable
    public fb<K, V>.v zn;

    public final class gv implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int y;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f9077fb = false;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9079v = -1;

        public gv() {
            this.y = fb.this.gv() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f9077fb) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return x4.gv.zn(entry.getKey(), fb.this.n3(this.f9079v, 0)) && x4.gv.zn(entry.getValue(), fb.this.n3(this.f9079v, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f9077fb) {
                return (K) fb.this.n3(this.f9079v, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f9077fb) {
                return (V) fb.this.n3(this.f9079v, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9079v < this.y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f9077fb) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objN3 = fb.this.n3(this.f9079v, 0);
            Object objN32 = fb.this.n3(this.f9079v, 1);
            return (objN3 == null ? 0 : objN3.hashCode()) ^ (objN32 != null ? objN32.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9077fb) {
                throw new IllegalStateException();
            }
            fb.this.s(this.f9079v);
            this.f9079v--;
            this.y--;
            this.f9077fb = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            if (this.f9077fb) {
                return (V) fb.this.c5(this.f9079v, v6);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f9079v++;
            this.f9077fb = true;
            return this;
        }
    }

    public final class n3 implements Set<Map.Entry<K, V>> {
        public n3() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iGv = fb.this.gv();
            for (Map.Entry<K, V> entry : collection) {
                fb.this.fb(entry.getKey(), entry.getValue());
            }
            return iGv != fb.this.gv();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            fb.this.y();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iV = fb.this.v(entry.getKey());
            if (iV < 0) {
                return false;
            }
            return x4.gv.zn(fb.this.n3(iV, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return fb.f(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iGv = fb.this.gv() - 1; iGv >= 0; iGv--) {
                Object objN3 = fb.this.n3(iGv, 0);
                Object objN32 = fb.this.n3(iGv, 1);
                iHashCode += (objN3 == null ? 0 : objN3.hashCode()) ^ (objN32 == null ? 0 : objN32.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return fb.this.gv() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new gv();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return fb.this.gv();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class v implements Collection<V> {
        public v() {
        }

        @Override // java.util.Collection
        public boolean add(V v6) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            fb.this.y();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return fb.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return fb.this.gv() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new y(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = fb.this.a(obj);
            if (iA < 0) {
                return false;
            }
            fb.this.s(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iGv = fb.this.gv();
            int i = 0;
            boolean z = false;
            while (i < iGv) {
                if (collection.contains(fb.this.n3(i, 1))) {
                    fb.this.s(i);
                    i--;
                    iGv--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iGv = fb.this.gv();
            int i = 0;
            boolean z = false;
            while (i < iGv) {
                if (!collection.contains(fb.this.n3(i, 1))) {
                    fb.this.s(i);
                    i--;
                    iGv--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return fb.this.gv();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return fb.this.p(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) fb.this.mt(tArr, 1);
        }
    }

    public final class y<T> implements Iterator<T> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f9081fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f9082s = false;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9083v;
        public final int y;

        public y(int i) {
            this.y = i;
            this.f9083v = fb.this.gv();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9081fb < this.f9083v;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t3 = (T) fb.this.n3(this.f9081fb, this.y);
            this.f9081fb++;
            this.f9082s = true;
            return t3;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9082s) {
                throw new IllegalStateException();
            }
            int i = this.f9081fb - 1;
            this.f9081fb = i;
            this.f9083v--;
            this.f9082s = false;
            fb.this.s(i);
        }
    }

    public final class zn implements Set<K> {
        public zn() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            fb.this.y();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return fb.this.v(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return fb.i9(fb.this.zn(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return fb.f(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iGv = fb.this.gv() - 1; iGv >= 0; iGv--) {
                Object objN3 = fb.this.n3(iGv, 0);
                iHashCode += objN3 == null ? 0 : objN3.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return fb.this.gv() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new y(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iV = fb.this.v(obj);
            if (iV < 0) {
                return false;
            }
            fb.this.s(iV);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return fb.xc(fb.this.zn(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return fb.w(fb.this.zn(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return fb.this.gv();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return fb.this.p(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) fb.this.mt(tArr, 0);
        }
    }

    public static <T> boolean f(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean i9(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean w(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean xc(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public abstract int a(Object obj);

    public abstract V c5(int i, V v6);

    public abstract void fb(K k3, V v6);

    public abstract int gv();

    public <T> T[] mt(T[] tArr, int i) {
        int iGv = gv();
        if (tArr.length < iGv) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iGv));
        }
        for (int i5 = 0; i5 < iGv; i5++) {
            tArr[i5] = n3(i5, i);
        }
        if (tArr.length > iGv) {
            tArr[iGv] = null;
        }
        return tArr;
    }

    public abstract Object n3(int i, int i5);

    public Object[] p(int i) {
        int iGv = gv();
        Object[] objArr = new Object[iGv];
        for (int i5 = 0; i5 < iGv; i5++) {
            objArr[i5] = n3(i5, i);
        }
        return objArr;
    }

    public abstract void s(int i);

    public Set<Map.Entry<K, V>> t() {
        if (this.y == null) {
            this.y = new n3();
        }
        return this.y;
    }

    public Set<K> tl() {
        if (this.n3 == null) {
            this.n3 = new zn();
        }
        return this.n3;
    }

    public abstract int v(Object obj);

    public Collection<V> wz() {
        if (this.zn == null) {
            this.zn = new v();
        }
        return this.zn;
    }

    public abstract void y();

    public abstract Map<K, V> zn();
}
