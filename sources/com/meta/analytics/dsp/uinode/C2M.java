package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import com.facebook.ads.RewardData;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C2M {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-76, -71, -65, -54, -67, -63, -54, -67, -80, -62, -84, -67, -81, -54, -81, -84, -65, -84, -54, -68, -64, -84, -71, -65, -76, -65, -60, -54, -74, -80, -60, -112, -111, -113, -100, -113, -109, -100, -113, -126, -108, 126, -113, -127, -100, -127, 126, -111, 126, -100, -128, -110, -113, -113, -126, -117, -128, -106, -100, -120, -126, -106, -49, -48, -50, -37, -50, -46, -37, -50, -63, -45, -67, -50, -64, -37, -64, -67, -48, -67, -37, -59, -64, -37, -57, -63, -43};
    }

    public static Bundle A00(Bundle bundle, RewardData rewardData) {
        bundle.putString(A02(62, 25, 102), rewardData.getUserID());
        bundle.putString(A02(31, 31, 39), rewardData.getCurrency());
        bundle.putInt(A02(0, 31, 85), rewardData.getQuantity());
        return bundle;
    }

    public static RewardData A01(Bundle bundle) {
        String strA02 = A02(62, 25, 102);
        if (!bundle.containsKey(strA02)) {
            return null;
        }
        String string = bundle.getString(strA02);
        String id = A02(31, 31, 39);
        String string2 = bundle.getString(id);
        int i = bundle.getInt(A02(0, 31, 85), 0);
        String currency = A02(0, 0, 75);
        if (string == null) {
            string = currency;
        }
        if (string2 != null) {
            currency = string2;
        }
        return new RewardData(string, currency, i);
    }
}
