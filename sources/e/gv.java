package e;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv implements Interpolator {
    public final float n3;
    public final float[] y;

    public gv(float[] fArr) {
        this.y = fArr;
        this.n3 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.y;
        int iMin = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f4 = this.n3;
        float f5 = (f3 - (iMin * f4)) / f4;
        float[] fArr2 = this.y;
        float f7 = fArr2[iMin];
        return f7 + (f5 * (fArr2[iMin + 1] - f7));
    }
}
