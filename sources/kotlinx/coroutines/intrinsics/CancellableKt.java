package kotlinx.coroutines.intrinsics;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: loaded from: classes.dex */
public final class CancellableKt {
    private static final void dispatcherFailure(Continuation<?> continuation, Throwable th) throws Throwable {
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
        throw th;
    }

    public static final <R, T> void startCoroutineCancellable(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r3, Continuation<? super T> continuation, Function1<? super Throwable, Unit> function1) throws Throwable {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, r3, continuation));
            Result.Companion companion = Result.Companion;
            DispatchedContinuationKt.resumeCancellableWith(continuationIntercepted, Result.m31constructorimpl(Unit.INSTANCE), function1);
        } catch (Throwable th) {
            dispatcherFailure(continuation, th);
        }
    }

    public static /* synthetic */ void startCoroutineCancellable$default(Function2 function2, Object obj, Continuation continuation, Function1 function1, int i, Object obj2) throws Throwable {
        if ((i & 4) != 0) {
            function1 = null;
        }
        startCoroutineCancellable(function2, obj, continuation, function1);
    }

    public static final void startCoroutineCancellable(Continuation<? super Unit> continuation, Continuation<?> continuation2) throws Throwable {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation);
            Result.Companion companion = Result.Companion;
            DispatchedContinuationKt.resumeCancellableWith$default(continuationIntercepted, Result.m31constructorimpl(Unit.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            dispatcherFailure(continuation2, th);
        }
    }
}
