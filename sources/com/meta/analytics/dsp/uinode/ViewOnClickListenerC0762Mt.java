package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0762Mt implements View.OnClickListener {
    public final /* synthetic */ U6 A00;

    public ViewOnClickListenerC0762Mt(U6 u6) {
        this.A00 = u6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A4M();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
