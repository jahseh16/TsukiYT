package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(T t3, Continuation<? super Unit> continuation);

    StateFlow<Integer> getSubscriptionCount();

    void resetReplayCache();

    boolean tryEmit(T t3);
}
