package ap;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class r extends Service implements mt {
    public final androidx.lifecycle.c y = new androidx.lifecycle.c(this);

    @Override // ap.mt
    public androidx.lifecycle.s getLifecycle() {
        return this.y.y();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.y.n3();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.y.zn();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.y.gv();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.y.v();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i5) {
        return super.onStartCommand(intent, i, i5);
    }
}
