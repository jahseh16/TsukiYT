package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N0 implements View.OnClickListener {
    public final /* synthetic */ C0761Ms A00;
    public final /* synthetic */ U5 A01;

    public N0(U5 u5, C0761Ms c0761Ms) {
        this.A01 = u5;
        this.A00 = c0761Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A9O();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
