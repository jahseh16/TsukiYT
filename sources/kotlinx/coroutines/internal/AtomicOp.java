package kotlinx.coroutines.internal;

import i4.n3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class AtomicOp<T> extends OpDescriptor {
    private static final AtomicReferenceFieldUpdater _consensus$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    private volatile Object _consensus = AtomicKt.NO_DECISION;

    private final Object decide(Object obj) {
        if (DebugKt.getASSERTIONS_ENABLED() && obj == AtomicKt.NO_DECISION) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _consensus$FU;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AtomicKt.NO_DECISION;
        return obj2 != obj3 ? obj2 : n3.y(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract void complete(T t3, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    public final Object perform(Object obj) {
        Object objDecide = _consensus$FU.get(this);
        if (objDecide == AtomicKt.NO_DECISION) {
            objDecide = decide(prepare(obj));
        }
        complete(obj, objDecide);
        return objDecide;
    }

    public abstract Object prepare(T t3);
}
