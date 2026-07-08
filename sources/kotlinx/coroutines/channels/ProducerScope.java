package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public interface ProducerScope<E> extends CoroutineScope, SendChannel<E> {
    SendChannel<E> getChannel();
}
