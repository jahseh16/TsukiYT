package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i9.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o2.t;
import qn.ut;
import y2.s;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.n3 {
    public static final int pq = R$style.f2305tl;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public int f2518ap;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    public int f2519bk;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Animator f2520e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2521g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public int f2522g3;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public int f2523kp;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2524m;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public final int f2525nf;

    @NonNull
    public AnimatorListenerAdapter pz;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final y2.fb f2526ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public ArrayList<fb> f2527rb;

    @Nullable
    public Animator s8;
    public int tg;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Behavior f2528u0;
    public int y4;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public boolean f2529yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public int f2530yg;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f2535fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f2536s;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2535fb);
            parcel.writeInt(this.f2536s ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2535fb = parcel.readInt();
            this.f2536s = parcel.readInt() != 0;
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.pz.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonS8 = BottomAppBar.this.s8();
            if (floatingActionButtonS8 != null) {
                floatingActionButtonS8.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public interface fb {
        void n3(BottomAppBar bottomAppBar);

        void y(BottomAppBar bottomAppBar);
    }

    public class gv extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final /* synthetic */ boolean f2537gv;
        public final /* synthetic */ ActionMenuView n3;
        public boolean y;
        public final /* synthetic */ int zn;

        public gv(ActionMenuView actionMenuView, int i, boolean z) {
            this.n3 = actionMenuView;
            this.zn = i;
            this.f2537gv = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.y = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.y) {
                return;
            }
            boolean z = BottomAppBar.this.f2522g3 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m(bottomAppBar.f2522g3);
            BottomAppBar.this.pz(this.n3, this.zn, this.f2537gv, z);
        }
    }

    public class n3 extends FloatingActionButton.n3 {
        public final /* synthetic */ int y;

        public class y extends FloatingActionButton.n3 {
            public y() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.n3
            public void n3(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.ra();
            }
        }

        public n3(int i) {
            this.y = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.n3
        public void y(@NonNull FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.yc(this.y));
            floatingActionButton.co(new y());
        }
    }

    public class v implements Runnable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ boolean f2539fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f2541v;
        public final /* synthetic */ ActionMenuView y;

        public v(ActionMenuView actionMenuView, int i, boolean z) {
            this.y = actionMenuView;
            this.f2541v = i;
            this.f2539fb = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.y.setTranslationX(BottomAppBar.this.yg(r0, this.f2541v, this.f2539fb));
        }
    }

    public class y extends AnimatorListenerAdapter {
        public y() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.ra();
            BottomAppBar.this.f2520e = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.e();
        }
    }

    public class zn extends AnimatorListenerAdapter {
        public zn() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.ra();
            BottomAppBar.this.f2524m = false;
            BottomAppBar.this.s8 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            ActionMenuView childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f2519bk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return yc(this.f2518ap);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().gv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.tg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.y4;
    }

    @NonNull
    private w1.y getTopEdgeTreatment() {
        return (w1.y) this.f2526ra.rz().w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View ap() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : getParent().co(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public void bk(int i, int i5) {
        this.f2522g3 = i5;
        this.f2524m = true;
        rb(i, this.f2521g);
        g3(i);
        this.f2518ap = i;
    }

    public final void e() {
        ArrayList<fb> arrayList;
        int i = this.f2523kp;
        this.f2523kp = i + 1;
        if (i != 0 || (arrayList = this.f2527rb) == null) {
            return;
        }
        Iterator<fb> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().n3(this);
        }
    }

    public void eb(int i, List<Animator> list) {
        FloatingActionButton floatingActionButtonS8 = s8();
        if (floatingActionButtonS8 == null || floatingActionButtonS8.wz()) {
            return;
        }
        e();
        floatingActionButtonS8.t(new n3(i));
    }

    public final void g() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.s8 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (kp()) {
            tg(actionMenuView, this.f2518ap, this.f2521g);
        } else {
            tg(actionMenuView, 0, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g3(int i) {
        if (this.f2518ap == i || !ut.q9(this)) {
            return;
        }
        Animator animator = this.f2520e;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f2530yg == 1) {
            lc(i, arrayList);
        } else {
            eb(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f2520e = animatorSet;
        animatorSet.addListener(new y());
        this.f2520e.start();
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f2526ra.ta();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().gv();
    }

    public int getFabAlignmentMode() {
        return this.f2518ap;
    }

    public int getFabAnimationMode() {
        return this.f2530yg;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().fb();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().s();
    }

    public boolean getHideOnScroll() {
        return this.f2529yc;
    }

    public final boolean kp() {
        FloatingActionButton floatingActionButtonS8 = s8();
        return floatingActionButtonS8 != null && floatingActionButtonS8.xc();
    }

    public final void lc(int i, @NonNull List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(s8(), "translationX", yc(i));
        objectAnimatorOfFloat.setDuration(300L);
        list.add(objectAnimatorOfFloat);
    }

    public void m(int i) {
        if (i != 0) {
            this.f2522g3 = 0;
            getMenu().clear();
            f3(i);
        }
    }

    public final void nf(int i, boolean z, @NonNull List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - yg(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.addListener(new gv(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    public final void o4(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.v(this.pz);
        floatingActionButton.a(new a());
        floatingActionButton.fb(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        s.a(this, this.f2526ra);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        if (z) {
            rs();
            u0();
        }
        g();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.y());
        this.f2518ap = savedState.f2535fb;
        this.f2521g = savedState.f2536s;
    }

    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2535fb = this.f2518ap;
        savedState.f2536s = this.f2521g;
        return savedState;
    }

    public final void pz(@NonNull ActionMenuView actionMenuView, int i, boolean z, boolean z5) {
        v vVar = new v(actionMenuView, i, z);
        if (z5) {
            actionMenuView.post(vVar);
        } else {
            vVar.run();
        }
    }

    public final void ra() {
        ArrayList<fb> arrayList;
        int i = this.f2523kp - 1;
        this.f2523kp = i;
        if (i != 0 || (arrayList = this.f2527rb) == null) {
            return;
        }
        Iterator<fb> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().y(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void rb(int i, boolean z) {
        if (!ut.q9(this)) {
            this.f2524m = false;
            m(this.f2522g3);
            return;
        }
        Animator animator = this.s8;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!kp()) {
            i = 0;
            z = false;
        }
        nf(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.s8 = animatorSet;
        animatorSet.addListener(new zn());
        this.s8.start();
    }

    public final void rs() {
        Animator animator = this.s8;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f2520e;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    @Nullable
    public final FloatingActionButton s8() {
        View viewAp = ap();
        if (viewAp instanceof FloatingActionButton) {
            return (FloatingActionButton) viewAp;
        }
        return null;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        a8.y.xc(this.f2526ra, colorStateList);
    }

    public void setCradleVerticalOffset(float f3) {
        if (f3 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i9(f3);
            this.f2526ra.invalidateSelf();
            u0();
        }
    }

    public void setElevation(float f3) {
        this.f2526ra.q9(f3);
        getBehavior().z6(this, this.f2526ra.fh() - this.f2526ra.d0());
    }

    public void setFabAlignmentMode(int i) {
        bk(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f2530yg = i;
    }

    public void setFabCornerSize(float f3) {
        if (f3 != getTopEdgeTreatment().v()) {
            getTopEdgeTreatment().f(f3);
            this.f2526ra.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f3) {
        if (f3 != getFabCradleMargin()) {
            getTopEdgeTreatment().t(f3);
            this.f2526ra.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f3) {
        if (f3 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().tl(f3);
            this.f2526ra.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f2529yc = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public final void tg(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        pz(actionMenuView, i, z, false);
    }

    public final void u0() {
        getTopEdgeTreatment().xc(getFabTranslationX());
        View viewAp = ap();
        this.f2526ra.f7((this.f2521g && kp()) ? 1.0f : 0.0f);
        if (viewAp != null) {
            viewAp.setTranslationY(getFabTranslationY());
            viewAp.setTranslationX(getFabTranslationX());
        }
    }

    public boolean y4(int i) {
        float f3 = i;
        if (f3 == getTopEdgeTreatment().c5()) {
            return false;
        }
        getTopEdgeTreatment().wz(f3);
        this.f2526ra.invalidateSelf();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float yc(int i) {
        boolean zGv = t.gv(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.f2525nf + (zGv ? this.tg : this.y4))) * (zGv ? -1 : 1);
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int yg(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean zGv = t.gv(this);
        int measuredWidth = zGv ? getMeasuredWidth() : 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof Toolbar.v) && (((y.y) childAt.getLayoutParams()).y & 8388615) == 8388611) {
                measuredWidth = zGv ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zGv ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zGv ? this.y4 : -this.tg));
    }

    @NonNull
    public Behavior getBehavior() {
        if (this.f2528u0 == null) {
            this.f2528u0 = new Behavior();
        }
        return this.f2528u0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<BottomAppBar> f2531a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f2532fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final View.OnLayoutChangeListener f2533s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public final Rect f2534v;

        public class y implements View.OnLayoutChangeListener {
            public y() {
            }

            /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, com.google.android.material.bottomappbar.BottomAppBar] */
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i5, int i8, int i10, int i11, int i12, int i13, int i14) {
                ?? r22 = (BottomAppBar) Behavior.this.f2531a.get();
                if (r22 == 0 || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.i9(Behavior.this.f2534v);
                int iHeight = Behavior.this.f2534v.height();
                r22.y4(iHeight);
                r22.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().mt().y(new RectF(Behavior.this.f2534v)));
                CoordinatorLayout.a layoutParams = view.getLayoutParams();
                if (Behavior.this.f2532fb == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = r22.getBottomInset() + (r22.getResources().getDimensionPixelOffset(R$dimen.f2198d) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = r22.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = r22.getRightInset();
                    if (t.gv(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += r22.f2525nf;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += r22.f2525nf;
                    }
                }
            }
        }

        public Behavior() {
            this.f2533s = new y();
            this.f2534v = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        /* JADX INFO: renamed from: k5, reason: merged with bridge method [inline-methods] */
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i) {
            this.f2531a = new WeakReference<>(bottomAppBar);
            View viewAp = bottomAppBar.ap();
            if (viewAp != null && !ut.q9(viewAp)) {
                CoordinatorLayout.a layoutParams = viewAp.getLayoutParams();
                layoutParams.gv = 49;
                this.f2532fb = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                if (viewAp instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewAp;
                    floatingActionButton.addOnLayoutChangeListener(this.f2533s);
                    bottomAppBar.o4(floatingActionButton);
                }
                bottomAppBar.u0();
            }
            coordinatorLayout.ud(bottomAppBar, i);
            return super.t(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        /* JADX INFO: renamed from: yt, reason: merged with bridge method [inline-methods] */
        public boolean d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i, int i5) {
            return bottomAppBar.getHideOnScroll() && super.d0(coordinatorLayout, bottomAppBar, view, view2, i, i5);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2533s = new y();
            this.f2534v = new Rect();
        }
    }
}
