package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST = new LongArrayList(new long[0], 0, false);
    private long[] array;
    private int size;

    public LongArrayList() {
        this(new long[10], 0, true);
    }

    public static LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        return "Index:" + i + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i = longArrayList.size;
        if (i == 0) {
            return false;
        }
        int i5 = this.size;
        if (Reader.READ_DONE - i5 < i) {
            throw new OutOfMemoryError();
        }
        int i8 = i5 + i;
        long[] jArr = this.array;
        if (i8 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i8);
        }
        System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j) {
        ensureIsMutable();
        int i = this.size;
        long[] jArr = this.array;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i5 = this.size;
        this.size = i5 + 1;
        jArr3[i5] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.size; i++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.array[i]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i5) {
        ensureIsMutable();
        if (i5 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.array;
        System.arraycopy(jArr, i5, jArr, i, this.size - i5);
        this.size -= i5 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i, long j) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j4 = jArr[i];
        jArr[i] = j;
        return j4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] jArr, int i, boolean z) {
        super(z);
        this.array = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i) {
        if (i >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, i), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i, Long l3) {
        return Long.valueOf(setLong(i, l3.longValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l3) {
        addLong(l3.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, Long l3) {
        addLong(i, l3.longValue());
    }

    private void addLong(int i, long j) {
        int i5;
        ensureIsMutable();
        if (i >= 0 && i <= (i5 = this.size)) {
            long[] jArr = this.array;
            if (i5 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i5 - i);
            } else {
                long[] jArr2 = new long[((i5 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.array, i, jArr2, i + 1, this.size - i);
                this.array = jArr2;
            }
            this.array[i] = j;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
