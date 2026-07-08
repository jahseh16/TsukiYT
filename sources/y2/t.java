package y2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class t {
    public final tl[] y = new tl[4];
    public final Matrix[] n3 = new Matrix[4];
    public final Matrix[] zn = new Matrix[4];

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final PointF f9287gv = new PointF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Path f9291v = new Path();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9283a = new Path();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final tl f9286fb = new tl();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f9289s = new float[2];

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final float[] f9284c5 = new float[2];

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final Path f9288i9 = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f9285f = new Path();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9290t = true;

    public interface n3 {
        void n3(tl tlVar, Matrix matrix, int i);

        void y(tl tlVar, Matrix matrix, int i);
    }

    public static class y {
        public static final t y = new t();
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final n3 f9292gv;

        @NonNull
        public final Path n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final float f9293v;

        @NonNull
        public final f y;

        @NonNull
        public final RectF zn;

        public zn(@NonNull f fVar, float f3, RectF rectF, @Nullable n3 n3Var, Path path) {
            this.f9292gv = n3Var;
            this.y = fVar;
            this.f9293v = f3;
            this.zn = rectF;
            this.n3 = path;
        }
    }

    public t() {
        for (int i = 0; i < 4; i++) {
            this.y[i] = new tl();
            this.n3[i] = new Matrix();
            this.zn[i] = new Matrix();
        }
    }

    @NonNull
    public static t f() {
        return y.y;
    }

    public final void a(int i, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final float c5(@NonNull RectF rectF, int i) {
        float[] fArr = this.f9289s;
        tl tlVar = this.y[i];
        fArr[0] = tlVar.zn;
        fArr[1] = tlVar.f9297gv;
        this.n3[i].mapPoints(fArr);
        return (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.f9289s[0]) : Math.abs(rectF.centerY() - this.f9289s[1]);
    }

    public final y2.zn fb(int i, @NonNull f fVar) {
        return i != 1 ? i != 2 ? i != 3 ? fVar.z() : fVar.mt() : fVar.i9() : fVar.t();
    }

    public void gv(f fVar, float f3, RectF rectF, @NonNull Path path) {
        v(fVar, f3, rectF, null, path);
    }

    public final a i9(int i, @NonNull f fVar) {
        return i != 1 ? i != 2 ? i != 3 ? fVar.xc() : fVar.w() : fVar.wz() : fVar.s();
    }

    public final void n3(@NonNull zn znVar, int i) {
        this.f9289s[0] = this.y[i].f();
        this.f9289s[1] = this.y[i].t();
        this.n3[i].mapPoints(this.f9289s);
        if (i == 0) {
            Path path = znVar.n3;
            float[] fArr = this.f9289s;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = znVar.n3;
            float[] fArr2 = this.f9289s;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.y[i].gv(this.n3[i], znVar.n3);
        n3 n3Var = znVar.f9292gv;
        if (n3Var != null) {
            n3Var.n3(this.y[i], this.n3[i], i);
        }
    }

    public final gv s(int i, @NonNull f fVar) {
        return i != 1 ? i != 2 ? i != 3 ? fVar.co() : fVar.p() : fVar.c5() : fVar.f();
    }

    public final boolean t(Path path, int i) {
        this.f9285f.reset();
        this.y[i].gv(this.n3[i], this.f9285f);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f9285f.computeBounds(rectF, true);
        path.op(this.f9285f, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void tl(@NonNull zn znVar, int i) {
        s(i, znVar.y).n3(this.y[i], 90.0f, znVar.f9293v, znVar.zn, fb(i, znVar.y));
        float fY = y(i);
        this.n3[i].reset();
        a(i, znVar.zn, this.f9287gv);
        Matrix matrix = this.n3[i];
        PointF pointF = this.f9287gv;
        matrix.setTranslate(pointF.x, pointF.y);
        this.n3[i].preRotate(fY);
    }

    public void v(f fVar, float f3, RectF rectF, n3 n3Var, @NonNull Path path) {
        path.rewind();
        this.f9291v.rewind();
        this.f9283a.rewind();
        this.f9283a.addRect(rectF, Path.Direction.CW);
        zn znVar = new zn(fVar, f3, rectF, n3Var, path);
        for (int i = 0; i < 4; i++) {
            tl(znVar, i);
            wz(i);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            n3(znVar, i5);
            zn(znVar, i5);
        }
        path.close();
        this.f9291v.close();
        if (this.f9291v.isEmpty()) {
            return;
        }
        path.op(this.f9291v, Path.Op.UNION);
    }

    public final void wz(int i) {
        this.f9289s[0] = this.y[i].c5();
        this.f9289s[1] = this.y[i].i9();
        this.n3[i].mapPoints(this.f9289s);
        float fY = y(i);
        this.zn[i].reset();
        Matrix matrix = this.zn[i];
        float[] fArr = this.f9289s;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.zn[i].preRotate(fY);
    }

    public final float y(int i) {
        return (i + 1) * 90;
    }

    public final void zn(@NonNull zn znVar, int i) {
        int i5 = (i + 1) % 4;
        this.f9289s[0] = this.y[i].c5();
        this.f9289s[1] = this.y[i].i9();
        this.n3[i].mapPoints(this.f9289s);
        this.f9284c5[0] = this.y[i5].f();
        this.f9284c5[1] = this.y[i5].t();
        this.n3[i5].mapPoints(this.f9284c5);
        float f3 = this.f9289s[0];
        float[] fArr = this.f9284c5;
        float fMax = Math.max(((float) Math.hypot(f3 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fC5 = c5(znVar.zn, i);
        this.f9286fb.wz(0.0f, 0.0f);
        a aVarI9 = i9(i, znVar.y);
        aVarI9.zn(fMax, fC5, znVar.f9293v, this.f9286fb);
        this.f9288i9.reset();
        this.f9286fb.gv(this.zn[i], this.f9288i9);
        if (this.f9290t && (aVarI9.n3() || t(this.f9288i9, i) || t(this.f9288i9, i5))) {
            Path path = this.f9288i9;
            path.op(path, this.f9283a, Path.Op.DIFFERENCE);
            this.f9289s[0] = this.f9286fb.f();
            this.f9289s[1] = this.f9286fb.t();
            this.zn[i].mapPoints(this.f9289s);
            Path path2 = this.f9291v;
            float[] fArr2 = this.f9289s;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f9286fb.gv(this.zn[i], this.f9291v);
        } else {
            this.f9286fb.gv(this.zn[i], znVar.n3);
        }
        n3 n3Var = znVar.f9292gv;
        if (n3Var != null) {
            n3Var.y(this.f9286fb, this.zn[i], i);
        }
    }
}
