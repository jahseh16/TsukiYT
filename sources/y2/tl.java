package y2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f9294a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f9295c5;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Deprecated
    public float f9297gv;

    @Deprecated
    public float n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public float f9299v;

    @Deprecated
    public float y;

    @Deprecated
    public float zn;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<a> f9296fb = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<fb> f9298s = new ArrayList();

    public static abstract class a {
        public final Matrix y = new Matrix();

        public abstract void y(Matrix matrix, Path path);
    }

    public static abstract class fb {
        public static final Matrix y = new Matrix();

        public final void n3(v2.y yVar, int i, Canvas canvas) {
            y(y, yVar, i, canvas);
        }

        public abstract void y(Matrix matrix, v2.y yVar, int i, Canvas canvas);
    }

    public static class gv extends a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final RectF f9300s = new RectF();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public float f9301a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Deprecated
        public float f9302fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Deprecated
        public float f9303gv;

        @Deprecated
        public float n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Deprecated
        public float f9304v;

        @Deprecated
        public float zn;

        public gv(float f3, float f4, float f5, float f7) {
            p(f3);
            r(f4);
            mt(f5);
            w(f7);
        }

        public final void co(float f3) {
            this.f9301a = f3;
        }

        public final float f() {
            return this.n3;
        }

        public final float i9() {
            return this.f9304v;
        }

        public final void mt(float f3) {
            this.f9303gv = f3;
        }

        public final void p(float f3) {
            this.n3 = f3;
        }

        public final void r(float f3) {
            this.zn = f3;
        }

        public final float t() {
            return this.f9303gv;
        }

        public final float tl() {
            return this.f9301a;
        }

        public final void w(float f3) {
            this.f9304v = f3;
        }

        public final float wz() {
            return this.f9302fb;
        }

        public final float xc() {
            return this.zn;
        }

        @Override // y2.tl.a
        public void y(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.y;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f9300s;
            rectF.set(f(), xc(), t(), i9());
            path.arcTo(rectF, tl(), wz(), false);
            path.transform(matrix);
        }

        public final void z(float f3) {
            this.f9302fb = f3;
        }
    }

    public static class n3 extends fb {
        public final gv n3;

        public n3(gv gvVar) {
            this.n3 = gvVar;
        }

        @Override // y2.tl.fb
        public void y(Matrix matrix, @NonNull v2.y yVar, int i, @NonNull Canvas canvas) {
            yVar.y(canvas, matrix, new RectF(this.n3.f(), this.n3.xc(), this.n3.t(), this.n3.i9()), i, this.n3.tl(), this.n3.wz());
        }
    }

    public static class v extends a {
        public float n3;
        public float zn;

        @Override // y2.tl.a
        public void y(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.y;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.n3, this.zn);
            path.transform(matrix);
        }
    }

    public class y extends fb {
        public final /* synthetic */ List n3;
        public final /* synthetic */ Matrix zn;

        public y(List list, Matrix matrix) {
            this.n3 = list;
            this.zn = matrix;
        }

        @Override // y2.tl.fb
        public void y(Matrix matrix, v2.y yVar, int i, Canvas canvas) {
            Iterator it = this.n3.iterator();
            while (it.hasNext()) {
                ((fb) it.next()).y(this.zn, yVar, i, canvas);
            }
        }
    }

    public static class zn extends fb {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final float f9306gv;
        public final v n3;
        public final float zn;

        public zn(v vVar, float f3, float f4) {
            this.n3 = vVar;
            this.zn = f3;
            this.f9306gv = f4;
        }

        @Override // y2.tl.fb
        public void y(Matrix matrix, @NonNull v2.y yVar, int i, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.n3.zn - this.f9306gv, this.n3.n3 - this.zn), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.zn, this.f9306gv);
            matrix2.preRotate(zn());
            yVar.n3(canvas, matrix2, rectF, i);
        }

        public float zn() {
            return (float) Math.toDegrees(Math.atan((this.n3.zn - this.f9306gv) / (this.n3.n3 - this.zn)));
        }
    }

    public tl() {
        wz(0.0f, 0.0f);
    }

    @NonNull
    public fb a(Matrix matrix) {
        n3(s());
        return new y(new ArrayList(this.f9298s), new Matrix(matrix));
    }

    public float c5() {
        return this.zn;
    }

    public final void co(float f3) {
        this.f9297gv = f3;
    }

    public float f() {
        return this.y;
    }

    public final float fb() {
        return this.f9299v;
    }

    public void gv(Matrix matrix, Path path) {
        int size = this.f9296fb.size();
        for (int i = 0; i < size; i++) {
            this.f9296fb.get(i).y(matrix, path);
        }
    }

    public float i9() {
        return this.f9297gv;
    }

    public final void mt(float f3) {
        this.zn = f3;
    }

    public final void n3(float f3) {
        if (fb() == f3) {
            return;
        }
        float fFb = ((f3 - fb()) + 360.0f) % 360.0f;
        if (fFb > 180.0f) {
            return;
        }
        gv gvVar = new gv(c5(), i9(), c5(), i9());
        gvVar.co(fb());
        gvVar.z(fFb);
        this.f9298s.add(new n3(gvVar));
        w(f3);
    }

    public final void p(float f3) {
        this.f9294a = f3;
    }

    public final void r(float f3) {
        this.n3 = f3;
    }

    public final float s() {
        return this.f9294a;
    }

    public float t() {
        return this.n3;
    }

    public void tl(float f3, float f4) {
        v vVar = new v();
        vVar.n3 = f3;
        vVar.zn = f4;
        this.f9296fb.add(vVar);
        zn znVar = new zn(vVar, c5(), i9());
        zn(znVar, znVar.zn() + 270.0f, znVar.zn() + 270.0f);
        mt(f3);
        co(f4);
    }

    public boolean v() {
        return this.f9295c5;
    }

    public final void w(float f3) {
        this.f9299v = f3;
    }

    public void wz(float f3, float f4) {
        xc(f3, f4, 270.0f, 0.0f);
    }

    public void xc(float f3, float f4, float f5, float f7) {
        z(f3);
        r(f4);
        mt(f3);
        co(f4);
        w(f5);
        p((f5 + f7) % 360.0f);
        this.f9296fb.clear();
        this.f9298s.clear();
        this.f9295c5 = false;
    }

    public void y(float f3, float f4, float f5, float f7, float f8, float f9) {
        gv gvVar = new gv(f3, f4, f5, f7);
        gvVar.co(f8);
        gvVar.z(f9);
        this.f9296fb.add(gvVar);
        n3 n3Var = new n3(gvVar);
        float f10 = f8 + f9;
        boolean z = f9 < 0.0f;
        if (z) {
            f8 = (f8 + 180.0f) % 360.0f;
        }
        zn(n3Var, f8, z ? (180.0f + f10) % 360.0f : f10);
        double d4 = f10;
        mt(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.cos(Math.toRadians(d4)))));
        co(((f4 + f7) * 0.5f) + (((f7 - f4) / 2.0f) * ((float) Math.sin(Math.toRadians(d4)))));
    }

    public final void z(float f3) {
        this.y = f3;
    }

    public final void zn(fb fbVar, float f3, float f4) {
        n3(f3);
        this.f9298s.add(fbVar);
        w(f4);
    }
}
