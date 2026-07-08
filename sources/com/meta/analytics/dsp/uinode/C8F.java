package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C8F {
    public static byte[] A00;
    public static String[] A01 = {"a6IxlCkVmcf1QOD6ZYjDV7INHBfwC5pE", "pjHGmgbtiOqji60ouNqSwKm8iDwdL2il", "jT1wBn6CKnjHaXeX1", "64rNhN6ZFhDWGxpIQ", "ze8vByysvbBiliYVuotBM6Di85tpEUzv", "oRRmyqjSmqskFAvbDRZ10d57ZrKFDjEI", "44vbl6FfanMIMy7ytQNCDD1eXfOrnFTF", "rkbwsxy0OcV7GrP7ELmdkRDeQR2uGuGh"};

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = bArrCopyOfRange[i10] - i8;
            if (A01[1].charAt(1) == 'a') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "1M2Y98BwTvEPUGLlCwxj254fliWahs1n";
            strArr[0] = "azYACSqPfJkxfvivKERNz1YXvsYHtm8K";
            bArrCopyOfRange[i10] = (byte) (i11 - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-47, -12, -20, -20, -18, -13, -20, -91, -45, -22, -7, -4, -12, -9, -16, -91, -54, -5, -22, -13, -7, -52, -35, -38, -55, -36, -47, -41, -42, 28, 41, 41, 38, 41, -9, 3, 3, -1, -18, 2, 3, -16, 3, 4, 2, -18, -14, -2, -13, -12, 22, 13, 28, 31, 23, 26, 19, -38, -53, -29, -42, -39, -53, -50, -55, -35, -45, -28, -49, 15, 16, -3, 14, 16, -5, 16, 5, 9, 1, -40, -45, -49, -46, -60, -57, -62, -42, -52, -35, -56};
    }

    static {
        A02();
    }

    public static JSONObject A01(C03927f c03927f, long j, long j4, long j7, long j8, int i, Exception exc) {
        String strA00;
        double d4;
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 88), j);
                strA00 = A00(21, 8, 36);
                d4 = j4;
            } catch (JSONException e4) {
                e = e4;
            }
        } catch (JSONException e5) {
            e = e5;
        }
        if (A01[1].charAt(1) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "jMg5lz9yrKYKrG7ow7Rg5ttUcJr1AiZd";
        strArr[6] = "pmFVBxkrFRXwpMq5qFraASgBsRnTrBpW";
        try {
            jSONObject.put(strA00, d4 / 1000.0d);
            try {
                jSONObject.put(A00(57, 12, 38), j7);
                try {
                    jSONObject.put(A00(79, 11, 31), j8);
                    try {
                        jSONObject.put(A00(34, 16, 75), i);
                        if (exc != null) {
                            jSONObject.put(A00(29, 5, 115), exc.getMessage());
                        }
                    } catch (JSONException e6) {
                        e = e6;
                        c03927f.A07().A3c(e);
                    }
                } catch (JSONException e8) {
                    e = e8;
                }
            } catch (JSONException e9) {
                e = e9;
            }
        } catch (JSONException e10) {
            e = e10;
        }
        return jSONObject;
    }

    public static void A03(C03927f c03927f, long j, long j4, long j7, long j8, int i, Exception exc) {
        C8B c8b = new C8B(A00(0, 21, 65));
        c8b.A05(1);
        c8b.A07(A01(c03927f, j, j4, j7, j8, i, exc));
        c03927f.A07().AAA(A00(50, 7, 100), C8A.A20, c8b);
    }
}
