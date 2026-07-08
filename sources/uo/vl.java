package uo;

/* JADX INFO: loaded from: classes.dex */
public enum vl {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public static /* synthetic */ class y {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[vl.values().length];
            y = iArr;
            try {
                iArr[vl.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[vl.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y[vl.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean n3(int i, boolean z, int i5) {
        int i8 = y.y[ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 != 2) {
            return (z && i < 28) || i5 > 4 || i <= 25;
        }
        return true;
    }
}
