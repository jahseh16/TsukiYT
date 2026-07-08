package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    public static <T> ArrayList<T> arrayListOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new ArrayAsCollection(elements, true));
    }

    public static final <T> Collection<T> asCollection(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayAsCollection(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T t3, int i, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i5);
        int i8 = i5 - 1;
        while (i <= i8) {
            int i10 = (i + i8) >>> 1;
            int iCompareValues = ComparisonsKt.compareValues(list.get(i10), t3);
            if (iCompareValues < 0) {
                i = i10 + 1;
            } else {
                if (iCompareValues <= 0) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i, int i5, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            i5 = list.size();
        }
        return binarySearch(list, comparable, i, i5);
    }

    public static <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    public static IntRange getIndices(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> listOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? ArraysKt.asList(elements) : CollectionsKt.emptyList();
    }

    public static <T> List<T> listOfNotNull(T t3) {
        return t3 != null ? CollectionsKt.listOf(t3) : CollectionsKt.emptyList();
    }

    public static <T> List<T> mutableListOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> optimizeReadOnlyList(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt.listOf(list.get(0)) : CollectionsKt.emptyList();
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i, int i5, int i8) {
        if (i5 > i8) {
            throw new IllegalArgumentException("fromIndex (" + i5 + ") is greater than toIndex (" + i8 + ").");
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i5 + ") is less than zero.");
        }
        if (i8 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i + ").");
    }

    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static <T> List<T> listOfNotNull(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt.filterNotNull(elements);
    }
}
