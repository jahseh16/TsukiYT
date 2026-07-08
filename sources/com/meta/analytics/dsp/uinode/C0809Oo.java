package com.meta.analytics.dsp.uinode;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0809Oo extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC0936Tl A02;
    public static final int A05 = (int) (LD.A02 * 36.0f);
    public static final int A06 = (int) (LD.A02 * 36.0f);
    public static final int A03 = (int) (LD.A02 * 23.0f);
    public static final int A04 = (int) (LD.A02 * 3.0f);
    public static final int A07 = (int) (LD.A02 * 4.0f);

    public C0809Oo(C1064Yn c1064Yn, AbstractC1167b5 abstractC1167b5, J2 j22, MC mc, RE re, C0723Lg c0723Lg, C1P c1p, InterfaceC0785Nq interfaceC0785Nq) {
        super(c1064Yn);
        this.A00 = c1p.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c1064Yn);
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(c1064Yn, abstractC1167b5.A0x().A0F().A04());
        ViewOnClickListenerC0936Tl viewOnClickListenerC0936Tl = new ViewOnClickListenerC0936Tl(c1064Yn, abstractC1167b5.A0L(), null, j22, mc, re, c0723Lg, abstractC1167b5.A0y());
        this.A02 = viewOnClickListenerC0936Tl;
        viewOnClickListenerC0936Tl.setCta(abstractC1167b5.A0x().A0F(), abstractC1167b5.A12(), new HashMap(), interfaceC0785Nq);
        viewOnClickListenerC0936Tl.setIsInAppBrowser(true);
        addView(viewOnClickListenerC0936Tl, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(C1064Yn c1064Yn, View view) {
        ImageView imageView = new ImageView(c1064Yn);
        imageView.setImageBitmap(AbstractC0740Lx.A01(EnumC0739Lw.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i = A03;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i5 = A04;
        imageView.setPadding(i5, i5, i5, i5);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1064Yn c1064Yn, String str) {
        Button button = new Button(c1064Yn);
        AbstractC0731Lo.A0K(button);
        int i = A06;
        button.setPadding(i, 0, i, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC0731Lo.A0O(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1064Yn, button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1167b5 abstractC1167b5, MB mb2) {
        this.A02.A0A(abstractC1167b5, mb2);
    }
}
