package j3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import yk.z;

/* JADX INFO: loaded from: classes.dex */
public class t implements i2.v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5806f = yk.f.a("SystemJobScheduler");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final i2.i9 f5807fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f5808s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final JobScheduler f5809v;
    public final Context y;

    public t(@NonNull Context context, @NonNull i2.i9 i9Var) {
        this(context, i9Var, (JobScheduler) context.getSystemService("jobscheduler"), new f(context));
    }

    @Nullable
    public static List<Integer> a(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        List<JobInfo> listFb = fb(context, jobScheduler);
        if (listFb == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listFb) {
            if (str.equals(s(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static boolean c5(@NonNull Context context, @NonNull i2.i9 i9Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listFb = fb(context, jobScheduler);
        List<String> workSpecIds = i9Var.co().systemIdInfoDao().getWorkSpecIds();
        boolean z = false;
        HashSet hashSet = new HashSet(listFb != null ? listFb.size() : 0);
        if (listFb != null && !listFb.isEmpty()) {
            for (JobInfo jobInfo : listFb) {
                String strS = s(jobInfo);
                if (TextUtils.isEmpty(strS)) {
                    v(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strS);
                }
            }
        }
        Iterator<String> it = workSpecIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                yk.f.zn().y(f5806f, "Reconciling jobs", new Throwable[0]);
                z = true;
                break;
            }
        }
        if (z) {
            WorkDatabase workDatabaseCo = i9Var.co();
            workDatabaseCo.beginTransaction();
            try {
                androidx.work.impl.model.zn znVarWorkSpecDao = workDatabaseCo.workSpecDao();
                Iterator<String> it2 = workSpecIds.iterator();
                while (it2.hasNext()) {
                    znVarWorkSpecDao.markWorkSpecScheduled(it2.next(), -1L);
                }
                workDatabaseCo.setTransactionSuccessful();
                workDatabaseCo.endTransaction();
            } catch (Throwable th) {
                workDatabaseCo.endTransaction();
                throw th;
            }
        }
        return z;
    }

    @Nullable
    public static List<JobInfo> fb(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            yk.f.zn().n3(f5806f, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void n3(@NonNull Context context) {
        List<JobInfo> listFb;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listFb = fb(context, jobScheduler)) == null || listFb.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listFb.iterator();
        while (it.hasNext()) {
            v(jobScheduler, it.next().getId());
        }
    }

    @Nullable
    public static String s(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static void v(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            yk.f.zn().n3(f5806f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // i2.v
    public boolean gv() {
        return true;
    }

    public void i9(androidx.work.impl.model.n3 n3Var, int i) {
        JobInfo jobInfoY = this.f5808s.y(n3Var, i);
        yk.f fVarZn = yk.f.zn();
        String str = f5806f;
        fVarZn.y(str, String.format("Scheduling work ID %s Job ID %s", n3Var.id, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.f5809v.schedule(jobInfoY) == 0) {
                yk.f.zn().s(str, String.format("Unable to schedule work ID %s", n3Var.id), new Throwable[0]);
                if (n3Var.expedited && n3Var.outOfQuotaPolicy == yk.xc.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    n3Var.expedited = false;
                    yk.f.zn().y(str, String.format("Scheduling a non-expedited job (work ID %s)", n3Var.id), new Throwable[0]);
                    i9(n3Var, i);
                }
            }
        } catch (IllegalStateException e4) {
            List<JobInfo> listFb = fb(this.y, this.f5809v);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listFb != null ? listFb.size() : 0), Integer.valueOf(this.f5807fb.co().workSpecDao().getScheduledWork().size()), Integer.valueOf(this.f5807fb.tl().s()));
            yk.f.zn().n3(f5806f, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e4);
        } catch (Throwable th) {
            yk.f.zn().n3(f5806f, String.format("Unable to schedule %s", n3Var), th);
        }
    }

    @Override // i2.v
    public void y(@NonNull String str) {
        List<Integer> listA = a(this.y, this.f5809v, str);
        if (listA == null || listA.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listA.iterator();
        while (it.hasNext()) {
            v(this.f5809v, it.next().intValue());
        }
        this.f5807fb.co().systemIdInfoDao().removeSystemIdInfo(str);
    }

    @Override // i2.v
    public void zn(@NonNull androidx.work.impl.model.n3... n3VarArr) {
        List<Integer> listA;
        WorkDatabase workDatabaseCo = this.f5807fb.co();
        bv.a aVar = new bv.a(workDatabaseCo);
        for (androidx.work.impl.model.n3 n3Var : n3VarArr) {
            workDatabaseCo.beginTransaction();
            try {
                androidx.work.impl.model.n3 workSpec = workDatabaseCo.workSpecDao().getWorkSpec(n3Var.id);
                if (workSpec == null) {
                    yk.f.zn().s(f5806f, "Skipping scheduling " + n3Var.id + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseCo.setTransactionSuccessful();
                } else if (workSpec.state != z.y.ENQUEUED) {
                    yk.f.zn().s(f5806f, "Skipping scheduling " + n3Var.id + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseCo.setTransactionSuccessful();
                } else {
                    gf.v systemIdInfo = workDatabaseCo.systemIdInfoDao().getSystemIdInfo(n3Var.id);
                    int iGv = systemIdInfo != null ? systemIdInfo.systemId : aVar.gv(this.f5807fb.tl().c5(), this.f5807fb.tl().fb());
                    if (systemIdInfo == null) {
                        this.f5807fb.co().systemIdInfoDao().insertSystemIdInfo(new gf.v(n3Var.id, iGv));
                    }
                    i9(n3Var, iGv);
                    if (Build.VERSION.SDK_INT == 23 && (listA = a(this.y, this.f5809v, n3Var.id)) != null) {
                        int iIndexOf = listA.indexOf(Integer.valueOf(iGv));
                        if (iIndexOf >= 0) {
                            listA.remove(iIndexOf);
                        }
                        i9(n3Var, !listA.isEmpty() ? listA.get(0).intValue() : aVar.gv(this.f5807fb.tl().c5(), this.f5807fb.tl().fb()));
                    }
                    workDatabaseCo.setTransactionSuccessful();
                }
            } finally {
                workDatabaseCo.endTransaction();
            }
        }
    }

    public t(Context context, i2.i9 i9Var, JobScheduler jobScheduler, f fVar) {
        this.y = context;
        this.f5807fb = i9Var;
        this.f5809v = jobScheduler;
        this.f5808s = fVar;
    }
}
