package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC02822r {
    public static final int[] A00 = new int[0];
    public static final long[] A01 = new long[0];
    public static final Object[] A02 = new Object[0];

    public static int A00(int i) {
        return A01(i * 8) / 8;
    }

    public static int A01(int i) {
        for (int i5 = 4; i5 < 32; i5++) {
            int i8 = 1 << i5;
            if (i <= i8 - 12) {
                int i10 = (1 << i5) - 12;
                return i10;
            }
        }
        return i;
    }

    public static int A02(int[] iArr, int i, int i5) {
        int midVal = 0;
        int mid = i - 1;
        while (midVal <= mid) {
            int lo = midVal + mid;
            int hi = lo >>> 1;
            int lo2 = iArr[hi];
            if (lo2 < i5) {
                midVal = hi + 1;
            } else if (lo2 > i5) {
                mid = hi - 1;
            } else {
                return hi;
            }
        }
        int lo3 = midVal ^ (-1);
        return lo3;
    }

    public static int A03(long[] jArr, int i, long j) {
        int i5 = 0;
        int i8 = i - 1;
        while (i5 <= i8) {
            int lo = i5 + i8;
            int i10 = lo >>> 1;
            long j4 = jArr[i10];
            if (j4 < j) {
                i5 = i10 + 1;
            } else if (j4 > j) {
                i8 = i10 - 1;
            } else {
                return i10;
            }
        }
        int lo2 = i5 ^ (-1);
        return lo2;
    }

    public static boolean A04(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
