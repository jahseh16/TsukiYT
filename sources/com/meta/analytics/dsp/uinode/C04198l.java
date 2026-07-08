package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04198l {
    public static C04198l A00 = new C04198l();

    public static C04198l A00() {
        return A00;
    }

    public final YI A01(C03927f c03927f, boolean z) {
        return new YI(c03927f, z, new C6S());
    }

    public final Map<String, String> A02(C03927f c03927f) {
        try {
            return A01(c03927f, false).A05();
        } catch (Throwable th) {
            c03927f.A07().A3c(th);
            return C04118d.A01(c03927f);
        }
    }
}
