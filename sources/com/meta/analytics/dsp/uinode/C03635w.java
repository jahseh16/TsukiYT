package com.meta.analytics.dsp.uinode;

import com.facebook.ads.RewardedInterstitialAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03635w implements RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final C03665z A00;

    public C03635w(C03665z c03665z) {
        this.A00 = c03665z;
    }

    public final C03665z A00() {
        return this.A00;
    }

    public final RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i) {
        this.A00.withAppOrientation(i);
        return this;
    }
}
