package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0994Vs extends H4 {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{48, 7, 17, 18, 13, 12, 17, 7, 66, 1, 13, 6, 7, 88, 66};
    }

    public C0994Vs(int i, Map<String, List<String>> map, C0619Gy c0619Gy) {
        super(A00(0, 15, 121) + i, c0619Gy, 1);
        this.A00 = i;
        this.A01 = map;
    }
}
