package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0756Mn extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C2S A02;
    public final C1064Yn A03;
    public final InterfaceC0759Mq A04;
    public final boolean A05;

    static {
        int i = (int) (LD.A02 * 16.0f);
        A09 = i;
        A0A = (int) (LD.A02 * 8.0f);
        A0D = (int) (LD.A02 * 44.0f);
        int i5 = (int) (LD.A02 * 10.0f);
        A08 = i5;
        A07 = i - i5;
        A0E = (int) (LD.A02 * 75.0f);
        A0B = (int) (LD.A02 * 25.0f);
        A0F = (int) (LD.A02 * 45.0f);
        A0C = (int) (LD.A02 * 15.0f);
        A06 = (int) (LD.A02 * 16.0f);
    }

    public C0756Mn(C0755Mm c0755Mm) {
        super(c0755Mm.A0C);
        C1064Yn c1064Yn = c0755Mm.A0C;
        this.A03 = c1064Yn;
        this.A02 = C2T.A00(c1064Yn.A01());
        this.A04 = c0755Mm.A02;
        this.A01 = c0755Mm.A0B ? A0E : A0F;
        this.A00 = c0755Mm.A0B ? A0B : A0C;
        this.A05 = c0755Mm.A07;
        setFocusable(true);
        View viewA01 = A01(c0755Mm);
        View viewA00 = A00(c0755Mm);
        View footerView = getFooterView();
        AbstractC0731Lo.A0K(viewA01);
        AbstractC0731Lo.A0K(viewA00);
        AbstractC0731Lo.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, viewA01.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i = A09;
        layoutParams.setMargins(i, 0, i, i);
        addView(viewA01, footerParams);
        addView(viewA00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(c0755Mm.A08 ? 0 : 8);
    }

    public /* synthetic */ C0756Mn(C0755Mm c0755Mm, ViewOnClickListenerC0753Mk viewOnClickListenerC0753Mk) {
        this(c0755Mm);
    }

    private View A00(C0755Mm c0755Mm) {
        ImageView imageView = new ImageView(getContext());
        int i = this.A00;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(AbstractC0740Lx.A01(c0755Mm.A01));
        imageView.setColorFilter(-1);
        int i5 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i5);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c0755Mm.A00);
        AbstractC0731Lo.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i8 = A09;
        layoutParams.setMargins(i8, 0, i8, i8);
        TextView textView = new TextView(getContext());
        AbstractC0731Lo.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(c0755Mm.A06);
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i8, 0, i8, i8);
        TextView textView2 = new TextView(getContext());
        AbstractC0731Lo.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(c0755Mm.A05);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i8, 0, i8, i8);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        if (c0755Mm.A09) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(c0755Mm.A04)) {
                O3 o32 = new O3(this.A03);
                int i10 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i10, i10);
                subtitleParams.setMargins(0, 0, A0A, 0);
                o32.setFullCircleCorners(true);
                new AsyncTaskC0941Tq(o32, this.A03).A05(i10, i10).A07(c0755Mm.A04);
                linearLayout2.addView(o32, subtitleParams);
            }
            C0761Ms c0761Ms = new C0761Ms(this.A03);
            c0761Ms.setData(c0755Mm.A03, EnumC0739Lw.CHECKMARK);
            c0761Ms.setSelected(true);
            linearLayout2.addView(c0761Ms, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C0755Mm c0755Mm) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c0755Mm.A0A) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(AbstractC0740Lx.A01(EnumC0739Lw.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC0753Mk(this));
            int i5 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i5);
            int i8 = A07;
            layoutParams.setMargins(i8, i8, i8, i8);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(AbstractC0740Lx.A01(EnumC0739Lw.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        AbstractC0731Lo.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i5 = A0A;
        managePrefsText.setPadding(i5, i5, i5, i5);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0754Ml(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
