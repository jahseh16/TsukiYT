package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OW implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0927Tc A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{107, 111, 99, 101, 103};
    }

    public OW(C0927Tc c0927Tc) {
        this.A00 = c0927Tc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 47));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
