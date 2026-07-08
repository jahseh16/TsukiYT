package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04549w {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AH A03;
    public final C0560Eo A04;
    public final TrackGroupArray A05;
    public final C0605Gk A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C04549w(AH ah, long j, TrackGroupArray trackGroupArray, C0605Gk c0605Gk) {
        this(ah, null, new C0560Eo(0), j, -9223372036854775807L, 1, false, trackGroupArray, c0605Gk);
    }

    public C04549w(AH ah, Object obj, C0560Eo c0560Eo, long j, long j4, int i, boolean z, TrackGroupArray trackGroupArray, C0605Gk c0605Gk) {
        this.A03 = ah;
        this.A07 = obj;
        this.A04 = c0560Eo;
        this.A02 = j;
        this.A01 = j4;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = c0605Gk;
    }

    public static void A00(C04549w c04549w, C04549w c04549w2) {
        c04549w2.A0A = c04549w.A0A;
        c04549w2.A09 = c04549w.A09;
    }

    public final C04549w A01(int i) {
        C04549w c04549w = new C04549w(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c04549w);
        return c04549w;
    }

    public final C04549w A02(int i) {
        C04549w playbackInfo = new C04549w(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04549w A03(AH ah, Object obj) {
        C04549w playbackInfo = new C04549w(ah, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04549w A04(C0560Eo c0560Eo, long j, long j4) {
        long j7 = j4;
        AH ah = this.A03;
        Object obj = this.A07;
        if (!c0560Eo.A01()) {
            j7 = -9223372036854775807L;
        }
        return new C04549w(ah, obj, c0560Eo, j, j7, this.A00, this.A08, this.A05, this.A06);
    }

    public final C04549w A05(TrackGroupArray trackGroupArray, C0605Gk c0605Gk) {
        C04549w playbackInfo = new C04549w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0605Gk);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04549w A06(boolean z) {
        C04549w playbackInfo = new C04549w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
