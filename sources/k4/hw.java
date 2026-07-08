package k4;

import g4.xc;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hw<K, V> extends i4<K, V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i4<Object, Object> f6025p = new hw(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object f6026f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient Object[] f6027t;
    public final transient int w;

    public static final class n3<K> extends n<K> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final transient i4<K, ?> f6028fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final transient r<K> f6029s;

        public n3(i4<K, ?> i4Var, r<K> rVar) {
            this.f6028fb = i4Var;
            this.f6029s = rVar;
        }

        @Override // k4.n, k4.co, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: co */
        public k<K> iterator() {
            return y().iterator();
        }

        @Override // k4.co, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f6028fb.get(obj) != null;
        }

        @Override // k4.co
        public int n3(Object[] objArr, int i) {
            return y().n3(objArr, i);
        }

        @Override // k4.co
        public boolean p() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6028fb.size();
        }

        @Override // k4.n, k4.co
        public r<K> y() {
            return this.f6029s;
        }
    }

    public static class y<K, V> extends n<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f6030f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final transient i4<K, V> f6031fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final transient Object[] f6032s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final transient int f6033t;

        /* JADX INFO: renamed from: k4.hw$y$y, reason: collision with other inner class name */
        public class C0114y extends r<Map.Entry<K, V>> {
            public C0114y() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i) {
                xc.i9(i, y.this.f6033t);
                int i5 = i * 2;
                Object obj = y.this.f6032s[y.this.f6030f + i5];
                Objects.requireNonNull(obj);
                Object obj2 = y.this.f6032s[i5 + (y.this.f6030f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // k4.co
            public boolean p() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return y.this.f6033t;
            }
        }

        public y(i4<K, V> i4Var, Object[] objArr, int i, int i5) {
            this.f6031fb = i4Var;
            this.f6032s = objArr;
            this.f6030f = i;
            this.f6033t = i5;
        }

        @Override // k4.n, k4.co, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: co */
        public k<Map.Entry<K, V>> iterator() {
            return y().iterator();
        }

        @Override // k4.co, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f6031fb.get(key));
        }

        @Override // k4.co
        public int n3(Object[] objArr, int i) {
            return y().n3(objArr, i);
        }

        @Override // k4.co
        public boolean p() {
            return true;
        }

        @Override // k4.n
        public r<Map.Entry<K, V>> rz() {
            return new C0114y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6033t;
        }
    }

    public static final class zn extends r<Object> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f6034f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final transient Object[] f6035fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final transient int f6036s;

        public zn(Object[] objArr, int i, int i5) {
            this.f6035fb = objArr;
            this.f6036s = i;
            this.f6034f = i5;
        }

        @Override // java.util.List
        public Object get(int i) {
            xc.i9(i, this.f6034f);
            Object obj = this.f6035fb[(i * 2) + this.f6036s];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // k4.co
        public boolean p() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6034f;
        }
    }

    public hw(Object obj, Object[] objArr, int i) {
        this.f6026f = obj;
        this.f6027t = objArr;
        this.w = i;
    }

    public static IllegalArgumentException b(Object obj, Object obj2, Object[] objArr, int i) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i]);
        String strValueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    public static <K, V> hw<K, V> d(int i, Object[] objArr) {
        if (i == 0) {
            return (hw) f6025p;
        }
        if (i != 1) {
            xc.wz(i, objArr.length >> 1);
            return new hw<>(ej(objArr, i, n.z(i), 0), objArr, i);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        c5.y(obj, obj2);
        return new hw<>(null, objArr, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object ej(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.hw.ej(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static Object yt(Object obj, Object[] objArr, int i, int i5, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i5];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i5 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iN3 = mt.n3(obj2.hashCode());
            while (true) {
                int i8 = iN3 & length;
                int i10 = bArr[i8] & 255;
                if (i10 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                iN3 = i8 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iN32 = mt.n3(obj2.hashCode());
            while (true) {
                int i11 = iN32 & length2;
                int i12 = sArr[i11] & 65535;
                if (i12 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                iN32 = i11 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iN33 = mt.n3(obj2.hashCode());
            while (true) {
                int i13 = iN33 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iN33 = i13 + 1;
            }
        }
    }

    @Override // k4.i4, java.util.Map
    public V get(Object obj) {
        V v6 = (V) yt(this.f6026f, this.f6027t, this.w, 0, obj);
        if (v6 == null) {
            return null;
        }
        return v6;
    }

    @Override // k4.i4
    public co<V> p() {
        return new zn(this.f6027t, 1, this.w);
    }

    @Override // java.util.Map
    public int size() {
        return this.w;
    }

    @Override // k4.i4
    public n<Map.Entry<K, V>> t() {
        return new y(this, this.f6027t, 0, this.w);
    }

    @Override // k4.i4
    public n<K> w() {
        return new n3(this, new zn(this.f6027t, 0, this.w));
    }

    @Override // k4.i4
    public boolean z() {
        return false;
    }
}
