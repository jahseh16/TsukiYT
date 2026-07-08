package kotlinx.coroutines.channels;

import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        super(i, function1);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    public static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e4, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objM203trySendImplMj0NB7M = conflatedBufferedChannel.m203trySendImplMj0NB7M(e4, true);
        if (!(objM203trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return Unit.INSTANCE;
        }
        ChannelResult.m191exceptionOrNullimpl(objM203trySendImplMj0NB7M);
        Function1<E, Unit> function1 = conflatedBufferedChannel.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e4, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        ExceptionsKt.addSuppressed(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    /* JADX INFO: renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m201trySendDropLatestMj0NB7M(E e4, boolean z) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objMo187trySendJP2dKIU = super.mo187trySendJP2dKIU(e4);
        if (ChannelResult.m195isSuccessimpl(objMo187trySendJP2dKIU) || ChannelResult.m194isClosedimpl(objMo187trySendJP2dKIU)) {
            return objMo187trySendJP2dKIU;
        }
        if (!z || (function1 = this.onUndeliveredElement) == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e4, null, 2, null)) == null) {
            return ChannelResult.Companion.m200successJP2dKIU(Unit.INSTANCE);
        }
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    /* JADX INFO: renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    private final Object m202trySendDropOldestJP2dKIU(E e4) {
        ChannelSegment channelSegment;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.sendSegment$FU.get(this);
        while (true) {
            long andIncrement = BufferedChannel.sendersAndCloseStatus$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j4 = j / ((long) i);
            int i5 = (int) (j % ((long) i));
            if (channelSegment2.id != j4) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j4, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return ChannelResult.Companion.m198closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i5, e4, j, obj, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m200successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m200successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m198closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i5);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * ((long) i)) + ((long) i5));
                return ChannelResult.Companion.m200successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.Companion.m198closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    /* JADX INFO: renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m203trySendImplMj0NB7M(E e4, boolean z) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m201trySendDropLatestMj0NB7M(e4, z) : m202trySendDropOldestJP2dKIU(e4);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e4, Continuation<? super Unit> continuation) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e4, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo187trySendJP2dKIU(E e4) {
        return m203trySendImplMj0NB7M(e4, false);
    }
}
