package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VU extends KT {
    public final /* synthetic */ VT A00;

    public VU(VT vt) {
        this.A00 = vt;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
