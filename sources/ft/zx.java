package ft;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class zx {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f5185gv;

    @Nullable
    public PowerManager.WakeLock n3;

    @Nullable
    public final PowerManager y;
    public boolean zn;

    public zx(Context context) {
        this.y = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void n3(boolean z) {
        this.f5185gv = z;
        zn();
    }

    public void y(boolean z) {
        if (z && this.n3 == null) {
            PowerManager powerManager = this.y;
            if (powerManager == null) {
                v0.r.c5("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.n3 = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.zn = z;
        zn();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void zn() {
        PowerManager.WakeLock wakeLock = this.n3;
        if (wakeLock == null) {
            return;
        }
        if (this.zn && this.f5185gv) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
