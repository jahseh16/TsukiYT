package i2;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import j3.t;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final String y = yk.f.a("Schedulers");

    public static void n3(@NonNull androidx.work.y yVar, @NonNull WorkDatabase workDatabase, List<v> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.zn znVarWorkSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<androidx.work.impl.model.n3> eligibleWorkForScheduling = znVarWorkSpecDao.getEligibleWorkForScheduling(yVar.s());
            List<androidx.work.impl.model.n3> allEligibleWorkSpecsForScheduling = znVarWorkSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<androidx.work.impl.model.n3> it = eligibleWorkForScheduling.iterator();
                while (it.hasNext()) {
                    znVarWorkSpecDao.markWorkSpecScheduled(it.next().id, jCurrentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                androidx.work.impl.model.n3[] n3VarArr = (androidx.work.impl.model.n3[]) eligibleWorkForScheduling.toArray(new androidx.work.impl.model.n3[eligibleWorkForScheduling.size()]);
                for (v vVar : list) {
                    if (vVar.gv()) {
                        vVar.zn(n3VarArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling == null || allEligibleWorkSpecsForScheduling.size() <= 0) {
                return;
            }
            androidx.work.impl.model.n3[] n3VarArr2 = (androidx.work.impl.model.n3[]) allEligibleWorkSpecsForScheduling.toArray(new androidx.work.impl.model.n3[allEligibleWorkSpecsForScheduling.size()]);
            for (v vVar2 : list) {
                if (!vVar2.gv()) {
                    vVar2.zn(n3VarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    @NonNull
    public static v y(@NonNull Context context, @NonNull i9 i9Var) {
        if (Build.VERSION.SDK_INT >= 23) {
            t tVar = new t(context, i9Var);
            bv.fb.y(context, SystemJobService.class, true);
            yk.f.zn().y(y, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return tVar;
        }
        v vVarZn = zn(context);
        if (vVarZn != null) {
            return vVarZn;
        }
        vn.n3 n3Var = new vn.n3(context);
        bv.fb.y(context, SystemAlarmService.class, true);
        yk.f.zn().y(y, "Created SystemAlarmScheduler", new Throwable[0]);
        return n3Var;
    }

    @Nullable
    public static v zn(@NonNull Context context) {
        try {
            v vVar = (v) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            yk.f.zn().y(y, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return vVar;
        } catch (Throwable th) {
            yk.f.zn().y(y, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
