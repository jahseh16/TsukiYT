package kotlinx.coroutines.android;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public /* synthetic */ HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j, runnable, coroutineContext);
    }

    private HandlerDispatcher() {
    }
}
