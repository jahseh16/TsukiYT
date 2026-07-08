package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0931Tg extends OL implements OE {
    public static byte[] A08;
    public static String[] A09 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public LX A00;
    public KI A01;
    public KA A02;
    public final AbstractC1167b5 A03;
    public final C1G A04;
    public final MC A05;
    public final AbstractC0783No A06;
    public final OG A07;

    public static String A0C(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A08 = new byte[]{9, 5, 7, 68, 12, 11, 9, 15, 8, 5, 5, 1, 68, 11, 14, 25, 68, 3, 4, 30, 15, 24, 25, 30, 3, 30, 3, 11, 6, 68, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0D();
        A0D = (int) (LD.A02 * 48.0f);
        A0H = (int) (LD.A02 * 16.0f);
        A0A = (int) (LD.A02 * 4.0f);
        A0G = (int) (LD.A02 * 44.0f);
        A0E = (int) (LD.A02 * 8.0f);
        A0F = (int) (LD.A02 * 12.0f);
        A0J = (int) (LD.A02 * 12.0f);
        A0I = (int) (LD.A02 * 26.0f);
        int iA01 = AbstractC02802p.A01(-1, 77);
        A0B = iA01;
        A0C = AbstractC02802p.A01(iA01, 90);
    }

    public AbstractC0931Tg(OP op, boolean z) {
        super(op, z);
        AbstractC1167b5 abstractC1167b5A04 = op.A04();
        this.A03 = abstractC1167b5A04;
        this.A07 = OG.A01(op.A05(), abstractC1167b5A04, this);
        this.A04 = abstractC1167b5A04.A0x();
        this.A06 = A0B(op);
        MB mbA08 = op.A08();
        this.A05 = op.A09();
        if (mbA08 != null) {
            mbA08.setLayoutParams(new RelativeLayout.LayoutParams(-1, mbA08.getToolbarHeight()));
            mbA08.setPageDetailsVisible(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meta.analytics.dsp.uinode.C0932Th A0B(com.meta.analytics.dsp.uinode.OP r19) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC0931Tg.A0B(com.facebook.ads.redexgen.X.OP):com.facebook.ads.redexgen.X.Th");
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public void A0v() {
        super.A0v();
        this.A07.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public void A10(C1G c1g, String str, double d4, Bundle bundle) {
        super.A10(c1g, str, d4, bundle);
        this.A06.setInfo(c1g.A0E(), c1g.A0F(), str, this.A03.A10().A01(), null);
    }

    public final int A13(MB mb2) {
        return mb2 == null ? MB.A00 : mb2.getToolbarHeight();
    }

    public void A14() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            LX lx = new LX(true);
            this.A00 = lx;
            KI ki = this.A01;
            if (ki != null) {
                lx.A0I(ki);
            }
            C1P c1pA01 = this.A03.A0w().A01();
            this.A00.A0I(new KC(getAdDetailsView().getCTAButton(), 300, -1, c1pA01.A09(true)));
            int i = A0B;
            int i5 = A0C;
            int i8 = A0A;
            Drawable drawableA08 = AbstractC0731Lo.A08(i, i5, i8);
            Drawable startDrawable = AbstractC0731Lo.A05(c1pA01.A08(true), i8);
            this.A00.A0I(new KM(getAdDetailsView().getCTAButton(), 300, drawableA08, startDrawable));
            this.A00.A0I(new KF(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OE
    public final void AC9() {
        this.A05.A43(getAdDataBundle().A0L());
    }

    public AbstractC1167b5 getAdDataBundle() {
        return this.A03;
    }

    public KA getAdDetailsAnimation() {
        return this.A02;
    }

    public AbstractC0783No getAdDetailsView() {
        return this.A06;
    }

    public C1G getAdInfo() {
        return this.A04;
    }

    public LX getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.OL, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0A(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        KI ki = this.A01;
        if (A09[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A09[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (ki == null) {
            KI ki2 = new KI(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A01 = ki2;
            this.A00.A0I(ki2);
            this.A00.A0G();
        }
    }
}
