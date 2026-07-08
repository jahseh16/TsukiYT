package kotlinx.coroutines.scheduling;

import fj1.y;
import i4.n3;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes.dex */
public final class WorkQueue {
    private volatile int blockingTasksInBuffer;
    private final AtomicReferenceArray<Task> buffer = new AtomicReferenceArray<>(128);
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;
    private static final AtomicReferenceFieldUpdater lastScheduledTask$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater producerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater consumerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    private final Task addLast(Task task) {
        if (getBufferSize() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            blockingTasksInBuffer$FU.incrementAndGet(this);
        }
        int i = producerIndex$FU.get(this) & 127;
        while (this.buffer.get(i) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i, task);
        producerIndex$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(Task task) {
        if (task == null || task.taskContext.getTaskMode() != 1) {
            return;
        }
        int iDecrementAndGet = blockingTasksInBuffer$FU.decrementAndGet(this);
        if (DebugKt.getASSERTIONS_ENABLED() && iDecrementAndGet < 0) {
            throw new AssertionError();
        }
    }

    private final int getBufferSize() {
        return producerIndex$FU.get(this) - consumerIndex$FU.get(this);
    }

    private final Task pollBuffer() {
        Task andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = consumerIndex$FU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - producerIndex$FU.get(this) == 0) {
                return null;
            }
            int i5 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.buffer.getAndSet(i5, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final boolean pollTo(GlobalQueue globalQueue) {
        Task taskPollBuffer = pollBuffer();
        if (taskPollBuffer == null) {
            return false;
        }
        globalQueue.addLast(taskPollBuffer);
        return true;
    }

    private final Task pollWithExclusiveMode(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Task task;
        do {
            atomicReferenceFieldUpdater = lastScheduledTask$FU;
            task = (Task) atomicReferenceFieldUpdater.get(this);
            if (task != null) {
                if ((task.taskContext.getTaskMode() == 1) == z) {
                }
            }
            int i = consumerIndex$FU.get(this);
            int i5 = producerIndex$FU.get(this);
            while (i != i5) {
                if (z && blockingTasksInBuffer$FU.get(this) == 0) {
                    return null;
                }
                i5--;
                Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i5, z);
                if (taskTryExtractFromTheMiddle != null) {
                    return taskTryExtractFromTheMiddle;
                }
            }
            return null;
        } while (!n3.y(atomicReferenceFieldUpdater, this, task, null));
        return task;
    }

    private final Task stealWithExclusiveMode(int i) {
        int i5 = consumerIndex$FU.get(this);
        int i8 = producerIndex$FU.get(this);
        boolean z = i == 1;
        while (i5 != i8) {
            if (z && blockingTasksInBuffer$FU.get(this) == 0) {
                return null;
            }
            int i10 = i5 + 1;
            Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i5, z);
            if (taskTryExtractFromTheMiddle != null) {
                return taskTryExtractFromTheMiddle;
            }
            i5 = i10;
        }
        return null;
    }

    private final Task tryExtractFromTheMiddle(int i, boolean z) {
        int i5 = i & 127;
        Task task = this.buffer.get(i5);
        if (task != null) {
            if ((task.taskContext.getTaskMode() == 1) == z && y.y(this.buffer, i5, task, null)) {
                if (z) {
                    blockingTasksInBuffer$FU.decrementAndGet(this);
                }
                return task;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    private final long tryStealLastScheduled(int i, Ref$ObjectRef<Task> ref$ObjectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = lastScheduledTask$FU;
            r1 = (Task) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.taskContext.getTaskMode() != 1 ? 2 : 1) & i) == 0) {
                return -2L;
            }
            long jNanoTime = TasksKt.schedulerTimeSource.nanoTime() - r1.submissionTime;
            long j = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
        } while (!n3.y(atomicReferenceFieldUpdater, this, r1, null));
        ref$ObjectRef.element = r1;
        return -1L;
    }

    public final Task add(Task task, boolean z) {
        if (z) {
            return addLast(task);
        }
        Task task2 = (Task) lastScheduledTask$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        while (pollTo(globalQueue)) {
        }
    }

    public final Task poll() {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        return task == null ? pollBuffer() : task;
    }

    public final Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int i, Ref$ObjectRef<Task> ref$ObjectRef) {
        T tPollBuffer = i == 3 ? pollBuffer() : stealWithExclusiveMode(i);
        if (tPollBuffer == 0) {
            return tryStealLastScheduled(i, ref$ObjectRef);
        }
        ref$ObjectRef.element = tPollBuffer;
        return -1L;
    }
}
