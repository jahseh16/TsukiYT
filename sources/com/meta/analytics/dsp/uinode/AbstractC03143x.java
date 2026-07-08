package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03143x {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3v] */
    public static C03123v A00(final InterfaceC03133w interfaceC03133w) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) interfaceC03133w.A4W(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return interfaceC03133w.A5h(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i5, Bundle bundle) {
                return interfaceC03133w.ADx(i, i5, bundle);
            }
        };
    }
}
