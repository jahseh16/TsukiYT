package com.meta.analytics.dsp.uinode;

import android.R;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UO extends KT {
    public final /* synthetic */ MO A00;

    public UO(MO mo2) {
        this.A00 = mo2;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A0J().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
