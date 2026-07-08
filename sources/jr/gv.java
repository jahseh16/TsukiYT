package jr;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ic.i9;
import n7.p;
import uo.mg;
import uo.ta;
import uo.ud;

/* JADX INFO: loaded from: classes.dex */
public class gv extends n3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f5898d;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public n7.y<ColorFilter, ColorFilter> f5899ej;
    public final Paint mg;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final Rect f5900ta;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    @Nullable
    public n7.y<Bitmap, Bitmap> f5901ud;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    @Nullable
    public final ta f5902z6;

    public gv(mg mgVar, v vVar) {
        super(mgVar, vVar);
        this.mg = new im.y(3);
        this.f5900ta = new Rect();
        this.f5898d = new Rect();
        this.f5902z6 = mgVar.b(vVar.tl());
    }

    @Override // jr.n3, mh.v
    public void gv(RectF rectF, Matrix matrix, boolean z) {
        super.gv(rectF, matrix, z);
        if (this.f5902z6 != null) {
            float fV = i9.v();
            rectF.set(0.0f, 0.0f, this.f5902z6.v() * fV, this.f5902z6.zn() * fV);
            this.f5920xc.mapRect(rectF);
        }
    }

    @Override // jr.n3, h.a
    public <T> void s(T t3, @Nullable gn.zn<T> znVar) {
        super.s(t3, znVar);
        if (t3 == ud.f8455x) {
            if (znVar == null) {
                this.f5899ej = null;
                return;
            } else {
                this.f5899ej = new p(znVar);
                return;
            }
        }
        if (t3 == ud.f8458yt) {
            if (znVar == null) {
                this.f5901ud = null;
            } else {
                this.f5901ud = new p(znVar);
            }
        }
    }

    @Nullable
    public final Bitmap vl() {
        Bitmap bitmapS;
        n7.y<Bitmap, Bitmap> yVar = this.f5901ud;
        if (yVar != null && (bitmapS = yVar.s()) != null) {
            return bitmapS;
        }
        Bitmap bitmapMg = this.w.mg(this.f5912p.tl());
        if (bitmapMg != null) {
            return bitmapMg;
        }
        ta taVar = this.f5902z6;
        if (taVar != null) {
            return taVar.y();
        }
        return null;
    }

    @Override // jr.n3
    public void z(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapVl = vl();
        if (bitmapVl == null || bitmapVl.isRecycled() || this.f5902z6 == null) {
            return;
        }
        float fV = i9.v();
        this.mg.setAlpha(i);
        n7.y<ColorFilter, ColorFilter> yVar = this.f5899ej;
        if (yVar != null) {
            this.mg.setColorFilter(yVar.s());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f5900ta.set(0, 0, bitmapVl.getWidth(), bitmapVl.getHeight());
        if (this.w.k5()) {
            this.f5898d.set(0, 0, (int) (this.f5902z6.v() * fV), (int) (this.f5902z6.zn() * fV));
        } else {
            this.f5898d.set(0, 0, (int) (bitmapVl.getWidth() * fV), (int) (bitmapVl.getHeight() * fV));
        }
        canvas.drawBitmap(bitmapVl, this.f5900ta, this.f5898d, this.mg);
        canvas.restore();
    }
}
