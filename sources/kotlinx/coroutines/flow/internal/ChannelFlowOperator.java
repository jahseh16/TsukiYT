package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    protected final Flow<S> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2, reason: invalid class name */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlowOperator<S, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChannelFlowOperator<S, T> channelFlowOperator, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = channelFlowOperator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector<? super T> flowCollector = (FlowCollector) this.L$0;
                ChannelFlowOperator<S, T> channelFlowOperator = this.this$0;
                this.label = 1;
                if (channelFlowOperator.flowCollect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(Flow<? extends S> flow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.flow = flow;
    }

    public static /* synthetic */ <S, T> Object collect$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        if (channelFlowOperator.capacity == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(context, channelFlowOperator.context);
            if (Intrinsics.areEqual(coroutineContextNewCoroutineContext, context)) {
                Object objFlowCollect = channelFlowOperator.flowCollect(flowCollector, continuation);
                return objFlowCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFlowCollect : Unit.INSTANCE;
            }
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual(coroutineContextNewCoroutineContext.get(key), context.get(key))) {
                Object objCollectWithContextUndispatched = channelFlowOperator.collectWithContextUndispatched(flowCollector, coroutineContextNewCoroutineContext, continuation);
                return objCollectWithContextUndispatched == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectWithContextUndispatched : Unit.INSTANCE;
            }
        }
        Object objCollect = super.collect(flowCollector, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static /* synthetic */ <S, T> Object collectTo$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        Object objFlowCollect = channelFlowOperator.flowCollect(new SendingCollector(producerScope), continuation);
        return objFlowCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFlowCollect : Unit.INSTANCE;
    }

    private final Object collectWithContextUndispatched(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        Object objWithContextUndispatched$default = ChannelFlowKt.withContextUndispatched$default(coroutineContext, ChannelFlowKt.withUndispatchedContextCollector(flowCollector, continuation.getContext()), null, new AnonymousClass2(this, null), continuation, 4, null);
        return objWithContextUndispatched$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContextUndispatched$default : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return collect$suspendImpl((ChannelFlowOperator) this, (FlowCollector) flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return collectTo$suspendImpl(this, producerScope, continuation);
    }

    public abstract Object flowCollect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
