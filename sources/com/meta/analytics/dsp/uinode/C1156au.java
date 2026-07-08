package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1156au implements InterfaceC02551q {
    public final /* synthetic */ C02471i A00;

    public C1156au(C02471i c02471i) {
        this.A00 = c02471i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02551q
    public final void ACZ(AdError adError) {
        this.A00.A04.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02551q
    public final void ACa() {
        this.A00.A04.AAf();
    }
}
