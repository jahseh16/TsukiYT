package kotlin.random;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class RandomKt {
    public static final String boundsErrorMessage(Object from, Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void checkRangeBounds(int i, int i5) {
        if (i5 <= i) {
            throw new IllegalArgumentException(boundsErrorMessage(Integer.valueOf(i), Integer.valueOf(i5)).toString());
        }
    }

    public static final int fastLog2(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final int nextInt(Random random, IntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Integer.MAX_VALUE ? random.nextInt(range.getFirst(), range.getLast() + 1) : range.getFirst() > Integer.MIN_VALUE ? random.nextInt(range.getFirst() - 1, range.getLast()) + 1 : random.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int takeUpperBits(int i, int i5) {
        return (i >>> (32 - i5)) & ((-i5) >> 31);
    }

    public static final void checkRangeBounds(long j, long j4) {
        if (j4 <= j) {
            throw new IllegalArgumentException(boundsErrorMessage(Long.valueOf(j), Long.valueOf(j4)).toString());
        }
    }
}
