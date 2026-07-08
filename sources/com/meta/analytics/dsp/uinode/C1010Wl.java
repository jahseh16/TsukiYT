package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1010Wl implements C1 {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C1010Wl(int i, int i5, int i8, int i10, int i11, int i12) {
        this.A06 = i;
        this.A07 = i5;
        this.A02 = i8;
        this.A04 = i10;
        this.A03 = i11;
        this.A05 = i12;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j) {
        long positionOffset = Math.max(0L, j - this.A01);
        long j4 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j4 / positionOffset2;
    }

    public final void A06(long j, long j4) {
        this.A01 = j;
        this.A00 = j4;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        long j = 1000000 * (this.A00 / ((long) this.A04));
        long numFrames = this.A07;
        return j / numFrames;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j) {
        long j4 = (((long) this.A02) * j) / 1000000;
        int i = this.A04;
        long positionOffset = i;
        long j7 = j4 / positionOffset;
        long positionOffset2 = i;
        long jA0E = IF.A0E(j7 * positionOffset2, 0L, this.A00 - ((long) i));
        long j8 = this.A01 + jA0E;
        long jA05 = A05(j8);
        C2 seekPoint = new C2(jA05, j8);
        if (jA05 < j) {
            long j9 = this.A00;
            int i5 = this.A04;
            if (jA0E != j9 - ((long) i5)) {
                long seekTimeUs = ((long) i5) + j8;
                long seekPosition = A05(seekTimeUs);
                return new C0(seekPoint, new C2(seekPosition, seekTimeUs));
            }
        }
        return new C0(seekPoint);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
