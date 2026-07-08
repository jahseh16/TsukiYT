package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1169b7 implements InterfaceC0776Nh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1168b6 A01;
    public final /* synthetic */ V2 A02;

    public C1169b7(AbstractC1168b6 abstractC1168b6, int i, V2 v22) {
        this.A01 = abstractC1168b6;
        this.A00 = i;
        this.A02 = v22;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0776Nh
    public final void ABh(boolean z) {
        if (this.A00 == 0) {
            this.A02.A1Z(this.A01.A04);
        }
        this.A02.A1c(z, true);
    }
}
