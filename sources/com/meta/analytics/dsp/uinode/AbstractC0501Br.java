package com.meta.analytics.dsp.uinode;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0501Br extends AbstractC1041Xq implements InterfaceC0584Fo {
    public long A00;
    public InterfaceC0584Fo A01;

    public abstract void A08();

    @Override // com.meta.analytics.dsp.uinode.B7
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j, InterfaceC0584Fo interfaceC0584Fo, long j4) {
        super.A01 = j;
        this.A01 = interfaceC0584Fo;
        if (j4 == Long.MAX_VALUE) {
            j4 = super.A01;
        }
        this.A00 = j4;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final List<C0583Fn> A6Z(long j) {
        return this.A01.A6Z(j - this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final long A70(int i) {
        return this.A01.A70(i) + this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final int A71() {
        return this.A01.A71();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final int A7T(long j) {
        return this.A01.A7T(j - this.A00);
    }
}
