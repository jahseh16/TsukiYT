package v0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface v {
    public static final v y = new k5();

    long elapsedRealtime();

    p n3(Looper looper, @Nullable Handler.Callback callback);

    long y();

    void zn();
}
