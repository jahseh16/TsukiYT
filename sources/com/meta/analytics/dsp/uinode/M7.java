package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class M7 {
    public static byte[] A00;
    public static String[] A01 = {"hdV441LwjlNtZv1709qxF0pnny4fVUPp", "ei12BejVo1CHpgyzoQPUfc", "Ngx5CnSLKehr5gInaBo3fbR58cj0cWuD", "KjX1pG4Uk1LfU8Dcrr9VX", "a0G5nH", "Lj0Juqqdj67gjngfjpTqdTQ77lTPdRGa", "RNVdSSMaTLUgDkR28FbRvDpDNW12NXcx", "b5BIPohyMmnUdzrQJ3rYHZFdjlu3USou"};

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "rGVas5AoEaq3cBsrCvDeMYMBThCVzhB5";
            strArr[5] = "o0fRmV5yhDY9KCH9v50URkZ7Eg4hKean";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 117);
            i10++;
        }
    }

    public static void A01() {
        A00 = new byte[]{43, 41, 50, 41, 54, 45, 39};
    }

    static {
        A01();
    }

    public static void A02(Activity activity, int i, C1064Yn c1064Yn) {
        try {
            activity.setRequestedOrientation(i);
        } catch (IllegalStateException e4) {
            c1064Yn.A07().AA2(A00(0, 7, 79), C8A.A0H, new C8B(e4));
        }
    }
}
