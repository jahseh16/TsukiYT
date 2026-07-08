package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KI implements InterfaceC0856Qj {
    public int A00;
    public ValueAnimator A01;
    public EnumC0855Qi A02 = EnumC0855Qi.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public KI(View view, int i, int i5, int i8) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i5;
        this.A04 = i8;
    }

    private ValueAnimator A00(int i, int i5, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i5);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C0859Qm(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = EnumC0855Qi.A06;
            ValueAnimator valueAnimatorA00 = A00(this.A00, this.A04, this.A05);
            this.A01 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C0858Ql(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        AbstractC0731Lo.A0H(this.A05);
        this.A02 = EnumC0855Qi.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        AbstractC0731Lo.A0L(this.A05);
        if (z) {
            this.A02 = EnumC0855Qi.A04;
            ValueAnimator valueAnimatorA00 = A00(this.A04, this.A00, this.A05);
            this.A01 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C0857Qk(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC0855Qi.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0856Qj
    public final void A3Y(boolean z, boolean z5) {
        if (z5) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0856Qj
    public final EnumC0855Qi A82() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0856Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
