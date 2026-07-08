package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface FlowCollector<T> {
    Object emit(T t3, Continuation<? super Unit> continuation);
}
