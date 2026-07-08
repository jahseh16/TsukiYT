package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes.dex */
public final class SegmentOrClosed<S extends Segment<S>> {
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <S extends Segment<S>> Object m212constructorimpl(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: getSegment-impl, reason: not valid java name */
    public static final S m213getSegmentimpl(Object obj) {
        if (obj == ConcurrentLinkedListKt.CLOSED) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m214isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedListKt.CLOSED;
    }
}
