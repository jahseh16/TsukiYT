package kotlin.math;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    public static int roundToInt(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    public static long roundToLong(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d4);
    }
}
