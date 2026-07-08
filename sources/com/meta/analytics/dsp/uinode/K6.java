package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum K6 {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-6, -3, 12, -95, -82, -82, -85, -82, -77, -84, -87, -84, -83, -75, -84};
    }

    static {
        A01();
    }
}
