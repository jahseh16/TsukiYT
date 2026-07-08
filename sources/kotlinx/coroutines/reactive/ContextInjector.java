package kotlinx.coroutines.reactive;

import kotlin.coroutines.CoroutineContext;
import ol1.y;

/* JADX INFO: loaded from: classes.dex */
public interface ContextInjector {
    <T> y<T> injectCoroutineContext(y<T> yVar, CoroutineContext coroutineContext);
}
