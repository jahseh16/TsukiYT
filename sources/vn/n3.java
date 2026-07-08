package vn;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemalarm.y;
import i2.v;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class n3 implements v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f8856v = f.a("SystemAlarmScheduler");
    public final Context y;

    public n3(@NonNull Context context) {
        this.y = context.getApplicationContext();
    }

    @Override // i2.v
    public boolean gv() {
        return true;
    }

    public final void n3(@NonNull androidx.work.impl.model.n3 n3Var) {
        f.zn().y(f8856v, String.format("Scheduling work with workSpecId %s", n3Var.id), new Throwable[0]);
        this.y.startService(y.a(this.y, n3Var.id));
    }

    @Override // i2.v
    public void y(@NonNull String str) {
        this.y.startService(y.fb(this.y, str));
    }

    @Override // i2.v
    public void zn(@NonNull androidx.work.impl.model.n3... n3VarArr) {
        for (androidx.work.impl.model.n3 n3Var : n3VarArr) {
            n3(n3Var);
        }
    }
}
