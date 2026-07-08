package kotlinx.coroutines;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class AwaitKt {
    public static final <T> Object awaitAll(Collection<? extends Deferred<? extends T>> collection, Continuation<? super List<? extends T>> continuation) {
        return collection.isEmpty() ? CollectionsKt.emptyList() : new AwaitAll((Deferred[]) collection.toArray(new Deferred[0])).await(continuation);
    }
}
