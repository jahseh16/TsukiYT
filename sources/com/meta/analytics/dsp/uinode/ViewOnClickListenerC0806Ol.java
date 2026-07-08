package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0806Ol implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TT A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 50, 50, 49, 63, 60, 47};
    }

    public ViewOnClickListenerC0806Ol(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0O) {
                return;
            }
            this.A00.A0M.A02(A00(0, 7, 95));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
