package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeepRecursiveScope<T, R> {
    public /* synthetic */ DeepRecursiveScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object callRecursive(T t3, Continuation<? super R> continuation);

    private DeepRecursiveScope() {
    }
}
