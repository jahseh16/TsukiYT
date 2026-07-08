package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0920Sv implements L8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KT A01;
    public final /* synthetic */ AbstractC0917Ss A02;

    public C0920Sv(AbstractC0917Ss abstractC0917Ss, int i, KT kt) {
        this.A02 = abstractC0917Ss;
        this.A00 = i;
        this.A01 = kt;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() throws Throwable {
        this.A01.run();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f3) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f3 / this.A00)));
    }
}
