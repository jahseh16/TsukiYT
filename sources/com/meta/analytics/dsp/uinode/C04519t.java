package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04519t {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C0560Eo A04;
    public final boolean A05;
    public final boolean A06;

    public C04519t(C0560Eo c0560Eo, long j, long j4, long j7, long j8, boolean z, boolean z5) {
        this.A04 = c0560Eo;
        this.A03 = j;
        this.A02 = j4;
        this.A00 = j7;
        this.A01 = j8;
        this.A06 = z;
        this.A05 = z5;
    }

    public final C04519t A00(int i) {
        return new C04519t(this.A04.A00(i), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C04519t A01(long j) {
        return new C04519t(this.A04, j, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
