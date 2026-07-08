package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0780Nl {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC0779Nk viewOnClickListenerC0779Nk = new ViewOnClickListenerC0779Nk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC0779Nk);
            view.setOnTouchListener(new ViewOnTouchListenerC0778Nj(viewOnClickListenerC0779Nk));
        }
    }
}
