package m4;

import com.google.protobuf.Reader;
import g4.xc;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final byte[] y = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    public static final int[] n3 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] zn = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Reader.READ_DONE};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final int[] f6490gv = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int[] f6491v = {Reader.READ_DONE, Reader.READ_DONE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int n3(int i, int i5) {
        if (i5 > 0) {
            int i8 = i % i5;
            return i8 >= 0 ? i8 : i8 + i5;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Modulus ");
        sb.append(i5);
        sb.append(" must be > 0");
        throw new ArithmeticException(sb.toString());
    }

    public static int y(int i, int i5, RoundingMode roundingMode) {
        xc.t(roundingMode);
        if (i5 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i8 = i / i5;
        int i10 = i - (i5 * i8);
        if (i10 == 0) {
            return i8;
        }
        int i11 = ((i ^ i5) >> 31) | 1;
        switch (y.y[roundingMode.ordinal()]) {
            case 1:
                gv.y(i10 == 0);
                return i8;
            case 2:
                return i8;
            case 3:
                if (i11 >= 0) {
                    return i8;
                }
                break;
            case 4:
                break;
            case 5:
                if (i11 <= 0) {
                    return i8;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i10);
                int iAbs2 = iAbs - (Math.abs(i5) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i8 & 1) != 0))) {
                            return i8;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i8;
                }
            default:
                throw new AssertionError();
        }
        return i8 + i11;
    }
}
