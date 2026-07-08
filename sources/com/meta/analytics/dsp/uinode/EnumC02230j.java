package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC02230j {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{37, 34, 63, 56, 45, 32, 32, 41, 40, 37, 36, 37, 46, 101, 100, 127, 116, 98, 101, 120, 127, 106, 103, 103, 110, 111};
    }

    static {
        A02();
    }

    public static EnumC02230j A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return A03;
        }
    }
}
