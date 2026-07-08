package r0;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class wz extends IOException {
    public final int reason;

    public wz(int i) {
        this.reason = i;
    }

    public static boolean y(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof wz) && ((wz) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public wz(@Nullable Throwable th, int i) {
        super(th);
        this.reason = i;
    }

    public wz(@Nullable String str, int i) {
        super(str);
        this.reason = i;
    }

    public wz(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }
}
