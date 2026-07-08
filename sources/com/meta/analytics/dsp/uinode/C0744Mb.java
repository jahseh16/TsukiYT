package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0744Mb extends LinearLayout {
    public static String[] A07 = {"RdKbZKE5ShqjtspsYuId0BpVT", "jFs6Ox2yxsj", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "O0DGVMIkWcl", "ZjYxtVw01iwSMNXN0b17Jtyc9gHU9Z2d", "b1LSaO6GQJOSELIr8C99", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "wukZGaaSm"};
    public static final int A08 = (int) (LD.A02 * 15.0f);
    public static final int A09 = (int) (LD.A02 * 10.0f);
    public static final int A0A = (int) (LD.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final C1064Yn A05;
    public final C0788Nt A06;

    public C0744Mb(C1064Yn c1064Yn, int i) {
        super(c1064Yn);
        this.A01 = false;
        this.A05 = c1064Yn;
        ImageView imageView = new ImageView(c1064Yn);
        this.A02 = imageView;
        int i5 = A09;
        imageView.setPadding(i5, i5, i5, i5);
        C0788Nt c0788Nt = new C0788Nt(c1064Yn);
        this.A06 = c0788Nt;
        c0788Nt.setProgress(0.0f);
        c0788Nt.setPadding(i5, i5, i5, i5);
        this.A04 = new TextView(c1064Yn);
        setOrientation(0);
        this.A03 = new LinearLayout(c1064Yn);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i = A0A;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        AbstractC0731Lo.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams2);
        this.A03.addView(this.A06, layoutParams2);
        addView(this.A03, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A04, actionTextLayoutParams);
    }

    private void A01() {
        int i;
        C0788Nt c0788Nt = this.A06;
        int i5 = this.A00;
        int i8 = 8;
        if (i5 == 2 || i5 == 6) {
            i = this.A01 ? 4 : 0;
        } else {
            i = 8;
        }
        c0788Nt.setVisibility(i);
        ImageView imageView = this.A02;
        int i10 = this.A00;
        if (i10 == 5) {
            i8 = 4;
        } else if (i10 != 2 && i10 != 6) {
            i8 = 0;
        }
        imageView.setVisibility(i8);
    }

    public final void A02(C1P c1p, boolean z, boolean z5) {
        int iA04 = c1p.A04(z);
        C0788Nt c0788Nt = this.A06;
        int accentColor = AbstractC02802p.A01(iA04, 77);
        c0788Nt.A02(accentColor, iA04, 110);
        this.A02.setColorFilter(iA04);
        if (z5) {
            TextView textView = this.A04;
            int accentColor2 = AbstractC02802p.A01(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A04.setTextColor(iA04);
    }

    public final boolean A03() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A04() {
        int i = this.A00;
        return (i == 2 || i == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f3) {
        this.A06.setProgressWithAnimation(f3);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public void setProgressImage(EnumC0739Lw enumC0739Lw) {
        this.A06.setImage(enumC0739Lw);
    }

    public void setProgressImmediate(float f3) {
        this.A06.clearAnimation();
        this.A06.setProgress(f3);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i) {
        EnumC0739Lw enumC0739Lw;
        this.A05.A0E().ADK(i);
        this.A00 = i;
        A01();
        setVisibility(0);
        if (Build.VERSION.SDK_INT >= 16) {
            this.A02.setImageAlpha(255);
        }
        ImageView imageView = this.A02;
        int i5 = A09;
        imageView.setPadding(i5, i5, i5, i5);
        switch (i) {
            case 0:
                enumC0739Lw = EnumC0739Lw.CROSS;
                break;
            case 1:
                enumC0739Lw = EnumC0739Lw.SKIP_ARROW;
                break;
            case 2:
            default:
                enumC0739Lw = EnumC0739Lw.CROSS;
                break;
            case 3:
                enumC0739Lw = EnumC0739Lw.MINIMIZE_ARROW;
                break;
            case 4:
                enumC0739Lw = EnumC0739Lw.CROSS;
                this.A02.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                enumC0739Lw = EnumC0739Lw.CROSS;
                break;
            case 6:
                enumC0739Lw = EnumC0739Lw.CROSS;
                break;
            case 7:
                enumC0739Lw = EnumC0739Lw.CROSS;
                if (Build.VERSION.SDK_INT >= 16) {
                    this.A02.setImageAlpha(110);
                }
                ImageView imageView2 = this.A02;
                if (A07[4].charAt(13) == 'C') {
                    throw new RuntimeException();
                }
                String[] strArr = A07;
                strArr[6] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
                strArr[2] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
                int i8 = A08;
                imageView2.setPadding(i8, i8, i8, i8);
                break;
                break;
        }
        this.A02.setImageBitmap(AbstractC0740Lx.A01(enumC0739Lw));
        if (i == 1) {
            AbstractC0731Lo.A0G(1005, this.A02);
        } else {
            AbstractC0731Lo.A0G(1002, this.A02);
        }
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A04.setVisibility(z ? 0 : 4);
    }
}
