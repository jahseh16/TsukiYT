package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.gv;
import i2.n3;
import java.util.HashMap;
import java.util.Map;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class y implements n3 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1109s = f.a("CommandHandler");
    public final Context y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, n3> f1111v = new HashMap();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Object f1110fb = new Object();

    public y(@NonNull Context context) {
        this.y = context;
    }

    public static Intent a(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent fb(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent gv(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    public static Intent n3(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static boolean wz(@Nullable Bundle bundle, @NonNull String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static Intent y(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent zn(@NonNull Context context, @NonNull String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    public final void c5(@NonNull Intent intent, int i, @NonNull gv gvVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f1110fb) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                f fVarZn = f.zn();
                String str = f1109s;
                fVarZn.y(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f1111v.containsKey(string)) {
                    f.zn().y(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    n3 znVar = new zn(this.y, i, string, gvVar);
                    this.f1111v.put(string, znVar);
                    znVar.gv();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(@NonNull Intent intent, int i, @NonNull gv gvVar) {
        f.zn().y(f1109s, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        gvVar.fb().i4();
    }

    public final void i9(@NonNull Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        f.zn().y(f1109s, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        v(string, z);
    }

    public final void s(@NonNull Intent intent, int i, @NonNull gv gvVar) {
        f.zn().y(f1109s, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new n3(this.y, i, gvVar).y();
    }

    public final void t(@NonNull Intent intent, int i, @NonNull gv gvVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        f fVarZn = f.zn();
        String str = f1109s;
        fVarZn.y(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseCo = gvVar.fb().co();
        workDatabaseCo.beginTransaction();
        try {
            androidx.work.impl.model.n3 workSpec = workDatabaseCo.workSpecDao().getWorkSpec(string);
            if (workSpec == null) {
                f.zn().s(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (workSpec.state.y()) {
                f.zn().s(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jY = workSpec.y();
            if (workSpec.n3()) {
                f.zn().y(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jY)), new Throwable[0]);
                vn.y.zn(this.y, gvVar.fb(), string, jY);
                gvVar.f(new gv.n3(gvVar, y(this.y), i));
            } else {
                f.zn().y(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jY)), new Throwable[0]);
                vn.y.zn(this.y, gvVar.fb(), string, jY);
            }
            workDatabaseCo.setTransactionSuccessful();
        } finally {
            workDatabaseCo.endTransaction();
        }
    }

    public final void tl(@NonNull Intent intent, @NonNull gv gvVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        f.zn().y(f1109s, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        gvVar.fb().fh(string);
        vn.y.y(this.y, gvVar.fb(), string);
        gvVar.v(string, false);
    }

    @Override // i2.n3
    public void v(@NonNull String str, boolean z) {
        synchronized (this.f1110fb) {
            try {
                n3 n3VarRemove = this.f1111v.remove(str);
                if (n3VarRemove != null) {
                    n3VarRemove.v(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(@NonNull Intent intent, int i, @NonNull gv gvVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s(intent, i, gvVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            f(intent, i, gvVar);
            return;
        }
        if (!wz(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            f.zn().n3(f1109s, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            t(intent, i, gvVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            c5(intent, i, gvVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            tl(intent, gvVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i9(intent, i);
        } else {
            f.zn().s(f1109s, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }

    public boolean xc() {
        boolean z;
        synchronized (this.f1110fb) {
            z = !this.f1111v.isEmpty();
        }
        return z;
    }
}
