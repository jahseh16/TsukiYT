package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03655y implements RewardedVideoAd.RewardedVideoAdLoadConfigBuilder, RewardedVideoAd.RewardedVideoLoadAdConfig {
    public AdExperienceType A00;
    public C03645x A01;
    public String A02;
    public boolean A03;

    public C03655y(C03645x c03645x) {
        this.A01 = c03645x;
    }

    public final void A00() {
        this.A01.A07(this.A02, this.A00, this.A03);
    }

    public final RewardedVideoAd.RewardedVideoLoadAdConfig build() {
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdExperience(AdExperienceType adExperienceType) {
        this.A00 = adExperienceType;
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A06(rewardedVideoAdListener);
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withBid(String str) {
        this.A02 = str;
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z) {
        this.A03 = z;
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData(RewardData rewardData) {
        this.A01.A05(rewardData);
        return this;
    }
}
