package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum L5 {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-68, -63, -68, -57, -68, -76, -65, -68, -51, -72, -73, -13, -8, -13, -2, -13, -21, -10, -13, 4, -13, -8, -15, 24, 25, 30, 41, 19, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    static {
        A01();
    }
}
