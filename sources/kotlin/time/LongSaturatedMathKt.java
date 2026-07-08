package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public final class LongSaturatedMathKt {
    private static final long infinityOfSign(long j) {
        Duration.Companion companion = Duration.Companion;
        return j < 0 ? companion.m166getNEG_INFINITEUwyO8pc$kotlin_stdlib() : companion.m165getINFINITEUwyO8pc();
    }

    private static final long saturatingFiniteDiff(long j, long j4, DurationUnit durationUnit) {
        long j7 = j - j4;
        if (((j7 ^ j) & (~(j7 ^ j4))) >= 0) {
            return DurationKt.toDuration(j7, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m162unaryMinusUwyO8pc(infinityOfSign(j7));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j8 = (j / jConvertDurationUnit) - (j4 / jConvertDurationUnit);
        long j9 = (j % jConvertDurationUnit) - (j4 % jConvertDurationUnit);
        Duration.Companion companion = Duration.Companion;
        return Duration.m158plusLRDsOJo(DurationKt.toDuration(j8, durationUnit2), DurationKt.toDuration(j9, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j, long j4, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j4 - 1) | 1) == Long.MAX_VALUE ? j == j4 ? Duration.Companion.m167getZEROUwyO8pc() : Duration.m162unaryMinusUwyO8pc(infinityOfSign(j4)) : (1 | (j - 1)) == Long.MAX_VALUE ? infinityOfSign(j) : saturatingFiniteDiff(j, j4, unit);
    }
}
