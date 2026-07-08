package bv;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import yk.z;

/* JADX INFO: loaded from: classes.dex */
public class tl implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1344s = yk.f.a("StopWorkRunnable");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f1345fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1346v;
    public final i2.i9 y;

    public tl(@NonNull i2.i9 i9Var, @NonNull String str, boolean z) {
        this.y = i9Var;
        this.f1346v = str;
        this.f1345fb = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zXc;
        WorkDatabase workDatabaseCo = this.y.co();
        i2.gv gvVarP = this.y.p();
        androidx.work.impl.model.zn znVarWorkSpecDao = workDatabaseCo.workSpecDao();
        workDatabaseCo.beginTransaction();
        try {
            boolean zS = gvVarP.s(this.f1346v);
            if (this.f1345fb) {
                zXc = this.y.p().wz(this.f1346v);
            } else {
                if (!zS && znVarWorkSpecDao.getState(this.f1346v) == z.y.RUNNING) {
                    znVarWorkSpecDao.setState(z.y.ENQUEUED, this.f1346v);
                }
                zXc = this.y.p().xc(this.f1346v);
            }
            yk.f.zn().y(f1344s, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f1346v, Boolean.valueOf(zXc)), new Throwable[0]);
            workDatabaseCo.setTransactionSuccessful();
            workDatabaseCo.endTransaction();
        } catch (Throwable th) {
            workDatabaseCo.endTransaction();
            throw th;
        }
    }
}
