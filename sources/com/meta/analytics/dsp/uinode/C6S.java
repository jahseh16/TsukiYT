package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6S {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{45, 59, 16, 42, 55, 59, 61, 46, 60, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 33, 38, 60, 45, 58, 38, 41, 36, 102, 42, 60, 45, 48, 60, 58, 41, 59};
    }

    public static SharedPreferences A00(C03927f c03927f) {
        return c03927f.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 105), c03927f), 0);
    }

    public final String A03(C03927f c03927f) {
        return A00(c03927f).getString(A01(0, 9, 110), null);
    }

    public final void A04(C03927f c03927f, String str) {
        SharedPreferences btSP = A00(c03927f);
        btSP.edit().putString(A01(0, 9, 110), str).apply();
    }
}
