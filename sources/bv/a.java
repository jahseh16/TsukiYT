package bv;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public final WorkDatabase y;

    public a(@NonNull WorkDatabase workDatabase) {
        this.y = workDatabase;
    }

    public static void y(@NonNull Context context, @NonNull qj.s sVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i5 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sVar.beginTransaction();
            try {
                sVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                sVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                sharedPreferences.edit().clear().apply();
                sVar.setTransactionSuccessful();
            } finally {
                sVar.endTransaction();
            }
        }
    }

    public int gv(int i, int i5) {
        synchronized (a.class) {
            int iZn = zn("next_job_scheduler_id");
            if (iZn < i || iZn > i5) {
                v("next_job_scheduler_id", i + 1);
            } else {
                i = iZn;
            }
        }
        return i;
    }

    public int n3() {
        int iZn;
        synchronized (a.class) {
            iZn = zn("next_alarm_manager_id");
        }
        return iZn;
    }

    public final void v(String str, int i) {
        this.y.preferenceDao().insertPreference(new gf.zn(str, i));
    }

    public final int zn(String str) {
        this.y.beginTransaction();
        try {
            Long longValue = this.y.preferenceDao().getLongValue(str);
            int i = 0;
            int iIntValue = longValue != null ? longValue.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i = iIntValue + 1;
            }
            v(str, i);
            this.y.setTransactionSuccessful();
            this.y.endTransaction();
            return iIntValue;
        } catch (Throwable th) {
            this.y.endTransaction();
            throw th;
        }
    }
}
