package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fc.zn;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import s4.a;
import yk.i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class y {
        @NonNull
        public static y gv(@NonNull n3 n3Var) {
            return new zn(n3Var);
        }

        @NonNull
        public static y n3() {
            return new n3();
        }

        @NonNull
        public static y y() {
            return new y();
        }

        @NonNull
        public static y zn() {
            return new zn();
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.y();
    }

    @NonNull
    public a<yk.a> getForegroundInfoAsync() {
        zn znVarCo = zn.co();
        znVarCo.w(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return znVarCo;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.zn();
    }

    @NonNull
    public final n3 getInputData() {
        return this.mWorkerParams.gv();
    }

    @Nullable
    public final Network getNetwork() {
        return this.mWorkerParams.v();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.fb();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.s();
    }

    @NonNull
    public br.y getTaskExecutor() {
        return this.mWorkerParams.c5();
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.i9();
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f();
    }

    @NonNull
    public i4 getWorkerFactory() {
        return this.mWorkerParams.t();
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final a<Void> setForegroundAsync(@NonNull yk.a aVar) {
        this.mRunInForeground = true;
        return this.mWorkerParams.n3().y(getApplicationContext(), getId(), aVar);
    }

    @NonNull
    public a<Void> setProgressAsync(@NonNull n3 n3Var) {
        return this.mWorkerParams.a().y(getApplicationContext(), getId(), n3Var);
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    public abstract a<y> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
