package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04339a extends AbstractC0839Ps {
    public final /* synthetic */ C0922Sx A00;

    public C04339a(C0922Sx c0922Sx) {
        this.A00 = c0922Sx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0840Pt c0840Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0821Pa(this));
    }
}
