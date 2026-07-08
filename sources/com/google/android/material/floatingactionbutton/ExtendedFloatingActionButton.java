package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import qn.ut;
import t1.s;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.n3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2714b;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public int f2715hw;
    public boolean j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public int f2716j5;
    public boolean o;
    public boolean oz;

    @NonNull
    public final CoordinatorLayout.zn<ExtendedFloatingActionButton> qn;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    @NonNull
    public ColorStateList f2717ut;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2718x;
    public static final int q9 = R$style.f2302r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Property<View, Float> f2713k = new n3(Float.class, "width");
    public static final Property<View, Float> f7 = new zn(Float.class, "height");
    public static final Property<View, Float> en = new gv(Float.class, "paddingStart");
    public static final Property<View, Float> jz = new v(Float.class, "paddingEnd");

    public static abstract class a {
    }

    public static class gv extends Property<View, Float> {
        public gv(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f3) {
            ut.cy(view, f3.intValue(), view.getPaddingTop(), ut.ud(view), view.getPaddingBottom());
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(ut.a8(view));
        }
    }

    public static class n3 extends Property<View, Float> {
        public n3(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f3) {
            view.getLayoutParams().width = f3.intValue();
            view.requestLayout();
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }
    }

    public static class v extends Property<View, Float> {
        public v(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f3) {
            ut.cy(view, ut.a8(view), view.getPaddingTop(), f3.intValue(), view.getPaddingBottom());
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(ut.ud(view));
        }
    }

    public class y extends AnimatorListenerAdapter {
        public boolean y;

        public y(com.google.android.material.floatingactionbutton.n3 n3Var, a aVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.y = true;
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    public static class zn extends Property<View, Float> {
        public zn(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f3) {
            view.getLayoutParams().height = f3.intValue();
            view.requestLayout();
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean p() {
        return getVisibility() != 0 ? this.f2718x == 2 : this.f2718x != 1;
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.n3 t(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.n3 tl(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.n3 w(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.n3 xc(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void co() {
        this.f2717ut = getTextColors();
    }

    @NonNull
    public CoordinatorLayout.zn<ExtendedFloatingActionButton> getBehavior() {
        return this.qn;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCollapsedSize() {
        int i = this.f2714b;
        return i < 0 ? (Math.min(ut.a8(this), ut.ud(this)) * 2) + getIconSize() : i;
    }

    @Nullable
    public s getExtendMotionSpec() {
        throw null;
    }

    @Nullable
    public s getHideMotionSpec() {
        throw null;
    }

    @Nullable
    public s getShowMotionSpec() {
        throw null;
    }

    @Nullable
    public s getShrinkMotionSpec() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mt(@NonNull com.google.android.material.floatingactionbutton.n3 n3Var, @Nullable a aVar) {
        if (n3Var.n3()) {
            return;
        }
        if (!z()) {
            n3Var.y();
            n3Var.v(aVar);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetZn = n3Var.zn();
        animatorSetZn.addListener(new y(n3Var, aVar));
        Iterator<Animator.AnimatorListener> it = n3Var.gv().iterator();
        while (it.hasNext()) {
            animatorSetZn.addListener(it.next());
        }
        animatorSetZn.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.button.MaterialButton
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.o && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.o = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.oz = z;
    }

    public void setExtendMotionSpec(@Nullable s sVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(s.zn(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.o != z) {
            throw null;
        }
    }

    public void setHideMotionSpec(@Nullable s sVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(s.zn(getContext(), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPadding(int i, int i5, int i8, int i10) {
        super/*android.widget.Button*/.setPadding(i, i5, i8, i10);
        if (!this.o || this.j) {
            return;
        }
        this.f2715hw = ut.a8(this);
        this.f2716j5 = ut.ud(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPaddingRelative(int i, int i5, int i8, int i10) {
        super/*android.widget.Button*/.setPaddingRelative(i, i5, i8, i10);
        if (!this.o || this.j) {
            return;
        }
        this.f2715hw = i;
        this.f2716j5 = i8;
    }

    public void setShowMotionSpec(@Nullable s sVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(s.zn(getContext(), i));
    }

    public void setShrinkMotionSpec(@Nullable s sVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(s.zn(getContext(), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(int i) {
        super/*android.widget.Button*/.setTextColor(i);
        co();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return (ut.q9(this) || (!p() && this.oz)) && !isInEditMode();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.zn<T> {
        public boolean n3;
        public Rect y;
        public boolean zn;

        public ExtendedFloatingActionButtonBehavior() {
            this.n3 = false;
            this.zn = true;
        }

        public static boolean z6(@NonNull View view) {
            CoordinatorLayout.a layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.a) {
                return layoutParams.a() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a8(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.n3 || this.zn) && extendedFloatingActionButton.getLayoutParams().v() == view.getId();
        }

        public final boolean b(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a8(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.y == null) {
                this.y = new Rect();
            }
            Rect rect = this.y;
            o2.n3.y(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                x(extendedFloatingActionButton);
                return true;
            }
            ta(extendedFloatingActionButton);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean n3(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.n3(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* JADX INFO: renamed from: ej, reason: merged with bridge method [inline-methods] */
        public boolean s(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                b(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!z6(view)) {
                return false;
            }
            k5(view, extendedFloatingActionButton);
            return false;
        }

        public void fb(@NonNull CoordinatorLayout.a aVar) {
            if (aVar.s == 0) {
                aVar.s = 80;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean k5(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a8(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                x(extendedFloatingActionButton);
                return true;
            }
            ta(extendedFloatingActionButton);
            return true;
        }

        public void ta(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.zn) {
                ExtendedFloatingActionButton.xc(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.w(extendedFloatingActionButton);
            }
            extendedFloatingActionButton.mt(null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List listMt = coordinatorLayout.mt(extendedFloatingActionButton);
            int size = listMt.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) listMt.get(i5);
                if (!(view instanceof AppBarLayout)) {
                    if (z6(view) && k5(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (b(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.ud(extendedFloatingActionButton, i);
            return true;
        }

        public void x(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.zn) {
                ExtendedFloatingActionButton.t(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.tl(extendedFloatingActionButton);
            }
            extendedFloatingActionButton.mt(null, null);
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.cx);
            this.n3 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.vh, false);
            this.zn = typedArrayObtainStyledAttributes.getBoolean(R$styleable.hy, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super/*android.widget.Button*/.setTextColor(colorStateList);
        co();
    }
}
