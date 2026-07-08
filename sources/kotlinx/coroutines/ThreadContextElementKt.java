package kotlinx.coroutines;

import kotlinx.coroutines.internal.ThreadLocalElement;

/* JADX INFO: loaded from: classes.dex */
public final class ThreadContextElementKt {
    public static final <T> ThreadContextElement<T> asContextElement(ThreadLocal<T> threadLocal, T t3) {
        return new ThreadLocalElement(t3, threadLocal);
    }
}
