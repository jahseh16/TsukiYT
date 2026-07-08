package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    public static final Companion Companion = new Companion(null);
    private static final Object[] emptyElementData = new Object[0];
    private Object[] elementData;
    private int head;
    private int size;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ArrayDeque(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = emptyElementData;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i);
            }
            objArr = new Object[i];
        }
        this.elementData = objArr;
    }

    private final void copyCollectionElements(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.elementData.length;
        while (i < length && it.hasNext()) {
            this.elementData[i] = it.next();
            i++;
        }
        int i5 = this.head;
        for (int i8 = 0; i8 < i5 && it.hasNext(); i8++) {
            this.elementData[i8] = it.next();
        }
        this.size = size() + collection.size();
    }

    private final void copyElements(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.elementData;
        ArraysKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i5 = this.head;
        ArraysKt.copyInto(objArr3, objArr, length - i5, 0, i5);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int i) {
        return i == 0 ? ArraysKt.getLastIndex(this.elementData) : i - 1;
    }

    private final void ensureCapacity(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(i, 10)];
        } else {
            copyElements(AbstractList.Companion.newCapacity$kotlin_stdlib(objArr.length, i));
        }
    }

    private final int incremented(int i) {
        if (i == ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i + 1;
    }

    private final int negativeMod(int i) {
        return i < 0 ? i + this.elementData.length : i;
    }

    private final void nullifyNonEmpty(int i, int i5) {
        if (i < i5) {
            ArraysKt.fill(this.elementData, null, i, i5);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt.fill(objArr, null, i, objArr.length);
        ArraysKt.fill(this.elementData, null, 0, i5);
    }

    private final int positiveMod(int i) {
        Object[] objArr = this.elementData;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    private final void removeRangeShiftPreceding(int i, int i5) {
        int iPositiveMod = positiveMod(this.head + (i - 1));
        int iPositiveMod2 = positiveMod(this.head + (i5 - 1));
        while (i > 0) {
            int i8 = iPositiveMod + 1;
            int iMin = Math.min(i, Math.min(i8, iPositiveMod2 + 1));
            Object[] objArr = this.elementData;
            int i10 = iPositiveMod2 - iMin;
            int i11 = iPositiveMod - iMin;
            ArraysKt.copyInto(objArr, objArr, i10 + 1, i11 + 1, i8);
            iPositiveMod = negativeMod(i11);
            iPositiveMod2 = negativeMod(i10);
            i -= iMin;
        }
    }

    private final void removeRangeShiftSucceeding(int i, int i5) {
        int iPositiveMod = positiveMod(this.head + i5);
        int iPositiveMod2 = positiveMod(this.head + i);
        int size = size();
        while (true) {
            size -= i5;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            i5 = Math.min(size, Math.min(objArr.length - iPositiveMod, objArr.length - iPositiveMod2));
            Object[] objArr2 = this.elementData;
            int i8 = iPositiveMod + i5;
            ArraysKt.copyInto(objArr2, objArr2, iPositiveMod2, iPositiveMod, i8);
            iPositiveMod = positiveMod(i8);
            iPositiveMod2 = positiveMod(iPositiveMod2 + i5);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        addLast(e4);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E e4) {
        registerModification();
        ensureCapacity(size() + 1);
        int iDecremented = decremented(this.head);
        this.head = iDecremented;
        this.elementData[iDecremented] = e4;
        this.size = size() + 1;
    }

    public final void addLast(E e4) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = e4;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return (E) this.elementData[positiveMod(this.head + i)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int iPositiveMod = positiveMod(this.head + size());
        int length = this.head;
        if (length < iPositiveMod) {
            while (length < iPositiveMod) {
                if (Intrinsics.areEqual(obj, this.elementData[length])) {
                    i = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iPositiveMod) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (true) {
            if (length >= length2) {
                for (int i5 = 0; i5 < iPositiveMod; i5++) {
                    if (Intrinsics.areEqual(obj, this.elementData[i5])) {
                        length = i5 + this.elementData.length;
                        i = this.head;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.elementData[length])) {
                i = this.head;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i;
        int iPositiveMod = positiveMod(this.head + size());
        int i5 = this.head;
        if (i5 < iPositiveMod) {
            lastIndex = iPositiveMod - 1;
            if (i5 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i5) {
                        lastIndex--;
                    }
                }
                i = this.head;
                return lastIndex - i;
            }
            return -1;
        }
        if (i5 > iPositiveMod) {
            int i8 = iPositiveMod - 1;
            while (true) {
                if (-1 >= i8) {
                    lastIndex = ArraysKt.getLastIndex(this.elementData);
                    int i10 = this.head;
                    if (i10 <= lastIndex) {
                        while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                            if (lastIndex != i10) {
                                lastIndex--;
                            }
                        }
                        i = this.head;
                    }
                } else {
                    if (Intrinsics.areEqual(obj, this.elementData[i8])) {
                        lastIndex = i8 + this.elementData.length;
                        i = this.head;
                        break;
                    }
                    i8--;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i = this.head;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.elementData[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    }
                    i++;
                }
                ArraysKt.fill(this.elementData, null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                int i5 = i;
                boolean z5 = false;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.elementData[i5] = obj2;
                        i5++;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i5);
                for (int i8 = 0; i8 < iPositiveMod2; i8++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i8];
                    objArr2[i8] = null;
                    if (elements.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    }
                }
                z = z5;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        if (i == CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + i);
        E e4 = (E) this.elementData[iPositiveMod];
        if (i < (size() >> 1)) {
            int i5 = this.head;
            if (iPositiveMod >= i5) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, i5 + 1, i5, iPositiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, 1, 0, iPositiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i8 = this.head;
                ArraysKt.copyInto(objArr3, objArr3, i8 + 1, i8, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i10 = this.head;
            objArr4[i10] = null;
            this.head = incremented(i10);
        } else {
            int iPositiveMod2 = positiveMod(this.head + CollectionsKt.getLastIndex(this));
            if (iPositiveMod <= iPositiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt.copyInto(objArr6, objArr6, iPositiveMod, iPositiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt.copyInto(objArr7, objArr7, 0, 1, iPositiveMod2 + 1);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size = size() - 1;
        return e4;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        Object[] objArr = this.elementData;
        int i = this.head;
        E e4 = (E) objArr[i];
        objArr[i] = null;
        this.head = incremented(i);
        this.size = size() - 1;
        return e4;
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        E e4 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.size = size() - 1;
        return e4;
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i5) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i5, size());
        int i8 = i5 - i;
        if (i8 == 0) {
            return;
        }
        if (i8 == size()) {
            clear();
            return;
        }
        if (i8 == 1) {
            remove(i);
            return;
        }
        registerModification();
        if (i < size() - i5) {
            removeRangeShiftPreceding(i, i5);
            int iPositiveMod = positiveMod(this.head + i8);
            nullifyNonEmpty(this.head, iPositiveMod);
            this.head = iPositiveMod;
        } else {
            removeRangeShiftSucceeding(i, i5);
            int iPositiveMod2 = positiveMod(this.head + size());
            nullifyNonEmpty(negativeMod(iPositiveMod2 - i8), iPositiveMod2);
        }
        this.size = size() - i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i = this.head;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.elementData[i];
                    if (elements.contains(obj)) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt.fill(this.elementData, null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                int i5 = i;
                boolean z5 = false;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i5);
                for (int i8 = 0; i8 < iPositiveMod2; i8++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i8];
                    objArr2[i8] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z5 = true;
                    }
                }
                z = z5;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e4) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        int iPositiveMod = positiveMod(this.head + i);
        Object[] objArr = this.elementData;
        E e5 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = e4;
        return e5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(array, size());
        }
        int iPositiveMod = positiveMod(this.head + size());
        int i = this.head;
        if (i < iPositiveMod) {
            ArraysKt.copyInto$default(this.elementData, array, 0, i, iPositiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.copyInto(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt.copyInto(objArr2, array, objArr2.length - this.head, 0, iPositiveMod);
        }
        return (T[]) CollectionsKt.terminateCollectionToArray(size(), array);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e4) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (i == size()) {
            addLast(e4);
            return;
        }
        if (i == 0) {
            addFirst(e4);
            return;
        }
        registerModification();
        ensureCapacity(size() + 1);
        int iPositiveMod = positiveMod(this.head + i);
        if (i < ((size() + 1) >> 1)) {
            int iDecremented = decremented(iPositiveMod);
            int iDecremented2 = decremented(this.head);
            int i5 = this.head;
            if (iDecremented >= i5) {
                Object[] objArr = this.elementData;
                objArr[iDecremented2] = objArr[i5];
                ArraysKt.copyInto(objArr, objArr, i5, i5 + 1, iDecremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, i5 - 1, i5, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt.copyInto(objArr3, objArr3, 0, 1, iDecremented + 1);
            }
            this.elementData[iDecremented] = e4;
            this.head = iDecremented2;
        } else {
            int iPositiveMod2 = positiveMod(this.head + size());
            if (iPositiveMod < iPositiveMod2) {
                Object[] objArr4 = this.elementData;
                ArraysKt.copyInto(objArr4, objArr4, iPositiveMod + 1, iPositiveMod, iPositiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, 1, 0, iPositiveMod2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt.copyInto(objArr6, objArr6, iPositiveMod + 1, iPositiveMod, objArr6.length - 1);
            }
            this.elementData[iPositiveMod] = e4;
        }
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        int iPositiveMod = positiveMod(this.head + size());
        int iPositiveMod2 = positiveMod(this.head + i);
        int size = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i5 = this.head;
            int length = i5 - size;
            if (iPositiveMod2 < i5) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, length, i5, objArr.length);
                if (size >= iPositiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iPositiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt.copyInto(objArr4, objArr4, 0, size, iPositiveMod2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, length, i5, iPositiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i8 = iPositiveMod2 - i5;
                int length2 = objArr6.length - length;
                if (length2 >= i8) {
                    ArraysKt.copyInto(objArr6, objArr6, length, i5, iPositiveMod2);
                } else {
                    ArraysKt.copyInto(objArr6, objArr6, length, i5, i5 + length2);
                    Object[] objArr7 = this.elementData;
                    ArraysKt.copyInto(objArr7, objArr7, 0, this.head + length2, iPositiveMod2);
                }
            }
            this.head = length;
            copyCollectionElements(negativeMod(iPositiveMod2 - size), elements);
        } else {
            int i10 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i11 = size + iPositiveMod;
                Object[] objArr8 = this.elementData;
                if (i11 <= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i10, iPositiveMod2, iPositiveMod);
                } else if (i10 >= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i10 - objArr8.length, iPositiveMod2, iPositiveMod);
                } else {
                    int length3 = iPositiveMod - (i11 - objArr8.length);
                    ArraysKt.copyInto(objArr8, objArr8, 0, length3, iPositiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt.copyInto(objArr9, objArr9, i10, iPositiveMod2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt.copyInto(objArr10, objArr10, size, 0, iPositiveMod);
                Object[] objArr11 = this.elementData;
                if (i10 >= objArr11.length) {
                    ArraysKt.copyInto(objArr11, objArr11, i10 - objArr11.length, iPositiveMod2, objArr11.length);
                } else {
                    ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt.copyInto(objArr12, objArr12, i10, iPositiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(iPositiveMod2, elements);
        }
        return true;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
