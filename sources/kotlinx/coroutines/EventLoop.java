package kotlinx.coroutines;

import kotlin.collections.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class EventLoop extends CoroutineDispatcher {
    private boolean shared;
    private ArrayDeque<DispatchedTask<?>> unconfinedQueue;
    private long useCount;

    public static /* synthetic */ void decrementUseCount$default(EventLoop eventLoop, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.decrementUseCount(z);
    }

    private final long delta(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static /* synthetic */ void incrementUseCount$default(EventLoop eventLoop, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.incrementUseCount(z);
    }

    public final void decrementUseCount(boolean z) {
        long jDelta = this.useCount - delta(z);
        this.useCount = jDelta;
        if (jDelta > 0) {
            return;
        }
        if (DebugKt.getASSERTIONS_ENABLED() && this.useCount != 0) {
            throw new AssertionError();
        }
        if (this.shared) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(DispatchedTask<?> dispatchedTask) {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.unconfinedQueue = arrayDeque;
        }
        arrayDeque.addLast(dispatchedTask);
    }

    public long getNextTime() {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.unconfinedQueue;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void incrementUseCount(boolean z) {
        this.useCount += delta(z);
        if (z) {
            return;
        }
        this.shared = true;
    }

    public final boolean isUnconfinedLoopActive() {
        return this.useCount >= delta(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    public final boolean processUnconfinedEvent() {
        DispatchedTask<?> dispatchedTaskRemoveFirstOrNull;
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null || (dispatchedTaskRemoveFirstOrNull = arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        dispatchedTaskRemoveFirstOrNull.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }
}
