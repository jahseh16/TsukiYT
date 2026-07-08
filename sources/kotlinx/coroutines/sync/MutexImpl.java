package kotlinx.coroutines.sync;

import i4.n3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
public class MutexImpl extends SemaphoreImpl implements Mutex {
    private static final AtomicReferenceFieldUpdater owner$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner");
    private final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> onSelectCancellationUnlockConstructor;
    private volatile Object owner;

    public final class CancellableContinuationWithOwner implements CancellableContinuation<Unit>, Waiter {
        public final CancellableContinuationImpl<Unit> cont;
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(CancellableContinuationImpl<? super Unit> cancellableContinuationImpl, Object obj) {
            this.cont = cancellableContinuationImpl;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(Throwable th) {
            return this.cont.cancel(th);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(Object obj) {
            this.cont.completeResume(obj);
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(Function1<? super Throwable, Unit> function1) {
            this.cont.invokeOnCancellation(function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(Unit unit, Function1 function1) {
            resume2(unit, (Function1<? super Throwable, Unit>) function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, Unit unit) {
            this.cont.resumeUndispatched(coroutineDispatcher, unit);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            this.cont.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ Object tryResume(Unit unit, Object obj, Function1 function1) {
            return tryResume2(unit, obj, (Function1<? super Throwable, Unit>) function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResumeWithException(Throwable th) {
            return this.cont.tryResumeWithException(th);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            this.cont.invokeOnCancellation(segment, i);
        }

        /* JADX INFO: renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(Unit unit, Function1<? super Throwable, Unit> function1) {
            MutexImpl mutexImpl = MutexImpl.this;
            if (DebugKt.getASSERTIONS_ENABLED() && MutexImpl.owner$FU.get(mutexImpl) != MutexKt.NO_OWNER) {
                throw new AssertionError();
            }
            MutexImpl.owner$FU.set(MutexImpl.this, this.owner);
            CancellableContinuationImpl<Unit> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl2 = MutexImpl.this;
            cancellableContinuationImpl.resume(unit, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    mutexImpl2.unlock(this.owner);
                }
            });
        }

        /* JADX INFO: renamed from: tryResume, reason: avoid collision after fix types in other method */
        public Object tryResume2(Unit unit, Object obj, Function1<? super Throwable, Unit> function1) {
            MutexImpl mutexImpl = MutexImpl.this;
            if (DebugKt.getASSERTIONS_ENABLED() && MutexImpl.owner$FU.get(mutexImpl) != MutexKt.NO_OWNER) {
                throw new AssertionError();
            }
            CancellableContinuationImpl<Unit> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl2 = MutexImpl.this;
            Object objTryResume = cancellableContinuationImpl.tryResume(unit, obj, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    Object obj2;
                    MutexImpl mutexImpl3 = mutexImpl2;
                    MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner = this;
                    if (DebugKt.getASSERTIONS_ENABLED() && (obj2 = MutexImpl.owner$FU.get(mutexImpl3)) != MutexKt.NO_OWNER && obj2 != cancellableContinuationWithOwner.owner) {
                        throw new AssertionError();
                    }
                    MutexImpl.owner$FU.set(mutexImpl2, this.owner);
                    mutexImpl2.unlock(this.owner);
                }
            });
            if (objTryResume != null) {
                MutexImpl mutexImpl3 = MutexImpl.this;
                if (DebugKt.getASSERTIONS_ENABLED() && MutexImpl.owner$FU.get(mutexImpl3) != MutexKt.NO_OWNER) {
                    throw new AssertionError();
                }
                MutexImpl.owner$FU.set(MutexImpl.this, this.owner);
            }
            return objTryResume;
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner = z ? null : MutexKt.NO_OWNER;
        this.onSelectCancellationUnlockConstructor = new Function3<SelectInstance<?>, Object, Object, Function1<? super Throwable, ? extends Unit>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Function1<Throwable, Unit> invoke(SelectInstance<?> selectInstance, final Object obj, Object obj2) {
                final MutexImpl mutexImpl = this.this$0;
                return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        mutexImpl.unlock(obj);
                    }
                };
            }
        };
    }

    private final int holdsLockImpl(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public static /* synthetic */ Object lock$suspendImpl(MutexImpl mutexImpl, Object obj, Continuation<? super Unit> continuation) {
        if (mutexImpl.tryLock(obj)) {
            return Unit.INSTANCE;
        }
        Object objLockSuspend = mutexImpl.lockSuspend(obj, continuation);
        return objLockSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objLockSuspend : Unit.INSTANCE;
    }

    private final Object lockSuspend(Object obj, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            acquire(new CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private final int tryLockImpl(Object obj) {
        while (!tryAcquire()) {
            if (obj == null) {
                return 1;
            }
            int iHoldsLockImpl = holdsLockImpl(obj);
            if (iHoldsLockImpl == 1) {
                return 2;
            }
            if (iHoldsLockImpl == 2) {
                return 1;
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED() && owner$FU.get(this) != MutexKt.NO_OWNER) {
            throw new AssertionError();
        }
        owner$FU.set(this, obj);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, Continuation<? super Unit> continuation) {
        return lock$suspendImpl(this, obj, continuation);
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$FU.get(this) + ']';
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object obj) {
        int iTryLockImpl = tryLockImpl(obj);
        if (iTryLockImpl == 0) {
            return true;
        }
        if (iTryLockImpl == 1) {
            return false;
        }
        if (iTryLockImpl != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object obj) {
        while (isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = owner$FU;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (n3.y(atomicReferenceFieldUpdater, this, obj2, MutexKt.NO_OWNER)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
