package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
class DurationUnitKt__DurationUnitJvmKt {
    public static final double convertDurationUnit(double d4, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d4 * jConvert : d4 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long convertDurationUnitOverflow(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long convertDurationUnit(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j, sourceUnit.getTimeUnit$kotlin_stdlib());
    }
}
