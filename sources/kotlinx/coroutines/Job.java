package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface Job extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(Job job, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            job.cancel(cancellationException);
        }

        public static <R> R fold(Job job, R r3, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(job, r3, function2);
        }

        public static <E extends CoroutineContext.Element> E get(Job job, CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(job, key);
        }

        public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z, boolean z5, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z5 = true;
            }
            return job.invokeOnCompletion(z, z5, function1);
        }

        public static CoroutineContext minusKey(Job job, CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(job, key);
        }

        public static CoroutineContext plus(Job job, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(job, coroutineContext);
        }
    }

    public static final class Key implements CoroutineContext.Key<Job> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    ChildHandle attachChild(ChildJob childJob);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    Job getParent();

    DisposableHandle invokeOnCompletion(Function1<? super Throwable, Unit> function1);

    DisposableHandle invokeOnCompletion(boolean z, boolean z5, Function1<? super Throwable, Unit> function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation<? super Unit> continuation);

    boolean start();
}
