package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03726f {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-120, -90, -88, -83, -86, 101, -87, -82, -72, -80, 101, -85, -90, -82, -79, -70, -73, -86, 115, -63, -33, -31, -26, -29, -98, -30, -25, -15, -23, -98, -15, -13, -31, -31, -29, -15, -15, -84, -63, -33, -31, -26, -29, -98, -30, -19, -11, -20, -22, -19, -33, -30, -98, -28, -33, -25, -22, -13, -16, -29, -84, -127, -97, -95, -90, -93, 94, -90, -89, -78, 108, -72, -42, -40, -35, -38, -107, -30, -34, -24, -24, -93, -83, -80, -85, -81, -66, -79, -83, -64, -75, -62, -79, -85, -65, -75, -58, -79, -85, -82, -59, -64, -79, -65, -55, -52, -57, -53, -38, -51, -55, -36, -47, -34, -51, -57, -36, -31, -40, -51, -95, -92, -97, -90, -81, -78, -83, -95, -76, -97, -76, -71, -80, -91, 21, 24, 19, 38, 25, 37, 41, 25, 39, 40, 19, 29, 24, -79, -60, -60, -75, -67, -64, -60, -78, -80, -78, -73, -76, 24, 22, 24, 29, 26, 20, 24, 36, 35, 41, 26, 45, 41, -50, -55, -47, -44, -35, -38, -51, -57, -38, -51, -55, -37, -41, -42, 22, 26, 14, 20, 18, 11, 14, 0, 3, -2, 19, 8, 12, 4, 5, 2, -4};
    }

    static {
        A01();
        A09 = C03726f.class.getSimpleName();
        A05 = C8A.A0o;
        A06 = C8A.A0s;
        A02 = C8A.A0l;
        A01 = C8A.A0k;
        A03 = C8A.A0m;
        A00 = C8A.A0i;
        A04 = C8A.A0n;
        A07 = C8A.A0t;
    }

    public static void A02(C03927f c03927f, C6V c6v, int i, String str, long j) {
        if (!A06(c03927f)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c6v.A01);
            jSONObject.put(A00(134, 13, 118), c6v.A02);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 97), C0722Lf.A06(System.currentTimeMillis() - j));
            }
            C8B c8b = new C8B(str);
            c8b.A07(jSONObject);
            c8b.A05(1);
            c03927f.A07().A9b(A00(154, 5, 17), i, c8b);
        } catch (Throwable deLogException) {
            c03927f.A07().A3c(deLogException);
        }
    }

    public static void A03(C03927f c03927f, C03676a c03676a, String str, int i, String str2, Long l3, Long l4) {
        if (A06(c03927f)) {
            A05(c03927f, c03676a.A05, c03676a.A06, c03676a.A07, A00(186, 5, 111), str, i, str2, l3, l4, null);
        }
    }

    public static void A04(C03927f c03927f, C03716e c03716e, boolean z) {
        if (!A06(c03927f)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c03716e.A01);
            jSONObject.put(A00(134, 13, 118), c03716e.A03);
            jSONObject.put(A00(104, 16, 42), c03716e.A02);
            jSONObject.put(A00(159, 13, 119), c03716e.A00);
            if (C0653Ih.A1z(c03927f)) {
                jSONObject.put(A00(200, 3, 82), c03716e.A04);
            }
            String strA00 = z ? A00(61, 10, 0) : A00(71, 11, 55);
            int i = z ? A05 : A06;
            C8B c8b = new C8B(strA00);
            c8b.A07(jSONObject);
            c8b.A05(1);
            c03927f.A07().A9b(A00(154, 5, 17), i, c8b);
        } catch (Throwable th) {
            c03927f.A07().A3c(th);
        }
    }

    public static void A05(C03927f c03927f, String str, String str2, String str3, String str4, String str5, int i, String str6, Long l3, Long l4, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), str);
            jSONObject.put(A00(134, 13, 118), str2);
            jSONObject.put(A00(104, 16, 42), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 42), str6);
            }
            if (l3 != null) {
                jSONObject.put(A00(82, 22, 14), String.valueOf(l3));
            }
            if (l4 != null) {
                jSONObject.put(A00(191, 9, 97), String.valueOf(l4));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 18), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 119), str5);
            if (C0653Ih.A1z(c03927f)) {
                jSONObject.put(A00(200, 3, 82), str3);
            }
            String strA00 = A00(19, 19, 64);
            if (i == A03) {
                strA00 = A00(38, 23, 64);
            } else if (i == A01) {
                strA00 = A00(0, 19, 7);
            }
            C8B c8b = new C8B(strA00);
            c8b.A07(jSONObject);
            c8b.A05(1);
            c03927f.A07().A9b(A00(154, 5, 17), i, c8b);
        } catch (Throwable th) {
            c03927f.A07().A3c(th);
        }
    }

    public static boolean A06(C03927f c03927f) {
        int iA06;
        if (c03927f.A04().A8z()) {
            iA06 = 1;
        } else {
            iA06 = Ij.A06(c03927f);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || c03927f.A08().A00() <= 1.0d / ((double) iA06);
    }
}
