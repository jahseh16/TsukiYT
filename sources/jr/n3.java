package jr;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.Nullable;
import ic.i9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jr.v;
import n7.w;
import n7.y;
import r6.s;
import r6.wz;
import uo.mg;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 implements mh.v, y.n3, h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f5903a;
    public boolean c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final RectF f5904c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public n7.gv f5905co;

    @Nullable
    public Paint d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f5906f;
    public final w f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Paint f5907fb;
    public float fh;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public final List<n7.y<?, ?>> f5909i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final RectF f5910i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public n7.s f5911mt;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f5912p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public n3 f5913r;

    @Nullable
    public BlurMaskFilter rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f5914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RectF f5915t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final RectF f5916tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Paint f5917v;
    public final mg w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final String f5918wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public List<n3> f5919x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final Matrix f5920xc;

    @Nullable
    public n3 z;
    public final Path y = new Path();
    public final Matrix n3 = new Matrix();
    public final Matrix zn = new Matrix();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Paint f5908gv = new im.y(1);

    public static /* synthetic */ class y {
        public static final /* synthetic */ int[] n3;
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[s.y.values().length];
            n3 = iArr;
            try {
                iArr[s.y.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                n3[s.y.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                n3[s.y.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                n3[s.y.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[v.y.values().length];
            y = iArr2;
            try {
                iArr2[v.y.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                y[v.y.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                y[v.y.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                y[v.y.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                y[v.y.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                y[v.y.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                y[v.y.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public n3(mg mgVar, v vVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f5917v = new im.y(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f5903a = new im.y(1, mode2);
        im.y yVar = new im.y(1);
        this.f5907fb = yVar;
        this.f5914s = new im.y(PorterDuff.Mode.CLEAR);
        this.f5904c5 = new RectF();
        this.f5910i9 = new RectF();
        this.f5906f = new RectF();
        this.f5915t = new RectF();
        this.f5916tl = new RectF();
        this.f5920xc = new Matrix();
        this.f5909i4 = new ArrayList();
        this.n = true;
        this.fh = 0.0f;
        this.w = mgVar;
        this.f5912p = vVar;
        this.f5918wz = vVar.c5() + "#draw";
        if (vVar.s() == v.n3.INVERT) {
            yVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            yVar.setXfermode(new PorterDuffXfermode(mode));
        }
        w wVarN3 = vVar.i4().n3();
        this.f3 = wVarN3;
        wVarN3.n3(this);
        if (vVar.fb() != null && !vVar.fb().isEmpty()) {
            n7.s sVar = new n7.s(vVar.fb());
            this.f5911mt = sVar;
            Iterator<n7.y<wz, Path>> it = sVar.y().iterator();
            while (it.hasNext()) {
                it.next().y(this);
            }
            for (n7.y<Integer, Integer> yVar2 : this.f5911mt.zn()) {
                c5(yVar2);
                yVar2.y(this);
            }
        }
        yt();
    }

    @Nullable
    public static n3 r(zn znVar, v vVar, mg mgVar, uo.s sVar) {
        switch (y.y[vVar.a().ordinal()]) {
            case 1:
                return new fb(mgVar, vVar, znVar, sVar);
            case 2:
                return new zn(mgVar, vVar, sVar.xc(vVar.tl()), sVar);
            case 3:
                return new s(mgVar, vVar);
            case 4:
                return new gv(mgVar, vVar);
            case 5:
                return new a(mgVar, vVar);
            case 6:
                return new c5(mgVar, vVar);
            default:
                ic.a.zn("Unknown layer type " + vVar.a());
                return null;
        }
    }

    public void a8(boolean z) {
        if (z && this.d0 == null) {
            this.d0 = new im.y();
        }
        this.c = z;
    }

    public void b(float f3) {
        this.f3.i9(f3);
        if (this.f5911mt != null) {
            for (int i = 0; i < this.f5911mt.y().size(); i++) {
                this.f5911mt.y().get(i).tl(f3);
            }
        }
        n7.gv gvVar = this.f5905co;
        if (gvVar != null) {
            gvVar.tl(f3);
        }
        n3 n3Var = this.z;
        if (n3Var != null) {
            n3Var.b(f3);
        }
        for (int i5 = 0; i5 < this.f5909i4.size(); i5++) {
            this.f5909i4.get(i5).tl(f3);
        }
    }

    public boolean c() {
        n7.s sVar = this.f5911mt;
        return (sVar == null || sVar.y().isEmpty()) ? false : true;
    }

    public void c5(@Nullable n7.y<?, ?> yVar) {
        if (yVar == null) {
            return;
        }
        this.f5909i4.add(yVar);
    }

    public final void co(Canvas canvas) {
        uo.zn.y("Layer#clearLayer");
        RectF rectF = this.f5904c5;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f5914s);
        uo.zn.n3("Layer#clearLayer");
    }

    public final void d(float f3) {
        this.w.d().wz().y(this.f5912p.c5(), f3);
    }

    public boolean d0() {
        return this.z != null;
    }

    public final void f(Canvas canvas, Matrix matrix, n7.y<wz, Path> yVar, n7.y<Integer, Integer> yVar2) {
        i9.tl(canvas, this.f5904c5, this.f5917v);
        this.y.set(yVar.s());
        this.y.transform(matrix);
        this.f5908gv.setAlpha((int) (yVar2.s().intValue() * 2.55f));
        canvas.drawPath(this.y, this.f5908gv);
        canvas.restore();
    }

    @Nullable
    public hk.i9 f3() {
        return this.f5912p.zn();
    }

    @Override // mh.v
    public void fb(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer numS;
        uo.zn.y(this.f5918wz);
        if (!this.n || this.f5912p.f3()) {
            uo.zn.n3(this.f5918wz);
            return;
        }
        mt();
        uo.zn.y("Layer#parentMatrix");
        this.n3.reset();
        this.n3.set(matrix);
        for (int size = this.f5919x4.size() - 1; size >= 0; size--) {
            this.n3.preConcat(this.f5919x4.get(size).f3.a());
        }
        uo.zn.n3("Layer#parentMatrix");
        n7.y<?, Integer> yVarS = this.f3.s();
        int iIntValue = (int) ((((i / 255.0f) * ((yVarS == null || (numS = yVarS.s()) == null) ? 100 : numS.intValue())) / 100.0f) * 255.0f);
        if (!d0() && !c()) {
            this.n3.preConcat(this.f3.a());
            uo.zn.y("Layer#drawLayer");
            z(canvas, this.n3, iIntValue);
            uo.zn.n3("Layer#drawLayer");
            d(uo.zn.n3(this.f5918wz));
            return;
        }
        uo.zn.y("Layer#computeBounds");
        gv(this.f5904c5, this.n3, false);
        rz(this.f5904c5, matrix);
        this.n3.preConcat(this.f3.a());
        fh(this.f5904c5, this.n3);
        this.f5910i9.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.zn);
        if (!this.zn.isIdentity()) {
            Matrix matrix2 = this.zn;
            matrix2.invert(matrix2);
            this.zn.mapRect(this.f5910i9);
        }
        if (!this.f5904c5.intersect(this.f5910i9)) {
            this.f5904c5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        uo.zn.n3("Layer#computeBounds");
        if (this.f5904c5.width() >= 1.0f && this.f5904c5.height() >= 1.0f) {
            uo.zn.y("Layer#saveLayer");
            this.f5908gv.setAlpha(255);
            i9.tl(canvas, this.f5904c5, this.f5908gv);
            uo.zn.n3("Layer#saveLayer");
            co(canvas);
            uo.zn.y("Layer#drawLayer");
            z(canvas, this.n3, iIntValue);
            uo.zn.n3("Layer#drawLayer");
            if (c()) {
                xc(canvas, this.n3);
            }
            if (d0()) {
                uo.zn.y("Layer#drawMatte");
                uo.zn.y("Layer#saveLayer");
                i9.wz(canvas, this.f5904c5, this.f5907fb, 19);
                uo.zn.n3("Layer#saveLayer");
                co(canvas);
                this.z.fb(canvas, matrix, iIntValue);
                uo.zn.y("Layer#restoreLayer");
                canvas.restore();
                uo.zn.n3("Layer#restoreLayer");
                uo.zn.n3("Layer#drawMatte");
            }
            uo.zn.y("Layer#restoreLayer");
            canvas.restore();
            uo.zn.n3("Layer#restoreLayer");
        }
        if (this.c && (paint = this.d0) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.d0.setColor(-251901);
            this.d0.setStrokeWidth(4.0f);
            canvas.drawRect(this.f5904c5, this.d0);
            this.d0.setStyle(Paint.Style.FILL);
            this.d0.setColor(1357638635);
            canvas.drawRect(this.f5904c5, this.d0);
        }
        d(uo.zn.n3(this.f5918wz));
    }

    public final void fh(RectF rectF, Matrix matrix) {
        this.f5906f.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (c()) {
            int size = this.f5911mt.n3().size();
            for (int i = 0; i < size; i++) {
                r6.s sVar = this.f5911mt.n3().get(i);
                Path pathS = this.f5911mt.y().get(i).s();
                if (pathS != null) {
                    this.y.set(pathS);
                    this.y.transform(matrix);
                    int i5 = y.n3[sVar.y().ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        return;
                    }
                    if ((i5 == 3 || i5 == 4) && sVar.gv()) {
                        return;
                    }
                    this.y.computeBounds(this.f5916tl, false);
                    if (i == 0) {
                        this.f5906f.set(this.f5916tl);
                    } else {
                        RectF rectF2 = this.f5906f;
                        rectF2.set(Math.min(rectF2.left, this.f5916tl.left), Math.min(this.f5906f.top, this.f5916tl.top), Math.max(this.f5906f.right, this.f5916tl.right), Math.max(this.f5906f.bottom, this.f5916tl.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f5906f)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // mh.zn
    public String getName() {
        return this.f5912p.c5();
    }

    @Override // mh.v
    public void gv(RectF rectF, Matrix matrix, boolean z) {
        this.f5904c5.set(0.0f, 0.0f, 0.0f, 0.0f);
        mt();
        this.f5920xc.set(matrix);
        if (z) {
            List<n3> list = this.f5919x4;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f5920xc.preConcat(this.f5919x4.get(size).f3.a());
                }
            } else {
                n3 n3Var = this.f5913r;
                if (n3Var != null) {
                    this.f5920xc.preConcat(n3Var.f3.a());
                }
            }
        }
        this.f5920xc.preConcat(this.f3.a());
    }

    public BlurMaskFilter i4(float f3) {
        if (this.fh == f3) {
            return this.rz;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.rz = blurMaskFilter;
        this.fh = f3;
        return blurMaskFilter;
    }

    public final void i9(Canvas canvas, Matrix matrix, n7.y<wz, Path> yVar, n7.y<Integer, Integer> yVar2) {
        this.y.set(yVar.s());
        this.y.transform(matrix);
        this.f5908gv.setAlpha((int) (yVar2.s().intValue() * 2.55f));
        canvas.drawPath(this.y, this.f5908gv);
    }

    public final void k5(boolean z) {
        if (z != this.n) {
            this.n = z;
            mg();
        }
    }

    public final void mg() {
        this.w.invalidateSelf();
    }

    public final void mt() {
        if (this.f5919x4 != null) {
            return;
        }
        if (this.f5913r == null) {
            this.f5919x4 = Collections.emptyList();
            return;
        }
        this.f5919x4 = new ArrayList();
        for (n3 n3Var = this.f5913r; n3Var != null; n3Var = n3Var.f5913r) {
            this.f5919x4.add(n3Var);
        }
    }

    public v n() {
        return this.f5912p;
    }

    public final boolean p() {
        if (this.f5911mt.y().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f5911mt.n3().size(); i++) {
            if (this.f5911mt.n3().get(i).y() != s.y.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void rz(RectF rectF, Matrix matrix) {
        if (d0() && this.f5912p.s() != v.n3.INVERT) {
            this.f5915t.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.z.gv(this.f5915t, matrix, true);
            if (rectF.intersect(this.f5915t)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public <T> void s(T t3, @Nullable gn.zn<T> znVar) {
        this.f3.zn(t3, znVar);
    }

    public final void t(Canvas canvas, Matrix matrix, n7.y<wz, Path> yVar, n7.y<Integer, Integer> yVar2) {
        i9.tl(canvas, this.f5904c5, this.f5908gv);
        canvas.drawRect(this.f5904c5, this.f5908gv);
        this.y.set(yVar.s());
        this.y.transform(matrix);
        this.f5908gv.setAlpha((int) (yVar2.s().intValue() * 2.55f));
        canvas.drawPath(this.y, this.f5903a);
        canvas.restore();
    }

    public final /* synthetic */ void ta() {
        k5(this.f5905co.w() == 1.0f);
    }

    public final void tl(Canvas canvas, Matrix matrix, n7.y<wz, Path> yVar, n7.y<Integer, Integer> yVar2) {
        i9.tl(canvas, this.f5904c5, this.f5917v);
        canvas.drawRect(this.f5904c5, this.f5908gv);
        this.f5903a.setAlpha((int) (yVar2.s().intValue() * 2.55f));
        this.y.set(yVar.s());
        this.y.transform(matrix);
        canvas.drawPath(this.y, this.f5903a);
        canvas.restore();
    }

    public void ud(@Nullable n3 n3Var) {
        this.z = n3Var;
    }

    @Override // h.a
    public void v(h.v vVar, int i, List<h.v> list, h.v vVar2) {
        n3 n3Var = this.z;
        if (n3Var != null) {
            h.v vVarY = vVar2.y(n3Var.getName());
            if (vVar.zn(this.z.getName(), i)) {
                list.add(vVarY.c5(this.z));
            }
            if (vVar.s(getName(), i)) {
                this.z.ej(vVar, vVar.v(this.z.getName(), i) + i, list, vVarY);
            }
        }
        if (vVar.fb(getName(), i)) {
            if (!"__container".equals(getName())) {
                vVar2 = vVar2.y(getName());
                if (vVar.zn(getName(), i)) {
                    list.add(vVar2.c5(this));
                }
            }
            if (vVar.s(getName(), i)) {
                ej(vVar, i + vVar.v(getName(), i), list, vVar2);
            }
        }
    }

    public final void w(Canvas canvas, Matrix matrix, n7.y<wz, Path> yVar) {
        this.y.set(yVar.s());
        this.y.transform(matrix);
        canvas.drawPath(this.y, this.f5903a);
    }

    public final void wz(Canvas canvas, Matrix matrix, n7.y<wz, Path> yVar, n7.y<Integer, Integer> yVar2) {
        i9.tl(canvas, this.f5904c5, this.f5903a);
        canvas.drawRect(this.f5904c5, this.f5908gv);
        this.f5903a.setAlpha((int) (yVar2.s().intValue() * 2.55f));
        this.y.set(yVar.s());
        this.y.transform(matrix);
        canvas.drawPath(this.y, this.f5903a);
        canvas.restore();
    }

    public void x(@Nullable n3 n3Var) {
        this.f5913r = n3Var;
    }

    @Nullable
    public r6.y x4() {
        return this.f5912p.y();
    }

    public final void xc(Canvas canvas, Matrix matrix) {
        uo.zn.y("Layer#saveLayer");
        i9.wz(canvas, this.f5904c5, this.f5917v, 19);
        if (Build.VERSION.SDK_INT < 28) {
            co(canvas);
        }
        uo.zn.n3("Layer#saveLayer");
        for (int i = 0; i < this.f5911mt.n3().size(); i++) {
            r6.s sVar = this.f5911mt.n3().get(i);
            n7.y<wz, Path> yVar = this.f5911mt.y().get(i);
            n7.y<Integer, Integer> yVar2 = this.f5911mt.zn().get(i);
            int i5 = y.n3[sVar.y().ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    if (i == 0) {
                        this.f5908gv.setColor(-16777216);
                        this.f5908gv.setAlpha(255);
                        canvas.drawRect(this.f5904c5, this.f5908gv);
                    }
                    if (sVar.gv()) {
                        wz(canvas, matrix, yVar, yVar2);
                    } else {
                        w(canvas, matrix, yVar);
                    }
                } else if (i5 != 3) {
                    if (i5 == 4) {
                        if (sVar.gv()) {
                            t(canvas, matrix, yVar, yVar2);
                        } else {
                            i9(canvas, matrix, yVar, yVar2);
                        }
                    }
                } else if (sVar.gv()) {
                    tl(canvas, matrix, yVar, yVar2);
                } else {
                    f(canvas, matrix, yVar, yVar2);
                }
            } else if (p()) {
                this.f5908gv.setAlpha(255);
                canvas.drawRect(this.f5904c5, this.f5908gv);
            }
        }
        uo.zn.y("Layer#restoreLayer");
        canvas.restore();
        uo.zn.n3("Layer#restoreLayer");
    }

    @Override // n7.y.n3
    public void y() {
        mg();
    }

    public final void yt() {
        if (this.f5912p.v().isEmpty()) {
            k5(true);
            return;
        }
        n7.gv gvVar = new n7.gv(this.f5912p.v());
        this.f5905co = gvVar;
        gvVar.t();
        this.f5905co.y(new y.n3() { // from class: jr.y
            @Override // n7.y.n3
            public final void y() {
                this.y.ta();
            }
        });
        k5(this.f5905co.s().floatValue() == 1.0f);
        c5(this.f5905co);
    }

    public abstract void z(Canvas canvas, Matrix matrix, int i);

    public void z6(n7.y<?, ?> yVar) {
        this.f5909i4.remove(yVar);
    }

    @Override // mh.zn
    public void n3(List<mh.zn> list, List<mh.zn> list2) {
    }

    public void ej(h.v vVar, int i, List<h.v> list, h.v vVar2) {
    }
}
