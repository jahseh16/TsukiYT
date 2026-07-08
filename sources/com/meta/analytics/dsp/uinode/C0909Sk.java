package com.meta.analytics.dsp.uinode;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0909Sk extends AnimationAnimationListenerC0730Ln {
    public final /* synthetic */ C0908Sj A00;

    public C0909Sk(C0908Sj c0908Sj) {
        this.A00 = c0908Sj;
    }

    @Override // com.meta.analytics.dsp.uinode.AnimationAnimationListenerC0730Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC0731Lo.A0H(this.A00.A01);
        this.A00.A00.ABu();
    }
}
