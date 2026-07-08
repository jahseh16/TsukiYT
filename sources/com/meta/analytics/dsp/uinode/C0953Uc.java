package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0953Uc extends AnimationAnimationListenerC0730Ln {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C0953Uc(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.meta.analytics.dsp.uinode.AnimationAnimationListenerC0730Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
