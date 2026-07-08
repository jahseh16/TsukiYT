package z0;

import android.opengl.Matrix;
import v0.vl;
import v0.w;

/* JADX INFO: loaded from: classes.dex */
public final class zn {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f9419gv;
    public final float[] y = new float[16];
    public final float[] n3 = new float[16];
    public final vl<float[]> zn = new vl<>();

    public static void n3(float[] fArr, float[] fArr2) {
        float f3 = fArr2[0];
        float f4 = -fArr2[1];
        float f5 = -fArr2[2];
        float length = Matrix.length(f3, f4, f5);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f3 / length, f4 / length, f5 / length);
        } else {
            w.i9(fArr);
        }
    }

    public static void y(float[] fArr, float[] fArr2) {
        w.i9(fArr);
        float f3 = fArr2[10];
        float f4 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
        float f5 = fArr2[10];
        fArr[0] = f5 / fSqrt;
        float f7 = fArr2[8];
        fArr[2] = f7 / fSqrt;
        fArr[8] = (-f7) / fSqrt;
        fArr[10] = f5 / fSqrt;
    }

    public void gv() {
        this.zn.zn();
        this.f9419gv = false;
    }

    public void v(long j, float[] fArr) {
        this.zn.y(j, fArr);
    }

    public boolean zn(float[] fArr, long j) {
        float[] fArrI9 = this.zn.i9(j);
        if (fArrI9 == null) {
            return false;
        }
        n3(this.n3, fArrI9);
        if (!this.f9419gv) {
            y(this.y, this.n3);
            this.f9419gv = true;
        }
        Matrix.multiplyMM(fArr, 0, this.y, 0, this.n3, 0);
        return true;
    }
}
