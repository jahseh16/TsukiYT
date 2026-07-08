package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0933Ti implements InterfaceC0776Nh {
    public final WeakReference<BK> A00;

    public C0933Ti(BK bk2) {
        this.A00 = new WeakReference<>(bk2);
    }

    public /* synthetic */ C0933Ti(BK bk2, BP bp2) {
        this(bk2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0776Nh
    public final void ABh(boolean z) {
        BK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A04();
        }
    }
}
