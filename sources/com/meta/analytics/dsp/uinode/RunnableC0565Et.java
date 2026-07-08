package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0565Et implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F2 A01;
    public final /* synthetic */ F3 A02;
    public final /* synthetic */ F4 A03;

    public RunnableC0565Et(F1 f1, F4 f4, F2 f22, F3 f3) {
        this.A00 = f1;
        this.A03 = f4;
        this.A01 = f22;
        this.A02 = f3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A03.AC5(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
