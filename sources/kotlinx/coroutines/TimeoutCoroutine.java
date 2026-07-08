package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: loaded from: classes.dex */
final class TimeoutCoroutine<U, T extends U> extends ScopeCoroutine<T> implements Runnable {
    public final long time;

    public TimeoutCoroutine(long j, Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.time = j;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    public String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core() + "(timeMillis=" + this.time + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        cancelCoroutine(TimeoutKt.TimeoutCancellationException(this.time, DelayKt.getDelay(getContext()), this));
    }
}
