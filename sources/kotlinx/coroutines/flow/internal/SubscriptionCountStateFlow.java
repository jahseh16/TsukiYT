package kotlinx.coroutines.flow.internal;

import com.google.protobuf.Reader;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes.dex */
final class SubscriptionCountStateFlow extends SharedFlowImpl<Integer> implements StateFlow<Integer> {
    public SubscriptionCountStateFlow(int i) {
        super(1, Reader.READ_DONE, BufferOverflow.DROP_OLDEST);
        tryEmit(Integer.valueOf(i));
    }

    public final boolean increment(int i) {
        boolean zTryEmit;
        synchronized (this) {
            zTryEmit = tryEmit(Integer.valueOf(getLastReplayedLocked().intValue() + i));
        }
        return zTryEmit;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.StateFlow
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(getLastReplayedLocked().intValue());
        }
        return numValueOf;
    }
}
