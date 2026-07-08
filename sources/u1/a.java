package u1;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import o2.f;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final int[] y = {R.attr.stateListAnimator};

    public static void n3(@NonNull View view, float f3) {
        int integer = view.getResources().getInteger(R$integer.y);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, R$attr.f2165ej, -R$attr.f2179ud}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f3).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void y(@NonNull View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void zn(@NonNull View view, AttributeSet attributeSet, int i, int i5) {
        Context context = view.getContext();
        TypedArray typedArrayS = f.s(context, attributeSet, y, i, i5, new int[0]);
        try {
            if (typedArrayS.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayS.getResourceId(0, 0)));
            }
        } finally {
            typedArrayS.recycle();
        }
    }
}
