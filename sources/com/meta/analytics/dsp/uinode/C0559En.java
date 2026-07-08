package com.meta.analytics.dsp.uinode;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.En, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0559En extends C1098Zw {
    @Override // com.meta.analytics.dsp.uinode.C03023l
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.meta.analytics.dsp.uinode.C03023l
    public final void A01(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
