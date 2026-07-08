package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0935Tk extends KT {
    public final /* synthetic */ AbstractC0790Nv A00;

    public C0935Tk(AbstractC0790Nv abstractC0790Nv) {
        this.A00 = abstractC0790Nv;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (this.A00.isPressed()) {
            this.A00.postDelayed(this, r2.A07);
        } else {
            this.A00.setPressed(true);
            AbstractC0790Nv abstractC0790Nv = this.A00;
            abstractC0790Nv.postOnAnimationDelayed(abstractC0790Nv.A09, 250L);
        }
    }
}
