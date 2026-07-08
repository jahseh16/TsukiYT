package x4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n3<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public static Object[] f9086co;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f9088p;

    @Nullable
    public static Object[] w;
    public static int z;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f9090fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public fb<E, E> f9091s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object[] f9092v;
    public int[] y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f9087f = new int[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f9089t = new Object[0];

    public class y extends fb<E, E> {
        public y() {
        }

        @Override // x4.fb
        public int a(Object obj) {
            return n3.this.indexOf(obj);
        }

        @Override // x4.fb
        public E c5(int i, E e4) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // x4.fb
        public void fb(E e4, E e5) {
            n3.this.add(e4);
        }

        @Override // x4.fb
        public int gv() {
            return n3.this.f9090fb;
        }

        @Override // x4.fb
        public Object n3(int i, int i5) {
            return n3.this.f9092v[i];
        }

        @Override // x4.fb
        public void s(int i) {
            n3.this.s(i);
        }

        @Override // x4.fb
        public int v(Object obj) {
            return n3.this.indexOf(obj);
        }

        @Override // x4.fb
        public void y() {
            n3.this.clear();
        }

        @Override // x4.fb
        public Map<E, E> zn() {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public n3() {
        this(0);
    }

    public static void zn(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (n3.class) {
                try {
                    if (z < 10) {
                        objArr[0] = f9086co;
                        objArr[1] = iArr;
                        for (int i5 = i - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f9086co = objArr;
                        z++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (n3.class) {
                try {
                    if (f9088p < 10) {
                        objArr[0] = w;
                        objArr[1] = iArr;
                        for (int i8 = i - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        w = objArr;
                        f9088p++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E e4) {
        int i;
        int iV;
        if (e4 == null) {
            iV = fb();
            i = 0;
        } else {
            int iHashCode = e4.hashCode();
            i = iHashCode;
            iV = v(e4, iHashCode);
        }
        if (iV >= 0) {
            return false;
        }
        int i5 = ~iV;
        int i8 = this.f9090fb;
        int[] iArr = this.y;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f9092v;
            y(i10);
            int[] iArr2 = this.y;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9092v, 0, objArr.length);
            }
            zn(iArr, objArr, this.f9090fb);
        }
        int i11 = this.f9090fb;
        if (i5 < i11) {
            int[] iArr3 = this.y;
            int i12 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i12, i11 - i5);
            Object[] objArr2 = this.f9092v;
            System.arraycopy(objArr2, i5, objArr2, i12, this.f9090fb - i5);
        }
        this.y[i5] = i;
        this.f9092v[i5] = e4;
        this.f9090fb++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        n3(this.f9090fb + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Nullable
    public E c5(int i) {
        return (E) this.f9092v[i];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f9090fb;
        if (i != 0) {
            zn(this.y, this.f9092v, i);
            this.y = f9087f;
            this.f9092v = f9089t;
            this.f9090fb = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@Nullable Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f9090fb; i++) {
                try {
                    if (!set.contains(c5(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int fb() {
        int i = this.f9090fb;
        if (i == 0) {
            return -1;
        }
        int iY = gv.y(this.y, i, 0);
        if (iY < 0 || this.f9092v[iY] == null) {
            return iY;
        }
        int i5 = iY + 1;
        while (i5 < i && this.y[i5] == 0) {
            if (this.f9092v[i5] == null) {
                return i5;
            }
            i5++;
        }
        for (int i8 = iY - 1; i8 >= 0 && this.y[i8] == 0; i8--) {
            if (this.f9092v[i8] == null) {
                return i8;
            }
        }
        return ~i5;
    }

    public final fb<E, E> gv() {
        if (this.f9091s == null) {
            this.f9091s = new y();
        }
        return this.f9091s;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.y;
        int i = this.f9090fb;
        int i5 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            i5 += iArr[i8];
        }
        return i5;
    }

    public int indexOf(@Nullable Object obj) {
        return obj == null ? fb() : v(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9090fb <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return gv().tl().iterator();
    }

    public void n3(int i) {
        int[] iArr = this.y;
        if (iArr.length < i) {
            Object[] objArr = this.f9092v;
            y(i);
            int i5 = this.f9090fb;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.y, 0, i5);
                System.arraycopy(objArr, 0, this.f9092v, 0, this.f9090fb);
            }
            zn(iArr, objArr, this.f9090fb);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@Nullable Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        s(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z5 = false;
        for (int i = this.f9090fb - 1; i >= 0; i--) {
            if (!collection.contains(this.f9092v[i])) {
                s(i);
                z5 = true;
            }
        }
        return z5;
    }

    public E s(int i) {
        Object[] objArr = this.f9092v;
        E e4 = (E) objArr[i];
        int i5 = this.f9090fb;
        if (i5 <= 1) {
            zn(this.y, objArr, i5);
            this.y = f9087f;
            this.f9092v = f9089t;
            this.f9090fb = 0;
        } else {
            int[] iArr = this.y;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                int i8 = i5 - 1;
                this.f9090fb = i8;
                if (i < i8) {
                    int i10 = i + 1;
                    System.arraycopy(iArr, i10, iArr, i, i8 - i);
                    Object[] objArr2 = this.f9092v;
                    System.arraycopy(objArr2, i10, objArr2, i, this.f9090fb - i);
                }
                this.f9092v[this.f9090fb] = null;
            } else {
                y(i5 > 8 ? i5 + (i5 >> 1) : 8);
                this.f9090fb--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.y, 0, i);
                    System.arraycopy(objArr, 0, this.f9092v, 0, i);
                }
                int i11 = this.f9090fb;
                if (i < i11) {
                    int i12 = i + 1;
                    System.arraycopy(iArr, i12, this.y, i, i11 - i);
                    System.arraycopy(objArr, i12, this.f9092v, i, this.f9090fb - i);
                }
            }
        }
        return e4;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f9090fb;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i = this.f9090fb;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f9092v, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9090fb * 14);
        sb.append('{');
        for (int i = 0; i < this.f9090fb; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eC5 = c5(i);
            if (eC5 != this) {
                sb.append(eC5);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int v(Object obj, int i) {
        int i5 = this.f9090fb;
        if (i5 == 0) {
            return -1;
        }
        int iY = gv.y(this.y, i5, i);
        if (iY < 0 || obj.equals(this.f9092v[iY])) {
            return iY;
        }
        int i8 = iY + 1;
        while (i8 < i5 && this.y[i8] == i) {
            if (obj.equals(this.f9092v[i8])) {
                return i8;
            }
            i8++;
        }
        for (int i10 = iY - 1; i10 >= 0 && this.y[i10] == i; i10--) {
            if (obj.equals(this.f9092v[i10])) {
                return i10;
            }
        }
        return ~i8;
    }

    public final void y(int i) {
        if (i == 8) {
            synchronized (n3.class) {
                try {
                    Object[] objArr = f9086co;
                    if (objArr != null) {
                        this.f9092v = objArr;
                        f9086co = (Object[]) objArr[0];
                        this.y = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        z--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (n3.class) {
                try {
                    Object[] objArr2 = w;
                    if (objArr2 != null) {
                        this.f9092v = objArr2;
                        w = (Object[]) objArr2[0];
                        this.y = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f9088p--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.y = new int[i];
        this.f9092v = new Object[i];
    }

    public n3(int i) {
        if (i == 0) {
            this.y = f9087f;
            this.f9092v = f9089t;
        } else {
            y(i);
        }
        this.f9090fb = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f9090fb) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f9090fb));
        }
        System.arraycopy(this.f9092v, 0, tArr, 0, this.f9090fb);
        int length = tArr.length;
        int i = this.f9090fb;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n3(@Nullable Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }
}
