package com.meta.analytics.dsp.uinode;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LM {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 46, 36, 49, 36, 43, 36};
    }

    public static PackageInfo A00(C03927f c03927f) {
        return A01(c03927f, A02(0, 19, 59));
    }

    public static PackageInfo A01(C03927f c03927f, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = c03927f.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(C03927f c03927f, String str) {
        PackageInfo packageInfo = A01(c03927f, str);
        return packageInfo != null;
    }
}
