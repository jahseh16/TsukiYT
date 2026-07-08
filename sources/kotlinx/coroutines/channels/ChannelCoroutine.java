package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: loaded from: classes.dex */
public class ChannelCoroutine<E> extends AbstractCoroutine<Unit> implements Channel<E> {
    private final Channel<E> _channel;

    public ChannelCoroutine(CoroutineContext coroutineContext, Channel<E> channel, boolean z, boolean z5) {
        super(coroutineContext, z, z5);
        this._channel = channel;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = JobSupport.toCancellationException$default(this, th, null, 1, null);
        this._channel.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return this._channel.close(th);
    }

    public final Channel<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        return this._channel.getOnReceiveCatching();
    }

    public final Channel<E> get_channel() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(Function1<? super Throwable, Unit> function1) {
        this._channel.invokeOnClose(function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> continuation) {
        return this._channel.receive(continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public Object mo185receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation) {
        Object objMo185receiveCatchingJP2dKIU = this._channel.mo185receiveCatchingJP2dKIU(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objMo185receiveCatchingJP2dKIU;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e4, Continuation<? super Unit> continuation) {
        return this._channel.send(e4, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public Object mo186tryReceivePtdJZtk() {
        return this._channel.mo186tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo187trySendJP2dKIU(E e4) {
        return this._channel.mo187trySendJP2dKIU(e4);
    }
}
