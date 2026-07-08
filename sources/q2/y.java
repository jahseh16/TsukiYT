package q2;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static float gv(float f3, float f4, float f5, float f7) {
        return (f3 <= f4 || f3 <= f5 || f3 <= f7) ? (f4 <= f5 || f4 <= f7) ? f5 > f7 ? f5 : f7 : f4 : f3;
    }

    public static float n3(float f3, float f4, float f5, float f7, float f8, float f9) {
        return gv(y(f3, f4, f5, f7), y(f3, f4, f8, f7), y(f3, f4, f8, f9), y(f3, f4, f5, f9));
    }

    public static float y(float f3, float f4, float f5, float f7) {
        return (float) Math.hypot(f5 - f3, f7 - f4);
    }

    public static float zn(float f3, float f4, float f5) {
        return ((1.0f - f5) * f3) + (f5 * f4);
    }
}
