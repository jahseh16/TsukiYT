package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T5 implements L8 {
    public final /* synthetic */ T4 A00;

    public T5(T4 t42) {
        this.A00 = t42;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        this.A00.A0F.ABH(this.A00.A0A);
        this.A00.A0F.AAu();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f3) {
        int i;
        float totalForce = (this.A00.A0A - f3) + (this.A00.A0V ? 0 : this.A00.A0I.getDuration());
        if (this.A00.A0V) {
            i = this.A00.A0A;
        } else {
            i = this.A00.A09;
        }
        float seenTime = i;
        this.A00.A0F.AGr(totalForce / seenTime);
    }
}
