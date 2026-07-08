package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WI implements InterfaceC0584Fo {
    public final List<C0583Fn> A00;

    public WI(List<C0583Fn> list) {
        this.A00 = list;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final List<C0583Fn> A6Z(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final long A70(int i) {
        AbstractC0620Ha.A03(i == 0);
        return 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final int A71() {
        return 1;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final int A7T(long j) {
        return j < 0 ? 0 : -1;
    }
}
