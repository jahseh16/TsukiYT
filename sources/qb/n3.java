package qb;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends fb {
    int mode;

    public n3(int i) {
        this.mode = i;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        String str = "mode = " + this.mode;
        if (this.firstMessage == null) {
            return str;
        }
        return str + ", firstMessage = " + this.firstMessage;
    }
}
