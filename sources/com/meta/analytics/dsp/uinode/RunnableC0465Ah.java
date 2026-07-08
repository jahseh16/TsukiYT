package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0465Ah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0466Ai A01;

    public RunnableC0465Ah(C0466Ai c0466Ai, int i) {
        this.A01 = c0466Ai;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.AAs(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
