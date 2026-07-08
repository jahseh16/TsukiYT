package ap;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements Closeable, CoroutineScope {
    public final CoroutineContext y;

    public zn(CoroutineContext coroutineContext) {
        this.y = coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.cancel$default(getCoroutineContext(), null, 1, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.y;
    }
}
