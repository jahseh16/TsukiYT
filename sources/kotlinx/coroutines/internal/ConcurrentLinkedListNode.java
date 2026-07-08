package kotlinx.coroutines.internal;

import i4.n3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next");
    private static final AtomicReferenceFieldUpdater _prev$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public ConcurrentLinkedListNode(N n) {
        this._prev = n;
    }

    private final N getAliveSegmentLeft() {
        N n = (N) getPrev();
        while (n != null && n.isRemoved()) {
            n = (N) _prev$FU.get(n);
        }
        return n;
    }

    private final N getAliveSegmentRight() {
        ConcurrentLinkedListNode next;
        if (DebugKt.getASSERTIONS_ENABLED() && isTail()) {
            throw new AssertionError();
        }
        N n = (N) getNext();
        Intrinsics.checkNotNull(n);
        while (n.isRemoved() && (next = n.getNext()) != null) {
            n = (N) next;
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getNextOrClosed() {
        return _next$FU.get(this);
    }

    public final void cleanPrev() {
        _prev$FU.lazySet(this, null);
    }

    public final N getNext() {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed == ConcurrentLinkedListKt.CLOSED) {
            return null;
        }
        return (N) nextOrClosed;
    }

    public final N getPrev() {
        return (N) _prev$FU.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        return n3.y(_next$FU, this, null, ConcurrentLinkedListKt.CLOSED);
    }

    public final void remove() {
        Object obj;
        if (DebugKt.getASSERTIONS_ENABLED() && !isRemoved() && !isTail()) {
            throw new AssertionError();
        }
        if (isTail()) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode aliveSegmentLeft = getAliveSegmentLeft();
            ConcurrentLinkedListNode aliveSegmentRight = getAliveSegmentRight();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            do {
                obj = atomicReferenceFieldUpdater.get(aliveSegmentRight);
            } while (!n3.y(atomicReferenceFieldUpdater, aliveSegmentRight, obj, ((ConcurrentLinkedListNode) obj) == null ? null : aliveSegmentLeft));
            if (aliveSegmentLeft != null) {
                _next$FU.set(aliveSegmentLeft, aliveSegmentRight);
            }
            if (!aliveSegmentRight.isRemoved() || aliveSegmentRight.isTail()) {
                if (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(N n) {
        return n3.y(_next$FU, this, null, n);
    }
}
