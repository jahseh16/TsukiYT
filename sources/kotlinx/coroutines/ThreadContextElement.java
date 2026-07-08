package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface ThreadContextElement<S> extends CoroutineContext.Element {

    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> threadContextElement, R r3, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(threadContextElement, r3, function2);
        }

        public static <S> CoroutineContext plus(ThreadContextElement<S> threadContextElement, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(threadContextElement, coroutineContext);
        }
    }

    void restoreThreadContext(CoroutineContext coroutineContext, S s3);

    S updateThreadContext(CoroutineContext coroutineContext);
}
