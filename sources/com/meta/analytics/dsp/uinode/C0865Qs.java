package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0865Qs implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ KA A01;

    public C0865Qs(KA ka, View view) {
        this.A01 = ka;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int value = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.setTranslationY(value);
    }
}
