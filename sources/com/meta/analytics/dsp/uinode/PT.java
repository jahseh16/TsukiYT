package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PT implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0922Sx A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 73);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{30, 33, 33, 34, 49, 30, 38, 41, 48};
    }

    public PT(C0922Sx c0922Sx) {
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
            this.A00.A0H.A02(A00(0, 9, 116));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
