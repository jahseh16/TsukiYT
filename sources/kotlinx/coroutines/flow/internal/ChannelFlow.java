package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ChannelFlow<T> implements FusibleFlow<T> {
    public final int capacity;
    public final CoroutineContext context;
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FlowCollector<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlowCollector<? super T> flowCollector, ChannelFlow<T> channelFlow, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$collector = flowCollector;
            this.this$0 = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$collector, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FlowCollector<T> flowCollector = this.$collector;
                ReceiveChannel<T> receiveChannelProduceImpl = this.this$0.produceImpl(coroutineScope);
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, receiveChannelProduceImpl, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ChannelFlow(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        this.context = coroutineContext;
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (DebugKt.getASSERTIONS_ENABLED() && i == -1) {
            throw new AssertionError();
        }
    }

    public static /* synthetic */ <T> Object collect$suspendImpl(ChannelFlow<T> channelFlow, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(flowCollector, channelFlow, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public String additionalToStringProps() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    public abstract Object collectTo(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation);

    public abstract ChannelFlow<T> create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);

    public Flow<T> dropChannelOperators() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
        /*
            r1 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L10
            r0 = -1
            if (r3 == r0) goto La
            goto L10
        La:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L10:
            kotlin.coroutines.CoroutineContext r0 = r1.context
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 == r0) goto L1b
            goto L57
        L1b:
            int r4 = r1.capacity
            r0 = -3
            if (r4 != r0) goto L21
            goto L55
        L21:
            if (r3 != r0) goto L25
        L23:
            r3 = r4
            goto L55
        L25:
            r0 = -2
            if (r4 != r0) goto L29
            goto L55
        L29:
            if (r3 != r0) goto L2c
            goto L23
        L2c:
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 == 0) goto L3d
            int r4 = r1.capacity
            if (r4 < 0) goto L37
            goto L3d
        L37:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L3d:
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 == 0) goto L4c
            if (r3 < 0) goto L46
            goto L4c
        L46:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L4c:
            int r4 = r1.capacity
            int r3 = r3 + r4
            if (r3 < 0) goto L52
            goto L55
        L52:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L55:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.onBufferOverflow
        L57:
            kotlin.coroutines.CoroutineContext r0 = r1.context
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L68
            int r0 = r1.capacity
            if (r3 != r0) goto L68
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.onBufferOverflow
            if (r4 != r0) goto L68
            return r1
        L68:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.create(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlow.fuse(kotlin.coroutines.CoroutineContext, int, kotlinx.coroutines.channels.BufferOverflow):kotlinx.coroutines.flow.Flow");
    }

    public final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> getCollectToFun$kotlinx_coroutines_core() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce$default(coroutineScope, this.context, getProduceCapacity$kotlinx_coroutines_core(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, getCollectToFun$kotlinx_coroutines_core(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strAdditionalToStringProps = additionalToStringProps();
        if (strAdditionalToStringProps != null) {
            arrayList.add(strAdditionalToStringProps);
        }
        if (this.context != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return DebugStringsKt.getClassSimpleName(this) + '[' + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
