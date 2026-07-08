package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class NaturalOrderComparator implements Comparator<Comparable<? super Object>> {
    public static final NaturalOrderComparator INSTANCE = new NaturalOrderComparator();

    private NaturalOrderComparator() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        return compare2((Comparable<Object>) comparable, (Comparable<Object>) comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return ReverseOrderComparator.INSTANCE;
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(Comparable<Object> a6, Comparable<Object> b4) {
        Intrinsics.checkNotNullParameter(a6, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a6.compareTo(b4);
    }
}
