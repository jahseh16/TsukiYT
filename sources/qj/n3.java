package qj;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final n3 y = new n3();

    public static final Cursor a(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public static final void fb(SQLiteDatabase sQLiteDatabase, boolean z) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        sQLiteDatabase.setForeignKeyConstraintsEnabled(z);
    }

    public static final void gv(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        sQLiteDatabase.disableWriteAheadLogging();
    }

    public static final CancellationSignal n3() {
        return new CancellationSignal();
    }

    public static final void s(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
        Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
    }

    public static final boolean v(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final void y(CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
    }

    public static final boolean zn(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }
}
