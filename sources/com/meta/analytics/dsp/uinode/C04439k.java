package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04439k {
    public int A00;
    public int A01;
    public C04549w A02;
    public boolean A03;

    public C04439k() {
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        if (this.A03 && this.A00 != 4) {
            AbstractC0620Ha.A03(i == 4);
        } else {
            this.A03 = true;
            this.A00 = i;
        }
    }

    public final void A05(C04549w c04549w) {
        this.A02 = c04549w;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C04549w c04549w) {
        return c04549w != this.A02 || this.A01 > 0 || this.A03;
    }
}
