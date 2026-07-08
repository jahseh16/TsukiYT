package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0817Ow implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"MJZy3ru3ObFHqr", "IunSRocQz0vvNYqEQ6WXTBnuSQec0c7U", "iH4ooasOMZZ6EfnAKOxgPsEqW16lVkcC", "wQIWWSQp6aRcfY56FQGu2w3P9Sd9Rhog", "BeeZAa4D7z23VAiIiGM8IqY8zAew", "Zsw5t3FoKlBodSgf81TTJaZ87jgffbRR", "mBHzM8IKglqg77ZKWneYLvMdHmmr5BMp", "coiV8pY9OkYcSw3BWiptzGAPEmgTqyca"};
    public final /* synthetic */ B4 A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 64);
            String[] strArr = A02;
            if (strArr[3].charAt(0) == strArr[5].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "Zi88no4MMwuxGf1zzv2w2xAR9ETp";
            strArr2[0] = "yxj8C30kQopYdL";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-57, -70, -75, -74, -64};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC0817Ow(B4 b4) {
        this.A00 = b4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 17));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
