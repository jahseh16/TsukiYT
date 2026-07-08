package jl1;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final <T> Pair<T, Double> n3(Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(code, "code");
        TimedValue timedValue = new TimedValue(code.invoke(), TimeSource.Monotonic.INSTANCE.markNow().elapsedNow-UwyO8pc(), null);
        return new Pair<>(timedValue.getValue(), Double.valueOf(Duration.toDouble-impl(timedValue.m180getDurationUwyO8pc(), TimeUnit.MILLISECONDS)));
    }

    public static final double y(Function0<Unit> code) {
        Intrinsics.checkNotNullParameter(code, "code");
        TimeMark timeMarkMarkNow = TimeSource.Monotonic.INSTANCE.markNow();
        code.invoke();
        return Duration.toDouble-impl(timeMarkMarkNow.elapsedNow-UwyO8pc(), TimeUnit.MILLISECONDS);
    }
}
