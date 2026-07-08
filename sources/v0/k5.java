package v0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class k5 implements v {
    @Override // v0.v
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // v0.v
    public p n3(Looper looper, @Nullable Handler.Callback callback) {
        return new yt(new Handler(looper, callback));
    }

    @Override // v0.v
    public long y() {
        return SystemClock.uptimeMillis();
    }

    @Override // v0.v
    public void zn() {
    }
}
