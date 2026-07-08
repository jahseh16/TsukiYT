package ap;

import ap.t;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import yc.n3;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {81}, m = "invokeSuspend")
    public static final class n3<T> extends SuspendLambda implements Function2<i4<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        public static final class y<T> implements FlowCollector {
            public final /* synthetic */ i4<T> y;

            public y(i4<T> i4Var) {
                this.y = i4Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t3, Continuation<? super Unit> continuation) {
                Object objEmit = this.y.emit(t3, continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n3(Flow<? extends T> flow, Continuation<? super n3> continuation) {
            super(2, continuation);
            this.$this_asLiveData = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n3 n3Var = new n3(this.$this_asLiveData, continuation);
            n3Var.L$0 = obj;
            return n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i4 i4Var = (i4) this.L$0;
                Flow<T> flow = this.$this_asLiveData;
                y yVar = new y(i4Var);
                this.label = 1;
                if (flow.collect(yVar, this) == coroutine_suspended) {
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
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i4<T> i4Var, Continuation<? super Unit> continuation) {
            return ((n3) create(i4Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {112, 116}, m = "invokeSuspend")
    public static final class y<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ androidx.lifecycle.xc<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public static final class n3 extends Lambda implements Function0<Unit> {
            final /* synthetic */ fh<T> $observer;
            final /* synthetic */ androidx.lifecycle.xc<T> $this_asFlow;

            /* JADX INFO: renamed from: ap.t$y$n3$y, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
            public static final class C0032y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ fh<T> $observer;
                final /* synthetic */ androidx.lifecycle.xc<T> $this_asFlow;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0032y(androidx.lifecycle.xc<T> xcVar, fh<T> fhVar, Continuation<? super C0032y> continuation) {
                    super(2, continuation);
                    this.$this_asFlow = xcVar;
                    this.$observer = fhVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0032y(this.$this_asFlow, this.$observer, continuation);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$this_asFlow.removeObserver((fh<? super T>) this.$observer);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0032y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n3(androidx.lifecycle.xc<T> xcVar, fh<T> fhVar) {
                super(0);
                this.$this_asFlow = xcVar;
                this.$observer = fhVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new C0032y(this.$this_asFlow, this.$observer, null), 2, null);
            }
        }

        /* JADX INFO: renamed from: ap.t$y$y, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        public static final class C0033y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ fh<T> $observer;
            final /* synthetic */ androidx.lifecycle.xc<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0033y(androidx.lifecycle.xc<T> xcVar, fh<T> fhVar, Continuation<? super C0033y> continuation) {
                super(2, continuation);
                this.$this_asFlow = xcVar;
                this.$observer = fhVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0033y(this.$this_asFlow, this.$observer, continuation);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$this_asFlow.observeForever((fh<? super T>) this.$observer);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0033y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(androidx.lifecycle.xc<T> xcVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.$this_asFlow = xcVar;
        }

        public static final void n3(ProducerScope producerScope, Object obj) {
            producerScope.mo187trySendJP2dKIU(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = new y(this.$this_asFlow, continuation);
            yVar.L$0 = obj;
            return yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            fh fhVar;
            ProducerScope producerScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope2 = (ProducerScope) this.L$0;
                fhVar = new fh() { // from class: ap.f
                    @Override // ap.fh
                    public final void onChanged(Object obj2) {
                        t.y.n3(producerScope2, obj2);
                    }
                };
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                C0033y c0033y = new C0033y(this.$this_asFlow, fhVar, null);
                this.L$0 = producerScope2;
                this.L$1 = fhVar;
                this.label = 1;
                if (BuildersKt.withContext(immediate, c0033y, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                fhVar = (fh) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            n3 n3Var = new n3(this.$this_asFlow, fhVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (ProduceKt.awaitClose(producerScope, n3Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
            return ((y) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> androidx.lifecycle.xc<T> n3(Flow<? extends T> flow, CoroutineContext context, long j) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        n3.y yVar = (androidx.lifecycle.xc<T>) v.y(context, j, new n3(flow, null));
        if (flow instanceof StateFlow) {
            if (p.zn.s().zn()) {
                yVar.setValue(((StateFlow) flow).getValue());
            } else {
                yVar.postValue(((StateFlow) flow).getValue());
            }
        }
        return yVar;
    }

    public static final <T> Flow<T> y(androidx.lifecycle.xc<T> xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return FlowKt.conflate(FlowKt.callbackFlow(new y(xcVar, null)));
    }

    public static /* synthetic */ androidx.lifecycle.xc zn(Flow flow, CoroutineContext coroutineContext, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return n3(flow, coroutineContext, j);
    }
}
