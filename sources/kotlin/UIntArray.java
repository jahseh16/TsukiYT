package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class UIntArray implements Collection<UInt>, KMappedMarker {
    private final int[] storage;

    public static final class Iterator implements java.util.Iterator<UInt>, KMappedMarker {
        private final int[] array;
        private int index;

        public Iterator(int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UInt next() {
            return UInt.m62boximpl(m83nextpVg5ArA());
        }

        /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
        public int m83nextpVg5ArA() {
            int i = this.index;
            int[] iArr = this.array;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UInt.m63constructorimpl(iArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UIntArray(int[] iArr) {
        this.storage = iArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UIntArray m68boximpl(int[] iArr) {
        return new UIntArray(iArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m70constructorimpl(int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m72containsAllimpl(int[] iArr, Collection<UInt> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<UInt> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UInt) || !ArraysKt.contains(iArr, ((UInt) obj).m67unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m73equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof UIntArray) && Intrinsics.areEqual(iArr, ((UIntArray) obj).m82unboximpl());
    }

    /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m74getpVg5ArA(int[] iArr, int i) {
        return UInt.m63constructorimpl(iArr[i]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m75getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m76hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m77isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<UInt> m78iteratorimpl(int[] iArr) {
        return new Iterator(iArr);
    }

    /* JADX INFO: renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m79setVXSXFK8(int[] iArr, int i, int i5) {
        iArr[i] = i5;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m80toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UInt uInt) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m81containsWZ4Q5Ns(((UInt) obj).m67unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m81containsWZ4Q5Ns(int i) {
        return m71containsWZ4Q5Ns(this.storage, i);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m72containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m73equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m75getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m76hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m77isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<UInt> iterator() {
        return m78iteratorimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return m80toStringimpl(this.storage);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m82unboximpl() {
        return this.storage;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m69constructorimpl(int i) {
        return m70constructorimpl(new int[i]);
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m71containsWZ4Q5Ns(int[] iArr, int i) {
        return ArraysKt.contains(iArr, i);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
