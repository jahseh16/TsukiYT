package kotlinx.coroutines.rx2;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import wi1.y;

/* JADX INFO: loaded from: classes.dex */
public final class RxCancellableKt {
    public static final void handleUndeliverableException(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            y.xc(th);
        } catch (Throwable th2) {
            ExceptionsKt.addSuppressed(th, th2);
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, th);
        }
    }
}
