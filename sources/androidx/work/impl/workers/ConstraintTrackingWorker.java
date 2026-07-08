package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.n3;
import br.y;
import i2.i9;
import java.util.Collections;
import java.util.List;
import ne.gv;
import ne.zn;
import s4.a;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements zn {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f1126t = f.a("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ListenableWorker f1127f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public volatile boolean f1128fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public fc.zn<ListenableWorker.y> f1129s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f1130v;
    public WorkerParameters y;

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.y = workerParameters;
        this.f1130v = new Object();
        this.f1128fb = false;
        this.f1129s = fc.zn.co();
    }

    @Override // ne.zn
    public void a(@NonNull List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public y getTaskExecutor() {
        return i9.xc(getApplicationContext()).z();
    }

    public void gv() {
        this.f1129s.xc(ListenableWorker.y.n3());
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f1127f;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // ne.zn
    public void n3(@NonNull List<String> list) {
        f.zn().y(f1126t, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f1130v) {
            this.f1128fb = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f1127f;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f1127f.stop();
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public a<ListenableWorker.y> startWork() {
        getBackgroundExecutor().execute(new y(this));
        return this.f1129s;
    }

    public void v() {
        String strS = getInputData().s("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strS)) {
            f.zn().n3(f1126t, "No worker to delegate to.", new Throwable[0]);
            zn();
            return;
        }
        ListenableWorker listenableWorkerN3 = getWorkerFactory().n3(getApplicationContext(), strS, this.y);
        this.f1127f = listenableWorkerN3;
        if (listenableWorkerN3 == null) {
            f.zn().y(f1126t, "No worker to delegate to.", new Throwable[0]);
            zn();
            return;
        }
        n3 workSpec = y().workSpecDao().getWorkSpec(getId().toString());
        if (workSpec == null) {
            zn();
            return;
        }
        gv gvVar = new gv(getApplicationContext(), getTaskExecutor(), this);
        gvVar.gv(Collections.singletonList(workSpec));
        if (!gvVar.zn(getId().toString())) {
            f.zn().y(f1126t, String.format("Constraints not met for delegate %s. Requesting retry.", strS), new Throwable[0]);
            gv();
            return;
        }
        f.zn().y(f1126t, String.format("Constraints met for delegate %s", strS), new Throwable[0]);
        try {
            a<ListenableWorker.y> aVarStartWork = this.f1127f.startWork();
            aVarStartWork.addListener(new n3(this, aVarStartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            f fVarZn = f.zn();
            String str = f1126t;
            fVarZn.y(str, String.format("Delegated worker %s threw exception in startWork.", strS), th);
            synchronized (this.f1130v) {
                try {
                    if (this.f1128fb) {
                        f.zn().y(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        gv();
                    } else {
                        zn();
                    }
                } finally {
                }
            }
        }
    }

    @NonNull
    public WorkDatabase y() {
        return i9.xc(getApplicationContext()).co();
    }

    public void zn() {
        this.f1129s.xc(ListenableWorker.y.y());
    }
}
