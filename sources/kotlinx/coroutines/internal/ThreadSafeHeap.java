package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: loaded from: classes.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final AtomicIntegerFieldUpdater _size$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f6085a;

    private final T[] realloc() {
        T[] tArr = this.f6085a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.f6085a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, getSize() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) objArrCopyOf);
        this.f6085a = tArr3;
        return tArr3;
    }

    private final void setSize(int i) {
        _size$FU.set(this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void siftDownFrom(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r2 = r5.f6085a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.getSize()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.swap(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.siftDownFrom(int):void");
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            T[] tArr = this.f6085a;
            Intrinsics.checkNotNull(tArr);
            int i5 = (i - 1) / 2;
            T t3 = tArr[i5];
            Intrinsics.checkNotNull(t3);
            T t5 = tArr[i];
            Intrinsics.checkNotNull(t5);
            if (((Comparable) t3).compareTo(t5) <= 0) {
                return;
            }
            swap(i, i5);
            i = i5;
        }
    }

    private final void swap(int i, int i5) {
        T[] tArr = this.f6085a;
        Intrinsics.checkNotNull(tArr);
        T t3 = tArr[i5];
        Intrinsics.checkNotNull(t3);
        T t5 = tArr[i];
        Intrinsics.checkNotNull(t5);
        tArr[i] = t3;
        tArr[i5] = t5;
        t3.setIndex(i);
        t5.setIndex(i5);
    }

    public final void addImpl(T t3) {
        if (DebugKt.getASSERTIONS_ENABLED() && t3.getHeap() != null) {
            throw new AssertionError();
        }
        t3.setHeap(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        threadSafeHeapNodeArrRealloc[size] = t3;
        t3.setIndex(size);
        siftUpFrom(size);
    }

    public final T firstImpl() {
        T[] tArr = this.f6085a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T t3;
        synchronized (this) {
            t3 = (T) firstImpl();
        }
        return t3;
    }

    public final boolean remove(T t3) {
        boolean z;
        synchronized (this) {
            try {
                if (t3.getHeap() == null) {
                    z = false;
                } else {
                    int index = t3.getIndex();
                    if (DebugKt.getASSERTIONS_ENABLED() && index < 0) {
                        throw new AssertionError();
                    }
                    removeAtImpl(index);
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T removeAtImpl(int r6) {
        /*
            r5 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            int r0 = r5.getSize()
            if (r0 <= 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L13:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r5.f6085a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r5.getSize()
            r2 = -1
            int r1 = r1 + r2
            r5.setSize(r1)
            int r1 = r5.getSize()
            if (r6 >= r1) goto L50
            int r1 = r5.getSize()
            r5.swap(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L4d
            r3 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L4d
            r5.swap(r6, r1)
            r5.siftUpFrom(r1)
            goto L50
        L4d:
            r5.siftDownFrom(r6)
        L50:
            int r6 = r5.getSize()
            r6 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L6c
            kotlinx.coroutines.internal.ThreadSafeHeap r1 = r6.getHeap()
            if (r1 != r5) goto L66
            goto L6c
        L66:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L6c:
            r1 = 0
            r6.setHeap(r1)
            r6.setIndex(r2)
            int r2 = r5.getSize()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.removeAtImpl(int):kotlinx.coroutines.internal.ThreadSafeHeapNode");
    }

    public final T removeFirstOrNull() {
        T t3;
        synchronized (this) {
            t3 = getSize() > 0 ? (T) removeAtImpl(0) : null;
        }
        return t3;
    }
}
