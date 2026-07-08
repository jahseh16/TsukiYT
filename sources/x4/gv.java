package x4;

/* JADX INFO: loaded from: classes.dex */
public class gv {
    public static final int[] y = new int[0];
    public static final long[] n3 = new long[0];
    public static final Object[] zn = new Object[0];

    public static int a(int i) {
        return gv(i * 8) / 8;
    }

    public static int gv(int i) {
        for (int i5 = 4; i5 < 32; i5++) {
            int i8 = (1 << i5) - 12;
            if (i <= i8) {
                return i8;
            }
        }
        return i;
    }

    public static int n3(long[] jArr, int i, long j) {
        int i5 = i - 1;
        int i8 = 0;
        while (i8 <= i5) {
            int i10 = (i8 + i5) >>> 1;
            long j4 = jArr[i10];
            if (j4 < j) {
                i8 = i10 + 1;
            } else {
                if (j4 <= j) {
                    return i10;
                }
                i5 = i10 - 1;
            }
        }
        return ~i8;
    }

    public static int v(int i) {
        return gv(i * 4) / 4;
    }

    public static int y(int[] iArr, int i, int i5) {
        int i8 = i - 1;
        int i10 = 0;
        while (i10 <= i8) {
            int i11 = (i10 + i8) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i5) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i5) {
                    return i11;
                }
                i8 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static boolean zn(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
