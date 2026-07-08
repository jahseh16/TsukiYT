package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public interface FusibleFlow<T> extends Flow<T> {

    public static final class DefaultImpls {
        public static /* synthetic */ Flow fuse$default(FusibleFlow fusibleFlow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i5 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i5 & 2) != 0) {
                i = -3;
            }
            if ((i5 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return fusibleFlow.fuse(coroutineContext, i, bufferOverflow);
        }
    }

    Flow<T> fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);
}
