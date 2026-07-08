package ap;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class n3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Job f1177a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Job f1178fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final CoroutineScope f1179gv;
    public final Function2<i4<T>, Continuation<? super Unit>, Object> n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Function0<Unit> f1180v;
    public final gv<T> y;
    public final long zn;

    /* JADX INFO: renamed from: ap.n3$n3, reason: collision with other inner class name */
    @DebugMetadata(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
    public static final class C0031n3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ n3<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0031n3(n3<T> n3Var, Continuation<? super C0031n3> continuation) {
            super(2, continuation);
            this.this$0 = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0031n3 c0031n3 = new C0031n3(this.this$0, continuation);
            c0031n3.L$0 = obj;
            return c0031n3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                f3 f3Var = new f3(this.this$0.y, ((CoroutineScope) this.L$0).getCoroutineContext());
                Function2 function2 = this.this$0.n3;
                this.label = 1;
                if (function2.invoke(f3Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f1180v.invoke();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0031n3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ n3<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(n3<T> n3Var, Continuation<? super y> continuation) {
            super(2, continuation);
            this.this$0 = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new y(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.this$0.zn;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!this.this$0.y.hasActiveObservers()) {
                Job job = this.this$0.f1177a;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                this.this$0.f1177a = null;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n3(gv<T> liveData, Function2<? super i4<T>, ? super Continuation<? super Unit>, ? extends Object> block, long j, CoroutineScope scope, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.y = liveData;
        this.n3 = block;
        this.zn = j;
        this.f1179gv = scope;
        this.f1180v = onDone;
    }

    public final void fb() {
        if (this.f1178fb != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        this.f1178fb = BuildersKt__Builders_commonKt.launch$default(this.f1179gv, Dispatchers.getMain().getImmediate(), null, new y(this, null), 2, null);
    }

    public final void s() {
        Job job = this.f1178fb;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.f1178fb = null;
        if (this.f1177a != null) {
            return;
        }
        this.f1177a = BuildersKt__Builders_commonKt.launch$default(this.f1179gv, null, null, new C0031n3(this, null), 3, null);
    }
}
