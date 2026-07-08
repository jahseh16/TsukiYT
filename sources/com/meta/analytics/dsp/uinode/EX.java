package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EX extends O7 {
    public final /* synthetic */ C03485h A00;

    public EX(C03485h c03485h) {
        this.A00 = c03485h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o8) {
        if (this.A00.A08 != null) {
            V2.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
