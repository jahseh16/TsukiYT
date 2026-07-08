package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: loaded from: classes.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    private static final Companion Companion = new Companion(null);
    private static final ListBuilder Empty;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        public static final class Itr<E> implements ListIterator<E>, KMappedMarker {
            private int expectedModCount;
            private int index;
            private int lastIndex;
            private final BuilderSubList<E> list;

            public Itr(BuilderSubList<E> list, int i) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.list = list;
                this.index = i;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            private final void checkForComodification() {
                if (((AbstractList) ((BuilderSubList) this.list).root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e4) {
                checkForComodification();
                BuilderSubList<E> builderSubList = this.list;
                int i = this.index;
                this.index = i + 1;
                builderSubList.add(i, e4);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < ((BuilderSubList) this.list).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                checkForComodification();
                if (this.index >= ((BuilderSubList) this.list).length) {
                    throw new NoSuchElementException();
                }
                int i = this.index;
                this.index = i + 1;
                this.lastIndex = i;
                return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public E previous() {
                checkForComodification();
                int i = this.index;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i - 1;
                this.index = i5;
                this.lastIndex = i5;
                return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                checkForComodification();
                int i = this.lastIndex;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.remove(i);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E e4) {
                checkForComodification();
                int i = this.lastIndex;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i, e4);
            }
        }

        public BuilderSubList(E[] backing, int i, int i5, BuilderSubList<E> builderSubList, ListBuilder<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.backing = backing;
            this.offset = i;
            this.length = i5;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void addAllInternal(int i, Collection<? extends E> collection, int i5) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAllInternal(i, collection, i5);
            } else {
                this.root.addAllInternal(i, collection, i5);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i5;
        }

        private final void addAtInternal(int i, E e4) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAtInternal(i, e4);
            } else {
                this.root.addAtInternal(i, e4);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void checkIsMutable() {
            if (isReadOnly()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean contentEquals(List<?> list) {
            return ListBuilderKt.subarrayContentEquals(this.backing, this.offset, this.length, list);
        }

        private final boolean isReadOnly() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final void registerModification() {
            ((AbstractList) this).modCount++;
        }

        private final E removeAtInternal(int i) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            this.length--;
            return builderSubList != null ? builderSubList.removeAtInternal(i) : (E) this.root.removeAtInternal(i);
        }

        private final void removeRangeInternal(int i, int i5) {
            if (i5 > 0) {
                registerModification();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.removeRangeInternal(i, i5);
            } else {
                this.root.removeRangeInternal(i, i5);
            }
            this.length -= i5;
        }

        private final int retainOrRemoveAllInternal(int i, int i5, Collection<? extends E> collection, boolean z) {
            BuilderSubList<E> builderSubList = this.parent;
            int iRetainOrRemoveAllInternal = builderSubList != null ? builderSubList.retainOrRemoveAllInternal(i, i5, collection, z) : this.root.retainOrRemoveAllInternal(i, i5, collection, z);
            if (iRetainOrRemoveAllInternal > 0) {
                registerModification();
            }
            this.length -= iRetainOrRemoveAllInternal;
            return iRetainOrRemoveAllInternal;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (isReadOnly()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e4) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, e4);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            int size = elements.size();
            addAllInternal(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            checkForComodification();
            return obj == this || ((obj instanceof List) && contentEquals((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
            return this.backing[this.offset + i];
        }

        @Override // kotlin.collections.AbstractMutableList
        public int getSize() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            checkForComodification();
            return ListBuilderKt.subarrayContentHashCode(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            checkForComodification();
            for (int i = 0; i < this.length; i++) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            checkForComodification();
            for (int i = this.length - 1; i >= 0; i--) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            checkIsMutable();
            checkForComodification();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
        }

        @Override // kotlin.collections.AbstractMutableList
        public E removeAt(int i) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
            return removeAtInternal(this.offset + i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i, E e4) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
            E[] eArr = this.backing;
            int i5 = this.offset;
            E e5 = eArr[i5 + i];
            eArr[i5 + i] = e4;
            return e5;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i, int i5) {
            kotlin.collections.AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i5, this.length);
            return new BuilderSubList(this.backing, this.offset + i, i5 - i, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            checkForComodification();
            int length = array.length;
            int i = this.length;
            if (length >= i) {
                E[] eArr = this.backing;
                int i5 = this.offset;
                ArraysKt.copyInto(eArr, array, 0, i5, i + i5);
                return (T[]) CollectionsKt.terminateCollectionToArray(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i8 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i8, i + i8, array.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            checkForComodification();
            return ListBuilderKt.subarrayContentToString(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
            return new Itr(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, E e4) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
            addAtInternal(this.offset + i, e4);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
            int size = elements.size();
            addAllInternal(this.offset + i, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            checkForComodification();
            E[] eArr = this.backing;
            int i = this.offset;
            return ArraysKt.copyOfRange(eArr, i, this.length + i);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Itr<E> implements ListIterator<E>, KMappedMarker {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final ListBuilder<E> list;

        public Itr(ListBuilder<E> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e4) {
            checkForComodification();
            ListBuilder<E> listBuilder = this.list;
            int i = this.index;
            this.index = i + 1;
            listBuilder.add(i, e4);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            checkForComodification();
            if (this.index >= ((ListBuilder) this.list).length) {
                throw new NoSuchElementException();
            }
            int i = this.index;
            this.index = i + 1;
            this.lastIndex = i;
            return (E) ((ListBuilder) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            checkForComodification();
            int i = this.index;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i5 = i - 1;
            this.index = i5;
            this.lastIndex = i5;
            return (E) ((ListBuilder) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForComodification();
            int i = this.lastIndex;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.remove(i);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e4) {
            checkForComodification();
            int i = this.lastIndex;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i, e4);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAllInternal(int i, Collection<? extends E> collection, int i5) {
        registerModification();
        insertAtInternal(i, i5);
        Iterator<? extends E> it = collection.iterator();
        for (int i8 = 0; i8 < i5; i8++) {
            this.backing[i + i8] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAtInternal(int i, E e4) {
        registerModification();
        insertAtInternal(i, 1);
        this.backing[i] = e4;
    }

    private final void checkIsMutable() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        return ListBuilderKt.subarrayContentEquals(this.backing, 0, this.length, list);
    }

    private final void ensureCapacityInternal(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i > eArr.length) {
            this.backing = (E[]) ListBuilderKt.copyOfUninitializedElements(this.backing, kotlin.collections.AbstractList.Companion.newCapacity$kotlin_stdlib(eArr.length, i));
        }
    }

    private final void ensureExtraCapacity(int i) {
        ensureCapacityInternal(this.length + i);
    }

    private final void insertAtInternal(int i, int i5) {
        ensureExtraCapacity(i5);
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, i + i5, i, this.length);
        this.length += i5;
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E removeAtInternal(int i) {
        registerModification();
        E[] eArr = this.backing;
        E e4 = eArr[i];
        ArraysKt.copyInto(eArr, eArr, i, i + 1, this.length);
        ListBuilderKt.resetAt(this.backing, this.length - 1);
        this.length--;
        return e4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRangeInternal(int i, int i5) {
        if (i5 > 0) {
            registerModification();
        }
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, i, i + i5, this.length);
        E[] eArr2 = this.backing;
        int i8 = this.length;
        ListBuilderKt.resetRange(eArr2, i8 - i5, i8);
        this.length -= i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int retainOrRemoveAllInternal(int i, int i5, Collection<? extends E> collection, boolean z) {
        int i8 = 0;
        int i10 = 0;
        while (i8 < i5) {
            int i11 = i + i8;
            if (collection.contains(this.backing[i11]) == z) {
                E[] eArr = this.backing;
                i8++;
                eArr[i10 + i] = eArr[i11];
                i10++;
            } else {
                i8++;
            }
        }
        int i12 = i5 - i10;
        E[] eArr2 = this.backing;
        ArraysKt.copyInto(eArr2, eArr2, i + i10, i5 + i, this.length);
        E[] eArr3 = this.backing;
        int i13 = this.length;
        ListBuilderKt.resetRange(eArr3, i13 - i12, i13);
        if (i12 > 0) {
            registerModification();
        }
        this.length -= i12;
        return i12;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        checkIsMutable();
        addAtInternal(this.length, e4);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.length, elements, size);
        return size > 0;
    }

    public final List<E> build() {
        checkIsMutable();
        this.isReadOnly = true;
        return this.length > 0 ? this : Empty;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
        return this.backing[i];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return ListBuilderKt.subarrayContentHashCode(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.areEqual(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        checkIsMutable();
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
        return removeAtInternal(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e4) {
        checkIsMutable();
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.length);
        E[] eArr = this.backing;
        E e5 = eArr[i];
        eArr[i] = e4;
        return e5;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i5) {
        kotlin.collections.AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i5, this.length);
        return new BuilderSubList(this.backing, i, i5 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.length;
        if (length >= i) {
            ArraysKt.copyInto(this.backing, array, 0, 0, i);
            return (T[]) CollectionsKt.terminateCollectionToArray(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i, array.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return ListBuilderKt.subarrayContentToString(this.backing, 0, this.length, this);
    }

    public ListBuilder(int i) {
        this.backing = (E[]) ListBuilderKt.arrayOfUninitializedElements(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
        return new Itr(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e4) {
        checkIsMutable();
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
        addAtInternal(i, e4);
    }

    public /* synthetic */ ListBuilder(int i, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.length);
        int size = elements.size();
        addAllInternal(i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return ArraysKt.copyOfRange(this.backing, 0, this.length);
    }
}
