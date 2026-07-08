package p;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class gv extends v {

    @Nullable
    public volatile Handler zn;
    public final Object y = new Object();
    public final ExecutorService n3 = Executors.newFixedThreadPool(4, new y());

    public static class n3 {
        @NonNull
        public static Handler y(@NonNull Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public class y implements ThreadFactory {
        public final AtomicInteger y = new AtomicInteger(0);

        public y() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.y.getAndIncrement());
            return thread;
        }
    }

    @NonNull
    public static Handler v(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return n3.y(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p.v
    public void gv(@NonNull Runnable runnable) {
        if (this.zn == null) {
            synchronized (this.y) {
                try {
                    if (this.zn == null) {
                        this.zn = v(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.zn.post(runnable);
    }

    @Override // p.v
    public void y(@NonNull Runnable runnable) {
        this.n3.execute(runnable);
    }

    @Override // p.v
    public boolean zn() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
