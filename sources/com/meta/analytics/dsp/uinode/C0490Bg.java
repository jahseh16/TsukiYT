package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0490Bg extends C1090Zo {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C0491Bh A03;
    public int[] A04;
    public final C1064Yn A05;
    public final C0829Pi A06;
    public final C0830Pj A07;

    public C0490Bg(C1064Yn c1064Yn, C0830Pj c0830Pj, C0829Pi c0829Pi) {
        super(c1064Yn);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1064Yn;
        this.A07 = c0830Pj;
        this.A06 = c0829Pi;
        this.A01 = -1;
        this.A03 = new C0491Bh(this, c1064Yn);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03304o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1J(com.meta.analytics.dsp.uinode.C03374w r17, com.meta.analytics.dsp.uinode.AnonymousClass53 r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0490Bg.A1J(com.facebook.ads.redexgen.X.4w, com.facebook.ads.redexgen.X.53, int, int):void");
    }

    @Override // com.meta.analytics.dsp.uinode.C1090Zo, com.meta.analytics.dsp.uinode.AbstractC03304o
    public final void A1p(int i) {
        A2B(i, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.C1090Zo, com.meta.analytics.dsp.uinode.AbstractC03304o
    public final void A1x(C0547Eb c0547Eb, AnonymousClass53 anonymousClass53, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2G(double d4) {
        if (d4 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d4 = 1.0d;
        }
        this.A00 = (float) (50.0d / d4);
        this.A03 = new C0491Bh(this, this.A05);
    }

    public final void A2H(int i) {
        this.A01 = i;
    }

    public final void A2I(int i) {
        this.A02 = i;
    }
}
