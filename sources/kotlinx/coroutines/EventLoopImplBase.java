package kotlinx.coroutines;

import i4.n3;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: loaded from: classes.dex */
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;
    private static final AtomicReferenceFieldUpdater _queue$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");
    private static final AtomicReferenceFieldUpdater _delayed$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");
    private static final AtomicIntegerFieldUpdater _isCompleted$FU = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted");

    public final class DelayedResumeTask extends DelayedTask {
        private final CancellableContinuation<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(j);
            this.cont = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.resumeUndispatched(EventLoopImplBase.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    public static final class DelayedRunnableTask extends DelayedTask {
        private final Runnable block;

        public DelayedRunnableTask(long j, Runnable runnable) {
            super(j);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.block;
        }
    }

    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {
        private volatile Object _heap;
        private int index = -1;
        public long nanoTime;

        public DelayedTask(long j) {
            this.nanoTime = j;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == EventLoop_commonKt.DISPOSED_TASK) {
                        return;
                    }
                    DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
                    if (delayedTaskQueue != null) {
                        delayedTaskQueue.remove(this);
                    }
                    this._heap = EventLoop_commonKt.DISPOSED_TASK;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public ThreadSafeHeap<?> getHeap() {
            Object obj = this._heap;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
            return this.index;
        }

        public final int scheduleTask(long j, DelayedTaskQueue delayedTaskQueue, EventLoopImplBase eventLoopImplBase) {
            synchronized (this) {
                if (this._heap == EventLoop_commonKt.DISPOSED_TASK) {
                    return 2;
                }
                synchronized (delayedTaskQueue) {
                    try {
                        DelayedTask delayedTaskFirstImpl = delayedTaskQueue.firstImpl();
                        if (eventLoopImplBase.isCompleted()) {
                            return 1;
                        }
                        if (delayedTaskFirstImpl == null) {
                            delayedTaskQueue.timeNow = j;
                        } else {
                            long j4 = delayedTaskFirstImpl.nanoTime;
                            if (j4 - j < 0) {
                                j = j4;
                            }
                            if (j - delayedTaskQueue.timeNow > 0) {
                                delayedTaskQueue.timeNow = j;
                            }
                        }
                        long j7 = this.nanoTime;
                        long j8 = delayedTaskQueue.timeNow;
                        if (j7 - j8 < 0) {
                            this.nanoTime = j8;
                        }
                        delayedTaskQueue.addImpl(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(ThreadSafeHeap<?> threadSafeHeap) {
            if (this._heap == EventLoop_commonKt.DISPOSED_TASK) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = threadSafeHeap;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int i) {
            this.index = i;
        }

        public final boolean timeToExecute(long j) {
            return j - this.nanoTime >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        @Override // java.lang.Comparable
        public int compareTo(DelayedTask delayedTask) {
            long j = this.nanoTime - delayedTask.nanoTime;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }
    }

    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long j) {
            this.timeNow = j;
        }
    }

    private final void closeQueue() {
        if (DebugKt.getASSERTIONS_ENABLED() && !isCompleted()) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (n3.y(_queue$FU, this, null, EventLoop_commonKt.CLOSED_EMPTY)) {
                    return;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore) obj).close();
                return;
            } else {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore.addLast((Runnable) obj);
                if (n3.y(_queue$FU, this, obj, lockFreeTaskQueueCore)) {
                    return;
                }
            }
        }
    }

    private final Runnable dequeue() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof LockFreeTaskQueueCore) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                Object objRemoveFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
                if (objRemoveFirstOrNull != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                    return (Runnable) objRemoveFirstOrNull;
                }
                n3.y(_queue$FU, this, obj, lockFreeTaskQueueCore.next());
            } else {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return null;
                }
                if (n3.y(_queue$FU, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean enqueueImpl(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (n3.y(_queue$FU, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                int iAddLast = lockFreeTaskQueueCore.addLast(runnable);
                if (iAddLast == 0) {
                    return true;
                }
                if (iAddLast == 1) {
                    n3.y(_queue$FU, this, obj, lockFreeTaskQueueCore.next());
                } else if (iAddLast == 2) {
                    return false;
                }
            } else {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore2.addLast((Runnable) obj);
                lockFreeTaskQueueCore2.addLast(runnable);
                if (n3.y(_queue$FU, this, obj, lockFreeTaskQueueCore2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return _isCompleted$FU.get(this) != 0;
    }

    private final void rescheduleAllDelayed() {
        DelayedTask delayedTaskRemoveFirstOrNull;
        AbstractTimeSourceKt.getTimeSource();
        long jNanoTime = System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
            if (delayedTaskQueue == null || (delayedTaskRemoveFirstOrNull = delayedTaskQueue.removeFirstOrNull()) == null) {
                return;
            } else {
                reschedule(jNanoTime, delayedTaskRemoveFirstOrNull);
            }
        }
    }

    private final int scheduleImpl(long j, DelayedTask delayedTask) {
        if (isCompleted()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _delayed$FU;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if (delayedTaskQueue == null) {
            n3.y(atomicReferenceFieldUpdater, this, null, new DelayedTaskQueue(j));
            Object obj = atomicReferenceFieldUpdater.get(this);
            Intrinsics.checkNotNull(obj);
            delayedTaskQueue = (DelayedTaskQueue) obj;
        }
        return delayedTask.scheduleTask(j, delayedTaskQueue, this);
    }

    private final void setCompleted(boolean z) {
        _isCompleted$FU.set(this, z ? 1 : 0);
    }

    private final boolean shouldUnpark(DelayedTask delayedTask) {
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
        return (delayedTaskQueue != null ? delayedTaskQueue.peek() : null) == delayedTask;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo210dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueue(Runnable runnable) {
        if (enqueueImpl(runnable)) {
            unpark();
        } else {
            DefaultExecutor.INSTANCE.enqueue(runnable);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    public long getNextTime() {
        DelayedTask delayedTaskPeek;
        if (super.getNextTime() == 0) {
            return 0L;
        }
        Object obj = _queue$FU.get(this);
        if (obj != null) {
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                return obj == EventLoop_commonKt.CLOSED_EMPTY ? Long.MAX_VALUE : 0L;
            }
            if (!((LockFreeTaskQueueCore) obj).isEmpty()) {
                return 0L;
            }
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue == null || (delayedTaskPeek = delayedTaskQueue.peek()) == null) {
            return Long.MAX_VALUE;
        }
        long j = delayedTaskPeek.nanoTime;
        AbstractTimeSourceKt.getTimeSource();
        return RangesKt.coerceAtLeast(j - System.nanoTime(), 0L);
    }

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j, runnable, coroutineContext);
    }

    public boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.isEmpty()) {
            return false;
        }
        Object obj = _queue$FU.get(this);
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                return ((LockFreeTaskQueueCore) obj).isEmpty();
            }
            if (obj != EventLoop_commonKt.CLOSED_EMPTY) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
        DelayedTask delayedTaskRemoveAtImpl;
        if (processUnconfinedEvent()) {
            return 0L;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$FU.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.isEmpty()) {
            AbstractTimeSourceKt.getTimeSource();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (delayedTaskQueue) {
                    try {
                        DelayedTask delayedTaskFirstImpl = delayedTaskQueue.firstImpl();
                        if (delayedTaskFirstImpl != null) {
                            DelayedTask delayedTask = delayedTaskFirstImpl;
                            delayedTaskRemoveAtImpl = delayedTask.timeToExecute(jNanoTime) ? enqueueImpl(delayedTask) : false ? delayedTaskQueue.removeAtImpl(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (delayedTaskRemoveAtImpl != null);
        }
        Runnable runnableDequeue = dequeue();
        if (runnableDequeue == null) {
            return getNextTime();
        }
        runnableDequeue.run();
        return 0L;
    }

    public final void resetAll() {
        _queue$FU.set(this, null);
        _delayed$FU.set(this, null);
    }

    public final void schedule(long j, DelayedTask delayedTask) {
        int iScheduleImpl = scheduleImpl(j, delayedTask);
        if (iScheduleImpl == 0) {
            if (shouldUnpark(delayedTask)) {
                unpark();
            }
        } else if (iScheduleImpl == 1) {
            reschedule(j, delayedTask);
        } else if (iScheduleImpl != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final DisposableHandle scheduleInvokeOnTimeout(long j, Runnable runnable) {
        long jDelayToNanos = EventLoop_commonKt.delayToNanos(j);
        if (jDelayToNanos >= 4611686018427387903L) {
            return NonDisposableHandle.INSTANCE;
        }
        AbstractTimeSourceKt.getTimeSource();
        long jNanoTime = System.nanoTime();
        DelayedRunnableTask delayedRunnableTask = new DelayedRunnableTask(jDelayToNanos + jNanoTime, runnable);
        schedule(jNanoTime, delayedRunnableTask);
        return delayedRunnableTask;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo211scheduleResumeAfterDelay(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        long jDelayToNanos = EventLoop_commonKt.delayToNanos(j);
        if (jDelayToNanos < 4611686018427387903L) {
            AbstractTimeSourceKt.getTimeSource();
            long jNanoTime = System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(jDelayToNanos + jNanoTime, cancellableContinuation);
            schedule(jNanoTime, delayedResumeTask);
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuation, delayedResumeTask);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadLocalEventLoop.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        setCompleted(true);
        closeQueue();
        while (processNextEvent() <= 0) {
        }
        rescheduleAllDelayed();
    }
}
