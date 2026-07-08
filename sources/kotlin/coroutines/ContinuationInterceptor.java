package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface ContinuationInterceptor extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <E extends CoroutineContext.Element> E get(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                if (ContinuationInterceptor.Key != key) {
                    return null;
                }
                Intrinsics.checkNotNull(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            if (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey())) {
                return null;
            }
            E e4 = (E) abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor);
            if (e4 instanceof CoroutineContext.Element) {
                return e4;
            }
            return null;
        }

        public static CoroutineContext minusKey(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                return ContinuationInterceptor.Key == key ? EmptyCoroutineContext.INSTANCE : continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            return (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey()) || abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor) == null) ? continuationInterceptor : EmptyCoroutineContext.INSTANCE;
        }
    }

    public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation);

    void releaseInterceptedContinuation(Continuation<?> continuation);
}
