package pl1;

import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements pl1.a<T> {
        public final /* synthetic */ CancellableContinuation<b<T>> y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super b<T>> cancellableContinuation) {
            this.y = cancellableContinuation;
        }

        @Override // pl1.a
        public void n3(pl1.gv<T> call, Throwable t3) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t3, "t");
            CancellableContinuation<b<T>> cancellableContinuation = this.y;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(t3)));
        }

        @Override // pl1.a
        public void y(pl1.gv<T> call, b<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.y.resumeWith(Result.m31constructorimpl(response));
        }
    }

    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    public static final class fb extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public fb(Continuation<? super fb> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return f3.v(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class gv<T> implements pl1.a<T> {
        public final /* synthetic */ CancellableContinuation<T> y;

        /* JADX WARN: Multi-variable type inference failed */
        public gv(CancellableContinuation<? super T> cancellableContinuation) {
            this.y = cancellableContinuation;
        }

        @Override // pl1.a
        public void n3(pl1.gv<T> call, Throwable t3) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t3, "t");
            CancellableContinuation<T> cancellableContinuation = this.y;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(t3)));
        }

        @Override // pl1.a
        public void y(pl1.gv<T> call, b<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.gv()) {
                CancellableContinuation<T> cancellableContinuation = this.y;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m31constructorimpl(response.y()));
            } else {
                CancellableContinuation<T> cancellableContinuation2 = this.y;
                Result.Companion companion2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new r(response))));
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class n3<T> implements pl1.a<T> {
        public final /* synthetic */ CancellableContinuation<T> y;

        /* JADX WARN: Multi-variable type inference failed */
        public n3(CancellableContinuation<? super T> cancellableContinuation) {
            this.y = cancellableContinuation;
        }

        @Override // pl1.a
        public void n3(pl1.gv<T> call, Throwable t3) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t3, "t");
            CancellableContinuation<T> cancellableContinuation = this.y;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(t3)));
        }

        @Override // pl1.a
        public void y(pl1.gv<T> call, b<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.gv()) {
                CancellableContinuation<T> cancellableContinuation = this.y;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new r(response))));
                return;
            }
            T tY = response.y();
            if (tY != null) {
                this.y.resumeWith(Result.m31constructorimpl(tY));
                return;
            }
            Object objF = call.y().f(i4.class);
            Intrinsics.checkNotNull(objF);
            i4 i4Var = (i4) objF;
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + i4Var.n3().getName() + '.' + i4Var.y().getName() + " was null but response body type was declared as non-null");
            CancellableContinuation<T> cancellableContinuation2 = this.y;
            Result.Companion companion2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
        }
    }

    public static final class s implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Throwable f7304v;
        public final /* synthetic */ Continuation<?> y;

        public s(Continuation<?> continuation, Throwable th) {
            this.y = continuation;
            this.f7304v = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(this.y);
            Result.Companion companion = Result.Companion;
            continuationIntercepted.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(this.f7304v)));
        }
    }

    public static final class v extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ pl1.gv<T> $this_awaitResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(pl1.gv<T> gvVar) {
            super(1);
            this.$this_awaitResponse = gvVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.$this_awaitResponse.cancel();
        }
    }

    public static final class y extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ pl1.gv<T> $this_await;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(pl1.gv<T> gvVar) {
            super(1);
            this.$this_await = gvVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.$this_await.cancel();
        }
    }

    public static final class zn extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ pl1.gv<T> $this_await;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zn(pl1.gv<T> gvVar) {
            super(1);
            this.$this_await = gvVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.$this_await.cancel();
        }
    }

    public static final Object gv(pl1.gv<Unit> gvVar, Continuation<? super Unit> continuation) {
        Intrinsics.checkNotNull(gvVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return n3(gvVar, continuation);
    }

    public static final <T> Object n3(pl1.gv<T> gvVar, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new zn(gvVar));
        gvVar.a(new gv(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(java.lang.Throwable r4, kotlin.coroutines.Continuation<?> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof pl1.f3.fb
            if (r0 == 0) goto L13
            r0 = r5
            pl1.f3$fb r0 = (pl1.f3.fb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            pl1.f3$fb r0 = new pl1.f3$fb
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5c
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            pl1.f3$s r3 = new pl1.f3$s
            r3.<init>(r0, r4)
            r5.mo210dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.f3.v(java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object y(pl1.gv<T> gvVar, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new y(gvVar));
        gvVar.a(new n3(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> Object zn(pl1.gv<T> gvVar, Continuation<? super b<T>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new v(gvVar));
        gvVar.a(new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
