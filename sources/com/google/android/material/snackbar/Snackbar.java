package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import z2.n3;

/* JADX INFO: loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] d0;
    public static final int[] fh;
    public boolean c;

    @Nullable
    public final AccessibilityManager n;

    public static final class SnackbarLayout extends BaseTransientBottomBar.i4 {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i5) {
            super.onMeasure(i, i5);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i4, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i4, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i4, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i4, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i4, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i = R$attr.fh;
        d0 = new int[]{i};
        fh = new int[]{i, R$attr.mg};
    }

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull n3 n3Var) {
        super(context, viewGroup, view, n3Var);
        this.n = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static boolean en(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(fh);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @Nullable
    public static ViewGroup f7(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @NonNull
    public static Snackbar jz(@NonNull View view, int i, int i5) {
        return u(view, view.getResources().getText(i), i5);
    }

    @NonNull
    public static Snackbar u(@NonNull View view, @NonNull CharSequence charSequence, int i) {
        return y5(null, view, charSequence, i);
    }

    @NonNull
    public static Snackbar y5(@Nullable Context context, @NonNull View view, @NonNull CharSequence charSequence, int i) {
        ViewGroup viewGroupF7 = f7(view);
        if (viewGroupF7 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupF7.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(en(context) ? R$layout.f2275x4 : R$layout.zn, viewGroupF7, false);
        Snackbar snackbar = new Snackbar(context, viewGroupF7, snackbarContentLayout, snackbarContentLayout);
        snackbar.xg(charSequence);
        snackbar.k5(i);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void j5() {
        super.j5();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int n() {
        int iN = super.n();
        if (iN == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.n.getRecommendedTimeoutMillis(iN, (this.c ? 4 : 0) | 3);
        }
        if (this.c && this.n.isTouchExplorationEnabled()) {
            return -2;
        }
        return iN;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void x4() {
        super.x4();
    }

    @NonNull
    public Snackbar xg(@NonNull CharSequence charSequence) {
        ((SnackbarContentLayout) this.zn.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }
}
