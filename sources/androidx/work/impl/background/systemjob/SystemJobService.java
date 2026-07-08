package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.WorkerParameters;
import i2.i9;
import i2.n3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements n3 {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final String f1112fb = f.a("SystemJobService");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, JobParameters> f1113v = new HashMap();
    public i9 y;

    @Nullable
    public static String y(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i9 i9VarXc = i9.xc(getApplicationContext());
            this.y = i9VarXc;
            i9VarXc.p().zn(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            f.zn().s(f1112fb, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i9 i9Var = this.y;
        if (i9Var != null) {
            i9Var.p().c5(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        WorkerParameters.y yVar;
        if (this.y == null) {
            f.zn().y(f1112fb, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strY = y(jobParameters);
        if (TextUtils.isEmpty(strY)) {
            f.zn().n3(f1112fb, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f1113v) {
            try {
                if (this.f1113v.containsKey(strY)) {
                    f.zn().y(f1112fb, String.format("Job is already being executed by SystemJobService: %s", strY), new Throwable[0]);
                    return false;
                }
                f.zn().y(f1112fb, String.format("onStartJob for %s", strY), new Throwable[0]);
                this.f1113v.put(strY, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    yVar = new WorkerParameters.y();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        yVar.n3 = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        yVar.y = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i >= 28) {
                        yVar.zn = jobParameters.getNetwork();
                    }
                } else {
                    yVar = null;
                }
                this.y.c(strY, yVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        if (this.y == null) {
            f.zn().y(f1112fb, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strY = y(jobParameters);
        if (TextUtils.isEmpty(strY)) {
            f.zn().n3(f1112fb, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        f.zn().y(f1112fb, String.format("onStopJob for %s", strY), new Throwable[0]);
        synchronized (this.f1113v) {
            this.f1113v.remove(strY);
        }
        this.y.fh(strY);
        return !this.y.p().a(strY);
    }

    @Override // i2.n3
    public void v(@NonNull String str, boolean z) {
        JobParameters jobParametersRemove;
        f.zn().y(f1112fb, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f1113v) {
            jobParametersRemove = this.f1113v.remove(str);
        }
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z);
        }
    }
}
