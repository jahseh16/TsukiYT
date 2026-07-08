package com.meta.analytics.dsp.uinode;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C02652a extends C3H {
    @Override // com.meta.analytics.dsp.uinode.C3H, com.meta.analytics.dsp.uinode.C03053o
    public final Object A00(int i, int i5, int i8, int i10, boolean z, boolean z5) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i5, i8, i10, z, z5);
    }

    @Override // com.meta.analytics.dsp.uinode.C3H, com.meta.analytics.dsp.uinode.C03053o
    public final Object A01(int i, int i5, boolean z, int i8) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i5, z, i8);
    }
}
