package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum S6 {
    A03(A01(35, 4, 104)),
    A04(A01(39, 4, 113));

    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-99, -84, -93, -93, -22, 15, 23, 2, 13, 10, 5, -63, 20, 6, 19, 23, 6, 19, -63, 19, 6, 20, 17, 16, 15, 20, 6, -37, -63, -58, 20, -34, -40, -40, -29, 36, 51, 42, 42, 50, 44, 44, 55};
    }

    static {
        A02();
    }

    S6(String str) {
        this.A00 = str;
    }

    public static S6 A00(String str) {
        for (S6 s62 : values()) {
            if (s62.A00.equals(str)) {
                return s62;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 75), str));
    }
}
