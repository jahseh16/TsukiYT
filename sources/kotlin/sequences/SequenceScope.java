package kotlin.sequences;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public abstract class SequenceScope<T> {
    public abstract Object yield(T t3, Continuation<? super Unit> continuation);
}
