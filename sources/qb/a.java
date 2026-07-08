package qb;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class a extends fb {
    int fileCount;
    int mode;
    Throwable originException;

    public a(int i, Throwable th, int i5) {
        this.fileCount = i;
        this.originException = th;
        this.mode = i5;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        String str = "fileCount = " + this.fileCount + ", originException = " + this.originException.getClass().getName() + ", msg: " + this.originException.getMessage() + ", mode = " + this.mode;
        if (this.firstMessage == null) {
            return str;
        }
        return str + ", firstMessage = " + this.firstMessage;
    }
}
