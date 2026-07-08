package com.meta.analytics.dsp.uinode;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04017s {
    public static byte[] A01;
    public static String[] A02 = {"HVKZvR5UTjStDLOL9o4rPessbKuh0O7V", "lcBs6IulTDBXs0xMNwr7074HBb5CT680", "pp9", "08Pk9qbigTz1ItVQ0hAeiWjKqsV0Kke0", "IZPR1WSW", "qkmVdqnPN26Te8aFuQlNVKOt05q5LyYY", "adXBxD3OrJvPB32QQ8w", "pvdflY6bA4nr3ZgRZtp7kAtC3Qj6GBkc"};
    public final C03987o A00;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{121, -127, 123, -104, 123, -102, -86, -48, -36, -39, -41, -86, -44, 11, -4, -7, 6, -7, -44, -108, -118, 126, -126, -111, -124, -128, -109, -124, 95, -109, -128, -127, -117, -124, 95, -95, -81, -84, -83, 125, -79, -98, -97, -87, -94, 125, -90, -93, 125, -94, -75, -90, -80, -79, -80, 125, -8, -22, -15, -22, -24, -7, -59};
    }

    public abstract String A06();

    public abstract C03977m[] A0A();

    static {
        A04();
    }

    public AbstractC04017s(C03987o c03987o) {
        this.A00 = c03987o;
    }

    private String A00() {
        C03977m[] c03977mArrA0A = A0A();
        if (c03977mArrA0A.length < 1) {
            if (A02[4].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "NTtbWHu0RetWI6yxki67w6X3knWPKgwD";
            strArr[1] = "wg0AU135P1OwlpIQrYrtBV6UQnwqkPhP";
            return null;
        }
        String result = A01(0, 0, 31);
        for (int i = 0; i < c03977mArrA0A.length - 1; i++) {
            result = result + c03977mArrA0A[i].A02() + A01(20, 2, 35);
        }
        return result + c03977mArrA0A[c03977mArrA0A.length - 1].A02();
    }

    public static String A02(String str, C03977m[] c03977mArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, 106));
        for (int i = 0; i < c03977mArr.length - 1; i++) {
            sb.append(c03977mArr[i].A01);
            int i5 = A02[2].length();
            if (i5 != 3) {
                throw new RuntimeException();
            }
            A02[4] = "CXWyM2Ol";
            sb.append(A01(20, 2, 35));
        }
        sb.append(c03977mArr[c03977mArr.length - 1].A01);
        sb.append(A01(6, 6, 79));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, C03977m[] c03977mArr, C03977m c03977m) {
        return A02(str, c03977mArr) + A01(12, 7, 121) + c03977m.A01 + A01(2, 4, 32);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 4) + A06() + A01(0, 2, 30) + A00() + A01(19, 1, 48));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 34) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
