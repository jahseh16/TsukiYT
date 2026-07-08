package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0915Sq implements InterfaceC0824Pd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0913So A01;

    public C0915Sq(C0913So c0913So, int i) {
        this.A01 = c0913So;
        this.A00 = i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0824Pd
    public final void AAu() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0824Pd
    public final void ABH(int i) {
        C0913So.A02(this.A01, i);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0824Pd
    public final void ABY(float f3) {
        if (!this.A01.A08) {
            this.A01.A0G(f3);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0824Pd
    public final void AD7(boolean z) {
        this.A01.A0Q(z);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0824Pd
    public final void ADX(String str) {
        this.A01.A0D.A0E().A2z(str);
        this.A01.A0H.A43(this.A01.A0J.A6y());
        this.A01.A0H(3);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0824Pd
    public final void AGq() {
        this.A01.A09 = false;
        this.A01.A0I.setProgressImmediate(0.0f);
        this.A01.A0I.setToolbarActionMode(2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0824Pd
    public final void AGr(float f3) {
        this.A01.A0I.setProgress(100.0f * f3);
    }
}
