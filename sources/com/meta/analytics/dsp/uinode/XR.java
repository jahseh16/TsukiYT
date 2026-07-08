package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XR implements CL {
    public final int A00;
    public final int A01;
    public final C0645Hz A02;

    public XR(XS xs) {
        C0645Hz c0645Hz = xs.A00;
        this.A02 = c0645Hz;
        c0645Hz.A0Y(12);
        this.A00 = c0645Hz.A0H();
        this.A01 = c0645Hz.A0H();
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final int A7o() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final boolean A93() {
        return this.A00 != 0;
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final int AEN() {
        int i = this.A00;
        return i == 0 ? this.A02.A0H() : i;
    }
}
