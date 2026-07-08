package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  DailyTube_5.6.50.101.apk:DebugProbesKt.bin
  classes.dex
 */
/* JADX INFO: loaded from: classes.dex */
public final class DebugProbesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Continuation<T> probeCoroutineCreated(Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return completion;
    }

    public static final void probeCoroutineResumed(Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    public static final void probeCoroutineSuspended(Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }
}
