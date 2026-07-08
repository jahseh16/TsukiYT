package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    @Nullable
    public AnimatorSet n3;

    public class y extends AnimatorListenerAdapter {
        public y() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.n3 = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @NonNull
    public abstract AnimatorSet a8(View view, View view2, boolean z, boolean z5);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean ej(View view, View view2, boolean z, boolean z5) {
        AnimatorSet animatorSet = this.n3;
        boolean z7 = animatorSet != null;
        if (z7) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetA8 = a8(view, view2, z, z7);
        this.n3 = animatorSetA8;
        animatorSetA8.addListener(new y());
        this.n3.start();
        if (!z5) {
            this.n3.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
