package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PU implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0922Sx A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 50, 50, 49, 63, 60, 47};
    }

    public PU(C0922Sx c0922Sx) {
        this.A00 = c0922Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0K) {
                return;
            }
            this.A00.A0H.A02(A00(0, 7, 124));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
