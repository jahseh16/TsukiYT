package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03917e {
    public static final AtomicReference<C1063Ym> A00 = new AtomicReference<>();

    public static C1063Ym A00() {
        return A00.get();
    }

    public static void A01(C1063Ym c1063Ym) {
        if (c1063Ym == null) {
            return;
        }
        AbstractC03907d.A00(A00, null, c1063Ym);
    }
}
