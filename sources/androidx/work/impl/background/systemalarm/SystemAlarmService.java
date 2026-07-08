package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.gv;
import ap.r;
import bv.wz;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends r implements gv.zn {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1098s = f.a("SystemAlarmService");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f1099fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public gv f1100v;

    @Override // androidx.work.impl.background.systemalarm.gv.zn
    public void n3() {
        this.f1099fb = true;
        f.zn().y(f1098s, "All commands completed in dispatcher", new Throwable[0]);
        wz.y();
        stopSelf();
    }

    @Override // ap.r, android.app.Service
    public void onCreate() {
        super.onCreate();
        v();
        this.f1099fb = false;
    }

    @Override // ap.r, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f1099fb = true;
        this.f1100v.i9();
    }

    @Override // ap.r, android.app.Service
    public int onStartCommand(Intent intent, int i, int i5) {
        super.onStartCommand(intent, i, i5);
        if (this.f1099fb) {
            f.zn().gv(f1098s, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1100v.i9();
            v();
            this.f1099fb = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1100v.y(intent, i5);
        return 3;
    }

    public final void v() {
        gv gvVar = new gv(this);
        this.f1100v = gvVar;
        gvVar.tl(this);
    }
}
