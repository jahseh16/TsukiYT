package x4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f9094f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static Object[] f9095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static Object[] f9096t;
    public static int w;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f9097fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object[] f9098v;
    public int[] y;

    public s() {
        this.y = gv.y;
        this.f9098v = gv.zn;
        this.f9097fb = 0;
    }

    public static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (s.class) {
                try {
                    if (w < 10) {
                        objArr[0] = f9096t;
                        objArr[1] = iArr;
                        for (int i5 = (i << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f9096t = objArr;
                        w++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (s.class) {
                try {
                    if (f9094f < 10) {
                        objArr[0] = f9095s;
                        objArr[1] = iArr;
                        for (int i8 = (i << 1) - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f9095s = objArr;
                        f9094f++;
                    }
                } finally {
                }
            }
        }
    }

    public static int zn(int[] iArr, int i, int i5) {
        try {
            return gv.y(iArr, i, i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int c5() {
        int i = this.f9097fb;
        if (i == 0) {
            return -1;
        }
        int iZn = zn(this.y, i, 0);
        if (iZn < 0 || this.f9098v[iZn << 1] == null) {
            return iZn;
        }
        int i5 = iZn + 1;
        while (i5 < i && this.y[i5] == 0) {
            if (this.f9098v[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i8 = iZn - 1; i8 >= 0 && this.y[i8] == 0; i8--) {
            if (this.f9098v[i8 << 1] == null) {
                return i8;
            }
        }
        return ~i5;
    }

    public void clear() {
        int i = this.f9097fb;
        if (i > 0) {
            int[] iArr = this.y;
            Object[] objArr = this.f9098v;
            this.y = gv.y;
            this.f9098v = gv.zn;
            this.f9097fb = 0;
            a(iArr, objArr, i);
        }
        if (this.f9097fb > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@Nullable Object obj) {
        return s(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i9(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (size() != sVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f9097fb; i++) {
                try {
                    K kF = f(i);
                    V vXc = xc(i);
                    Object obj2 = sVar.get(kF);
                    if (vXc == null) {
                        if (obj2 != null || !sVar.containsKey(kF)) {
                            return false;
                        }
                    } else if (!vXc.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f9097fb; i5++) {
                try {
                    K kF2 = f(i5);
                    V vXc2 = xc(i5);
                    Object obj3 = map.get(kF2);
                    if (vXc2 == null) {
                        if (obj3 != null || !map.containsKey(kF2)) {
                            return false;
                        }
                    } else if (!vXc2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public K f(int i) {
        return (K) this.f9098v[i << 1];
    }

    public int fb(Object obj, int i) {
        int i5 = this.f9097fb;
        if (i5 == 0) {
            return -1;
        }
        int iZn = zn(this.y, i5, i);
        if (iZn < 0 || obj.equals(this.f9098v[iZn << 1])) {
            return iZn;
        }
        int i8 = iZn + 1;
        while (i8 < i5 && this.y[i8] == i) {
            if (obj.equals(this.f9098v[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i10 = iZn - 1; i10 >= 0 && this.y[i10] == i; i10--) {
            if (obj.equals(this.f9098v[i10 << 1])) {
                return i10;
            }
        }
        return ~i8;
    }

    @Nullable
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v6) {
        int iS = s(obj);
        return iS >= 0 ? (V) this.f9098v[(iS << 1) + 1] : v6;
    }

    public int hashCode() {
        int[] iArr = this.y;
        Object[] objArr = this.f9098v;
        int i = this.f9097fb;
        int i5 = 1;
        int i8 = 0;
        int iHashCode = 0;
        while (i8 < i) {
            Object obj = objArr[i5];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i8];
            i8++;
            i5 += 2;
        }
        return iHashCode;
    }

    public int i9(Object obj) {
        int i = this.f9097fb * 2;
        Object[] objArr = this.f9098v;
        if (obj == null) {
            for (int i5 = 1; i5 < i; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i; i8 += 2) {
            if (obj.equals(objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f9097fb <= 0;
    }

    @Nullable
    public V put(K k3, V v6) {
        int i;
        int iFb;
        int i5 = this.f9097fb;
        if (k3 == null) {
            iFb = c5();
            i = 0;
        } else {
            int iHashCode = k3.hashCode();
            i = iHashCode;
            iFb = fb(k3, iHashCode);
        }
        if (iFb >= 0) {
            int i8 = (iFb << 1) + 1;
            Object[] objArr = this.f9098v;
            V v7 = (V) objArr[i8];
            objArr[i8] = v6;
            return v7;
        }
        int i10 = ~iFb;
        int[] iArr = this.y;
        if (i5 >= iArr.length) {
            int i11 = 8;
            if (i5 >= 8) {
                i11 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f9098v;
            y(i11);
            if (i5 != this.f9097fb) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.y;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f9098v, 0, objArr2.length);
            }
            a(iArr, objArr2, i5);
        }
        if (i10 < i5) {
            int[] iArr3 = this.y;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i5 - i10);
            Object[] objArr3 = this.f9098v;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f9097fb - i10) << 1);
        }
        int i13 = this.f9097fb;
        if (i5 == i13) {
            int[] iArr4 = this.y;
            if (i10 < iArr4.length) {
                iArr4[i10] = i;
                Object[] objArr4 = this.f9098v;
                int i14 = i10 << 1;
                objArr4[i14] = k3;
                objArr4[i14 + 1] = v6;
                this.f9097fb = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public V putIfAbsent(K k3, V v6) {
        V v7 = get(k3);
        return v7 == null ? put(k3, v6) : v7;
    }

    @Nullable
    public V remove(Object obj) {
        int iS = s(obj);
        if (iS >= 0) {
            return tl(iS);
        }
        return null;
    }

    @Nullable
    public V replace(K k3, V v6) {
        int iS = s(k3);
        if (iS >= 0) {
            return wz(iS, v6);
        }
        return null;
    }

    public int s(@Nullable Object obj) {
        return obj == null ? c5() : fb(obj, obj.hashCode());
    }

    public int size() {
        return this.f9097fb;
    }

    public void t(@NonNull s<? extends K, ? extends V> sVar) {
        int i = sVar.f9097fb;
        v(this.f9097fb + i);
        if (this.f9097fb != 0) {
            for (int i5 = 0; i5 < i; i5++) {
                put(sVar.f(i5), sVar.xc(i5));
            }
        } else if (i > 0) {
            System.arraycopy(sVar.y, 0, this.y, 0, i);
            System.arraycopy(sVar.f9098v, 0, this.f9098v, 0, i << 1);
            this.f9097fb = i;
        }
    }

    public V tl(int i) {
        Object[] objArr = this.f9098v;
        int i5 = i << 1;
        V v6 = (V) objArr[i5 + 1];
        int i8 = this.f9097fb;
        int i10 = 0;
        if (i8 <= 1) {
            a(this.y, objArr, i8);
            this.y = gv.y;
            this.f9098v = gv.zn;
        } else {
            int i11 = i8 - 1;
            int[] iArr = this.y;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i < i11) {
                    int i12 = i + 1;
                    int i13 = i11 - i;
                    System.arraycopy(iArr, i12, iArr, i, i13);
                    Object[] objArr2 = this.f9098v;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i5, i13 << 1);
                }
                Object[] objArr3 = this.f9098v;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                y(i8 > 8 ? i8 + (i8 >> 1) : 8);
                if (i8 != this.f9097fb) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.y, 0, i);
                    System.arraycopy(objArr, 0, this.f9098v, 0, i5);
                }
                if (i < i11) {
                    int i15 = i + 1;
                    int i16 = i11 - i;
                    System.arraycopy(iArr, i15, this.y, i, i16);
                    System.arraycopy(objArr, i15 << 1, this.f9098v, i5, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i8 != this.f9097fb) {
            throw new ConcurrentModificationException();
        }
        this.f9097fb = i10;
        return v6;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9097fb * 28);
        sb.append('{');
        for (int i = 0; i < this.f9097fb; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kF = f(i);
            if (kF != this) {
                sb.append(kF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vXc = xc(i);
            if (vXc != this) {
                sb.append(vXc);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void v(int i) {
        int i5 = this.f9097fb;
        int[] iArr = this.y;
        if (iArr.length < i) {
            Object[] objArr = this.f9098v;
            y(i);
            if (this.f9097fb > 0) {
                System.arraycopy(iArr, 0, this.y, 0, i5);
                System.arraycopy(objArr, 0, this.f9098v, 0, i5 << 1);
            }
            a(iArr, objArr, i5);
        }
        if (this.f9097fb != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public V wz(int i, V v6) {
        int i5 = (i << 1) + 1;
        Object[] objArr = this.f9098v;
        V v7 = (V) objArr[i5];
        objArr[i5] = v6;
        return v7;
    }

    public V xc(int i) {
        return (V) this.f9098v[(i << 1) + 1];
    }

    public final void y(int i) {
        if (i == 8) {
            synchronized (s.class) {
                try {
                    Object[] objArr = f9096t;
                    if (objArr != null) {
                        this.f9098v = objArr;
                        f9096t = (Object[]) objArr[0];
                        this.y = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        w--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (s.class) {
                try {
                    Object[] objArr2 = f9095s;
                    if (objArr2 != null) {
                        this.f9098v = objArr2;
                        f9095s = (Object[]) objArr2[0];
                        this.y = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f9094f--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.y = new int[i];
        this.f9098v = new Object[i << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iS = s(obj);
        if (iS < 0) {
            return false;
        }
        V vXc = xc(iS);
        if (obj2 != vXc && (obj2 == null || !obj2.equals(vXc))) {
            return false;
        }
        tl(iS);
        return true;
    }

    public boolean replace(K k3, V v6, V v7) {
        int iS = s(k3);
        if (iS < 0) {
            return false;
        }
        V vXc = xc(iS);
        if (vXc != v6 && (v6 == null || !v6.equals(vXc))) {
            return false;
        }
        wz(iS, v7);
        return true;
    }

    public s(int i) {
        if (i == 0) {
            this.y = gv.y;
            this.f9098v = gv.zn;
        } else {
            y(i);
        }
        this.f9097fb = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(s<K, V> sVar) {
        this();
        if (sVar != 0) {
            t(sVar);
        }
    }
}
