package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0632Hm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public C0632Hm(byte[] bArr, int i) {
        C0644Hy c0644Hy = new C0644Hy(bArr);
        c0644Hy.A07(i * 8);
        this.A04 = c0644Hy.A04(16);
        this.A02 = c0644Hy.A04(16);
        this.A05 = c0644Hy.A04(24);
        this.A03 = c0644Hy.A04(24);
        this.A06 = c0644Hy.A04(20);
        this.A01 = c0644Hy.A04(3) + 1;
        this.A00 = c0644Hy.A04(5) + 1;
        this.A07 = ((((long) c0644Hy.A04(4)) & 15) << 32) | (((long) c0644Hy.A04(32)) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / ((long) this.A06);
    }
}
