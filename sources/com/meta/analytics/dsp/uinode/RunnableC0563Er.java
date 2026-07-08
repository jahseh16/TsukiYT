package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0563Er implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F4 A01;

    public RunnableC0563Er(F1 f1, F4 f4) {
        this.A00 = f1;
        this.A01 = f4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.ACG(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
