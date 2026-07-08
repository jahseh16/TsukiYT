package ud;

import android.graphics.Color;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final ThreadLocal<double[]> y = new ThreadLocal<>();

    public static int a(int i, int i5) {
        int iAlpha = Color.alpha(i5);
        int iAlpha2 = Color.alpha(i);
        int iV = v(iAlpha2, iAlpha);
        return Color.argb(iV, fb(Color.red(i), iAlpha2, Color.red(i5), iAlpha, iV), fb(Color.green(i), iAlpha2, Color.green(i5), iAlpha, iV), fb(Color.blue(i), iAlpha2, Color.blue(i5), iAlpha, iV));
    }

    public static double[] c5() {
        ThreadLocal<double[]> threadLocal = y;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int fb(int i, int i5, int i8, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((i * 255) * i5) + ((i8 * i10) * (255 - i5))) / (i11 * 255);
    }

    public static void gv(int i, @NonNull double[] dArr) {
        y(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static int i9(int i, int i5) {
        if (i5 < 0 || i5 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i5 << 24);
    }

    public static int n3(double d4, double d5, double d6) {
        double d7 = (((3.2406d * d4) + ((-1.5372d) * d5)) + ((-0.4986d) * d6)) / 100.0d;
        double d8 = ((((-0.9689d) * d4) + (1.8758d * d5)) + (0.0415d * d6)) / 100.0d;
        double d9 = (((0.0557d * d4) + ((-0.204d) * d5)) + (1.057d * d6)) / 100.0d;
        return Color.rgb(s((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255), s((int) Math.round((d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d), 0, 255), s((int) Math.round((d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : 12.92d * d9) * 255.0d), 0, 255));
    }

    public static int s(int i, int i5, int i8) {
        return i < i5 ? i5 : Math.min(i, i8);
    }

    public static int v(int i, int i5) {
        return 255 - (((255 - i5) * (255 - i)) / 255);
    }

    public static void y(int i, int i5, int i8, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d4 = ((double) i) / 255.0d;
        double dPow = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = ((double) i5) / 255.0d;
        double dPow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = ((double) i8) / 255.0d;
        double dPow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static double zn(int i) {
        double[] dArrC5 = c5();
        gv(i, dArrC5);
        return dArrC5[1] / 100.0d;
    }
}
