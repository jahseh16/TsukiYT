package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C02511m extends C02662b {
    @Override // com.meta.analytics.dsp.uinode.C3S
    public final C03013k A08(View view, C03013k c03013k) {
        WindowInsets result = (WindowInsets) C03013k.A01(c03013k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C03013k.A00(result);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final C03013k A09(View view, C03013k c03013k) {
        WindowInsets result = (WindowInsets) C03013k.A01(c03013k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C03013k.A00(result);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0F(View view, final C3D c3d) {
        if (c3d == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C03013k compatInsets = c3d.AAk(view2, C03013k.A00(windowInsets));
                    return (WindowInsets) C03013k.A01(compatInsets);
                }
            });
        }
    }
}
