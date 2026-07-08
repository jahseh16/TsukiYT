package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WN extends AH {
    public static final Object A09 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public WN(long j, long j4, long j7, long j8, long j9, long j10, boolean z, boolean z5, Object obj) {
        this.A01 = j;
        this.A05 = j4;
        this.A00 = j7;
        this.A03 = j8;
        this.A04 = j9;
        this.A02 = j10;
        this.A08 = z;
        this.A07 = z5;
        this.A06 = obj;
    }

    public WN(long j, long j4, long j7, long j8, boolean z, boolean z5, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j4, j7, j8, z, z5, obj);
    }

    public WN(long j, boolean z, boolean z5, Object obj) {
        this(j, j, 0L, 0L, z, z5, obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final int A00() {
        return 1;
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final int A01() {
        return 1;
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final int A04(Object obj) {
        return A09.equals(obj) ? 0 : -1;
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final AF A0A(int i, AF af, boolean z) {
        AbstractC0620Ha.A00(i, 0, 1);
        Object uid = z ? A09 : null;
        return af.A0B(null, uid, 0, this.A00, -this.A04);
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final AG A0D(int i, AG ag, boolean z, long j) {
        Object obj;
        AbstractC0620Ha.A00(i, 0, 1);
        if (z) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j4 = this.A02;
        boolean z5 = this.A07;
        if (z5 && j != 0) {
            long windowDefaultStartPositionUs = this.A03;
            if (windowDefaultStartPositionUs == -9223372036854775807L) {
                j4 = -9223372036854775807L;
            } else {
                j4 += j;
                if (j4 > windowDefaultStartPositionUs) {
                    j4 = -9223372036854775807L;
                }
            }
        }
        return ag.A04(obj, this.A01, this.A05, this.A08, z5, j4, this.A03, 0, 0, this.A04);
    }
}
