package kotlinx.coroutines.rx2;

import ai1.x4;
import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;

/* JADX INFO: loaded from: classes.dex */
final class RxSingleCoroutine<T> extends AbstractCoroutine<T> {
    private final x4<T> subscriber;

    public RxSingleCoroutine(CoroutineContext coroutineContext, x4<T> x4Var) {
        super(coroutineContext, false, true);
        this.subscriber = x4Var;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th, boolean z) {
        try {
            if (this.subscriber.y(th)) {
                return;
            }
        } catch (Throwable th2) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        RxCancellableKt.handleUndeliverableException(th, getContext());
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(T t3) {
        try {
            this.subscriber.onSuccess(t3);
        } catch (Throwable th) {
            RxCancellableKt.handleUndeliverableException(th, getContext());
        }
    }
}
