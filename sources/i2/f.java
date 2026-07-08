package i2;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import bv.p;
import bv.w;
import bv.xc;
import gf.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import yk.z;

/* JADX INFO: loaded from: classes.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5435b = yk.f.a("WorkerWrapper");
    public t c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public androidx.work.y f5436co;
    public List<String> d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.impl.model.n3 f5439f;
    public androidx.work.impl.model.zn f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public List<v> f5440fb;
    public String fh;
    public gf.n3 n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WorkDatabase f5442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WorkerParameters.y f5443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ListenableWorker f5444t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f5445v;
    public br.y w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f5446x;
    public Context y;
    public nd.y z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public ListenableWorker.y f5441p = ListenableWorker.y.y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public fc.zn<Boolean> f5437d = fc.zn.co();

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public s4.a<ListenableWorker.y> f5438ej = null;

    public static class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public WorkDatabase f5447a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @NonNull
        public WorkerParameters.y f5448c5 = new WorkerParameters.y();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @NonNull
        public String f5449fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @NonNull
        public br.y f5450gv;

        @Nullable
        public ListenableWorker n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List<v> f5451s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public androidx.work.y f5452v;

        @NonNull
        public Context y;

        @NonNull
        public nd.y zn;

        public zn(@NonNull Context context, @NonNull androidx.work.y yVar, @NonNull br.y yVar2, @NonNull nd.y yVar3, @NonNull WorkDatabase workDatabase, @NonNull String str) {
            this.y = context.getApplicationContext();
            this.f5450gv = yVar2;
            this.zn = yVar3;
            this.f5452v = yVar;
            this.f5447a = workDatabase;
            this.f5449fb = str;
        }

        @NonNull
        public zn n3(@Nullable WorkerParameters.y yVar) {
            if (yVar != null) {
                this.f5448c5 = yVar;
            }
            return this;
        }

        @NonNull
        public f y() {
            return new f(this);
        }

        @NonNull
        public zn zn(@NonNull List<v> list) {
            this.f5451s = list;
            return this;
        }
    }

    public f(@NonNull zn znVar) {
        this.y = znVar.y;
        this.w = znVar.f5450gv;
        this.z = znVar.zn;
        this.f5445v = znVar.f5449fb;
        this.f5440fb = znVar.f5451s;
        this.f5443s = znVar.f5448c5;
        this.f5444t = znVar.n3;
        this.f5436co = znVar.f5452v;
        WorkDatabase workDatabase = znVar.f5447a;
        this.f5442r = workDatabase;
        this.f3 = workDatabase.workSpecDao();
        this.n = this.f5442r.dependencyDao();
        this.c = this.f5442r.workTagDao();
    }

    public void a() {
        if (!wz()) {
            this.f5442r.beginTransaction();
            try {
                z.y state = this.f3.getState(this.f5445v);
                this.f5442r.workProgressDao().delete(this.f5445v);
                if (state == null) {
                    c5(false);
                } else if (state == z.y.RUNNING) {
                    zn(this.f5441p);
                } else if (!state.y()) {
                    fb();
                }
                this.f5442r.setTransactionSuccessful();
                this.f5442r.endTransaction();
            } catch (Throwable th) {
                this.f5442r.endTransaction();
                throw th;
            }
        }
        List<v> list = this.f5440fb;
        if (list != null) {
            Iterator<v> it = list.iterator();
            while (it.hasNext()) {
                it.next().y(this.f5445v);
            }
            a.n3(this.f5436co, this.f5442r, this.f5440fb);
        }
    }

    public final void c5(boolean z) {
        ListenableWorker listenableWorker;
        this.f5442r.beginTransaction();
        try {
            if (!this.f5442r.workSpecDao().hasUnfinishedWork()) {
                bv.fb.y(this.y, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f3.setState(z.y.ENQUEUED, this.f5445v);
                this.f3.markWorkSpecScheduled(this.f5445v, -1L);
            }
            if (this.f5439f != null && (listenableWorker = this.f5444t) != null && listenableWorker.isRunInForeground()) {
                this.z.y(this.f5445v);
            }
            this.f5442r.setTransactionSuccessful();
            this.f5442r.endTransaction();
            this.f5437d.xc(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f5442r.endTransaction();
            throw th;
        }
    }

    public final void f() {
        androidx.work.n3 n3VarN3;
        if (wz()) {
            return;
        }
        this.f5442r.beginTransaction();
        try {
            androidx.work.impl.model.n3 workSpec = this.f3.getWorkSpec(this.f5445v);
            this.f5439f = workSpec;
            if (workSpec == null) {
                yk.f.zn().n3(f5435b, String.format("Didn't find WorkSpec for id %s", this.f5445v), new Throwable[0]);
                c5(false);
                this.f5442r.setTransactionSuccessful();
                return;
            }
            if (workSpec.state != z.y.ENQUEUED) {
                i9();
                this.f5442r.setTransactionSuccessful();
                yk.f.zn().y(f5435b, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f5439f.workerClassName), new Throwable[0]);
                return;
            }
            if (workSpec.gv() || this.f5439f.zn()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                androidx.work.impl.model.n3 n3Var = this.f5439f;
                if (n3Var.periodStartTime != 0 && jCurrentTimeMillis < n3Var.y()) {
                    yk.f.zn().y(f5435b, String.format("Delaying execution for %s because it is being executed before schedule.", this.f5439f.workerClassName), new Throwable[0]);
                    c5(true);
                    this.f5442r.setTransactionSuccessful();
                    return;
                }
            }
            this.f5442r.setTransactionSuccessful();
            this.f5442r.endTransaction();
            if (this.f5439f.gv()) {
                n3VarN3 = this.f5439f.input;
            } else {
                yk.c5 c5VarN3 = this.f5436co.a().n3(this.f5439f.inputMergerClassName);
                if (c5VarN3 == null) {
                    yk.f.zn().n3(f5435b, String.format("Could not create Input Merger %s", this.f5439f.inputMergerClassName), new Throwable[0]);
                    t();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f5439f.input);
                    arrayList.addAll(this.f3.getInputsFromPrerequisites(this.f5445v));
                    n3VarN3 = c5VarN3.n3(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f5445v), n3VarN3, this.d0, this.f5443s, this.f5439f.runAttemptCount, this.f5436co.v(), this.w, this.f5436co.tl(), new p(this.f5442r, this.w), new w(this.f5442r, this.z, this.w));
            if (this.f5444t == null) {
                this.f5444t = this.f5436co.tl().n3(this.y, this.f5439f.workerClassName, workerParameters);
            }
            ListenableWorker listenableWorker = this.f5444t;
            if (listenableWorker == null) {
                yk.f.zn().n3(f5435b, String.format("Could not create Worker %s", this.f5439f.workerClassName), new Throwable[0]);
                t();
                return;
            }
            if (listenableWorker.isUsed()) {
                yk.f.zn().n3(f5435b, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f5439f.workerClassName), new Throwable[0]);
                t();
                return;
            }
            this.f5444t.setUsed();
            if (!xc()) {
                i9();
                return;
            }
            if (wz()) {
                return;
            }
            fc.zn znVarCo = fc.zn.co();
            Runnable xcVar = new xc(this.y, this.f5439f, this.f5444t, workerParameters.n3(), this.w);
            this.w.y().execute(xcVar);
            s4.a aVarY = xcVar.y();
            aVarY.addListener(new y(this, aVarY, znVarCo), this.w.y());
            znVarCo.addListener(new n3(this, znVarCo, this.fh), this.w.getBackgroundExecutor());
        } finally {
            this.f5442r.endTransaction();
        }
    }

    public final void fb() {
        this.f5442r.beginTransaction();
        try {
            this.f3.setState(z.y.ENQUEUED, this.f5445v);
            this.f3.setPeriodStartTime(this.f5445v, System.currentTimeMillis());
            this.f3.markWorkSpecScheduled(this.f5445v, -1L);
            this.f5442r.setTransactionSuccessful();
        } finally {
            this.f5442r.endTransaction();
            c5(true);
        }
    }

    public void gv() {
        boolean zIsDone;
        this.f5446x = true;
        wz();
        s4.a<ListenableWorker.y> aVar = this.f5438ej;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            this.f5438ej.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f5444t;
        if (listenableWorker == null || zIsDone) {
            yk.f.zn().y(f5435b, String.format("WorkSpec %s is already done. Not interrupting.", this.f5439f), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    public final void i9() {
        z.y state = this.f3.getState(this.f5445v);
        if (state == z.y.RUNNING) {
            yk.f.zn().y(f5435b, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f5445v), new Throwable[0]);
            c5(true);
        } else {
            yk.f.zn().y(f5435b, String.format("Status for %s is %s; not doing any work", this.f5445v, state), new Throwable[0]);
            c5(false);
        }
    }

    @NonNull
    public s4.a<Boolean> n3() {
        return this.f5437d;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> tagsForWorkSpecId = this.c.getTagsForWorkSpecId(this.f5445v);
        this.d0 = tagsForWorkSpecId;
        this.fh = y(tagsForWorkSpecId);
        f();
    }

    public final void s() {
        this.f5442r.beginTransaction();
        try {
            this.f3.setPeriodStartTime(this.f5445v, System.currentTimeMillis());
            this.f3.setState(z.y.ENQUEUED, this.f5445v);
            this.f3.resetWorkSpecRunAttemptCount(this.f5445v);
            this.f3.markWorkSpecScheduled(this.f5445v, -1L);
            this.f5442r.setTransactionSuccessful();
        } finally {
            this.f5442r.endTransaction();
            c5(false);
        }
    }

    public void t() {
        this.f5442r.beginTransaction();
        try {
            v(this.f5445v);
            this.f3.setOutput(this.f5445v, this.f5441p.v());
            this.f5442r.setTransactionSuccessful();
        } finally {
            this.f5442r.endTransaction();
            c5(false);
        }
    }

    public final void tl() {
        this.f5442r.beginTransaction();
        try {
            this.f3.setState(z.y.SUCCEEDED, this.f5445v);
            this.f3.setOutput(this.f5445v, this.f5441p.v());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.n.getDependentWorkIds(this.f5445v)) {
                if (this.f3.getState(str) == z.y.BLOCKED && this.n.hasCompletedAllPrerequisites(str)) {
                    yk.f.zn().gv(f5435b, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f3.setState(z.y.ENQUEUED, str);
                    this.f3.setPeriodStartTime(str, jCurrentTimeMillis);
                }
            }
            this.f5442r.setTransactionSuccessful();
            this.f5442r.endTransaction();
            c5(false);
        } catch (Throwable th) {
            this.f5442r.endTransaction();
            c5(false);
            throw th;
        }
    }

    public final void v(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f3.getState(str2) != z.y.CANCELLED) {
                this.f3.setState(z.y.FAILED, str2);
            }
            linkedList.addAll(this.n.getDependentWorkIds(str2));
        }
    }

    public final boolean wz() {
        if (!this.f5446x) {
            return false;
        }
        yk.f.zn().y(f5435b, String.format("Work interrupted for %s", this.fh), new Throwable[0]);
        if (this.f3.getState(this.f5445v) == null) {
            c5(false);
        } else {
            c5(!r1.y());
        }
        return true;
    }

    public final boolean xc() {
        boolean z;
        this.f5442r.beginTransaction();
        try {
            if (this.f3.getState(this.f5445v) == z.y.ENQUEUED) {
                this.f3.setState(z.y.RUNNING, this.f5445v);
                this.f3.incrementWorkSpecRunAttemptCount(this.f5445v);
                z = true;
            } else {
                z = false;
            }
            this.f5442r.setTransactionSuccessful();
            this.f5442r.endTransaction();
            return z;
        } catch (Throwable th) {
            this.f5442r.endTransaction();
            throw th;
        }
    }

    public final String y(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f5445v);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public final void zn(ListenableWorker.y yVar) {
        if (yVar instanceof ListenableWorker.y.zn) {
            yk.f.zn().gv(f5435b, String.format("Worker result SUCCESS for %s", this.fh), new Throwable[0]);
            if (this.f5439f.gv()) {
                s();
                return;
            } else {
                tl();
                return;
            }
        }
        if (yVar instanceof ListenableWorker.y.n3) {
            yk.f.zn().gv(f5435b, String.format("Worker result RETRY for %s", this.fh), new Throwable[0]);
            fb();
            return;
        }
        yk.f.zn().gv(f5435b, String.format("Worker result FAILURE for %s", this.fh), new Throwable[0]);
        if (this.f5439f.gv()) {
            s();
        } else {
            t();
        }
    }
}
