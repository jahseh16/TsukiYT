package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O2 extends LinearLayout {
    public static String[] A05 = {"JiUd07qZ", "phaLMHqUBlp6P5RZzzm", "VtPMRXbuUkVLmtGCwM", "RgvNiIo52t", "FYi9K2JmgPw1hqWSXD3EPgcEPQmLRiB", "yPPKnDMDveXTdnfoUUkFxo3t2NtgVDwK", "Cr", "5lHXxybE2bQiDNmNKuHItJ8Sueck67l"};
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public O2(C1064Yn c1064Yn, C1P c1p, int i) {
        super(c1064Yn);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f3 = LD.A02;
        int i5 = (int) (8.0f * f3);
        int i8 = (int) (6.0f * f3);
        this.A02 = (int) (1.0f * f3);
        int iA04 = c1p.A04(false);
        this.A04 = iA04;
        this.A03 = AbstractC02802p.A01(iA04, 128);
        this.A01 = new ArrayList();
        for (int margin = 0; margin < i; margin++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i5, i5);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c1064Yn);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i8, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i) {
        int i5;
        int i8;
        if (this.A00 == i) {
            return;
        }
        this.A00 = i;
        if (A05[2].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[4] = "BJqXxH8n0fuaHx3JVwGHjWVcPjmBGjI";
        strArr[7] = "ZUGfW6Md7SIL60yz7Eq8Bq3LU56iFcm";
        for (int i10 = 0; i10 < this.A01.size(); i10++) {
            if (i10 == i) {
                i5 = this.A04;
                i8 = this.A04;
            } else {
                i5 = this.A03;
                i8 = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i10);
            int bgColor = this.A02;
            gradientDrawable.setStroke(bgColor, i8);
            this.A01.get(i10).setColor(i5);
            this.A01.get(i10).invalidateSelf();
        }
    }
}
