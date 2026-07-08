package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (i < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        }
        if (i <= buffer.length) {
            this.capacity = buffer.length;
            this.size = i;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T t3) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(this.startIndex + size()) % this.capacity] = t3;
        this.size = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RingBuffer<T> expanded(int i) {
        Object[] array;
        int i5 = this.capacity;
        int iCoerceAtMost = RangesKt.coerceAtMost(i5 + (i5 >> 1) + 1, i);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iCoerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return (T) this.buffer[(this.startIndex + i) % this.capacity];
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer.iterator.1
            private int count;
            private int index;
            final /* synthetic */ RingBuffer<T> this$0;

            {
                this.this$0 = this;
                this.count = this.size();
                this.index = ((RingBuffer) this).startIndex;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                if (this.count == 0) {
                    done();
                    return;
                }
                setNext(((RingBuffer) this.this$0).buffer[this.index]);
                this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                this.count--;
            }
        };
    }

    public final void removeFirst(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
        if (i > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        if (i > 0) {
            int i5 = this.startIndex;
            int i8 = (i5 + i) % this.capacity;
            if (i5 > i8) {
                ArraysKt.fill(this.buffer, null, i5, this.capacity);
                ArraysKt.fill(this.buffer, null, 0, i8);
            } else {
                ArraysKt.fill(this.buffer, null, i5, i8);
            }
            this.startIndex = i8;
            this.size = size() - i;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i = 0;
        int i5 = 0;
        for (int i8 = this.startIndex; i5 < size && i8 < this.capacity; i8++) {
            objArr[i5] = this.buffer[i8];
            i5++;
        }
        while (i5 < size) {
            objArr[i5] = this.buffer[i];
            i5++;
            i++;
        }
        return (T[]) CollectionsKt.terminateCollectionToArray(size, objArr);
    }

    public RingBuffer(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
