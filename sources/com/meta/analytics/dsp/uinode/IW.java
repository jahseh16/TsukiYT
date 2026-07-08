package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0648Ic A02;
    public final /* synthetic */ String A03;

    public IW(C0648Ic c0648Ic, String str, long j, long j4) {
        this.A02 = c0648Ic;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A02.A01.ADU(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
