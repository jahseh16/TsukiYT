package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1112aC implements C2Y {
    public final SharedPreferences A00;

    public C1112aC(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.meta.analytics.dsp.uinode.C2Y
    public final C1113aD A5S() {
        return new C1113aD(this.A00.edit());
    }

    @Override // com.meta.analytics.dsp.uinode.C2Y
    public final long A7K(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.meta.analytics.dsp.uinode.C2Y
    public final String A85(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
