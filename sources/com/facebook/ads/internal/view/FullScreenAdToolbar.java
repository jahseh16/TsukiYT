package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meta.analytics.dsp.uinode.AbstractC0731Lo;
import com.meta.analytics.dsp.uinode.C02391a;
import com.meta.analytics.dsp.uinode.C02451g;
import com.meta.analytics.dsp.uinode.C0744Mb;
import com.meta.analytics.dsp.uinode.C0835Po;
import com.meta.analytics.dsp.uinode.C1064Yn;
import com.meta.analytics.dsp.uinode.C1P;
import com.meta.analytics.dsp.uinode.EnumC0739Lw;
import com.meta.analytics.dsp.uinode.JA;
import com.meta.analytics.dsp.uinode.LD;
import com.meta.analytics.dsp.uinode.M9;
import com.meta.analytics.dsp.uinode.MA;
import com.meta.analytics.dsp.uinode.MB;
import com.meta.analytics.dsp.uinode.MC;
import com.meta.analytics.dsp.uinode.ML;
import com.meta.analytics.dsp.uinode.OI;
import com.meta.analytics.dsp.uinode.ViewOnClickListenerC0936Tl;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends MB {
    public static byte[] A09;
    public static String[] A0A = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public M9 A00;
    public MA A01;
    public MA A02;
    public boolean A03;
    public final RelativeLayout A04;
    public final JA A05;
    public final MC A06;
    public final C0744Mb A07;
    public final C0835Po A08;

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74, 77, 72, 72, 69, 59, 58, 75};
    }

    static {
        A03();
        int i = (int) (LD.A02 * 10.0f);
        A0B = i;
        int i5 = (int) (LD.A02 * 16.0f);
        A0F = i5;
        A0D = i5 - i;
        A0E = (i5 * 2) - i;
        A0C = (int) (LD.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1064Yn c1064Yn, MC mc, JA ja, int i) {
        super(c1064Yn);
        this.A01 = null;
        this.A03 = true;
        this.A06 = mc;
        this.A05 = ja;
        setGravity(16);
        C0744Mb c0744Mb = new C0744Mb(c1064Yn, i);
        this.A07 = c0744Mb;
        c0744Mb.setContentDescription(A02(0, 8, 50));
        c0744Mb.setActionClickListener(new ML(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i5 = A0D;
        layoutParams.setMargins(i5, i5, A0E, i5);
        addView(c0744Mb, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(c1064Yn);
        this.A04 = relativeLayout;
        LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(0, -2);
        containerParams.weight = 1.0f;
        C0835Po c0835Po = new C0835Po(c1064Yn);
        this.A08 = c0835Po;
        AbstractC0731Lo.A0G(1006, c0835Po);
        LinearLayout.LayoutParams toolbarActionViewParams = new LinearLayout.LayoutParams(-2, -2);
        toolbarActionViewParams.gravity = 17;
        c0835Po.setLayoutParams(toolbarActionViewParams);
        relativeLayout.addView(c0835Po);
        addView(relativeLayout, containerParams);
    }

    public FullScreenAdToolbar(C1064Yn c1064Yn, MC mc, JA ja, int i, int i5) {
        this(c1064Yn, mc, ja, i);
        A09(c1064Yn, i5);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A04() {
        MA ma = this.A01;
        if (ma != null) {
            this.A02 = ma;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A05() {
        this.A01 = getToolbarListener();
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A06(C1P c1p, boolean z) {
        boolean z5 = this.A03;
        int iA04 = c1p.A04(z5);
        this.A08.A02(c1p.A0A(z5), iA04);
        this.A00.setIconColors(iA04);
        this.A00.setContentDescription(A02(8, 9, 117));
        this.A07.A02(c1p, z5, z);
        if (z5) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            AbstractC0731Lo.A0S(this, gradientDrawable);
            AbstractC0731Lo.A0Q(this.A00, 0, -16777216, A0C);
            return;
        }
        AbstractC0731Lo.A0M(this, 0);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final boolean A07() {
        return this.A07.A03();
    }

    public final void A08(C02391a c02391a, String str, int i) {
        this.A07.setInitialUnskippableSeconds(i);
        M9 m9 = this.A00;
        if (m9 != null) {
            m9.setAdDetails(c02391a, str, this.A05, this.A06);
        }
    }

    public final void A09(C1064Yn c1064Yn, int i) {
        M9 m9 = this.A00;
        if (m9 != null) {
            AbstractC0731Lo.A0J(m9);
            this.A00.removeAllViews();
        }
        this.A00 = new M9(c1064Yn, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int i5 = A0F;
        layoutParams.setMargins(0, i5 / 2, i5 / 2, i5 / 2);
        addView(this.A00, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public View getDetailsContainer() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public int getToolbarActionMode() {
        return this.A07.getToolbarActionMode();
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public int getToolbarHeight() {
        return MB.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public MA getToolbarListener() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setAdReportingVisible(boolean z) {
        this.A00.setVisibility(z ? 0 : 8);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A08.setOnClickListener(onClickListener);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setCTAClickListener(ViewOnClickListenerC0936Tl viewOnClickListenerC0936Tl) {
        this.A08.setOnClickListener(OI.A03(viewOnClickListenerC0936Tl, A02(17, 7, 104)));
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setFullscreen(boolean z) {
        this.A03 = z;
    }

    public void setOnlyPageDetails(C02391a c02391a) {
        if (c02391a != null) {
            this.A08.setPageDetails(c02391a);
        } else {
            this.A08.A01();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setPageDetails(C02391a c02391a, String str, int i, C02451g c02451g) {
        this.A07.setInitialUnskippableSeconds(i);
        this.A08.setPageDetails(c02391a);
        M9 m9 = this.A00;
        if (m9 != null) {
            m9.setAdDetails(c02391a, str, this.A05, this.A06);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setPageDetailsVisible(boolean z) {
        this.A04.removeAllViews();
        if (z) {
            RelativeLayout relativeLayout = this.A04;
            C0835Po c0835Po = this.A08;
            if (A0A[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(c0835Po);
        }
        C0744Mb c0744Mb = this.A07;
        String[] strArr2 = A0A;
        if (strArr2[2].length() == strArr2[3].length()) {
            c0744Mb.setToolbarMessageEnabled(!z);
        } else {
            A0A[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
            c0744Mb.setToolbarMessageEnabled(!z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgress(float f3) {
        this.A07.setProgress(f3);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setProgressClickListener(onClickListener);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressImage(EnumC0739Lw enumC0739Lw) {
        this.A07.setProgressImage(enumC0739Lw);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressImmediate(float f3) {
        this.A07.setProgressImmediate(f3);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressSpinnerInvisible(boolean z) {
        this.A07.setProgressSpinnerInvisible(z);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarActionMessage(String str) {
        this.A07.setToolbarMessage(str);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarActionMode(int i) {
        this.A07.setToolbarActionMode(i);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarListener(MA ma) {
        this.A02 = ma;
    }
}
