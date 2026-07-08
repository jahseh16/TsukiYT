package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TimedValue<T> {
    private final long duration;
    private final T value;

    public /* synthetic */ TimedValue(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) obj;
        return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m138equalsimpl0(this.duration, timedValue.duration);
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m180getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t3 = this.value;
        return ((t3 == null ? 0 : t3.hashCode()) * 31) + Duration.m151hashCodeimpl(this.duration);
    }

    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m161toStringimpl(this.duration)) + ')';
    }

    private TimedValue(T t3, long j) {
        this.value = t3;
        this.duration = j;
    }
}
