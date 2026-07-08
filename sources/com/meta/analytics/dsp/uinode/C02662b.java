package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C02662b extends C3I {
    @Override // com.meta.analytics.dsp.uinode.F5, com.meta.analytics.dsp.uinode.C3S
    public final void A0C(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final boolean A0J(View view) {
        return view.isAttachedToWindow();
    }
}
