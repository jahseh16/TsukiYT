package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1087Zl extends C4Y {
    public C1087Zl(AbstractC03304o abstractC03304o) {
        super(abstractC03304o, null);
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C03314p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0D(View view) {
        C03314p c03314p = (C03314p) view.getLayoutParams();
        return this.A02.A0l(view) + c03314p.topMargin + c03314p.bottomMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0E(View view) {
        C03314p c03314p = (C03314p) view.getLayoutParams();
        return this.A02.A0m(view) + c03314p.leftMargin + c03314p.rightMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C03314p) view.getLayoutParams()).topMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final void A0J(int i) {
        this.A02.A10(i);
    }
}
