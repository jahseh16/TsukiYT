package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import fc.zn;
import s4.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    zn<ListenableWorker.y> mFuture;

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.xc(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.w(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public abstract ListenableWorker.y doWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final a<ListenableWorker.y> startWork() {
        this.mFuture = zn.co();
        getBackgroundExecutor().execute(new y());
        return this.mFuture;
    }
}
