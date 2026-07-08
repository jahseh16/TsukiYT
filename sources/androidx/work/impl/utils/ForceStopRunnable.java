package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.n3;
import androidx.work.impl.model.zn;
import bv.gv;
import i2.a;
import i2.i9;
import i2.s;
import j3.t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import yk.f;
import yk.z;
import yt.y;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f1124fb = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i9 f1125v;
    public final Context y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1123s = f.a("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f1122f = TimeUnit.DAYS.toMillis(3650);

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String y = f.a("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            f.zn().fb(y, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.fb(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull i9 i9Var) {
        this.y = context.getApplicationContext();
        this.f1125v = i9Var;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void fb(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntentGv = gv(context, y.n3() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f1122f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentGv);
        }
    }

    public static PendingIntent gv(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, zn(context), i);
    }

    public static Intent zn(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public boolean a() {
        androidx.work.y yVarTl = this.f1125v.tl();
        if (TextUtils.isEmpty(yVarTl.zn())) {
            f.zn().y(f1123s, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zN3 = bv.i9.n3(this.y, yVarTl);
        f.zn().y(f1123s, String.format("Is default app process = %s", Boolean.valueOf(zN3)), new Throwable[0]);
        return zN3;
    }

    public void c5(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void n3() {
        boolean zY = y();
        if (s()) {
            f.zn().y(f1123s, "Rescheduling Workers.", new Throwable[0]);
            this.f1125v.i4();
            this.f1125v.w().zn(false);
        } else if (v()) {
            f.zn().y(f1123s, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f1125v.i4();
        } else if (zY) {
            f.zn().y(f1123s, "Found unfinished work, scheduling it.", new Throwable[0]);
            a.n3(this.f1125v.tl(), this.f1125v.co(), this.f1125v.mt());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (!a()) {
                return;
            }
            while (true) {
                s.v(this.y);
                f.zn().y(f1123s, "Performing cleanup operations.", new Throwable[0]);
                try {
                    n3();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e4) {
                    i = this.f1124fb + 1;
                    this.f1124fb = i;
                    if (i >= 3) {
                        f.zn().n3(f1123s, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        this.f1125v.tl().gv();
                        throw illegalStateException;
                    }
                    f.zn().y(f1123s, String.format("Retrying after %s", Long.valueOf(((long) i) * 300)), e4);
                    c5(((long) this.f1124fb) * 300);
                }
                f.zn().y(f1123s, String.format("Retrying after %s", Long.valueOf(((long) i) * 300)), e4);
                c5(((long) this.f1124fb) * 300);
            }
        } finally {
            this.f1125v.x4();
        }
    }

    public boolean s() {
        return this.f1125v.w().y();
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean v() {
        try {
            PendingIntent pendingIntentGv = gv(this.y, y.n3() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentGv != null) {
                    pendingIntentGv.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.y.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        if (gv.y(historicalProcessExitReasons.get(i)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentGv == null) {
                fb(this.y);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e4) {
            e = e4;
            f.zn().s(f1123s, "Ignoring exception", e);
            return true;
        } catch (SecurityException e5) {
            e = e5;
            f.zn().s(f1123s, "Ignoring exception", e);
            return true;
        }
    }

    public boolean y() {
        boolean zC5 = Build.VERSION.SDK_INT >= 23 ? t.c5(this.y, this.f1125v) : false;
        WorkDatabase workDatabaseCo = this.f1125v.co();
        zn znVarWorkSpecDao = workDatabaseCo.workSpecDao();
        gf.i9 i9VarWorkProgressDao = workDatabaseCo.workProgressDao();
        workDatabaseCo.beginTransaction();
        try {
            List<n3> runningWork = znVarWorkSpecDao.getRunningWork();
            boolean z = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z) {
                for (n3 n3Var : runningWork) {
                    znVarWorkSpecDao.setState(z.y.ENQUEUED, n3Var.id);
                    znVarWorkSpecDao.markWorkSpecScheduled(n3Var.id, -1L);
                }
            }
            i9VarWorkProgressDao.deleteAll();
            workDatabaseCo.setTransactionSuccessful();
            workDatabaseCo.endTransaction();
            return z || zC5;
        } catch (Throwable th) {
            workDatabaseCo.endTransaction();
            throw th;
        }
    }
}
