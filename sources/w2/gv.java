package w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class gv extends k5 {

    public static class n3 extends AnimatorListenerAdapter {
        public boolean n3 = false;
        public final View y;

        public n3(View view) {
            this.y = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.fb(this.y, 1.0f);
            if (this.n3) {
                this.y.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ut.o(this.y) && this.y.getLayerType() == 0) {
                this.n3 = true;
                this.y.setLayerType(2, null);
            }
        }
    }

    public class y extends t {
        public final /* synthetic */ View y;

        public y(View view) {
            this.y = view;
        }

        @Override // w2.f.fb
        public void n3(@NonNull f fVar) {
            c.fb(this.y, 1.0f);
            c.y(this.y);
            fVar.oz(this);
        }
    }

    public gv(int i) {
        ap(i);
    }

    public static float yc(mt mtVar, float f3) {
        Float f4;
        return (mtVar == null || (f4 = (Float) mtVar.y.get("android:fade:transitionAlpha")) == null) ? f3 : f4.floatValue();
    }

    @Override // w2.k5
    @Nullable
    public Animator e(ViewGroup viewGroup, View view, mt mtVar, mt mtVar2) {
        c.v(view);
        return yg(view, yc(mtVar, 1.0f), 0.0f);
    }

    @Override // w2.k5, w2.f
    public void f(@NonNull mt mtVar) {
        super.f(mtVar);
        mtVar.y.put("android:fade:transitionAlpha", Float.valueOf(c.zn(mtVar.n3)));
    }

    @Override // w2.k5
    @Nullable
    public Animator nf(ViewGroup viewGroup, View view, mt mtVar, mt mtVar2) {
        float fYc = yc(mtVar, 0.0f);
        return yg(view, fYc != 1.0f ? fYc : 0.0f, 1.0f);
    }

    public final Animator yg(View view, float f3, float f4) {
        if (f3 == f4) {
            return null;
        }
        c.fb(view, f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, c.n3, f4);
        objectAnimatorOfFloat.addListener(new n3(view));
        n3(new y(view));
        return objectAnimatorOfFloat;
    }
}
