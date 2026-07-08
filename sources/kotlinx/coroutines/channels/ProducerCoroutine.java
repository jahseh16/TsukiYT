package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: classes.dex */
final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    public ProducerCoroutine(CoroutineContext coroutineContext, Channel<E> channel) {
        super(coroutineContext, channel, true, true);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public /* bridge */ /* synthetic */ SendChannel getChannel() {
        return getChannel();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th, boolean z) {
        if (get_channel().close(th) || z) {
            return;
        }
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(Unit unit) {
        SendChannel.DefaultImpls.close$default(get_channel(), null, 1, null);
    }
}
