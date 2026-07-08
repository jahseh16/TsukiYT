package kotlin.time;

import kotlin.time.TimeSource;

/* JADX INFO: loaded from: classes.dex */
public final class MonotonicTimeSource implements TimeSource {
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    /* JADX INFO: renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m169differenceBetweenfRLX17w(long j, long j4) {
        return LongSaturatedMathKt.saturatingOriginsDiff(j, j4, DurationUnit.NANOSECONDS);
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ TimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m172boximpl(m170markNowz9LOYto());
    }

    /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m170markNowz9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.m173constructorimpl(read());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
