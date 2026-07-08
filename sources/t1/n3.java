package t1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class n3 {
    public static void y(@NonNull AnimatorSet animatorSet, @NonNull List<Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
