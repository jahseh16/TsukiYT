package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M5 {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{100, -105, -126, -124, -113, -109, -120, -114, -115, 63, -120, -115, 63, -110, -126, -111, -124, -124, -115, 63, -120, -115, -109, -124, -111, -128, -126, -109, -120, -107, -124, 63, -126, -121, -124, -126, -118, 75, 63, -128, -110, -110, -108, -116, -120, -115, -122, 63, -120, -115, -109, -124, -111, -128, -126, -109, -120, -107, -124, 77, -103, -104, -96, -114, -101, -46, -55, -45, -53, -39};
    }

    static {
        A01();
        A01 = M5.class.getSimpleName();
    }

    public static boolean A02(C1064Yn c1064Yn) {
        return A03(c1064Yn) && M6.A03(c1064Yn);
    }

    public static boolean A03(C1064Yn c1064Yn) {
        if (c1064Yn == null) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) c1064Yn.getSystemService(A00(60, 5, 18));
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (Exception e4) {
            Log.e(A01, A00(0, 60, 8), e4);
            c1064Yn.A07().A9a(A00(65, 5, 73), C8A.A2S, new C8B(e4));
            return true;
        }
    }
}
