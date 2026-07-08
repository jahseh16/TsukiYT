package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: loaded from: classes.dex */
public interface ReceiveChannel<E> {
    void cancel(CancellationException cancellationException);

    SelectClause1<ChannelResult<E>> getOnReceiveCatching();

    ChannelIterator<E> iterator();

    Object receive(Continuation<? super E> continuation);

    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo185receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation);

    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    Object mo186tryReceivePtdJZtk();
}
