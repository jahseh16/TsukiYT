package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class KE {
    public static byte[] A00;
    public static String[] A01 = {"Q0cgd8ZooYecE", "J2BVhp7vuHAIAp7SnVNGb8HH1cbMxubt", "iqQBNrIT5Q3AC", "t9KuhFyRWu3gNFkI0HekeVuTW0avorLV", "OYjVlNdFlUPlcN7lAyHGk2JCraJWPiHi", "vCXknpIYzaKLfC11Hy3POPlfgXO", "n2KyTvvQ13Vg6RKdtgKJvEFdzL71NxtZ", "o17fQXz1EMvktucDmPwTMbcvnBIuog9r"};

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-48, -52, -53, -18, -38, -4, -17, -16, -3};
        if (A01[5].length() == 9) {
            throw new RuntimeException();
        }
        A01[4] = "oolqHAu5YIFMgU7X3X8w7PUngZkPIqyX";
        A00 = bArr;
    }

    static {
        A02();
    }

    public static SharedPreferences A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 9, 95), context), 0);
    }
}
