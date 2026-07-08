package i2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import yk.mt;

/* JADX INFO: loaded from: classes.dex */
public class y implements mt {
    public final Handler y = yt.i9.y(Looper.getMainLooper());

    @Override // yk.mt
    public void n3(long j, @NonNull Runnable runnable) {
        this.y.postDelayed(runnable, j);
    }

    @Override // yk.mt
    public void y(@NonNull Runnable runnable) {
        this.y.removeCallbacks(runnable);
    }
}
