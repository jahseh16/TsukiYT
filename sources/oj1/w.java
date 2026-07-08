package oj1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w {
    public static /* synthetic */ String y(long j, int i) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i5 = 64;
        char[] cArr = new char[64];
        int i8 = i - 1;
        if ((i & i8) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i5--;
                cArr[i5] = Character.forDigit(((int) j) & i8, i);
                j >>>= iNumberOfTrailingZeros;
            } while (j != 0);
        } else {
            long jY = (i & 1) == 0 ? (j >>> 1) / ((long) (i >>> 1)) : dj1.zn.y(j, i);
            long j4 = i;
            cArr[63] = Character.forDigit((int) (j - (jY * j4)), i);
            i5 = 63;
            while (jY > 0) {
                i5--;
                cArr[i5] = Character.forDigit((int) (jY % j4), i);
                jY /= j4;
            }
        }
        return new String(cArr, i5, 64 - i5);
    }
}
