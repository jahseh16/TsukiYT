package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class ThrowingCollector implements FlowCollector<Object> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f6083e;

    public ThrowingCollector(Throwable th) {
        this.f6083e = th;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation<? super Unit> continuation) throws Throwable {
        throw this.f6083e;
    }
}
