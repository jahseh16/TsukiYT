package qb;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class zn extends fb {
    int mode;

    public zn(int i) {
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
