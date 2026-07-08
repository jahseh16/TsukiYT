package a4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import v3.zn;
import x3.gv;

/* JADX INFO: loaded from: classes.dex */
public final class en extends gv {

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public static en f30i9;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final Set f31c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Handler f32fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ud f33s;

    public en(Context context, ud udVar) {
        super(new zn("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f32fb = new Handler(Looper.getMainLooper());
        this.f31c5 = new LinkedHashSet();
        this.f33s = udVar;
    }

    public static synchronized en s(Context context) {
        try {
            if (f30i9 == null) {
                f30i9 = new en(context, j5.INSTANCE);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f30i9;
    }

    public final synchronized void i9(a aVar) {
        try {
            Iterator it = new LinkedHashSet(this.f31c5).iterator();
            while (it.hasNext()) {
                ((fb) it.next()).y(aVar);
            }
            super.v(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // x3.gv
    public final void y(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        a aVarWz = a.wz(bundleExtra);
        this.y.y("ListenerRegistryBroadcastReceiver.onReceive: %s", aVarWz);
        a8 a8VarZza = this.f33s.zza();
        if (aVarWz.c5() != 3 || a8VarZza == null) {
            i9(aVarWz);
        } else {
            a8VarZza.y(aVarWz.tl(), new k(this, aVarWz, intent, context));
        }
    }
}
