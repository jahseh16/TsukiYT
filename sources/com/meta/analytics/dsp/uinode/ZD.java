package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZD extends KG {
    public final /* synthetic */ ZA A00;
    public final /* synthetic */ C0670Jb A01;

    public ZD(ZA za, C0670Jb c0670Jb) {
        this.A00 = za;
        this.A01 = c0670Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(L1.A00(this.A01));
        }
    }
}
