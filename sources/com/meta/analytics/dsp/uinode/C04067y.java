package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04067y {
    public static byte[] A03;
    public final String A00;
    public final String A01;
    public final Map<String, String> A02;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-119, -77, -55, -57, -37, -51, -50, -38, -59, -53, -34, -55, -53, -42, -38, -49, -43, -44, 59, 60, 41, 43, 51, 60, 58, 41, 43, 45};
    }

    public C04067y(String str, Map<String, String> mStaticEnvironmentData) {
        this(str, mStaticEnvironmentData, false);
    }

    public C04067y(String str, Map<String, String> map, boolean z) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = z ? A00(1, 1, 50) : A00(0, 1, 9);
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap();
        map.put(A00(18, 10, 120), this.A01);
        map.put(A00(2, 16, 22), this.A00);
        Map<String, String> data = this.A02;
        map.putAll(data);
        return map;
    }
}
