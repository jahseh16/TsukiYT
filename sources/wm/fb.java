package wm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class fb extends gv<ne.n3> {

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final String f9032i9 = f.a("NetworkStateTracker");

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public y f9033c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final ConnectivityManager f9034fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n3 f9035s;

    public class n3 extends ConnectivityManager.NetworkCallback {
        public n3() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            f.zn().y(fb.f9032i9, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            fb fbVar = fb.this;
            fbVar.gv(fbVar.fb());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            f.zn().y(fb.f9032i9, "Network connection lost", new Throwable[0]);
            fb fbVar = fb.this;
            fbVar.gv(fbVar.fb());
        }
    }

    public class y extends BroadcastReceiver {
        public y() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            f.zn().y(fb.f9032i9, "Network broadcast received", new Throwable[0]);
            fb fbVar = fb.this;
            fbVar.gv(fbVar.fb());
        }
    }

    public fb(@NonNull Context context, @NonNull br.y yVar) {
        super(context, yVar);
        this.f9034fb = (ConnectivityManager) this.n3.getSystemService("connectivity");
        if (i9()) {
            this.f9035s = new n3();
        } else {
            this.f9033c5 = new y();
        }
    }

    public static boolean i9() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // wm.gv
    public void a() {
        if (!i9()) {
            f.zn().y(f9032i9, "Unregistering broadcast receiver", new Throwable[0]);
            this.n3.unregisterReceiver(this.f9033c5);
            return;
        }
        try {
            f.zn().y(f9032i9, "Unregistering network callback", new Throwable[0]);
            this.f9034fb.unregisterNetworkCallback(this.f9035s);
        } catch (IllegalArgumentException | SecurityException e4) {
            f.zn().n3(f9032i9, "Received exception while unregistering network callback", e4);
        }
    }

    public boolean c5() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f9034fb.getNetworkCapabilities(this.f9034fb.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e4) {
            f.zn().n3(f9032i9, "Unable to validate active network", e4);
            return false;
        }
    }

    public ne.n3 fb() {
        NetworkInfo activeNetworkInfo = this.f9034fb.getActiveNetworkInfo();
        boolean z = false;
        boolean z5 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zC5 = c5();
        boolean zY = k5.y.y(this.f9034fb);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new ne.n3(z5, zC5, zY, z);
    }

    @Override // wm.gv
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ne.n3 n3() {
        return fb();
    }

    @Override // wm.gv
    public void v() {
        if (!i9()) {
            f.zn().y(f9032i9, "Registering broadcast receiver", new Throwable[0]);
            this.n3.registerReceiver(this.f9033c5, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            f.zn().y(f9032i9, "Registering network callback", new Throwable[0]);
            this.f9034fb.registerDefaultNetworkCallback(this.f9035s);
        } catch (IllegalArgumentException | SecurityException e4) {
            f.zn().n3(f9032i9, "Received exception while registering network callback", e4);
        }
    }
}
