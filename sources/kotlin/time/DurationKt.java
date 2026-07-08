package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public final class DurationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j, int i) {
        return Duration.m136constructorimpl((j << 1) + ((long) i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j) {
        return Duration.m136constructorimpl((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? durationOfMillis(RangesKt.coerceIn(j, -4611686018427387903L, 4611686018427387903L)) : durationOfNanos(millisToNanos(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j) {
        return Duration.m136constructorimpl(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? durationOfMillis(nanosToMillis(j)) : durationOfNanos(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j) {
        return j * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j) {
        return j / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z) {
        long jM158plusLRDsOJo;
        char cCharAt;
        char cCharAt2;
        int i;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Duration.Companion companion = Duration.Companion;
        long jM167getZEROUwyO8pc = companion.m167getZEROUwyO8pc();
        char cCharAt4 = str.charAt(0);
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z5 = length2 > 0;
        boolean z7 = z5 && StringsKt.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c = ':';
        char c3 = '0';
        if (str.charAt(length2) == 'P') {
            int i5 = length2 + 1;
            if (i5 == length) {
                throw new IllegalArgumentException();
            }
            DurationUnit durationUnit = null;
            boolean z8 = false;
            while (i5 < length) {
                if (str.charAt(i5) != 'T') {
                    int i8 = i5;
                    while (i8 < str.length() && ((c3 <= (cCharAt3 = str.charAt(i8)) && cCharAt3 < c) || StringsKt.contains$default((CharSequence) "+-.", cCharAt3, false, 2, (Object) null))) {
                        i8++;
                        c = ':';
                        c3 = '0';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i5, i8);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i5 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    int i10 = length3 + 1;
                    DurationUnit durationUnitDurationUnitByIsoChar = DurationUnitKt__DurationUnitKt.durationUnitByIsoChar(cCharAt5, z8);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strSubstring, '.', 0, false, 6, (Object) null);
                    if (durationUnitDurationUnitByIsoChar != DurationUnit.SECONDS || iIndexOf$default <= 0) {
                        i = i10;
                        jM167getZEROUwyO8pc = Duration.m158plusLRDsOJo(jM167getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring), durationUnitDurationUnitByIsoChar));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        i = i10;
                        long jM158plusLRDsOJo2 = Duration.m158plusLRDsOJo(jM167getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring2), durationUnitDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM167getZEROUwyO8pc = Duration.m158plusLRDsOJo(jM158plusLRDsOJo2, toDuration(Double.parseDouble(strSubstring3), durationUnitDurationUnitByIsoChar));
                    }
                    i5 = i;
                    durationUnit = durationUnitDurationUnitByIsoChar;
                    c = ':';
                    c3 = '0';
                } else {
                    if (z8 || (i5 = i5 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z8 = true;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            if (StringsKt.regionMatches(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM167getZEROUwyO8pc = companion.m165getINFINITEUwyO8pc();
            } else {
                boolean z9 = !z5;
                if (z5 && str.charAt(length2) == '(' && StringsKt.last(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    jM158plusLRDsOJo = jM167getZEROUwyO8pc;
                    z9 = true;
                } else {
                    jM158plusLRDsOJo = jM167getZEROUwyO8pc;
                }
                DurationUnit durationUnit2 = null;
                boolean z10 = false;
                while (length2 < length) {
                    if (z10 && z9) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i11 = length2;
                    while (i11 < str.length() && (('0' <= (cCharAt2 = str.charAt(i11)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i11++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i11);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i12 = length4;
                    while (i12 < str.length() && 'a' <= (cCharAt = str.charAt(i12)) && cCharAt < '{') {
                        i12++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitDurationUnitByShortName = DurationUnitKt__DurationUnitKt.durationUnitByShortName(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) strSubstring4, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM158plusLRDsOJo3 = Duration.m158plusLRDsOJo(jM158plusLRDsOJo, toDuration(Long.parseLong(strSubstring6), durationUnitDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM158plusLRDsOJo = Duration.m158plusLRDsOJo(jM158plusLRDsOJo3, toDuration(Double.parseDouble(strSubstring7), durationUnitDurationUnitByShortName));
                        length2 = length2;
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM158plusLRDsOJo = Duration.m158plusLRDsOJo(jM158plusLRDsOJo, toDuration(Long.parseLong(strSubstring4), durationUnitDurationUnitByShortName));
                    }
                    str2 = str3;
                    durationUnit2 = durationUnitDurationUnitByShortName;
                    z10 = true;
                }
                jM167getZEROUwyO8pc = jM158plusLRDsOJo;
            }
        }
        return z7 ? Duration.m162unaryMinusUwyO8pc(jM167getZEROUwyO8pc) : jM167getZEROUwyO8pc;
    }

    private static final long parseOverLongIsoComponent(String str) {
        int length = str.length();
        int i = (length <= 0 || !StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i > 16) {
            Iterable intRange = new IntRange(i, StringsKt.getLastIndex(str));
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (it.hasNext()) {
                    char cCharAt = str.charAt(((IntIterator) it).nextInt());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
            str = StringsKt.drop(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long toDuration(int i, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i, unit, DurationUnit.NANOSECONDS)) : toDuration(i, unit);
    }

    public static final long toDuration(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jConvertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(4611686018426999999L, durationUnit, unit);
        if ((-jConvertDurationUnitOverflow) <= j && j <= jConvertDurationUnitOverflow) {
            return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j, unit, durationUnit));
        }
        return durationOfMillis(RangesKt.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long toDuration(double d4, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d4, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(dConvertDurationUnit)) {
            long jRoundToLong = MathKt.roundToLong(dConvertDurationUnit);
            if (-4611686018426999999L <= jRoundToLong && jRoundToLong < 4611686018427000000L) {
                return durationOfNanos(jRoundToLong);
            }
            return durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d4, unit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }
}
