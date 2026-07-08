package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0922Sx A00;

    public PX(C0922Sx c0922Sx) {
        this.A00 = c0922Sx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0Z.getLayoutParams().height = num.intValue();
        this.A00.A0Z.requestLayout();
    }
}
