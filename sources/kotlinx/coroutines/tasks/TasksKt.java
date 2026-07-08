package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class TasksKt {
    public static final <T> Object await(Task<T> task, Continuation<? super T> continuation) {
        return awaitImpl(task, null, continuation);
    }

    private static final <T> Object awaitImpl(Task<T> task, final CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) throws Exception {
        if (!task.isComplete()) {
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            task.addOnCompleteListener(DirectExecutor.INSTANCE, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task<T> task2) {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        Continuation continuation2 = cancellableContinuationImpl;
                        Result.Companion companion = Result.Companion;
                        continuation2.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(exception)));
                    } else {
                        if (task2.isCanceled()) {
                            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
                            return;
                        }
                        Continuation continuation3 = cancellableContinuationImpl;
                        Result.Companion companion2 = Result.Companion;
                        continuation3.resumeWith(Result.m31constructorimpl(task2.getResult()));
                    }
                }
            });
            if (cancellationTokenSource != null) {
                cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        cancellationTokenSource.cancel();
                    }
                });
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
