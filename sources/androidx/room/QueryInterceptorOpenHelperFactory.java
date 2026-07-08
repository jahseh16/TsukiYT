package androidx.room;

import androidx.room.RoomDatabase;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import qj.c5;

/* JADX INFO: loaded from: classes.dex */
public final class QueryInterceptorOpenHelperFactory implements c5.zn {
    private final c5.zn delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    public QueryInterceptorOpenHelperFactory(c5.zn delegate, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    @Override // qj.c5.zn
    public c5 create(c5.n3 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new QueryInterceptorOpenHelper(this.delegate.create(configuration), this.queryCallbackExecutor, this.queryCallback);
    }
}
