package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");

    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n) {
        while (true) {
            Object nextOrClosed = n.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) nextOrClosed;
            if (concurrentLinkedListNode != null) {
                n = (N) concurrentLinkedListNode;
            } else if (n.markAsClosed()) {
                return n;
            }
        }
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s3, long j, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s3.id >= j && !s3.isRemoved()) {
                return SegmentOrClosed.m212constructorimpl(s3);
            }
            Object nextOrClosed = s3.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m212constructorimpl(CLOSED);
            }
            S sInvoke = (S) ((ConcurrentLinkedListNode) nextOrClosed);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s3.id + 1), s3);
                if (s3.trySetNext(sInvoke)) {
                    if (s3.isRemoved()) {
                        s3.remove();
                    }
                }
            }
            s3 = (Object) sInvoke;
        }
    }
}
