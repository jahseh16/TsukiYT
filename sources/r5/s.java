package r5;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import r5.fb;
import r5.n3;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static HashSet<String> f7711c5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Stack<fb.a8> f7712a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Stack<Matrix> f7713fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public s f7714gv;
    public float n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n3.p f7715s = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Stack<s> f7716v;
    public Canvas y;
    public fb zn;

    public s(Canvas canvas, float f3) {
        this.y = canvas;
        this.n3 = f3;
    }

    public static float[] c5(double d4, double d5) {
        int iCeil = (int) Math.ceil((Math.abs(d5) * 2.0d) / 3.141592653589793d);
        double d6 = d5 / ((double) iCeil);
        double d7 = d6 / 2.0d;
        double dSin = (Math.sin(d7) * 1.3333333333333333d) / (Math.cos(d7) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i = 0;
        int i5 = 0;
        while (i < iCeil) {
            double d8 = d4 + (((double) i) * d6);
            double dCos = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d9 = d6;
            fArr[i5] = (float) (dCos - (dSin * dSin2));
            fArr[i5 + 1] = (float) (dSin2 + (dCos * dSin));
            double d10 = d8 + d9;
            double dCos2 = Math.cos(d10);
            double dSin3 = Math.sin(d10);
            fArr[i5 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr[i5 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i8 = i5 + 5;
            fArr[i5 + 4] = (float) dCos2;
            i5 += 6;
            fArr[i8] = (float) dSin3;
            i++;
            d6 = d9;
        }
        return fArr;
    }

    public static void d(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static int f3(int i, float f3) {
        int i5 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f3);
        if (iRound < 0) {
            i5 = 0;
        } else if (iRound <= 255) {
            i5 = iRound;
        }
        return (i & 16777215) | (i5 << 24);
    }

    public static void i3(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static int i4(float f3) {
        int i = (int) (f3 * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public static void s(float f3, float f4, float f5, float f7, float f8, boolean z, boolean z5, float f9, float f10, fb.f3 f3Var) {
        float f11;
        fb.f3 f3Var2;
        if (f3 == f9 && f4 == f10) {
            return;
        }
        if (f5 == 0.0f) {
            f11 = f9;
            f3Var2 = f3Var;
        } else {
            if (f7 != 0.0f) {
                float fAbs = Math.abs(f5);
                float fAbs2 = Math.abs(f7);
                double radians = Math.toRadians(((double) f8) % 360.0d);
                double dCos = Math.cos(radians);
                double dSin = Math.sin(radians);
                double d4 = ((double) (f3 - f9)) / 2.0d;
                double d5 = ((double) (f4 - f10)) / 2.0d;
                double d6 = (dCos * d4) + (dSin * d5);
                double d7 = ((-dSin) * d4) + (d5 * dCos);
                double d8 = fAbs * fAbs;
                double d9 = fAbs2 * fAbs2;
                double d10 = d6 * d6;
                double d11 = d7 * d7;
                double d12 = (d10 / d8) + (d11 / d9);
                if (d12 > 0.99999d) {
                    double dSqrt = Math.sqrt(d12) * 1.00001d;
                    fAbs = (float) (((double) fAbs) * dSqrt);
                    fAbs2 = (float) (dSqrt * ((double) fAbs2));
                    d8 = fAbs * fAbs;
                    d9 = fAbs2 * fAbs2;
                }
                double d13 = z == z5 ? -1.0d : 1.0d;
                double d14 = d8 * d9;
                double d15 = d8 * d11;
                double d16 = d9 * d10;
                double d17 = ((d14 - d15) - d16) / (d15 + d16);
                if (d17 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d17 = 0.0d;
                }
                double dSqrt2 = d13 * Math.sqrt(d17);
                double d18 = fAbs;
                double d19 = fAbs2;
                double d20 = ((d18 * d7) / d19) * dSqrt2;
                float f12 = fAbs;
                float f13 = fAbs2;
                double d21 = dSqrt2 * (-((d19 * d6) / d18));
                double d22 = (((double) (f3 + f9)) / 2.0d) + ((dCos * d20) - (dSin * d21));
                double d23 = (((double) (f4 + f10)) / 2.0d) + (dSin * d20) + (dCos * d21);
                double d24 = (d6 - d20) / d18;
                double d25 = (d7 - d21) / d19;
                double d26 = ((-d6) - d20) / d18;
                double d27 = ((-d7) - d21) / d19;
                double d28 = (d24 * d24) + (d25 * d25);
                double dAcos = (d25 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -1.0d : 1.0d) * Math.acos(d24 / Math.sqrt(d28));
                double dX4 = ((d24 * d27) - (d25 * d26) < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -1.0d : 1.0d) * x4(((d24 * d26) + (d25 * d27)) / Math.sqrt(d28 * ((d26 * d26) + (d27 * d27))));
                if (!z5 && dX4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dX4 -= 6.283185307179586d;
                } else if (z5 && dX4 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dX4 += 6.283185307179586d;
                }
                float[] fArrC5 = c5(dAcos % 6.283185307179586d, dX4 % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f12, f13);
                matrix.postRotate(f8);
                matrix.postTranslate((float) d22, (float) d23);
                matrix.mapPoints(fArrC5);
                fArrC5[fArrC5.length - 2] = f9;
                fArrC5[fArrC5.length - 1] = f10;
                for (int i = 0; i < fArrC5.length; i += 6) {
                    f3Var.zn(fArrC5[i], fArrC5[i + 1], fArrC5[i + 2], fArrC5[i + 3], fArrC5[i + 4], fArrC5[i + 5]);
                }
                return;
            }
            f3Var2 = f3Var;
            f11 = f9;
        }
        f3Var2.v(f11, f10);
    }

    public static synchronized void ut() {
        HashSet<String> hashSet = new HashSet<>();
        f7711c5 = hashSet;
        hashSet.add("Structure");
        f7711c5.add("BasicStructure");
        f7711c5.add("ConditionalProcessing");
        f7711c5.add("Image");
        f7711c5.add("Style");
        f7711c5.add("ViewportAttribute");
        f7711c5.add("Shape");
        f7711c5.add("BasicText");
        f7711c5.add("PaintAttribute");
        f7711c5.add("BasicPaintAttribute");
        f7711c5.add("OpacityAttribute");
        f7711c5.add("BasicGraphicsAttribute");
        f7711c5.add("Marker");
        f7711c5.add("Gradient");
        f7711c5.add("Pattern");
        f7711c5.add("Clip");
        f7711c5.add("BasicClip");
        f7711c5.add("Mask");
        f7711c5.add("View");
    }

    public static double x4(double d4) {
        if (d4 < -1.0d) {
            return 3.141592653589793d;
        }
        return d4 > 1.0d ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : Math.acos(d4);
    }

    public final void a8(fb.j5 j5Var, fb.j5 j5Var2) {
        if (j5Var.tl == null) {
            j5Var.tl = j5Var2.tl;
        }
        if (j5Var.wz == null) {
            j5Var.wz = j5Var2.wz;
        }
        if (j5Var.xc == null) {
            j5Var.xc = j5Var2.xc;
        }
        if (j5Var.w == null) {
            j5Var.w = j5Var2.w;
        }
        if (j5Var.p == null) {
            j5Var.p = j5Var2.p;
        }
    }

    public void ad(fb fbVar, a aVar) {
        fb.n3 n3Var;
        v vVar;
        if (aVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.zn = fbVar;
        fb.d dVarC5 = fbVar.c5();
        if (dVarC5 == null) {
            i3("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (aVar.gv()) {
            fb.ct ctVarV = this.zn.v(aVar.f7657v);
            if (ctVarV == null || !(ctVarV instanceof fb.ct)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", aVar.f7657v));
                return;
            }
            fb.ct ctVar = ctVarV;
            n3Var = ctVar.w;
            if (n3Var == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", aVar.f7657v));
                return;
            }
            vVar = ctVar.f7682xc;
        } else {
            n3Var = aVar.v() ? aVar.f7656gv : dVarC5.w;
            vVar = aVar.n3() ? aVar.n3 : dVarC5.f7682xc;
        }
        if (aVar.y()) {
            fbVar.y(aVar.y);
        }
        if (aVar.zn()) {
            n3.p pVar = new n3.p();
            this.f7715s = pVar;
            pVar.y = fbVar.v(aVar.zn);
        }
        oa();
        r(dVarC5);
        mp();
        fb.n3 n3Var2 = new fb.n3(aVar.f7655a);
        fb.w wVar = dVarC5.f7672co;
        if (wVar != null) {
            n3Var2.zn = wVar.v(this, n3Var2.zn);
        }
        fb.w wVar2 = dVarC5.z;
        if (wVar2 != null) {
            n3Var2.f7683gv = wVar2.v(this, n3Var2.f7683gv);
        }
        tg(dVarC5, n3Var2, n3Var, vVar);
        q5();
        if (aVar.y()) {
            fbVar.n3();
        }
    }

    public final void ap(fb.gv gvVar) {
        n("Circle render", new Object[0]);
        fb.w wVar = gvVar.p;
        if (wVar == null || wVar.i9()) {
            return;
        }
        ix(this.f7714gv, gvVar);
        if (d0() && i2()) {
            Matrix matrix = ((fb.t) gvVar).wz;
            if (matrix != null) {
                this.y.concat(matrix);
            }
            Path pathF7 = f7(gvVar);
            cs(gvVar);
            mt(gvVar);
            w(gvVar);
            boolean zE = e();
            if (this.f7714gv.n3) {
                fh(gvVar, pathF7);
            }
            if (this.f7714gv.zn) {
                rz(pathF7);
            }
            if (zE) {
                lc(gvVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb A[LOOP:3: B:100:0x01f5->B:102:0x01fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r5.fb.x r20, android.graphics.Path r21, r5.fb.n r22) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.s.b(r5.fb$x, android.graphics.Path, r5.fb$n):void");
    }

    public final void bk(fb.d dVar) {
        tg(dVar, ct(dVar.f7674p, dVar.f7673mt, dVar.f7672co, dVar.z), dVar.w, dVar.f7682xc);
    }

    public final void c(boolean z, fb.n3 n3Var, fb.r rVar) {
        fb.yt ytVarWz = this.zn.wz(rVar.y);
        if (ytVarWz == null) {
            d("%s reference '%s' not found", z ? "Fill" : "Stroke", rVar.y);
            fb.vl vlVar = rVar.v;
            if (vlVar != null) {
                w2(this.f7714gv, z, vlVar);
                return;
            } else if (z) {
                this.f7714gv.n3 = false;
                return;
            } else {
                this.f7714gv.zn = false;
                return;
            }
        }
        if (ytVarWz instanceof fb.k5) {
            k(z, n3Var, (fb.k5) ytVarWz);
        } else if (ytVarWz instanceof fb.j5) {
            dm(z, n3Var, (fb.j5) ytVarWz);
        } else if (ytVarWz instanceof fb.rz) {
            x5(z, (fb.rz) ytVarWz);
        }
    }

    public final Bitmap co(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e4) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e4);
            return null;
        }
    }

    public final void cr(fb.j jVar, fb.n3 n3Var) {
        n("Symbol render", new Object[0]);
        if (n3Var.zn == 0.0f || n3Var.f7683gv == 0.0f) {
            return;
        }
        v vVar = jVar.f7682xc;
        if (vVar == null) {
            vVar = v.f7724v;
        }
        ix(this.f7714gv, jVar);
        s sVar = this.f7714gv;
        sVar.a = n3Var;
        if (!sVar.y.f7691j5.booleanValue()) {
            fb.n3 n3Var2 = this.f7714gv.a;
            w9(n3Var2.y, n3Var2.n3, n3Var2.zn, n3Var2.f7683gv);
        }
        fb.n3 n3Var3 = jVar.w;
        if (n3Var3 != null) {
            this.y.concat(xc(this.f7714gv.a, n3Var3, vVar));
            this.f7714gv.fb = jVar.w;
        } else {
            Canvas canvas = this.y;
            fb.n3 n3Var4 = this.f7714gv.a;
            canvas.translate(n3Var4.y, n3Var4.n3);
        }
        boolean zE = e();
        wf(jVar, true);
        if (zE) {
            lc(jVar);
        }
        cs(jVar);
    }

    public final void cs(fb.x xVar) {
        if (xVar.n3 == null || xVar.f7701s == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f7713fb.peek().invert(matrix)) {
            fb.n3 n3Var = xVar.f7701s;
            float f3 = n3Var.y;
            float f4 = n3Var.n3;
            float fN3 = n3Var.n3();
            fb.n3 n3Var2 = xVar.f7701s;
            float f5 = n3Var2.n3;
            float fN32 = n3Var2.n3();
            float fZn = xVar.f7701s.zn();
            fb.n3 n3Var3 = xVar.f7701s;
            float[] fArr = {f3, f4, fN3, f5, fN32, fZn, n3Var3.y, n3Var3.zn()};
            matrix.preConcat(this.y.getMatrix());
            matrix.mapPoints(fArr);
            float f7 = fArr[0];
            float f8 = fArr[1];
            RectF rectF = new RectF(f7, f8, f7, f8);
            for (int i = 2; i <= 6; i += 2) {
                float f9 = fArr[i];
                if (f9 < rectF.left) {
                    rectF.left = f9;
                }
                if (f9 > rectF.right) {
                    rectF.right = f9;
                }
                float f10 = fArr[i + 1];
                if (f10 < rectF.top) {
                    rectF.top = f10;
                }
                if (f10 > rectF.bottom) {
                    rectF.bottom = f10;
                }
            }
            fb.x xVar2 = (fb.x) this.f7712a.peek();
            fb.n3 n3Var4 = xVar2.f7701s;
            if (n3Var4 == null) {
                xVar2.f7701s = fb.n3.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                n3Var4.gv(fb.n3.y(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final fb.n3 ct(fb.w wVar, fb.w wVar2, fb.w wVar3, fb.w wVar4) {
        float fFb = wVar != null ? wVar.fb(this) : 0.0f;
        float fS = wVar2 != null ? wVar2.s(this) : 0.0f;
        fb.n3 n3VarO = o();
        return new fb.n3(fFb, fS, wVar3 != null ? wVar3.fb(this) : n3VarO.zn, wVar4 != null ? wVar4.s(this) : n3VarO.f7683gv);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cy(r5.fb.mt r12, r5.s.zn r13) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.s.cy(r5.fb$mt, r5.s$zn):void");
    }

    public final boolean d0() {
        Boolean bool = this.f7714gv.y.f7697ut;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void dm(boolean z, fb.n3 n3Var, fb.j5 j5Var) {
        float f3;
        float fV;
        float f4;
        String str = ((fb.i9) j5Var).t;
        if (str != null) {
            ej(j5Var, str);
        }
        Boolean bool = ((fb.i9) j5Var).c5;
        int i = 0;
        boolean z5 = bool != null && bool.booleanValue();
        s sVar = this.f7714gv;
        Paint paint = z ? sVar.gv : sVar.v;
        if (z5) {
            fb.w wVar = new fb.w(50.0f, fb.xg.percent);
            fb.w wVar2 = j5Var.tl;
            float fFb = wVar2 != null ? wVar2.fb(this) : wVar.fb(this);
            fb.w wVar3 = j5Var.wz;
            float fS = wVar3 != null ? wVar3.s(this) : wVar.s(this);
            fb.w wVar4 = j5Var.xc;
            fV = wVar4 != null ? wVar4.gv(this) : wVar.gv(this);
            f3 = fFb;
            f4 = fS;
        } else {
            fb.w wVar5 = j5Var.tl;
            float fV2 = wVar5 != null ? wVar5.v(this, 1.0f) : 0.5f;
            fb.w wVar6 = j5Var.wz;
            float fV3 = wVar6 != null ? wVar6.v(this, 1.0f) : 0.5f;
            fb.w wVar7 = j5Var.xc;
            f3 = fV2;
            fV = wVar7 != null ? wVar7.v(this, 1.0f) : 0.5f;
            f4 = fV3;
        }
        mp();
        this.f7714gv = k5(j5Var);
        Matrix matrix = new Matrix();
        if (!z5) {
            matrix.preTranslate(n3Var.y, n3Var.n3);
            matrix.preScale(n3Var.zn, n3Var.f7683gv);
        }
        Matrix matrix2 = ((fb.i9) j5Var).i9;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = ((fb.i9) j5Var).s.size();
        if (size == 0) {
            q5();
            if (z) {
                this.f7714gv.n3 = false;
                return;
            } else {
                this.f7714gv.zn = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = ((fb.i9) j5Var).s.iterator();
        float f5 = -1.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fb.mg mgVar = (fb.yt) it.next();
            Float f7 = mgVar.s;
            float fFloatValue = f7 != null ? f7.floatValue() : 0.0f;
            if (i == 0 || fFloatValue >= f5) {
                fArr[i] = fFloatValue;
                f5 = fFloatValue;
            } else {
                fArr[i] = f5;
            }
            mp();
            ix(this.f7714gv, mgVar);
            fb.ta taVar = this.f7714gv.y;
            fb.a aVar = taVar.f7692k;
            if (aVar == null) {
                aVar = fb.a.v;
            }
            iArr[i] = f3(aVar.y, taVar.f7.floatValue());
            i++;
            q5();
        }
        if (fV == 0.0f || size == 1) {
            q5();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        fb.f fVar = ((fb.i9) j5Var).f;
        if (fVar != null) {
            if (fVar == fb.f.v) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (fVar == fb.f.fb) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        q5();
        RadialGradient radialGradient = new RadialGradient(f3, f4, fV, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(i4(this.f7714gv.y.f7695s.floatValue()));
    }

    public final boolean e() {
        fb.yt ytVarWz;
        if (!vp()) {
            return false;
        }
        this.y.saveLayerAlpha(null, i4(this.f7714gv.y.n.floatValue()), 31);
        this.f7716v.push(this.f7714gv);
        s sVar = new s(this, this.f7714gv);
        this.f7714gv = sVar;
        String str = sVar.y.u;
        if (str != null && ((ytVarWz = this.zn.wz(str)) == null || !(ytVarWz instanceof fb.co))) {
            d("Mask reference '%s' not found", this.f7714gv.y.u);
            this.f7714gv.y.u = null;
        }
        return true;
    }

    public final void eb(fb.a8 a8Var) {
        this.f7712a.push(a8Var);
        this.f7713fb.push(this.y.getMatrix());
    }

    public final void ej(fb.i9 i9Var, String str) {
        fb.i9 i9VarWz = i9Var.y.wz(str);
        if (i9VarWz == null) {
            i3("Gradient reference '%s' not found", str);
            return;
        }
        if (!(i9VarWz instanceof fb.i9)) {
            d("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (i9VarWz == i9Var) {
            d("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        fb.i9 i9Var2 = i9VarWz;
        if (i9Var.c5 == null) {
            i9Var.c5 = i9Var2.c5;
        }
        if (i9Var.i9 == null) {
            i9Var.i9 = i9Var2.i9;
        }
        if (i9Var.f == null) {
            i9Var.f = i9Var2.f;
        }
        if (i9Var.s.isEmpty()) {
            i9Var.s = i9Var2.s;
        }
        try {
            if (i9Var instanceof fb.k5) {
                ud((fb.k5) i9Var, (fb.k5) i9VarWz);
            } else {
                a8((fb.j5) i9Var, (fb.j5) i9VarWz);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = i9Var2.t;
        if (str2 != null) {
            ej(i9Var, str2);
        }
    }

    public final Path en(fb.c5 c5Var) {
        fb.w wVar = c5Var.xc;
        float fFb = wVar != null ? wVar.fb(this) : 0.0f;
        fb.w wVar2 = c5Var.w;
        float fS = wVar2 != null ? wVar2.s(this) : 0.0f;
        float fFb2 = c5Var.p.fb(this);
        float fS2 = c5Var.mt.s(this);
        float f3 = fFb - fFb2;
        float f4 = fS - fS2;
        float f5 = fFb + fFb2;
        float f7 = fS + fS2;
        if (c5Var.f7701s == null) {
            c5Var.f7701s = new fb.n3(f3, f4, fFb2 * 2.0f, 2.0f * fS2);
        }
        float f8 = fFb2 * 0.5522848f;
        float f9 = 0.5522848f * fS2;
        Path path = new Path();
        path.moveTo(fFb, f4);
        float f10 = fFb + f8;
        float f11 = fS - f9;
        path.cubicTo(f10, f4, f5, f11, f5, fS);
        float f12 = f9 + fS;
        path.cubicTo(f5, f12, f10, f7, fFb, f7);
        float f13 = fFb - f8;
        path.cubicTo(f13, f7, f3, f12, f3, fS);
        path.cubicTo(f3, f11, f13, f4, fFb, f4);
        path.close();
        return path;
    }

    public final List<zn> f(fb.p pVar) {
        fb.w wVar = pVar.xc;
        float fFb = wVar != null ? wVar.fb(this) : 0.0f;
        fb.w wVar2 = pVar.w;
        float fS = wVar2 != null ? wVar2.s(this) : 0.0f;
        fb.w wVar3 = pVar.p;
        float fFb2 = wVar3 != null ? wVar3.fb(this) : 0.0f;
        fb.w wVar4 = pVar.mt;
        float fS2 = wVar4 != null ? wVar4.s(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f3 = fFb2 - fFb;
        float f4 = fS2 - fS;
        arrayList.add(new zn(this, fFb, fS, f3, f4));
        arrayList.add(new zn(this, fFb2, fS2, f3, f4));
        return arrayList;
    }

    public final Path f7(fb.gv gvVar) {
        fb.w wVar = gvVar.xc;
        float fFb = wVar != null ? wVar.fb(this) : 0.0f;
        fb.w wVar2 = gvVar.w;
        float fS = wVar2 != null ? wVar2.s(this) : 0.0f;
        float fGv = gvVar.p.gv(this);
        float f3 = fFb - fGv;
        float f4 = fS - fGv;
        float f5 = fFb + fGv;
        float f7 = fS + fGv;
        if (gvVar.f7701s == null) {
            float f8 = 2.0f * fGv;
            gvVar.f7701s = new fb.n3(f3, f4, f8, f8);
        }
        float f9 = 0.5522848f * fGv;
        Path path = new Path();
        path.moveTo(fFb, f4);
        float f10 = fFb + f9;
        float f11 = fS - f9;
        path.cubicTo(f10, f4, f5, f11, f5, fS);
        float f12 = fS + f9;
        path.cubicTo(f5, f12, f10, f7, fFb, f7);
        float f13 = fFb - f9;
        path.cubicTo(f13, f7, f3, f12, f3, fS);
        path.cubicTo(f3, f11, f13, f4, fFb, f4);
        path.close();
        return path;
    }

    public final void fh(fb.x xVar, Path path) {
        fb.r rVar = this.f7714gv.y.f7698v;
        if (rVar instanceof fb.r) {
            fb.yt ytVarWz = this.zn.wz(rVar.y);
            if (ytVarWz instanceof fb.n) {
                b(xVar, path, (fb.n) ytVarWz);
                return;
            }
        }
        this.y.drawPath(path, this.f7714gv.gv);
    }

    public final void g(fb.d0 d0Var) {
        n("Polygon render", new Object[0]);
        ix(this.f7714gv, d0Var);
        if (d0() && i2()) {
            s sVar = this.f7714gv;
            if (sVar.zn || sVar.n3) {
                Matrix matrix = ((fb.t) d0Var).wz;
                if (matrix != null) {
                    this.y.concat(matrix);
                }
                if (((fb.c) d0Var).xc.length < 2) {
                    return;
                }
                Path pathU = u(d0Var);
                cs(d0Var);
                mt(d0Var);
                w(d0Var);
                boolean zE = e();
                if (this.f7714gv.n3) {
                    fh(d0Var, pathU);
                }
                if (this.f7714gv.zn) {
                    rz(pathU);
                }
                qk(d0Var);
                if (zE) {
                    lc(d0Var);
                }
            }
        }
    }

    public final void g3(fb.x4 x4Var) {
        n("Path render", new Object[0]);
        if (x4Var.xc == null) {
            return;
        }
        ix(this.f7714gv, x4Var);
        if (d0() && i2()) {
            s sVar = this.f7714gv;
            if (sVar.zn || sVar.n3) {
                Matrix matrix = ((fb.t) x4Var).wz;
                if (matrix != null) {
                    this.y.concat(matrix);
                }
                Path pathA = new gv(this, x4Var.xc).a();
                if (x4Var.f7701s == null) {
                    x4Var.f7701s = tl(pathA);
                }
                cs(x4Var);
                mt(x4Var);
                w(x4Var);
                boolean zE = e();
                if (this.f7714gv.n3) {
                    pathA.setFillType(oz());
                    fh(x4Var, pathA);
                }
                if (this.f7714gv.zn) {
                    rz(pathA);
                }
                qk(x4Var);
                if (zE) {
                    lc(x4Var);
                }
            }
        }
    }

    public final void gq(fb.en enVar) {
        n("TextPath render", new Object[0]);
        ix(this.f7714gv, enVar);
        if (d0() && i2()) {
            fb.x4 x4VarWz = enVar.y.wz(enVar.xc);
            if (x4VarWz == null) {
                d("TextPath reference '%s' not found", enVar.xc);
                return;
            }
            fb.x4 x4Var = x4VarWz;
            Path pathA = new gv(this, x4Var.xc).a();
            Matrix matrix = ((fb.t) x4Var).wz;
            if (matrix != null) {
                pathA.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathA, false);
            fb.w wVar = enVar.w;
            float fV = wVar != null ? wVar.v(this, pathMeasure.getLength()) : 0.0f;
            fb.ta.a aVarVl = vl();
            if (aVarVl != fb.ta.a.y) {
                float fWz = wz(enVar);
                if (aVarVl == fb.ta.a.v) {
                    fWz /= 2.0f;
                }
                fV -= fWz;
            }
            mt((fb.x) enVar.v());
            boolean zE = e();
            ta(enVar, new v(this, pathA, fV, 0.0f));
            if (zE) {
                lc(enVar);
            }
        }
    }

    public final Path.FillType hw() {
        fb.ta.y yVar = this.f7714gv.y.jz;
        return (yVar == null || yVar != fb.ta.y.v) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final boolean i2() {
        Boolean bool = this.f7714gv.y.q9;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @TargetApi(ConnectionResult.SERVICE_MISSING_PERMISSION)
    public final Path i9(fb.x xVar, fb.n3 n3Var) {
        Path pathO4;
        fb.v vVarWz = xVar.y.wz(this.f7714gv.y.en);
        if (vVarWz == null) {
            d("ClipPath reference '%s' not found", this.f7714gv.y.en);
            return null;
        }
        fb.v vVar = vVarWz;
        this.f7716v.push(this.f7714gv);
        this.f7714gv = k5(vVar);
        Boolean bool = vVar.w;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(n3Var.y, n3Var.n3);
            matrix.preScale(n3Var.zn, n3Var.f7683gv);
        }
        Matrix matrix2 = ((fb.tl) vVar).xc;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (fb.yt ytVar : vVar.f7676c5) {
            if ((ytVar instanceof fb.x) && (pathO4 = o4((fb.x) ytVar, true)) != null) {
                path.op(pathO4, Path.Op.UNION);
            }
        }
        if (this.f7714gv.y.en != null) {
            if (vVar.f7701s == null) {
                vVar.f7701s = tl(path);
            }
            Path pathI9 = i9(vVar, vVar.f7701s);
            if (pathI9 != null) {
                path.op(pathI9, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f7714gv = this.f7716v.pop();
        return path;
    }

    public final void ix(s sVar, fb.b bVar) {
        sVar.y.zn(bVar.n3 == null);
        fb.ta taVar = bVar.f7671v;
        if (taVar != null) {
            ro(sVar, taVar);
        }
        if (this.zn.i9()) {
            for (n3$w n3_w : this.zn.gv()) {
                if (n3.t(this.f7715s, n3_w.y, bVar)) {
                    ro(sVar, n3_w.n3);
                }
            }
        }
        fb.ta taVar2 = bVar.f7668a;
        if (taVar2 != null) {
            ro(sVar, taVar2);
        }
    }

    public float j() {
        return this.n3;
    }

    public float j5() {
        return this.f7714gv.gv.getTextSize();
    }

    public final Path jz(fb.p pVar) {
        fb.w wVar = pVar.xc;
        float fFb = wVar == null ? 0.0f : wVar.fb(this);
        fb.w wVar2 = pVar.w;
        float fS = wVar2 == null ? 0.0f : wVar2.s(this);
        fb.w wVar3 = pVar.p;
        float fFb2 = wVar3 == null ? 0.0f : wVar3.fb(this);
        fb.w wVar4 = pVar.mt;
        float fS2 = wVar4 != null ? wVar4.s(this) : 0.0f;
        if (pVar.f7701s == null) {
            pVar.f7701s = new fb.n3(Math.min(fFb, fFb2), Math.min(fS, fS2), Math.abs(fFb2 - fFb), Math.abs(fS2 - fS));
        }
        Path path = new Path();
        path.moveTo(fFb, fS);
        path.lineTo(fFb2, fS2);
        return path;
    }

    public final void k(boolean z, fb.n3 n3Var, fb.k5 k5Var) {
        float f3;
        float fV;
        float f4;
        float f5;
        String str = ((fb.i9) k5Var).t;
        if (str != null) {
            ej(k5Var, str);
        }
        Boolean bool = ((fb.i9) k5Var).c5;
        int i = 0;
        boolean z5 = bool != null && bool.booleanValue();
        s sVar = this.f7714gv;
        Paint paint = z ? sVar.gv : sVar.v;
        if (z5) {
            fb.n3 n3VarO = o();
            fb.w wVar = k5Var.tl;
            float fFb = wVar != null ? wVar.fb(this) : 0.0f;
            fb.w wVar2 = k5Var.wz;
            float fS = wVar2 != null ? wVar2.s(this) : 0.0f;
            fb.w wVar3 = k5Var.xc;
            float fFb2 = wVar3 != null ? wVar3.fb(this) : n3VarO.zn;
            fb.w wVar4 = k5Var.w;
            f5 = fFb2;
            f3 = fFb;
            f4 = fS;
            fV = wVar4 != null ? wVar4.s(this) : 0.0f;
        } else {
            fb.w wVar5 = k5Var.tl;
            float fV2 = wVar5 != null ? wVar5.v(this, 1.0f) : 0.0f;
            fb.w wVar6 = k5Var.wz;
            float fV3 = wVar6 != null ? wVar6.v(this, 1.0f) : 0.0f;
            fb.w wVar7 = k5Var.xc;
            float fV4 = wVar7 != null ? wVar7.v(this, 1.0f) : 1.0f;
            fb.w wVar8 = k5Var.w;
            f3 = fV2;
            fV = wVar8 != null ? wVar8.v(this, 1.0f) : 0.0f;
            f4 = fV3;
            f5 = fV4;
        }
        mp();
        this.f7714gv = k5(k5Var);
        Matrix matrix = new Matrix();
        if (!z5) {
            matrix.preTranslate(n3Var.y, n3Var.n3);
            matrix.preScale(n3Var.zn, n3Var.f7683gv);
        }
        Matrix matrix2 = ((fb.i9) k5Var).i9;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = ((fb.i9) k5Var).s.size();
        if (size == 0) {
            q5();
            if (z) {
                this.f7714gv.n3 = false;
                return;
            } else {
                this.f7714gv.zn = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        float f7 = -1.0f;
        for (fb.mg mgVar : ((fb.i9) k5Var).s) {
            Float f8 = mgVar.s;
            float fFloatValue = f8 != null ? f8.floatValue() : 0.0f;
            if (i == 0 || fFloatValue >= f7) {
                fArr[i] = fFloatValue;
                f7 = fFloatValue;
            } else {
                fArr[i] = f7;
            }
            mp();
            ix(this.f7714gv, mgVar);
            fb.ta taVar = this.f7714gv.y;
            fb.a aVar = taVar.f7692k;
            if (aVar == null) {
                aVar = fb.a.v;
            }
            iArr[i] = f3(aVar.y, taVar.f7.floatValue());
            i++;
            q5();
        }
        if ((f3 == f5 && f4 == fV) || size == 1) {
            q5();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        fb.f fVar = ((fb.i9) k5Var).f;
        if (fVar != null) {
            if (fVar == fb.f.v) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (fVar == fb.f.fb) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        q5();
        LinearGradient linearGradient = new LinearGradient(f3, f4, f5, fV, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(i4(this.f7714gv.y.f7695s.floatValue()));
    }

    public final s k5(fb.yt ytVar) {
        s sVar = new s(this);
        ro(sVar, fb.ta.n3());
        return yt(ytVar, sVar);
    }

    public final void kp(fb.xc xcVar) {
        fb.w wVar;
        String str;
        n("Image render", new Object[0]);
        fb.w wVar2 = xcVar.co;
        if (wVar2 == null || wVar2.i9() || (wVar = xcVar.z) == null || wVar.i9() || (str = xcVar.w) == null) {
            return;
        }
        v vVar = xcVar.f7682xc;
        if (vVar == null) {
            vVar = v.f7724v;
        }
        Bitmap bitmapCo = co(str);
        if (bitmapCo == null) {
            fb.fb();
            return;
        }
        fb.n3 n3Var = new fb.n3(0.0f, 0.0f, bitmapCo.getWidth(), bitmapCo.getHeight());
        ix(this.f7714gv, xcVar);
        if (d0() && i2()) {
            Matrix matrix = xcVar.r;
            if (matrix != null) {
                this.y.concat(matrix);
            }
            fb.w wVar3 = xcVar.p;
            float fFb = wVar3 != null ? wVar3.fb(this) : 0.0f;
            fb.w wVar4 = xcVar.mt;
            this.f7714gv.a = new fb.n3(fFb, wVar4 != null ? wVar4.s(this) : 0.0f, xcVar.co.fb(this), xcVar.z.fb(this));
            if (!this.f7714gv.y.f7691j5.booleanValue()) {
                fb.n3 n3Var2 = this.f7714gv.a;
                w9(n3Var2.y, n3Var2.n3, n3Var2.zn, n3Var2.f7683gv);
            }
            xcVar.f7701s = this.f7714gv.a;
            cs(xcVar);
            w(xcVar);
            boolean zE = e();
            yk();
            this.y.save();
            this.y.concat(xc(this.f7714gv.a, n3Var, vVar));
            this.y.drawBitmap(bitmapCo, 0.0f, 0.0f, new Paint(this.f7714gv.y.rs != fb.ta.v.fb ? 2 : 0));
            this.y.restore();
            if (zE) {
                lc(xcVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(fb.o oVar) {
        Set<String> setY;
        String language = Locale.getDefault().getLanguage();
        fb.fb();
        for (fb.yt ytVar : oVar.n3()) {
            if (ytVar instanceof fb.z6) {
                fb.z6 z6Var = (fb.z6) ytVar;
                if (z6Var.zn() == null && ((setY = z6Var.y()) == null || (!setY.isEmpty() && setY.contains(language)))) {
                    Set<String> requiredFeatures = z6Var.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f7711c5 == null) {
                            ut();
                        }
                        if (requiredFeatures.isEmpty() || !f7711c5.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> setT = z6Var.t();
                    if (setT != null) {
                        setT.isEmpty();
                    } else {
                        Set<String> setTl = z6Var.tl();
                        if (setTl == null) {
                            pz(ytVar);
                            return;
                        }
                        setTl.isEmpty();
                    }
                }
            }
        }
    }

    public final void lc(fb.x xVar) {
        nf(xVar, xVar.f7701s);
    }

    public final String le(String str, boolean z, boolean z5) {
        if (this.f7714gv.s) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING).replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }
        if (z5) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void m(fb.c cVar) {
        n("PolyLine render", new Object[0]);
        ix(this.f7714gv, cVar);
        if (d0() && i2()) {
            s sVar = this.f7714gv;
            if (sVar.zn || sVar.n3) {
                Matrix matrix = ((fb.t) cVar).wz;
                if (matrix != null) {
                    this.y.concat(matrix);
                }
                if (cVar.xc.length < 2) {
                    return;
                }
                Path pathU = u(cVar);
                cs(cVar);
                pathU.setFillType(oz());
                mt(cVar);
                w(cVar);
                boolean zE = e();
                if (this.f7714gv.n3) {
                    fh(cVar, pathU);
                }
                if (this.f7714gv.zn) {
                    rz(pathU);
                }
                qk(cVar);
                if (zE) {
                    lc(cVar);
                }
            }
        }
    }

    public final float mg(float f3, float f4, float f5, float f7) {
        return (f3 * f5) + (f4 * f7);
    }

    public final void mp() {
        this.y.save();
        this.f7716v.push(this.f7714gv);
        this.f7714gv = new s(this, this.f7714gv);
    }

    public final void mt(fb.x xVar) {
        fb.vl vlVar = this.f7714gv.y.f7698v;
        if (vlVar instanceof fb.r) {
            c(true, xVar.f7701s, (fb.r) vlVar);
        }
        fb.vl vlVar2 = this.f7714gv.y.f7688f;
        if (vlVar2 instanceof fb.r) {
            c(false, xVar.f7701s, (fb.r) vlVar2);
        }
    }

    public final void nf(fb.x xVar, fb.n3 n3Var) {
        if (this.f7714gv.y.u != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.y.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.y.saveLayer(null, paint2, 31);
            fb.co coVar = (fb.co) this.zn.wz(this.f7714gv.y.u);
            qj(coVar, xVar, n3Var);
            this.y.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.y.saveLayer(null, paint3, 31);
            qj(coVar, xVar, n3Var);
            this.y.restore();
            this.y.restore();
        }
        q5();
    }

    public fb.n3 o() {
        s sVar = this.f7714gv;
        fb.n3 n3Var = sVar.fb;
        return n3Var != null ? n3Var : sVar.a;
    }

    public final void o0(fb.q9 q9Var) {
        n("Text render", new Object[0]);
        ix(this.f7714gv, q9Var);
        if (d0()) {
            Matrix matrix = q9Var.co;
            if (matrix != null) {
                this.y.concat(matrix);
            }
            List list = ((fb.jz) q9Var).xc;
            float fS = 0.0f;
            float fFb = (list == null || list.size() == 0) ? 0.0f : ((fb.w) ((fb.jz) q9Var).xc.get(0)).fb(this);
            List list2 = ((fb.jz) q9Var).w;
            float fS2 = (list2 == null || list2.size() == 0) ? 0.0f : ((fb.w) ((fb.jz) q9Var).w.get(0)).s(this);
            List list3 = ((fb.jz) q9Var).p;
            float fFb2 = (list3 == null || list3.size() == 0) ? 0.0f : ((fb.w) ((fb.jz) q9Var).p.get(0)).fb(this);
            List list4 = ((fb.jz) q9Var).mt;
            if (list4 != null && list4.size() != 0) {
                fS = ((fb.w) ((fb.jz) q9Var).mt.get(0)).s(this);
            }
            fb.ta.a aVarVl = vl();
            if (aVarVl != fb.ta.a.y) {
                float fWz = wz(q9Var);
                if (aVarVl == fb.ta.a.v) {
                    fWz /= 2.0f;
                }
                fFb -= fWz;
            }
            if (q9Var.f7701s == null) {
                c5 c5Var = new c5(this, fFb, fS2);
                ta(q9Var, c5Var);
                RectF rectF = c5Var.gv;
                q9Var.f7701s = new fb.n3(rectF.left, rectF.top, rectF.width(), c5Var.gv.height());
            }
            cs(q9Var);
            mt(q9Var);
            w(q9Var);
            boolean zE = e();
            ta(q9Var, new a(this, fFb + fFb2, fS2 + fS));
            if (zE) {
                lc(q9Var);
            }
        }
    }

    @TargetApi(ConnectionResult.SERVICE_MISSING_PERMISSION)
    public final Path o4(fb.x xVar, boolean z) {
        Path pathXg;
        Path pathI9;
        this.f7716v.push(this.f7714gv);
        s sVar = new s(this, this.f7714gv);
        this.f7714gv = sVar;
        ix(sVar, xVar);
        if (!d0() || !i2()) {
            this.f7714gv = this.f7716v.pop();
            return null;
        }
        if (xVar instanceof fb.dm) {
            if (!z) {
                d("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            fb.dm dmVar = (fb.dm) xVar;
            fb.yt ytVarWz = xVar.y.wz(dmVar.w);
            if (ytVarWz == null) {
                d("Use reference '%s' not found", dmVar.w);
                this.f7714gv = this.f7716v.pop();
                return null;
            }
            if (!(ytVarWz instanceof fb.x)) {
                this.f7714gv = this.f7716v.pop();
                return null;
            }
            pathXg = o4((fb.x) ytVarWz, false);
            if (pathXg == null) {
                return null;
            }
            if (dmVar.f7701s == null) {
                dmVar.f7701s = tl(pathXg);
            }
            Matrix matrix = ((fb.tl) dmVar).xc;
            if (matrix != null) {
                pathXg.transform(matrix);
            }
        } else if (xVar instanceof fb.t) {
            fb.t tVar = (fb.t) xVar;
            if (xVar instanceof fb.x4) {
                pathXg = new gv(this, ((fb.x4) xVar).xc).a();
                if (xVar.f7701s == null) {
                    xVar.f7701s = tl(pathXg);
                }
            } else {
                pathXg = xVar instanceof fb.fh ? y5((fb.fh) xVar) : xVar instanceof fb.gv ? f7((fb.gv) xVar) : xVar instanceof fb.c5 ? en((fb.c5) xVar) : xVar instanceof fb.c ? u((fb.c) xVar) : null;
            }
            if (pathXg == null) {
                return null;
            }
            if (tVar.f7701s == null) {
                tVar.f7701s = tl(pathXg);
            }
            Matrix matrix2 = tVar.wz;
            if (matrix2 != null) {
                pathXg.transform(matrix2);
            }
            pathXg.setFillType(hw());
        } else {
            if (!(xVar instanceof fb.q9)) {
                d("Invalid %s element found in clipPath definition", xVar.wz());
                return null;
            }
            fb.q9 q9Var = (fb.q9) xVar;
            pathXg = xg(q9Var);
            if (pathXg == null) {
                return null;
            }
            Matrix matrix3 = q9Var.co;
            if (matrix3 != null) {
                pathXg.transform(matrix3);
            }
            pathXg.setFillType(hw());
        }
        if (this.f7714gv.y.en != null && (pathI9 = i9(xVar, xVar.f7701s)) != null) {
            pathXg.op(pathI9, Path.Op.INTERSECT);
        }
        this.f7714gv = this.f7716v.pop();
        return pathXg;
    }

    public final void oa() {
        this.f7714gv = new s(this);
        this.f7716v = new Stack<>();
        ro(this.f7714gv, fb.ta.n3());
        s sVar = this.f7714gv;
        sVar.a = null;
        sVar.s = false;
        this.f7716v.push(new s(this, sVar));
        this.f7713fb = new Stack<>();
        this.f7712a = new Stack<>();
    }

    public final Path.FillType oz() {
        fb.ta.y yVar = this.f7714gv.y.f7689fb;
        return (yVar == null || yVar != fb.ta.y.v) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final void p(fb.x xVar, fb.n3 n3Var) {
        Path pathI9;
        if (this.f7714gv.y.en == null || (pathI9 = i9(xVar, n3Var)) == null) {
            return;
        }
        this.y.clipPath(pathI9);
    }

    public final void pq(fb.o oVar) {
        n("Switch render", new Object[0]);
        ix(this.f7714gv, oVar);
        if (d0()) {
            Matrix matrix = ((fb.tl) oVar).xc;
            if (matrix != null) {
                this.y.concat(matrix);
            }
            w(oVar);
            boolean zE = e();
            l(oVar);
            if (zE) {
                lc(oVar);
            }
            cs(oVar);
        }
    }

    public final void pz(fb.yt ytVar) {
        if (ytVar instanceof fb.z) {
            return;
        }
        mp();
        r(ytVar);
        if (ytVar instanceof fb.d) {
            bk((fb.d) ytVar);
        } else if (ytVar instanceof fb.dm) {
            xb((fb.dm) ytVar);
        } else if (ytVar instanceof fb.o) {
            pq((fb.o) ytVar);
        } else if (ytVar instanceof fb.tl) {
            yc((fb.tl) ytVar);
        } else if (ytVar instanceof fb.xc) {
            kp((fb.xc) ytVar);
        } else if (ytVar instanceof fb.x4) {
            g3((fb.x4) ytVar);
        } else if (ytVar instanceof fb.fh) {
            u0((fb.fh) ytVar);
        } else if (ytVar instanceof fb.gv) {
            ap((fb.gv) ytVar);
        } else if (ytVar instanceof fb.c5) {
            yg((fb.c5) ytVar);
        } else if (ytVar instanceof fb.p) {
            rb((fb.p) ytVar);
        } else if (ytVar instanceof fb.d0) {
            g((fb.d0) ytVar);
        } else if (ytVar instanceof fb.c) {
            m((fb.c) ytVar);
        } else if (ytVar instanceof fb.q9) {
            o0((fb.q9) ytVar);
        }
        q5();
    }

    public final void q5() {
        this.y.restore();
        this.f7714gv = this.f7716v.pop();
    }

    public final boolean q9(fb.ta taVar, long j) {
        return (taVar.y & j) != 0;
    }

    public final void qj(fb.co coVar, fb.x xVar, fb.n3 n3Var) {
        float fFb;
        float fS;
        n("Mask render", new Object[0]);
        Boolean bool = coVar.xc;
        if (bool == null || !bool.booleanValue()) {
            fb.w wVar = coVar.co;
            float fV = wVar != null ? wVar.v(this, 1.0f) : 1.2f;
            fb.w wVar2 = coVar.z;
            float fV2 = wVar2 != null ? wVar2.v(this, 1.0f) : 1.2f;
            fFb = fV * n3Var.zn;
            fS = fV2 * n3Var.f7683gv;
        } else {
            fb.w wVar3 = coVar.co;
            fFb = wVar3 != null ? wVar3.fb(this) : n3Var.zn;
            fb.w wVar4 = coVar.z;
            fS = wVar4 != null ? wVar4.s(this) : n3Var.f7683gv;
        }
        if (fFb == 0.0f || fS == 0.0f) {
            return;
        }
        mp();
        s sVarK5 = k5(coVar);
        this.f7714gv = sVarK5;
        sVarK5.y.n = Float.valueOf(1.0f);
        boolean zE = e();
        this.y.save();
        Boolean bool2 = coVar.w;
        if (bool2 != null && !bool2.booleanValue()) {
            this.y.translate(n3Var.y, n3Var.n3);
            this.y.scale(n3Var.zn, n3Var.f7683gv);
        }
        wf(coVar, false);
        this.y.restore();
        if (zE) {
            nf(xVar, n3Var);
        }
        q5();
    }

    public final void qk(fb.t tVar) {
        fb.mt mtVar;
        fb.mt mtVar2;
        fb.mt mtVar3;
        int size;
        fb.ta taVar = this.f7714gv.y;
        String str = taVar.o;
        if (str == null && taVar.j == null && taVar.oz == null) {
            return;
        }
        if (str == null) {
            mtVar = null;
        } else {
            fb.yt ytVarWz = tVar.y.wz(str);
            if (ytVarWz != null) {
                mtVar = (fb.mt) ytVarWz;
            } else {
                d("Marker reference '%s' not found", this.f7714gv.y.o);
                mtVar = null;
            }
        }
        String str2 = this.f7714gv.y.j;
        if (str2 == null) {
            mtVar2 = null;
        } else {
            fb.yt ytVarWz2 = tVar.y.wz(str2);
            if (ytVarWz2 != null) {
                mtVar2 = (fb.mt) ytVarWz2;
            } else {
                d("Marker reference '%s' not found", this.f7714gv.y.j);
                mtVar2 = null;
            }
        }
        String str3 = this.f7714gv.y.oz;
        if (str3 == null) {
            mtVar3 = null;
        } else {
            fb.yt ytVarWz3 = tVar.y.wz(str3);
            if (ytVarWz3 != null) {
                mtVar3 = (fb.mt) ytVarWz3;
            } else {
                d("Marker reference '%s' not found", this.f7714gv.y.oz);
                mtVar3 = null;
            }
        }
        List<zn> listA = tVar instanceof fb.x4 ? new n3(this, ((fb.x4) tVar).xc).a() : tVar instanceof fb.p ? f((fb.p) tVar) : t((fb.c) tVar);
        if (listA == null || (size = listA.size()) == 0) {
            return;
        }
        fb.ta taVar2 = this.f7714gv.y;
        taVar2.oz = null;
        taVar2.j = null;
        taVar2.o = null;
        if (mtVar != null) {
            cy(mtVar, listA.get(0));
        }
        if (mtVar2 != null && listA.size() > 2) {
            zn znVarS8 = listA.get(0);
            zn znVar = listA.get(1);
            int i = 1;
            while (i < size - 1) {
                i++;
                zn znVar2 = listA.get(i);
                znVarS8 = znVar.v ? s8(znVarS8, znVar, znVar2) : znVar;
                cy(mtVar2, znVarS8);
                znVar = znVar2;
            }
        }
        if (mtVar3 != null) {
            cy(mtVar3, listA.get(size - 1));
        }
    }

    public float qn() {
        return this.f7714gv.gv.getTextSize() / 2.0f;
    }

    public final void r(fb.yt ytVar) {
        Boolean bool;
        if ((ytVar instanceof fb.b) && (bool = ((fb.b) ytVar).f7670gv) != null) {
            this.f7714gv.s = bool.booleanValue();
        }
    }

    public final void ra(fb.yt ytVar, i9 i9Var) {
        float f3;
        float fS;
        float fFb;
        fb.ta.a aVarVl;
        if (i9Var.y((fb.f7) ytVar)) {
            if (ytVar instanceof fb.en) {
                mp();
                gq((fb.en) ytVar);
                q5();
                return;
            }
            if (!(ytVar instanceof fb.ut)) {
                if (ytVar instanceof fb.oz) {
                    mp();
                    fb.b bVar = (fb.oz) ytVar;
                    ix(this.f7714gv, bVar);
                    if (d0()) {
                        mt(bVar.v());
                        fb.f7 f7VarWz = ytVar.y.wz(((fb.oz) bVar).xc);
                        if (f7VarWz == null || !(f7VarWz instanceof fb.f7)) {
                            d("Tref reference '%s' not found", ((fb.oz) bVar).xc);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            z6(f7VarWz, sb);
                            if (sb.length() > 0) {
                                i9Var.n3(sb.toString());
                            }
                        }
                    }
                    q5();
                    return;
                }
                return;
            }
            n("TSpan render", new Object[0]);
            mp();
            fb.f7 f7Var = (fb.ut) ytVar;
            ix(this.f7714gv, f7Var);
            if (d0()) {
                List list = ((fb.jz) f7Var).xc;
                boolean z = list != null && list.size() > 0;
                boolean z5 = i9Var instanceof a;
                float fS2 = 0.0f;
                if (z5) {
                    float fFb2 = !z ? ((a) i9Var).n3 : ((fb.w) ((fb.jz) f7Var).xc.get(0)).fb(this);
                    List list2 = ((fb.jz) f7Var).w;
                    fS = (list2 == null || list2.size() == 0) ? ((a) i9Var).zn : ((fb.w) ((fb.jz) f7Var).w.get(0)).s(this);
                    List list3 = ((fb.jz) f7Var).p;
                    fFb = (list3 == null || list3.size() == 0) ? 0.0f : ((fb.w) ((fb.jz) f7Var).p.get(0)).fb(this);
                    List list4 = ((fb.jz) f7Var).mt;
                    if (list4 != null && list4.size() != 0) {
                        fS2 = ((fb.w) ((fb.jz) f7Var).mt.get(0)).s(this);
                    }
                    f3 = fS2;
                    fS2 = fFb2;
                } else {
                    f3 = 0.0f;
                    fS = 0.0f;
                    fFb = 0.0f;
                }
                if (z && (aVarVl = vl()) != fb.ta.a.y) {
                    float fWz = wz(f7Var);
                    if (aVarVl == fb.ta.a.v) {
                        fWz /= 2.0f;
                    }
                    fS2 -= fWz;
                }
                mt(f7Var.v());
                if (z5) {
                    a aVar = (a) i9Var;
                    aVar.n3 = fS2 + fFb;
                    aVar.zn = fS + f3;
                }
                boolean zE = e();
                ta(f7Var, i9Var);
                if (zE) {
                    lc(f7Var);
                }
            }
            q5();
        }
    }

    public final void rb(fb.p pVar) {
        n("Line render", new Object[0]);
        ix(this.f7714gv, pVar);
        if (d0() && i2() && this.f7714gv.zn) {
            Matrix matrix = ((fb.t) pVar).wz;
            if (matrix != null) {
                this.y.concat(matrix);
            }
            Path pathJz = jz(pVar);
            cs(pVar);
            mt(pVar);
            w(pVar);
            boolean zE = e();
            rz(pathJz);
            qk(pVar);
            if (zE) {
                lc(pVar);
            }
        }
    }

    public final void ro(s sVar, fb.ta taVar) {
        if (q9(taVar, 4096L)) {
            sVar.y.c = taVar.c;
        }
        if (q9(taVar, 2048L)) {
            sVar.y.n = taVar.n;
        }
        if (q9(taVar, 1L)) {
            sVar.y.f7698v = taVar.f7698v;
            fb.a aVar = taVar.f7698v;
            sVar.n3 = (aVar == null || aVar == fb.a.fb) ? false : true;
        }
        if (q9(taVar, 4L)) {
            sVar.y.f7695s = taVar.f7695s;
        }
        if (q9(taVar, 6149L)) {
            w2(sVar, true, sVar.y.f7698v);
        }
        if (q9(taVar, 2L)) {
            sVar.y.f7689fb = taVar.f7689fb;
        }
        if (q9(taVar, 8L)) {
            sVar.y.f7688f = taVar.f7688f;
            fb.a aVar2 = taVar.f7688f;
            sVar.zn = (aVar2 == null || aVar2 == fb.a.fb) ? false : true;
        }
        if (q9(taVar, 16L)) {
            sVar.y.f7696t = taVar.f7696t;
        }
        if (q9(taVar, 6168L)) {
            w2(sVar, false, sVar.y.f7688f);
        }
        if (q9(taVar, 34359738368L)) {
            sVar.y.o4 = taVar.o4;
        }
        if (q9(taVar, 32L)) {
            fb.ta taVar2 = sVar.y;
            fb.w wVar = taVar.w;
            taVar2.w = wVar;
            sVar.v.setStrokeWidth(wVar.gv(this));
        }
        if (q9(taVar, 64L)) {
            sVar.y.f7693p = taVar.f7693p;
            int i = y.n3[taVar.f7693p.ordinal()];
            if (i == 1) {
                sVar.v.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                sVar.v.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                sVar.v.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (q9(taVar, 128L)) {
            sVar.y.f7685co = taVar.f7685co;
            int i5 = y.zn[taVar.f7685co.ordinal()];
            if (i5 == 1) {
                sVar.v.setStrokeJoin(Paint.Join.MITER);
            } else if (i5 == 2) {
                sVar.v.setStrokeJoin(Paint.Join.ROUND);
            } else if (i5 == 3) {
                sVar.v.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (q9(taVar, 256L)) {
            sVar.y.z = taVar.z;
            sVar.v.setStrokeMiter(taVar.z.floatValue());
        }
        if (q9(taVar, 512L)) {
            sVar.y.f7694r = taVar.f7694r;
        }
        if (q9(taVar, 1024L)) {
            sVar.y.f3 = taVar.f3;
        }
        Typeface typefaceZ = null;
        if (q9(taVar, 1536L)) {
            fb.w[] wVarArr = sVar.y.f7694r;
            if (wVarArr == null) {
                sVar.v.setPathEffect(null);
            } else {
                int length = wVarArr.length;
                int i8 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i8];
                float f3 = 0.0f;
                for (int i10 = 0; i10 < i8; i10++) {
                    float fGv = sVar.y.f7694r[i10 % length].gv(this);
                    fArr[i10] = fGv;
                    f3 += fGv;
                }
                if (f3 == 0.0f) {
                    sVar.v.setPathEffect(null);
                } else {
                    float fGv2 = sVar.y.f3.gv(this);
                    if (fGv2 < 0.0f) {
                        fGv2 = (fGv2 % f3) + f3;
                    }
                    sVar.v.setPathEffect(new DashPathEffect(fArr, fGv2));
                }
            }
        }
        if (q9(taVar, 16384L)) {
            float fJ5 = j5();
            sVar.y.fh = taVar.fh;
            sVar.gv.setTextSize(taVar.fh.v(this, fJ5));
            sVar.v.setTextSize(taVar.fh.v(this, fJ5));
        }
        if (q9(taVar, 8192L)) {
            sVar.y.d0 = taVar.d0;
        }
        if (q9(taVar, 32768L)) {
            if (taVar.f7686d.intValue() == -1 && sVar.y.f7686d.intValue() > 100) {
                fb.ta taVar3 = sVar.y;
                taVar3.f7686d = Integer.valueOf(taVar3.f7686d.intValue() - 100);
            } else if (taVar.f7686d.intValue() != 1 || sVar.y.f7686d.intValue() >= 900) {
                sVar.y.f7686d = taVar.f7686d;
            } else {
                fb.ta taVar4 = sVar.y;
                taVar4.f7686d = Integer.valueOf(taVar4.f7686d.intValue() + 100);
            }
        }
        if (q9(taVar, 65536L)) {
            sVar.y.f7687ej = taVar.f7687ej;
        }
        if (q9(taVar, 106496L)) {
            if (sVar.y.d0 != null && this.zn != null) {
                fb.fb();
                for (String str : sVar.y.d0) {
                    fb.ta taVar5 = sVar.y;
                    typefaceZ = z(str, taVar5.f7686d, taVar5.f7687ej);
                    if (typefaceZ != null) {
                        break;
                    }
                }
            }
            if (typefaceZ == null) {
                fb.ta taVar6 = sVar.y;
                typefaceZ = z("serif", taVar6.f7686d, taVar6.f7687ej);
            }
            sVar.gv.setTypeface(typefaceZ);
            sVar.v.setTypeface(typefaceZ);
        }
        if (q9(taVar, 131072L)) {
            sVar.y.f7699x = taVar.f7699x;
            Paint paint = sVar.gv;
            fb.ta.fb fbVar = taVar.f7699x;
            fb.ta.fb fbVar2 = fb.ta.fb.s;
            paint.setStrikeThruText(fbVar == fbVar2);
            Paint paint2 = sVar.gv;
            fb.ta.fb fbVar3 = taVar.f7699x;
            fb.ta.fb fbVar4 = fb.ta.fb.v;
            paint2.setUnderlineText(fbVar3 == fbVar4);
            sVar.v.setStrikeThruText(taVar.f7699x == fbVar2);
            sVar.v.setUnderlineText(taVar.f7699x == fbVar4);
        }
        if (q9(taVar, 68719476736L)) {
            sVar.y.f7684b = taVar.f7684b;
        }
        if (q9(taVar, 262144L)) {
            sVar.y.f7690hw = taVar.f7690hw;
        }
        if (q9(taVar, 524288L)) {
            sVar.y.f7691j5 = taVar.f7691j5;
        }
        if (q9(taVar, 2097152L)) {
            sVar.y.o = taVar.o;
        }
        if (q9(taVar, 4194304L)) {
            sVar.y.j = taVar.j;
        }
        if (q9(taVar, 8388608L)) {
            sVar.y.oz = taVar.oz;
        }
        if (q9(taVar, 16777216L)) {
            sVar.y.f7697ut = taVar.f7697ut;
        }
        if (q9(taVar, 33554432L)) {
            sVar.y.q9 = taVar.q9;
        }
        if (q9(taVar, 1048576L)) {
            sVar.y.qn = taVar.qn;
        }
        if (q9(taVar, 268435456L)) {
            sVar.y.en = taVar.en;
        }
        if (q9(taVar, 536870912L)) {
            sVar.y.jz = taVar.jz;
        }
        if (q9(taVar, 1073741824L)) {
            sVar.y.u = taVar.u;
        }
        if (q9(taVar, 67108864L)) {
            sVar.y.f7692k = taVar.f7692k;
        }
        if (q9(taVar, 134217728L)) {
            sVar.y.f7 = taVar.f7;
        }
        if (q9(taVar, 8589934592L)) {
            sVar.y.dm = taVar.dm;
        }
        if (q9(taVar, 17179869184L)) {
            sVar.y.ct = taVar.ct;
        }
        if (q9(taVar, 137438953472L)) {
            sVar.y.rs = taVar.rs;
        }
    }

    public final void rs() {
        this.f7712a.pop();
        this.f7713fb.pop();
    }

    public final void rz(Path path) {
        s sVar = this.f7714gv;
        if (sVar.y.o4 != fb.ta.c5.v) {
            this.y.drawPath(path, sVar.v);
            return;
        }
        Matrix matrix = this.y.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.y.setMatrix(new Matrix());
        Shader shader = this.f7714gv.v.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.y.drawPath(path2, this.f7714gv.v);
        this.y.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final zn s8(zn znVar, zn znVar2, zn znVar3) {
        float fMg = mg(znVar2.zn, znVar2.gv, znVar2.y - znVar.y, znVar2.n3 - znVar.n3);
        if (fMg == 0.0f) {
            fMg = mg(znVar2.zn, znVar2.gv, znVar3.y - znVar2.y, znVar3.n3 - znVar2.n3);
        }
        if (fMg > 0.0f) {
            return znVar2;
        }
        if (fMg == 0.0f && (znVar2.zn > 0.0f || znVar2.gv >= 0.0f)) {
            return znVar2;
        }
        znVar2.zn = -znVar2.zn;
        znVar2.gv = -znVar2.gv;
        return znVar2;
    }

    public final List<zn> t(fb.c cVar) {
        int length = cVar.xc.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = cVar.xc;
        zn znVar = new zn(this, fArr[0], fArr[1], 0.0f, 0.0f);
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i < length) {
            float[] fArr2 = cVar.xc;
            float f5 = fArr2[i];
            float f7 = fArr2[i + 1];
            znVar.y(f5, f7);
            arrayList.add(znVar);
            i += 2;
            znVar = new zn(this, f5, f7, f5 - znVar.y, f7 - znVar.n3);
            f4 = f7;
            f3 = f5;
        }
        if (cVar instanceof fb.d0) {
            float[] fArr3 = cVar.xc;
            float f8 = fArr3[0];
            if (f3 != f8) {
                float f9 = fArr3[1];
                if (f4 != f9) {
                    znVar.y(f8, f9);
                    arrayList.add(znVar);
                    zn znVar2 = new zn(this, f8, f9, f8 - znVar.y, f9 - znVar.n3);
                    znVar2.n3((zn) arrayList.get(0));
                    arrayList.add(znVar2);
                    arrayList.set(0, znVar2);
                }
            }
        } else {
            arrayList.add(znVar);
        }
        return arrayList;
    }

    public final void ta(fb.f7 f7Var, i9 i9Var) {
        if (d0()) {
            Iterator<fb.yt> it = f7Var.f7676c5.iterator();
            boolean z = true;
            while (it.hasNext()) {
                fb.y5 y5Var = (fb.yt) it.next();
                if (y5Var instanceof fb.y5) {
                    i9Var.n3(le(y5Var.zn, z, !it.hasNext()));
                } else {
                    ra(y5Var, i9Var);
                }
                z = false;
            }
        }
    }

    public final void tg(fb.d dVar, fb.n3 n3Var, fb.n3 n3Var2, v vVar) {
        n("Svg render", new Object[0]);
        if (n3Var.zn == 0.0f || n3Var.f7683gv == 0.0f) {
            return;
        }
        if (vVar == null && (vVar = dVar.f7682xc) == null) {
            vVar = v.f7724v;
        }
        ix(this.f7714gv, dVar);
        if (d0()) {
            s sVar = this.f7714gv;
            sVar.a = n3Var;
            if (!sVar.y.f7691j5.booleanValue()) {
                fb.n3 n3Var3 = this.f7714gv.a;
                w9(n3Var3.y, n3Var3.n3, n3Var3.zn, n3Var3.f7683gv);
            }
            p(dVar, this.f7714gv.a);
            if (n3Var2 != null) {
                this.y.concat(xc(this.f7714gv.a, n3Var2, vVar));
                this.f7714gv.fb = dVar.w;
            } else {
                Canvas canvas = this.y;
                fb.n3 n3Var4 = this.f7714gv.a;
                canvas.translate(n3Var4.y, n3Var4.n3);
            }
            boolean zE = e();
            yk();
            wf(dVar, true);
            if (zE) {
                lc(dVar);
            }
            cs(dVar);
        }
    }

    public final fb.n3 tl(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new fb.n3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final Path u(fb.c cVar) {
        Path path = new Path();
        float[] fArr = cVar.xc;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = cVar.xc;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (cVar instanceof fb.d0) {
            path.close();
        }
        if (cVar.f7701s == null) {
            cVar.f7701s = tl(path);
        }
        return path;
    }

    public final void u0(fb.fh fhVar) {
        n("Rect render", new Object[0]);
        fb.w wVar = fhVar.p;
        if (wVar == null || fhVar.mt == null || wVar.i9() || fhVar.mt.i9()) {
            return;
        }
        ix(this.f7714gv, fhVar);
        if (d0() && i2()) {
            Matrix matrix = ((fb.t) fhVar).wz;
            if (matrix != null) {
                this.y.concat(matrix);
            }
            Path pathY5 = y5(fhVar);
            cs(fhVar);
            mt(fhVar);
            w(fhVar);
            boolean zE = e();
            if (this.f7714gv.n3) {
                fh(fhVar, pathY5);
            }
            if (this.f7714gv.zn) {
                rz(pathY5);
            }
            if (zE) {
                lc(fhVar);
            }
        }
    }

    public final void ud(fb.k5 k5Var, fb.k5 k5Var2) {
        if (k5Var.tl == null) {
            k5Var.tl = k5Var2.tl;
        }
        if (k5Var.wz == null) {
            k5Var.wz = k5Var2.wz;
        }
        if (k5Var.xc == null) {
            k5Var.xc = k5Var2.xc;
        }
        if (k5Var.w == null) {
            k5Var.w = k5Var2.w;
        }
    }

    public final fb.ta.a vl() {
        fb.ta.a aVar;
        fb.ta taVar = this.f7714gv.y;
        if (taVar.f7684b == fb.ta.s.y || (aVar = taVar.f7690hw) == fb.ta.a.v) {
            return taVar.f7690hw;
        }
        fb.ta.a aVar2 = fb.ta.a.y;
        return aVar == aVar2 ? fb.ta.a.fb : aVar2;
    }

    public final boolean vp() {
        return this.f7714gv.y.n.floatValue() < 1.0f || this.f7714gv.y.u != null;
    }

    public final void w(fb.x xVar) {
        p(xVar, xVar.f7701s);
    }

    public final void w2(s sVar, boolean z, fb.vl vlVar) {
        int i;
        fb.ta taVar = sVar.y;
        float fFloatValue = (z ? taVar.f7695s : taVar.f7696t).floatValue();
        if (vlVar instanceof fb.a) {
            i = ((fb.a) vlVar).y;
        } else if (!(vlVar instanceof fb.fb)) {
            return;
        } else {
            i = sVar.y.c.y;
        }
        int iF3 = f3(i, fFloatValue);
        if (z) {
            sVar.gv.setColor(iF3);
        } else {
            sVar.v.setColor(iF3);
        }
    }

    public final void w9(float f3, float f4, float f5, float f7) {
        float fFb = f5 + f3;
        float fS = f7 + f4;
        fb.zn znVar = this.f7714gv.y.qn;
        if (znVar != null) {
            f3 += znVar.gv.fb(this);
            f4 += this.f7714gv.y.qn.y.s(this);
            fFb -= this.f7714gv.y.qn.n3.fb(this);
            fS -= this.f7714gv.y.qn.zn.s(this);
        }
        this.y.clipRect(f3, f4, fFb, fS);
    }

    public final void wf(fb.a8 a8Var, boolean z) {
        if (z) {
            eb(a8Var);
        }
        Iterator<fb.yt> it = a8Var.n3().iterator();
        while (it.hasNext()) {
            pz(it.next());
        }
        if (z) {
            rs();
        }
    }

    public final float wz(fb.f7 f7Var) {
        f fVar = new f(this, (y) null);
        ta(f7Var, fVar);
        return fVar.n3;
    }

    public final void x(fb.n nVar, String str) {
        fb.n nVarWz = nVar.y.wz(str);
        if (nVarWz == null) {
            i3("Pattern reference '%s' not found", str);
            return;
        }
        if (!(nVarWz instanceof fb.n)) {
            d("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (nVarWz == nVar) {
            d("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        fb.n nVar2 = nVarWz;
        if (nVar.p == null) {
            nVar.p = nVar2.p;
        }
        if (nVar.mt == null) {
            nVar.mt = nVar2.mt;
        }
        if (nVar.co == null) {
            nVar.co = nVar2.co;
        }
        if (nVar.z == null) {
            nVar.z = nVar2.z;
        }
        if (nVar.r == null) {
            nVar.r = nVar2.r;
        }
        if (nVar.x4 == null) {
            nVar.x4 = nVar2.x4;
        }
        if (nVar.i4 == null) {
            nVar.i4 = nVar2.i4;
        }
        if (nVar.f7676c5.isEmpty()) {
            nVar.f7676c5 = nVar2.f7676c5;
        }
        if (nVar.w == null) {
            nVar.w = nVar2.w;
        }
        if (nVar.f7682xc == null) {
            nVar.f7682xc = nVar2.f7682xc;
        }
        String str2 = nVar2.f3;
        if (str2 != null) {
            x(nVar, str2);
        }
    }

    public final void x5(boolean z, fb.rz rzVar) {
        if (z) {
            if (q9(rzVar.f7671v, 2147483648L)) {
                s sVar = this.f7714gv;
                fb.ta taVar = sVar.y;
                fb.vl vlVar = rzVar.f7671v.y5;
                taVar.f7698v = vlVar;
                sVar.n3 = vlVar != null;
            }
            if (q9(rzVar.f7671v, 4294967296L)) {
                this.f7714gv.y.f7695s = rzVar.f7671v.xg;
            }
            if (q9(rzVar.f7671v, 6442450944L)) {
                s sVar2 = this.f7714gv;
                w2(sVar2, z, sVar2.y.f7698v);
                return;
            }
            return;
        }
        if (q9(rzVar.f7671v, 2147483648L)) {
            s sVar3 = this.f7714gv;
            fb.ta taVar2 = sVar3.y;
            fb.vl vlVar2 = rzVar.f7671v.y5;
            taVar2.f7688f = vlVar2;
            sVar3.zn = vlVar2 != null;
        }
        if (q9(rzVar.f7671v, 4294967296L)) {
            this.f7714gv.y.f7696t = rzVar.f7671v.xg;
        }
        if (q9(rzVar.f7671v, 6442450944L)) {
            s sVar4 = this.f7714gv;
            w2(sVar4, z, sVar4.y.f7688f);
        }
    }

    public final void xb(fb.dm dmVar) {
        n("Use render", new Object[0]);
        fb.w wVar = dmVar.co;
        if (wVar == null || !wVar.i9()) {
            fb.w wVar2 = dmVar.z;
            if (wVar2 == null || !wVar2.i9()) {
                ix(this.f7714gv, dmVar);
                if (d0()) {
                    fb.yt ytVarWz = dmVar.y.wz(dmVar.w);
                    if (ytVarWz == null) {
                        d("Use reference '%s' not found", dmVar.w);
                        return;
                    }
                    Matrix matrix = ((fb.tl) dmVar).xc;
                    if (matrix != null) {
                        this.y.concat(matrix);
                    }
                    fb.w wVar3 = dmVar.p;
                    float fFb = wVar3 != null ? wVar3.fb(this) : 0.0f;
                    fb.w wVar4 = dmVar.mt;
                    this.y.translate(fFb, wVar4 != null ? wVar4.s(this) : 0.0f);
                    w(dmVar);
                    boolean zE = e();
                    eb(dmVar);
                    if (ytVarWz instanceof fb.d) {
                        fb.n3 n3VarCt = ct(null, null, dmVar.co, dmVar.z);
                        mp();
                        y4((fb.d) ytVarWz, n3VarCt);
                        q5();
                    } else if (ytVarWz instanceof fb.j) {
                        fb.w wVar5 = dmVar.co;
                        if (wVar5 == null) {
                            wVar5 = new fb.w(100.0f, fb.xg.percent);
                        }
                        fb.w wVar6 = dmVar.z;
                        if (wVar6 == null) {
                            wVar6 = new fb.w(100.0f, fb.xg.percent);
                        }
                        fb.n3 n3VarCt2 = ct(null, null, wVar5, wVar6);
                        mp();
                        cr((fb.j) ytVarWz, n3VarCt2);
                        q5();
                    } else {
                        pz(ytVarWz);
                    }
                    rs();
                    if (zE) {
                        lc(dmVar);
                    }
                    cs(dmVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix xc(r5.fb.n3 r10, r5.fb.n3 r11, r5.v r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            r5.v$y r1 = r12.y()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.zn
            float r2 = r11.zn
            float r1 = r1 / r2
            float r2 = r10.f7683gv
            float r3 = r11.f7683gv
            float r2 = r2 / r3
            float r3 = r11.y
            float r3 = -r3
            float r4 = r11.n3
            float r4 = -r4
            r5.v r5 = r5.v.f7721gv
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.y
            float r10 = r10.n3
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            r5.v$n3 r5 = r12.n3()
            r5.v$n3 r6 = r5.v.n3.v
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.zn
            float r2 = r2 / r1
            float r5 = r10.f7683gv
            float r5 = r5 / r1
            int[] r6 = r5.s.y.y
            r5.v$y r7 = r12.y()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.zn
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.zn
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            r5.v$y r12 = r12.y()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f7683gv
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f7683gv
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.y
            float r10 = r10.n3
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.s.xc(r5.fb$n3, r5.fb$n3, r5.v):android.graphics.Matrix");
    }

    public final Path xg(fb.q9 q9Var) {
        List list = ((fb.jz) q9Var).xc;
        float fS = 0.0f;
        float fFb = (list == null || list.size() == 0) ? 0.0f : ((fb.w) ((fb.jz) q9Var).xc.get(0)).fb(this);
        List list2 = ((fb.jz) q9Var).w;
        float fS2 = (list2 == null || list2.size() == 0) ? 0.0f : ((fb.w) ((fb.jz) q9Var).w.get(0)).s(this);
        List list3 = ((fb.jz) q9Var).p;
        float fFb2 = (list3 == null || list3.size() == 0) ? 0.0f : ((fb.w) ((fb.jz) q9Var).p.get(0)).fb(this);
        List list4 = ((fb.jz) q9Var).mt;
        if (list4 != null && list4.size() != 0) {
            fS = ((fb.w) ((fb.jz) q9Var).mt.get(0)).s(this);
        }
        if (this.f7714gv.y.f7690hw != fb.ta.a.y) {
            float fWz = wz(q9Var);
            if (this.f7714gv.y.f7690hw == fb.ta.a.v) {
                fWz /= 2.0f;
            }
            fFb -= fWz;
        }
        if (q9Var.f7701s == null) {
            c5 c5Var = new c5(this, fFb, fS2);
            ta(q9Var, c5Var);
            RectF rectF = c5Var.gv;
            q9Var.f7701s = new fb.n3(rectF.left, rectF.top, rectF.width(), c5Var.gv.height());
        }
        Path path = new Path();
        ta(q9Var, new fb(this, fFb + fFb2, fS2 + fS, path));
        return path;
    }

    public final void y4(fb.d dVar, fb.n3 n3Var) {
        tg(dVar, n3Var, dVar.w, dVar.f7682xc);
    }

    public final Path y5(fb.fh fhVar) {
        float fFb;
        float fS;
        Path path;
        fb.w wVar = fhVar.co;
        if (wVar == null && fhVar.z == null) {
            fFb = 0.0f;
            fS = 0.0f;
        } else {
            if (wVar == null) {
                fFb = fhVar.z.s(this);
            } else if (fhVar.z == null) {
                fFb = wVar.fb(this);
            } else {
                fFb = wVar.fb(this);
                fS = fhVar.z.s(this);
            }
            fS = fFb;
        }
        float fMin = Math.min(fFb, fhVar.p.fb(this) / 2.0f);
        float fMin2 = Math.min(fS, fhVar.mt.s(this) / 2.0f);
        fb.w wVar2 = fhVar.xc;
        float fFb2 = wVar2 != null ? wVar2.fb(this) : 0.0f;
        fb.w wVar3 = fhVar.w;
        float fS2 = wVar3 != null ? wVar3.s(this) : 0.0f;
        float fFb3 = fhVar.p.fb(this);
        float fS3 = fhVar.mt.s(this);
        if (fhVar.f7701s == null) {
            fhVar.f7701s = new fb.n3(fFb2, fS2, fFb3, fS3);
        }
        float f3 = fFb2 + fFb3;
        float f4 = fS2 + fS3;
        Path path2 = new Path();
        if (fMin == 0.0f || fMin2 == 0.0f) {
            path = path2;
            path.moveTo(fFb2, fS2);
            path.lineTo(f3, fS2);
            path.lineTo(f3, f4);
            path.lineTo(fFb2, f4);
            path.lineTo(fFb2, fS2);
        } else {
            float f5 = fMin * 0.5522848f;
            float f7 = 0.5522848f * fMin2;
            float f8 = fS2 + fMin2;
            path2.moveTo(fFb2, f8);
            float f9 = f8 - f7;
            float f10 = fFb2 + fMin;
            float f11 = f10 - f5;
            path2.cubicTo(fFb2, f9, f11, fS2, f10, fS2);
            float f12 = f3 - fMin;
            path2.lineTo(f12, fS2);
            float f13 = f12 + f5;
            path2.cubicTo(f13, fS2, f3, f9, f3, f8);
            float f14 = f4 - fMin2;
            path2.lineTo(f3, f14);
            float f15 = f14 + f7;
            path = path2;
            path2.cubicTo(f3, f15, f13, f4, f12, f4);
            path.lineTo(f10, f4);
            path.cubicTo(f11, f4, fFb2, f15, fFb2, f14);
            path.lineTo(fFb2, f8);
        }
        path.close();
        return path;
    }

    public final void yc(fb.tl tlVar) {
        n("Group render", new Object[0]);
        ix(this.f7714gv, tlVar);
        if (d0()) {
            Matrix matrix = tlVar.xc;
            if (matrix != null) {
                this.y.concat(matrix);
            }
            w(tlVar);
            boolean zE = e();
            wf(tlVar, true);
            if (zE) {
                lc(tlVar);
            }
            cs(tlVar);
        }
    }

    public final void yg(fb.c5 c5Var) {
        n("Ellipse render", new Object[0]);
        fb.w wVar = c5Var.p;
        if (wVar == null || c5Var.mt == null || wVar.i9() || c5Var.mt.i9()) {
            return;
        }
        ix(this.f7714gv, c5Var);
        if (d0() && i2()) {
            Matrix matrix = ((fb.t) c5Var).wz;
            if (matrix != null) {
                this.y.concat(matrix);
            }
            Path pathEn = en(c5Var);
            cs(c5Var);
            mt(c5Var);
            w(c5Var);
            boolean zE = e();
            if (this.f7714gv.n3) {
                fh(c5Var, pathEn);
            }
            if (this.f7714gv.zn) {
                rz(pathEn);
            }
            if (zE) {
                lc(c5Var);
            }
        }
    }

    public final void yk() {
        int iF3;
        fb.ta taVar = this.f7714gv.y;
        fb.a aVar = taVar.dm;
        if (aVar instanceof fb.a) {
            iF3 = aVar.y;
        } else if (!(aVar instanceof fb.fb)) {
            return;
        } else {
            iF3 = taVar.c.y;
        }
        Float f3 = taVar.ct;
        if (f3 != null) {
            iF3 = f3(iF3, f3.floatValue());
        }
        this.y.drawColor(iF3);
    }

    public final s yt(fb.yt ytVar, s sVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (ytVar instanceof fb.b) {
                arrayList.add(0, (fb.b) ytVar);
            }
            Object obj = ytVar.n3;
            if (obj == null) {
                break;
            }
            ytVar = (fb.yt) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ix(sVar, (fb.b) it.next());
        }
        s sVar2 = this.f7714gv;
        sVar.fb = sVar2.fb;
        sVar.a = sVar2.a;
        return sVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface z(java.lang.String r6, java.lang.Integer r7, r5.fb.ta.n3 r8) {
        /*
            r5 = this;
            r0 = 2
            r1 = 3
            r5.fb$ta$n3 r2 = r5.fb.ta.n3.v
            r3 = 0
            r4 = 1
            if (r8 != r2) goto La
            r8 = 1
            goto Lb
        La:
            r8 = 0
        Lb:
            int r7 = r7.intValue()
            r2 = 500(0x1f4, float:7.0E-43)
            if (r7 <= r2) goto L19
            if (r8 == 0) goto L17
            r7 = 3
            goto L1e
        L17:
            r7 = 1
            goto L1e
        L19:
            if (r8 == 0) goto L1d
            r7 = 2
            goto L1e
        L1d:
            r7 = 0
        L1e:
            r6.hashCode()
            r8 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case -1536685117: goto L55;
                case -1431958525: goto L4a;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r0 = -1
            goto L5f
        L2b:
            java.lang.String r0 = "cursive"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L34
            goto L29
        L34:
            r0 = 4
            goto L5f
        L36:
            java.lang.String r0 = "serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3f
            goto L29
        L3f:
            r0 = 3
            goto L5f
        L41:
            java.lang.String r1 = "fantasy"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L5f
            goto L29
        L4a:
            java.lang.String r0 = "monospace"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L53
            goto L29
        L53:
            r0 = 1
            goto L5f
        L55:
            java.lang.String r0 = "sans-serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L5e
            goto L29
        L5e:
            r0 = 0
        L5f:
            switch(r0) {
                case 0: goto L80;
                case 1: goto L79;
                case 2: goto L72;
                case 3: goto L6b;
                case 4: goto L64;
                default: goto L62;
            }
        L62:
            r6 = 0
            goto L86
        L64:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L6b:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L72:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L79:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L80:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.s.z(java.lang.String, java.lang.Integer, r5.fb$ta$n3):android.graphics.Typeface");
    }

    public final void z6(fb.f7 f7Var, StringBuilder sb) {
        Iterator<fb.yt> it = f7Var.f7676c5.iterator();
        boolean z = true;
        while (it.hasNext()) {
            fb.y5 y5Var = (fb.yt) it.next();
            if (y5Var instanceof fb.f7) {
                z6((fb.f7) y5Var, sb);
            } else if (y5Var instanceof fb.y5) {
                sb.append(le(y5Var.zn, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public static void n(String str, Object... objArr) {
    }
}
