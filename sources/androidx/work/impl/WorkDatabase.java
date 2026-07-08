package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.impl.y;
import com.google.firebase.remoteconfig.internal.Code;
import gf.c5;
import gf.f;
import gf.fb;
import gf.gv;
import gf.i9;
import gf.t;
import gf.tl;
import gf.v;
import gf.zn;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l.a;
import qj.c5;
import qj.s;

/* JADX INFO: loaded from: classes.dex */
@TypeConverters({androidx.work.n3.class, tl.class})
@Database(entities = {gf.y.class, androidx.work.impl.model.n3.class, f.class, v.class, fb.class, c5.class, zn.class}, version = Code.UNIMPLEMENTED)
public abstract class WorkDatabase extends RoomDatabase {
    private static final String PRUNE_SQL_FORMAT_PREFIX = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";
    private static final String PRUNE_SQL_FORMAT_SUFFIX = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    private static final long PRUNE_THRESHOLD_MILLIS = TimeUnit.DAYS.toMillis(1);

    public class n3 extends RoomDatabase.Callback {
        @Override // androidx.room.RoomDatabase.Callback
        public void onOpen(@NonNull s sVar) {
            super.onOpen(sVar);
            sVar.beginTransaction();
            try {
                sVar.execSQL(WorkDatabase.getPruneSQL());
                sVar.setTransactionSuccessful();
            } finally {
                sVar.endTransaction();
            }
        }
    }

    public class y implements c5.zn {
        public final /* synthetic */ Context y;

        public y(Context context) {
            this.y = context;
        }

        @Override // qj.c5.zn
        @NonNull
        public qj.c5 create(@NonNull c5.n3 n3Var) {
            c5.n3.y yVarY = c5.n3.y(this.y);
            yVarY.zn(n3Var.n3).n3(n3Var.zn).gv(true);
            return new a().create(yVarY.y());
        }
    }

    @NonNull
    public static WorkDatabase create(@NonNull Context context, @NonNull Executor executor, boolean z) {
        RoomDatabase.Builder builderDatabaseBuilder;
        if (z) {
            builderDatabaseBuilder = Room.inMemoryDatabaseBuilder(context, WorkDatabase.class).allowMainThreadQueries();
        } else {
            builderDatabaseBuilder = Room.databaseBuilder(context, WorkDatabase.class, i2.s.gv());
            builderDatabaseBuilder.openHelperFactory(new y(context));
        }
        return (WorkDatabase) builderDatabaseBuilder.setQueryExecutor(executor).addCallback(generateCleanupCallback()).addMigrations(androidx.work.impl.y.y).addMigrations(new y.s(context, 2, 3)).addMigrations(androidx.work.impl.y.n3).addMigrations(androidx.work.impl.y.zn).addMigrations(new y.s(context, 5, 6)).addMigrations(androidx.work.impl.y.f1133gv).addMigrations(androidx.work.impl.y.f1134v).addMigrations(androidx.work.impl.y.f1131a).addMigrations(new y.c5(context)).addMigrations(new y.s(context, 10, 11)).addMigrations(androidx.work.impl.y.f1132fb).fallbackToDestructiveMigration().build();
    }

    public static RoomDatabase.Callback generateCleanupCallback() {
        return new n3();
    }

    public static long getPruneDate() {
        return System.currentTimeMillis() - PRUNE_THRESHOLD_MILLIS;
    }

    @NonNull
    public static String getPruneSQL() {
        return PRUNE_SQL_FORMAT_PREFIX + getPruneDate() + PRUNE_SQL_FORMAT_SUFFIX;
    }

    @NonNull
    public abstract gf.n3 dependencyDao();

    @NonNull
    public abstract gv preferenceDao();

    @NonNull
    public abstract androidx.work.impl.model.y rawWorkInfoDao();

    @NonNull
    public abstract gf.a systemIdInfoDao();

    @NonNull
    public abstract gf.s workNameDao();

    @NonNull
    public abstract i9 workProgressDao();

    @NonNull
    public abstract androidx.work.impl.model.zn workSpecDao();

    @NonNull
    public abstract t workTagDao();
}
