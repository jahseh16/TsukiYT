package kotlinx.coroutines.reactive;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import ol1.n3;
import ol1.zn;

/* JADX INFO: loaded from: classes.dex */
final class ReactiveSubscriber<T> implements n3<T> {
    private final Channel<T> channel;
    private final long requestSize;
    private zn subscription;

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1, reason: invalid class name */
    @DebugMetadata(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", l = {129}, m = "takeNextOrNull")
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ReactiveSubscriber<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReactiveSubscriber<T> reactiveSubscriber, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = reactiveSubscriber;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.takeNextOrNull(this);
        }
    }

    public ReactiveSubscriber(int i, BufferOverflow bufferOverflow, long j) {
        this.requestSize = j;
        this.channel = ChannelKt.Channel$default(i == 0 ? 1 : i, bufferOverflow, null, 4, null);
    }

    public final void cancel() {
        zn znVar = this.subscription;
        if (znVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscription");
            znVar = null;
        }
        znVar.cancel();
    }

    public final void makeRequest() {
        zn znVar = this.subscription;
        if (znVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscription");
            znVar = null;
        }
        znVar.gv(this.requestSize);
    }

    @Override // ol1.n3
    public void onComplete() {
        SendChannel.DefaultImpls.close$default(this.channel, null, 1, null);
    }

    @Override // ol1.n3
    public void onError(Throwable th) {
        this.channel.close(th);
    }

    @Override // ol1.n3
    public void onNext(T t3) {
        if (ChannelResult.m195isSuccessimpl(this.channel.mo187trySendJP2dKIU(t3))) {
            return;
        }
        throw new IllegalArgumentException(("Element " + t3 + " was not added to channel because it was full, " + this.channel).toString());
    }

    @Override // ol1.n3
    public void onSubscribe(zn znVar) {
        this.subscription = znVar;
        makeRequest();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object takeNextOrNull(kotlin.coroutines.Continuation<? super T> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.ReactiveSubscriber.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = (kotlinx.coroutines.reactive.ReactiveSubscriber.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = new kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r5 = r5.m197unboximpl()
            goto L45
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.channels.Channel<T> r5 = r4.channel
            r0.label = r3
            java.lang.Object r5 = r5.mo185receiveCatchingJP2dKIU(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Throwable r0 = kotlinx.coroutines.channels.ChannelResult.m191exceptionOrNullimpl(r5)
            if (r0 != 0) goto L54
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 == 0) goto L53
            kotlinx.coroutines.channels.ChannelResult.m191exceptionOrNullimpl(r5)
            r5 = 0
        L53:
            return r5
        L54:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ReactiveSubscriber.takeNextOrNull(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
