package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$integer;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.List;
import o.b;
import o.ud;
import o2.f;
import qn.d;
import qn.d0;
import qn.rs;
import qn.ut;
import u1.a;
import y2.fb;
import y2.s;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.n3 {

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final int f2467ej = R$style.f2292a;

    @Nullable
    public WeakReference<View> c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f2468co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Drawable f2469d;

    @Nullable
    public ValueAnimator d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2470f;
    public boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f2471fb;
    public int[] fh;
    public int n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<zn> f2472p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2475t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2476v;

    @Nullable
    public rs w;
    public int y;
    public boolean z;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ boolean d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i, int i5) {
            return super.d0(coordinatorLayout, appBarLayout, view, view2, i, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: eb */
        public /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i5, int[] iArr, int i8) {
            super.p(coordinatorLayout, appBarLayout, view, i, i5, iArr, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: lc */
        public /* bridge */ /* synthetic */ void z(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i5, int i8, int i10, int i11, int[] iArr) {
            super.z(coordinatorLayout, appBarLayout, view, i, i5, i8, i10, i11, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: nf */
        public /* bridge */ /* synthetic */ void f3(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.f3(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o4 */
        public /* bridge */ /* synthetic */ boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            return super.t(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: ra */
        public /* bridge */ /* synthetic */ Parcelable n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.n(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: rs */
        public /* bridge */ /* synthetic */ boolean tl(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i5, int i8, int i10) {
            return super.tl(coordinatorLayout, appBarLayout, i, i5, i8, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s8 */
        public /* bridge */ /* synthetic */ void rz(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i) {
            super.rz(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // u1.gv
        public /* bridge */ /* synthetic */ int ta() {
            return super.ta();
        }

        @Override // u1.gv
        public /* bridge */ /* synthetic */ boolean z6(int i) {
            return super.z6(i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends u1.zn {
        public ScrollingViewBehavior() {
        }

        public static int qn(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.zn znVarA = appBarLayout.getLayoutParams().a();
            if (znVarA instanceof BaseBehavior) {
                return ((BaseBehavior) znVarA).k5();
            }
            return 0;
        }

        @Override // u1.zn
        public float a8(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iQn = qn(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iQn > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iQn / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // u1.zn
        public int b(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.b(view);
        }

        public void c5(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ut.e(coordinatorLayout, ud.y.p.n3());
                ut.e(coordinatorLayout, ud.y.mt.n3());
            }
        }

        public boolean i4(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout appBarLayoutEj = ej(coordinatorLayout.mt(view));
            if (appBarLayoutEj != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f8336gv;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutEj.wz(false, !z);
                    return true;
                }
            }
            return false;
        }

        public final void j(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.i9()) {
                    appBarLayout.p(appBarLayout.co(view));
                }
            }
        }

        @Override // u1.zn
        @Nullable
        /* JADX INFO: renamed from: j5, reason: merged with bridge method [inline-methods] */
        public AppBarLayout ej(@NonNull List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void o(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.zn znVarA = view2.getLayoutParams().a();
            if (znVarA instanceof BaseBehavior) {
                ut.xg(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) znVarA).f2477f) + k5()) - ud(view2));
            }
        }

        public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            o(view, view2);
            j(view, view2);
            return false;
        }

        @Override // u1.gv
        public /* bridge */ /* synthetic */ boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            return super.t(coordinatorLayout, view, i);
        }

        @Override // u1.zn
        public /* bridge */ /* synthetic */ boolean tl(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i5, int i8, int i10) {
            return super.tl(coordinatorLayout, view, i, i5, i8, i10);
        }

        public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.h3);
            vl(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.hd, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class n3 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ fb y;

        public n3(fb fbVar) {
            this.y = fbVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            this.y.q9(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class y implements d {
        public y() {
        }

        public rs y(View view, rs rsVar) {
            return AppBarLayout.this.t(rsVar);
        }
    }

    public interface zn<T extends AppBarLayout> {
        void y(T t3, int i);
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.y);
    }

    public boolean a() {
        return this.f2470f;
    }

    public final void c5() {
        this.f2476v = -1;
        this.f2471fb = -1;
        this.f2474s = -1;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gv;
    }

    public boolean co(@Nullable View view) {
        View viewN3 = n3(view);
        if (viewN3 != null) {
            view = viewN3;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (mt()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.y);
            this.f2469d.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2469d;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void f(int i) {
        this.y = i;
        if (!willNotDraw()) {
            ut.lc(this);
        }
        List<zn> list = this.f2472p;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                zn znVar = this.f2472p.get(i5);
                if (znVar != null) {
                    znVar.y(this, i);
                }
            }
        }
    }

    public final boolean fb() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((gv) getChildAt(i).getLayoutParams()).zn()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public CoordinatorLayout.zn<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int iD;
        int i = this.f2471fb;
        if (i != -1) {
            return i;
        }
        int i5 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            gv gvVar = (gv) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = gvVar.y;
            if ((i8 & 5) != 5) {
                if (i5 > 0) {
                    break;
                }
            } else {
                int i10 = ((LinearLayout.LayoutParams) gvVar).topMargin + ((LinearLayout.LayoutParams) gvVar).bottomMargin;
                if ((i8 & 8) != 0) {
                    iD = ut.d(childAt);
                } else if ((i8 & 2) != 0) {
                    iD = measuredHeight - ut.d(childAt);
                } else {
                    iMin = i10 + measuredHeight;
                    if (childCount == 0 && ut.fh(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i5 += iMin;
                }
                iMin = i10 + iD;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i5 += iMin;
            }
        }
        int iMax = Math.max(0, i5);
        this.f2471fb = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f2474s;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int iD = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            gv gvVar = (gv) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) gvVar).topMargin + ((LinearLayout.LayoutParams) gvVar).bottomMargin;
            int i8 = gvVar.y;
            if ((i8 & 1) == 0) {
                break;
            }
            iD += measuredHeight;
            if ((i8 & 2) != 0) {
                iD -= ut.d(childAt);
                break;
            }
            i5++;
        }
        int iMax = Math.max(0, iD);
        this.f2474s = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iD = ut.d(this);
        if (iD == 0) {
            int childCount = getChildCount();
            iD = childCount >= 1 ? ut.d(getChildAt(childCount - 1)) : 0;
            if (iD == 0) {
                return getHeight() / 3;
            }
        }
        return (iD * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f2475t;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f2469d;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        rs rsVar = this.w;
        if (rsVar != null) {
            return rsVar.tl();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f2476v;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int iD = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            gv gvVar = (gv) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = gvVar.y;
            if ((i8 & 1) == 0) {
                break;
            }
            iD += measuredHeight + ((LinearLayout.LayoutParams) gvVar).topMargin + ((LinearLayout.LayoutParams) gvVar).bottomMargin;
            if (i5 == 0 && ut.fh(childAt)) {
                iD -= getTopInset();
            }
            if ((i8 & 2) != 0) {
                iD -= ut.d(childAt);
                break;
            }
            i5++;
        }
        int iMax = Math.max(0, iD);
        this.f2476v = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
    public gv generateLayoutParams(AttributeSet attributeSet) {
        return new gv(getContext(), attributeSet);
    }

    public boolean i9() {
        return this.f3;
    }

    public final boolean mt() {
        return this.f2469d != null && getTopInset() > 0;
    }

    @Nullable
    public final View n3(@Nullable View view) {
        int i;
        if (this.c == null && (i = this.n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (viewFindViewById != null) {
                this.c = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s.v(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.fh == null) {
            this.fh = new int[4];
        }
        int[] iArr = this.fh;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.z;
        int i5 = R$attr.f2165ej;
        if (!z) {
            i5 = -i5;
        }
        iArr[0] = i5;
        iArr[1] = (z && this.f2473r) ? R$attr.f2179ud : -R$attr.f2179ud;
        int i8 = R$attr.f2164d;
        if (!z) {
            i8 = -i8;
        }
        iArr[2] = i8;
        iArr[3] = (z && this.f2473r) ? R$attr.f2177ta : -R$attr.f2177ta;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        boolean z5 = true;
        if (ut.fh(this) && z()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ut.xg(getChildAt(childCount), topInset);
            }
        }
        c5();
        this.f2470f = false;
        int childCount2 = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount2) {
                break;
            }
            if (((gv) getChildAt(i11).getLayoutParams()).n3() != null) {
                this.f2470f = true;
                break;
            }
            i11++;
        }
        Drawable drawable = this.f2469d;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f2468co) {
            return;
        }
        if (!this.f3 && !fb()) {
            z5 = false;
        }
        w(z5);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != 1073741824 && ut.fh(this) && z()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = b.y.n3(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i5));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        c5();
    }

    public boolean p(boolean z) {
        if (this.f2473r == z) {
            return false;
        }
        this.f2473r = z;
        refreshDrawableState();
        if (!this.f3 || !(getBackground() instanceof fb)) {
            return true;
        }
        r((fb) getBackground(), z);
        return true;
    }

    public final void r(@NonNull fb fbVar, boolean z) {
        float dimension = getResources().getDimension(R$dimen.y);
        float f3 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, dimension);
        this.d0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(R$integer.y));
        this.d0.setInterpolator(t1.y.y);
        this.d0.addUpdateListener(new n3(fbVar));
        this.d0.start();
    }

    public boolean s() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        s.gv(this, f3);
    }

    public void setExpanded(boolean z) {
        wz(z, ut.q9(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f3 = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.n = i;
        y();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f2469d;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f2469d = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f2469d.setState(getDrawableState());
                }
                a8.y.tl(this.f2469d, ut.ta(this));
                this.f2469d.setVisible(getVisibility() == 0, false);
                this.f2469d.setCallback(this);
            }
            x4();
            ut.lc(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(f.n3.gv(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f3) {
        a.n3(this, f3);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2469d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public rs t(rs rsVar) {
        rs rsVar2 = ut.fh(this) ? rsVar : null;
        if (!j5.zn.y(this.w, rsVar2)) {
            this.w = rsVar2;
            x4();
            requestLayout();
        }
        return rsVar;
    }

    public void tl() {
        this.f2475t = 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public gv generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new gv((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new gv((ViewGroup.MarginLayoutParams) layoutParams) : new gv(layoutParams);
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2469d;
    }

    public final boolean w(boolean z) {
        if (this.z == z) {
            return false;
        }
        this.z = z;
        refreshDrawableState();
        return true;
    }

    public void wz(boolean z, boolean z5) {
        xc(z, z5, true);
    }

    public final void x4() {
        setWillNotDraw(!mt());
    }

    public final void xc(boolean z, boolean z5, boolean z7) {
        this.f2475t = (z ? 1 : 2) | (z5 ? 4 : 0) | (z7 ? 8 : 0);
        requestLayout();
    }

    public final void y() {
        WeakReference<View> weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.c = null;
    }

    public final boolean z() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || ut.fh(childAt)) ? false : true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
    public gv generateDefaultLayoutParams() {
        return new gv(-1, -2);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends u1.n3<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2477f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public WeakReference<View> f2478p;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2479t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public ValueAnimator f2480tl;
        public float w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public int f2481wz;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public boolean f2482xc;

        public class n3 implements b {

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public final /* synthetic */ int f2486gv;
            public final /* synthetic */ AppBarLayout n3;
            public final /* synthetic */ CoordinatorLayout y;
            public final /* synthetic */ View zn;

            public n3(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.y = coordinatorLayout;
                this.n3 = appBarLayout;
                this.zn = view;
                this.f2486gv = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public boolean y(@NonNull View view, @Nullable b.y yVar) {
                BaseBehavior.this.p(this.y, this.n3, this.zn, 0, this.f2486gv, new int[]{0, 0}, 1);
                return true;
            }
        }

        public class y implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ AppBarLayout n3;
            public final /* synthetic */ CoordinatorLayout y;

            public y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.y = coordinatorLayout;
                this.n3 = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseBehavior.this.hw(this.y, this.n3, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class zn implements b {
            public final /* synthetic */ boolean n3;
            public final /* synthetic */ AppBarLayout y;

            public zn(AppBarLayout appBarLayout, boolean z) {
                this.y = appBarLayout;
                this.n3 = z;
            }

            public boolean y(@NonNull View view, @Nullable b.y yVar) {
                this.y.setExpanded(this.n3);
                return true;
            }
        }

        public BaseBehavior() {
            this.f2481wz = -1;
        }

        public static boolean f7(int i, int i5) {
            return (i & i5) == i5;
        }

        @Nullable
        public static View jz(@NonNull AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = appBarLayout.getChildAt(i5);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // u1.n3
        /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
        public int j5(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3, int i, int i5, int i8) {
            int iK5 = k5();
            int i10 = 0;
            if (i5 == 0 || iK5 < i5 || iK5 > i8) {
                this.f2477f = 0;
            } else {
                int iN3 = b.y.n3(i, i5, i8);
                if (iK5 != iN3) {
                    int iDm = t3.a() ? dm(t3, iN3) : iN3;
                    boolean zZ6 = z6(iDm);
                    i10 = iK5 - iN3;
                    this.f2477f = iN3 - iDm;
                    if (!zZ6 && t3.a()) {
                        coordinatorLayout.a(t3);
                    }
                    t3.f(ta());
                    rb(coordinatorLayout, t3, iN3, iN3 < iK5 ? -1 : 1, false);
                }
            }
            kp(coordinatorLayout, t3);
            return i10;
        }

        @Override // u1.n3
        /* JADX INFO: renamed from: ct, reason: merged with bridge method [inline-methods] */
        public void yt(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3) {
            yc(coordinatorLayout, t3);
            if (t3.i9()) {
                t3.p(t3.co(en(coordinatorLayout)));
            }
        }

        public final int dm(@NonNull T t3, int i) {
            int iAbs = Math.abs(i);
            int childCount = t3.getChildCount();
            int topInset = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                View childAt = t3.getChildAt(i5);
                gv gvVar = (gv) childAt.getLayoutParams();
                Interpolator interpolatorN3 = gvVar.n3();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i5++;
                } else if (interpolatorN3 != null) {
                    int iY = gvVar.y();
                    if ((iY & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) gvVar).topMargin + ((LinearLayout.LayoutParams) gvVar).bottomMargin;
                        if ((iY & 2) != 0) {
                            topInset -= ut.d(childAt);
                        }
                    }
                    if (ut.fh(childAt)) {
                        topInset -= t3.getTopInset();
                    }
                    if (topInset > 0) {
                        float f3 = topInset;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f3 * interpolatorN3.getInterpolation((iAbs - childAt.getTop()) / f3)));
                    }
                }
            }
            return i;
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3, @NonNull View view, View view2, int i, int i5) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t3.i9() || k(coordinatorLayout, t3, view));
            if (z && (valueAnimator = this.f2480tl) != null) {
                valueAnimator.cancel();
            }
            this.f2478p = null;
            this.f2479t = i5;
            return z;
        }

        /* JADX INFO: renamed from: eb, reason: merged with bridge method [inline-methods] */
        public void p(CoordinatorLayout coordinatorLayout, @NonNull T t3, View view, int i, int i5, int[] iArr, int i8) {
            int i10;
            int downNestedPreScrollRange;
            if (i5 != 0) {
                if (i5 < 0) {
                    int i11 = -t3.getTotalScrollRange();
                    i10 = i11;
                    downNestedPreScrollRange = t3.getDownNestedPreScrollRange() + i11;
                } else {
                    i10 = -t3.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i10 != downNestedPreScrollRange) {
                    iArr[1] = vl(coordinatorLayout, t3, i5, i10, downNestedPreScrollRange);
                }
            }
            if (t3.i9()) {
                t3.p(t3.co(view));
            }
        }

        @Nullable
        public final View en(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof d0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void j(CoordinatorLayout coordinatorLayout, @NonNull T t3, @NonNull ud.y yVar, boolean z) {
            ut.ap(coordinatorLayout, yVar, (CharSequence) null, new zn(t3, z));
        }

        public final boolean k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3, @NonNull View view) {
            return t3.s() && coordinatorLayout.getHeight() - view.getHeight() <= t3.getHeight();
        }

        @Override // u1.n3
        public int k5() {
            return ta() + this.f2477f;
        }

        public final void kp(CoordinatorLayout coordinatorLayout, @NonNull T t3) {
            ut.e(coordinatorLayout, ud.y.p.n3());
            ut.e(coordinatorLayout, ud.y.mt.n3());
            View viewEn = en(coordinatorLayout);
            if (viewEn == null || t3.getTotalScrollRange() == 0 || !(viewEn.getLayoutParams().a() instanceof ScrollingViewBehavior)) {
                return;
            }
            o(coordinatorLayout, t3, viewEn);
        }

        /* JADX INFO: renamed from: lc, reason: merged with bridge method [inline-methods] */
        public void z(CoordinatorLayout coordinatorLayout, @NonNull T t3, View view, int i, int i5, int i8, int i10, int i11, int[] iArr) {
            if (i10 < 0) {
                iArr[1] = vl(coordinatorLayout, t3, i10, -t3.getDownNestedScrollRange(), 0);
            }
            if (i10 == 0) {
                kp(coordinatorLayout, t3);
            }
        }

        /* JADX INFO: renamed from: nf, reason: merged with bridge method [inline-methods] */
        public void f3(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                super.f3(coordinatorLayout, t3, parcelable);
                this.f2481wz = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.f3(coordinatorLayout, t3, savedState.y());
            this.f2481wz = savedState.f2484fb;
            this.w = savedState.f2485s;
            this.f2482xc = savedState.f2483f;
        }

        public final void o(CoordinatorLayout coordinatorLayout, @NonNull T t3, @NonNull View view) {
            if (k5() != (-t3.getTotalScrollRange()) && view.canScrollVertically(1)) {
                j(coordinatorLayout, t3, ud.y.p, false);
            }
            if (k5() != 0) {
                if (!view.canScrollVertically(-1)) {
                    j(coordinatorLayout, t3, ud.y.mt, true);
                    return;
                }
                int i = -t3.getDownNestedPreScrollRange();
                if (i != 0) {
                    ut.ap(coordinatorLayout, ud.y.mt, (CharSequence) null, new n3(coordinatorLayout, t3, view, i));
                }
            }
        }

        @Override // u1.gv
        /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3, int i) {
            boolean zT = super.t(coordinatorLayout, t3, i);
            int pendingAction = t3.getPendingAction();
            int i5 = this.f2481wz;
            if (i5 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t3.getChildAt(i5);
                hw(coordinatorLayout, t3, (-childAt.getBottom()) + (this.f2482xc ? ut.d(childAt) + t3.getTopInset() : Math.round(childAt.getHeight() * this.w)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i8 = -t3.getUpNestedPreScrollRange();
                    if (z) {
                        oz(coordinatorLayout, t3, i8, 0.0f);
                    } else {
                        hw(coordinatorLayout, t3, i8);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        oz(coordinatorLayout, t3, 0, 0.0f);
                    } else {
                        hw(coordinatorLayout, t3, 0);
                    }
                }
            }
            t3.tl();
            this.f2481wz = -1;
            z6(b.y.n3(ta(), -t3.getTotalScrollRange(), 0));
            rb(coordinatorLayout, t3, ta(), 0, true);
            t3.f(ta());
            kp(coordinatorLayout, t3);
            return zT;
        }

        public final void oz(CoordinatorLayout coordinatorLayout, @NonNull T t3, int i, float f3) {
            int iAbs = Math.abs(k5() - i);
            float fAbs = Math.abs(f3);
            ut(coordinatorLayout, t3, i, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t3.getHeight()) + 1.0f) * 150.0f));
        }

        @Override // u1.n3
        /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
        public boolean ej(T t3) {
            WeakReference<View> weakReference = this.f2478p;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: renamed from: ra, reason: merged with bridge method [inline-methods] */
        public Parcelable n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3) {
            Parcelable parcelableN = super.n(coordinatorLayout, t3);
            int iTa = ta();
            int childCount = t3.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t3.getChildAt(i);
                int bottom = childAt.getBottom() + iTa;
                if (childAt.getTop() + iTa <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(parcelableN);
                    savedState.f2484fb = i;
                    savedState.f2483f = bottom == ut.d(childAt) + t3.getTopInset();
                    savedState.f2485s = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return parcelableN;
        }

        public final void rb(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3, int i, int i5, boolean z) {
            View viewJz = jz(t3, i);
            if (viewJz != null) {
                int iY = ((gv) viewJz.getLayoutParams()).y();
                boolean zCo = false;
                if ((iY & 1) != 0) {
                    int iD = ut.d(viewJz);
                    if (i5 <= 0 || (iY & 12) == 0 ? !((iY & 2) == 0 || (-i) < (viewJz.getBottom() - iD) - t3.getTopInset()) : (-i) >= (viewJz.getBottom() - iD) - t3.getTopInset()) {
                        zCo = true;
                    }
                }
                if (t3.i9()) {
                    zCo = t3.co(en(coordinatorLayout));
                }
                boolean zP = t3.p(zCo);
                if (z || (zP && yg(coordinatorLayout, t3))) {
                    t3.jumpDrawablesToCurrentState();
                }
            }
        }

        /* JADX INFO: renamed from: rs, reason: merged with bridge method [inline-methods] */
        public boolean tl(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3, int i, int i5, int i8, int i10) {
            if (((ViewGroup.MarginLayoutParams) t3.getLayoutParams()).height != -2) {
                return super.tl(coordinatorLayout, t3, i, i5, i8, i10);
            }
            coordinatorLayout.a8(t3, i, i5, View.MeasureSpec.makeMeasureSpec(0, 0), i10);
            return true;
        }

        /* JADX INFO: renamed from: s8, reason: merged with bridge method [inline-methods] */
        public void rz(CoordinatorLayout coordinatorLayout, @NonNull T t3, View view, int i) {
            if (this.f2479t == 0 || i == 1) {
                yc(coordinatorLayout, t3);
                if (t3.i9()) {
                    t3.p(t3.co(view));
                }
            }
            this.f2478p = new WeakReference<>(view);
        }

        public final int u(@NonNull T t3, int i) {
            int childCount = t3.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t3.getChildAt(i5);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                gv gvVar = (gv) childAt.getLayoutParams();
                if (f7(gvVar.y(), 32)) {
                    top -= ((LinearLayout.LayoutParams) gvVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) gvVar).bottomMargin;
                }
                int i8 = -i;
                if (top <= i8 && bottom >= i8) {
                    return i5;
                }
            }
            return -1;
        }

        public final void ut(CoordinatorLayout coordinatorLayout, T t3, int i, int i5) {
            int iK5 = k5();
            if (iK5 == i) {
                ValueAnimator valueAnimator = this.f2480tl;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f2480tl.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f2480tl;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f2480tl = valueAnimator3;
                valueAnimator3.setInterpolator(t1.y.f8181v);
                this.f2480tl.addUpdateListener(new y(coordinatorLayout, t3));
            } else {
                valueAnimator2.cancel();
            }
            this.f2480tl.setDuration(Math.min(i5, 600));
            this.f2480tl.setIntValues(iK5, i);
            this.f2480tl.start();
        }

        @Override // u1.n3
        /* JADX INFO: renamed from: xg, reason: merged with bridge method [inline-methods] */
        public int b(@NonNull T t3) {
            return t3.getTotalScrollRange();
        }

        @Override // u1.n3
        /* JADX INFO: renamed from: y5, reason: merged with bridge method [inline-methods] */
        public int x(@NonNull T t3) {
            return -t3.getDownNestedScrollRange();
        }

        public final void yc(CoordinatorLayout coordinatorLayout, @NonNull T t3) {
            int iK5 = k5();
            int iU = u(t3, iK5);
            if (iU >= 0) {
                View childAt = t3.getChildAt(iU);
                gv gvVar = (gv) childAt.getLayoutParams();
                int iY = gvVar.y();
                if ((iY & 17) == 17) {
                    int i = -childAt.getTop();
                    int iD = -childAt.getBottom();
                    if (iU == t3.getChildCount() - 1) {
                        iD += t3.getTopInset();
                    }
                    if (f7(iY, 2)) {
                        iD += ut.d(childAt);
                    } else if (f7(iY, 5)) {
                        int iD2 = ut.d(childAt) + iD;
                        if (iK5 < iD2) {
                            i = iD2;
                        } else {
                            iD = iD2;
                        }
                    }
                    if (f7(iY, 32)) {
                        i += ((LinearLayout.LayoutParams) gvVar).topMargin;
                        iD -= ((LinearLayout.LayoutParams) gvVar).bottomMargin;
                    }
                    if (iK5 < (iD + i) / 2) {
                        i = iD;
                    }
                    oz(coordinatorLayout, t3, b.y.n3(i, -t3.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final boolean yg(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t3) {
            List listCo = coordinatorLayout.co(t3);
            int size = listCo.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.zn znVarA = ((View) listCo.get(i)).getLayoutParams().a();
                if (znVarA instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) znVarA).x() != 0;
                }
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2481wz = -1;
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new y();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f2483f;

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public int f2484fb;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public float f2485s;

            public static class y implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @Nullable
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f2484fb = parcel.readInt();
                this.f2485s = parcel.readFloat();
                this.f2483f = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f2484fb);
                parcel.writeFloat(this.f2485s);
                parcel.writeByte(this.f2483f ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5 = f2467ej;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        this.f2476v = -1;
        this.f2471fb = -1;
        this.f2474s = -1;
        this.f2475t = 0;
        Context context2 = getContext();
        setOrientation(1);
        int i8 = Build.VERSION.SDK_INT;
        a.y(this);
        a.zn(this, attributeSet, i, i5);
        TypedArray typedArrayS = f.s(context2, attributeSet, R$styleable.f2338f, i, i5, new int[0]);
        ut.u0(this, typedArrayS.getDrawable(R$styleable.f2425t));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            fb fbVar = new fb();
            fbVar.k(ColorStateList.valueOf(colorDrawable.getColor()));
            fbVar.k5(context2);
            ut.u0(this, fbVar);
        }
        if (typedArrayS.hasValue(R$styleable.w)) {
            xc(typedArrayS.getBoolean(R$styleable.w, false), false, false);
        }
        if (typedArrayS.hasValue(R$styleable.f2455xc)) {
            a.n3(this, typedArrayS.getDimensionPixelSize(R$styleable.f2455xc, 0));
        }
        if (i8 >= 26) {
            if (typedArrayS.hasValue(R$styleable.f2451wz)) {
                setKeyboardNavigationCluster(typedArrayS.getBoolean(R$styleable.f2451wz, false));
            }
            if (typedArrayS.hasValue(R$styleable.f2430tl)) {
                setTouchscreenBlocksFocus(typedArrayS.getBoolean(R$styleable.f2430tl, false));
            }
        }
        this.f3 = typedArrayS.getBoolean(R$styleable.f2405p, false);
        this.n = typedArrayS.getResourceId(R$styleable.f2391mt, -1);
        setStatusBarForeground(typedArrayS.getDrawable(R$styleable.f2327co));
        typedArrayS.recycle();
        ut.ad(this, new y());
    }

    public static class gv extends LinearLayout.LayoutParams {
        public Interpolator n3;
        public int y;

        public gv(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.y = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2414r);
            this.y = typedArrayObtainStyledAttributes.getInt(R$styleable.f2453x4, 0);
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f2360i4)) {
                this.n3 = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.f2360i4, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public Interpolator n3() {
            return this.n3;
        }

        public int y() {
            return this.y;
        }

        public boolean zn() {
            int i = this.y;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public gv(int i, int i5) {
            super(i, i5);
            this.y = 1;
        }

        public gv(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.y = 1;
        }

        public gv(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.y = 1;
        }

        public gv(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.y = 1;
        }
    }
}
