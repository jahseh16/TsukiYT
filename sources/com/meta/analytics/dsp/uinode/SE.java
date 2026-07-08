package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SE extends KT {
    public final /* synthetic */ SA A00;

    public SE(SA sa) {
        this.A00 = sa;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!this.A00.A03) {
            C04258r c04258r = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c04258r.A02(new AbstractC0842Pv(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.93
            });
            this.A00.A07.postDelayed(this, this.A00.A00);
        }
    }
}
