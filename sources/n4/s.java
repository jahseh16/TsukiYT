package n4;

import g4.xc;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static long gv(long... jArr) {
        xc.gv(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j4 = jArr[i];
            if (j4 > j) {
                j = j4;
            }
        }
        return j;
    }

    public static long n3(byte b4, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12) {
        return ((((long) b6) & 255) << 48) | ((((long) b4) & 255) << 56) | ((((long) b7) & 255) << 40) | ((((long) b8) & 255) << 32) | ((((long) b9) & 255) << 24) | ((((long) b10) & 255) << 16) | ((((long) b11) & 255) << 8) | (((long) b12) & 255);
    }

    public static long v(long... jArr) {
        xc.gv(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j4 = jArr[i];
            if (j4 < j) {
                j = j4;
            }
        }
        return j;
    }

    public static int y(long j, long j4) {
        if (j < j4) {
            return -1;
        }
        return j > j4 ? 1 : 0;
    }

    public static int zn(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
