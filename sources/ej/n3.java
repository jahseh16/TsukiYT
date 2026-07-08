package ej;

import android.graphics.Color;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final float[][] y = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] n3 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] zn = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final float[][] f3329gv = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static void a(int i, @NonNull float[] fArr) {
        float fV = v(Color.red(i));
        float fV2 = v(Color.green(i));
        float fV3 = v(Color.blue(i));
        float[][] fArr2 = f3329gv;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fV) + (fArr3[1] * fV2) + (fArr3[2] * fV3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fV) + (fArr4[1] * fV2) + (fArr4[2] * fV3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fV * fArr5[0]) + (fV2 * fArr5[1]) + (fV3 * fArr5[2]);
    }

    public static float fb(int i) {
        float fV = v(Color.red(i));
        float fV2 = v(Color.green(i));
        float fV3 = v(Color.blue(i));
        float[] fArr = f3329gv[1];
        return (fV * fArr[0]) + (fV2 * fArr[1]) + (fV3 * fArr[2]);
    }

    public static float gv(float f3, float f4, float f5) {
        return f3 + ((f4 - f3) * f5);
    }

    public static float n3(int i) {
        return zn(fb(i));
    }

    public static float s(float f3) {
        return (f3 > 8.0f ? (float) Math.pow((((double) f3) + 16.0d) / 116.0d, 3.0d) : f3 / 903.2963f) * 100.0f;
    }

    public static float v(int i) {
        float f3 = i / 255.0f;
        return (f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static int y(float f3) {
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f4 = (f3 + 16.0f) / 116.0f;
        float f5 = f3 > 8.0f ? f4 * f4 * f4 : f3 / 903.2963f;
        float f7 = f4 * f4 * f4;
        boolean z = f7 > 0.008856452f;
        float f8 = z ? f7 : ((f4 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f7 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = zn;
        return ud.y.n3(f8 * fArr[0], f5 * fArr[1], f7 * fArr[2]);
    }

    public static float zn(float f3) {
        float f4 = f3 / 100.0f;
        return f4 <= 0.008856452f ? f4 * 903.2963f : (((float) Math.cbrt(f4)) * 116.0f) - 16.0f;
    }
}
