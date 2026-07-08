package com.meta.analytics.dsp.uinode;

import android.text.Layout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WA extends C0583Fn {
    public final long A00;
    public final long A01;

    public WA(long j, long j4, CharSequence charSequence) {
        this(j, j4, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public WA(long j, long j4, CharSequence charSequence, Layout.Alignment alignment, float f3, int i, int i5, float f4, int i8, float f5) {
        super(charSequence, alignment, f3, i, i5, f4, i8, f5);
        this.A01 = j;
        this.A00 = j4;
    }

    public WA(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean A00() {
        return super.A01 == Float.MIN_VALUE && this.A02 == Float.MIN_VALUE;
    }
}
