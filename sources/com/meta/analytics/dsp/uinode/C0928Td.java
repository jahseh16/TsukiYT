package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0928Td implements L8 {
    public final /* synthetic */ BI A00;

    public C0928Td(BI bi) {
        this.A00 = bi;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        this.A00.A07 = false;
        if (this.A00.A04 != null) {
            this.A00.A04.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f3) {
        if (this.A00.A04 != null) {
            this.A00.A04.setProgressImmediate(100.0f * (1.0f - (f3 / this.A00.getAdInfo().A0G().A00())));
        }
    }
}
