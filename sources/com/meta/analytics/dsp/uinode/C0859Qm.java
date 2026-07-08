package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0859Qm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ KI A01;

    public C0859Qm(KI ki, View view) {
        this.A01 = ki;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = iIntValue;
        this.A00.setLayoutParams(layoutParams);
    }
}
