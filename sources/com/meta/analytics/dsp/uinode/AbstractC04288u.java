package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04288u {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static C8w A00(C1063Ym c1063Ym) {
        try {
            return new YD(c1063Ym);
        } catch (IOException e4) {
            c1063Ym.A07().A9a(A02(0, 15, 89), C8A.A2K, new C8B(e4));
            return new YG();
        }
    }

    public static EN A01(C1063Ym c1063Ym) {
        return new EN(c1063Ym);
    }
}
