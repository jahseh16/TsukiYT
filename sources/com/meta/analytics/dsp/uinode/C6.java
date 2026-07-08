package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C6 {
    public final C4 A00;

    public abstract void A0B(C0645Hz c0645Hz, long j) throws C04539v;

    public abstract boolean A0C(C0645Hz c0645Hz) throws C04539v;

    public C6(C4 c4) {
        this.A00 = c4;
    }

    public final void A00(C0645Hz c0645Hz, long j) throws C04539v {
        if (A0C(c0645Hz)) {
            A0B(c0645Hz, j);
        }
    }
}
