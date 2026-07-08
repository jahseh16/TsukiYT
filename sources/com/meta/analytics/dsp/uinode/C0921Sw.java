package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0921Sw extends RD {
    public final /* synthetic */ AbstractC0917Ss A00;

    public C0921Sw(AbstractC0917Ss abstractC0917Ss) {
        this.A00 = abstractC0917Ss;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A12())) {
                this.A00.A04.A9g(this.A00.A01.A12(), new C0777Ni().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0O()).A05());
                C1U.A07(this.A00.A01.A0y(), this.A00.A03);
                this.A00.A03.A0E().A2k();
                C2O.A00(this.A00.A01.A0N());
                this.A00.A08.A43(this.A00.A09.A7B());
            }
        }
    }
}
