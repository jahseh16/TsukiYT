package kotlin.collections;

import com.google.protobuf.Reader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int i, int i5, int i8) {
            if (i < 0 || i5 > i8) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i5 + ", size: " + i8);
            }
            if (i <= i5) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i5);
        }

        public final void checkElementIndex$kotlin_stdlib(int i, int i5) {
            if (i < 0 || i >= i5) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i5);
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int i, int i5) {
            if (i < 0 || i > i5) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i5);
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int i, int i5, int i8) {
            if (i < 0 || i5 > i8) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i5 + ", size: " + i8);
            }
            if (i <= i5) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i5);
        }

        public final int newCapacity$kotlin_stdlib(int i, int i5) {
            int i8 = i + (i >> 1);
            if (i8 - i5 < 0) {
                i8 = i5;
            }
            if (i8 - 2147483639 <= 0) {
                return i8;
            }
            if (i5 > 2147483639) {
                return Reader.READ_DONE;
            }
            return 2147483639;
        }

        public final boolean orderedEquals$kotlin_stdlib(Collection<?> c, Collection<?> other) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(Collection<?> c) {
            Intrinsics.checkNotNullParameter(c, "c");
            Iterator<?> it = c.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        private Companion() {
        }
    }

    public class IteratorImpl implements Iterator<E>, KMappedMarker {
        private int index;

        public IteratorImpl() {
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            int i = this.index;
            this.index = i + 1;
            return abstractList.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.index = i;
        }
    }

    public class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E>, KMappedMarker {
        public ListIteratorImpl(int i) {
            super();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, AbstractList.this.size());
            setIndex(i);
        }

        @Override // java.util.ListIterator
        public void add(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return getIndex() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return getIndex();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            setIndex(getIndex() - 1);
            return abstractList.get(getIndex());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return getIndex() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class SubList<E> extends AbstractList<E> implements RandomAccess {
        private int _size;
        private final int fromIndex;
        private final AbstractList<E> list;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(AbstractList<? extends E> list, int i, int i5) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.fromIndex = i;
            AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i5, list.size());
            this._size = i5 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i) {
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this._size);
            return this.list.get(this.fromIndex + i);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this._size;
        }
    }

    @Override // java.util.List
    public void add(int i, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.orderedEquals$kotlin_stdlib(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.orderedHashCode$kotlin_stdlib(this);
    }

    @Override // java.util.List
    public int indexOf(E e4) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), e4)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new IteratorImpl();
    }

    @Override // java.util.List
    public int lastIndexOf(E e4) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), e4)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new ListIteratorImpl(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i5) {
        return new SubList(this, i, i5);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new ListIteratorImpl(i);
    }
}
