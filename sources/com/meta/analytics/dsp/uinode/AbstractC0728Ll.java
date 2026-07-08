package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.media.AudioManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0728Ll {
    public static byte[] A00;
    public static String[] A01 = {FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "SXw", "dejWMVKCcsRHbrwAIECa6aRABNrvRLL1", "Mpo", "dfeQdAe6W2quBxkeKKSlZfT5B8UcRWSp", "PPqjaOYWzYRlppBEr7ot7ueRFIAfsGXr", "QjvNArJcMH0SA20xehHAs5TxpNTDNPBN", "WLwkcjK3klW5xWY"};

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-8, -44, -40, -20, -37, -32, -26, -35, -15, -16, -21, -20, -24, -35, -11, -1, 4, 2, -1, 4, -5};
    }

    static {
        A02();
    }

    public static float A00(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(A01(2, 5, 39));
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int maxVolume = audioManager.getStreamMaxVolume(3);
            if (maxVolume > 0) {
                float f3 = streamVolume * 1.0f;
                float f4 = maxVolume;
                if (A01[6].charAt(22) != 84) {
                    throw new RuntimeException();
                }
                A01[2] = "0x0JMOwm3zHAjWtXS56jSdeaa6cHcp3J";
                return f3 / f4;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static void A03(Map<String, String> map, boolean z, boolean z5) {
        String strA01 = A01(1, 1, 83);
        String strA012 = A01(0, 1, 120);
        map.put(A01(7, 8, 44), z ? strA01 : strA012);
        if (!z5) {
            strA01 = strA012;
        }
        map.put(A01(15, 6, 70), strA01);
    }
}
