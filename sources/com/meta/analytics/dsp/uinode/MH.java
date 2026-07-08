package com.meta.analytics.dsp.uinode;

import android.view.animation.Animation;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MH implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC0492Bi A00;

    public MH(ViewOnClickListenerC0492Bi viewOnClickListenerC0492Bi) {
        this.A00 = viewOnClickListenerC0492Bi;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((UT) this.A00).A07.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
