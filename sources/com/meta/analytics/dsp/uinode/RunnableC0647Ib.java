package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0647Ib implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0648Ic A01;

    public RunnableC0647Ib(C0648Ic c0648Ic, BC bc) {
        this.A01 = c0648Ic;
        this.A00 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            this.A01.A01.ADV(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
