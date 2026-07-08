package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OH implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC0936Tl A00;
    public final /* synthetic */ String A01;

    public OH(ViewOnClickListenerC0936Tl viewOnClickListenerC0936Tl, String str) {
        this.A00 = viewOnClickListenerC0936Tl;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
