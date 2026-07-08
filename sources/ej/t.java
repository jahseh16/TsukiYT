package ej;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f3330f = f(n3.zn, (float) ((((double) n3.s(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3331a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final float f3332c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final float[] f3333fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final float f3334gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final float f3335i9;
    public final float n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f3336s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f3337v;
    public final float y;
    public final float zn;

    public t(float f3, float f4, float f5, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f3331a = f3;
        this.y = f4;
        this.n3 = f5;
        this.zn = f7;
        this.f3334gv = f8;
        this.f3337v = f9;
        this.f3333fb = fArr;
        this.f3336s = f10;
        this.f3332c5 = f11;
        this.f3335i9 = f12;
    }

    @NonNull
    public static t f(@NonNull float[] fArr, float f3, float f4, float f5, boolean z) {
        float[][] fArr2 = n3.y;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr3[0] * f7;
        float f9 = fArr[1];
        float f10 = f8 + (fArr3[1] * f9);
        float f11 = fArr[2];
        float f12 = f10 + (fArr3[2] * f11);
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[0] * f7) + (fArr4[1] * f9) + (fArr4[2] * f11);
        float[] fArr5 = fArr2[2];
        float f14 = (f7 * fArr5[0]) + (f9 * fArr5[1]) + (f11 * fArr5[2]);
        float f15 = (f5 / 10.0f) + 0.8f;
        float fGv = ((double) f15) >= 0.9d ? n3.gv(0.59f, 0.69f, (f15 - 0.9f) * 10.0f) : n3.gv(0.525f, 0.59f, (f15 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f3) - 42.0f) / 92.0f)) * 0.2777778f)) * f15;
        double d4 = fExp;
        if (d4 > 1.0d) {
            fExp = 1.0f;
        } else if (d4 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f12) * fExp) + 1.0f) - fExp, (((100.0f / f13) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp};
        float f16 = 1.0f / ((5.0f * f3) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float fCbrt = (f17 * f3) + (0.1f * f18 * f18 * ((float) Math.cbrt(((double) f3) * 5.0d)));
        float fS = n3.s(f4) / fArr[1];
        double d5 = fS;
        float fSqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f13)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f14)) / 100.0d, 0.42d)};
        float f19 = fArr7[0];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr7[1];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[2];
        float[] fArr8 = {f20, f22, (400.0f * f23) / (f23 + 27.13f)};
        return new t(fS, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fGv, f15, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float a() {
        return this.n3;
    }

    @NonNull
    public float[] c5() {
        return this.f3333fb;
    }

    public float fb() {
        return this.f3337v;
    }

    public float gv() {
        return this.f3332c5;
    }

    public float i9() {
        return this.f3335i9;
    }

    public float n3() {
        return this.f3334gv;
    }

    public float s() {
        return this.zn;
    }

    public float v() {
        return this.f3331a;
    }

    public float y() {
        return this.y;
    }

    public float zn() {
        return this.f3336s;
    }
}
