package t1;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class fb implements TypeEvaluator<Matrix> {
    public final float[] y = new float[9];
    public final float[] n3 = new float[9];
    public final Matrix zn = new Matrix();

    @NonNull
    public Matrix y(float f3, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.y);
        matrix2.getValues(this.n3);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.n3;
            float f4 = fArr[i];
            float f5 = this.y[i];
            fArr[i] = f5 + ((f4 - f5) * f3);
        }
        this.zn.setValues(this.n3);
        return this.zn;
    }
}
