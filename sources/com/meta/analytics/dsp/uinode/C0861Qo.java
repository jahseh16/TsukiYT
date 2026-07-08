package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0861Qo extends AnimatorListenerAdapter {
    public final /* synthetic */ KF A00;

    public C0861Qo(KF kf) {
        this.A00 = kf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00.A04) {
            AbstractC0731Lo.A0L(this.A00.A03);
        }
        this.A00.A03.setAlpha(1.0f);
        this.A00.A01 = EnumC0855Qi.A03;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00.A04) {
            AbstractC0731Lo.A0H(this.A00.A03);
        }
        this.A00.A01 = EnumC0855Qi.A05;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
