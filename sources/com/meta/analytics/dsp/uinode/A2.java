package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class A2 extends AbstractC0839Ps {
    public final /* synthetic */ T4 A00;

    public A2(T4 t42) {
        this.A00 = t42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0840Pt c0840Pt) {
        new Handler(Looper.getMainLooper()).post(new PS(this));
    }
}
