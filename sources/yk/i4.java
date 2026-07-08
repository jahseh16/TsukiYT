package yk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class i4 {
    public static final String y = f.a("WorkerFactory");

    @NonNull
    public static i4 zn() {
        return new y();
    }

    @Nullable
    public final ListenableWorker n3(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorkerY = y(context, str, workerParameters);
        if (listenableWorkerY == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                f.zn().n3(y, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerY = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    f.zn().n3(y, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerY == null || !listenableWorkerY.isUsed()) {
            return listenableWorkerY;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }

    @Nullable
    public abstract ListenableWorker y(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters);
}
