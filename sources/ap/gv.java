package ap;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: loaded from: classes.dex */
public final class gv<T> extends n<T> {
    public ap.n3<T> n3;

    @DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {235}, m = "clearSource$lifecycle_livedata_release")
    public static final class n3 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ gv<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(gv<T> gvVar, Continuation<? super n3> continuation) {
            super(continuation);
            this.this$0 = gvVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.gv(this);
        }
    }

    public static final class y extends Lambda implements Function0<Unit> {
        final /* synthetic */ gv<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(gv<T> gvVar) {
            super(0);
            this.this$0 = gvVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.n3 = null;
        }
    }

    public gv(CoroutineContext context, long j, Function2<? super i4<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.n3 = new ap.n3<>(this, block, j, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(context).plus(SupervisorKt.SupervisorJob((Job) context.get(Job.Key)))), new y(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ap.gv.n3
            if (r0 == 0) goto L13
            r0 = r5
            ap.gv$n3 r0 = (ap.gv.n3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ap.gv$n3 r0 = new ap.gv$n3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            if (r1 == 0) goto L34
            r2 = 1
            if (r1 != r2) goto L2c
            java.lang.Object r0 = r0.L$0
            ap.gv r0 = (ap.gv) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L38
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r5)
            r0 = r4
        L38:
            r0.getClass()
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.gv.gv(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ap.n, androidx.lifecycle.xc
    public void onActive() {
        super.onActive();
        ap.n3<T> n3Var = this.n3;
        if (n3Var != null) {
            n3Var.s();
        }
    }

    @Override // ap.n, androidx.lifecycle.xc
    public void onInactive() {
        super.onInactive();
        ap.n3<T> n3Var = this.n3;
        if (n3Var != null) {
            n3Var.fb();
        }
    }
}
