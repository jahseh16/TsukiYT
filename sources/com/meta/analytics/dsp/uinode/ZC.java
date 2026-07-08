package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZC extends KG {
    public final /* synthetic */ ZB A00;

    public ZC(ZB zb) {
        this.A00 = zb;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
