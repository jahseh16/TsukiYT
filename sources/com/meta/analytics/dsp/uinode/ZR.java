package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZR extends KG {
    public final /* synthetic */ ZQ A00;

    public ZR(ZQ zq) {
        this.A00 = zq;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
