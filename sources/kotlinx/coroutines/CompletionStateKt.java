package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;

/* JADX INFO: loaded from: classes.dex */
public final class CompletionStateKt {
    public static final <T> Object recoverResult(Object obj, Continuation<? super T> continuation) {
        if (!(obj instanceof CompletedExceptionally)) {
            return Result.m31constructorimpl(obj);
        }
        Result.Companion companion = Result.Companion;
        Throwable thRecoverFromStackFrame = ((CompletedExceptionally) obj).cause;
        if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
            thRecoverFromStackFrame = StackTraceRecoveryKt.recoverFromStackFrame(thRecoverFromStackFrame, (CoroutineStackFrame) continuation);
        }
        return Result.m31constructorimpl(ResultKt.createFailure(thRecoverFromStackFrame));
    }

    public static final <T> Object toState(Object obj, Function1<? super Throwable, Unit> function1) {
        Throwable thM34exceptionOrNullimpl = Result.m34exceptionOrNullimpl(obj);
        return thM34exceptionOrNullimpl == null ? function1 != null ? new CompletedWithCancellation(obj, function1) : obj : new CompletedExceptionally(thM34exceptionOrNullimpl, false, 2, null);
    }

    public static /* synthetic */ Object toState$default(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return toState(obj, (Function1<? super Throwable, Unit>) function1);
    }

    public static final <T> Object toState(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable thM34exceptionOrNullimpl = Result.m34exceptionOrNullimpl(obj);
        if (thM34exceptionOrNullimpl != null) {
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuation instanceof CoroutineStackFrame)) {
                thM34exceptionOrNullimpl = StackTraceRecoveryKt.recoverFromStackFrame(thM34exceptionOrNullimpl, (CoroutineStackFrame) cancellableContinuation);
            }
            obj = new CompletedExceptionally(thM34exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }
}
