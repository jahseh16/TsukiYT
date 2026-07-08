package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class H4 extends IOException {
    public final int A00;
    public final C0619Gy A01;

    public H4(IOException iOException, C0619Gy c0619Gy, int i) {
        super(iOException);
        this.A01 = c0619Gy;
        this.A00 = i;
    }

    public H4(String str, C0619Gy c0619Gy, int i) {
        super(str);
        this.A01 = c0619Gy;
        this.A00 = i;
    }

    public H4(String str, IOException iOException, C0619Gy c0619Gy, int i) {
        super(str, iOException);
        this.A01 = c0619Gy;
        this.A00 = i;
    }
}
