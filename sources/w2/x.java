package w2;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class x extends a8 {
    @Override // w2.rz, w2.b
    public void a(@NonNull View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // w2.d, w2.b
    public void c5(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // w2.a8, w2.b
    public void fb(@NonNull View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // w2.d, w2.b
    public void s(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // w2.ej, w2.b
    public void v(@NonNull View view, int i, int i5, int i8, int i10) {
        view.setLeftTopRightBottom(i, i5, i8, i10);
    }

    @Override // w2.rz, w2.b
    public float zn(@NonNull View view) {
        return view.getTransitionAlpha();
    }
}
