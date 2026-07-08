package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import t1.c5;
import t1.n3;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final c5 f2982gv;
    public final c5 zn;

    public class y extends AnimatorListenerAdapter {
        public final /* synthetic */ View n3;
        public final /* synthetic */ boolean y;

        public y(boolean z, View view) {
            this.y = z;
            this.n3 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.y) {
                return;
            }
            this.n3.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.y) {
                this.n3.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.zn = new c5(75L, 150L);
        this.f2982gv = new c5(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet a8(@NonNull View view, @NonNull View view2, boolean z, boolean z5) {
        ArrayList arrayList = new ArrayList();
        x(view2, z, z5, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        n3.y(animatorSet, arrayList);
        animatorSet.addListener(new y(z, view2));
        return animatorSet;
    }

    public boolean mg(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super.mg(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final void x(@NonNull View view, boolean z, boolean z5, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        c5 c5Var = z ? this.zn : this.f2982gv;
        if (z) {
            if (!z5) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c5Var.y(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zn = new c5(75L, 150L);
        this.f2982gv = new c5(0L, 150L);
    }
}
