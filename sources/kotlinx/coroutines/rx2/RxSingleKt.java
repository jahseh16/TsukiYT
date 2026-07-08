package kotlinx.coroutines.rx2;

import ai1.f3;
import ai1.r;
import ai1.x4;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxSingleKt;

/* JADX INFO: loaded from: classes.dex */
public final class RxSingleKt {
    public static final <T> r<T> rxSingle(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        if (coroutineContext.get(Job.Key) == null) {
            return rxSingleInternal(GlobalScope.INSTANCE, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ r rxSingle$default(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxSingle(coroutineContext, function2);
    }

    private static final <T> r<T> rxSingleInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return r.n3(new f3() { // from class: hj1.y
            public final void subscribe(x4 x4Var) {
                RxSingleKt.rxSingleInternal$lambda$1(coroutineScope, coroutineContext, function2, x4Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxSingleInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, x4 x4Var) {
        RxSingleCoroutine rxSingleCoroutine = new RxSingleCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), x4Var);
        x4Var.n3(new RxCancellable(rxSingleCoroutine));
        rxSingleCoroutine.start(CoroutineStart.DEFAULT, rxSingleCoroutine, function2);
    }
}
