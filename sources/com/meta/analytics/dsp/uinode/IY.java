package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0648Ic A02;

    public IY(C0648Ic c0648Ic, int i, long j) {
        this.A02 = c0648Ic;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A02.A01.ABN(this.A00, this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
