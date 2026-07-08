package jr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import ia.f;
import ic.i9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n7.p;
import n7.xc;
import r6.w;
import uo.mg;
import uo.ud;

/* JADX INFO: loaded from: classes.dex */
public class c5 extends n3 {

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public final x4.v<String> f5883a8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xc f5884b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f5885d;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final Paint f5886ej;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @Nullable
    public n7.y<Integer, Integer> f5887hw;

    @Nullable
    public n7.y<Float, Float> j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @Nullable
    public n7.y<Integer, Integer> f5888j5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public n7.y<Typeface, Typeface> f5889k;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public final mg f5890k5;
    public final StringBuilder mg;

    @Nullable
    public n7.y<Float, Float> o;

    @Nullable
    public n7.y<Float, Float> oz;

    @Nullable
    public n7.y<Float, Float> q9;

    @Nullable
    public n7.y<Integer, Integer> qn;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final RectF f5891ta;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public final Map<h.gv, List<mh.gv>> f5892ud;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    @Nullable
    public n7.y<Float, Float> f5893ut;

    @Nullable
    public n7.y<Integer, Integer> vl;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<gv> f5894x;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public final uo.s f5895yt;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public final Paint f5896z6;

    public c5(mg mgVar, v vVar) {
        ia.n3 n3Var;
        ia.n3 n3Var2;
        ia.y yVar;
        ia.y yVar2;
        super(mgVar, vVar);
        this.mg = new StringBuilder(2);
        this.f5891ta = new RectF();
        this.f5885d = new Matrix();
        this.f5896z6 = new y(this, 1);
        this.f5886ej = new n3(this, 1);
        this.f5892ud = new HashMap();
        this.f5883a8 = new x4.v<>();
        this.f5894x = new ArrayList();
        this.f5890k5 = mgVar;
        this.f5895yt = vVar.n3();
        xc xcVarGv = vVar.co().gv();
        this.f5884b = xcVarGv;
        xcVarGv.y(this);
        c5(xcVarGv);
        f fVarZ = vVar.z();
        if (fVarZ != null && (yVar2 = fVarZ.y) != null) {
            n7.y<Integer, Integer> yVarY = yVar2.y();
            this.vl = yVarY;
            yVarY.y(this);
            c5(this.vl);
        }
        if (fVarZ != null && (yVar = fVarZ.n3) != null) {
            n7.y<Integer, Integer> yVarY2 = yVar.y();
            this.f5888j5 = yVarY2;
            yVarY2.y(this);
            c5(this.f5888j5);
        }
        if (fVarZ != null && (n3Var2 = fVarZ.zn) != null) {
            n7.y<Float, Float> yVarY3 = n3Var2.y();
            this.o = yVarY3;
            yVarY3.y(this);
            c5(this.o);
        }
        if (fVarZ == null || (n3Var = fVarZ.gv) == null) {
            return;
        }
        n7.y<Float, Float> yVarY4 = n3Var.y();
        this.oz = yVarY4;
        yVarY4.y(this);
        c5(this.oz);
    }

