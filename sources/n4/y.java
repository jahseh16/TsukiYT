package n4;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static boolean n3(boolean[] zArr, boolean z) {
        for (boolean z5 : zArr) {
            if (z5 == z) {
                return true;
            }
        }
        return false;
    }

    public static int y(boolean z, boolean z5) {
        if (z == z5) {
            return 0;
        }
        return z ? 1 : -1;
    }
}
