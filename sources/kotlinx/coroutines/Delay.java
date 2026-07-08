package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public interface Delay {

    public static final class DefaultImpls {
        public static DisposableHandle invokeOnTimeout(Delay delay, long j, Runnable runnable, CoroutineContext coroutineContext) {
            return DefaultExecutorKt.getDefaultDelay().invokeOnTimeout(j, runnable, coroutineContext);
        }
    }

    DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext);

    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    void mo211scheduleResumeAfterDelay(long j, CancellableContinuation<? super Unit> cancellableContinuation);
}
