package rh1;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final int y(int i, int i5, int i8) {
        int iMin = Math.min(i5, i8);
        int iMax = Math.max(i5, i8);
        return i < iMin ? iMin : i > iMax ? iMax : i;
    }
}
