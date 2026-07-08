package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class ComparisonsKt__ComparisonsKt {
    public static <T extends Comparable<?>> int compareValues(T t3, T t5) {
        if (t3 == t5) {
            return 0;
        }
        if (t3 == null) {
            return -1;
        }
        if (t5 == null) {
            return 1;
        }
        return t3.compareTo(t5);
    }

    public static <T> int compareValuesBy(T t3, T t5, Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t3, t5, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t3, T t5, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iCompareValues = ComparisonsKt.compareValues(function1.invoke(t3), function1.invoke(t5));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return naturalOrderComparator;
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return reverseOrderComparator;
    }
}
