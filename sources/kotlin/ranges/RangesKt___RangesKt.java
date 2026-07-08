package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.IntProgression;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    public static float coerceAtLeast(float f3, float f4) {
        return f3 < f4 ? f4 : f3;
    }

    public static int coerceAtMost(int i, int i5) {
        return i > i5 ? i5 : i;
    }

    public static int coerceIn(int i, int i5, int i8) {
        if (i5 <= i8) {
            return i < i5 ? i5 : i > i8 ? i8 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i8 + " is less than minimum " + i5 + '.');
    }

    public static IntProgression downTo(int i, int i5) {
        return IntProgression.Companion.fromClosedRange(i, i5, -1);
    }

    public static int random(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    public static IntProgression step(IntProgression intProgression, int i) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        IntProgression.Companion companion = IntProgression.Companion;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static IntRange until(int i, int i5) {
        return i5 <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange(i, i5 - 1);
    }

    public static int coerceAtLeast(int i, int i5) {
        return i < i5 ? i5 : i;
    }

    public static long coerceAtMost(long j, long j4) {
        return j > j4 ? j4 : j;
    }

    public static long coerceIn(long j, long j4, long j7) {
        if (j4 <= j7) {
            return j < j4 ? j4 : j > j7 ? j7 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j7 + " is less than minimum " + j4 + '.');
    }

    public static long coerceAtLeast(long j, long j4) {
        return j < j4 ? j4 : j;
    }

    public static float coerceIn(float f3, float f4, float f5) {
        if (f4 <= f5) {
            return f3 < f4 ? f4 : f3 > f5 ? f5 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f5 + " is less than minimum " + f4 + '.');
    }
}