    public final List<gv> dm(String str, float f3, h.zn znVar, float f4, float f5, boolean z) {
        float fMeasureText;
        float f7 = 0.0f;
        int i = 0;
        int i5 = 0;
        boolean z5 = false;
        float f8 = 0.0f;
        int i8 = 0;
        float f9 = 0.0f;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (z) {
                h.gv gvVarFb = this.f5895yt.zn().fb(h.gv.zn(cCharAt, znVar.y(), znVar.zn()));
                if (gvVarFb != null) {
                    fMeasureText = ((float) gvVarFb.n3()) * f4 * i9.v();
                }
            } else {
                fMeasureText = this.f5896z6.measureText(str.substring(i10, i10 + 1));
            }
            float f10 = fMeasureText + f5;
            if (cCharAt == ' ') {
                z5 = true;
                f9 = f10;
            } else if (z5) {
                i8 = i10;
                f8 = f10;
                z5 = false;
            } else {
                f8 += f10;
            }
            f7 += f10;
            if (f3 > 0.0f && f7 >= f3 && cCharAt != ' ') {
                i++;
                gv gvVarF7 = f7(i);
                if (i8 == i5) {
                    gvVarF7.zn(str.substring(i5, i10).trim(), (f7 - f10) - ((r9.length() - r7.length()) * f9));
                    i5 = i10;
                    i8 = i5;
                    f7 = f10;
                    f8 = f7;
                } else {
                    gvVarF7.zn(str.substring(i5, i8 - 1).trim(), ((f7 - f8) - ((r7.length() - r13.length()) * f9)) - f9);
                    f7 = f8;
                    i5 = i8;
                }
            }
        }
        if (f7 > 0.0f) {
            i++;
            f7(i).zn(str.substring(i5), f7);
        }
        return this.f5894x.subList(0, i);
    }

    public final List<mh.gv> en(h.gv gvVar) {
        if (this.f5892ud.containsKey(gvVar)) {
            return this.f5892ud.get(gvVar);
        }
        List listY = gvVar.y();
        int size = listY.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new mh.gv(this.f5890k5, this, (w) listY.get(i), this.f5895yt));
        }
        this.f5892ud.put(gvVar, arrayList);
        return arrayList;
    }

    public final gv f7(int i) {
        for (int size = this.f5894x.size(); size < i; size++) {
            this.f5894x.add(new gv((y) null));
        }
        return this.f5894x.get(i - 1);
    }

    @Override // jr.n3, mh.v
    public void gv(RectF rectF, Matrix matrix, boolean z) {
        super.gv(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f5895yt.n3().width(), this.f5895yt.n3().height());
    }

    public final void hw(h.n3 n3Var, Matrix matrix) {
        n7.y<Integer, Integer> yVar = this.f5887hw;
        if (yVar != null) {
            this.f5896z6.setColor(yVar.s().intValue());
        } else {
            n7.y<Integer, Integer> yVar2 = this.vl;
            if (yVar2 != null) {
                this.f5896z6.setColor(yVar2.s().intValue());
            } else {
                this.f5896z6.setColor(n3Var.s);
            }
        }
        n7.y<Integer, Integer> yVar3 = this.qn;
        if (yVar3 != null) {
            this.f5886ej.setColor(yVar3.s().intValue());
        } else {
            n7.y<Integer, Integer> yVar4 = this.f5888j5;
            if (yVar4 != null) {
                this.f5886ej.setColor(yVar4.s().intValue());
            } else {
                this.f5886ej.setColor(n3Var.c5);
            }
        }
        int iIntValue = ((this.f3.s() == null ? 100 : this.f3.s().s().intValue()) * 255) / 100;
        this.f5896z6.setAlpha(iIntValue);
        this.f5886ej.setAlpha(iIntValue);
        n7.y<Float, Float> yVar5 = this.j;
        if (yVar5 != null) {
            this.f5886ej.setStrokeWidth(yVar5.s().floatValue());
            return;
        }
        n7.y<Float, Float> yVar6 = this.o;
        if (yVar6 != null) {
            this.f5886ej.setStrokeWidth(yVar6.s().floatValue());
        } else {
            this.f5886ej.setStrokeWidth(n3Var.i9 * i9.v());
        }
    }

    public final void j(String str, h.n3 n3Var, Canvas canvas, float f3) {
        int length = 0;
        while (length < str.length()) {
            String strVl = vl(str, length);
            length += strVl.length();
            o(strVl, n3Var, canvas);
            canvas.translate(this.f5896z6.measureText(strVl) + f3, 0.0f);
        }
    }

    public final void j5(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final List<String> jz(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(h.n3 r21, android.graphics.Matrix r22, h.zn r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            n7.y<java.lang.Float, java.lang.Float> r0 = r8.q9
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.s()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.zn
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = ic.i9.fb(r22)
            java.lang.String r0 = r9.y
            java.util.List r12 = r8.jz(r0)
            int r13 = r12.size()
            int r0 = r9.v
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            n7.y<java.lang.Float, java.lang.Float> r1 = r8.f5893ut
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.s()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
        L3c:
            r14 = r0
            goto L4d
        L3e:
            n7.y<java.lang.Float, java.lang.Float> r1 = r8.oz
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r1.s()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4d:
            r15 = 0
            r0 = -1
            r6 = 0
            r7 = -1
        L51:
            if (r6 >= r13) goto Lb2
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.tl
            if (r0 != 0) goto L61
            r0 = 0
            r2 = 0
            goto L64
        L61:
            float r0 = r0.x
            r2 = r0
        L64:
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.dm(r1, r2, r3, r4, r5, r6)
            r5 = 0
        L75:
            int r0 = r6.size()
            if (r5 >= r0) goto Laf
            java.lang.Object r0 = r6.get(r5)
            jr.c5$gv r0 = (jr.c5.gv) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = jr.c5.gv.y(r0)
            r4 = r24
            r8.xg(r4, r9, r7, r1)
            java.lang.String r1 = jr.c5.gv.n3(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.ut(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L75
        Laf:
            int r6 = r17 + 1
            goto L51
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.c5.k(h.n3, android.graphics.Matrix, h.zn, android.graphics.Canvas):void");
    }

    public final void o(String str, h.n3 n3Var, Canvas canvas) {
        if (n3Var.f) {
            j5(str, this.f5896z6, canvas);
            j5(str, this.f5886ej, canvas);
        } else {
            j5(str, this.f5886ej, canvas);
            j5(str, this.f5896z6, canvas);
        }
    }

    public final void oz(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q9(h.n3 r19, h.zn r20, android.graphics.Canvas r21) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.c5.q9(h.n3, h.zn, android.graphics.Canvas):void");
    }

    public final void qn(h.gv gvVar, float f3, h.n3 n3Var, Canvas canvas) {
        List<mh.gv> listEn = en(gvVar);
        for (int i = 0; i < listEn.size(); i++) {
            Path path = listEn.get(i).getPath();
            path.computeBounds(this.f5891ta, false);
            this.f5885d.reset();
            this.f5885d.preTranslate(0.0f, (-n3Var.fb) * i9.v());
            this.f5885d.preScale(f3, f3);
            path.transform(this.f5885d);
            if (n3Var.f) {
                oz(path, this.f5896z6, canvas);
                oz(path, this.f5886ej, canvas);
            } else {
                oz(path, this.f5886ej, canvas);
                oz(path, this.f5896z6, canvas);
            }
        }
    }

    @Override // jr.n3, h.a
    public <T> void s(T t3, @Nullable gn.zn<T> znVar) {
        super.s(t3, znVar);
        if (t3 == ud.y) {
            n7.y<Integer, Integer> yVar = this.f5887hw;
            if (yVar != null) {
                z6(yVar);
            }
            if (znVar == null) {
                this.f5887hw = null;
                return;
            }
            p pVar = new p(znVar);
            this.f5887hw = pVar;
            pVar.y(this);
            c5(this.f5887hw);
            return;
        }
        if (t3 == ud.n3) {
            n7.y<Integer, Integer> yVar2 = this.qn;
            if (yVar2 != null) {
                z6(yVar2);
            }
            if (znVar == null) {
                this.qn = null;
                return;
            }
            p pVar2 = new p(znVar);
            this.qn = pVar2;
            pVar2.y(this);
            c5(this.qn);
            return;
        }
        if (t3 == ud.f8436co) {
            n7.y<Float, Float> yVar3 = this.j;
            if (yVar3 != null) {
                z6(yVar3);
            }
            if (znVar == null) {
                this.j = null;
                return;
            }
            p pVar3 = new p(znVar);
            this.j = pVar3;
            pVar3.y(this);
            c5(this.j);
            return;
        }
        if (t3 == ud.z) {
            n7.y<Float, Float> yVar4 = this.f5893ut;
            if (yVar4 != null) {
                z6(yVar4);
            }
            if (znVar == null) {
                this.f5893ut = null;
                return;
            }
            p pVar4 = new p(znVar);
            this.f5893ut = pVar4;
            pVar4.y(this);
            c5(this.f5893ut);
            return;
        }
        if (t3 == ud.f8437d) {
            n7.y<Float, Float> yVar5 = this.q9;
            if (yVar5 != null) {
                z6(yVar5);
            }
            if (znVar == null) {
                this.q9 = null;
                return;
            }
            p pVar5 = new p(znVar);
            this.q9 = pVar5;
            pVar5.y(this);
            c5(this.q9);
            return;
        }
        if (t3 != ud.f8444k5) {
            if (t3 == ud.vl) {
                this.f5884b.p(znVar);
                return;
            }
            return;
        }
        n7.y<Typeface, Typeface> yVar6 = this.f5889k;
        if (yVar6 != null) {
            z6(yVar6);
        }
        if (znVar == null) {
            this.f5889k = null;
            return;
        }
        p pVar6 = new p(znVar);
        this.f5889k = pVar6;
        pVar6.y(this);
        c5(this.f5889k);
    }

    @Nullable
    public final Typeface u(h.zn znVar) {
        Typeface typefaceS;
        n7.y<Typeface, Typeface> yVar = this.f5889k;
        if (yVar != null && (typefaceS = yVar.s()) != null) {
            return typefaceS;
        }
        Typeface typefaceQ9 = this.f5890k5.q9(znVar);
        return typefaceQ9 != null ? typefaceQ9 : znVar.gv();
    }

    public final void ut(String str, h.n3 n3Var, h.zn znVar, Canvas canvas, float f3, float f4, float f5) {
        for (int i = 0; i < str.length(); i++) {
            h.gv gvVarFb = this.f5895yt.zn().fb(h.gv.zn(str.charAt(i), znVar.y(), znVar.zn()));
            if (gvVarFb != null) {
                qn(gvVarFb, f4, n3Var, canvas);
                canvas.translate((((float) gvVarFb.n3()) * f4 * i9.v()) + f5, 0.0f);
            }
        }
    }

    public final String vl(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!y5(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.f5883a8.v(j)) {
            return this.f5883a8.s(j);
        }
        this.mg.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.mg.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.mg.toString();
        this.f5883a8.tl(j, string);
        return string;
    }

    public final void xg(Canvas canvas, h.n3 n3Var, int i, float f3) {
        PointF pointF = n3Var.t;
        PointF pointF2 = n3Var.tl;
        float fV = i9.v();
        float f4 = (i * n3Var.a * fV) + (pointF == null ? 0.0f : (n3Var.a * fV) + pointF.y);
        float f5 = pointF == null ? 0.0f : pointF.x;
        float f7 = pointF2 != null ? pointF2.x : 0.0f;
        int i5 = zn.y[n3Var.gv.ordinal()];
        if (i5 == 1) {
            canvas.translate(f5, f4);
        } else if (i5 == 2) {
            canvas.translate((f5 + f7) - f3, f4);
        } else {
            if (i5 != 3) {
                return;
            }
            canvas.translate((f5 + (f7 / 2.0f)) - (f3 / 2.0f), f4);
        }
    }

    public final boolean y5(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // jr.n3
    public void z(Canvas canvas, Matrix matrix, int i) {
        h.n3 n3Var = (h.n3) this.f5884b.s();
        h.zn znVar = this.f5895yt.fb().get(n3Var.n3);
        if (znVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        hw(n3Var, matrix);
        if (this.f5890k5.i2()) {
            k(n3Var, matrix, znVar, canvas);
        } else {
            q9(n3Var, znVar, canvas);
        }
        canvas.restore();
    }
}
