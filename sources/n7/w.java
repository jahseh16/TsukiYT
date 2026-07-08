package n7;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import gn.zn;
import ia.t;
import java.util.Collections;
import jr.n3;
import n7.y;
import uo.ud;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public y<PointF, PointF> f6920a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public y<Float, Float> f6921c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public gv f6922f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public y<?, PointF> f6923fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Matrix f6924gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public y<Integer, Integer> f6925i9;
    public final Matrix n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public y<gn.gv, gn.gv> f6926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public gv f6927t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public y<?, Float> f6928tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f6929v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public y<?, Float> f6930wz;
    public final Matrix y = new Matrix();
    public final Matrix zn;

    public w(t tVar) {
        this.f6920a = tVar.zn() == null ? null : tVar.zn().y();
        this.f6923fb = tVar.a() == null ? null : tVar.a().y();
        this.f6926s = tVar.s() == null ? null : tVar.s().y();
        this.f6921c5 = tVar.fb() == null ? null : tVar.fb().y();
        gv gvVar = tVar.c5() == null ? null : (gv) tVar.c5().y();
        this.f6922f = gvVar;
        if (gvVar != null) {
            this.n3 = new Matrix();
            this.zn = new Matrix();
            this.f6924gv = new Matrix();
            this.f6929v = new float[9];
        } else {
            this.n3 = null;
            this.zn = null;
            this.f6924gv = null;
            this.f6929v = null;
        }
        this.f6927t = tVar.i9() == null ? null : (gv) tVar.i9().y();
        if (tVar.v() != null) {
            this.f6925i9 = tVar.v().y();
        }
        if (tVar.f() != null) {
            this.f6928tl = tVar.f().y();
        } else {
            this.f6928tl = null;
        }
        if (tVar.gv() != null) {
            this.f6930wz = tVar.gv().y();
        } else {
            this.f6930wz = null;
        }
    }

    public Matrix a() {
        PointF pointFS;
        PointF pointFS2;
        this.y.reset();
        y<?, PointF> yVar = this.f6923fb;
        if (yVar != null && (pointFS2 = yVar.s()) != null) {
            float f3 = pointFS2.x;
            if (f3 != 0.0f || pointFS2.y != 0.0f) {
                this.y.preTranslate(f3, pointFS2.y);
            }
        }
        y<Float, Float> yVar2 = this.f6921c5;
        if (yVar2 != null) {
            float fFloatValue = yVar2 instanceof p ? yVar2.s().floatValue() : ((gv) yVar2).w();
            if (fFloatValue != 0.0f) {
                this.y.preRotate(fFloatValue);
            }
        }
        if (this.f6922f != null) {
            float fCos = this.f6927t == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.w()) + 90.0f));
            float fSin = this.f6927t == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.w()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.w()));
            gv();
            float[] fArr = this.f6929v;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f4 = -fSin;
            fArr[3] = f4;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.n3.setValues(fArr);
            gv();
            float[] fArr2 = this.f6929v;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.zn.setValues(fArr2);
            gv();
            float[] fArr3 = this.f6929v;
            fArr3[0] = fCos;
            fArr3[1] = f4;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f6924gv.setValues(fArr3);
            this.zn.preConcat(this.n3);
            this.f6924gv.preConcat(this.zn);
            this.y.preConcat(this.f6924gv);
        }
        y<gn.gv, gn.gv> yVar3 = this.f6926s;
        if (yVar3 != null) {
            gn.gv gvVarS = yVar3.s();
            if (gvVarS.n3() != 1.0f || gvVarS.zn() != 1.0f) {
                this.y.preScale(gvVarS.n3(), gvVarS.zn());
            }
        }
        y<PointF, PointF> yVar4 = this.f6920a;
        if (yVar4 != null && (((pointFS = yVar4.s()) != null && pointFS.x != 0.0f) || pointFS.y != 0.0f)) {
            this.y.preTranslate(-pointFS.x, -pointFS.y);
        }
        return this.y;
    }

    @Nullable
    public y<?, Float> c5() {
        return this.f6928tl;
    }

    public Matrix fb(float f3) {
        y<?, PointF> yVar = this.f6923fb;
        PointF pointFS = yVar == null ? null : yVar.s();
        y<gn.gv, gn.gv> yVar2 = this.f6926s;
        gn.gv gvVarS = yVar2 == null ? null : yVar2.s();
        this.y.reset();
        if (pointFS != null) {
            this.y.preTranslate(pointFS.x * f3, pointFS.y * f3);
        }
        if (gvVarS != null) {
            double d4 = f3;
            this.y.preScale((float) Math.pow(gvVarS.n3(), d4), (float) Math.pow(gvVarS.zn(), d4));
        }
        y<Float, Float> yVar3 = this.f6921c5;
        if (yVar3 != null) {
            float fFloatValue = yVar3.s().floatValue();
            y<PointF, PointF> yVar4 = this.f6920a;
            PointF pointFS2 = yVar4 != null ? yVar4.s() : null;
            this.y.preRotate(fFloatValue * f3, pointFS2 == null ? 0.0f : pointFS2.x, pointFS2 != null ? pointFS2.y : 0.0f);
        }
        return this.y;
    }

    public final void gv() {
        for (int i = 0; i < 9; i++) {
            this.f6929v[i] = 0.0f;
        }
    }

    public void i9(float f3) {
        y<Integer, Integer> yVar = this.f6925i9;
        if (yVar != null) {
            yVar.tl(f3);
        }
        y<?, Float> yVar2 = this.f6928tl;
        if (yVar2 != null) {
            yVar2.tl(f3);
        }
        y<?, Float> yVar3 = this.f6930wz;
        if (yVar3 != null) {
            yVar3.tl(f3);
        }
        y<PointF, PointF> yVar4 = this.f6920a;
        if (yVar4 != null) {
            yVar4.tl(f3);
        }
        y<?, PointF> yVar5 = this.f6923fb;
        if (yVar5 != null) {
            yVar5.tl(f3);
        }
        y<gn.gv, gn.gv> yVar6 = this.f6926s;
        if (yVar6 != null) {
            yVar6.tl(f3);
        }
        y<Float, Float> yVar7 = this.f6921c5;
        if (yVar7 != null) {
            yVar7.tl(f3);
        }
        gv gvVar = this.f6922f;
        if (gvVar != null) {
            gvVar.tl(f3);
        }
        gv gvVar2 = this.f6927t;
        if (gvVar2 != null) {
            gvVar2.tl(f3);
        }
    }

    public void n3(y.n3 n3Var) {
        y<Integer, Integer> yVar = this.f6925i9;
        if (yVar != null) {
            yVar.y(n3Var);
        }
        y<?, Float> yVar2 = this.f6928tl;
        if (yVar2 != null) {
            yVar2.y(n3Var);
        }
        y<?, Float> yVar3 = this.f6930wz;
        if (yVar3 != null) {
            yVar3.y(n3Var);
        }
        y<PointF, PointF> yVar4 = this.f6920a;
        if (yVar4 != null) {
            yVar4.y(n3Var);
        }
        y<?, PointF> yVar5 = this.f6923fb;
        if (yVar5 != null) {
            yVar5.y(n3Var);
        }
        y<gn.gv, gn.gv> yVar6 = this.f6926s;
        if (yVar6 != null) {
            yVar6.y(n3Var);
        }
        y<Float, Float> yVar7 = this.f6921c5;
        if (yVar7 != null) {
            yVar7.y(n3Var);
        }
        gv gvVar = this.f6922f;
        if (gvVar != null) {
            gvVar.y(n3Var);
        }
        gv gvVar2 = this.f6927t;
        if (gvVar2 != null) {
            gvVar2.y(n3Var);
        }
    }

    @Nullable
    public y<?, Integer> s() {
        return this.f6925i9;
    }

    @Nullable
    public y<?, Float> v() {
        return this.f6930wz;
    }

    public void y(n3 n3Var) {
        n3Var.c5(this.f6925i9);
        n3Var.c5(this.f6928tl);
        n3Var.c5(this.f6930wz);
        n3Var.c5(this.f6920a);
        n3Var.c5(this.f6923fb);
        n3Var.c5(this.f6926s);
        n3Var.c5(this.f6921c5);
        n3Var.c5(this.f6922f);
        n3Var.c5(this.f6927t);
    }

    public <T> boolean zn(T t3, @Nullable zn<T> znVar) {
        if (t3 == ud.f8432a) {
            y<PointF, PointF> yVar = this.f6920a;
            if (yVar == null) {
                this.f6920a = new p(znVar, new PointF());
                return true;
            }
            yVar.wz(znVar);
            return true;
        }
        if (t3 == ud.f8440fb) {
            y<?, PointF> yVar2 = this.f6923fb;
            if (yVar2 == null) {
                this.f6923fb = new p(znVar, new PointF());
                return true;
            }
            yVar2.wz(znVar);
            return true;
        }
        if (t3 == ud.f8448s) {
            wz wzVar = this.f6923fb;
            if (wzVar instanceof wz) {
                wzVar.mt(znVar);
                return true;
            }
        }
        if (t3 == ud.f8435c5) {
            wz wzVar2 = this.f6923fb;
            if (wzVar2 instanceof wz) {
                wzVar2.co(znVar);
                return true;
            }
        }
        if (t3 == ud.f8457xc) {
            y<gn.gv, gn.gv> yVar3 = this.f6926s;
            if (yVar3 == null) {
                this.f6926s = new p(znVar, new gn.gv());
                return true;
            }
            yVar3.wz(znVar);
            return true;
        }
        if (t3 == ud.w) {
            y<Float, Float> yVar4 = this.f6921c5;
            if (yVar4 == null) {
                this.f6921c5 = new p(znVar, Float.valueOf(0.0f));
                return true;
            }
            yVar4.wz(znVar);
            return true;
        }
        if (t3 == ud.zn) {
            y<Integer, Integer> yVar5 = this.f6925i9;
            if (yVar5 == null) {
                this.f6925i9 = new p(znVar, 100);
                return true;
            }
            yVar5.wz(znVar);
            return true;
        }
        if (t3 == ud.rz) {
            y<?, Float> yVar6 = this.f6928tl;
            if (yVar6 == null) {
                this.f6928tl = new p(znVar, Float.valueOf(100.0f));
                return true;
            }
            yVar6.wz(znVar);
            return true;
        }
        if (t3 == ud.mg) {
            y<?, Float> yVar7 = this.f6930wz;
            if (yVar7 == null) {
                this.f6930wz = new p(znVar, Float.valueOf(100.0f));
                return true;
            }
            yVar7.wz(znVar);
            return true;
        }
        if (t3 == ud.f8446p) {
            if (this.f6922f == null) {
                this.f6922f = new gv(Collections.singletonList(new gn.y(Float.valueOf(0.0f))));
            }
            this.f6922f.wz(znVar);
            return true;
        }
        if (t3 != ud.f8445mt) {
            return false;
        }
        if (this.f6927t == null) {
            this.f6927t = new gv(Collections.singletonList(new gn.y(Float.valueOf(0.0f))));
        }
        this.f6927t.wz(znVar);
        return true;
    }
}
