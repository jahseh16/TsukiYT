package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ListBuilderKt {
    public static final <E> E[] arrayOfUninitializedElements(int i) {
        if (i >= 0) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i, int i5) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i < i5) {
            resetAt(eArr, i);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean subarrayContentEquals(T[] tArr, int i, int i5, List<?> list) {
        if (i5 != list.size()) {
            return false;
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (!Intrinsics.areEqual(tArr[i + i8], list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int subarrayContentHashCode(T[] tArr, int i, int i5) {
        int iHashCode = 1;
        for (int i8 = 0; i8 < i5; i8++) {
            T t3 = tArr[i + i8];
            iHashCode = (iHashCode * 31) + (t3 != null ? t3.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String subarrayContentToString(T[] tArr, int i, int i5, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append("[");
        for (int i8 = 0; i8 < i5; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            T t3 = tArr[i + i8];
            if (t3 == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t3);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
