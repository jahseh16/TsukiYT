package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0825Pe {
    public String A02;
    public String A03;
    public final C1N A04;
    public final C02391a A05;
    public final C1064Yn A06;
    public C1P A01 = C1P.A01(null);
    public int A00 = 1000;

    public C0825Pe(C1064Yn c1064Yn, C1N c1n, C02391a c02391a) {
        this.A06 = c1064Yn;
        this.A04 = c1n;
        this.A05 = c02391a;
    }

    public final C0825Pe A07(int i) {
        this.A00 = i;
        return this;
    }

    public final C0825Pe A08(C1P c1p) {
        this.A01 = c1p;
        return this;
    }

    public final C0825Pe A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C0825Pe A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C0827Pg A0B() {
        return new C0827Pg(this, null);
    }
}
