package com.meta.analytics.dsp.uinode;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0676Ji {
    public static EnumC0674Jg A00(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (LE.A04(i, screenHeight)) {
            return EnumC0674Jg.A0H;
        }
        if (screenHeight > i) {
            return EnumC0674Jg.A0J;
        }
        return EnumC0674Jg.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, EnumC0672Je enumC0672Je) {
        int iCeil;
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = enumC0672Je.A03();
        if (i >= screenWidth) {
            iCeil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = enumC0672Je.A03();
            iCeil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = enumC0672Je.A02();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iCeil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
