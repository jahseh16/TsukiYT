package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.Arrays;
import o2.f;
import qn.ut;
import r2.a;
import r2.fb;
import r2.i9;
import r2.n3;
import r2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<S extends r2.n3> extends ProgressBar {
    public static final int d0 = R$style.f3;
    public final x5.n3 c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f2772co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2773f;
    public final Runnable f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f2774fb;
    public final x5.n3 n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r2.y f2775p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Runnable f2776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2778t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2779v;
    public long w;
    public S y;
    public int z;

    public class gv extends x5.n3 {
        public gv() {
        }

        public void y(Drawable drawable) {
            super.y(drawable);
            if (y.this.f2772co) {
                return;
            }
            y yVar = y.this;
            yVar.setVisibility(yVar.z);
        }
    }

    public class n3 implements Runnable {
        public n3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.i9();
            y.this.w = -1L;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.y$y, reason: collision with other inner class name */
    public class RunnableC0068y implements Runnable {
        public RunnableC0068y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.f();
        }
    }

    public class zn extends x5.n3 {
        public zn() {
        }

        public void y(Drawable drawable) {
            y.this.setIndeterminate(false);
            y.this.xc(0, false);
            y yVar = y.this;
            yVar.xc(yVar.f2779v, y.this.f2774fb);
        }
    }

    public y(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i5) {
        super(e3.y.zn(context, attributeSet, i, d0), attributeSet, i);
        this.w = -1L;
        this.f2772co = false;
        this.z = 4;
        this.f2776r = new RunnableC0068y();
        this.f3 = new n3();
        this.n = new zn();
        this.c = new gv();
        Context context2 = getContext();
        this.y = (S) c5(context2, attributeSet);
        TypedArray typedArrayS = f.s(context2, attributeSet, R$styleable.f2452x, i, i5, new int[0]);
        this.f2773f = typedArrayS.getInt(R$styleable.f2355hw, -1);
        this.f2778t = Math.min(typedArrayS.getInt(R$styleable.f2461yt, -1), 1000);
        typedArrayS.recycle();
        this.f2775p = new r2.y();
        this.f2777s = true;
    }

    @Nullable
    private s<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().r();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().x4();
    }

    public abstract S c5(@NonNull Context context, @NonNull AttributeSet attributeSet);

    public final void f() {
        if (this.f2778t > 0) {
            this.w = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.y.f7646a;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.y.zn;
    }

    public int getShowAnimationBehavior() {
        return this.y.f7648v;
    }

    public int getTrackColor() {
        return this.y.f7647gv;
    }

    public int getTrackCornerRadius() {
        return this.y.n3;
    }

    public int getTrackThickness() {
        return this.y.y;
    }

    public final void i9() {
        ((fb) getCurrentDrawable()).w(false, false, true);
        if (tl()) {
            setVisibility(4);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wz();
        if (p()) {
            f();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3);
        removeCallbacks(this.f2776r);
        ((fb) getCurrentDrawable()).s();
        w();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i5) {
        try {
            super.onMeasure(i, i5);
            s<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int iV = currentDrawingDelegate.v();
            int iGv = currentDrawingDelegate.gv();
            setMeasuredDimension(iV < 0 ? getMeasuredWidth() : iV + getPaddingLeft() + getPaddingRight(), iGv < 0 ? getMeasuredHeight() : iGv + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        s(i == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        s(false);
    }

    public boolean p() {
        return ut.ut(this) && getWindowVisibility() == 0 && t();
    }

    public void s(boolean z) {
        if (this.f2777s) {
            ((fb) getCurrentDrawable()).w(p(), false, z);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull r2.y yVar) {
        this.f2775p = yVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f7627fb = yVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f7627fb = yVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.y.f7646a = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            if (p() && z) {
                throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
            }
            fb fbVar = (fb) getCurrentDrawable();
            if (fbVar != null) {
                fbVar.s();
            }
            super.setIndeterminate(z);
            fb fbVar2 = (fb) getCurrentDrawable();
            if (fbVar2 != null) {
                fbVar2.w(p(), false, false);
            }
            this.f2772co = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof i9)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((fb) drawable).s();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{g2.y.n3(getContext(), R$attr.f2176t, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.y.zn = iArr;
        getIndeterminateDrawable().z().zn();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        xc(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof a)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            a aVar = (a) drawable;
            aVar.s();
            super.setProgressDrawable(aVar);
            aVar.c(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.y.f7648v = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s3 = this.y;
        if (s3.f7647gv != i) {
            s3.f7647gv = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s3 = this.y;
        if (s3.n3 != i) {
            s3.n3 = Math.min(i, s3.y / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s3 = this.y;
        if (s3.y != i) {
            s3.y = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.z = i;
    }

    public boolean t() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public final boolean tl() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    public final void w() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mt(this.c);
            getIndeterminateDrawable().z().s();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mt(this.c);
        }
    }

    public final void wz() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().z().gv(this.n);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().t(this.c);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().t(this.c);
        }
    }

    public void xc(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f2779v = i;
            this.f2774fb = z;
            this.f2772co = true;
            if (!getIndeterminateDrawable().isVisible() || this.f2775p.y(getContext().getContentResolver()) == 0.0f) {
                this.n.y(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().z().a();
            }
        }
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public i9<S> getIndeterminateDrawable() {
        return (i9) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public a<S> getProgressDrawable() {
        return (a) super.getProgressDrawable();
    }
}
