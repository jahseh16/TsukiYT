package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PZ implements Runnable {
    public final /* synthetic */ C0922Sx A00;

    public PZ(C0922Sx c0922Sx) {
        this.A00 = c0922Sx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                return;
            }
            this.A00.A0Q();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
