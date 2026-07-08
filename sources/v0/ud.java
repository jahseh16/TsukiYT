package v0;

/* JADX INFO: loaded from: classes.dex */
public final class ud {
    public static boolean n3(int i, int i5) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i5 & 2) != 0 : (i5 & 1) != 0;
        }
        return true;
    }

    public static int y(int i, int i5) {
        for (int i8 = 1; i8 <= 2; i8++) {
            int i10 = (i + i8) % 3;
            if (n3(i10, i5)) {
                return i10;
            }
        }
        return i;
    }
}
