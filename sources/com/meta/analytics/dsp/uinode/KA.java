package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KA implements InterfaceC0856Qj {
    public static String[] A06 = {"Zp1jBMTXyTngXAjRlLP1q6RZbaUI", "nHljDkT3i8Wirocu51jroGsoJHOhv1cR", "sP6X6aS", "KZL6M4", "KoOjzqZIxieUbLbPf8D", "B1jmqrSafv9jI6Lw73IRSYcL6IlnF6YH", "FLN3m70EKIfdw8", "ppmNyXlbfQKy53gkSU0tUatt7Y3PBdXb"};
    public ValueAnimator A00;
    public EnumC0855Qi A01 = EnumC0855Qi.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public KA(View view, int i, int i5, int i8) {
        this.A05 = view;
        this.A02 = i;
        this.A04 = i5;
        this.A03 = i8;
    }

    private ValueAnimator A00(View view, int i, int i5) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i5);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new C0865Qs(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            if (A06[1].charAt(28) != 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "75AaLozsvbqC7RPKNa9MBDOQqsQ1eQ5U";
            strArr[5] = "oWQ9IgFva7oIaP1s8z2NxAvwjcynmKEe";
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        if (z) {
            this.A01 = EnumC0855Qi.A06;
            ValueAnimator valueAnimatorA00 = A00(this.A05, this.A03, this.A04);
            this.A00 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C0864Qr(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        AbstractC0731Lo.A0H(this.A05);
        this.A01 = EnumC0855Qi.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z) {
        AbstractC0731Lo.A0L(this.A05);
        if (z) {
            this.A01 = EnumC0855Qi.A04;
            ValueAnimator valueAnimatorA00 = A00(this.A05, this.A04, this.A03);
            this.A00 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C0863Qq(this));
            this.A00.start();
            return;
        }
        View view = this.A05;
        if (A06[1].charAt(28) != 'v') {
            throw new RuntimeException();
        }
        A06[4] = "CRQ3If4kF9c";
        view.setTranslationY(this.A03);
        this.A01 = EnumC0855Qi.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0856Qj
    public final void A3Y(boolean z, boolean z5) {
        if (z5) {
            A08(z);
        } else {
            A09(z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0856Qj
    public final EnumC0855Qi A82() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0856Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
