package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0710Kt extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-44, -4, -4, -12, -7, -14, -83, -35, -7, -18, 6, -83, -10, 0, -83, -5, -4, 1, -83, -10, -5, 0, 1, -18, -7, -7, -14, -15};
    }

    public C0710Kt() {
        super(A00(0, 28, 37));
    }
}
