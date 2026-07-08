package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: loaded from: classes.dex */
public final class DebugStringsKt {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(Continuation<?> continuation) {
        Object objM31constructorimpl;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(continuation + '@' + getHexAddress(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m34exceptionOrNullimpl(objM31constructorimpl) != null) {
            objM31constructorimpl = continuation.getClass().getName() + '@' + getHexAddress(continuation);
        }
        return (String) objM31constructorimpl;
    }
}
