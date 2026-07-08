package w1;

import androidx.annotation.NonNull;
import y2.a;
import y2.tl;

/* JADX INFO: loaded from: classes.dex */
public class y extends a implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8956f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f8957fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f8958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f8959t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f8960v;
    public float y;

    public float c5() {
        return this.f8957fb;
    }

    public void f(float f3) {
        this.f8959t = f3;
    }

    public float fb() {
        return this.f8960v;
    }

    public float gv() {
        return this.f8958s;
    }

    public void i9(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f8958s = f3;
    }

    public float s() {
        return this.y;
    }

    public void t(float f3) {
        this.f8960v = f3;
    }

    public void tl(float f3) {
        this.y = f3;
    }

    public float v() {
        return this.f8959t;
    }

    public void wz(float f3) {
        this.f8957fb = f3;
    }

    public void xc(float f3) {
        this.f8956f = f3;
    }

    @Override // y2.a
    public void zn(float f3, float f4, float f5, @NonNull tl tlVar) {
        float f7;
        float f8;
        float f9 = this.f8957fb;
        if (f9 == 0.0f) {
            tlVar.tl(f3, 0.0f);
            return;
        }
        float f10 = ((this.f8960v * 2.0f) + f9) / 2.0f;
        float f11 = f5 * this.y;
        float f12 = f4 + this.f8956f;
        float f13 = (this.f8958s * f5) + ((1.0f - f5) * f10);
        if (f13 / f10 >= 1.0f) {
            tlVar.tl(f3, 0.0f);
            return;
        }
        float f14 = this.f8959t;
        float f15 = f14 * f5;
        boolean z = f14 == -1.0f || Math.abs((f14 * 2.0f) - f9) < 0.1f;
        if (z) {
            f7 = f13;
            f8 = 0.0f;
        } else {
            f8 = 1.75f;
            f7 = 0.0f;
        }
        float f16 = f10 + f11;
        float f17 = f7 + f11;
        float fSqrt = (float) Math.sqrt((f16 * f16) - (f17 * f17));
        float f18 = f12 - fSqrt;
        float f19 = f12 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f17));
        float f20 = (90.0f - degrees) + f8;
        tlVar.tl(f18, 0.0f);
        float f21 = f11 * 2.0f;
        tlVar.y(f18 - f11, 0.0f, f18 + f11, f21, 270.0f, degrees);
        if (z) {
            tlVar.y(f12 - f10, (-f10) - f7, f12 + f10, f10 - f7, 180.0f - f20, (f20 * 2.0f) - 180.0f);
        } else {
            float f22 = this.f8960v;
            float f23 = f15 * 2.0f;
            float f24 = f12 - f10;
            tlVar.y(f24, -(f15 + f22), f24 + f22 + f23, f22 + f15, 180.0f - f20, ((f20 * 2.0f) - 180.0f) / 2.0f);
            float f25 = f12 + f10;
            float f26 = this.f8960v;
            tlVar.tl(f25 - ((f26 / 2.0f) + f15), f26 + f15);
            float f27 = this.f8960v;
            tlVar.y(f25 - (f23 + f27), -(f15 + f27), f25, f27 + f15, 90.0f, f20 - 90.0f);
        }
        tlVar.y(f19 - f11, 0.0f, f19 + f11, f21, 270.0f - degrees, degrees);
        tlVar.tl(f3, 0.0f);
    }
}
