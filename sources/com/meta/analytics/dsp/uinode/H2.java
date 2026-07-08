package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class H2 implements InterfaceC1246cZ {
    public final C1239cR A00;

    public H2(C1239cR c1239cR) {
        this.A00 = c1239cR;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1246cZ
    public final void onStart() {
        this.A00.A08();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1246cZ
    public final void onStop() {
        this.A00.A07();
    }
}
