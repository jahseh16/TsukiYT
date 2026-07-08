package com.meta.analytics.dsp.uinode;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KC implements InterfaceC0856Qj {
    public static byte[] A06;
    public static String[] A07 = {"A7BI5", "gKWOMBrJHuMwvM90e1kQxbLVjOWHbC33", "UYN9ptwwhG6kseDSIUjMW4tKOOJXD2Z7", "Ja75eMPfNEu2gmMNMrA6", "IMMQ3U1D8CAOequczoeO", "aOtgKGua3vuGYyvCOzm8c8DJStBVo0w", "j", "V23k2coZlnHKKs"};
    public ValueAnimator A00;
    public EnumC0855Qi A01 = EnumC0855Qi.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public static String A04(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{40, 25, 44, 40, -9, 35, 32, 35, 38};
    }

    static {
        A05();
    }

    public KC(View view, int i, int i5, int i8) {
        this.A02 = i;
        this.A05 = view;
        this.A04 = i5;
        this.A03 = i8;
    }

    private void A06(int i, int i5) {
        this.A01 = i == this.A04 ? EnumC0855Qi.A04 : EnumC0855Qi.A06;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 82), i, i5);
        this.A00 = objectAnimatorOfInt;
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C0862Qp(this, i, i5));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, int i5, boolean z) {
        if (z) {
            A06(i, i5);
            return;
        }
        View view = this.A05;
        if (A07[4].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "Y4rCa4lywlEdVv";
        strArr[0] = "Hdg5N";
        ((TextView) view).setTextColor(i5);
        this.A01 = i5 == this.A03 ? EnumC0855Qi.A03 : EnumC0855Qi.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0856Qj
    public final void A3Y(boolean z, boolean z5) {
        int endColor = z5 ? this.A03 : this.A04;
        int startColor = z5 ? this.A04 : this.A03;
        A07(endColor, startColor, z);
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
