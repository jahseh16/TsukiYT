package ic;

import android.view.Choreographer;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class fb extends zn implements Choreographer.FrameCallback {

    @Nullable
    public uo.s f3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f5667s = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5664f = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5668t = 0;
    public float w = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f5665p = 0.0f;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f5663co = 0;
    public float z = -2.14748365E9f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f5666r = 2.14748365E9f;
    public boolean n = false;
    public boolean c = false;

    public void c() {
        d(-p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        n3();
        i4();
    }

    public void co() {
        i4();
        gv();
    }

    public void d(float f3) {
        this.f5667s = f3;
    }

    public void d0(uo.s sVar) {
        boolean z = this.f3 == null;
        this.f3 = sVar;
        if (z) {
            mg(Math.max(this.z, sVar.w()), Math.min(this.f5666r, sVar.a()));
        } else {
            mg((int) sVar.w(), (int) sVar.a());
        }
        float f3 = this.f5665p;
        this.f5665p = 0.0f;
        this.w = 0.0f;
        fh((int) f3);
        c5();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        x4();
        if (this.f3 == null || !isRunning()) {
            return;
        }
        uo.zn.y("LottieValueAnimator#doFrame");
        float fWz = (this.f5668t != 0 ? j - r1 : 0L) / wz();
        float f3 = this.w;
        if (mt()) {
            fWz = -fWz;
        }
        float f4 = f3 + fWz;
        boolean zGv = c5.gv(f4, w(), xc());
        float f5 = this.w;
        float fN3 = c5.n3(f4, w(), xc());
        this.w = fN3;
        if (this.c) {
            fN3 = (float) Math.floor(fN3);
        }
        this.f5665p = fN3;
        this.f5668t = j;
        if (!this.c || this.w != f5) {
            c5();
        }
        if (!zGv) {
            if (getRepeatCount() == -1 || this.f5663co < getRepeatCount()) {
                v();
                this.f5663co++;
                if (getRepeatMode() == 2) {
                    this.f5664f = !this.f5664f;
                    c();
                } else {
                    float fXc = mt() ? xc() : w();
                    this.w = fXc;
                    this.f5665p = fXc;
                }
                this.f5668t = j;
            } else {
                float fW = this.f5667s < 0.0f ? w() : xc();
                this.w = fW;
                this.f5665p = fW;
                i4();
                zn(mt());
            }
        }
        ej();
        uo.zn.n3("LottieValueAnimator#doFrame");
    }

    public final void ej() {
        if (this.f3 == null) {
            return;
        }
        float f3 = this.f5665p;
        if (f3 < this.z || f3 > this.f5666r) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.z), Float.valueOf(this.f5666r), Float.valueOf(this.f5665p)));
        }
    }

    public void f() {
        i4();
        zn(mt());
    }

    public void f3(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.n = false;
        }
    }

    public void fh(float f3) {
        if (this.w == f3) {
            return;
        }
        float fN3 = c5.n3(f3, w(), xc());
        this.w = fN3;
        if (this.c) {
            fN3 = (float) Math.floor(fN3);
        }
        this.f5665p = fN3;
        this.f5668t = 0L;
        c5();
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fW;
        float fXc;
        float fW2;
        if (this.f3 == null) {
            return 0.0f;
        }
        if (mt()) {
            fW = xc() - this.f5665p;
            fXc = xc();
            fW2 = w();
        } else {
            fW = this.f5665p - w();
            fXc = xc();
            fW2 = w();
        }
        return fW / (fXc - fW2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(t());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        uo.s sVar = this.f3;
        if (sVar == null) {
            return 0L;
        }
        return (long) sVar.gv();
    }

    public void i4() {
        f3(true);
    }

    public void i9() {
        this.f3 = null;
        this.z = -2.14748365E9f;
        this.f5666r = 2.14748365E9f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.n;
    }

    public void mg(float f3, float f4) {
        if (f3 > f4) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f3), Float.valueOf(f4)));
        }
        uo.s sVar = this.f3;
        float fW = sVar == null ? -3.4028235E38f : sVar.w();
        uo.s sVar2 = this.f3;
        float fA = sVar2 == null ? Float.MAX_VALUE : sVar2.a();
        float fN3 = c5.n3(f3, fW, fA);
        float fN32 = c5.n3(f4, fW, fA);
        if (fN3 == this.z && fN32 == this.f5666r) {
            return;
        }
        this.z = fN3;
        this.f5666r = fN32;
        fh((int) c5.n3(this.f5665p, fN3, fN32));
    }

    public final boolean mt() {
        return p() < 0.0f;
    }

    public void n() {
        this.n = true;
        x4();
        this.f5668t = 0L;
        if (mt() && tl() == w()) {
            fh(xc());
        } else if (!mt() && tl() == xc()) {
            fh(w());
        }
        fb();
    }

    @Override // ic.zn
    public void n3() {
        super.n3();
        zn(mt());
    }

    public float p() {
        return this.f5667s;
    }

    public void rz(float f3) {
        mg(this.z, f3);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f5664f) {
            return;
        }
        this.f5664f = false;
        c();
    }

    public float t() {
        uo.s sVar = this.f3;
        if (sVar == null) {
            return 0.0f;
        }
        return (this.f5665p - sVar.w()) / (this.f3.a() - this.f3.w());
    }

    public void ta(int i) {
        mg(i, (int) this.f5666r);
    }

    public float tl() {
        return this.f5665p;
    }

    public float w() {
        uo.s sVar = this.f3;
        if (sVar == null) {
            return 0.0f;
        }
        float f3 = this.z;
        return f3 == -2.14748365E9f ? sVar.w() : f3;
    }

    public final float wz() {
        uo.s sVar = this.f3;
        if (sVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / sVar.c5()) / Math.abs(this.f5667s);
    }

    public void x4() {
        if (isRunning()) {
            f3(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public float xc() {
        uo.s sVar = this.f3;
        if (sVar == null) {
            return 0.0f;
        }
        float f3 = this.f5666r;
        return f3 == 2.14748365E9f ? sVar.a() : f3;
    }

    public void z() {
        this.n = true;
        s(mt());
        fh((int) (mt() ? xc() : w()));
        this.f5668t = 0L;
        this.f5663co = 0;
        x4();
    }

    public void z6(boolean z) {
        this.c = z;
    }
}
