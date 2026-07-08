package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0848Qb implements View.OnClickListener {
    public final /* synthetic */ C0713Kw A00;

    public ViewOnClickListenerC0848Qb(C0713Kw c0713Kw) {
        this.A00 = c0713Kw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A03.A04(J9.A0d, null);
            this.A00.A02.A0E().A3B();
            if (this.A00.A00 != null) {
                if (this.A00.A07()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
