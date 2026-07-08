package androidx.lifecycle;

import androidx.lifecycle.s;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class mg {

    public static final class n3 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ CoroutineDispatcher $lifecycleDispatcher;
        final /* synthetic */ zn $observer;
        final /* synthetic */ s $this_suspendWithStateAtLeastUnchecked;

        public static final class y implements Runnable {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ zn f837v;
            public final /* synthetic */ s y;

            public y(s sVar, zn znVar) {
                this.y = sVar;
                this.f837v = znVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.y.gv(this.f837v);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(CoroutineDispatcher coroutineDispatcher, s sVar, zn znVar) {
            super(1);
            this.$lifecycleDispatcher = coroutineDispatcher;
            this.$this_suspendWithStateAtLeastUnchecked = sVar;
            this.$observer = znVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            CoroutineDispatcher coroutineDispatcher = this.$lifecycleDispatcher;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext)) {
                this.$lifecycleDispatcher.mo210dispatch(emptyCoroutineContext, new y(this.$this_suspendWithStateAtLeastUnchecked, this.$observer));
            } else {
                this.$this_suspendWithStateAtLeastUnchecked.gv(this.$observer);
            }
        }
    }

    public static final class y implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ zn f838v;
        public final /* synthetic */ s y;

        public y(s sVar, zn znVar) {
            this.y = sVar;
            this.f838v = znVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.y.y(this.f838v);
        }
    }

    public static final class zn implements t {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<R> f839fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Function0<R> f840s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ s f841v;
        public final /* synthetic */ s.n3 y;

        /* JADX WARN: Multi-variable type inference failed */
        public zn(s.n3 n3Var, s sVar, CancellableContinuation<? super R> cancellableContinuation, Function0<? extends R> function0) {
            this.y = n3Var;
            this.f841v = sVar;
            this.f839fb = cancellableContinuation;
            this.f840s = function0;
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(ap.mt mtVar, s.y yVar) {
            Object objM31constructorimpl;
            if (yVar != s.y.Companion.zn(this.y)) {
                if (yVar == s.y.ON_DESTROY) {
                    this.f841v.gv(this);
                    Continuation continuation = this.f839fb;
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new ap.xc())));
                    return;
                }
                return;
            }
            this.f841v.gv(this);
            Continuation continuation2 = this.f839fb;
            Function0<R> function0 = this.f840s;
            try {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            continuation2.resumeWith(objM31constructorimpl);
        }
    }

    public static final <R> Object y(s sVar, s.n3 n3Var, boolean z, CoroutineDispatcher coroutineDispatcher, Function0<? extends R> function0, Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        zn znVar = new zn(n3Var, sVar, cancellableContinuationImpl, function0);
        if (z) {
            coroutineDispatcher.mo210dispatch(EmptyCoroutineContext.INSTANCE, new y(sVar, znVar));
        } else {
            sVar.y(znVar);
        }
        cancellableContinuationImpl.invokeOnCancellation(new n3(coroutineDispatcher, sVar, znVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
