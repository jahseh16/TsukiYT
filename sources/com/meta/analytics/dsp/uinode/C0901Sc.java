package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0901Sc implements InterfaceC0813Os {
    public final /* synthetic */ C0900Sb A00;

    public C0901Sc(C0900Sb c0900Sb) {
        this.A00 = c0900Sb;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0813Os
    public final void ADb(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0813Os
    public final void ADd(View view) {
        TS ts = (TS) view;
        ts.A16();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) ts.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
