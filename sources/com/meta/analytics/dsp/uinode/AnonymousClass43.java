package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.43, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass43 {
    public static final AnonymousClass42 A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C1093Zr();
        } else {
            A00 = new AnonymousClass42();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f3, float f4) {
        A00.A00(edgeEffect, f3, f4);
    }
}
