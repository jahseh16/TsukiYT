package bv;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.n3;
import java.util.Iterator;
import java.util.List;
import yk.wz;

/* JADX INFO: loaded from: classes.dex */
public class n3 implements Runnable {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final String f1340fb = yk.f.a("EnqueueRunnable");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i2.zn f1341v = new i2.zn();
    public final i2.fb y;

    public n3(@NonNull i2.fb fbVar) {
        this.y = fbVar;
    }

    public static void fb(androidx.work.impl.model.n3 n3Var) {
        yk.n3 n3Var2 = n3Var.constraints;
        String str = n3Var.workerClassName;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (n3Var2.a() || n3Var2.c5()) {
            n3.y yVar = new n3.y();
            yVar.zn(n3Var.input).v("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            n3Var.workerClassName = ConstraintTrackingWorker.class.getName();
            n3Var.input = yVar.y();
        }
    }

    public static boolean n3(@NonNull i2.fb fbVar) {
        boolean zZn = zn(fbVar.fb(), fbVar.a(), (String[]) i2.fb.t(fbVar).toArray(new String[0]), fbVar.gv(), fbVar.n3());
        fbVar.f();
        return zZn;
    }

    public static boolean s(@NonNull i2.i9 i9Var, @NonNull String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<i2.v> it = i9Var.mt().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public static boolean v(@NonNull i2.fb fbVar) {
        List<i2.fb> listV = fbVar.v();
        boolean z = false;
        if (listV != null) {
            boolean zV = false;
            for (i2.fb fbVar2 : listV) {
                if (fbVar2.i9()) {
                    yk.f.zn().s(f1340fb, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", fbVar2.zn())), new Throwable[0]);
                } else {
                    zV |= v(fbVar2);
                }
            }
            z = zV;
        }
        return n3(fbVar) | z;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d7 A[LOOP:5: B:119:0x01d1->B:121:0x01d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0141 A[PHI: r1 r9 r12 r13 r14
      0x0141: PHI (r1v1 java.lang.String[]) = 
      (r1v0 java.lang.String[])
      (r1v0 java.lang.String[])
      (r1v0 java.lang.String[])
      (r1v4 java.lang.String[])
      (r1v4 java.lang.String[])
     binds: [B:28:0x0063, B:29:0x0065, B:31:0x0073, B:82:0x0140, B:81:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r9v2 boolean) = (r9v1 boolean), (r9v1 boolean), (r9v1 boolean), (r9v6 boolean), (r9v7 boolean) binds: [B:28:0x0063, B:29:0x0065, B:31:0x0073, B:82:0x0140, B:81:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v4 boolean), (r12v4 boolean) binds: [B:28:0x0063, B:29:0x0065, B:31:0x0073, B:82:0x0140, B:81:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0063, B:29:0x0065, B:31:0x0073, B:82:0x0140, B:81:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r14v2 boolean) = (r14v1 boolean), (r14v1 boolean), (r14v1 boolean), (r14v5 boolean), (r14v5 boolean) binds: [B:28:0x0063, B:29:0x0065, B:31:0x0073, B:82:0x0140, B:81:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zn(i2.i9 r19, @androidx.annotation.NonNull java.util.List<? extends yk.x4> r20, java.lang.String[] r21, java.lang.String r22, yk.v r23) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.n3.zn(i2.i9, java.util.List, java.lang.String[], java.lang.String, yk.v):boolean");
    }

    public void a() {
        i2.i9 i9VarFb = this.y.fb();
        i2.a.n3(i9VarFb.tl(), i9VarFb.co(), i9VarFb.mt());
    }

    @NonNull
    public yk.wz gv() {
        return this.f1341v;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.y.s()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.y));
            }
            if (y()) {
                fb.y(this.y.fb().t(), RescheduleReceiver.class, true);
                a();
            }
            this.f1341v.y(yk.wz.y);
        } catch (Throwable th) {
            this.f1341v.y(new wz.n3.y(th));
        }
    }

    public boolean y() {
        WorkDatabase workDatabaseCo = this.y.fb().co();
        workDatabaseCo.beginTransaction();
        try {
            boolean zV = v(this.y);
            workDatabaseCo.setTransactionSuccessful();
            return zV;
        } finally {
            workDatabaseCo.endTransaction();
        }
    }
}
