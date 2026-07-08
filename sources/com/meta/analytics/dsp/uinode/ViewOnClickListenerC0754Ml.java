package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0754Ml implements View.OnClickListener {
    public final /* synthetic */ C0756Mn A00;

    public ViewOnClickListenerC0754Ml(C0756Mn c0756Mn) {
        this.A00 = c0756Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A04.A9N();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
