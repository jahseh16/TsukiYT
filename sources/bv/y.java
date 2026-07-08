package bv;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import yk.wz;
import yk.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements Runnable {
    public final i2.zn y = new i2.zn();

    public class n3 extends y {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ String f1347fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i2.i9 f1348v;

        public n3(i2.i9 i9Var, String str) {
            this.f1348v = i9Var;
            this.f1347fb = str;
        }

        @Override // bv.y
        public void s() {
            WorkDatabase workDatabaseCo = this.f1348v.co();
            workDatabaseCo.beginTransaction();
            try {
                Iterator<String> it = workDatabaseCo.workSpecDao().getUnfinishedWorkWithTag(this.f1347fb).iterator();
                while (it.hasNext()) {
                    y(this.f1348v, it.next());
                }
                workDatabaseCo.setTransactionSuccessful();
                workDatabaseCo.endTransaction();
                fb(this.f1348v);
            } catch (Throwable th) {
                workDatabaseCo.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: bv.y$y, reason: collision with other inner class name */
    public class C0042y extends y {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ UUID f1349fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i2.i9 f1350v;

        public C0042y(i2.i9 i9Var, UUID uuid) {
            this.f1350v = i9Var;
            this.f1349fb = uuid;
        }

        @Override // bv.y
        public void s() {
            WorkDatabase workDatabaseCo = this.f1350v.co();
            workDatabaseCo.beginTransaction();
            try {
                y(this.f1350v, this.f1349fb.toString());
                workDatabaseCo.setTransactionSuccessful();
                workDatabaseCo.endTransaction();
                fb(this.f1350v);
            } catch (Throwable th) {
                workDatabaseCo.endTransaction();
                throw th;
            }
        }
    }

    public class zn extends y {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ String f1351fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f1352s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i2.i9 f1353v;

        public zn(i2.i9 i9Var, String str, boolean z) {
            this.f1353v = i9Var;
            this.f1351fb = str;
            this.f1352s = z;
        }

        @Override // bv.y
        public void s() {
            WorkDatabase workDatabaseCo = this.f1353v.co();
            workDatabaseCo.beginTransaction();
            try {
                Iterator<String> it = workDatabaseCo.workSpecDao().getUnfinishedWorkWithName(this.f1351fb).iterator();
                while (it.hasNext()) {
                    y(this.f1353v, it.next());
                }
                workDatabaseCo.setTransactionSuccessful();
                workDatabaseCo.endTransaction();
                if (this.f1352s) {
                    fb(this.f1353v);
                }
            } catch (Throwable th) {
                workDatabaseCo.endTransaction();
                throw th;
            }
        }
    }

    public static y gv(@NonNull String str, @NonNull i2.i9 i9Var) {
        return new n3(i9Var, str);
    }

    public static y n3(@NonNull UUID uuid, @NonNull i2.i9 i9Var) {
        return new C0042y(i9Var, uuid);
    }

    public static y zn(@NonNull String str, @NonNull i2.i9 i9Var, boolean z) {
        return new zn(i9Var, str, z);
    }

    public final void a(WorkDatabase workDatabase, String str) {
        androidx.work.impl.model.zn znVarWorkSpecDao = workDatabase.workSpecDao();
        gf.n3 n3VarDependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            z.y state = znVarWorkSpecDao.getState(str2);
            if (state != z.y.SUCCEEDED && state != z.y.FAILED) {
                znVarWorkSpecDao.setState(z.y.CANCELLED, str2);
            }
            linkedList.addAll(n3VarDependencyDao.getDependentWorkIds(str2));
        }
    }

    public void fb(i2.i9 i9Var) {
        i2.a.n3(i9Var.tl(), i9Var.co(), i9Var.mt());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            s();
            this.y.y(yk.wz.y);
        } catch (Throwable th) {
            this.y.y(new wz.n3.y(th));
        }
    }

    public abstract void s();

    public yk.wz v() {
        return this.y;
    }

    public void y(i2.i9 i9Var, String str) {
        a(i9Var.co(), str);
        i9Var.p().t(str);
        Iterator<i2.v> it = i9Var.mt().iterator();
        while (it.hasNext()) {
            it.next().y(str);
        }
    }
}
