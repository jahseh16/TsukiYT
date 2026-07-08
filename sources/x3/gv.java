package x3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import v3.rs;
import v3.xg;
import v3.zn;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv {
    public final IntentFilter n3;
    public final zn y;
    public final Context zn;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Set f9071gv = new HashSet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public zn f9072v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f9070a = false;

    public gv(zn znVar, IntentFilter intentFilter, Context context) {
        this.y = znVar;
        this.n3 = intentFilter;
        this.zn = xg.y(context);
    }

    public final synchronized boolean a() {
        return this.f9072v != null;
    }

    public final synchronized void gv(boolean z) {
        this.f9070a = z;
        n3();
    }

    public final void n3() {
        BroadcastReceiver broadcastReceiver;
        if ((this.f9070a || !this.f9071gv.isEmpty()) && this.f9072v == null) {
            BroadcastReceiver znVar = new zn(this, (n3) null);
            this.f9072v = znVar;
            this.zn.registerReceiver(znVar, this.n3);
        }
        if (this.f9070a || !this.f9071gv.isEmpty() || (broadcastReceiver = this.f9072v) == null) {
            return;
        }
        this.zn.unregisterReceiver(broadcastReceiver);
        this.f9072v = null;
    }

    public final synchronized void v(Object obj) {
        Iterator it = new HashSet(this.f9071gv).iterator();
        while (it.hasNext()) {
            ((y) it.next()).y(obj);
        }
    }

    public abstract void y(Context context, Intent intent);

    public final synchronized void zn(y yVar) {
        this.y.gv("registerListener", new Object[0]);
        rs.y(yVar, "Registered Play Core listener should not be null.");
        this.f9071gv.add(yVar);
        n3();
    }
}
