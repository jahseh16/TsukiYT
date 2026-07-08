package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: loaded from: classes.dex */
public final class FlowCoroutineKt {
    public static final <R> Object flowScope(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        FlowCoroutine flowCoroutine = new FlowCoroutine(continuation.getContext(), continuation);
        Object objStartUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(flowCoroutine, flowCoroutine, function2);
        if (objStartUndispatchedOrReturn == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objStartUndispatchedOrReturn;
    }

    public static final <R> Flow<R> scopedFlow(final Function3<? super CoroutineScope, ? super FlowCollector<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
                Object objFlowScope = FlowCoroutineKt.flowScope(new FlowCoroutineKt$scopedFlow$1$1(function3, flowCollector, null), continuation);
                return objFlowScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFlowScope : Unit.INSTANCE;
            }
        };
    }
}
