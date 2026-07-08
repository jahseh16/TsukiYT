package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: loaded from: classes.dex */
final class CompletableDeferredImpl<T> extends JobSupport implements CompletableDeferred<T> {
    public CompletableDeferredImpl(Job job) {
        super(true);
        initParentJob(job);
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(Continuation<? super T> continuation) throws Throwable {
        Object objAwaitInternal = awaitInternal(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objAwaitInternal;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean complete(T t3) {
        return makeCompleting$kotlinx_coroutines_core(t3);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean completeExceptionally(Throwable th) {
        return makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public SelectClause1<T> getOnAwait() {
        SelectClause1<T> selectClause1 = (SelectClause1<T>) getOnAwaitInternal();
        Intrinsics.checkNotNull(selectClause1, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return selectClause1;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
