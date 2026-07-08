package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class SendingCollector<T> implements FlowCollector<T> {
    private final SendChannel<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public SendingCollector(SendChannel<? super T> sendChannel) {
        this.channel = sendChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t3, Continuation<? super Unit> continuation) {
        Object objSend = this.channel.send(t3, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }
}
