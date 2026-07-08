package kotlinx.coroutines;

/* JADX INFO: loaded from: classes.dex */
public interface CompletableDeferred<T> extends Deferred<T> {
    boolean complete(T t3);

    boolean completeExceptionally(Throwable th);
}
