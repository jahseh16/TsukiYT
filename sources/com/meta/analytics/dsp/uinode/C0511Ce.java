package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0511Ce {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Format A07;
    public final long[] A08;
    public final long[] A09;
    public final C0512Cf[] A0A;

    public C0511Ce(int i, int i5, long j, long j4, long j7, Format format, int i8, C0512Cf[] c0512CfArr, int i10, long[] jArr, long[] jArr2) {
        this.A00 = i;
        this.A03 = i5;
        this.A06 = j;
        this.A05 = j4;
        this.A04 = j7;
        this.A07 = format;
        this.A02 = i8;
        this.A0A = c0512CfArr;
        this.A01 = i10;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C0512Cf A00(int i) {
        C0512Cf[] c0512CfArr = this.A0A;
        if (c0512CfArr == null) {
            return null;
        }
        return c0512CfArr[i];
    }
}
