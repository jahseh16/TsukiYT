package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC02200g {
    A08,
    A03,
    A04,
    A09,
    A02,
    A07,
    A06,
    A05;

    public static byte[] A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-27, -12, -12, 3, -9, -8, -13, -10, -23, -6, -8, 5, 5, 6, 11, 22, 6, 7, -4, 5, -7, -9, 4, 4, 5, 10, 21, 10, 8, -9, -7, 1, -60, -46, -49, -48, -48, -59, -60, 7, 26, 22, 7, 20, 16, 3, 14, 33, 4, 20, 17, 25, 21, 7, 20, 16, 8, 9, 5, 6, 5, -4, -56, -69, -70, -65, -56, -69, -71, -54, -43, -54, -59, -43, -73, -58, -58};
    }

    static {
        A01();
    }

    public static boolean A02(EnumC02200g enumC02200g) {
        return A03.equals(enumC02200g) || A04.equals(enumC02200g);
    }
}
