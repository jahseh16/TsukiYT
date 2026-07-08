package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o0.r;

/* JADX INFO: loaded from: classes.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m136constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m165getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m166getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m167getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m168parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e4);
            }
        }

        private Companion() {
        }
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m132addValuesMixedRangesUwyO8pc(long j, long j4, long j7) {
        long jNanosToMillis = DurationKt.nanosToMillis(j7);
        long j8 = j4 + jNanosToMillis;
        if (-4611686018426L > j8 || j8 >= 4611686018427L) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(j8, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j8) + (j7 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m133appendFractionalimpl(long j, StringBuilder sb, int i, int i5, int i8, String str, boolean z) {
        sb.append(i);
        if (i5 != 0) {
            sb.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i5), i8, '0');
            int i10 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z || i12 >= 3) {
                sb.append((CharSequence) strPadStart, 0, ((i10 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, i12);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m134boximpl(long j) {
        return new Duration(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m136constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m154isInNanosimpl(j)) {
                long jM150getValueimpl = m150getValueimpl(j);
                if (-4611686018426999999L > jM150getValueimpl || jM150getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m150getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM150getValueimpl2 = m150getValueimpl(j);
                if (-4611686018427387903L > jM150getValueimpl2 || jM150getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m150getValueimpl(j) + " ms is out of milliseconds range");
                }
                long jM150getValueimpl3 = m150getValueimpl(j);
                if (-4611686018426L <= jM150getValueimpl3 && jM150getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m150getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m137equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m164unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m138equalsimpl0(long j, long j4) {
        return j == j4;
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m139getAbsoluteValueUwyO8pc(long j) {
        return m156isNegativeimpl(j) ? m162unaryMinusUwyO8pc(j) : j;
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m140getHoursComponentimpl(long j) {
        if (m155isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m142getInWholeHoursimpl(j) % ((long) 24));
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m141getInWholeDaysimpl(long j) {
        return m160toLongimpl(j, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m142getInWholeHoursimpl(long j) {
        return m160toLongimpl(j, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m143getInWholeMillisecondsimpl(long j) {
        return (m153isInMillisimpl(j) && m152isFiniteimpl(j)) ? m150getValueimpl(j) : m160toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m144getInWholeMinutesimpl(long j) {
        return m160toLongimpl(j, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m145getInWholeSecondsimpl(long j) {
        return m160toLongimpl(j, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m146getMinutesComponentimpl(long j) {
        if (m155isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m144getInWholeMinutesimpl(j) % ((long) 60));
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m147getNanosecondsComponentimpl(long j) {
        if (m155isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m153isInMillisimpl(j) ? DurationKt.millisToNanos(m150getValueimpl(j) % ((long) 1000)) : m150getValueimpl(j) % ((long) 1000000000));
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m148getSecondsComponentimpl(long j) {
        if (m155isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m145getInWholeSecondsimpl(j) % ((long) 60));
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m149getStorageUnitimpl(long j) {
        return m154isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m150getValueimpl(long j) {
        return j >> 1;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m151hashCodeimpl(long j) {
        return r.y(j);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m152isFiniteimpl(long j) {
        return !m155isInfiniteimpl(j);
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m153isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m154isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m155isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m156isNegativeimpl(long j) {
        return j < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m157isPositiveimpl(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m158plusLRDsOJo(long j, long j4) {
        if (m155isInfiniteimpl(j)) {
            if (m152isFiniteimpl(j4) || (j4 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m155isInfiniteimpl(j4)) {
            return j4;
        }
        if ((((int) j) & 1) != (((int) j4) & 1)) {
            return m153isInMillisimpl(j) ? m132addValuesMixedRangesUwyO8pc(j, m150getValueimpl(j), m150getValueimpl(j4)) : m132addValuesMixedRangesUwyO8pc(j, m150getValueimpl(j4), m150getValueimpl(j));
        }
        long jM150getValueimpl = m150getValueimpl(j) + m150getValueimpl(j4);
        return m154isInNanosimpl(j) ? DurationKt.durationOfNanosNormalized(jM150getValueimpl) : DurationKt.durationOfMillisNormalized(jM150getValueimpl);
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m159toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m156isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM139getAbsoluteValueUwyO8pc = m139getAbsoluteValueUwyO8pc(j);
        long jM142getInWholeHoursimpl = m142getInWholeHoursimpl(jM139getAbsoluteValueUwyO8pc);
        int iM146getMinutesComponentimpl = m146getMinutesComponentimpl(jM139getAbsoluteValueUwyO8pc);
        int iM148getSecondsComponentimpl = m148getSecondsComponentimpl(jM139getAbsoluteValueUwyO8pc);
        int iM147getNanosecondsComponentimpl = m147getNanosecondsComponentimpl(jM139getAbsoluteValueUwyO8pc);
        if (m155isInfiniteimpl(j)) {
            jM142getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = false;
        boolean z5 = jM142getInWholeHoursimpl != 0;
        boolean z7 = (iM148getSecondsComponentimpl == 0 && iM147getNanosecondsComponentimpl == 0) ? false : true;
        if (iM146getMinutesComponentimpl != 0 || (z7 && z5)) {
            z = true;
        }
        if (z5) {
            sb.append(jM142getInWholeHoursimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(iM146getMinutesComponentimpl);
            sb.append('M');
        }
        if (z7 || (!z5 && !z)) {
            m133appendFractionalimpl(j, sb, iM148getSecondsComponentimpl, iM147getNanosecondsComponentimpl, 9, "S", true);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m160toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m150getValueimpl(j), m149getStorageUnitimpl(j), unit);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m161toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM156isNegativeimpl = m156isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM156isNegativeimpl) {
            sb.append('-');
        }
        long jM139getAbsoluteValueUwyO8pc = m139getAbsoluteValueUwyO8pc(j);
        long jM141getInWholeDaysimpl = m141getInWholeDaysimpl(jM139getAbsoluteValueUwyO8pc);
        int iM140getHoursComponentimpl = m140getHoursComponentimpl(jM139getAbsoluteValueUwyO8pc);
        int iM146getMinutesComponentimpl = m146getMinutesComponentimpl(jM139getAbsoluteValueUwyO8pc);
        int iM148getSecondsComponentimpl = m148getSecondsComponentimpl(jM139getAbsoluteValueUwyO8pc);
        int iM147getNanosecondsComponentimpl = m147getNanosecondsComponentimpl(jM139getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM141getInWholeDaysimpl != 0;
        boolean z5 = iM140getHoursComponentimpl != 0;
        boolean z7 = iM146getMinutesComponentimpl != 0;
        boolean z8 = (iM148getSecondsComponentimpl == 0 && iM147getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM141getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z5 || (z && (z7 || z8))) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM140getHoursComponentimpl);
            sb.append('h');
            i = i5;
        }
        if (z7 || (z8 && (z5 || z))) {
            int i8 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM146getMinutesComponentimpl);
            sb.append('m');
            i = i8;
        }
        if (z8) {
            int i10 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM148getSecondsComponentimpl != 0 || z || z5 || z7) {
                m133appendFractionalimpl(j, sb, iM148getSecondsComponentimpl, iM147getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM147getNanosecondsComponentimpl >= 1000000) {
                m133appendFractionalimpl(j, sb, iM147getNanosecondsComponentimpl / 1000000, iM147getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM147getNanosecondsComponentimpl >= 1000) {
                m133appendFractionalimpl(j, sb, iM147getNanosecondsComponentimpl / 1000, iM147getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM147getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i10;
        }
        if (zM156isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m162unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m150getValueimpl(j), ((int) j) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m163compareToLRDsOJo(duration.m164unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m163compareToLRDsOJo(long j) {
        return m135compareToLRDsOJo(this.rawValue, j);
    }

    public boolean equals(Object obj) {
        return m137equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m151hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m161toStringimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m164unboximpl() {
        return this.rawValue;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m135compareToLRDsOJo(long j, long j4) {
        long j7 = j ^ j4;
        if (j7 < 0 || (((int) j7) & 1) == 0) {
            return Intrinsics.compare(j, j4);
        }
        int i = (((int) j) & 1) - (((int) j4) & 1);
        return m156isNegativeimpl(j) ? -i : i;
    }
}
