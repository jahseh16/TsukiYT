package bv;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public final WorkDatabase y;

    public s(@NonNull WorkDatabase workDatabase) {
        this.y = workDatabase;
    }

    public static void n3(@NonNull Context context, @NonNull qj.s sVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j4 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sVar.beginTransaction();
            try {
                sVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                sVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j4)});
                sharedPreferences.edit().clear().apply();
                sVar.setTransactionSuccessful();
            } finally {
                sVar.endTransaction();
            }
        }
    }

    public boolean y() {
        Long longValue = this.y.preferenceDao().getLongValue("reschedule_needed");
        return longValue != null && longValue.longValue() == 1;
    }

    public void zn(boolean z) {
        this.y.preferenceDao().insertPreference(new gf.zn("reschedule_needed", z));
    }
}
