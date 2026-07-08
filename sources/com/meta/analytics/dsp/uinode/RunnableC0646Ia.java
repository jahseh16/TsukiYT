package com.meta.analytics.dsp.uinode;

import android.view.Surface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0646Ia implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C0648Ic A01;

    public RunnableC0646Ia(C0648Ic c0648Ic, Surface surface) {
        this.A01 = c0648Ic;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ACt(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
