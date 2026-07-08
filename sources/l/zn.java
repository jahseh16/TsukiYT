package l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qj.f;
import qj.t;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements qj.s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<Pair<String, String>> f6110v;
    public final SQLiteDatabase y;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final n3 f6108fb = new n3(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f6109s = {FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f6107f = new String[0];

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n3() {
        }
    }

    public static final class y {
        public static final y y = new y();

        public final void y(SQLiteDatabase sQLiteDatabase, String sql, Object[] objArr) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
        }
    }

    /* JADX INFO: renamed from: l.zn$zn, reason: collision with other inner class name */
    public static final class C0124zn extends Lambda implements Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {
        final /* synthetic */ f $query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0124zn(f fVar) {
            super(4);
            this.$query = fVar;
        }

        @Override // kotlin.jvm.functions.Function4
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            f fVar = this.$query;
            Intrinsics.checkNotNull(sQLiteQuery);
            fVar.bindTo(new fb(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public zn(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.y = delegate;
        this.f6110v = delegate.getAttachedDbs();
    }

    public static final Cursor p(f query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        query.bindTo(new fb(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor w(Function4 tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // qj.s
    public void beginTransaction() {
        this.y.beginTransaction();
    }

    @Override // qj.s
    public void beginTransactionNonExclusive() {
        this.y.beginTransactionNonExclusive();
    }

    @Override // qj.s
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.y.beginTransactionWithListener(transactionListener);
    }

    @Override // qj.s
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.y.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.y.close();
    }

    @Override // qj.s
    public t compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.y.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new s(sQLiteStatementCompileStatement);
    }

    @Override // qj.s
    public int delete(String table, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(table);
        if (str != null && str.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        t tVarCompileStatement = compileStatement(string);
        qj.y.f7471fb.n3(tVarCompileStatement, objArr);
        return tVarCompileStatement.executeUpdateDelete();
    }

    @Override // qj.s
    public void disableWriteAheadLogging() {
        qj.n3.gv(this.y);
    }

    @Override // qj.s
    public boolean enableWriteAheadLogging() {
        return this.y.enableWriteAheadLogging();
    }

    @Override // qj.s
    public void endTransaction() {
        this.y.endTransaction();
    }

    @Override // qj.s
    public void execPerConnectionSQL(String sql, Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            y.y.y(this.y, sql, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i);
    }

    @Override // qj.s
    public void execSQL(String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.y.execSQL(sql);
    }

    @Override // qj.s
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f6110v;
    }

    @Override // qj.s
    public long getMaximumSize() {
        return this.y.getMaximumSize();
    }

    @Override // qj.s
    public long getPageSize() {
        return this.y.getPageSize();
    }

    @Override // qj.s
    public String getPath() {
        return this.y.getPath();
    }

    @Override // qj.s
    public int getVersion() {
        return this.y.getVersion();
    }

    @Override // qj.s
    public boolean inTransaction() {
        return this.y.inTransaction();
    }

    @Override // qj.s
    public long insert(String table, int i, ContentValues values) throws SQLException {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.y.insertWithOnConflict(table, null, values, i);
    }

    @Override // qj.s
    public boolean isDatabaseIntegrityOk() {
        return this.y.isDatabaseIntegrityOk();
    }

    @Override // qj.s
    public boolean isDbLockedByCurrentThread() {
        return this.y.isDbLockedByCurrentThread();
    }

    @Override // qj.s
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // qj.s
    public boolean isOpen() {
        return this.y.isOpen();
    }

    @Override // qj.s
    public boolean isReadOnly() {
        return this.y.isReadOnly();
    }

    @Override // qj.s
    public boolean isWriteAheadLoggingEnabled() {
        return qj.n3.v(this.y);
    }

    @Override // qj.s
    public boolean needUpgrade(int i) {
        return this.y.needUpgrade(i);
    }

    @Override // qj.s
    public Cursor query(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query(new qj.y(query));
    }

    @Override // qj.s
    public void setForeignKeyConstraintsEnabled(boolean z) {
        qj.n3.fb(this.y, z);
    }

    @Override // qj.s
    public void setLocale(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.y.setLocale(locale);
    }

    @Override // qj.s
    public void setMaxSqlCacheSize(int i) {
        this.y.setMaxSqlCacheSize(i);
    }

    @Override // qj.s
    public long setMaximumSize(long j) {
        this.y.setMaximumSize(j);
        return this.y.getMaximumSize();
    }

    @Override // qj.s
    public void setPageSize(long j) {
        this.y.setPageSize(j);
    }

    @Override // qj.s
    public void setTransactionSuccessful() {
        this.y.setTransactionSuccessful();
    }

    @Override // qj.s
    public void setVersion(int i) {
        this.y.setVersion(i);
    }

    public final boolean t(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.y, sqLiteDatabase);
    }

    @Override // qj.s
    public int update(String table, int i, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(f6109s[i]);
        sb.append(table);
        sb.append(" SET ");
        int i5 = 0;
        for (String str2 : values.keySet()) {
            sb.append(i5 > 0 ? "," : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            sb.append(str2);
            objArr2[i5] = values.get(str2);
            sb.append("=?");
            i5++;
        }
        if (objArr != null) {
            for (int i8 = size; i8 < length; i8++) {
                objArr2[i8] = objArr[i8 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        t tVarCompileStatement = compileStatement(string);
        qj.y.f7471fb.n3(tVarCompileStatement, objArr2);
        return tVarCompileStatement.executeUpdateDelete();
    }

    @Override // qj.s
    public boolean yieldIfContendedSafely() {
        return this.y.yieldIfContendedSafely();
    }

    @Override // qj.s
    public void execSQL(String sql, Object[] bindArgs) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.y.execSQL(sql, bindArgs);
    }

    @Override // qj.s
    public Cursor query(String query, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        return query(new qj.y(query, bindArgs));
    }

    @Override // qj.s
    public boolean yieldIfContendedSafely(long j) {
        return this.y.yieldIfContendedSafely(j);
    }

    @Override // qj.s
    public Cursor query(f query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final C0124zn c0124zn = new C0124zn(query);
        Cursor cursorRawQueryWithFactory = this.y.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: l.n3
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return zn.w(c0124zn, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getSql(), f6107f, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // qj.s
    public Cursor query(final f query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.y;
        String sql = query.getSql();
        String[] strArr = f6107f;
        Intrinsics.checkNotNull(cancellationSignal);
        return qj.n3.a(sQLiteDatabase, sql, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: l.y
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return zn.p(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }
}
