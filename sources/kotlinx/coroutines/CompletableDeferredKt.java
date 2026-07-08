package kotlinx.coroutines;

import kotlin.Result;

/* JADX INFO: loaded from: classes.dex */
public final class CompletableDeferredKt {
    public static final <T> CompletableDeferred<T> CompletableDeferred(Job job) {
        return new CompletableDeferredImpl(job);
    }

    public static /* synthetic */ CompletableDeferred CompletableDeferred$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean completeWith(CompletableDeferred<T> completableDeferred, Object obj) {
        Throwable thM34exceptionOrNullimpl = Result.m34exceptionOrNullimpl(obj);
        return thM34exceptionOrNullimpl == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(thM34exceptionOrNullimpl);
    }
}
