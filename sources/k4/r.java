package k4;

import g4.xc;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k4.co;

/* JADX INFO: loaded from: classes.dex */
public abstract class r<E> extends co<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f7<Object> f6052v = new n3(vl.f6060f, 0);

    public class gv extends r<E> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final transient int f6053fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final transient int f6054s;

        public gv(int i, int i5) {
            this.f6053fb = i;
            this.f6054s = i5;
        }

        @Override // k4.r, java.util.List
        /* JADX INFO: renamed from: eb, reason: merged with bridge method [inline-methods] */
        public r<E> subList(int i, int i5) {
            xc.w(i, i5, this.f6054s);
            r rVar = r.this;
            int i8 = this.f6053fb;
            return rVar.subList(i + i8, i5 + i8);
        }

        @Override // java.util.List
        public E get(int i) {
            xc.i9(i, this.f6054s);
            return r.this.get(i + this.f6053fb);
        }

        @Override // k4.co
        public Object[] gv() {
            return r.this.gv();
        }

        @Override // k4.r, k4.co, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // k4.r, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // k4.co
        public boolean p() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6054s;
        }

        @Override // k4.co
        public int t() {
            return r.this.w() + this.f6053fb + this.f6054s;
        }

        @Override // k4.co
        public int w() {
            return r.this.w() + this.f6053fb;
        }

        @Override // k4.r, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public static class n3<E> extends k4.y<E> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final r<E> f6055fb;

        public n3(r<E> rVar, int i) {
            super(rVar.size(), i);
            this.f6055fb = rVar;
        }

        @Override // k4.y
        public E y(int i) {
            return this.f6055fb.get(i);
        }
    }

    public static final class y<E> extends co.y<E> {
        public y() {
            this(4);
        }

        public y<E> c5(E... eArr) {
            super.v(eArr);
            return this;
        }

        public r<E> f() {
            this.zn = true;
            return r.r(this.y, this.n3);
        }

        public y<E> i9(Iterable<? extends E> iterable) {
            super.n3(iterable);
            return this;
        }

        @Override // k4.co.n3
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public y<E> y(E e4) {
            super.gv(e4);
            return this;
        }

        public y(int i) {
            super(i);
        }
    }

    public static class zn implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public zn(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return r.mg(this.elements);
        }
    }

    public static <E> r<E> c(Object... objArr) {
        return z(b.n3(objArr));
    }

    @SafeVarargs
    public static <E> r<E> ct(E e4, E e5, E e6, E e8, E e9, E e10, E e11, E e12, E e13, E e14, E e15, E e16, E... eArr) {
        xc.v(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e4;
        objArr[1] = e5;
        objArr[2] = e6;
        objArr[3] = e8;
        objArr[4] = e9;
        objArr[5] = e10;
        objArr[6] = e11;
        objArr[7] = e12;
        objArr[8] = e13;
        objArr[9] = e14;
        objArr[10] = e15;
        objArr[11] = e16;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return c(objArr);
    }

    public static <E> r<E> j(E e4) {
        return c(e4);
    }

    public static <E> r<E> jz(E e4, E e5, E e6, E e8, E e9) {
        return c(e4, e5, e6, e8, e9);
    }

    public static <E> r<E> k(E e4, E e5, E e6) {
        return c(e4, e5, e6);
    }

    public static <E> r<E> mg(E[] eArr) {
        return eArr.length == 0 ? yt() : c((Object[]) eArr.clone());
    }

    public static <E> y<E> n() {
        return new y<>();
    }

    public static <E> r<E> oz(E e4, E e5) {
        return c(e4, e5);
    }

    public static <E> r<E> r(Object[] objArr, int i) {
        return i == 0 ? yt() : new vl(objArr, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> r<E> rs(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        xc.t(comparator);
        Object[] objArrI9 = c.i9(iterable);
        b.n3(objArrI9);
        Arrays.sort(objArrI9, comparator);
        return z(objArrI9);
    }

    public static <E> r<E> rz(Collection<? extends E> collection) {
        if (!(collection instanceof co)) {
            return c(collection.toArray());
        }
        r<E> rVarY = ((co) collection).y();
        return rVarY.p() ? z(rVarY.toArray()) : rVarY;
    }

    public static <E> r<E> u(E e4, E e5, E e6, E e8, E e9, E e10, E e11) {
        return c(e4, e5, e6, e8, e9, e10, e11);
    }

    public static <E> r<E> yt() {
        return (r<E>) vl.f6060f;
    }

    public static <E> r<E> z(Object[] objArr) {
        return r(objArr, objArr.length);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // k4.co, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public k<E> iterator() {
        return listIterator();
    }

    @Override // k4.co, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f7<E> listIterator(int i) {
        xc.wz(i, size());
        return isEmpty() ? (f7<E>) f6052v : new n3(this, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: eb */
    public r<E> subList(int i, int i5) {
        xc.w(i, i5, size());
        int i8 = i5 - i;
        return i8 == size() ? this : i8 == 0 ? yt() : lc(i, i5);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return rz.zn(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i = ~(~((i * 31) + get(i5).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return rz.gv(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return rz.a(this, obj);
    }

    public r<E> lc(int i, int i5) {
        return new gv(i, i5 - i);
    }

    @Override // k4.co
    public int n3(Object[] objArr, int i) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i + i5] = get(i5);
        }
        return i + size;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: ta, reason: merged with bridge method [inline-methods] */
    public f7<E> listIterator() {
        return listIterator(0);
    }

    @Override // k4.co
    public Object writeReplace() {
        return new zn(toArray());
    }

    @Override // k4.co
    @Deprecated
    public final r<E> y() {
        return this;
    }
}
