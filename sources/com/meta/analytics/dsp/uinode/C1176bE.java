package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1176bE implements InterfaceC02551q {
    public final /* synthetic */ FY A00;

    public C1176bE(FY fy) {
        this.A00 = fy;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02551q
    public final void ACZ(AdError adError) {
        this.A00.A01.AD1(this.A00, adError);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02551q
    public final void ACa() {
        this.A00.A0C.set(true);
        this.A00.A01.ACy(this.A00);
    }
}
