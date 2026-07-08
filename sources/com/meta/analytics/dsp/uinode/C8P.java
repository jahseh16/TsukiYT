package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8P extends O7 {
    public final /* synthetic */ LX A00;

    public C8P(LX lx) {
        this.A00 = lx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o8) {
        if (!this.A00.A03 || !this.A00.A02) {
            return;
        }
        this.A00.A03 = false;
        if (!this.A00.A0D(EnumC0855Qi.A04) && !this.A00.A04) {
            if (!this.A00.A0D(EnumC0855Qi.A03)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A04 = false;
        this.A00.A05.postDelayed(new C0729Lm(this), this.A00.A00);
    }
}
