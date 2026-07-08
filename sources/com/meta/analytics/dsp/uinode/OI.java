package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OI {
    public static float A00(C1G c1g) {
        int height = c1g.A0D().A01();
        int width = c1g.A0D().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d4) {
        int availableWidth = (int) (((double) (LC.A00().widthPixels - (OL.A07 * 2))) / d4);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = AbstractC0731Lo.A01(16);
        int ctaTextHeight = AbstractC0790Nv.A0A;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = OL.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = LC.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static OH A03(ViewOnClickListenerC0936Tl viewOnClickListenerC0936Tl, String str) {
        return new OH(viewOnClickListenerC0936Tl, str);
    }

    public static boolean A04(double d4) {
        return d4 < 0.9d;
    }

    public static boolean A05(double d4, int i) {
        return A02(i) < A01(d4);
    }

    public static boolean A06(int i, int i5, double d4) {
        return i == 2 || A05(d4, i5);
    }
}
