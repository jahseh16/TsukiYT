package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0761Ms extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (LD.A02 * 16.0f);
    public static final int A05 = (int) (LD.A02 * 12.0f);
    public static final int A06 = (int) (LD.A02 * 12.0f);
    public static final int A03 = (int) (LD.A02 * 16.0f);

    public C0761Ms(C1064Yn c1064Yn) {
        super(c1064Yn);
        this.A00 = false;
        setOrientation(0);
        int i = A04;
        int i5 = A05;
        setPadding(i, i5, i, i5);
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        int i8 = A03;
        LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(i8, i8);
        textViewParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.A02 = textView;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        addView(imageView, textViewParams);
        addView(textView, layoutParams);
        A00();
    }

    private void A00() {
        int textColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        AbstractC0731Lo.A0S(this, gradientDrawable);
        AbstractC0731Lo.A0X(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, EnumC0739Lw enumC0739Lw) {
        this.A02.setText(str);
        if (enumC0739Lw != null) {
            this.A01.setImageBitmap(AbstractC0740Lx.A01(enumC0739Lw));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.A00 = z;
        A00();
    }
}
