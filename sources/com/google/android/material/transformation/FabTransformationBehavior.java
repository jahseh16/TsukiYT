package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e2.gv;
import java.util.ArrayList;
import java.util.List;
import qn.ut;
import t1.c5;
import t1.i9;
import t1.s;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2976a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f2977fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final RectF f2978gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2979s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f2980v;
    public final Rect zn;

    public class gv extends AnimatorListenerAdapter {
        public final /* synthetic */ e2.gv y;

        public gv(e2.gv gvVar) {
            this.y = gvVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gv.v revealInfo = this.y.getRevealInfo();
            revealInfo.zn = Float.MAX_VALUE;
            this.y.setRevealInfo(revealInfo);
        }
    }

    public class n3 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View y;

        public n3(View view) {
            this.y = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.y.invalidate();
        }
    }

    public static class v {
        public i9 n3;

        @Nullable
        public s y;
    }

    public class y extends AnimatorListenerAdapter {
        public final /* synthetic */ View n3;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ View zn;

        public y(boolean z, View view, View view2) {
            this.y = z;
            this.n3 = view;
            this.zn = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.y) {
                return;
            }
            this.n3.setVisibility(4);
            this.zn.setAlpha(1.0f);
            this.zn.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.y) {
                this.n3.setVisibility(0);
                this.zn.setAlpha(0.0f);
                this.zn.setVisibility(4);
            }
        }
    }

    public class zn extends AnimatorListenerAdapter {
        public final /* synthetic */ Drawable n3;
        public final /* synthetic */ e2.gv y;

        public zn(e2.gv gvVar, Drawable drawable) {
            this.y = gvVar;
            this.n3 = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.y.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.y.setCircularRevealOverlayDrawable(this.n3);
        }
    }

    public FabTransformationBehavior() {
        this.zn = new Rect();
        this.f2978gv = new RectF();
        this.f2980v = new RectF();
        this.f2976a = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet a8(@NonNull View view, @NonNull View view2, boolean z, boolean z5) {
        v vVarDm = dm(view2.getContext(), z);
        if (z) {
            this.f2977fb = view.getTranslationX();
            this.f2979s = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        k(view, view2, z, z5, vVarDm, arrayList, arrayList2);
        RectF rectF = this.f2978gv;
        y5(view, view2, z, z5, vVarDm, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        q9(view, view2, z, vVarDm, arrayList);
        en(view, view2, z, z5, vVarDm, arrayList, arrayList2);
        f7(view, view2, z, z5, vVarDm, fWidth, fHeight, arrayList, arrayList2);
        ut(view, view2, z, z5, vVarDm, arrayList, arrayList2);
        oz(view, view2, z, z5, vVarDm, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        t1.n3.y(animatorSet, arrayList);
        animatorSet.addListener(new y(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    public final void b(@NonNull View view, @NonNull v vVar, @NonNull c5 c5Var, @NonNull c5 c5Var2, float f3, float f4, float f5, float f7, @NonNull RectF rectF) {
        float fO = o(vVar, c5Var, f3, f5);
        float fO2 = o(vVar, c5Var2, f4, f7);
        Rect rect = this.zn;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f2978gv;
        rectF2.set(rect);
        RectF rectF3 = this.f2980v;
        j(view, rectF3);
        rectF3.offset(fO, fO2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    @Nullable
    public final ViewGroup ct(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public abstract v dm(Context context, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    public final void en(View view, View view2, boolean z, boolean z5, @NonNull v vVar, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof e2.gv) && (view instanceof ImageView)) {
            e2.gv gvVar = (e2.gv) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z5) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, t1.v.n3, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, t1.v.n3, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new n3(view2));
            vVar.y.v("iconFade").y(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new zn(gvVar, drawable));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f7(@NonNull View view, View view2, boolean z, boolean z5, @NonNull v vVar, float f3, float f4, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animatorY;
        if (view2 instanceof e2.gv) {
            e2.gv gvVar = (e2.gv) view2;
            float fVl = vl(view, view2, vVar.n3);
            float fHw = hw(view, view2, vVar.n3);
            ((FloatingActionButton) view).c5(this.zn);
            float fWidth = this.zn.width() / 2.0f;
            c5 c5VarV = vVar.y.v("expansion");
            if (z) {
                if (!z5) {
                    gvVar.setRevealInfo(new gv.v(fVl, fHw, fWidth));
                }
                if (z5) {
                    fWidth = gvVar.getRevealInfo().zn;
                }
                animatorY = e2.y.y(gvVar, fVl, fHw, q2.y.n3(fVl, fHw, 0.0f, 0.0f, f3, f4));
                animatorY.addListener(new gv(gvVar));
                u(view2, c5VarV.zn(), (int) fVl, (int) fHw, fWidth, list);
            } else {
                float f5 = gvVar.getRevealInfo().zn;
                Animator animatorY2 = e2.y.y(gvVar, fVl, fHw, fWidth);
                int i = (int) fVl;
                int i5 = (int) fHw;
                u(view2, c5VarV.zn(), i, i5, f5, list);
                jz(view2, c5VarV.zn(), c5VarV.gv(), vVar.y.a(), i, i5, fWidth, list);
                animatorY = animatorY2;
            }
            c5VarV.y(animatorY);
            list.add(animatorY);
            list2.add(e2.y.n3(gvVar));
        }
    }

    public void fb(@NonNull CoordinatorLayout.a aVar) {
        if (aVar.s == 0) {
            aVar.s = 80;
        }
    }

    public final float hw(@NonNull View view, @NonNull View view2, @NonNull i9 i9Var) {
        RectF rectF = this.f2978gv;
        RectF rectF2 = this.f2980v;
        k5(view, rectF);
        j(view2, rectF2);
        rectF2.offset(0.0f, -qn(view, view2, i9Var));
        return rectF.centerY() - rectF2.top;
    }

    public final void j(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f2976a);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final float j5(@NonNull View view, @NonNull View view2, @NonNull i9 i9Var) {
        float fCenterX;
        float fCenterX2;
        float f3;
        RectF rectF = this.f2978gv;
        RectF rectF2 = this.f2980v;
        k5(view, rectF);
        j(view2, rectF2);
        int i = i9Var.y & 7;
        if (i == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i != 5) {
                f3 = 0.0f;
                return f3 + i9Var.n3;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f3 = fCenterX - fCenterX2;
        return f3 + i9Var.n3;
    }

    public final void jz(View view, long j, long j4, long j7, int i, int i5, float f3, @NonNull List<Animator> list) {
        long j8 = j + j4;
        if (j8 < j7) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i5, f3, f3);
            animatorCreateCircularReveal.setStartDelay(j8);
            animatorCreateCircularReveal.setDuration(j7 - j8);
            list.add(animatorCreateCircularReveal);
        }
    }

    @TargetApi(21)
    public final void k(View view, @NonNull View view2, boolean z, boolean z5, @NonNull v vVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fN = ut.n(view2) - ut.n(view);
        if (z) {
            if (!z5) {
                view2.setTranslationZ(-fN);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fN);
        }
        vVar.y.v("elevation").y(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    public final void k5(@NonNull View view, @NonNull RectF rectF) {
        j(view, rectF);
        rectF.offset(this.f2977fb, this.f2979s);
    }

    public final float o(@NonNull v vVar, @NonNull c5 c5Var, float f3, float f4) {
        long jZn = c5Var.zn();
        long jGv = c5Var.gv();
        c5 c5VarV = vVar.y.v("expansion");
        return t1.y.y(f3, f4, c5Var.v().getInterpolation((((c5VarV.zn() + c5VarV.gv()) + 17) - jZn) / jGv));
    }

    public final void oz(View view, View view2, boolean z, boolean z5, @NonNull v vVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupX;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof e2.gv) && e2.zn.y == 0) || (viewGroupX = x(view2)) == null) {
                return;
            }
            if (z) {
                if (!z5) {
                    t1.gv.y.set(viewGroupX, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupX, t1.gv.y, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupX, t1.gv.y, 0.0f);
            }
            vVar.y.v("contentFade").y(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    public final void q9(@NonNull View view, @NonNull View view2, boolean z, @NonNull v vVar, @NonNull List<Animator> list) {
        float fJ5 = j5(view, view2, vVar.n3);
        float fQn = qn(view, view2, vVar.n3);
        Pair<c5, c5> pairYt = yt(fJ5, fQn, z, vVar);
        c5 c5Var = (c5) pairYt.first;
        c5 c5Var2 = (c5) pairYt.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            fJ5 = this.f2977fb;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fJ5);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            fQn = this.f2979s;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fQn);
        c5Var.y(objectAnimatorOfFloat);
        c5Var2.y(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final float qn(@NonNull View view, @NonNull View view2, @NonNull i9 i9Var) {
        float fCenterY;
        float fCenterY2;
        float f3;
        RectF rectF = this.f2978gv;
        RectF rectF2 = this.f2980v;
        k5(view, rectF);
        j(view2, rectF2);
        int i = i9Var.y & 112;
        if (i == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i != 80) {
                f3 = 0.0f;
                return f3 + i9Var.zn;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f3 = fCenterY - fCenterY2;
        return f3 + i9Var.zn;
    }

    public final void u(View view, long j, int i, int i5, float f3, @NonNull List<Animator> list) {
        if (j > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i5, f3, f3);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j);
            list.add(animatorCreateCircularReveal);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ut(@NonNull View view, View view2, boolean z, boolean z5, @NonNull v vVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof e2.gv) {
            e2.gv gvVar = (e2.gv) view2;
            int iXg = xg(view);
            int i = 16777215 & iXg;
            if (z) {
                if (!z5) {
                    gvVar.setCircularRevealScrimColor(iXg);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(gvVar, gv.C0081gv.y, i);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(gvVar, gv.C0081gv.y, iXg);
            }
            objectAnimatorOfInt.setEvaluator(t1.zn.n3());
            vVar.y.v("color").y(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    public final float vl(@NonNull View view, @NonNull View view2, @NonNull i9 i9Var) {
        RectF rectF = this.f2978gv;
        RectF rectF2 = this.f2980v;
        k5(view, rectF);
        j(view2, rectF2);
        rectF2.offset(-j5(view, view2, i9Var), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    @Nullable
    public final ViewGroup x(@NonNull View view) {
        View viewFindViewById = view.findViewById(R$id.fh);
        return viewFindViewById != null ? ct(viewFindViewById) : ((view instanceof o3.n3) || (view instanceof o3.y)) ? ct(((ViewGroup) view).getChildAt(0)) : ct(view);
    }

    public final int xg(@NonNull View view) {
        ColorStateList colorStateListR = ut.r(view);
        if (colorStateListR != null) {
            return colorStateListR.getColorForState(view.getDrawableState(), colorStateListR.getDefaultColor());
        }
        return 0;
    }

    public final void y5(@NonNull View view, @NonNull View view2, boolean z, boolean z5, @NonNull v vVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fJ5 = j5(view, view2, vVar.n3);
        float fQn = qn(view, view2, vVar.n3);
        Pair<c5, c5> pairYt = yt(fJ5, fQn, z, vVar);
        c5 c5Var = (c5) pairYt.first;
        c5 c5Var2 = (c5) pairYt.second;
        if (z) {
            if (!z5) {
                view2.setTranslationX(-fJ5);
                view2.setTranslationY(-fQn);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            b(view2, vVar, c5Var, c5Var2, -fJ5, -fQn, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fJ5);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fQn);
        }
        c5Var.y(objectAnimatorOfFloat);
        c5Var2.y(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @NonNull
    public final Pair<c5, c5> yt(float f3, float f4, boolean z, @NonNull v vVar) {
        c5 c5VarV;
        c5 c5VarV2;
        if (f3 == 0.0f || f4 == 0.0f) {
            c5VarV = vVar.y.v("translationXLinear");
            c5VarV2 = vVar.y.v("translationYLinear");
        } else if ((!z || f4 >= 0.0f) && (z || f4 <= 0.0f)) {
            c5VarV = vVar.y.v("translationXCurveDownwards");
            c5VarV2 = vVar.y.v("translationYCurveDownwards");
        } else {
            c5VarV = vVar.y.v("translationXCurveUpwards");
            c5VarV2 = vVar.y.v("translationYCurveUpwards");
        }
        return new Pair<>(c5VarV, c5VarV2);
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zn = new Rect();
        this.f2978gv = new RectF();
        this.f2980v = new RectF();
        this.f2976a = new int[2];
    }
}
