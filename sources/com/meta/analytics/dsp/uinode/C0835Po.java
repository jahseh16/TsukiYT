package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0835Po extends LinearLayout {
    public static final int A04 = (int) (LD.A02 * 32.0f);
    public static final int A05 = (int) (LD.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public O3 A02;
    public final C1064Yn A03;

    public C0835Po(C1064Yn c1064Yn) {
        super(c1064Yn);
        this.A03 = c1064Yn;
        A00(c1064Yn);
    }

    private final void A00(C1064Yn c1064Yn) {
        setGravity(16);
        O3 o32 = new O3(c1064Yn);
        this.A02 = o32;
        o32.setFullCircleCorners(true);
        int i = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i, i);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1064Yn);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1064Yn);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC0731Lo.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        TextView textView = new TextView(c1064Yn);
        this.A01 = textView;
        AbstractC0731Lo.A0X(textView, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        this.A01.setText(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
    }

    public final void A02(int i, int i5) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i5);
    }

    public void setPageDetails(C02391a c02391a) {
        AsyncTaskC0941Tq asyncTaskC0941Tq = new AsyncTaskC0941Tq(this.A02, this.A03);
        int i = A04;
        asyncTaskC0941Tq.A05(i, i);
        asyncTaskC0941Tq.A07(c02391a.A01());
        this.A00.setText(c02391a.A02());
        this.A01.setText(c02391a.A03());
    }
}
