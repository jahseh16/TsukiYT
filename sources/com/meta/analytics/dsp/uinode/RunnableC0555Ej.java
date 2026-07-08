package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0555Ej implements Runnable {
    public final /* synthetic */ CD A00;

    public RunnableC0555Ej(CD cd) {
        this.A00 = cd;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0G) {
                this.A00.A08.ABC(this.A00);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
