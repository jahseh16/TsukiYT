package k4;

import com.google.protobuf.Reader;
import g4.xc;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import k4.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class co<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] y = new Object[0];

    public static abstract class n3<E> {
        public static int zn(int i, int i5) {
            if (i5 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i5) {
                iHighestOneBit = Integer.highestOneBit(i5 - 1) << 1;
            }
            return iHighestOneBit < 0 ? Reader.READ_DONE : iHighestOneBit;
        }

        public n3<E> n3(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                y(it.next());
            }
            return this;
        }

        public abstract n3<E> y(E e4);
    }

    public static abstract class y<E> extends n3<E> {
        public int n3;
        public Object[] y;
        public boolean zn;

        public y(int i) {
            c5.n3(i, "initialCapacity");
            this.y = new Object[i];
            this.n3 = 0;
        }

        public final void a(Object[] objArr, int i) {
            b.zn(objArr, i);
            fb(this.n3 + i);
            System.arraycopy(objArr, 0, this.y, this.n3, i);
            this.n3 += i;
        }

        public final void fb(int i) {
            Object[] objArr = this.y;
            if (objArr.length < i) {
                this.y = Arrays.copyOf(objArr, n3.zn(objArr.length, i));
                this.zn = false;
            } else if (this.zn) {
                this.y = (Object[]) objArr.clone();
                this.zn = false;
            }
        }

        public y<E> gv(E e4) {
            xc.t(e4);
            fb(this.n3 + 1);
            Object[] objArr = this.y;
            int i = this.n3;
            this.n3 = i + 1;
            objArr[i] = e4;
            return this;
        }

        @Override // k4.co.n3
        public n3<E> n3(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                fb(this.n3 + collection.size());
                if (collection instanceof co) {
                    this.n3 = ((co) collection).n3(this.y, this.n3);
                    return this;
                }
            }
            super.n3(iterable);
            return this;
        }

        public n3<E> v(E... eArr) {
            a(eArr, eArr.length);
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: co */
    public abstract k<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public Object[] gv() {
        return null;
    }

    public int n3(Object[] objArr, int i) {
        k<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public abstract boolean p();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public int t() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(y);
    }

    public int w() {
        throw new UnsupportedOperationException();
    }

    public Object writeReplace() {
        return new r.zn(toArray());
    }

    public r<E> y() {
        return isEmpty() ? r.yt() : r.z(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        xc.t(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrGv = gv();
            if (objArrGv != null) {
                return (T[]) yt.y(objArrGv, w(), t(), tArr);
            }
            tArr = (T[]) b.gv(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        n3(tArr, 0);
        return tArr;
    }
}
