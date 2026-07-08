package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8N extends MX {
    public final /* synthetic */ LX A00;

    public C8N(LX lx) {
        this.A00 = lx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MY my) {
        if (this.A00.A01 == null || this.A00.A03 || my.A00().getAction() != 0) {
            return;
        }
        this.A00.A05.removeCallbacksAndMessages(null);
        if (this.A00.A0D(EnumC0855Qi.A05)) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        if (this.A00.A02) {
            this.A00.A05.postDelayed(new C0724Lh(this), this.A00.A00);
        }
    }
}
