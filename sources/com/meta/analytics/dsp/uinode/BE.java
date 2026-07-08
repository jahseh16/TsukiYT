package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BE extends Thread {
    public final /* synthetic */ AbstractC1040Xp A00;

    public BE(AbstractC1040Xp abstractC1040Xp) {
        this.A00 = abstractC1040Xp;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
