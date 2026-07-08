package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes.dex */
final class UndispatchedContextCollector<T> implements FlowCollector<T> {
    private final Object countOrElement;
    private final CoroutineContext emitContext;
    private final Function2<T, Continuation<? super Unit>, Object> emitRef;

    public UndispatchedContextCollector(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = ThreadContextKt.threadContextElements(coroutineContext);
        this.emitRef = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t3, Continuation<? super Unit> continuation) {
        Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(this.emitContext, t3, this.countOrElement, this.emitRef, continuation);
        return objWithContextUndispatched == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContextUndispatched : Unit.INSTANCE;
    }
}
