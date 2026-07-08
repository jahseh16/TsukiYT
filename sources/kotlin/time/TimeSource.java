package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import o0.r;

/* JADX INFO: loaded from: classes.dex */
public interface TimeSource {

    public static final class Monotonic implements TimeSource {
        public static final Monotonic INSTANCE = new Monotonic();

        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j) {
                this.reading = j;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m172boximpl(long j) {
                return new ValueTimeMark(j);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m173constructorimpl(long j) {
                return j;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m174equalsimpl(long j, Object obj) {
                return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).m179unboximpl();
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m175hashCodeimpl(long j) {
                return r.y(j);
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m176minus6eNON_k(long j, long j4) {
                return MonotonicTimeSource.INSTANCE.m169differenceBetweenfRLX17w(j, j4);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m178toStringimpl(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            public boolean equals(Object obj) {
                return m174equalsimpl(this.reading, obj);
            }

            public int hashCode() {
                return m175hashCodeimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo131minusUwyO8pc(ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m177minusUwyO8pc(this.reading, other);
            }

            public String toString() {
                return m178toStringimpl(this.reading);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m179unboximpl() {
                return this.reading;
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m177minusUwyO8pc(long j, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m176minus6eNON_k(j, ((ValueTimeMark) other).m179unboximpl());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m178toStringimpl(j)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m172boximpl(m171markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m171markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m170markNowz9LOYto();
        }

        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }
    }

    TimeMark markNow();
}
