package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ULongArray implements Collection<ULong>, KMappedMarker {
    private final long[] storage;

    public static final class Iterator implements java.util.Iterator<ULong>, KMappedMarker {
        private final long[] array;
        private int index;

        public Iterator(long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ULong next() {
            return ULong.m84boximpl(m105nextsVKNKU());
        }

        /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
        public long m105nextsVKNKU() {
            int i = this.index;
            long[] jArr = this.array;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return ULong.m85constructorimpl(jArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ ULongArray(long[] jArr) {
        this.storage = jArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULongArray m90boximpl(long[] jArr) {
        return new ULongArray(jArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long[] m92constructorimpl(long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m94containsAllimpl(long[] jArr, Collection<ULong> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<ULong> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof ULong) || !ArraysKt.contains(jArr, ((ULong) obj).m89unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m95equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.areEqual(jArr, ((ULongArray) obj).m104unboximpl());
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m96getsVKNKU(long[] jArr, int i) {
        return ULong.m85constructorimpl(jArr[i]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m97getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m98hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m99isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<ULong> m100iteratorimpl(long[] jArr) {
        return new Iterator(jArr);
    }

    /* JADX INFO: renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m101setk8EXiF4(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m102toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ULong uLong) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ULong> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m103containsVKZWuLQ(((ULong) obj).m89unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m103containsVKZWuLQ(long j) {
        return m93containsVKZWuLQ(this.storage, j);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m94containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m95equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m97getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m98hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m99isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<ULong> iterator() {
        return m100iteratorimpl(this.storage);
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
        return m102toStringimpl(this.storage);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long[] m104unboximpl() {
        return this.storage;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long[] m91constructorimpl(int i) {
        return m92constructorimpl(new long[i]);
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m93containsVKZWuLQ(long[] jArr, long j) {
        return ArraysKt.contains(jArr, j);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
