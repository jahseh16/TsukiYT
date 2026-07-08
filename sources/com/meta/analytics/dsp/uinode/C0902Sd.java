package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0902Sd implements InterfaceC0812Or {
    public final /* synthetic */ C0900Sb A00;

    public C0902Sd(C0900Sb c0900Sb) {
        this.A00 = c0900Sb;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0812Or
    public final void ADT(int i) {
        this.A00.A0C(i, true);
        if (this.A00.A0H()) {
            this.A00.A07();
        } else {
            this.A00.A09(i);
        }
    }
}
