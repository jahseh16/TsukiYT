package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSharedFlowSlot<F> {
    public abstract boolean allocateLocked(F f3);

    public abstract Continuation<Unit>[] freeLocked(F f3);
}
