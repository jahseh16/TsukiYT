package com.meta.analytics.dsp.uinode;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC02802p {
    public static byte[] A00;
    public static String[] A01 = {"5xFyhJyAmXwpndJ9EoKqTFqqLI0O0t2g", "XKBE22ujheeLcTYagdBtfv4d5l35c1GL", "dLXeMiu6Rni", "1iBW7", "i8dAz", "3kaHypJVzQjnFbgNDhrnWnyYOdOCg92b", "E8vO87QQkuay4qK7aMyGFQLc0ZjeOzJS", "6MpCOYCclTS"};
    public static final ThreadLocal<double[]> A02;

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-104, -93, -89, -97, -104, 87, -92, -84, -86, -85, 87, -103, -100, 87, -103, -100, -85, -82, -100, -100, -91, 87, 103, 87, -104, -91, -101, 87, 105, 108, 108, 101, -59, -53, -54, -82, -49, -48, 118, -61, -53, -55, -54, 118, -66, -73, -52, -69, 118, -73, 118, -62, -69, -60, -67, -54, -66, 118, -59, -68, 118, -119, -124};
    }

    static {
        A04();
        A02 = new ThreadLocal<>();
    }

    public static double A00(int i) {
        double[] dArrA07 = A07();
        A06(i, dArrA07);
        return dArrA07[1] / 100.0d;
    }

    public static int A01(int i, int i5) {
        if (i5 >= 0) {
            String[] strArr = A01;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "QbRpT";
            strArr2[3] = "VTwjf";
            if (i5 <= 255) {
                return (16777215 & i) | (i5 << 24);
            }
        }
        throw new IllegalArgumentException(A03(0, 32, 3));
    }

    public static int A02(int i, int i5, float f3) {
        float f4 = 1.0f - f3;
        float inverseRatio = Color.alpha(i5);
        float g6 = (Color.alpha(i) * f4) + (inverseRatio * f3);
        float inverseRatio2 = Color.red(i5);
        float r3 = (Color.red(i) * f4) + (inverseRatio2 * f3);
        float a6 = Color.green(i);
        float inverseRatio3 = Color.green(i5);
        float a7 = (a6 * f4) + (inverseRatio3 * f3);
        float inverseRatio4 = Color.blue(i5);
        float b4 = (Color.blue(i) * f4) + (inverseRatio4 * f3);
        return Color.argb((int) g6, (int) r3, (int) a7, (int) b4);
    }

    public static void A05(int i, int i5, int i8, double[] dArr) {
        double sb;
        double sr;
        double sb2;
        if (dArr.length == 3) {
            double sb3 = ((double) i) / 255.0d;
            if (sb3 < 0.04045d) {
                sb = sb3 / 12.92d;
            } else {
                sb = Math.pow((sb3 + 0.055d) / 1.055d, 2.4d);
            }
            double sr2 = ((double) i5) / 255.0d;
            if (sr2 < 0.04045d) {
                sr = sr2 / 12.92d;
            } else {
                sr = Math.pow((sr2 + 0.055d) / 1.055d, 2.4d);
            }
            double sb4 = ((double) i8) / 255.0d;
            if (sb4 < 0.04045d) {
                sb2 = sb4 / 12.92d;
            } else {
                double sg2 = 0.055d + sb4;
                sb2 = Math.pow(sg2 / 1.055d, 2.4d);
            }
            double sg3 = 0.4124d * sb;
            dArr[0] = (sg3 + (0.3576d * sr) + (0.1805d * sb2)) * 100.0d;
            double sg4 = 0.2126d * sb;
            dArr[1] = (sg4 + (0.7152d * sr) + (0.0722d * sb2)) * 100.0d;
            double sg5 = 0.0193d * sb;
            dArr[2] = (sg5 + (0.1192d * sr) + (0.9505d * sb2)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(A03(32, 31, 34));
    }

    public static void A06(int i, double[] dArr) {
        A05(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static double[] A07() {
        ThreadLocal<double[]> threadLocal = A02;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
