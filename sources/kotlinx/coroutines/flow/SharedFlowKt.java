package kotlinx.coroutines.flow;

import com.google.protobuf.Reader;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes.dex */
public final class SharedFlowKt {
    public static final Symbol NO_VALUE = new Symbol("NO_VALUE");

    public static final <T> MutableSharedFlow<T> MutableSharedFlow(int i, int i5, BufferOverflow bufferOverflow) {
        if (i < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i5).toString());
        }
        if (i > 0 || i5 > 0 || bufferOverflow == BufferOverflow.SUSPEND) {
            int i8 = i5 + i;
            if (i8 < 0) {
                i8 = Reader.READ_DONE;
            }
            return new SharedFlowImpl(i, i8, bufferOverflow);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
    }

    public static /* synthetic */ MutableSharedFlow MutableSharedFlow$default(int i, int i5, BufferOverflow bufferOverflow, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return MutableSharedFlow(i, i5, bufferOverflow);
    }

    public static final <T> Flow<T> fuseSharedFlow(SharedFlow<? extends T> sharedFlow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? sharedFlow : new ChannelFlowOperatorImpl(sharedFlow, coroutineContext, i, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBufferAt(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBufferAt(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}
