package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0979Vd implements InterfaceC0623Hd {
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0623Hd
    public final C0978Vc A4c(Looper looper, Handler.Callback callback) {
        return new C0978Vc(new Handler(looper, callback));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0623Hd
    public final long A5T() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0623Hd
    public final long AGs() {
        return SystemClock.uptimeMillis();
    }
}
