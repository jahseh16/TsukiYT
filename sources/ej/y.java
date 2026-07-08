package ej;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3338a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final float f3339c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final float f3340fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final float f3341gv;
    public final float n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f3342s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f3343v;
    public final float y;
    public final float zn;

    public y(float f3, float f4, float f5, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.y = f3;
        this.n3 = f4;
        this.zn = f5;
        this.f3341gv = f7;
        this.f3343v = f8;
        this.f3338a = f9;
        this.f3340fb = f10;
        this.f3342s = f11;
        this.f3339c5 = f12;
    }

    @NonNull
    public static y a(float f3, float f4, float f5, t tVar) {
        float fN3 = (4.0f / tVar.n3()) * ((float) Math.sqrt(((double) f3) / 100.0d)) * (tVar.y() + 4.0f) * tVar.gv();
        float fGv = f4 * tVar.gv();
        float fSqrt = ((float) Math.sqrt(((f4 / ((float) Math.sqrt(r4))) * tVar.n3()) / (tVar.y() + 4.0f))) * 50.0f;
        float f7 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float fLog = ((float) Math.log((((double) fGv) * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f5) / 180.0f;
        return new y(f5, f4, f3, fN3, fGv, fSqrt, f7, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    public static void gv(int i, @NonNull t tVar, @Nullable float[] fArr, @NonNull float[] fArr2) {
        n3.a(i, fArr2);
        float[][] fArr3 = n3.y;
        float f3 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f4 = fArr4[0] * f3;
        float f5 = fArr2[1];
        float f7 = f4 + (fArr4[1] * f5);
        float f8 = fArr2[2];
        float f9 = f7 + (fArr4[2] * f8);
        float[] fArr5 = fArr3[1];
        float f10 = (fArr5[0] * f3) + (fArr5[1] * f5) + (fArr5[2] * f8);
        float[] fArr6 = fArr3[2];
        float f11 = (f3 * fArr6[0]) + (f5 * fArr6[1]) + (f8 * fArr6[2]);
        float f12 = tVar.c5()[0] * f9;
        float f13 = tVar.c5()[1] * f10;
        float f14 = tVar.c5()[2] * f11;
        float fPow = (float) Math.pow(((double) (tVar.zn() * Math.abs(f12))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (tVar.zn() * Math.abs(f13))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (tVar.zn() * Math.abs(f14))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d4 = fSignum3;
        float f15 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d4)) / 11.0f;
        float f16 = ((float) (((double) (fSignum + fSignum2)) - (d4 * 2.0d))) / 9.0f;
        float f17 = fSignum2 * 20.0f;
        float f18 = (((fSignum * 20.0f) + f17) + (21.0f * fSignum3)) / 20.0f;
        float f19 = (((fSignum * 40.0f) + f17) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f16, f15)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f20 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f19 * tVar.a()) / tVar.y(), tVar.n3() * tVar.i9())) * 100.0f;
        float fN3 = (4.0f / tVar.n3()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (tVar.y() + 4.0f) * tVar.gv();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, tVar.v()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * tVar.fb()) * tVar.s()) * ((float) Math.sqrt((f15 * f15) + (f16 * f16)))) / (f18 + 0.305f), 0.9d));
        float fGv = tVar.gv() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r7 * tVar.n3()) / (tVar.y() + 4.0f))) * 50.0f;
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fGv) + 1.0f)) * 43.85965f;
        double d5 = f20;
        float fCos = ((float) Math.cos(d5)) * fLog;
        float fSin = fLog * ((float) Math.sin(d5));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fN3;
            fArr[2] = fGv;
            fArr[3] = fSqrt2;
            fArr[4] = f21;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    @Nullable
    public static y n3(float f3, float f4, float f5) {
        float f7 = 100.0f;
        float f8 = 1000.0f;
        y yVar = null;
        float f9 = 1000.0f;
        float f10 = 0.0f;
        while (Math.abs(f10 - f7) > 0.01f) {
            float f11 = ((f7 - f10) / 2.0f) + f10;
            int iW = v(f11, f4, f3).w();
            float fN3 = n3.n3(iW);
            float fAbs = Math.abs(f5 - fN3);
            if (fAbs < 0.2f) {
                y yVarZn = zn(iW);
                float fY = yVarZn.y(v(yVarZn.f(), yVarZn.c5(), f3));
                if (fY <= 1.0f) {
                    yVar = yVarZn;
                    f8 = fAbs;
                    f9 = fY;
                }
            }
            if (f8 == 0.0f && f9 == 0.0f) {
                break;
            }
            if (fN3 < f5) {
                f10 = f11;
            } else {
                f7 = f11;
            }
        }
        return yVar;
    }

    public static int tl(float f3, float f4, float f5) {
        return wz(f3, f4, f5, t.f3330f);
    }

    @NonNull
    public static y v(float f3, float f4, float f5) {
        return a(f3, f4, f5, t.f3330f);
    }

    public static int wz(float f3, float f4, float f5, @NonNull t tVar) {
        if (f4 < 1.0d || Math.round(f5) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Math.round(f5) >= 100.0d) {
            return n3.y(f5);
        }
        float fMin = f3 < 0.0f ? 0.0f : Math.min(360.0f, f3);
        float f7 = f4;
        y yVar = null;
        float f8 = 0.0f;
        boolean z = true;
        while (Math.abs(f8 - f4) >= 0.4f) {
            y yVarN3 = n3(fMin, f7, f5);
            if (!z) {
                if (yVarN3 == null) {
                    f4 = f7;
                } else {
                    f8 = f7;
                    yVar = yVarN3;
                }
                f7 = ((f4 - f8) / 2.0f) + f8;
            } else {
                if (yVarN3 != null) {
                    return yVarN3.xc(tVar);
                }
                f7 = ((f4 - f8) / 2.0f) + f8;
                z = false;
            }
        }
        return yVar == null ? n3.y(f5) : yVar.xc(tVar);
    }

    @NonNull
    public static y zn(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        gv(i, t.f3330f, fArr, fArr2);
        return new y(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public float c5() {
        return this.n3;
    }

    public float f() {
        return this.zn;
    }

    public float fb() {
        return this.f3342s;
    }

    public float i9() {
        return this.y;
    }

    public float s() {
        return this.f3339c5;
    }

    public float t() {
        return this.f3340fb;
    }

    public int w() {
        return xc(t.f3330f);
    }

    public int xc(@NonNull t tVar) {
        float fPow = (float) Math.pow(((double) ((((double) c5()) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || ((double) f()) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? 0.0f : c5() / ((float) Math.sqrt(((double) f()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, tVar.v()), 0.73d), 1.1111111111111112d);
        double dI9 = (i9() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dI9) + 3.8d)) * 0.25f;
        float fY = tVar.y() * ((float) Math.pow(((double) f()) / 100.0d, (1.0d / ((double) tVar.n3())) / ((double) tVar.i9())));
        float fFb = fCos * 3846.1538f * tVar.fb() * tVar.s();
        float fA = fY / tVar.a();
        float fSin = (float) Math.sin(dI9);
        float fCos2 = (float) Math.cos(dI9);
        float f3 = (((0.305f + fA) * 23.0f) * fPow) / (((fFb * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f4 = fCos2 * f3;
        float f5 = f3 * fSin;
        float f7 = fA * 460.0f;
        float f8 = (((451.0f * f4) + f7) + (288.0f * f5)) / 1403.0f;
        float f9 = ((f7 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float fSignum = Math.signum(f8) * (100.0f / tVar.zn()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f9) * (100.0f / tVar.zn()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f7 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / tVar.zn()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f10 = fSignum / tVar.c5()[0];
        float f11 = fSignum2 / tVar.c5()[1];
        float f12 = fSignum3 / tVar.c5()[2];
        float[][] fArr = n3.n3;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12);
        float[] fArr4 = fArr[2];
        return ud.y.n3(f13, f14, (f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2]));
    }

    public float y(@NonNull y yVar) {
        float fT = t() - yVar.t();
        float fFb = fb() - yVar.fb();
        float fS = s() - yVar.s();
        return (float) (Math.pow(Math.sqrt((fT * fT) + (fFb * fFb) + (fS * fS)), 0.63d) * 1.41d);
    }
}
