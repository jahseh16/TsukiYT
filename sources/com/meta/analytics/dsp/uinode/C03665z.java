package com.meta.analytics.dsp.uinode;

import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03665z implements RewardedVideoAd.RewardedVideoAdShowConfigBuilder, RewardedVideoAd.RewardedVideoShowAdConfig {
    public int A00 = -1;
    public long A01;

    public final int A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final C03665z A02(long j) {
        this.A01 = j;
        return this;
    }

    public final RewardedVideoAd.RewardedVideoShowAdConfig build() {
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdShowConfigBuilder withAppOrientation(int i) {
        this.A00 = i;
        return this;
    }
}
