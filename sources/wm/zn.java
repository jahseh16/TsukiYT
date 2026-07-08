package wm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn<T> extends gv<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f9043s = f.a("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final BroadcastReceiver f9044fb;

    public class y extends BroadcastReceiver {
        public y() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                zn.this.s(context, intent);
            }
        }
    }

    public zn(@NonNull Context context, @NonNull br.y yVar) {
        super(context, yVar);
        this.f9044fb = new y();
    }

    @Override // wm.gv
    public void a() {
        f.zn().y(f9043s, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.n3.unregisterReceiver(this.f9044fb);
    }

    public abstract IntentFilter fb();

    public abstract void s(Context context, @NonNull Intent intent);

    @Override // wm.gv
    public void v() {
        f.zn().y(f9043s, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.n3.registerReceiver(this.f9044fb, fb());
    }
}
