package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LY {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{25, 65, 65, 65};
    }

    public static String A01(String str) {
        if (str != null) {
            String truncatedBody = A00(0, 1, 88);
            StringTokenizer stringTokenizer = new StringTokenizer(str, truncatedBody, true);
            int i = 0;
            int maxLength = str.length();
            if (maxLength > 90) {
                int tokenLength = str.length();
                String strA00 = A00(1, 3, 14);
                if (tokenLength > 93 || !str.endsWith(strA00)) {
                    while (stringTokenizer.hasMoreTokens()) {
                        int length = stringTokenizer.nextToken().length();
                        int maxLength2 = i + length;
                        if (maxLength2 < 90) {
                            i += length;
                        }
                    }
                    return i == 0 ? str.substring(0, 90) + strA00 : str.substring(0, i) + strA00;
                }
                return str;
            }
            return str;
        }
        return str;
    }
}
