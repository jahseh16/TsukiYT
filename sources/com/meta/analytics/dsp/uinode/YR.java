package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class YR implements InterfaceC03947i {
    public final C03927f A00;

    public YR(C03927f c03927f) {
        this.A00 = c03927f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03947i
    public final Map<String, String> A4n() {
        return C04118d.A01(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03947i
    public final Map<String, String> A61() {
        return C8J.A02();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03947i
    public final String A7F() {
        return C8J.A00();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03947i
    public final String A7H() {
        return C6E.A00().A03();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03947i
    public final boolean A94() {
        return C0706Kp.A00().A03();
    }
}
