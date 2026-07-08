package r2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends c5<ObjectAnimator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.n3 f7637a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public float f7638c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x5.n3 f7639f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final r2.n3 f7640fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public ObjectAnimator f7641gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public float f7642i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7643s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObjectAnimator f7644v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f7633t = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final int[] f7634tl = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final int[] f7635wz = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final Property<gv, Float> f7636xc = new zn(Float.class, "animationFraction");
    public static final Property<gv, Float> w = new C0154gv(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: r2.gv$gv, reason: collision with other inner class name */
    public static class C0154gv extends Property<gv, Float> {
        public C0154gv(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(gv gvVar, Float f3) {
            gvVar.r(f3.floatValue());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float get(gv gvVar) {
            return Float.valueOf(gvVar.w());
        }
    }

    public class n3 extends AnimatorListenerAdapter {
        public n3() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            gv.this.y();
            gv gvVar = gv.this;
            gvVar.f7639f.y(gvVar.y);
        }
    }

    public class y extends AnimatorListenerAdapter {
        public y() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            gv gvVar = gv.this;
            gvVar.f7643s = (gvVar.f7643s + 4) % gv.this.f7640fb.zn.length;
        }
    }

    public static class zn extends Property<gv, Float> {
        public zn(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(gv gvVar, Float f3) {
            gvVar.z(f3.floatValue());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float get(gv gvVar) {
            return Float.valueOf(gvVar.xc());
        }
    }

    public gv(@NonNull v vVar) {
        super(1);
        this.f7643s = 0;
        this.f7639f = null;
        this.f7640fb = vVar;
        this.f7637a = new e.n3();
    }

    @Override // r2.c5
    public void a() {
        if (this.f7644v.isRunning()) {
            return;
        }
        if (this.y.isVisible()) {
            this.f7644v.start();
        } else {
            y();
        }
    }

    public void co() {
        this.f7643s = 0;
        this.zn[0] = g2.y.y(this.f7640fb.zn[0], this.y.getAlpha());
        this.f7642i9 = 0.0f;
    }

    @Override // r2.c5
    public void fb() {
        p();
        co();
        this.f7641gv.start();
    }

    @Override // r2.c5
    public void gv(@NonNull x5.n3 n3Var) {
        this.f7639f = n3Var;
    }

    public final void mt(int i) {
        for (int i5 = 0; i5 < 4; i5++) {
            float fN3 = n3(i, f7635wz[i5], 333);
            if (fN3 >= 0.0f && fN3 <= 1.0f) {
                int i8 = i5 + this.f7643s;
                int[] iArr = this.f7640fb.zn;
                int length = i8 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int iY = g2.y.y(iArr[length], this.y.getAlpha());
                int iY2 = g2.y.y(this.f7640fb.zn[length2], this.y.getAlpha());
                this.zn[0] = t1.zn.n3().evaluate(this.f7637a.getInterpolation(fN3), Integer.valueOf(iY), Integer.valueOf(iY2)).intValue();
                return;
            }
        }
    }

    public final void p() {
        if (this.f7641gv == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f7636xc, 0.0f, 1.0f);
            this.f7641gv = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f7641gv.setInterpolator(null);
            this.f7641gv.setRepeatCount(-1);
            this.f7641gv.addListener(new y());
        }
        if (this.f7644v == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, w, 0.0f, 1.0f);
            this.f7644v = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f7644v.setInterpolator(this.f7637a);
            this.f7644v.addListener(new n3());
        }
    }

    public final void r(float f3) {
        this.f7642i9 = f3;
    }

    @Override // r2.c5
    public void s() {
        this.f7639f = null;
    }

    public final float w() {
        return this.f7642i9;
    }

    public final void x4(int i) {
        float[] fArr = this.n3;
        float f3 = this.f7638c5;
        fArr[0] = (f3 * 1520.0f) - 20.0f;
        fArr[1] = f3 * 1520.0f;
        for (int i5 = 0; i5 < 4; i5++) {
            float fN3 = n3(i, f7633t[i5], 667);
            float[] fArr2 = this.n3;
            fArr2[1] = fArr2[1] + (this.f7637a.getInterpolation(fN3) * 250.0f);
            float fN32 = n3(i, f7634tl[i5], 667);
            float[] fArr3 = this.n3;
            fArr3[0] = fArr3[0] + (this.f7637a.getInterpolation(fN32) * 250.0f);
        }
        float[] fArr4 = this.n3;
        float f4 = fArr4[0];
        float f5 = fArr4[1];
        float f7 = f4 + ((f5 - f4) * this.f7642i9);
        fArr4[0] = f7;
        fArr4[0] = f7 / 360.0f;
        fArr4[1] = f5 / 360.0f;
    }

    public final float xc() {
        return this.f7638c5;
    }

    @Override // r2.c5
    public void y() {
        ObjectAnimator objectAnimator = this.f7641gv;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void z(float f3) {
        this.f7638c5 = f3;
        int i = (int) (f3 * 5400.0f);
        x4(i);
        mt(i);
        this.y.invalidateSelf();
    }

    @Override // r2.c5
    public void zn() {
        co();
    }
}
