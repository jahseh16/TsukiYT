package ft;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4720a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f4721fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final AudioManager f4722gv;
    public final Handler n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4723s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public zn f4724v;
    public final Context y;
    public final n3 zn;

    public interface n3 {
        void w(int i, boolean z);

        void y(int i);
    }

    public final class zn extends BroadcastReceiver {
        public zn() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = dp.this.n3;
            final dp dpVar = dp.this;
            handler.post(new Runnable() { // from class: ft.hr
                @Override // java.lang.Runnable
                public final void run() {
                    dpVar.c5();
                }
            });
        }
    }

    public dp(Context context, Handler handler, n3 n3Var) {
        Context applicationContext = context.getApplicationContext();
        this.y = applicationContext;
        this.n3 = handler;
        this.zn = n3Var;
        AudioManager audioManager = (AudioManager) v0.y.c5((AudioManager) applicationContext.getSystemService("audio"));
        this.f4722gv = audioManager;
        this.f4720a = 3;
        this.f4721fb = a(audioManager, 3);
        this.f4723s = v(audioManager, this.f4720a);
        zn znVar = new zn();
        try {
            applicationContext.registerReceiver(znVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f4724v = znVar;
        } catch (RuntimeException e4) {
            v0.r.i9("StreamVolumeManager", "Error registering stream volume receiver", e4);
        }
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e4) {
            v0.r.i9("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e4);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public static boolean v(AudioManager audioManager, int i) {
        return v0.ut.y >= 23 ? dp.p.y(audioManager, i) : a(audioManager, i) == 0;
    }

    public final void c5() {
        int iA = a(this.f4722gv, this.f4720a);
        boolean zV = v(this.f4722gv, this.f4720a);
        if (this.f4721fb == iA && this.f4723s == zV) {
            return;
        }
        this.f4721fb = iA;
        this.f4723s = zV;
        this.zn.w(iA, zV);
    }

    public void fb() {
        zn znVar = this.f4724v;
        if (znVar != null) {
            try {
                this.y.unregisterReceiver(znVar);
            } catch (RuntimeException e4) {
                v0.r.i9("StreamVolumeManager", "Error unregistering stream volume receiver", e4);
            }
            this.f4724v = null;
        }
    }

    public int gv() {
        if (v0.ut.y >= 28) {
            return dp.w.y(this.f4722gv, this.f4720a);
        }
        return 0;
    }

    public void s(int i) {
        if (this.f4720a == i) {
            return;
        }
        this.f4720a = i;
        c5();
        this.zn.y(i);
    }

    public int zn() {
        return this.f4722gv.getStreamMaxVolume(this.f4720a);
    }
}
