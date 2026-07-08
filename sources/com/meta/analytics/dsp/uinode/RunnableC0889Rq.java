package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0889Rq implements Runnable {
    public final /* synthetic */ C0631Hl A00;

    public RunnableC0889Rq(C0631Hl c0631Hl) {
        this.A00 = c0631Hl;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            C0631Hl.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
