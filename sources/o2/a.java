package o2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ArrayList<n3> y = new ArrayList<>();

    @Nullable
    public n3 n3 = null;

    @Nullable
    public ValueAnimator zn = null;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Animator.AnimatorListener f7075gv = new y();

    public static class n3 {
        public final ValueAnimator n3;
        public final int[] y;

        public n3(int[] iArr, ValueAnimator valueAnimator) {
            this.y = iArr;
            this.n3 = valueAnimator;
        }
    }

    public class y extends AnimatorListenerAdapter {
        public y() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            if (aVar.zn == animator) {
                aVar.zn = null;
            }
        }
    }

    public void y(int[] iArr, ValueAnimator valueAnimator) {
        n3 n3Var = new n3(iArr, valueAnimator);
        valueAnimator.addListener(this.f7075gv);
        this.y.add(n3Var);
    }
}
