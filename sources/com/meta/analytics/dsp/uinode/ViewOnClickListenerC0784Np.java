package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0784Np implements View.OnClickListener {
    public static String[] A01 = {"itOWPxSAafQZkTcpSE", "P8wVkr4WQB2iTQj27U1zAKNwbIgp5ttm", "3fifleoLwZA9ZUHROlHUKOtdLR5u4T8w", "3T74ydaV22", "9uWerCzeZ8xawRpMyxj77IpYV", "ULhUZegm5nSDnYs3Ds4NwOgfcNiZFAvv", "CnafhHPdNyHtxs0BoCQt5IwpL7l3OIL1", "MX4uPfGpQbRpYZ87lJTfxvNpA"};
    public final /* synthetic */ C0938Tn A00;

    public ViewOnClickListenerC0784Np(C0938Tn c0938Tn) {
        this.A00 = c0938Tn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "eKgsbHFhDVYlHC4UrNgZgZ37z";
            strArr2[4] = "vADQv3Fh0d5p8ZODn5ENkbcNb";
            KL.A00(th, this);
        }
    }
}
