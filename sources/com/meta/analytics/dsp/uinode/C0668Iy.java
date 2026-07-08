package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0668Iy {
    public double A00;
    public J4 A01;
    public J5 A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final C0668Iy A00(double d4) {
        this.A00 = d4;
        return this;
    }

    public final C0668Iy A01(J4 j4) {
        this.A01 = j4;
        return this;
    }

    public final C0668Iy A02(J5 j52) {
        this.A02 = j52;
        return this;
    }

    public final C0668Iy A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C0668Iy A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C0668Iy A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C0668Iy A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C0669Iz A07(C03927f c03927f) {
        return new C0669Iz(c03927f, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
