package k4;

import g4.xc;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object z = new Object();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public transient Collection<V> f5994co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f5995f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public transient Object[] f5996fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f5997p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient Object[] f5998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient int f5999t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient int[] f6000v;
    public transient Set<K> w;
    public transient Object y;

    public class a extends AbstractSet<K> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return f.this.g3();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapU = f.this.u();
            return mapU != null ? mapU.keySet().remove(obj) : f.this.u0(obj) != f.z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.size();
        }
    }

    public class gv extends AbstractSet<Map.Entry<K, V>> {
        public gv() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapU = f.this.u();
            if (mapU != null) {
                return mapU.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iYg = f.this.yg(entry.getKey());
            return iYg != -1 && g4.f.y(f.this.qk(iYg), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.rs();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapU = f.this.u();
            if (mapU != null) {
                return mapU.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (f.this.g()) {
                return false;
            }
            int iE = f.this.e();
            int iA = t.a(entry.getKey(), entry.getValue(), iE, f.this.tg(), f.this.bk(), f.this.y4(), f.this.pz());
            if (iA == -1) {
                return false;
            }
            f.this.m(iA, iE);
            f.w(f.this);
            f.this.ap();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.size();
        }
    }

    public class n3 extends f<K, V>.v<Map.Entry<K, V>> {
        public n3() {
            super(f.this, null);
        }

        @Override // k4.f.v
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> n3(int i) {
            return new fb(f.this, i);
        }
    }

    public class s extends AbstractCollection<V> {
        public s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.qj();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    public class y extends f<K, V>.v<K> {
        public y() {
            super(f.this, null);
        }

        @Override // k4.f.v
        public K n3(int i) {
            return (K) f.this.rb(i);
        }
    }

    public class zn extends f<K, V>.v<V> {
        public zn() {
            super(f.this, null);
        }

        @Override // k4.f.v
        public V n3(int i) {
            return (V) f.this.qk(i);
        }
    }

    public f() {
        yc(3);
    }

    public static <K, V> f<K, V> jz(int i) {
        return new f<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(i);
            throw new InvalidObjectException(sb.toString());
        }
        yc(i);
        for (int i5 = 0; i5 < i; i5++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static /* synthetic */ int w(f fVar) {
        int i = fVar.f5999t;
        fVar.f5999t = i - 1;
        return i;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itRs = rs();
        while (itRs.hasNext()) {
            Map.Entry<K, V> next = itRs.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public static <K, V> f<K, V> yt() {
        return new f<>();
    }

    public final void ad(int i, K k3) {
        y4()[i] = k3;
    }

    public void ap() {
        this.f5995f += 32;
    }

    public final int[] bk() {
        int[] iArr = this.f6000v;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (g()) {
            return;
        }
        ap();
        Map<K, V> mapU = u();
        if (mapU != null) {
            this.f5995f = n4.a.a(size(), 3, 1073741823);
            mapU.clear();
            this.y = null;
            this.f5999t = 0;
            return;
        }
        Arrays.fill(y4(), 0, this.f5999t, (Object) null);
        Arrays.fill(pz(), 0, this.f5999t, (Object) null);
        t.fb(tg());
        Arrays.fill(bk(), 0, this.f5999t, 0);
        this.f5999t = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapU = u();
        return mapU != null ? mapU.containsKey(obj) : yg(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapU = u();
        if (mapU != null) {
            return mapU.containsValue(obj);
        }
        for (int i = 0; i < this.f5999t; i++) {
            if (g4.f.y(obj, qk(i))) {
                return true;
            }
        }
        return false;
    }

    public final void cr(int i) {
        int iMin;
        int length = bk().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        pq(iMin);
    }

    public final int ct(int i) {
        return bk()[i];
    }

    public final void cy(int i, V v6) {
        pz()[i] = v6;
    }

    public int d() {
        xc.mt(g(), "Arrays already allocated");
        int i = this.f5995f;
        int iI9 = t.i9(i);
        this.y = t.y(iI9);
        wf(iI9 - 1);
        this.f6000v = new int[i];
        this.f5996fb = new Object[i];
        this.f5998s = new Object[i];
        return i;
    }

    public final int e() {
        return (1 << (this.f5995f & 31)) - 1;
    }

    public int eb() {
        return isEmpty() ? -1 : 0;
    }

    public Map<K, V> ej() {
        Map<K, V> mapOz = oz(e() + 1);
        int iEb = eb();
        while (iEb >= 0) {
            mapOz.put(rb(iEb), qk(iEb));
            iEb = lc(iEb);
        }
        this.y = mapOz;
        this.f6000v = null;
        this.f5996fb = null;
        this.f5998s = null;
        ap();
        return mapOz;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f5997p;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setJ = j();
        this.f5997p = setJ;
        return setJ;
    }

    public Collection<V> f7() {
        return new s();
    }

    public boolean g() {
        return this.y == null;
    }

    public Iterator<K> g3() {
        Map<K, V> mapU = u();
        return mapU != null ? mapU.keySet().iterator() : new y();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapU = u();
        if (mapU != null) {
            return mapU.get(obj);
        }
        int iYg = yg(obj);
        if (iYg == -1) {
            return null;
        }
        mg(iYg);
        return qk(iYg);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<Map.Entry<K, V>> j() {
        return new gv();
    }

    public Set<K> k() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.w;
        if (set != null) {
            return set;
        }
        Set<K> setK = k();
        this.w = setK;
        return setK;
    }

    public void kp(int i, K k3, V v6, int i5, int i8) {
        xb(i, t.gv(i5, 0, i8));
        ad(i, k3);
        cy(i, v6);
    }

    public int lc(int i) {
        int i5 = i + 1;
        if (i5 < this.f5999t) {
            return i5;
        }
        return -1;
    }

    public void m(int i, int i5) {
        Object objTg = tg();
        int[] iArrBk = bk();
        Object[] objArrY4 = y4();
        Object[] objArrPz = pz();
        int size = size();
        int i8 = size - 1;
        if (i >= i8) {
            objArrY4[i] = null;
            objArrPz[i] = null;
            iArrBk[i] = 0;
            return;
        }
        Object obj = objArrY4[i8];
        objArrY4[i] = obj;
        objArrPz[i] = objArrPz[i8];
        objArrY4[i8] = null;
        objArrPz[i8] = null;
        iArrBk[i] = iArrBk[i8];
        iArrBk[i8] = 0;
        int iZn = mt.zn(obj) & i5;
        int iS = t.s(objTg, iZn);
        if (iS == size) {
            t.c5(objTg, iZn, i + 1);
            return;
        }
        while (true) {
            int i10 = iS - 1;
            int i11 = iArrBk[i10];
            int iZn2 = t.zn(i11, i5);
            if (iZn2 == size) {
                iArrBk[i10] = t.gv(i11, i + 1, i5);
                return;
            }
            iS = iZn2;
        }
    }

    public final int o0(int i, int i5, int i8, int i10) {
        Object objY = t.y(i5);
        int i11 = i5 - 1;
        if (i10 != 0) {
            t.c5(objY, i8 & i11, i10 + 1);
        }
        Object objTg = tg();
        int[] iArrBk = bk();
        for (int i12 = 0; i12 <= i; i12++) {
            int iS = t.s(objTg, i12);
            while (iS != 0) {
                int i13 = iS - 1;
                int i14 = iArrBk[i13];
                int iN3 = t.n3(i14, i) | i12;
                int i15 = iN3 & i11;
                int iS2 = t.s(objY, i15);
                t.c5(objY, i15, iS);
                iArrBk[i13] = t.gv(iN3, iS2, i11);
                iS = t.zn(i14, i);
            }
        }
        this.y = objY;
        wf(i11);
        return i11;
    }

    public Map<K, V> oz(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public void pq(int i) {
        this.f6000v = Arrays.copyOf(bk(), i);
        this.f5996fb = Arrays.copyOf(y4(), i);
        this.f5998s = Arrays.copyOf(pz(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k3, V v6) {
        int iO0;
        int i;
        if (g()) {
            d();
        }
        Map<K, V> mapU = u();
        if (mapU != null) {
            return mapU.put(k3, v6);
        }
        int[] iArrBk = bk();
        Object[] objArrY4 = y4();
        Object[] objArrPz = pz();
        int i5 = this.f5999t;
        int i8 = i5 + 1;
        int iZn = mt.zn(k3);
        int iE = e();
        int i10 = iZn & iE;
        int iS = t.s(tg(), i10);
        if (iS != 0) {
            int iN3 = t.n3(iZn, iE);
            int i11 = 0;
            while (true) {
                int i12 = iS - 1;
                int i13 = iArrBk[i12];
                if (t.n3(i13, iE) == iN3 && g4.f.y(k3, objArrY4[i12])) {
                    V v7 = (V) objArrPz[i12];
                    objArrPz[i12] = v6;
                    mg(i12);
                    return v7;
                }
                int iZn2 = t.zn(i13, iE);
                i11++;
                if (iZn2 != 0) {
                    iS = iZn2;
                } else {
                    if (i11 >= 9) {
                        return ej().put(k3, v6);
                    }
                    if (i8 > iE) {
                        iO0 = o0(iE, t.v(iE), iZn, i5);
                    } else {
                        iArrBk[i12] = t.gv(i13, i8, iE);
                    }
                }
            }
            i = iE;
        } else if (i8 > iE) {
            iO0 = o0(iE, t.v(iE), iZn, i5);
            i = iO0;
        } else {
            t.c5(tg(), i10, i8);
            i = iE;
        }
        cr(i8);
        kp(i5, k3, v6, iZn, i);
        this.f5999t = i8;
        ap();
        return null;
    }

    public final Object[] pz() {
        Object[] objArr = this.f5998s;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Iterator<V> qj() {
        Map<K, V> mapU = u();
        return mapU != null ? mapU.values().iterator() : new zn();
    }

    public final V qk(int i) {
        return (V) pz()[i];
    }

    public final K rb(int i) {
        return (K) y4()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapU = u();
        if (mapU != null) {
            return mapU.remove(obj);
        }
        V v6 = (V) u0(obj);
        if (v6 == z) {
            return null;
        }
        return v6;
    }

    public Iterator<Map.Entry<K, V>> rs() {
        Map<K, V> mapU = u();
        return mapU != null ? mapU.entrySet().iterator() : new n3();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapU = u();
        return mapU != null ? mapU.size() : this.f5999t;
    }

    public int ta(int i, int i5) {
        return i - 1;
    }

    public final Object tg() {
        Object obj = this.y;
        Objects.requireNonNull(obj);
        return obj;
    }

    public Map<K, V> u() {
        Object obj = this.y;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final Object u0(Object obj) {
        if (g()) {
            return z;
        }
        int iE = e();
        int iA = t.a(obj, null, iE, tg(), bk(), y4(), null);
        if (iA == -1) {
            return z;
        }
        V vQk = qk(iA);
        m(iA, iE);
        this.f5999t--;
        ap();
        return vQk;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f5994co;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionF7 = f7();
        this.f5994co = collectionF7;
        return collectionF7;
    }

    public final void wf(int i) {
        this.f5995f = t.gv(this.f5995f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public final void xb(int i, int i5) {
        bk()[i] = i5;
    }

    public final Object[] y4() {
        Object[] objArr = this.f5996fb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void yc(int i) {
        xc.v(i >= 0, "Expected size must be >= 0");
        this.f5995f = n4.a.a(i, 1, 1073741823);
    }

    public final int yg(Object obj) {
        if (g()) {
            return -1;
        }
        int iZn = mt.zn(obj);
        int iE = e();
        int iS = t.s(tg(), iZn & iE);
        if (iS == 0) {
            return -1;
        }
        int iN3 = t.n3(iZn, iE);
        do {
            int i = iS - 1;
            int iCt = ct(i);
            if (t.n3(iCt, iE) == iN3 && g4.f.y(obj, rb(i))) {
                return i;
            }
            iS = t.zn(iCt, iE);
        } while (iS != 0);
        return -1;
    }

    public f(int i) {
        yc(i);
    }

    public abstract class v<T> implements Iterator<T> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f6002fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6004v;
        public int y;

        public v() {
            this.y = f.this.f5995f;
            this.f6004v = f.this.eb();
            this.f6002fb = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6004v >= 0;
        }

        public abstract T n3(int i);

        @Override // java.util.Iterator
        public T next() {
            y();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f6004v;
            this.f6002fb = i;
            T tN3 = n3(i);
            this.f6004v = f.this.lc(this.f6004v);
            return tN3;
        }

        @Override // java.util.Iterator
        public void remove() {
            y();
            c5.zn(this.f6002fb >= 0);
            zn();
            f fVar = f.this;
            fVar.remove(fVar.rb(this.f6002fb));
            this.f6004v = f.this.ta(this.f6004v, this.f6002fb);
            this.f6002fb = -1;
        }

        public final void y() {
            if (f.this.f5995f != this.y) {
                throw new ConcurrentModificationException();
            }
        }

        public void zn() {
            this.y += 32;
        }

        public /* synthetic */ v(f fVar, y yVar) {
            this();
        }
    }

    public void mg(int i) {
    }
}
