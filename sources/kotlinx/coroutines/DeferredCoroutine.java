package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: loaded from: classes.dex */
class DeferredCoroutine<T> extends AbstractCoroutine<T> implements Deferred<T> {
    public DeferredCoroutine(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    public static /* synthetic */ <T> Object await$suspendImpl(DeferredCoroutine<T> deferredCoroutine, Continuation<? super T> continuation) throws Throwable {
        Object objAwaitInternal = deferredCoroutine.awaitInternal(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objAwaitInternal;
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(Continuation<? super T> continuation) {
        return await$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public SelectClause1<T> getOnAwait() {
        SelectClause1<T> selectClause1 = (SelectClause1<T>) getOnAwaitInternal();
        Intrinsics.checkNotNull(selectClause1, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return selectClause1;
    }
}
