package wm;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class s extends zn<Boolean> {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final String f9041c5 = f.a("StorageNotLowTracker");

    public s(@NonNull Context context, @NonNull br.y yVar) {
        super(context, yVar);
    }

    @Override // wm.gv
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public Boolean n3() {
        Intent intentRegisterReceiver = this.n3.registerReceiver(null, fb());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // wm.zn
    public IntentFilter fb() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // wm.zn
    public void s(Context context, @NonNull Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        f.zn().y(f9041c5, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            gv(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            gv(Boolean.TRUE);
        }
    }
}
