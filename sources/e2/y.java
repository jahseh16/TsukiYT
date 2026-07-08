package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;
import e2.gv;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: e2.y$y, reason: collision with other inner class name */
    public static class C0082y extends AnimatorListenerAdapter {
        public final /* synthetic */ gv y;

        public C0082y(gv gvVar) {
            this.y = gvVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.y.n3();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.y.y();
        }
    }

    @NonNull
    public static Animator.AnimatorListener n3(@NonNull gv gvVar) {
        return new C0082y(gvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Animator y(@NonNull gv gvVar, float f3, float f4, float f5) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(gvVar, (Property<gv, V>) gv.zn.y, (TypeEvaluator) gv.n3.n3, (Object[]) new gv.v[]{new gv.v(f3, f4, f5)});
        gv.v revealInfo = gvVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) gvVar, (int) f3, (int) f4, revealInfo.zn, f5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }
}
