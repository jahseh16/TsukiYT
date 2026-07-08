package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Q6 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ SM A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{21, 30, 20, 19, 17, 34, 20, 35};
    }

    public Q6(SM sm) {
        this.A00 = sm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 == null) {
                return;
            }
            this.A00.A02.A09(A00(0, 8, 65));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
