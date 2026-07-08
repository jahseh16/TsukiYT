package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1152aq implements C6U {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC1152aq(boolean z) {
        this.A00 = z;
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A01(true);
    }
}
