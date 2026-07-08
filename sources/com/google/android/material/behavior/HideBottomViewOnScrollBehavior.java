package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.zn<V> {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public ViewPropertyAnimator f2508gv;
    public int n3;
    public int y;
    public int zn;

    public class y extends AnimatorListenerAdapter {
        public y() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f2508gv = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.y = 0;
        this.n3 = 2;
        this.zn = 0;
    }

    public final void d(@NonNull V v6, int i, long j, TimeInterpolator timeInterpolator) {
        this.f2508gv = v6.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new y());
    }

    public boolean d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull View view, @NonNull View view2, int i, int i5) {
        return i == 2;
    }

    public void ej(@NonNull V v6) {
        if (this.n3 == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f2508gv;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v6.clearAnimation();
        }
        this.n3 = 1;
        d(v6, this.y + this.zn, 175L, t1.y.zn);
    }

    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, int i) {
        this.y = v6.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v6.getLayoutParams()).bottomMargin;
        return super.t(coordinatorLayout, v6, i);
    }

    public void ud(@NonNull V v6) {
        if (this.n3 == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f2508gv;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v6.clearAnimation();
        }
        this.n3 = 2;
        d(v6, 0, 225L, t1.y.f8180gv);
    }

    public void z(CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull View view, int i, int i5, int i8, int i10, int i11, @NonNull int[] iArr) {
        if (i5 > 0) {
            ej(v6);
        } else if (i5 < 0) {
            ud(v6);
        }
    }

    public void z6(@NonNull V v6, int i) {
        this.zn = i;
        if (this.n3 == 1) {
            v6.setTranslationY(this.y + i);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = 0;
        this.n3 = 2;
        this.zn = 0;
    }
}
