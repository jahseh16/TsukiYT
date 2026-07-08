package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0584Fo {
    public final long[] A00;
    public final C0583Fn[] A01;

    public WE(C0583Fn[] c0583FnArr, long[] jArr) {
        this.A01 = c0583FnArr;
        this.A00 = jArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final List<C0583Fn> A6Z(long j) {
        C0583Fn c0583Fn;
        int iA0B = IF.A0B(this.A00, j, true, false);
        if (iA0B == -1 || (c0583Fn = this.A01[iA0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(c0583Fn);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final long A70(int i) {
        boolean z = true;
        AbstractC0620Ha.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        AbstractC0620Ha.A03(z);
        return this.A00[i];
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0584Fo
    public final int A7T(long j) {
        int iA0A = IF.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
