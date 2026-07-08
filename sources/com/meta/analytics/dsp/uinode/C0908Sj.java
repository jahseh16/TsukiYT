package com.meta.analytics.dsp.uinode;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0908Sj extends KT {
    public final /* synthetic */ InterfaceC0826Pf A00;
    public final /* synthetic */ C0827Pg A01;

    public C0908Sj(C0827Pg c0827Pg, InterfaceC0826Pf interfaceC0826Pf) {
        this.A01 = c0827Pg;
        this.A00 = interfaceC0826Pf;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0909Sk(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
