package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C9R extends AbstractC0839Ps {
    public final /* synthetic */ C9Q A00;

    public C9R(C9Q c9q) {
        this.A00 = c9q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0840Pt c0840Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0828Ph(this));
    }
}
