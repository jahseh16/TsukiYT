package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0789Nu extends RelativeLayout {
    public static String[] A06 = {"GfXFZtEZk1NZfob7Kzf1xTq0EESlD7si", "ewzI1iE8tF5Z2B86REyPWWZDw7DKLBH9", "kOyZSgqEibXIKTIW7tLvn8rBuxcmsyDd", "XpDxTY", "v6DhXkGtrQWw75h", "XA27k4WXBENWs2k6KViFhCSGxV0pMN8g", "cLUj8uWE8C4NOcjwK2waVMiWyPuWQVsm", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING};
    public final int A00;
    public final LinearLayout A01;
    public final C1165b3 A02;
    public final C1064Yn A03;
    public final J2 A04;
    public final MC A05;

    public C0789Nu(C1064Yn c1064Yn, C1165b3 c1165b3, J2 j22, MC mc, int i, int i5) {
        super(c1064Yn);
        this.A03 = c1064Yn;
        this.A02 = c1165b3;
        this.A04 = j22;
        this.A05 = mc;
        this.A00 = i;
        LinearLayout linearLayout = new LinearLayout(c1064Yn);
        this.A01 = linearLayout;
        A00();
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i5);
    }

    private void A00() {
        int i = 0;
        while (true) {
            C1165b3 c1165b3 = this.A02;
            if (A06[4].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "6kBjYVyQvbEVjVKJKeawSG2VEKMXDcJL";
            strArr[5] = "aQimcOJmMOk7TFcbK4Cqi1kaRliNN4Qj";
            int i5 = c1165b3.A0s();
            if (i < i5) {
                C0940Tp c0940Tp = new C0940Tp(this.A03, this.A02.A0v(i), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i8 = C0940Tp.A0B;
                int i10 = C0940Tp.A0B;
                int i11 = C0940Tp.A0B;
                int i12 = C0940Tp.A0B;
                layoutParams.setMargins(i8, i10, i11, i12);
                c0940Tp.setLayoutParams(layoutParams);
                this.A01.addView(c0940Tp);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i) {
        if (i != 1) {
            this.A01.setOrientation(0);
            LinearLayout linearLayout = this.A01;
            int i5 = this.A00;
            linearLayout.setPadding(0, i5, 0, (int) (((double) i5) * 0.25d));
            return;
        }
        this.A01.setOrientation(1);
        LinearLayout linearLayout2 = this.A01;
        int i8 = this.A00;
        linearLayout2.setPadding(0, (int) (((double) i8) * 1.5d), 0, i8);
    }
}
