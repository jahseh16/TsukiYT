package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0945Tu extends KT {
    public final WeakReference<RE> A00;

    public C0945Tu(RE re) {
        this.A00 = new WeakReference<>(re);
    }

    public C0945Tu(WeakReference<RE> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        RE viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
