package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AG {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Object A07;
    public boolean A08;
    public boolean A09;

    public final long A00() {
        return C9W.A01(this.A02);
    }

    public final long A01() {
        return this.A02;
    }

    public final long A02() {
        return C9W.A01(this.A03);
    }

    public final long A03() {
        return this.A04;
    }

    public final AG A04(Object obj, long j, long j4, boolean z, boolean z5, long j7, long j8, int i, int i5, long j9) {
        this.A07 = obj;
        this.A05 = j;
        this.A06 = j4;
        this.A09 = z;
        this.A08 = z5;
        this.A02 = j7;
        this.A03 = j8;
        this.A00 = i;
        this.A01 = i5;
        this.A04 = j9;
        return this;
    }
}
