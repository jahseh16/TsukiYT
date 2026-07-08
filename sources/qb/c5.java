package qb;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class c5 extends fb {
    int mode;
    int speedUpResult;

    public c5(int i, int i5) {
        this.mode = i;
        this.speedUpResult = i5;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        String str = "mode = " + this.mode + ", speedUpResult = " + this.speedUpResult;
        if (this.firstMessage == null) {
            return str;
        }
        return str + ", firstMessage = " + this.firstMessage;
    }
}
