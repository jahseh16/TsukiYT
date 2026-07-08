package com.meta.analytics.dsp.uinode;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0862Qp implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ KC A02;

    public C0862Qp(KC kc, int i, int i5) {
        this.A02 = kc;
        this.A01 = i;
        this.A00 = i5;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnumC0855Qi enumC0855Qi;
        KC kc = this.A02;
        if (this.A01 == kc.A04) {
            enumC0855Qi = EnumC0855Qi.A03;
        } else {
            enumC0855Qi = EnumC0855Qi.A05;
        }
        kc.A01 = enumC0855Qi;
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
