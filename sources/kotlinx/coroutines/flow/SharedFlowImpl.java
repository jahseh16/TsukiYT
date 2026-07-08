package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, Flow, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    public static final class Emitter implements DisposableHandle {
        public final Continuation<Unit> cont;
        public final SharedFlowImpl<?> flow;
        public long index;
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlowImpl<?> sharedFlowImpl, long j, Object obj, Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {372, 379, 382}, m = "collect$suspendImpl")
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i, int i5, BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i5;
        this.onBufferOverflow = bufferOverflow;
    }

    private final Object awaitValue(SharedFlowSlot sharedFlowSlot, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlowSlot) < 0) {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                } else {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            if (SharedFlowKt.getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlowKt.setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && SharedFlowKt.getBufferAt(objArr, (getHead() + ((long) getTotalSize())) - 1) == SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                SharedFlowKt.setBufferAt(objArr, getHead() + ((long) getTotalSize()), null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.Continuation<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void correctCollectorIndexesOnDropOldest(long j) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j4 = sharedFlowSlot.index;
                    if (j4 >= 0 && j4 < j) {
                        sharedFlowSlot.index = j;
                    }
                }
            }
        }
        this.minCollectorIndex = j;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
        if (DebugKt.getASSERTIONS_ENABLED() && getHead() != head) {
            throw new AssertionError();
        }
    }

    public static /* synthetic */ <T> Object emit$suspendImpl(SharedFlowImpl<T> sharedFlowImpl, T t3, Continuation<? super Unit> continuation) {
        if (sharedFlowImpl.tryEmit(t3)) {
            return Unit.INSTANCE;
        }
        Object objEmitSuspend = sharedFlowImpl.emitSuspend(t3, continuation);
        return objEmitSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmitSuspend : Unit.INSTANCE;
    }

    private final Object emitSuspend(T t3, Continuation<? super Unit> continuation) {
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(t3)) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
                    continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked2);
                    emitter = null;
                } else {
                    Emitter emitter2 = new Emitter(this, ((long) getTotalSize()) + getHead(), t3, cancellableContinuationImpl);
                    enqueueLocked(emitter2);
                    this.queueSize++;
                    if (this.bufferCapacity == 0) {
                        continuationArrFindSlotsToResumeLocked2 = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked2);
                    }
                    continuationArrFindSlotsToResumeLocked = continuationArrFindSlotsToResumeLocked2;
                    emitter = emitter2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (emitter != null) {
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, emitter);
        }
        for (Continuation<Unit> continuation2 : continuationArrFindSlotsToResumeLocked) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArrGrowBuffer = this.buffer;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        SharedFlowKt.setBufferAt(objArrGrowBuffer, getHead() + ((long) totalSize), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final Continuation<Unit>[] findSlotsToResumeLocked(Continuation<Unit>[] continuationArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        continuationArr = objArrCopyOf;
                    }
                    ((Continuation[]) continuationArr)[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return (Continuation[]) continuationArr;
    }

    private final long getBufferEndIndex() {
        return getHead() + ((long) this.bufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object getPeekedValueLockedAt(long j) {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        Object bufferAt = SharedFlowKt.getBufferAt(objArr, j);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] objArr, int i, int i5) {
        if (i5 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i5];
        this.buffer = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long head = getHead();
        for (int i8 = 0; i8 < i; i8++) {
            long j = ((long) i8) + head;
            SharedFlowKt.setBufferAt(objArr2, j, SharedFlowKt.getBufferAt(objArr, j));
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T t3) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(t3);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        enqueueLocked(t3);
        int i5 = this.bufferSize + 1;
        this.bufferSize = i5;
        if (i5 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T t3) {
        if (DebugKt.getASSERTIONS_ENABLED() && getNCollectors() != 0) {
            throw new AssertionError();
        }
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(t3);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.index;
        if (j < getBufferEndIndex()) {
            return j;
        }
        if (this.bufferCapacity <= 0 && j <= getHead() && this.queueSize != 0) {
            return j;
        }
        return -1L;
    }

    private final Object tryTakeValue(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation<Unit>[] continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long jTryPeekLocked = tryPeekLocked(sharedFlowSlot);
                if (jTryPeekLocked < 0) {
                    obj = SharedFlowKt.NO_VALUE;
                } else {
                    long j = sharedFlowSlot.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                    sharedFlowSlot.index = jTryPeekLocked + 1;
                    continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    private final void updateBufferLocked(long j, long j4, long j7, long j8) {
        long jMin = Math.min(j4, j);
        if (DebugKt.getASSERTIONS_ENABLED() && jMin < getHead()) {
            throw new AssertionError();
        }
        for (long head = getHead(); head < jMin; head++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = j;
        this.minCollectorIndex = j4;
        this.bufferSize = (int) (j7 - jMin);
        this.queueSize = (int) (j8 - j7);
        if (DebugKt.getASSERTIONS_ENABLED() && this.bufferSize < 0) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && this.queueSize < 0) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && this.replayIndex > getHead() + ((long) this.bufferSize)) {
            throw new AssertionError();
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t3, Continuation<? super Unit> continuation) {
        return emit$suspendImpl(this, t3, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext, i, bufferOverflow);
    }

    public final T getLastReplayedLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        return (T) SharedFlowKt.getBufferAt(objArr, (this.replayIndex + ((long) getReplaySize())) - 1);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < replaySize; i++) {
                arrayList.add(SharedFlowKt.getBufferAt(objArr, this.replayIndex + ((long) i)));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t3) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t3)) {
                continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrFindSlotsToResumeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    public final Continuation<Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j) {
        long j4;
        long j7;
        long j8;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (DebugKt.getASSERTIONS_ENABLED() && j < this.minCollectorIndex) {
            throw new AssertionError();
        }
        if (j > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j9 = ((long) this.bufferSize) + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j9++;
        }
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    long j10 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                    if (j10 >= 0 && j10 < j9) {
                        j9 = j10;
                    }
                }
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED() && j9 < this.minCollectorIndex) {
            throw new AssertionError();
        }
        if (j9 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j9))) : this.queueSize;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j11 = ((long) this.queueSize) + bufferEndIndex;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            long j12 = bufferEndIndex;
            int i = 0;
            while (true) {
                if (bufferEndIndex >= j11) {
                    j4 = j9;
                    j7 = j11;
                    break;
                }
                Object bufferAt = SharedFlowKt.getBufferAt(objArr, bufferEndIndex);
                j4 = j9;
                Symbol symbol = SharedFlowKt.NO_VALUE;
                if (bufferAt != symbol) {
                    Intrinsics.checkNotNull(bufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) bufferAt;
                    int i5 = i + 1;
                    j7 = j11;
                    continuationArr[i] = emitter.cont;
                    SharedFlowKt.setBufferAt(objArr, bufferEndIndex, symbol);
                    SharedFlowKt.setBufferAt(objArr, j12, emitter.value);
                    j8 = 1;
                    j12++;
                    if (i5 >= iMin) {
                        break;
                    }
                    i = i5;
                } else {
                    j7 = j11;
                    j8 = 1;
                }
                bufferEndIndex += j8;
                j9 = j4;
                j11 = j7;
            }
            bufferEndIndex = j12;
        } else {
            j4 = j9;
            j7 = j11;
        }
        int i8 = (int) (bufferEndIndex - head);
        long j13 = getNCollectors() == 0 ? bufferEndIndex : j4;
        long jMax = Math.max(this.replayIndex, bufferEndIndex - ((long) Math.min(this.replay, i8)));
        if (this.bufferCapacity == 0 && jMax < j7) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(SharedFlowKt.getBufferAt(objArr2, jMax), SharedFlowKt.NO_VALUE)) {
                bufferEndIndex++;
                jMax++;
            }
        }
        updateBufferLocked(jMax, j13, bufferEndIndex, j7);
        cleanupTailLocked();
        return !(continuationArr.length == 0) ? findSlotsToResumeLocked(continuationArr) : continuationArr;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int i) {
        return new SharedFlowSlot[i];
    }
}
