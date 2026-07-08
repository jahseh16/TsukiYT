package jr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import uo.mg;

/* JADX INFO: loaded from: classes.dex */
public class a extends n3 {
    public a(mg mgVar, v vVar) {
        super(mgVar, vVar);
    }

    @Override // jr.n3, mh.v
    public void gv(RectF rectF, Matrix matrix, boolean z) {
        super.gv(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // jr.n3
    public void z(Canvas canvas, Matrix matrix, int i) {
    }
}
