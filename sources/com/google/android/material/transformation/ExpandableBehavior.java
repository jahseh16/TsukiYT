package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.zn<View> {
    public int y;

    public class y implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ m2.y f2973fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f2975v;
        public final /* synthetic */ View y;

        public y(View view, int i, m2.y yVar) {
            this.y = view;
            this.f2975v = i;
            this.f2973fb = yVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.y.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.y == this.f2975v) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                m2.y yVar = this.f2973fb;
                expandableBehavior.ej((View) yVar, this.y, yVar.y(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.y = 0;
    }

    public final boolean d(boolean z) {
        if (!z) {
            return this.y == 1;
        }
        int i = this.y;
        return i == 0 || i == 2;
    }

    public abstract boolean ej(View view, View view2, boolean z, boolean z5);

    /* JADX WARN: Multi-variable type inference failed */
    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m2.y yVar = (m2.y) view2;
        if (!d(yVar.y())) {
            return false;
        }
        this.y = yVar.y() ? 1 : 2;
        return ej((View) yVar, view, yVar.y(), true);
    }

    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        m2.y yVarZ6;
        if (ut.q9(view) || (yVarZ6 = z6(coordinatorLayout, view)) == null || !d(yVarZ6.y())) {
            return false;
        }
        int i5 = yVarZ6.y() ? 1 : 2;
        this.y = i5;
        view.getViewTreeObserver().addOnPreDrawListener(new y(view, i5, yVarZ6));
        return false;
    }

    public abstract boolean v(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public m2.y z6(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List listMt = coordinatorLayout.mt(view);
        int size = listMt.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) listMt.get(i);
            if (v(coordinatorLayout, view, view2)) {
                return (m2.y) view2;
            }
        }
        return null;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = 0;
    }
}
