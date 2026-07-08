package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZU extends KG {
    public final /* synthetic */ ZQ A00;
    public final /* synthetic */ C0670Jb A01;

    public ZU(ZQ zq, C0670Jb c0670Jb) {
        this.A00 = zq;
        this.A01 = c0670Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onError(this.A00.A01.A07(), L1.A00(this.A01));
        }
    }
}
