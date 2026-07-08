package kotlin.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i, int i5, int i8) {
        return mod(mod(i, i8) - mod(i5, i8), i8);
    }

    public static final int getProgressionLastElement(int i, int i5, int i8) {
        if (i8 > 0) {
            return i >= i5 ? i5 : i5 - differenceModulo(i5, i, i8);
        }
        if (i8 < 0) {
            return i <= i5 ? i5 : i5 + differenceModulo(i, i5, -i8);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int mod(int i, int i5) {
        int i8 = i % i5;
        return i8 >= 0 ? i8 : i8 + i5;
    }
}
