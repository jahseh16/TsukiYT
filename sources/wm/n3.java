package wm;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends zn<Boolean> {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final String f9040c5 = f.a("BatteryNotLowTracker");

    public n3(@NonNull Context context, @NonNull br.y yVar) {
        super(context, yVar);
    }

    @Override // wm.gv
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public Boolean n3() {
        Intent intentRegisterReceiver = this.n3.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        f.zn().n3(f9040c5, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // wm.zn
    public IntentFilter fb() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // wm.zn
    public void s(Context context, @NonNull Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        f.zn().y(f9040c5, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            gv(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            gv(Boolean.FALSE);
        }
    }
}
