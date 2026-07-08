package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    public static final class DefaultImpls {
        public static int compareTo(ComparableTimeMark comparableTimeMark, ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m135compareToLRDsOJo(comparableTimeMark.mo131minusUwyO8pc(other), Duration.Companion.m167getZEROUwyO8pc());
        }
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    long mo131minusUwyO8pc(ComparableTimeMark comparableTimeMark);
}
