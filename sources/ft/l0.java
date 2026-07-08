package ft;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f4937gv;

    @Nullable
    public WifiManager.WifiLock n3;

    @Nullable
    public final WifiManager y;
    public boolean zn;

    public l0(Context context) {
        this.y = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void n3(boolean z) {
        this.f4937gv = z;
        zn();
    }

    public void y(boolean z) {
        if (z && this.n3 == null) {
            WifiManager wifiManager = this.y;
            if (wifiManager == null) {
                v0.r.c5("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.n3 = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.zn = z;
        zn();
    }

    public final void zn() {
        WifiManager.WifiLock wifiLock = this.n3;
        if (wifiLock == null) {
            return;
        }
        if (this.zn && this.f4937gv) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
