package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0976Va implements InterfaceC1250cd<C0658Io, C0663It> {
    public VX A00;

    public C0976Va(VX vx) {
        this.A00 = vx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1250cd
    public final void A5c(C1247ca<C0658Io, C0663It> c1247ca, InterfaceC1237cP interfaceC1237cP) {
        switch (Im.A00[interfaceC1237cP.A8J(c1247ca).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1247ca, interfaceC1237cP);
                break;
        }
    }
}
