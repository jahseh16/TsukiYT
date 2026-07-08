package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IZ implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C0648Ic A04;

    public IZ(C0648Ic c0648Ic, int i, int i5, int i8, float f3) {
        this.A04 = c0648Ic;
        this.A03 = i;
        this.A01 = i5;
        this.A02 = i8;
        this.A00 = f3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A04.A01.ADf(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
