package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1082Zg implements AnonymousClass59 {
    public final /* synthetic */ AbstractC03304o A00;

    public C1082Zg(AbstractC03304o abstractC03304o) {
        this.A00 = abstractC03304o;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final View A6M(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A6O(View view) {
        return this.A00.A0n(view) + ((C03314p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A6P(View view) {
        return this.A00.A0k(view) - ((C03314p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A7a() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A7b() {
        return this.A00.A0e();
    }
}
