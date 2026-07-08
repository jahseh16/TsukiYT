package jr;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import n7.p;
import uo.mg;
import uo.ud;

/* JADX INFO: loaded from: classes.dex */
public class s extends n3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f5921d;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final v f5922ej;
    public final RectF mg;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final Paint f5923ta;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    @Nullable
    public n7.y<ColorFilter, ColorFilter> f5924ud;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public final Path f5925z6;

    public s(mg mgVar, v vVar) {
        super(mgVar, vVar);
        this.mg = new RectF();
        im.y yVar = new im.y();
        this.f5923ta = yVar;
        this.f5921d = new float[8];
        this.f5925z6 = new Path();
        this.f5922ej = vVar;
        yVar.setAlpha(0);
        yVar.setStyle(Paint.Style.FILL);
        yVar.setColor(vVar.xc());
    }

    @Override // jr.n3, mh.v
    public void gv(RectF rectF, Matrix matrix, boolean z) {
        super.gv(rectF, matrix, z);
        this.mg.set(0.0f, 0.0f, this.f5922ej.p(), this.f5922ej.w());
        this.f5920xc.mapRect(this.mg);
        rectF.set(this.mg);
    }

    @Override // jr.n3, h.a
    public <T> void s(T t3, @Nullable gn.zn<T> znVar) {
        super.s(t3, znVar);
        if (t3 == ud.f8455x) {
            if (znVar == null) {
                this.f5924ud = null;
            } else {
                this.f5924ud = new p(znVar);
            }
        }
    }

    @Override // jr.n3
    public void z(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.f5922ej.xc());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.f3.s() == null ? 100 : this.f3.s().s().intValue())) / 100.0f) * 255.0f);
        this.f5923ta.setAlpha(iIntValue);
        n7.y<ColorFilter, ColorFilter> yVar = this.f5924ud;
        if (yVar != null) {
            this.f5923ta.setColorFilter(yVar.s());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f5921d;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f5922ej.p();
            float[] fArr2 = this.f5921d;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f5922ej.p();
            this.f5921d[5] = this.f5922ej.w();
            float[] fArr3 = this.f5921d;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f5922ej.w();
            matrix.mapPoints(this.f5921d);
            this.f5925z6.reset();
            Path path = this.f5925z6;
            float[] fArr4 = this.f5921d;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f5925z6;
            float[] fArr5 = this.f5921d;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f5925z6;
            float[] fArr6 = this.f5921d;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f5925z6;
            float[] fArr7 = this.f5921d;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f5925z6;
            float[] fArr8 = this.f5921d;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f5925z6.close();
            canvas.drawPath(this.f5925z6, this.f5923ta);
        }
    }
}
