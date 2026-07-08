package l;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import qj.i9;

/* JADX INFO: loaded from: classes.dex */
public class fb implements i9 {
    public final SQLiteProgram y;

    public fb(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.y = delegate;
    }

    @Override // qj.i9
    public void bindBlob(int i, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.y.bindBlob(i, value);
    }

    @Override // qj.i9
    public void bindDouble(int i, double d4) {
        this.y.bindDouble(i, d4);
    }

    @Override // qj.i9
    public void bindLong(int i, long j) {
        this.y.bindLong(i, j);
    }

    @Override // qj.i9
    public void bindNull(int i) {
        this.y.bindNull(i);
    }

    @Override // qj.i9
    public void bindString(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.y.bindString(i, value);
    }

    @Override // qj.i9
    public void clearBindings() {
        this.y.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.y.close();
    }
}
