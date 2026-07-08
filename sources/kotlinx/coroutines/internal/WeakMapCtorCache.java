package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
final class WeakMapCtorCache extends CtorCache {
    public static final WeakMapCtorCache INSTANCE = new WeakMapCtorCache();
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> exceptionCtors = new WeakHashMap<>();

    private WeakMapCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public Function1<Throwable, Throwable> get(Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            Function1<Throwable, Throwable> function1 = exceptionCtors.get(cls);
            if (function1 != null) {
                return function1;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i5 = 0; i5 < readHoldCount; i5++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> weakHashMap = exceptionCtors;
                Function1<Throwable, Throwable> function12 = weakHashMap.get(cls);
                if (function12 != null) {
                    return function12;
                }
                Function1<Throwable, Throwable> function1CreateConstructor = ExceptionsConstructorKt.createConstructor(cls);
                weakHashMap.put(cls, function1CreateConstructor);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return function1CreateConstructor;
            } finally {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
