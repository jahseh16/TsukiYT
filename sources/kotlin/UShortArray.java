package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class UShortArray implements Collection<UShort>, KMappedMarker {
    private final short[] storage;

    public static final class Iterator implements java.util.Iterator<UShort>, KMappedMarker {
        private final short[] array;
        private int index;

        public Iterator(short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UShort next() {
            return UShort.m106boximpl(m127nextMh2AYeg());
        }

        /* JADX INFO: renamed from: next-Mh2AYeg, reason: not valid java name */
        public short m127nextMh2AYeg() {
            int i = this.index;
            short[] sArr = this.array;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UShort.m107constructorimpl(sArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UShortArray(short[] sArr) {
        this.storage = sArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShortArray m112boximpl(short[] sArr) {
        return new UShortArray(sArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short[] m114constructorimpl(short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m116containsAllimpl(short[] sArr, Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<UShort> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UShort) || !ArraysKt.contains(sArr, ((UShort) obj).m111unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m117equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.areEqual(sArr, ((UShortArray) obj).m126unboximpl());
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m118getMh2AYeg(short[] sArr, int i) {
        return UShort.m107constructorimpl(sArr[i]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m119getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m120hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m121isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<UShort> m122iteratorimpl(short[] sArr) {
        return new Iterator(sArr);
    }

    /* JADX INFO: renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m123set01HTLdE(short[] sArr, int i, short s3) {
        sArr[i] = s3;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m124toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UShort uShort) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m125containsxj2QHRw(((UShort) obj).m111unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m125containsxj2QHRw(short s3) {
        return m115containsxj2QHRw(this.storage, s3);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m116containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m117equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m119getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m120hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m121isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<UShort> iterator() {
        return m122iteratorimpl(this.storage);
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
        return m124toStringimpl(this.storage);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short[] m126unboximpl() {
        return this.storage;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short[] m113constructorimpl(int i) {
        return m114constructorimpl(new short[i]);
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m115containsxj2QHRw(short[] sArr, short s3) {
        return ArraysKt.contains(sArr, s3);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
