package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0463Af implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0466Ai A03;

    public RunnableC0463Af(C0466Ai c0466Ai, int i, long j, long j4) {
        this.A03 = c0466Ai;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A03.A01.AAt(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
