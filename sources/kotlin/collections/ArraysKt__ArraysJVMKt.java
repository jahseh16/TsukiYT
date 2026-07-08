package kotlin.collections;

import java.lang.reflect.Array;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
class ArraysKt__ArraysJVMKt {
    public static final <T> T[] arrayOfNulls(T[] reference, int i) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i);
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    public static final void copyOfRangeToIndexCheck(int i, int i5) {
        if (i <= i5) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i5 + ").");
    }
}
