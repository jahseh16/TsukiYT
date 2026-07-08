package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface CancellableContinuation<T> extends Continuation<T> {

    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return cancellableContinuation.cancel(th);
        }
    }

    boolean cancel(Throwable th);

    void completeResume(Object obj);

    void invokeOnCancellation(Function1<? super Throwable, Unit> function1);

    boolean isCompleted();

    void resume(T t3, Function1<? super Throwable, Unit> function1);

    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t3);

    Object tryResume(T t3, Object obj, Function1<? super Throwable, Unit> function1);

    Object tryResumeWithException(Throwable th);
}
