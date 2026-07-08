package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DE {
    public final int A00;
    public final long A01;

    public DE(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static DE A00(InterfaceC0503Bt interfaceC0503Bt, C0645Hz c0645Hz) throws InterruptedException, IOException {
        interfaceC0503Bt.ADv(c0645Hz.A00, 0, 8);
        c0645Hz.A0Y(0);
        int iA08 = c0645Hz.A08();
        long size = c0645Hz.A0K();
        return new DE(iA08, size);
    }
}
