package androidx.room;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import qj.s;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 extends FunctionReferenceImpl implements Function1<s, Boolean> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2();

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2() {
        super(1, s.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(s p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.yieldIfContendedSafely());
    }
}
