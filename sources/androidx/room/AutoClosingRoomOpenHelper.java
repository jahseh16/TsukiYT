package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import qj.a;
import qj.c5;
import qj.f;
import qj.fb;
import qj.s;
import qj.t;
import qj.v;
import qj.zn;

/* JADX INFO: loaded from: classes.dex */
public final class AutoClosingRoomOpenHelper implements c5, DelegatingOpenHelper {
    public final AutoCloser autoCloser;
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;
    private final c5 delegate;

    public static final class AutoClosingSupportSQLiteDatabase implements s {
        private final AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        @Override // qj.s
        public void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // qj.s
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // qj.s
        public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // qj.s
        public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.autoCloser.closeDatabaseIfOpen();
        }

        @Override // qj.s
        public t compileStatement(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new AutoClosingSupportSqliteStatement(sql, this.autoCloser);
        }

        @Override // qj.s
        public int delete(final String table, final String str, final Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1<s, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Integer.valueOf(db.delete(table, str, objArr));
                }
            })).intValue();
        }

        @Override // qj.s
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // qj.s
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // qj.s
        public void endTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                s delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
                Intrinsics.checkNotNull(delegateDatabase$room_runtime_release);
                delegateDatabase$room_runtime_release.endTransaction();
            } finally {
                this.autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // qj.s
        public /* bridge */ /* synthetic */ void execPerConnectionSQL(String str, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
            fb.y(this, str, objArr);
        }

        @Override // qj.s
        public void execSQL(final String sql) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.autoCloser.executeRefCountingFunction(new Function1<s, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.execSQL(sql);
                    return null;
                }
            });
        }

        @Override // qj.s
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.autoCloser.executeRefCountingFunction(new Function1<s, List<? extends Pair<String, String>>>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // kotlin.jvm.functions.Function1
                public final List<Pair<String, String>> invoke(s obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.getAttachedDbs();
                }
            });
        }

        @Override // qj.s
        public long getMaximumSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Long.valueOf(((s) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // qj.s
        public long getPageSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Long.valueOf(((s) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl
                public void set(Object obj, Object obj2) {
                    ((s) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // qj.s
        public String getPath() {
            return (String) this.autoCloser.executeRefCountingFunction(new Function1<s, String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(s obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.getPath();
                }
            });
        }

        @Override // qj.s
        public int getVersion() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Integer.valueOf(((s) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl
                public void set(Object obj, Object obj2) {
                    ((s) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // qj.s
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE)).booleanValue();
        }

        @Override // qj.s
        public long insert(final String table, final int i, final ContentValues values) throws SQLException {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1<s, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Long.valueOf(db.insert(table, i, values));
                }
            })).longValue();
        }

        @Override // qj.s
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1<s, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(s obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Boolean.valueOf(obj.isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // qj.s
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Boolean.valueOf(((s) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // qj.s
        public /* bridge */ /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return fb.n3(this);
        }

        @Override // qj.s
        public boolean isOpen() {
            s delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release == null) {
                return false;
            }
            return delegateDatabase$room_runtime_release.isOpen();
        }

        @Override // qj.s
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1<s, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(s obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Boolean.valueOf(obj.isReadOnly());
                }
            })).booleanValue();
        }

        @Override // qj.s
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1<s, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Boolean.valueOf(db.isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // qj.s
        public boolean needUpgrade(final int i) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1<s, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Boolean.valueOf(db.needUpgrade(i));
                }
            })).booleanValue();
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(new Function1<s, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(s it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return null;
                }
            });
        }

        @Override // qj.s
        public Cursor query(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // qj.s
        public void setForeignKeyConstraintsEnabled(final boolean z) {
            this.autoCloser.executeRefCountingFunction(new Function1<s, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setForeignKeyConstraintsEnabled(z);
                    return null;
                }
            });
        }

        @Override // qj.s
        public void setLocale(final Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.autoCloser.executeRefCountingFunction(new Function1<s, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setLocale(locale);
                    return null;
                }
            });
        }

        @Override // qj.s
        public void setMaxSqlCacheSize(final int i) {
            this.autoCloser.executeRefCountingFunction(new Function1<s, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setMaxSqlCacheSize(i);
                    return null;
                }
            });
        }

        @Override // qj.s
        public long setMaximumSize(final long j) {
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1<s, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Long.valueOf(db.setMaximumSize(j));
                }
            })).longValue();
        }

        @Override // qj.s
        public void setPageSize(final long j) {
            this.autoCloser.executeRefCountingFunction(new Function1<s, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setPageSize(j);
                    return null;
                }
            });
        }

        @Override // qj.s
        public void setTransactionSuccessful() {
            Unit unit;
            s delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release != null) {
                delegateDatabase$room_runtime_release.setTransactionSuccessful();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // qj.s
        public void setVersion(final int i) {
            this.autoCloser.executeRefCountingFunction(new Function1<s, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setVersion(i);
                    return null;
                }
            });
        }

        @Override // qj.s
        public int update(final String table, final int i, final ContentValues values, final String str, final Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1<s, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Integer.valueOf(db.update(table, i, values, str, objArr));
                }
            })).intValue();
        }

        @Override // qj.s
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.INSTANCE)).booleanValue();
        }

        @Override // qj.s
        public void execSQL(final String sql, final Object[] bindArgs) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.autoCloser.executeRefCountingFunction(new Function1<s, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.execSQL(sql, bindArgs);
                    return null;
                }
            });
        }

        @Override // qj.s
        public boolean yieldIfContendedSafely(long j) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.INSTANCE)).booleanValue();
        }

        @Override // qj.s
        public Cursor query(String query, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // qj.s
        public Cursor query(f query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // qj.s
        public Cursor query(f query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }
    }

    public static final class AutoClosingSupportSqliteStatement implements t {
        private final AutoCloser autoCloser;
        private final ArrayList<Object> binds;
        private final String sql;

        public AutoClosingSupportSqliteStatement(String sql, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.binds = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void doBinds(t tVar) {
            Iterator<T> it = this.binds.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i5 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.binds.get(i);
                if (obj == null) {
                    tVar.bindNull(i5);
                } else if (obj instanceof Long) {
                    tVar.bindLong(i5, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    tVar.bindDouble(i5, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    tVar.bindString(i5, (String) obj);
                } else if (obj instanceof byte[]) {
                    tVar.bindBlob(i5, (byte[]) obj);
                }
                i = i5;
            }
        }

        private final <T> T executeSqliteStatementWithRefCount(Function1<? super t, ? extends T> function1) {
            return (T) this.autoCloser.executeRefCountingFunction(new executeSqliteStatementWithRefCount.1(this, function1));
        }

        private final void saveBinds(int i, Object obj) {
            int size;
            int i5 = i - 1;
            if (i5 >= this.binds.size() && (size = this.binds.size()) <= i5) {
                while (true) {
                    this.binds.add(null);
                    if (size == i5) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i5, obj);
        }

        @Override // qj.i9
        public void bindBlob(int i, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            saveBinds(i, value);
        }

        @Override // qj.i9
        public void bindDouble(int i, double d4) {
            saveBinds(i, Double.valueOf(d4));
        }

        @Override // qj.i9
        public void bindLong(int i, long j) {
            saveBinds(i, Long.valueOf(j));
        }

        @Override // qj.i9
        public void bindNull(int i) {
            saveBinds(i, null);
        }

        @Override // qj.i9
        public void bindString(int i, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            saveBinds(i, value);
        }

        @Override // qj.i9
        public void clearBindings() {
            this.binds.clear();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // qj.t
        public void execute() {
            executeSqliteStatementWithRefCount(execute.1.INSTANCE);
        }

        @Override // qj.t
        public long executeInsert() {
            return ((Number) executeSqliteStatementWithRefCount(executeInsert.1.INSTANCE)).longValue();
        }

        @Override // qj.t
        public int executeUpdateDelete() {
            return ((Number) executeSqliteStatementWithRefCount(executeUpdateDelete.1.INSTANCE)).intValue();
        }

        @Override // qj.t
        public long simpleQueryForLong() {
            return ((Number) executeSqliteStatementWithRefCount(simpleQueryForLong.1.INSTANCE)).longValue();
        }

        @Override // qj.t
        public String simpleQueryForString() {
            return (String) executeSqliteStatementWithRefCount(simpleQueryForString.1.INSTANCE);
        }
    }

    public static final class KeepAliveCursor implements Cursor {
        private final AutoCloser autoCloser;
        private final Cursor delegate;

        public KeepAliveCursor(Cursor delegate, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.delegate.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.delegate.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.delegate.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.delegate.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.delegate.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.delegate.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.delegate.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.delegate.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.delegate.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return zn.y(this.delegate);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return a.y(this.delegate);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.delegate.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.delegate.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.delegate.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.delegate.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.delegate.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.delegate.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.delegate.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.delegate.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            v.y(this.delegate, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.delegate.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr2, List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cr2, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            a.n3(this.delegate, cr2, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.delegate.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(c5 delegate, AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        autoCloser.init(getDelegate());
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // qj.c5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.autoClosingDb.close();
    }

    @Override // qj.c5
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public c5 getDelegate() {
        return this.delegate;
    }

    @Override // qj.c5
    public s getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // qj.c5
    public s getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // qj.c5
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.delegate.setWriteAheadLoggingEnabled(z);
    }
}
