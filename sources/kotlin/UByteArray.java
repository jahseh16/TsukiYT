package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class UByteArray implements Collection<UByte>, KMappedMarker {
    private final byte[] storage;

    public static final class Iterator implements java.util.Iterator<UByte>, KMappedMarker {
        private final byte[] array;
        private int index;

        public Iterator(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UByte next() {
            return UByte.m40boximpl(m61nextw2LRezQ());
        }

        /* JADX INFO: renamed from: next-w2LRezQ, reason: not valid java name */
        public byte m61nextw2LRezQ() {
            int i = this.index;
            byte[] bArr = this.array;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i + 1;
            return UByte.m41constructorimpl(bArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ UByteArray(byte[] bArr) {
        this.storage = bArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByteArray m46boximpl(byte[] bArr) {
        return new UByteArray(bArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m48constructorimpl(byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m50containsAllimpl(byte[] bArr, Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<UByte> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UByte) || !ArraysKt.contains(bArr, ((UByte) obj).m45unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m51equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.areEqual(bArr, ((UByteArray) obj).m60unboximpl());
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m52getw2LRezQ(byte[] bArr, int i) {
        return UByte.m41constructorimpl(bArr[i]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m53getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m54hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m55isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<UByte> m56iteratorimpl(byte[] bArr) {
        return new Iterator(bArr);
    }

    /* JADX INFO: renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m57setVurrAj0(byte[] bArr, int i, byte b4) {
        bArr[i] = b4;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m58toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m59contains7apg3OU(((UByte) obj).m45unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m59contains7apg3OU(byte b4) {
        return m49contains7apg3OU(this.storage, b4);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m50containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m51equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m53getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m54hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m55isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<UByte> iterator() {
        return m56iteratorimpl(this.storage);
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
        return m58toStringimpl(this.storage);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte[] m60unboximpl() {
        return this.storage;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m47constructorimpl(int i) {
        return m48constructorimpl(new byte[i]);
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m49contains7apg3OU(byte[] bArr, byte b4) {
        return ArraysKt.contains(bArr, b4);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
