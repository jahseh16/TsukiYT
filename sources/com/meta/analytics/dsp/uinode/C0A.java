package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0A {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{71};
    }

    private String A01(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        int slashIndex = str.lastIndexOf(47);
        if (iLastIndexOf != -1 && iLastIndexOf > slashIndex) {
            int dotIndex = iLastIndexOf + 2;
            int slashIndex2 = dotIndex + 4;
            int dotIndex2 = str.length();
            if (slashIndex2 > dotIndex2) {
                int slashIndex3 = iLastIndexOf + 1;
                int dotIndex3 = str.length();
                return str.substring(slashIndex3, dotIndex3);
            }
        }
        return A00(0, 0, 13);
    }

    public final String A03(String str) {
        String strA01 = A01(str);
        String name = C0I.A02(str);
        if (TextUtils.isEmpty(strA01)) {
            return name;
        }
        StringBuilder sbAppend = new StringBuilder().append(name);
        String extension = A00(0, 1, 41);
        return sbAppend.append(extension).append(strA01).toString();
    }
}
