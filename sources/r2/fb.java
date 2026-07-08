package r2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fb extends Drawable implements Animatable {
    public static final Property<fb, Float> d0 = new zn(Float.class, "growFraction");
    public int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public List<x5.n3> f7625co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ValueAnimator f7626f;
    public float f3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f7628p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ValueAnimator f7630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7631t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r2.n3 f7632v;
    public boolean w;
    public final Context y;
    public x5.n3 z;
    public final Paint n = new Paint();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public r2.y f7627fb = new r2.y();

    public class n3 extends AnimatorListenerAdapter {
        public n3() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            fb.super.setVisible(false, false);
            fb.this.gv();
        }
    }

    public class y extends AnimatorListenerAdapter {
        public y() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            fb.this.v();
        }
    }

    public static class zn extends Property<fb, Float> {
        public zn(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(fb fbVar, Float f3) {
            fbVar.tl(f3.floatValue());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float get(fb fbVar) {
            return Float.valueOf(fbVar.fb());
        }
    }

    public fb(@NonNull Context context, @NonNull r2.n3 n3Var) {
        this.y = context;
        this.f7632v = n3Var;
        setAlpha(255);
    }

    public final void a(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z = this.f7629r;
        this.f7629r = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f7629r = z;
    }

    public boolean c5() {
        ValueAnimator valueAnimator = this.f7626f;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.w;
    }

    public final void f() {
        if (this.f7630s == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, d0, 0.0f, 1.0f);
            this.f7630s = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f7630s.setInterpolator(t1.y.n3);
            xc(this.f7630s);
        }
        if (this.f7626f == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, d0, 1.0f, 0.0f);
            this.f7626f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f7626f.setInterpolator(t1.y.n3);
            wz(this.f7626f);
        }
    }

    public float fb() {
        if (this.f7632v.n3() || this.f7632v.y()) {
            return (this.w || this.f7631t) ? this.f7628p : this.f3;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void gv() {
        x5.n3 n3Var = this.z;
        if (n3Var != null) {
            n3Var.y(this);
        }
        List<x5.n3> list = this.f7625co;
        if (list == null || this.f7629r) {
            return;
        }
        Iterator<x5.n3> it = list.iterator();
        while (it.hasNext()) {
            it.next().y(this);
        }
    }

    public boolean i9() {
        ValueAnimator valueAnimator = this.f7630s;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f7631t;
    }

    public boolean isRunning() {
        return i9() || c5();
    }

    public boolean mt(@NonNull x5.n3 n3Var) {
        List<x5.n3> list = this.f7625co;
        if (list == null || !list.contains(n3Var)) {
            return false;
        }
        this.f7625co.remove(n3Var);
        if (!this.f7625co.isEmpty()) {
            return true;
        }
        this.f7625co = null;
        return true;
    }

    public boolean p(boolean z, boolean z5, boolean z7) {
        f();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.f7630s : this.f7626f;
        if (!z7) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                a(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (z7 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z8 = !z || super.setVisible(z, false);
        if (!(z ? this.f7632v.n3() : this.f7632v.y())) {
            a(valueAnimator);
            return z8;
        }
        if (z5 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z8;
    }

    public boolean s() {
        return w(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.c = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z5) {
        return w(z, z5, true);
    }

    public void start() {
        p(true, true, false);
    }

    public void stop() {
        p(false, true, false);
    }

    public void t(@NonNull x5.n3 n3Var) {
        if (this.f7625co == null) {
            this.f7625co = new ArrayList();
        }
        if (this.f7625co.contains(n3Var)) {
            return;
        }
        this.f7625co.add(n3Var);
    }

    public void tl(float f3) {
        if (this.f3 != f3) {
            this.f3 = f3;
            invalidateSelf();
        }
    }

    public final void v() {
        x5.n3 n3Var = this.z;
        if (n3Var != null) {
            n3Var.n3(this);
        }
        List<x5.n3> list = this.f7625co;
        if (list == null || this.f7629r) {
            return;
        }
        Iterator<x5.n3> it = list.iterator();
        while (it.hasNext()) {
            it.next().n3(this);
        }
    }

    public boolean w(boolean z, boolean z5, boolean z7) {
        return p(z, z5, z7 && this.f7627fb.y(this.y.getContentResolver()) > 0.0f);
    }

    public final void wz(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f7626f;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f7626f = valueAnimator;
        valueAnimator.addListener(new n3());
    }

    public final void xc(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f7630s;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f7630s = valueAnimator;
        valueAnimator.addListener(new y());
    }
}
