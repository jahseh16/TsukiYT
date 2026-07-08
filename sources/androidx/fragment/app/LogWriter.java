package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class LogWriter extends Writer {
    private StringBuilder mBuilder = new StringBuilder(128);
    private final String mTag;

    public LogWriter(String str) {
        this.mTag = str;
    }

    private void flushBuilder() {
        if (this.mBuilder.length() > 0) {
            Log.d(this.mTag, this.mBuilder.toString());
            StringBuilder sb = this.mBuilder;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flushBuilder();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        flushBuilder();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i5) {
        for (int i8 = 0; i8 < i5; i8++) {
            char c = cArr[i + i8];
            if (c == '\n') {
                flushBuilder();
            } else {
                this.mBuilder.append(c);
            }
        }
    }
}
