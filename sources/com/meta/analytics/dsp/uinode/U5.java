package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class U5 extends AbstractC0757Mo {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2S A04;
    public final C1064Yn A05;

    public static String A0B(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (LD.A02 * 4.0f);
        A08 = (int) (LD.A02 * 10.0f);
        A07 = (int) (LD.A02 * 44.0f);
    }

    public U5(C1064Yn c1064Yn, J2 j22, String str) {
        super(c1064Yn, j22, str);
        this.A05 = c1064Yn;
        this.A04 = C2T.A00(c1064Yn.A01());
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        int i = A08;
        imageView.setPadding(i, i, i, i);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(-10459280);
        int i5 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i5);
        layoutParams.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A02 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        this.A00 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setLayoutParams(layoutParams2);
        horizontalScrollView.addView(linearLayout, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.A03 = linearLayout2;
        linearLayout2.setOrientation(0);
        AbstractC0731Lo.A0M(linearLayout2, -218103809);
        linearLayout2.setMotionEventSplittingEnabled(false);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.addView(horizontalScrollView, layoutParams2);
        addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        linearLayout2.setClickable(true);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0757Mo
    public final void A0L() {
        this.A01.setImageBitmap(AbstractC0740Lx.A01(EnumC0739Lw.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC0766Mx(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        C0761Ms c0761Ms = new C0761Ms(this.A05);
        c0761Ms.setData(this.A04.A0H(), EnumC0739Lw.HIDE_AD);
        c0761Ms.setOnClickListener(new ViewOnClickListenerC0767My(this, c0761Ms));
        C0761Ms c0761Ms2 = new C0761Ms(this.A05);
        c0761Ms2.setData(this.A04.A0L(), EnumC0739Lw.REPORT_AD);
        c0761Ms2.setOnClickListener(new ViewOnClickListenerC0768Mz(this, c0761Ms2));
        C0761Ms c0761Ms3 = new C0761Ms(this.A05);
        c0761Ms3.setData(this.A04.A0M(), EnumC0739Lw.AD_CHOICES_ICON);
        c0761Ms3.setOnClickListener(new N0(this, c0761Ms3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        AbstractC0731Lo.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c0761Ms, layoutParams);
        this.A02.addView(c0761Ms2, layoutParams);
        this.A02.addView(c0761Ms3, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0757Mo
    public final void A0M() {
        AbstractC0731Lo.A0I(this);
        AbstractC0731Lo.A0J(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0757Mo
    public final void A0N(C2W c2w, C2U c2u) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        AbstractC0731Lo.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        AbstractC0731Lo.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0757Mo
    public final void A0O(C2W c2w, C2U c2u) {
        AbstractC0731Lo.A0T(this.A03);
        this.A01.setImageBitmap(AbstractC0740Lx.A01(EnumC0739Lw.BACK_ARROW));
        this.A01.setOnClickListener(new N1(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        for (C2W c2w2 : c2w.A05()) {
            C0761Ms c0761Ms = new C0761Ms(this.A05);
            c0761Ms.setData(c2w2.A04(), null);
            c0761Ms.setOnClickListener(new N2(this, c0761Ms, c2w2));
            this.A02.addView(c0761Ms, layoutParams);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0757Mo
    public final boolean A0P() {
        return true;
    }
}
