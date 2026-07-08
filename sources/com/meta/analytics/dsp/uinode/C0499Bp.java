package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0499Bp extends W7 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final InterfaceC0610Gp A0A;
    public final InterfaceC0623Hd A0B;

    public C0499Bp(TrackGroup trackGroup, int[] iArr, InterfaceC0610Gp interfaceC0610Gp, long j, long j4, long j7, float f3, float f4, long j8, InterfaceC0623Hd interfaceC0623Hd) {
        super(trackGroup, iArr);
        this.A0A = interfaceC0610Gp;
        this.A07 = j * 1000;
        this.A06 = j4 * 1000;
        this.A08 = 1000 * j7;
        this.A04 = f3;
        this.A05 = f4;
        this.A09 = j8;
        this.A0B = interfaceC0623Hd;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j) {
        long jA67 = (long) (this.A0A.A67() * this.A04);
        int i = 0;
        for (int i5 = 0; i5 < super.A03; i5++) {
            if (j == Long.MIN_VALUE || !A00(i5, j)) {
                if (Math.round(A76(i5).A04 * this.A00) <= jA67) {
                    return i5;
                }
                i = i5;
            }
        }
        return i;
    }

    @Override // com.meta.analytics.dsp.uinode.W7, com.meta.analytics.dsp.uinode.InterfaceC0601Gg
    public final void A5U() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0601Gg
    public final int A7v() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.W7, com.meta.analytics.dsp.uinode.InterfaceC0601Gg
    public final void ACc(float f3) {
        this.A00 = f3;
    }
}
