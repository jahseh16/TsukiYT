package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qj.c5;

/* JADX INFO: loaded from: classes.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final List<AutoMigrationSpec> autoMigrationSpecs;
    public final List<RoomDatabase.Callback> callbacks;
    public final Context context;
    public final String copyFromAssetPath;
    public final File copyFromFile;
    public final Callable<InputStream> copyFromInputStream;
    public final RoomDatabase.JournalMode journalMode;
    public final RoomDatabase.MigrationContainer migrationContainer;
    private final Set<Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;
    public final Intent multiInstanceInvalidationServiceIntent;
    public final String name;
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    public final Executor queryExecutor;
    public final boolean requireMigration;
    public final c5.zn sqliteOpenHelperFactory;
    public final Executor transactionExecutor;
    public final List<Object> typeConverters;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, c5.zn sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z5, boolean z7, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z5;
        this.allowDestructiveMigrationOnDowngrade = z7;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean isMigrationRequired(int i, int i5) {
        if ((i > i5 && this.allowDestructiveMigrationOnDowngrade) || !this.requireMigration) {
            return false;
        }
        Set<Integer> set = this.migrationNotRequiredFrom;
        return set == null || !set.contains(Integer.valueOf(i));
    }

    public boolean isMigrationRequiredFrom(int i) {
        return isMigrationRequired(i, i + 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, c5.zn sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, boolean z5, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z, journalMode, queryExecutor, queryExecutor, (Intent) null, z5, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, c5.zn sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z7, boolean z8, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z7, z8, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, c5.zn sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z7, boolean z8, Set<Integer> set, String str2, File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z7, z8, set, str2, file, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, c5.zn sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z7, boolean z8, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z7, z8, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, c5.zn sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z7, boolean z8, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z7, z8, set, str2, file, callable, prepackagedDatabaseCallback, (List<? extends Object>) CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, c5.zn sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z7, boolean z8, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z7, z8, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, (List<? extends AutoMigrationSpec>) CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, c5.zn sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z7, boolean z8, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z7, z8, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, typeConverters, autoMigrationSpecs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
