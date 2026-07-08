package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1245cY {
    public InterfaceC1246cZ A00;

    public final void A00() {
        InterfaceC1246cZ interfaceC1246cZ = this.A00;
        if (interfaceC1246cZ != null) {
            interfaceC1246cZ.onStart();
        }
    }

    public final void A01() {
        InterfaceC1246cZ interfaceC1246cZ = this.A00;
        if (interfaceC1246cZ != null) {
            interfaceC1246cZ.onStop();
        }
    }

    public final void A02(InterfaceC1246cZ interfaceC1246cZ) {
        this.A00 = interfaceC1246cZ;
    }
}
