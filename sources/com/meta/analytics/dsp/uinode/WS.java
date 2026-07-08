package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WS implements FB {
    public final int A00;
    public final /* synthetic */ CD A01;

    public WS(CD cd, int i) {
        this.A01 = cd;
        this.A00 = i;
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final boolean A9C() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final void AAM() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final int AEK(C04479p c04479p, C1042Xr c1042Xr, boolean z) {
        return this.A01.A0P(this.A00, c04479p, c1042Xr, z);
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final int AGO(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
