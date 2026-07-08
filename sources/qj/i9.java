package qj;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface i9 extends Closeable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d4);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, String str);

    void clearBindings();
}
