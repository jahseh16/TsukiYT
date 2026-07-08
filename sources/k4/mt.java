package k4;

/* JADX INFO: loaded from: classes.dex */
public final class mt {
    public static int n3(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int y(int i, double d4) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d4 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i5 = iHighestOneBit << 1;
        if (i5 > 0) {
            return i5;
        }
        return 1073741824;
    }

    public static int zn(Object obj) {
        return n3(obj == null ? 0 : obj.hashCode());
    }
}
