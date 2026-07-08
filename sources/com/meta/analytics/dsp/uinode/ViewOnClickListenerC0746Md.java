package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0746Md implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ UA A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public ViewOnClickListenerC0746Md(UA ua2) {
        this.A00 = ua2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A06.A43(A00(0, 15, 9));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
