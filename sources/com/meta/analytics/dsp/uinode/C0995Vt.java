package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0995Vt extends H4 {
    public static byte[] A01;
    public final String A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{120, -99, -91, -112, -101, -104, -109, 79, -110, -98, -99, -93, -108, -99, -93, 79, -93, -88, -97, -108, 105, 79};
    }

    public C0995Vt(String str, C0619Gy c0619Gy) {
        super(A00(0, 22, 24) + str, c0619Gy, 1);
        this.A00 = str;
    }
}
