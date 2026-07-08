package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final float f2957co;
    public double d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2958f;
    public final int f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f2959fb;
    public int fh;
    public float n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2960p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f2961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2963t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2964v;
    public final List<zn> w;
    public ValueAnimator y;
    public final Paint z;

    public class n3 extends AnimatorListenerAdapter {
        public n3() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public class y implements ValueAnimator.AnimatorUpdateListener {
        public y() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.tl(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    public interface zn {
        void y(float f3, boolean z);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f3);
    }

    public float a() {
        return this.n;
    }

    public final boolean c5(float f3, float f4, boolean z, boolean z5, boolean z7) {
        float fV = v(f3, f4);
        boolean z8 = false;
        boolean z9 = a() != fV;
        if (z5 && z9) {
            return true;
        }
        if (!z9 && !z) {
            return false;
        }
        if (z7 && this.f2964v) {
            z8 = true;
        }
        t(fV, z8);
        return true;
    }

    public void f(float f3) {
        t(f3, false);
    }

    public int fb() {
        return this.f2960p;
    }

    public RectF gv() {
        return this.f2961r;
    }

    public void i9(int i) {
        this.fh = i;
        invalidate();
    }

    public void n3(zn znVar) {
        this.w.add(znVar);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zn(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        f(a());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z5;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f2959fb = x2;
            this.f2962s = y3;
            this.f2958f = true;
            this.c = false;
            z = false;
            z5 = true;
        } else {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x2 - this.f2959fb);
                int i5 = (int) (y3 - this.f2962s);
                this.f2958f = (i * i) + (i5 * i5) > this.f2963t;
                z = this.c;
                z7 = actionMasked == 1;
                z5 = false;
                this.c |= c5(x2, y3, z, z5, z7);
                return true;
            }
            z = false;
            z5 = false;
        }
        z7 = false;
        this.c |= c5(x2, y3, z, z5, z7);
        return true;
    }

    public final Pair<Float, Float> s(float f3) {
        float fA = a();
        if (Math.abs(fA - f3) > 180.0f) {
            if (fA > 180.0f && f3 < 180.0f) {
                f3 += 360.0f;
            }
            if (fA < 180.0f && f3 > 180.0f) {
                fA += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fA), Float.valueOf(f3));
    }

    public void t(float f3, boolean z) {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            tl(f3, false);
            return;
        }
        Pair<Float, Float> pairS = s(f3);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairS.first).floatValue(), ((Float) pairS.second).floatValue());
        this.y = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.y.addUpdateListener(new y());
        this.y.addListener(new n3());
        this.y.start();
    }

    public final void tl(float f3, boolean z) {
        float f4 = f3 % 360.0f;
        this.n = f4;
        this.d0 = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.fh * ((float) Math.cos(this.d0)));
        float fSin = height + (this.fh * ((float) Math.sin(this.d0)));
        RectF rectF = this.f2961r;
        int i = this.f2960p;
        rectF.set(width - i, fSin - i, width + i, fSin + i);
        Iterator<zn> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().y(f4, z);
        }
        invalidate();
    }

    public final int v(float f3, float f4) {
        int degrees = (int) Math.toDegrees(Math.atan2(f4 - (getHeight() / 2), f3 - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public final void zn(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.fh * ((float) Math.cos(this.d0))) + width;
        float f3 = height;
        float fSin = (this.fh * ((float) Math.sin(this.d0))) + f3;
        this.z.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f2960p, this.z);
        double dSin = Math.sin(this.d0);
        double dCos = Math.cos(this.d0);
        this.z.setStrokeWidth(this.f3);
        canvas.drawLine(width, f3, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.z);
        canvas.drawCircle(width, f3, this.f2957co, this.z);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new ArrayList();
        Paint paint = new Paint();
        this.z = paint;
        this.f2961r = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2394n7, i, R$style.c);
        this.fh = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f2351h, 0);
        this.f2960p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f2363ia, 0);
        this.f3 = getResources().getDimensionPixelSize(R$dimen.f2215tl);
        this.f2957co = r6.getDimensionPixelSize(R$dimen.f2200f);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.f2326c8, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        f(0.0f);
        this.f2963t = ViewConfiguration.get(context).getScaledTouchSlop();
        ut.o0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
