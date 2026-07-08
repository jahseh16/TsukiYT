package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0464Ag implements Runnable {
    public final /* synthetic */ C0466Ai A00;
    public final /* synthetic */ BC A01;

    public RunnableC0464Ag(C0466Ai c0466Ai, BC bc) {
        this.A00 = c0466Ai;
        this.A01 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            this.A00.A01.AAp(this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
