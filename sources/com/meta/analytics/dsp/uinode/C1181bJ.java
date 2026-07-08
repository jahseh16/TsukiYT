package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1181bJ implements C6U {
    public final /* synthetic */ FY A00;

    public C1181bJ(FY fy) {
        this.A00 = fy;
    }

    private void A00(boolean z) {
        if (!z) {
            this.A00.A01.AD1(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.ACy(this.A00);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        A00(false);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A00(true);
    }
}
