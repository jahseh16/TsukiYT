package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.facebook.ads.AdSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1135aZ implements C8Z {
    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final String A6E() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final String A6S() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final C04027t A6k(C03927f c03927f) {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final String A7Q() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final String A87() {
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            return AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final boolean A99() {
        return AdSettings.isMixedAudience();
    }

    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final boolean A9E() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final Boolean A9J() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C8Z
    public final boolean isTestMode(Context context) {
        return AdSettings.isTestMode(context);
    }
}
