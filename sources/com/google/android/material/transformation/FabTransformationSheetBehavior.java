package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$animator;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import qn.ut;
import t1.i9;
import t1.s;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public Map<View, Integer> f2983c5;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    public FabTransformationBehavior.v dm(Context context, boolean z) {
        int i = z ? R$animator.f2158gv : R$animator.zn;
        FabTransformationBehavior.v vVar = new FabTransformationBehavior.v();
        vVar.y = s.zn(context, i);
        vVar.n3 = new i9(17, 0.0f, 0.0f);
        return vVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean ej(@NonNull View view, @NonNull View view2, boolean z, boolean z5) {
        o4(view2, z);
        return super.ej(view, view2, z, z5);
    }

    public final void o4(@NonNull View view, boolean z) {
        CoordinatorLayout parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f2983c5 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z5 = (childAt.getLayoutParams() instanceof CoordinatorLayout.a) && (childAt.getLayoutParams().a() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z5) {
                    if (z) {
                        this.f2983c5.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ut.o0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f2983c5;
                        if (map != null && map.containsKey(childAt)) {
                            ut.o0(childAt, this.f2983c5.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.f2983c5 = null;
        }
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
