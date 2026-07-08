package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1081Zf implements AnonymousClass59 {
    public final /* synthetic */ AbstractC03304o A00;

    public C1081Zf(AbstractC03304o abstractC03304o) {
        this.A00 = abstractC03304o;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final View A6M(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A6O(View view) {
        return this.A00.A0j(view) + ((C03314p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A6P(View view) {
        return this.A00.A0o(view) - ((C03314p) view.getLayoutParams()).topMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A7a() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A7b() {
        return this.A00.A0g();
    }
}
