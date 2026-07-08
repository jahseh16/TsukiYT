package androidx.lifecycle;

import androidx.lifecycle.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends ap.wz implements t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CoroutineContext f836v;
    public final s y;

    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public y(Continuation<? super y> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = i9.this.new y(continuation);
            yVar.L$0 = obj;
            return yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (i9.this.y().n3().compareTo(s.n3.INITIALIZED) >= 0) {
                i9.this.y().y(i9.this);
            } else {
                JobKt__JobKt.cancel$default(coroutineScope.getCoroutineContext(), null, 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public i9(s lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.y = lifecycle;
        this.f836v = coroutineContext;
        if (y().n3() == s.n3.DESTROYED) {
            JobKt__JobKt.cancel$default(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f836v;
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(ap.mt source, s.y event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (y().n3().compareTo(s.n3.DESTROYED) <= 0) {
            y().gv(this);
            JobKt__JobKt.cancel$default(getCoroutineContext(), null, 1, null);
        }
    }

    public final void v() {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain().getImmediate(), null, new y(null), 2, null);
    }

    @Override // ap.wz
    public s y() {
        return this.y;
    }
}
