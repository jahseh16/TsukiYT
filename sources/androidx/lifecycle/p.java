package androidx.lifecycle;

import androidx.lifecycle.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
    public static final class y<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
        final /* synthetic */ s.n3 $minState;
        final /* synthetic */ s $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(s sVar, s.n3 n3Var, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super y> continuation) {
            super(2, continuation);
            this.$this_whenStateAtLeast = sVar;
            this.$minState = n3Var;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = new y(this.$this_whenStateAtLeast, this.$minState, this.$block, continuation);
            yVar.L$0 = obj;
            return yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            c5 c5Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5Var = (c5) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c5Var.n3();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    c5Var.n3();
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            Job job = (Job) ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.Key);
            if (job == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            ap.rz rzVar = new ap.rz();
            c5 c5Var2 = new c5(this.$this_whenStateAtLeast, this.$minState, rzVar.y, job);
            try {
                Function2<CoroutineScope, Continuation<? super T>, Object> function2 = this.$block;
                this.L$0 = c5Var2;
                this.label = 1;
                obj = BuildersKt.withContext(rzVar, function2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c5Var = c5Var2;
                c5Var.n3();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c5Var = c5Var2;
                c5Var.n3();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final <T> Object gv(s sVar, s.n3 n3Var, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new y(sVar, n3Var, function2, null), continuation);
    }

    public static final <T> Object n3(s sVar, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return gv(sVar, s.n3.RESUMED, function2, continuation);
    }

    public static final <T> Object y(s sVar, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return gv(sVar, s.n3.CREATED, function2, continuation);
    }

    public static final <T> Object zn(s sVar, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return gv(sVar, s.n3.STARTED, function2, continuation);
    }
}
