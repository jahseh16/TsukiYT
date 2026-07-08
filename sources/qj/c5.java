package qj;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public interface c5 extends Closeable {

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0147n3 f7466a = new C0147n3(null);

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f7467gv;
        public final String n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f7468v;
        public final Context y;
        public final y zn;

        /* JADX INFO: renamed from: qj.c5$n3$n3, reason: collision with other inner class name */
        public static final class C0147n3 {
            public /* synthetic */ C0147n3(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final y y(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new y(context);
            }

            public C0147n3() {
            }
        }

        public static class y {

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public boolean f7469gv;
            public String n3;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public boolean f7470v;
            public final Context y;
            public y zn;

            public y(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.y = context;
            }

            public y gv(boolean z) {
                this.f7469gv = z;
                return this;
            }

            public y n3(y callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.zn = callback;
                return this;
            }

            public n3 y() {
                String str;
                y yVar = this.zn;
                if (yVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f7469gv && ((str = this.n3) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new n3(this.y, this.n3, yVar, this.f7469gv, this.f7470v);
            }

            public y zn(String str) {
                this.n3 = str;
                return this;
            }
        }

        public n3(Context context, String str, y callback, boolean z, boolean z5) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.y = context;
            this.n3 = str;
            this.zn = callback;
            this.f7467gv = z;
            this.f7468v = z5;
        }

        public static final y y(Context context) {
            return f7466a.y(context);
        }
    }

    public static abstract class y {
        public static final C0148y Companion = new C0148y(null);
        private static final String TAG = "SupportSQLite";
        public final int version;

        /* JADX INFO: renamed from: qj.c5$y$y, reason: collision with other inner class name */
        public static final class C0148y {
            public /* synthetic */ C0148y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0148y() {
            }
        }

        public y(int i) {
            this.version = i;
        }

        private final void deleteDatabaseFile(String str) {
            if (StringsKt.equals(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z5 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z5) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z5) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w(TAG, "deleting the database file: " + str);
            try {
                qj.n3.zn(new File(str));
            } catch (Exception e4) {
                Log.w(TAG, "delete failed: ", e4);
            }
        }

        public void onConfigure(s db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onCorruption(s db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Log.e(TAG, "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = db.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            } finally {
                if (attachedDbs != null) {
                    Iterator<T> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        deleteDatabaseFile((String) obj);
                    }
                } else {
                    String path2 = db.getPath();
                    if (path2 != null) {
                        deleteDatabaseFile(path2);
                    }
                }
            }
        }

        public abstract void onCreate(s sVar);

        public void onDowngrade(s db, int i, int i5) {
            Intrinsics.checkNotNullParameter(db, "db");
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i5);
        }

        public void onOpen(s db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void onUpgrade(s sVar, int i, int i5);
    }

    public interface zn {
        c5 create(n3 n3Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    s getReadableDatabase();

    s getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
