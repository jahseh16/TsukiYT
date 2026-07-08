package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.y;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import o2.t;
import o2.tl;
import qn.ut;
import t1.f;
import t1.s;
import y2.wz;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends tl implements m2.y, wz, CoordinatorLayout.n3 {

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final int f2719ej = R$style.f2303s;
    public final Rect c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f2720co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.material.floatingactionbutton.y f2721d;

    @NonNull
    public final w.tl d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f2722f;
    public boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f2723fb;

    @NonNull
    public final m2.n3 fh;
    public final Rect n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2724p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public ColorStateList f2726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public ColorStateList f2727t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public ColorStateList f2728v;
    public int w;
    public int z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: ej */
        public /* bridge */ /* synthetic */ boolean s(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.s(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void fb(@NonNull CoordinatorLayout.a aVar) {
            super.fb(aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: ta */
        public /* bridge */ /* synthetic */ boolean n3(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.n3(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: ud */
        public /* bridge */ /* synthetic */ boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i) {
            return super.t(coordinatorLayout, floatingActionButton, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class gv<T extends FloatingActionButton> implements y.c5 {
        public gv(@NonNull f<T> fVar) {
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof gv)) {
                return false;
            }
            ((gv) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.y.c5
        public void n3() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.y.c5
        public void y() {
            throw null;
        }
    }

    public static abstract class n3 {
        public void n3(FloatingActionButton floatingActionButton) {
        }

        public void y(FloatingActionButton floatingActionButton) {
        }
    }

    public class y implements y.i9 {
        public final /* synthetic */ n3 y;

        public y(n3 n3Var) {
            this.y = n3Var;
        }

        @Override // com.google.android.material.floatingactionbutton.y.i9
        public void n3() {
            this.y.y(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.y.i9
        public void y() {
            this.y.n3(FloatingActionButton.this);
        }
    }

    public class zn implements v2.n3 {
        public zn() {
        }

        @Override // v2.n3
        public void n3(@Nullable Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // v2.n3
        public void y(int i, int i5, int i8, int i10) {
            FloatingActionButton.this.n.set(i, i5, i8, i10);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.z, i5 + FloatingActionButton.this.z, i8 + FloatingActionButton.this.z, i10 + FloatingActionButton.this.z);
        }

        @Override // v2.n3
        public boolean zn() {
            return FloatingActionButton.this.f3;
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2163co);
    }

    private com.google.android.material.floatingactionbutton.y getImpl() {
        if (this.f2721d == null) {
            this.f2721d = s();
        }
        return this.f2721d;
    }

    public static int mt(int i, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public void a(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().v(animatorListener);
    }

    @Deprecated
    public boolean c5(@NonNull Rect rect) {
        if (!ut.q9(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        w(rect);
        return true;
    }

    public void co(@Nullable n3 n3Var) {
        z(n3Var, true);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mg(getDrawableState());
    }

    public final int f(int i) {
        int i5 = this.f2720co;
        if (i5 != 0) {
            return i5;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R$dimen.f2202gv) : resources.getDimensionPixelSize(R$dimen.zn) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public void fb(@NonNull f<? extends FloatingActionButton> fVar) {
        getImpl().a(new gv(fVar));
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f2728v;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f2723fb;
    }

    @NonNull
    public CoordinatorLayout.zn<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().tl();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().w();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().co();
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().i9();
    }

    public int getCustomSize() {
        return this.f2720co;
    }

    public int getExpandedComponentIdHint() {
        return this.fh.n3();
    }

    @Nullable
    public s getHideMotionSpec() {
        return getImpl().xc();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f2727t;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f2727t;
    }

    @NonNull
    public y2.f getShapeAppearanceModel() {
        return (y2.f) j5.s.fb(getImpl().z());
    }

    @Nullable
    public s getShowMotionSpec() {
        return getImpl().r();
    }

    public int getSize() {
        return this.f2724p;
    }

    public int getSizeDimension() {
        return f(this.f2724p);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f2726s;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f2722f;
    }

    public boolean getUseCompatPadding() {
        return this.f3;
    }

    public void i9(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        w(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().d0();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().rz();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i5) {
        int sizeDimension = getSizeDimension();
        this.z = (sizeDimension - this.f2725r) / 2;
        getImpl().dm();
        int iMin = Math.min(mt(sizeDimension, i), mt(sizeDimension, i5));
        Rect rect = this.n;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.y());
        this.fh.gv((Bundle) j5.s.fb(extendableSavedState.f2811fb.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f2811fb.put("expandableWidgetHelper", this.fh.v());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && c5(this.c) && !this.c.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f2726s;
        if (colorStateList == null) {
            a8.y.zn(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f2722f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(w.f.v(colorForState, mode));
    }

    @Nullable
    public final y.i9 r(@Nullable n3 n3Var) {
        if (n3Var == null) {
            return null;
        }
        return new y(n3Var);
    }

    @NonNull
    public final com.google.android.material.floatingactionbutton.y s() {
        return new n2.n3(this, new zn());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f2728v != colorStateList) {
            this.f2728v = colorStateList;
            getImpl().x(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f2723fb != mode) {
            this.f2723fb = mode;
            getImpl().b(mode);
        }
    }

    public void setCompatElevation(float f3) {
        getImpl().k5(f3);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f3) {
        getImpl().hw(f3);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f3) {
        getImpl().j(f3);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f2720co) {
            this.f2720co = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        getImpl().ct(f3);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().wz()) {
            getImpl().yt(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.fh.a(i);
    }

    public void setHideMotionSpec(@Nullable s sVar) {
        getImpl().vl(sVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(s.zn(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().xg();
            if (this.f2726s != null) {
                p();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.d0.fb(i);
        p();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f3) {
        super.setScaleX(f3);
        getImpl().ej();
    }

    @Override // android.view.View
    public void setScaleY(float f3) {
        super.setScaleY(f3);
        getImpl().ej();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().ut(z);
    }

    @Override // y2.wz
    public void setShapeAppearanceModel(@NonNull y2.f fVar) {
        getImpl().q9(fVar);
    }

    public void setShowMotionSpec(@Nullable s sVar) {
        getImpl().k(sVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(s.zn(getContext(), i));
    }

    public void setSize(int i) {
        this.f2720co = 0;
        if (i != this.f2724p) {
            this.f2724p = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f2726s != colorStateList) {
            this.f2726s = colorStateList;
            p();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f2722f != mode) {
            this.f2722f = mode;
            p();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f3) {
        super.setTranslationX(f3);
        getImpl().ud();
    }

    @Override // android.view.View
    public void setTranslationY(float f3) {
        super.setTranslationY(f3);
        getImpl().ud();
    }

    @Override // android.view.View
    public void setTranslationZ(float f3) {
        super.setTranslationZ(f3);
        getImpl().ud();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3 != z) {
            this.f3 = z;
            getImpl().fh();
        }
    }

    @Override // o2.tl, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void t(@Nullable n3 n3Var) {
        tl(n3Var, true);
    }

    public void tl(@Nullable n3 n3Var, boolean z) {
        getImpl().x4(r(n3Var), z);
    }

    public void v(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().gv(animatorListener);
    }

    public final void w(@NonNull Rect rect) {
        int i = rect.left;
        Rect rect2 = this.n;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public boolean wz() {
        return getImpl().f3();
    }

    public boolean xc() {
        return getImpl().n();
    }

    @Override // m2.y
    public boolean y() {
        return this.fh.zn();
    }

    public void z(@Nullable n3 n3Var, boolean z) {
        getImpl().u(r(n3Var), z);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.zn<T> {
        public n3 n3;
        public Rect y;
        public boolean zn;

        public BaseBehavior() {
            this.zn = true;
        }

        private static boolean d(@NonNull View view) {
            CoordinatorLayout.a layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.a) {
                return layoutParams.a() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public final boolean a8(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.zn && floatingActionButton.getLayoutParams().v() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean b(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!a8(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.tl(this.n3, false);
                return true;
            }
            floatingActionButton.z(this.n3, false);
            return true;
        }

        /* JADX INFO: renamed from: ej, reason: merged with bridge method [inline-methods] */
        public boolean s(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                x(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!d(view)) {
                return false;
            }
            b(view, floatingActionButton);
            return false;
        }

        public void fb(@NonNull CoordinatorLayout.a aVar) {
            if (aVar.s == 0) {
                aVar.s = 80;
            }
        }

        /* JADX INFO: renamed from: ta, reason: merged with bridge method [inline-methods] */
        public boolean n3(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i) {
            List listMt = coordinatorLayout.mt(floatingActionButton);
            int size = listMt.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) listMt.get(i5);
                if (!(view instanceof AppBarLayout)) {
                    if (d(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (x(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.ud(floatingActionButton, i);
            z6(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean x(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!a8(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.y == null) {
                this.y = new Rect();
            }
            Rect rect = this.y;
            o2.n3.y(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.tl(this.n3, false);
                return true;
            }
            floatingActionButton.z(this.n3, false);
            return true;
        }

        public final void z6(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.n;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.a layoutParams = floatingActionButton.getLayoutParams();
            int i = 0;
            int i5 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                ut.xg(floatingActionButton, i);
            }
            if (i5 != 0) {
                ut.y5(floatingActionButton, i5);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.vd);
            this.zn = typedArrayObtainStyledAttributes.getBoolean(R$styleable.t5, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5 = f2719ej;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        this.n = new Rect();
        this.c = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayS = o2.f.s(context2, attributeSet, R$styleable.xq, i, i5, new int[0]);
        this.f2728v = t2.zn.y(context2, typedArrayS, R$styleable.jb);
        this.f2723fb = t.v(typedArrayS.getInt(R$styleable.sw, -1), null);
        this.f2727t = t2.zn.y(context2, typedArrayS, R$styleable.fq);
        this.f2724p = typedArrayS.getInt(R$styleable.wo, -1);
        this.f2720co = typedArrayS.getDimensionPixelSize(R$styleable.l0, 0);
        this.w = typedArrayS.getDimensionPixelSize(R$styleable.v1, 0);
        float dimension = typedArrayS.getDimension(R$styleable.gi, 0.0f);
        float dimension2 = typedArrayS.getDimension(R$styleable.hb, 0.0f);
        float dimension3 = typedArrayS.getDimension(R$styleable.vb, 0.0f);
        this.f3 = typedArrayS.getBoolean(R$styleable.ux, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.oz);
        this.f2725r = typedArrayS.getDimensionPixelSize(R$styleable.ob, 0);
        s sVarN3 = s.n3(context2, typedArrayS, R$styleable.sx);
        s sVarN32 = s.n3(context2, typedArrayS, R$styleable.zh);
        y2.f fVarTl = y2.f.fb(context2, attributeSet, i, i5, y2.f.f9233tl).tl();
        boolean z = typedArrayS.getBoolean(R$styleable.zx, false);
        setEnabled(typedArrayS.getBoolean(R$styleable.jt, true));
        typedArrayS.recycle();
        w.tl tlVar = new w.tl(this);
        this.d0 = tlVar;
        tlVar.a(attributeSet, i);
        this.fh = new m2.n3(this);
        getImpl().q9(fVarTl);
        getImpl().i4(this.f2728v, this.f2723fb, this.f2727t, this.w);
        getImpl().o(dimensionPixelSize);
        getImpl().k5(dimension);
        getImpl().hw(dimension2);
        getImpl().j(dimension3);
        getImpl().qn(this.f2725r);
        getImpl().k(sVarN3);
        getImpl().vl(sVarN32);
        getImpl().yt(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f2727t != colorStateList) {
            this.f2727t = colorStateList;
            getImpl().oz(this.f2727t);
        }
    }
}
