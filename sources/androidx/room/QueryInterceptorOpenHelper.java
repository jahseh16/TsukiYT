package androidx.room;

import androidx.room.RoomDatabase;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import qj.c5;
import qj.s;

/* JADX INFO: loaded from: classes.dex */
public final class QueryInterceptorOpenHelper implements c5, DelegatingOpenHelper {
    private final c5 delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    public QueryInterceptorOpenHelper(c5 delegate, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    @Override // qj.c5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
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
        return new QueryInterceptorDatabase(getDelegate().getReadableDatabase(), this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // qj.c5
    public s getWritableDatabase() {
        return new QueryInterceptorDatabase(getDelegate().getWritableDatabase(), this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // qj.c5
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.delegate.setWriteAheadLoggingEnabled(z);
    }
}
