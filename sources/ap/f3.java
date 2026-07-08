package ap;

import android.annotation.SuppressLint;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
public final class f3<T> implements i4<T> {
    public final CoroutineContext n3;
    public gv<T> y;

    @DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {99}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ f3<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(f3<T> f3Var, T t3, Continuation<? super y> continuation) {
            super(2, continuation);
            this.this$0 = f3Var;
            this.$value = t3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new y(this.this$0, this.$value, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                gv<T> gvVarY = this.this$0.y();
                this.label = 1;
                if (gvVarY.gv(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.y().setValue(this.$value);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public f3(gv<T> target, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.y = target;
        this.n3 = context.plus(Dispatchers.getMain().getImmediate());
    }

    @Override // ap.i4
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t3, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.n3, new y(this, t3, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final gv<T> y() {
        return this.y;
    }
}
