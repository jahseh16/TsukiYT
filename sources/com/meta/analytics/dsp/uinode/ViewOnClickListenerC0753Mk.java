package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0753Mk implements View.OnClickListener {
    public final /* synthetic */ C0756Mn A00;

    public ViewOnClickListenerC0753Mk(C0756Mn c0756Mn) {
        this.A00 = c0756Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A4L();
            } else {
                this.A00.A04.A4M();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
