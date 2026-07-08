package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1149an extends KT {
    public final /* synthetic */ AbstractC1148am A00;
    public final /* synthetic */ C0670Jb A01;

    public C1149an(AbstractC1148am abstractC1148am, C0670Jb c0670Jb) {
        this.A00 = abstractC1148am;
        this.A01 = c0670Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A0B.A0E().A4t(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
