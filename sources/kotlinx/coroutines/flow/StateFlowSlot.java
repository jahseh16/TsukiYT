package kotlinx.coroutines.flow;

import i4.n3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: loaded from: classes.dex */
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowSlot.class, Object.class, "_state");
    private volatile Object _state;

    public final Object awaitPending(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (DebugKt.getASSERTIONS_ENABLED() && (_state$FU.get(this) instanceof CancellableContinuationImpl)) {
            throw new AssertionError();
        }
        if (!n3.y(_state$FU, this, StateFlowKt.NONE, cancellableContinuationImpl)) {
            if (DebugKt.getASSERTIONS_ENABLED() && _state$FU.get(this) != StateFlowKt.PENDING) {
                throw new AssertionError();
            }
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final void makePending() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == StateFlowKt.PENDING) {
                return;
            }
            if (obj == StateFlowKt.NONE) {
                if (n3.y(_state$FU, this, obj, StateFlowKt.PENDING)) {
                    return;
                }
            } else if (n3.y(_state$FU, this, obj, StateFlowKt.NONE)) {
                Result.Companion companion = Result.Companion;
                ((CancellableContinuationImpl) obj).resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    public final boolean takePending() {
        Object andSet = _state$FU.getAndSet(this, StateFlowKt.NONE);
        Intrinsics.checkNotNull(andSet);
        if (DebugKt.getASSERTIONS_ENABLED() && (andSet instanceof CancellableContinuationImpl)) {
            throw new AssertionError();
        }
        return andSet == StateFlowKt.PENDING;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(StateFlowImpl<?> stateFlowImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, StateFlowKt.NONE);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public Continuation<Unit>[] freeLocked(StateFlowImpl<?> stateFlowImpl) {
        _state$FU.set(this, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }
}
