package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Gz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ W1 A03;

    public Gz(W1 w12, int i, long j, long j4) {
        this.A03 = w12;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A03.A07.AAw(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
