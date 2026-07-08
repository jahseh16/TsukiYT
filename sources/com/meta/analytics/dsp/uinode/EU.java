package com.meta.analytics.dsp.uinode;

import com.facebook.ads.VideoStartReason;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EU extends AbstractC0841Pu {
    public final /* synthetic */ C03485h A00;

    public EU(C03485h c03485h) {
        this.A00 = c03485h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        this.A00.A00.onCompleted();
        if (C0653Ih.A1H(this.A00.A00.getContext())) {
            this.A00.A00.play(VideoStartReason.AUTO_STARTED);
        }
    }
}
