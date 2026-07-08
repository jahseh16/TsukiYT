package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.text.Layout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0583Fn {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Bitmap A0A;
    public final Layout.Alignment A0B;
    public final CharSequence A0C;
    public final boolean A0D;

    public C0583Fn(Bitmap bitmap, float f3, int i, float f4, int i5, float f5, float f7) {
        this(null, null, bitmap, f4, 0, i5, f3, i, Integer.MIN_VALUE, Float.MIN_VALUE, f5, f7, false, -16777216);
    }

    public C0583Fn(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C0583Fn(CharSequence charSequence, Layout.Alignment alignment, float f3, int i, int i5, float f4, int i8, float f5) {
        this(charSequence, alignment, f3, i, i5, f4, i8, f5, false, -16777216);
    }

    public C0583Fn(CharSequence charSequence, Layout.Alignment alignment, float f3, int i, int i5, float f4, int i8, float f5, int i10, float f7) {
        this(charSequence, alignment, null, f3, i, i5, f4, i8, i10, f7, f5, Float.MIN_VALUE, false, -16777216);
    }

    public C0583Fn(CharSequence charSequence, Layout.Alignment alignment, float f3, int i, int i5, float f4, int i8, float f5, boolean z, int i10) {
        this(charSequence, alignment, null, f3, i, i5, f4, i8, Integer.MIN_VALUE, Float.MIN_VALUE, f5, Float.MIN_VALUE, z, i10);
    }

    public C0583Fn(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f3, int i, int i5, float f4, int i8, int i10, float f5, float f7, float f8, boolean z, int i11) {
        this.A0C = charSequence;
        this.A0B = alignment;
        this.A0A = bitmap;
        this.A01 = f3;
        this.A06 = i;
        this.A05 = i5;
        this.A02 = f4;
        this.A07 = i8;
        this.A03 = f7;
        this.A00 = f8;
        this.A0D = z;
        this.A09 = i11;
        this.A08 = i10;
        this.A04 = f5;
    }
}
