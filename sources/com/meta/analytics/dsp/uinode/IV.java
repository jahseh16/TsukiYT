package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IV implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0648Ic A01;

    public IV(C0648Ic c0648Ic, BC bc) {
        this.A01 = c0648Ic;
        this.A00 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ADW(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
