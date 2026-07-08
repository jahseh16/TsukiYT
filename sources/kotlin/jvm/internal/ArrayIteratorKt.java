package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayIteratorKt {
    public static final <T> Iterator<T> iterator(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayIterator(array);
    }
}
