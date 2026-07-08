package k4;

import g4.xc;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class n<E> extends co<E> implements Set<E> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient r<E> f6048v;

    public static class y implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public y(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return n.c(this.elements);
        }
    }

    public static <E> n<E> b(E e4, E e5) {
        return r(2, e4, e5);
    }

    public static <E> n<E> c(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? r(eArr.length, (Object[]) eArr.clone()) : d(eArr[0]) : ta();
    }

    public static <E> n<E> d(E e4) {
        return new ut(e4);
    }

    public static <E> n<E> j(E e4, E e5, E e6, E e8, E e9) {
        return r(5, e4, e5, e6, e8, e9);
    }

    public static boolean k(int i, int i5) {
        return i < (i5 >> 1) + (i5 >> 2);
    }

    public static <E> n<E> n(Collection<? extends E> collection) {
        if ((collection instanceof n) && !(collection instanceof SortedSet)) {
            n<E> nVar = (n) collection;
            if (!nVar.p()) {
                return nVar;
            }
        }
        Object[] array = collection.toArray();
        return r(array.length, array);
    }

    @SafeVarargs
    public static <E> n<E> oz(E e4, E e5, E e6, E e8, E e9, E e10, E... eArr) {
        xc.v(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e4;
        objArr[1] = e5;
        objArr[2] = e6;
        objArr[3] = e8;
        objArr[4] = e9;
        objArr[5] = e10;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return r(length, objArr);
    }

    public static <E> n<E> r(int i, Object... objArr) {
        if (i == 0) {
            return ta();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return d(obj);
        }
        int iZ = z(i);
        Object[] objArr2 = new Object[iZ];
        int i5 = iZ - 1;
        int i8 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            Object objY = b.y(objArr[i11], i11);
            int iHashCode = objY.hashCode();
            int iN3 = mt.n3(iHashCode);
            while (true) {
                int i12 = iN3 & i5;
                Object obj2 = objArr2[i12];
                if (obj2 == null) {
                    objArr[i10] = objY;
                    objArr2[i12] = objY;
                    i8 += iHashCode;
                    i10++;
                    break;
                }
                if (obj2.equals(objY)) {
                    break;
                }
                iN3++;
            }
        }
        Arrays.fill(objArr, i10, i, (Object) null);
        if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new ut(obj3);
        }
        if (z(i10) < iZ / 2) {
            return r(i10, objArr);
        }
        if (k(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new j5(objArr, i8, objArr2, i5, i10);
    }

    public static <E> n<E> ta() {
        return j5.f6042co;
    }

    public static <E> n<E> yt(E e4, E e5, E e6) {
        return r(3, e4, e5, e6);
    }

    public static int z(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            xc.v(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    @Override // k4.co, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: co */
    public abstract k<E> iterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n) && mg() && ((n) obj).mg() && hashCode() != obj.hashCode()) {
            return false;
        }
        return oz.y(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return oz.gv(this);
    }

    public boolean mg() {
        return false;
    }

    public r<E> rz() {
        return r.z(toArray());
    }

    @Override // k4.co
    public Object writeReplace() {
        return new y(toArray());
    }

    @Override // k4.co
    public r<E> y() {
        r<E> rVar = this.f6048v;
        if (rVar != null) {
            return rVar;
        }
        r<E> rVarRz = rz();
        this.f6048v = rVarRz;
        return rVarRz;
    }
}
