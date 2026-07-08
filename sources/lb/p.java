package lb;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> y = new y();
    final Comparator<? super K> comparator;
    private p<K, V>.gv entrySet;
    final fb<K, V> header;
    private p<K, V>.v keySet;
    int modCount;
    int size;
    fb<K, V>[] table;
    int threshold;

    public final class gv extends AbstractSet<Map.Entry<K, V>> {
        public gv() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && p.this.w((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new y(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            fb<K, V> fbVarW;
            if (!(obj instanceof Map.Entry) || (fbVarW = p.this.w((Map.Entry) obj)) == null) {
                return false;
            }
            p.this.z(fbVarW, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.size;
        }
    }

    public static final class n3<K, V> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6136gv;
        public int n3;
        public fb<K, V> y;
        public int zn;

        public void n3(int i) {
            this.n3 = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f6136gv = 0;
            this.zn = 0;
            this.y = null;
        }

        public void y(fb<K, V> fbVar) {
            fbVar.f6131fb = null;
            fbVar.y = null;
            fbVar.f6135v = null;
            fbVar.f6129co = 1;
            int i = this.n3;
            if (i > 0) {
                int i5 = this.f6136gv;
                if ((i5 & 1) == 0) {
                    this.f6136gv = i5 + 1;
                    this.n3 = i - 1;
                    this.zn++;
                }
            }
            fbVar.y = this.y;
            this.y = fbVar;
            int i8 = this.f6136gv;
            int i10 = i8 + 1;
            this.f6136gv = i10;
            int i11 = this.n3;
            if (i11 > 0 && (i10 & 1) == 0) {
                this.f6136gv = i8 + 2;
                this.n3 = i11 - 1;
                this.zn++;
            }
            int i12 = 4;
            while (true) {
                int i13 = i12 - 1;
                if ((this.f6136gv & i13) != i13) {
                    return;
                }
                int i14 = this.zn;
                if (i14 == 0) {
                    fb<K, V> fbVar2 = this.y;
                    fb<K, V> fbVar3 = fbVar2.y;
                    fb<K, V> fbVar4 = fbVar3.y;
                    fbVar3.y = fbVar4.y;
                    this.y = fbVar3;
                    fbVar3.f6135v = fbVar4;
                    fbVar3.f6131fb = fbVar2;
                    fbVar3.f6129co = fbVar2.f6129co + 1;
                    fbVar4.y = fbVar3;
                    fbVar2.y = fbVar3;
                } else if (i14 == 1) {
                    fb<K, V> fbVar5 = this.y;
                    fb<K, V> fbVar6 = fbVar5.y;
                    this.y = fbVar6;
                    fbVar6.f6131fb = fbVar5;
                    fbVar6.f6129co = fbVar5.f6129co + 1;
                    fbVar5.y = fbVar6;
                    this.zn = 0;
                } else if (i14 == 2) {
                    this.zn = 0;
                }
                i12 *= 2;
            }
        }

        public fb<K, V> zn() {
            fb<K, V> fbVar = this.y;
            if (fbVar.y == null) {
                return fbVar;
            }
            throw new IllegalStateException();
        }
    }

    public final class v extends AbstractSet<K> {
        public v() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return p.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new y(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return p.this.r(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.size;
        }
    }

    public class y implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static class zn<K, V> {
        public fb<K, V> y;

        public void n3(fb<K, V> fbVar) {
            fb<K, V> fbVar2 = null;
            while (fbVar != null) {
                fbVar.y = fbVar2;
                fbVar2 = fbVar;
                fbVar = fbVar.f6135v;
            }
            this.y = fbVar2;
        }

        public fb<K, V> y() {
            fb<K, V> fbVar = this.y;
            if (fbVar == null) {
                return null;
            }
            fb<K, V> fbVar2 = fbVar.y;
            fbVar.y = null;
            fb<K, V> fbVar3 = fbVar.f6131fb;
            while (true) {
                fb<K, V> fbVar4 = fbVar2;
                fbVar2 = fbVar3;
                if (fbVar2 == null) {
                    this.y = fbVar4;
                    return fbVar;
                }
                fbVar2.y = fbVar4;
                fbVar3 = fbVar2.f6135v;
            }
        }
    }

    public p() {
        this(null);
    }

    public static <K, V> fb<K, V>[] a(fb<K, V>[] fbVarArr) {
        int length = fbVarArr.length;
        fb<K, V>[] fbVarArr2 = new fb[length * 2];
        zn znVar = new zn();
        n3 n3Var = new n3();
        n3 n3Var2 = new n3();
        for (int i = 0; i < length; i++) {
            fb<K, V> fbVar = fbVarArr[i];
            if (fbVar != null) {
                znVar.n3(fbVar);
                int i5 = 0;
                int i8 = 0;
                while (true) {
                    fb<K, V> fbVarY = znVar.y();
                    if (fbVarY == null) {
                        break;
                    }
                    if ((fbVarY.w & length) == 0) {
                        i5++;
                    } else {
                        i8++;
                    }
                }
                n3Var.n3(i5);
                n3Var2.n3(i8);
                znVar.n3(fbVar);
                while (true) {
                    fb<K, V> fbVarY2 = znVar.y();
                    if (fbVarY2 == null) {
                        break;
                    }
                    if ((fbVarY2.w & length) == 0) {
                        n3Var.y(fbVarY2);
                    } else {
                        n3Var2.y(fbVarY2);
                    }
                }
                fbVarArr2[i] = i5 > 0 ? n3Var.zn() : null;
                fbVarArr2[i + length] = i8 > 0 ? n3Var2.zn() : null;
            }
        }
        return fbVarArr2;
    }

    public static int rz(int i) {
        int i5 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i5 >>> 4) ^ ((i5 >>> 7) ^ i5);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final void c(fb<K, V> fbVar) {
        fb<K, V> fbVar2 = fbVar.f6135v;
        fb<K, V> fbVar3 = fbVar.f6131fb;
        fb<K, V> fbVar4 = fbVar2.f6135v;
        fb<K, V> fbVar5 = fbVar2.f6131fb;
        fbVar.f6135v = fbVar5;
        if (fbVar5 != null) {
            fbVar5.y = fbVar;
        }
        f3(fbVar, fbVar2);
        fbVar2.f6131fb = fbVar;
        fbVar.y = fbVar2;
        int iMax = Math.max(fbVar3 != null ? fbVar3.f6129co : 0, fbVar5 != null ? fbVar5.f6129co : 0) + 1;
        fbVar.f6129co = iMax;
        fbVar2.f6129co = Math.max(iMax, fbVar4 != null ? fbVar4.f6129co : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        fb<K, V> fbVar = this.header;
        fb<K, V> fbVar2 = fbVar.f6133s;
        while (fbVar2 != fbVar) {
            fb<K, V> fbVar3 = fbVar2.f6133s;
            fbVar2.f6130f = null;
            fbVar2.f6133s = null;
            fbVar2 = fbVar3;
        }
        fbVar.f6130f = fbVar;
        fbVar.f6133s = fbVar;
    }

    public final void co(fb<K, V> fbVar, boolean z) {
        while (fbVar != null) {
            fb<K, V> fbVar2 = fbVar.f6135v;
            fb<K, V> fbVar3 = fbVar.f6131fb;
            int i = fbVar2 != null ? fbVar2.f6129co : 0;
            int i5 = fbVar3 != null ? fbVar3.f6129co : 0;
            int i8 = i - i5;
            if (i8 == -2) {
                fb<K, V> fbVar4 = fbVar3.f6135v;
                fb<K, V> fbVar5 = fbVar3.f6131fb;
                int i10 = (fbVar4 != null ? fbVar4.f6129co : 0) - (fbVar5 != null ? fbVar5.f6129co : 0);
                if (i10 != -1 && (i10 != 0 || z)) {
                    c(fbVar3);
                }
                n(fbVar);
                if (z) {
                    return;
                }
            } else if (i8 == 2) {
                fb<K, V> fbVar6 = fbVar2.f6135v;
                fb<K, V> fbVar7 = fbVar2.f6131fb;
                int i11 = (fbVar6 != null ? fbVar6.f6129co : 0) - (fbVar7 != null ? fbVar7.f6129co : 0);
                if (i11 != 1 && (i11 != 0 || z)) {
                    n(fbVar2);
                }
                c(fbVar);
                if (z) {
                    return;
                }
            } else if (i8 == 0) {
                fbVar.f6129co = i + 1;
                if (z) {
                    return;
                }
            } else {
                fbVar.f6129co = Math.max(i, i5) + 1;
                if (!z) {
                    return;
                }
            }
            fbVar = fbVar.y;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return p(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        p<K, V>.gv gvVar = this.entrySet;
        if (gvVar != null) {
            return gvVar;
        }
        p<K, V>.gv gvVar2 = new gv();
        this.entrySet = gvVar2;
        return gvVar2;
    }

    public final boolean f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final void f3(fb<K, V> fbVar, fb<K, V> fbVar2) {
        fb<K, V> fbVar3 = fbVar.y;
        fbVar.y = null;
        if (fbVar2 != null) {
            fbVar2.y = fbVar3;
        }
        if (fbVar3 == null) {
            int i = fbVar.w;
            this.table[i & (r0.length - 1)] = fbVar2;
        } else if (fbVar3.f6135v == fbVar) {
            fbVar3.f6135v = fbVar2;
        } else {
            fbVar3.f6131fb = fbVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        fb<K, V> fbVarP = p(obj);
        if (fbVarP != null) {
            return fbVarP.f6132p;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        p<K, V>.v vVar = this.keySet;
        if (vVar != null) {
            return vVar;
        }
        p<K, V>.v vVar2 = new v();
        this.keySet = vVar2;
        return vVar2;
    }

    public final void n(fb<K, V> fbVar) {
        fb<K, V> fbVar2 = fbVar.f6135v;
        fb<K, V> fbVar3 = fbVar.f6131fb;
        fb<K, V> fbVar4 = fbVar3.f6135v;
        fb<K, V> fbVar5 = fbVar3.f6131fb;
        fbVar.f6131fb = fbVar4;
        if (fbVar4 != null) {
            fbVar4.y = fbVar;
        }
        f3(fbVar, fbVar3);
        fbVar3.f6135v = fbVar;
        fbVar.y = fbVar3;
        int iMax = Math.max(fbVar2 != null ? fbVar2.f6129co : 0, fbVar4 != null ? fbVar4.f6129co : 0) + 1;
        fbVar.f6129co = iMax;
        fbVar3.f6129co = Math.max(iMax, fbVar5 != null ? fbVar5.f6129co : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fb<K, V> p(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return t(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k3, V v6) {
        if (k3 == null) {
            throw new NullPointerException("key == null");
        }
        fb<K, V> fbVarT = t(k3, true);
        V v7 = fbVarT.f6132p;
        fbVarT.f6132p = v6;
        return v7;
    }

    public fb<K, V> r(Object obj) {
        fb<K, V> fbVarP = p(obj);
        if (fbVarP != null) {
            z(fbVarP, true);
        }
        return fbVarP;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        fb<K, V> fbVarR = r(obj);
        if (fbVarR != null) {
            return fbVarR.f6132p;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public fb<K, V> t(K k3, boolean z) {
        fb<K, V> fbVar;
        int i;
        fb<K, V> fbVar2;
        Comparator<? super K> comparator = this.comparator;
        fb<K, V>[] fbVarArr = this.table;
        int iRz = rz(k3.hashCode());
        int length = (fbVarArr.length - 1) & iRz;
        fb<K, V> fbVar3 = fbVarArr[length];
        if (fbVar3 != null) {
            Comparable comparable = comparator == y ? (Comparable) k3 : null;
            while (true) {
                int iCompareTo = comparable != null ? comparable.compareTo(fbVar3.f6134t) : comparator.compare(k3, fbVar3.f6134t);
                if (iCompareTo == 0) {
                    return fbVar3;
                }
                fb<K, V> fbVar4 = iCompareTo < 0 ? fbVar3.f6135v : fbVar3.f6131fb;
                if (fbVar4 == null) {
                    fbVar = fbVar3;
                    i = iCompareTo;
                    break;
                }
                fbVar3 = fbVar4;
            }
        } else {
            fbVar = fbVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        fb<K, V> fbVar5 = this.header;
        if (fbVar != null) {
            fbVar2 = new fb<>(fbVar, k3, iRz, fbVar5, fbVar5.f6130f);
            if (i < 0) {
                fbVar.f6135v = fbVar2;
            } else {
                fbVar.f6131fb = fbVar2;
            }
            co(fbVar, true);
        } else {
            if (comparator == y && !(k3 instanceof Comparable)) {
                throw new ClassCastException(k3.getClass().getName() + " is not Comparable");
            }
            fbVar2 = new fb<>(fbVar, k3, iRz, fbVar5, fbVar5.f6130f);
            fbVarArr[length] = fbVar2;
        }
        int i5 = this.size;
        this.size = i5 + 1;
        if (i5 > this.threshold) {
            y();
        }
        this.modCount++;
        return fbVar2;
    }

    public fb<K, V> w(Map.Entry<?, ?> entry) {
        fb<K, V> fbVarP = p(entry.getKey());
        if (fbVarP == null || !f(fbVarP.f6132p, entry.getValue())) {
            return null;
        }
        return fbVarP;
    }

    public final void y() {
        fb<K, V>[] fbVarArrA = a(this.table);
        this.table = fbVarArrA;
        this.threshold = (fbVarArrA.length / 2) + (fbVarArrA.length / 4);
    }

    public void z(fb<K, V> fbVar, boolean z) {
        int i;
        if (z) {
            fb<K, V> fbVar2 = fbVar.f6130f;
            fbVar2.f6133s = fbVar.f6133s;
            fbVar.f6133s.f6130f = fbVar2;
            fbVar.f6130f = null;
            fbVar.f6133s = null;
        }
        fb<K, V> fbVar3 = fbVar.f6135v;
        fb<K, V> fbVar4 = fbVar.f6131fb;
        fb<K, V> fbVar5 = fbVar.y;
        int i5 = 0;
        if (fbVar3 == null || fbVar4 == null) {
            if (fbVar3 != null) {
                f3(fbVar, fbVar3);
                fbVar.f6135v = null;
            } else if (fbVar4 != null) {
                f3(fbVar, fbVar4);
                fbVar.f6131fb = null;
            } else {
                f3(fbVar, null);
            }
            co(fbVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        fb<K, V> fbVarN3 = fbVar3.f6129co > fbVar4.f6129co ? fbVar3.n3() : fbVar4.y();
        z(fbVarN3, false);
        fb<K, V> fbVar6 = fbVar.f6135v;
        if (fbVar6 != null) {
            i = fbVar6.f6129co;
            fbVarN3.f6135v = fbVar6;
            fbVar6.y = fbVarN3;
            fbVar.f6135v = null;
        } else {
            i = 0;
        }
        fb<K, V> fbVar7 = fbVar.f6131fb;
        if (fbVar7 != null) {
            i5 = fbVar7.f6129co;
            fbVarN3.f6131fb = fbVar7;
            fbVar7.y = fbVarN3;
            fbVar.f6131fb = null;
        }
        fbVarN3.f6129co = Math.max(i, i5) + 1;
        f3(fbVar, fbVarN3);
    }

    public p(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? y : comparator;
        this.header = new fb<>();
        fb<K, V>[] fbVarArr = new fb[16];
        this.table = fbVarArr;
        this.threshold = (fbVarArr.length / 2) + (fbVarArr.length / 4);
    }

    public static final class fb<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f6129co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public fb<K, V> f6130f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public fb<K, V> f6131fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public V f6132p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public fb<K, V> f6133s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final K f6134t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public fb<K, V> f6135v;
        public final int w;
        public fb<K, V> y;

        public fb() {
            this.f6134t = null;
            this.w = -1;
            this.f6130f = this;
            this.f6133s = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k3 = this.f6134t;
            if (k3 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k3.equals(entry.getKey())) {
                return false;
            }
            V v6 = this.f6132p;
            if (v6 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v6.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f6134t;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6132p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k3 = this.f6134t;
            int iHashCode = k3 == null ? 0 : k3.hashCode();
            V v6 = this.f6132p;
            return iHashCode ^ (v6 != null ? v6.hashCode() : 0);
        }

        public fb<K, V> n3() {
            fb<K, V> fbVar = this;
            for (fb<K, V> fbVar2 = this.f6131fb; fbVar2 != null; fbVar2 = fbVar2.f6131fb) {
                fbVar = fbVar2;
            }
            return fbVar;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            V v7 = this.f6132p;
            this.f6132p = v6;
            return v7;
        }

        public String toString() {
            return this.f6134t + "=" + this.f6132p;
        }

        public fb<K, V> y() {
            fb<K, V> fbVar = this;
            for (fb<K, V> fbVar2 = this.f6135v; fbVar2 != null; fbVar2 = fbVar2.f6135v) {
                fbVar = fbVar2;
            }
            return fbVar;
        }

        public fb(fb<K, V> fbVar, K k3, int i, fb<K, V> fbVar2, fb<K, V> fbVar3) {
            this.y = fbVar;
            this.f6134t = k3;
            this.w = i;
            this.f6129co = 1;
            this.f6133s = fbVar2;
            this.f6130f = fbVar3;
            fbVar3.f6133s = this;
            fbVar2.f6130f = this;
        }
    }
}
