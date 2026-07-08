package ut;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements View.OnTouchListener {

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final int f8701ej = ViewConfiguration.getTapTimeout();
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8703d;
    public boolean d0;
    public boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final View f8705fb;
    public boolean fh;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8706p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Runnable f8708s;
    public int w;
    public final y y = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Interpolator f8710v = new AccelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f8704f = {0.0f, 0.0f};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float[] f8709t = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public float[] f8702co = {0.0f, 0.0f};
    public float[] z = {0.0f, 0.0f};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float[] f8707r = {Float.MAX_VALUE, Float.MAX_VALUE};

    public y(@NonNull View view) {
        this.f8705fb = view;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = (int) ((1575.0f * f3) + 0.5f);
        xc(f4, f4);
        float f5 = (int) ((f3 * 315.0f) + 0.5f);
        w(f5, f5);
        t(1);
        wz(Float.MAX_VALUE, Float.MAX_VALUE);
        co(0.2f, 0.2f);
        z(1.0f, 1.0f);
        f(f8701ej);
        mt(500);
        p(500);
    }

    public static int a(int i, int i5, int i8) {
        return i > i8 ? i8 : i < i5 ? i5 : i;
    }

    public static float v(float f3, float f4, float f5) {
        return f3 > f5 ? f5 : f3 < f4 ? f4 : f3;
    }

    public final void c5() {
        if (this.n) {
            this.d0 = false;
        } else {
            this.y.c5();
        }
    }

    @NonNull
    public y co(float f3, float f4) {
        float[] fArr = this.f8704f;
        fArr[0] = f3;
        fArr[1] = f4;
        return this;
    }

    @NonNull
    public y f(int i) {
        this.f8706p = i;
        return this;
    }

    public final float fb(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i = this.w;
        if (i == 0 || i == 1) {
            if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (this.d0 && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f3 < 0.0f) {
            return f3 / (-f4);
        }
        return 0.0f;
    }

    public final float gv(int i, float f3, float f4, float f5) {
        float fS = s(this.f8704f[i], f4, this.f8709t[i], f3);
        if (fS == 0.0f) {
            return 0.0f;
        }
        float f7 = this.f8702co[i];
        float f8 = this.z[i];
        float f9 = this.f8707r[i];
        float f10 = f7 * f5;
        return fS > 0.0f ? v(fS * f10, f8, f9) : -v((-fS) * f10, f8, f9);
    }

    public abstract void i9(int i, int i5);

    @NonNull
    public y mt(int i) {
        this.y.f(i);
        return this;
    }

    public abstract boolean n3(int i);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.fh
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.c5()
            goto L58
        L1a:
            r5.c = r2
            r5.f3 = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f8705fb
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.gv(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f8705fb
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.gv(r2, r7, r6, r3)
            ut.y$y r7 = r5.y
            r7.t(r0, r6)
            boolean r6 = r5.d0
            if (r6 != 0) goto L58
            boolean r6 = r5.r()
            if (r6 == 0) goto L58
            r5.x4()
        L58:
            boolean r6 = r5.f8703d
            if (r6 == 0) goto L61
            boolean r6 = r5.d0
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.y.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @NonNull
    public y p(int i) {
        this.y.i9(i);
        return this;
    }

    public boolean r() {
        y yVar = this.y;
        int iA = yVar.a();
        int iGv = yVar.gv();
        return (iA != 0 && n3(iA)) || (iGv != 0 && y(iGv));
    }

    public final float s(float f3, float f4, float f5, float f7) {
        float interpolation;
        float fV = v(f3 * f4, 0.0f, f5);
        float fFb = fb(f4 - f7, fV) - fb(f7, fV);
        if (fFb < 0.0f) {
            interpolation = -this.f8710v.getInterpolation(-fFb);
        } else {
            if (fFb <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f8710v.getInterpolation(fFb);
        }
        return v(interpolation, -1.0f, 1.0f);
    }

    @NonNull
    public y t(int i) {
        this.w = i;
        return this;
    }

    public y tl(boolean z) {
        if (this.fh && !z) {
            c5();
        }
        this.fh = z;
        return this;
    }

    @NonNull
    public y w(float f3, float f4) {
        float[] fArr = this.z;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    @NonNull
    public y wz(float f3, float f4) {
        float[] fArr = this.f8709t;
        fArr[0] = f3;
        fArr[1] = f4;
        return this;
    }

    public final void x4() {
        int i;
        if (this.f8708s == null) {
            this.f8708s = new n3(this);
        }
        this.d0 = true;
        this.n = true;
        if (this.f3 || (i = this.f8706p) <= 0) {
            this.f8708s.run();
        } else {
            ut.ra(this.f8705fb, this.f8708s, i);
        }
        this.f3 = true;
    }

    @NonNull
    public y xc(float f3, float f4) {
        float[] fArr = this.f8707r;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    public abstract boolean y(int i);

    @NonNull
    public y z(float f3, float f4) {
        float[] fArr = this.f8702co;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    public void zn() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f8705fb.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }
}
