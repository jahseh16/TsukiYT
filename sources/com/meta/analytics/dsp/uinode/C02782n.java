package com.meta.analytics.dsp.uinode;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02782n {
    public static byte[] A04;
    public static String[] A05 = {"XC94AwcgSvjgVkKSrw6USa9yjPBs64Er", "sEOY3yVdzVjZYc5fCydQIWNRtoI3Ep8p", "tsp8L53mE941fUp", "tfJ", "WI5YCVlpnY9sS2vUV4hGrlGwgmIaf2Io", "oZjWXXS8g7ghKD4scwMqufEnh", "pMetx8l337qhdnOFVjsjKuwa37", "eWa41C8ZyjQQf2L"};
    public boolean A00;
    public boolean A01;
    public final BroadcastReceiver A02;
    public final IntentFilter A03;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{109, 9, 8, 12, 9, 97, 39, 40, 45, 53, 36, 51, 124, 127, 72, 78, 72, 68, 91, 72, 95, 86, 66};
    }

    static {
        A01();
    }

    public C02782n(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.A03 = intentFilter;
        this.A02 = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(A00(13, 9, 62));
        sb.append(this.A02);
        sb.append(A00(5, 8, 82));
        sb.append(this.A03);
        if (this.A01) {
            sb.append(A00(0, 5, 94));
        }
        String strA00 = A00(22, 1, 44);
        String[] strArr = A05;
        if (strArr[7].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A05[5] = "FUdb7WkfGlB";
        sb.append(strA00);
        return sb.toString();
    }
}
