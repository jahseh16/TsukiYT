package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RH extends AbstractC04268s<O8> {
    public final /* synthetic */ C9I A00;

    public RH(C9I c9i) {
        this.A00 = c9i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o8) {
        if (!this.A00.A01) {
            this.A00.A01 = true;
        } else {
            this.A00.A0Y();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    public final Class<O8> A01() {
        return O8.class;
    }
}
