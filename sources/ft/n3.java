package ft;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final y n3;
    public final Context y;
    public boolean zn;

    /* JADX INFO: renamed from: ft.n3$n3, reason: collision with other inner class name */
    public interface InterfaceC0092n3 {
        void zn();
    }

    public final class y extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Handler f4942v;
        public final InterfaceC0092n3 y;

        public y(Handler handler, InterfaceC0092n3 interfaceC0092n3) {
            this.f4942v = handler;
            this.y = interfaceC0092n3;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f4942v.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n3.this.zn) {
                this.y.zn();
            }
        }
    }

    public n3(Context context, Handler handler, InterfaceC0092n3 interfaceC0092n3) {
        this.y = context.getApplicationContext();
        this.n3 = new y(handler, interfaceC0092n3);
    }

    public void n3(boolean z) {
        if (z && !this.zn) {
            this.y.registerReceiver(this.n3, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.zn = true;
        } else {
            if (z || !this.zn) {
                return;
            }
            this.y.unregisterReceiver(this.n3);
            this.zn = false;
        }
    }
}
