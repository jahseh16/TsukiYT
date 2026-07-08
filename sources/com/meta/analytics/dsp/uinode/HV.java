package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class HV {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{64, 93, 74, 122, 73, 64, 75, 10, 23, 0, 48, 29, 10, 11, 6, 29};
    }

    public static long A00(HU hu) {
        return hu.A5p(A02(0, 7, 70), -1L);
    }

    public static Uri A01(HU hu) {
        String strA5r = hu.A5r(A02(7, 9, 12), null);
        if (strA5r == null) {
            return null;
        }
        return Uri.parse(strA5r);
    }

    public static void A04(HW hw2) {
        hw2.A01(A02(7, 9, 12));
    }

    public static void A05(HW hw2, long j) {
        hw2.A02(A02(0, 7, 70), j);
    }

    public static void A06(HW hw2, Uri uri) {
        hw2.A03(A02(7, 9, 12), uri.toString());
    }
}
