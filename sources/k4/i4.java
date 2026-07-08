package k4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import k4.co;

/* JADX INFO: loaded from: classes.dex */
public abstract class i4<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f6037s = new Map.Entry[0];

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public transient co<V> f6038fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient n<K> f6039v;
    public transient n<Map.Entry<K, V>> y;

    public static class n3<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public n3(i4<K, V> i4Var) {
            Object[] objArr = new Object[i4Var.size()];
            Object[] objArr2 = new Object[i4Var.size()];
            k<Map.Entry<K, V>> kVarCo = i4Var.entrySet().iterator();
            int i = 0;
            while (kVarCo.hasNext()) {
                Map.Entry<K, V> next = kVarCo.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        public y<K, V> n3(int i) {
            return new y<>(i);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof n)) {
                return y();
            }
            n nVar = (n) obj;
            co coVar = (co) this.values;
            y yVar = (y<K, V>) n3(nVar.size());
            k kVarCo = nVar.iterator();
            k kVarCo2 = coVar.iterator();
            while (kVarCo.hasNext()) {
                yVar.gv(kVarCo.next(), kVarCo2.next());
            }
            return yVar.y();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object y() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            y<K, V> yVarN3 = n3(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                yVarN3.gv(objArr[i], objArr2[i]);
            }
            return yVarN3.y();
        }
    }

    public static class y<K, V> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f6040gv;
        public Object[] n3;
        public Comparator<? super V> y;
        public int zn;

        public y() {
            this(4);
        }

        public y<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                zn(this.zn + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                v(it.next());
            }
            return this;
        }

        public y<K, V> fb(Map<? extends K, ? extends V> map) {
            return a(map.entrySet());
        }

        public y<K, V> gv(K k3, V v6) {
            zn(this.zn + 1);
            c5.y(k3, v6);
            Object[] objArr = this.n3;
            int i = this.zn;
            objArr[i * 2] = k3;
            objArr[(i * 2) + 1] = v6;
            this.zn = i + 1;
            return this;
        }

        public i4<K, V> n3() {
            s();
            this.f6040gv = true;
            return hw.d(this.zn, this.n3);
        }

        public void s() {
            int i;
            if (this.y != null) {
                if (this.f6040gv) {
                    this.n3 = Arrays.copyOf(this.n3, this.zn * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.zn];
                int i5 = 0;
                while (true) {
                    i = this.zn;
                    if (i5 >= i) {
                        break;
                    }
                    int i8 = i5 * 2;
                    Object obj = this.n3[i8];
                    Objects.requireNonNull(obj);
                    Object obj2 = this.n3[i8 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i5] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                    i5++;
                }
                Arrays.sort(entryArr, 0, i, k5.y(this.y).w(ta.f()));
                for (int i10 = 0; i10 < this.zn; i10++) {
                    int i11 = i10 * 2;
                    this.n3[i11] = entryArr[i10].getKey();
                    this.n3[i11 + 1] = entryArr[i10].getValue();
                }
            }
        }

        public y<K, V> v(Map.Entry<? extends K, ? extends V> entry) {
            return gv(entry.getKey(), entry.getValue());
        }

        public i4<K, V> y() {
            return n3();
        }

        public final void zn(int i) {
            int i5 = i * 2;
            Object[] objArr = this.n3;
            if (i5 > objArr.length) {
                this.n3 = Arrays.copyOf(objArr, co.n3.zn(objArr.length, i5));
                this.f6040gv = false;
            }
        }

        public y(int i) {
            this.n3 = new Object[i * 2];
            this.zn = 0;
            this.f6040gv = false;
        }
    }

    public static <K, V> i4<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        y yVar = new y(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        yVar.a(iterable);
        return yVar.y();
    }

    public static <K, V> i4<K, V> c(K k3, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        c5.y(k3, v6);
        c5.y(k7, v7);
        c5.y(k8, v8);
        c5.y(k9, v9);
        return hw.d(4, new Object[]{k3, v6, k7, v7, k8, v8, k9, v9});
    }

    public static <K, V> i4<K, V> f(Map<? extends K, ? extends V> map) {
        if ((map instanceof i4) && !(map instanceof SortedMap)) {
            i4<K, V> i4Var = (i4) map;
            if (!i4Var.z()) {
                return i4Var;
            }
        }
        return a(map.entrySet());
    }

    public static <K, V> i4<K, V> f3() {
        return (i4<K, V>) hw.f6025p;
    }

    @SafeVarargs
    public static <K, V> i4<K, V> mg(Map.Entry<? extends K, ? extends V>... entryArr) {
        return a(Arrays.asList(entryArr));
    }

    public static <K, V> i4<K, V> n(K k3, V v6) {
        c5.y(k3, v6);
        return hw.d(1, new Object[]{k3, v6});
    }

    public static <K, V> i4<K, V> rz(K k3, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        c5.y(k3, v6);
        c5.y(k7, v7);
        c5.y(k8, v8);
        c5.y(k9, v9);
        c5.y(k10, v10);
        return hw.d(5, new Object[]{k3, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }

    public static <K, V> y<K, V> y() {
        return new y<>();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public n<Map.Entry<K, V>> entrySet() {
        n<Map.Entry<K, V>> nVar = this.y;
        if (nVar != null) {
            return nVar;
        }
        n<Map.Entry<K, V>> nVarT = t();
        this.y = nVarT;
        return nVarT;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return ta.zn(this, obj);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v6) {
        V v7 = get(obj);
        return v7 != null ? v7 : v6;
    }

    @Override // java.util.Map
    public int hashCode() {
        return oz.gv(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract co<V> p();

    @Override // java.util.Map
    @Deprecated
    public final V put(K k3, V v6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public n<K> keySet() {
        n<K> nVar = this.f6039v;
        if (nVar != null) {
            return nVar;
        }
        n<K> nVarW = w();
        this.f6039v = nVarW;
        return nVarW;
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract n<Map.Entry<K, V>> t();

    @Override // java.util.Map
    /* JADX INFO: renamed from: ta, reason: merged with bridge method [inline-methods] */
    public co<V> values() {
        co<V> coVar = this.f6038fb;
        if (coVar != null) {
            return coVar;
        }
        co<V> coVarP = p();
        this.f6038fb = coVarP;
        return coVarP;
    }

    public String toString() {
        return ta.i9(this);
    }

    public abstract n<K> w();

    public Object writeReplace() {
        return new n3(this);
    }

    public abstract boolean z();
}
