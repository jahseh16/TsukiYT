package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0892Rt {
    A04(A01(37, 3, 86)),
    A05(A01(40, 7, 117));

    public static byte[] A01;
    public static String[] A02 = {"kIaQKGqX2ZTqEjvfJkZOl1WwOBoH9uFY", "x", "Fa9eXDyIy4elyWfec912IKE0nqoR5HQV", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "DfNaQJeOEpNPwVx", "9", "0vF5Kqqkw0y14nBhXHX4F0aBgr7OScbz", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING};
    public String A00;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{21, 23, 31, -34, 3, 11, -10, 1, -2, -7, -75, 8, -6, 7, 11, -6, 7, -75, 7, -6, 8, 5, 4, 3, 8, -6, -49, -75, -70, 8, -6, -13, -16, -13, -12, -4, -13, 29, 31, 39, 80, 73, 70, 73, 74, 82, 73};
    }

    static {
        A02();
    }

    EnumC0892Rt(String str) {
        this.A00 = str;
    }

    public static EnumC0892Rt A00(String str) {
        for (EnumC0892Rt enumC0892Rt : valuesCustom()) {
            if (enumC0892Rt.A00.equals(str)) {
                return enumC0892Rt;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 47), str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0892Rt[] valuesCustom() {
        EnumC0892Rt[] enumC0892RtArr = (EnumC0892Rt[]) values().clone();
        String[] strArr = A02;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        strArr2[3] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        return enumC0892RtArr;
    }
}
