package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.room.migration.Migration;

/* JADX INFO: loaded from: classes.dex */
public class y {

    @NonNull
    public static Migration y = new C0029y(1, 2);

    @NonNull
    public static Migration n3 = new n3(3, 4);

    @NonNull
    public static Migration zn = new zn(4, 5);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @NonNull
    public static Migration f1133gv = new gv(6, 7);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public static Migration f1134v = new v(7, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static Migration f1131a = new a(8, 9);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public static Migration f1132fb = new fb(11, 12);

    public class a extends Migration {
        public a(int i, int i5) {
            super(i, i5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            sVar.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class c5 extends Migration {
        public final Context y;

        public c5(@NonNull Context context) {
            super(9, 10);
            this.y = context;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            sVar.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bv.s.n3(this.y, sVar);
            bv.a.y(this.y, sVar);
        }
    }

    public class fb extends Migration {
        public fb(int i, int i5) {
            super(i, i5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            sVar.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class gv extends Migration {
        public gv(int i, int i5) {
            super(i, i5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            sVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class n3 extends Migration {
        public n3(int i, int i5) {
            super(i, i5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                sVar.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    public static class s extends Migration {
        public final Context y;

        public s(@NonNull Context context, int i, int i5) {
            super(i, i5);
            this.y = context;
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            if (this.endVersion >= 10) {
                sVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.y.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public class v extends Migration {
        public v(int i, int i5) {
            super(i, i5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            sVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.y$y, reason: collision with other inner class name */
    public class C0029y extends Migration {
        public C0029y(int i, int i5) {
            super(i, i5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            sVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sVar.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            sVar.execSQL("DROP TABLE IF EXISTS alarmInfo");
            sVar.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class zn extends Migration {
        public zn(int i, int i5) {
            super(i, i5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull qj.s sVar) {
            sVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            sVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }
}
