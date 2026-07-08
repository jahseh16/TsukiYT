package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0837Pq implements View.OnClickListener {
    public final /* synthetic */ C0838Pr A00;

    public ViewOnClickListenerC0837Pq(C0838Pr c0838Pr) {
        this.A00 = c0838Pr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A05.performClick();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
