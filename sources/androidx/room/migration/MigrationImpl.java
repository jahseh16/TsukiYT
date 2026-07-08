package androidx.room.migration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qj.s;

/* JADX INFO: loaded from: classes.dex */
final class MigrationImpl extends Migration {
    private final Function1<s, Unit> migrateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MigrationImpl(int i, int i5, Function1<? super s, Unit> migrateCallback) {
        super(i, i5);
        Intrinsics.checkNotNullParameter(migrateCallback, "migrateCallback");
        this.migrateCallback = migrateCallback;
    }

    public final Function1<s, Unit> getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(s database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.migrateCallback.invoke(database);
    }
}
