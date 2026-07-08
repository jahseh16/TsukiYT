package l;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l.gv;
import qj.c5;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements c5 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y f6089p = new y(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6090f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final c5.y f6091fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy<zn> f6093t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f6094v;
    public boolean w;
    public final Context y;

    /* JADX INFO: renamed from: l.gv$gv, reason: collision with other inner class name */
    public static final class C0121gv extends Lambda implements Function0<zn> {
        public C0121gv() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final zn invoke() {
            zn znVar;
            if (Build.VERSION.SDK_INT < 23 || gv.this.f6094v == null || !gv.this.f6092s) {
                znVar = new zn(gv.this.y, gv.this.f6094v, new n3(null), gv.this.f6091fb, gv.this.f6090f);
            } else {
                znVar = new zn(gv.this.y, new File(qj.gv.y(gv.this.y), gv.this.f6094v).getAbsolutePath(), new n3(null), gv.this.f6091fb, gv.this.f6090f);
            }
            qj.n3.s(znVar, gv.this.w);
            return znVar;
        }
    }

    public static final class n3 {
        public l.zn y;

        public n3(l.zn znVar) {
            this.y = znVar;
        }

        public final void n3(l.zn znVar) {
            this.y = znVar;
        }

        public final l.zn y() {
            return this.y;
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public static final class zn extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final C0123zn f6095p = new C0123zn(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f6096f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final c5.y f6097fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f6098s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final gq.y f6099t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final n3 f6100v;
        public boolean w;
        public final Context y;

        /* JADX INFO: renamed from: l.gv$zn$gv, reason: collision with other inner class name */
        public /* synthetic */ class C0122gv {
            public static final /* synthetic */ int[] y;

            static {
                int[] iArr = new int[n3.values().length];
                try {
                    iArr[n3.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n3.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n3.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n3.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[n3.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                y = iArr;
            }
        }

        public enum n3 {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        public static final class y extends RuntimeException {
            private final n3 callbackName;
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(n3 callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            public final n3 y() {
                return this.callbackName;
            }
        }

        /* JADX INFO: renamed from: l.gv$zn$zn, reason: collision with other inner class name */
        public static final class C0123zn {
            public /* synthetic */ C0123zn(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final l.zn y(n3 refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                l.zn znVarY = refHolder.y();
                if (znVarY != null && znVarY.t(sqLiteDatabase)) {
                    return znVarY;
                }
                l.zn znVar = new l.zn(sqLiteDatabase);
                refHolder.n3(znVar);
                return znVar;
            }

            public C0123zn() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zn(Context context, String str, final n3 dbRef, final c5.y callback, boolean z) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: l.v
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    gv.zn.a(callback, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.y = context;
            this.f6100v = dbRef;
            this.f6097fb = callback;
            this.f6098s = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
            this.f6099t = new gq.y(str, cacheDir, false);
        }

        public static final void a(c5.y callback, n3 dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C0123zn c0123zn = f6095p;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.onCorruption(c0123zn.y(dbRef, dbObj));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                gq.y.zn(this.f6099t, false, 1, null);
                super.close();
                this.f6100v.n3(null);
                this.w = false;
            } finally {
                this.f6099t.gv();
            }
        }

        public final SQLiteDatabase co(boolean z) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.y.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return p(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return p(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof y) {
                        y yVar = th;
                        Throwable cause = yVar.getCause();
                        int i = C0122gv.y[yVar.y().ordinal()];
                        if (i == 1 || i == 2 || i == 3 || i == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f6098s) {
                        throw th;
                    }
                    this.y.deleteDatabase(databaseName);
                    try {
                        return p(z);
                    } catch (y e4) {
                        throw e4.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                this.f6097fb.onConfigure(w(db));
            } catch (Throwable th) {
                throw new y(n3.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f6097fb.onCreate(w(sqLiteDatabase));
            } catch (Throwable th) {
                throw new y(n3.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i, int i5) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.f6096f = true;
            try {
                this.f6097fb.onDowngrade(w(db), i, i5);
            } catch (Throwable th) {
                throw new y(n3.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.f6096f) {
                try {
                    this.f6097fb.onOpen(w(db));
                } catch (Throwable th) {
                    throw new y(n3.ON_OPEN, th);
                }
            }
            this.w = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i5) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f6096f = true;
            try {
                this.f6097fb.onUpgrade(w(sqLiteDatabase), i, i5);
            } catch (Throwable th) {
                throw new y(n3.ON_UPGRADE, th);
            }
        }

        public final SQLiteDatabase p(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final qj.s t(boolean z) {
            try {
                this.f6099t.n3((this.w || getDatabaseName() == null) ? false : true);
                this.f6096f = false;
                SQLiteDatabase sQLiteDatabaseCo = co(z);
                if (!this.f6096f) {
                    l.zn znVarW = w(sQLiteDatabaseCo);
                    this.f6099t.gv();
                    return znVarW;
                }
                close();
                qj.s sVarT = t(z);
                this.f6099t.gv();
                return sVarT;
            } catch (Throwable th) {
                this.f6099t.gv();
                throw th;
            }
        }

        public final l.zn w(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f6095p.y(this.f6100v, sqLiteDatabase);
        }
    }

    public gv(Context context, String str, c5.y callback, boolean z, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.y = context;
        this.f6094v = str;
        this.f6091fb = callback;
        this.f6092s = z;
        this.f6090f = z5;
        this.f6093t = LazyKt.lazy(new C0121gv());
    }

    @Override // qj.c5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f6093t.isInitialized()) {
            r().close();
        }
    }

    @Override // qj.c5
    public String getDatabaseName() {
        return this.f6094v;
    }

    @Override // qj.c5
    public qj.s getReadableDatabase() {
        return r().t(false);
    }

    @Override // qj.c5
    public qj.s getWritableDatabase() {
        return r().t(true);
    }

    public final zn r() {
        return this.f6093t.getValue();
    }

    @Override // qj.c5
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f6093t.isInitialized()) {
            qj.n3.s(r(), z);
        }
        this.w = z;
    }
}
