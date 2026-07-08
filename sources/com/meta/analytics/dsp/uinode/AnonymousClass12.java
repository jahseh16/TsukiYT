package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.12, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AnonymousClass12 {
    A03(A00(13, 3, 1)),
    A05(A00(22, 4, 3)),
    A04(A00(16, 6, 82));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, -119, -119, -38, -50, -37, -30, -50, -39, -71, -70, -71, -80, -105, -94, -94, -12, -24, -11, -4, -24, -13, -90, -89, -90, -99};
    }

    static {
        A01();
    }

    AnonymousClass12(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
