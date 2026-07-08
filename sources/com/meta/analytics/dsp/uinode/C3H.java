package com.meta.analytics.dsp.uinode;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3H extends C03766k {
    @Override // com.meta.analytics.dsp.uinode.C03053o
    public Object A00(int i, int i5, int i8, int i10, boolean z, boolean z5) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i5, i8, i10, z);
    }

    @Override // com.meta.analytics.dsp.uinode.C03053o
    public Object A01(int i, int i5, boolean z, int i8) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i5, z);
    }

    @Override // com.meta.analytics.dsp.uinode.C03053o
    public final void A03(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj);
    }

    @Override // com.meta.analytics.dsp.uinode.C03053o
    public final void A04(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj);
    }
}
