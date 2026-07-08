package androidx.room.migration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qj.s;

/* JADX INFO: loaded from: classes.dex */
public final class MigrationKt {
    public static final Migration Migration(int i, int i5, Function1<? super s, Unit> migrate) {
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        return new MigrationImpl(i, i5, migrate);
    }
}
