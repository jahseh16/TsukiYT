package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1189bR extends KT {
    public final /* synthetic */ C1188bQ A00;
    public final /* synthetic */ B0 A01;

    public C1189bR(C1188bQ c1188bQ, B0 b02) {
        this.A00 = c1188bQ;
        this.A01 = b02;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0B != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0B);
            this.A00.A00.A0B.A0U();
        }
    }
}
