package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class FlowExceptions_commonKt {
    public static final void checkOwnership(AbortFlowException abortFlowException, FlowCollector<?> flowCollector) {
        if (abortFlowException.owner != flowCollector) {
            throw abortFlowException;
        }
    }
}
