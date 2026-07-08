package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class BlockingCoroutine<T> extends AbstractCoroutine<T> {
    private final Thread blockedThread;
    private final EventLoop eventLoop;

    public BlockingCoroutine(CoroutineContext coroutineContext, Thread thread, EventLoop eventLoop) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = eventLoop;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void afterCompletion(Object obj) {
        if (Intrinsics.areEqual(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        AbstractTimeSourceKt.getTimeSource();
        LockSupport.unpark(thread);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean isScopedCoroutine() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T joinBlocking() throws Throwable {
        AbstractTimeSourceKt.getTimeSource();
        try {
            EventLoop eventLoop = this.eventLoop;
            if (eventLoop != null) {
                EventLoop.incrementUseCount$default(eventLoop, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    EventLoop eventLoop2 = this.eventLoop;
                    long jProcessNextEvent = eventLoop2 != null ? eventLoop2.processNextEvent() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        EventLoop eventLoop3 = this.eventLoop;
                        if (eventLoop3 != null) {
                            EventLoop.decrementUseCount$default(eventLoop3, false, 1, null);
                        }
                        AbstractTimeSourceKt.getTimeSource();
                        T t3 = (T) JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
                        CompletedExceptionally completedExceptionally = t3 instanceof CompletedExceptionally ? (CompletedExceptionally) t3 : null;
                        if (completedExceptionally == null) {
                            return t3;
                        }
                        throw completedExceptionally.cause;
                    }
                    AbstractTimeSourceKt.getTimeSource();
                    LockSupport.parkNanos(this, jProcessNextEvent);
                } catch (Throwable th) {
                    EventLoop eventLoop4 = this.eventLoop;
                    if (eventLoop4 != null) {
                        EventLoop.decrementUseCount$default(eventLoop4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            cancelCoroutine(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractTimeSourceKt.getTimeSource();
            throw th2;
        }
    }
}
