package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC02621x {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{59, 58, 36, 55, 33, 38, 60, 45, 47, 58, 41, 60, 33, 39, 38, 55, 45, 58, 58, 39, 58, 55, 37, 39, 44, 45, 55, 35, 45, 49};
    }

    public static AdSettings.IntegrationErrorMode A00(C1064Yn c1064Yn) {
        AdSettings.IntegrationErrorMode serializable = AdInternalSettings.sSettingsBundle.getSerializable(A01(0, 30, 95));
        if (serializable == null) {
            serializable = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        }
        AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        if (serializable == integrationErrorMode && !A03(c1064Yn)) {
            return AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE;
        }
        return serializable;
    }

    public static boolean A03(C1064Yn c1064Yn) {
        return (c1064Yn.getApplicationInfo().flags & 2) != 0;
    }
}
