package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.y;
import java.util.List;
import o.ud;
import qn.d;
import qn.m;
import qn.rs;
import qn.ut;
import w.eb;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2783a;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f2785co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Rect f2786f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public View f2787fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @NonNull
    public final z2.n3 f2788gv;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public Behavior f2790mt;
    public final Context n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<co<B>> f2791p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2793t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f2794tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2795v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f2796wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f2797xc;

    @NonNull
    public final ViewGroup y;

    @NonNull
    public final i4 zn;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final boolean f2782x4 = false;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final int[] f2780i4 = {R$attr.rz};
    public static final String f3 = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public static final Handler f2781r = new Handler(Looper.getMainLooper(), new i9());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2792s = false;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2784c5 = new f();

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final Runnable f2789i9 = new t();

    @NonNull
    public y.n3 z = new xc();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public final z f2798f = new z(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f2798f.n3(coordinatorLayout, view, motionEvent);
            return super.f(coordinatorLayout, view, motionEvent);
        }

        public final void hw(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f2798f.zn(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean ta(View view) {
            return this.f2798f.y(view);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f2788gv.y(70, 180);
        }
    }

    public class c5 implements ValueAnimator.AnimatorUpdateListener {
        public int y = 0;

        public c5() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f2782x4) {
                ut.xg(BaseTransientBottomBar.this.zn, iIntValue - this.y);
            } else {
                BaseTransientBottomBar.this.zn.setTranslationY(iIntValue);
            }
            this.y = iIntValue;
        }
    }

    public static abstract class co<B> {
        public void n3(B b4) {
        }

        public void y(B b4, int i) {
        }
    }

    public class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (BaseTransientBottomBar.this.f2792s) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.w = baseTransientBottomBar.r();
                BaseTransientBottomBar.this.k();
            }
        }
    }

    public class fb implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int n3;
        public int y;

        public fb(int i) {
            this.n3 = i;
            this.y = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f2782x4) {
                ut.xg(BaseTransientBottomBar.this.zn, iIntValue - this.y);
            } else {
                BaseTransientBottomBar.this.zn.setTranslationY(iIntValue);
            }
            this.y = iIntValue;
        }
    }

    public class gv implements ValueAnimator.AnimatorUpdateListener {
        public gv() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.zn.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class i4 extends FrameLayout {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final View.OnTouchListener f2799p = new y();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f2800f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f2801fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final float f2802s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ColorStateList f2803t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public r f2804v;
        public PorterDuff.Mode w;
        public x4 y;

        public static class y implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public i4(@NonNull Context context, AttributeSet attributeSet) {
            super(e3.y.zn(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.hu);
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f2332di)) {
                ut.pz(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f2332di, 0));
            }
            this.f2801fb = typedArrayObtainStyledAttributes.getInt(R$styleable.f2342ft, 0);
            this.f2802s = typedArrayObtainStyledAttributes.getFloat(R$styleable.f2466zo, 1.0f);
            setBackgroundTintList(t2.zn.y(context2, typedArrayObtainStyledAttributes, R$styleable.f2388mn));
            setBackgroundTintMode(o2.t.v(typedArrayObtainStyledAttributes.getInt(R$styleable.f2379kx, -1), PorterDuff.Mode.SRC_IN));
            this.f2800f = typedArrayObtainStyledAttributes.getFloat(R$styleable.l9, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f2799p);
            setFocusable(true);
            if (getBackground() == null) {
                ut.u0(this, y());
            }
        }

        public float getActionTextColorAlpha() {
            return this.f2800f;
        }

        public int getAnimationMode() {
            return this.f2801fb;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f2802s;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            r rVar = this.f2804v;
            if (rVar != null) {
                rVar.onViewAttachedToWindow(this);
            }
            ut.yg(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            r rVar = this.f2804v;
            if (rVar != null) {
                rVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i5, int i8, int i10) {
            super.onLayout(z, i, i5, i8, i10);
            x4 x4Var = this.y;
            if (x4Var != null) {
                x4Var.y(this, i, i5, i8, i10);
            }
        }

        public void setAnimationMode(int i) {
            this.f2801fb = i;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f2803t != null) {
                drawable = a8.y.mt(drawable.mutate());
                a8.y.xc(drawable, this.f2803t);
                a8.y.w(drawable, this.w);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f2803t = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMt = a8.y.mt(getBackground().mutate());
                a8.y.xc(drawableMt, colorStateList);
                a8.y.w(drawableMt, this.w);
                if (drawableMt != getBackground()) {
                    super.setBackgroundDrawable(drawableMt);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.w = mode;
            if (getBackground() != null) {
                Drawable drawableMt = a8.y.mt(getBackground().mutate());
                a8.y.w(drawableMt, mode);
                if (drawableMt != getBackground()) {
                    super.setBackgroundDrawable(drawableMt);
                }
            }
        }

        public void setOnAttachStateChangeListener(r rVar) {
            this.f2804v = rVar;
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f2799p);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(x4 x4Var) {
            this.y = x4Var;
        }

        @NonNull
        public final Drawable y() {
            float dimension = getResources().getDimension(R$dimen.jz);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(g2.y.c5(this, R$attr.f2181wz, R$attr.f2166f, getBackgroundOverlayColorAlpha()));
            if (this.f2803t == null) {
                return a8.y.mt(gradientDrawable);
            }
            Drawable drawableMt = a8.y.mt(gradientDrawable);
            a8.y.xc(drawableMt, this.f2803t);
            return drawableMt;
        }
    }

    public static class i9 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).qn();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).ej(message.arg1);
            return true;
        }
    }

    public class mt implements SwipeDismissBehavior.zn {
        public mt() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.zn
        public void n3(int i) {
            if (i == 0) {
                com.google.android.material.snackbar.y.zn().f(BaseTransientBottomBar.this.z);
            } else if (i == 1 || i == 2) {
                com.google.android.material.snackbar.y.zn().i9(BaseTransientBottomBar.this.z);
            }
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.zn
        public void y(@NonNull View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.i4(0);
        }
    }

    public class n3 extends AnimatorListenerAdapter {
        public n3() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.b();
        }
    }

    public class p implements x4 {
        public p() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.x4
        public void y(View view, int i, int i5, int i8, int i10) {
            BaseTransientBottomBar.this.zn.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.o();
        }
    }

    public interface r {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    public class s extends AnimatorListenerAdapter {
        public final /* synthetic */ int y;

        public s(int i) {
            this.y = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.x(this.y);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f2788gv.n3(0, 180);
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iFh;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.zn == null || baseTransientBottomBar.n3 == null || (iFh = (BaseTransientBottomBar.this.fh() - BaseTransientBottomBar.this.d()) + ((int) BaseTransientBottomBar.this.zn.getTranslationY())) >= BaseTransientBottomBar.this.f2797xc) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.zn.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f3, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f2797xc - iFh;
            BaseTransientBottomBar.this.zn.requestLayout();
        }
    }

    public class tl implements d {
        public tl() {
        }

        @NonNull
        public rs y(View view, @NonNull rs rsVar) {
            BaseTransientBottomBar.this.f2793t = rsVar.i9();
            BaseTransientBottomBar.this.f2794tl = rsVar.f();
            BaseTransientBottomBar.this.f2796wz = rsVar.t();
            BaseTransientBottomBar.this.k();
            return rsVar;
        }
    }

    public class v implements ValueAnimator.AnimatorUpdateListener {
        public v() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.zn.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.zn.setScaleY(fFloatValue);
        }
    }

    public class w implements r {

        public class y implements Runnable {
            public y() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.x(3);
            }
        }

        public w() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.zn.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.f2797xc = eb.y(m.y(rootWindowInsets));
            BaseTransientBottomBar.this.k();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.ud()) {
                BaseTransientBottomBar.f2781r.post(new y());
            }
        }
    }

    public class wz extends qn.y {
        public wz() {
        }

        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            udVar.y(1048576);
            udVar.kp(true);
        }

        public boolean i9(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.i9(view, i, bundle);
            }
            BaseTransientBottomBar.this.x4();
            return true;
        }
    }

    public interface x4 {
        void y(View view, int i, int i5, int i8, int i10);
    }

    public class xc implements y.n3 {
        public xc() {
        }

        @Override // com.google.android.material.snackbar.y.n3
        public void show() {
            Handler handler = BaseTransientBottomBar.f2781r;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.y.n3
        public void y(int i) {
            Handler handler = BaseTransientBottomBar.f2781r;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i4 i4Var = BaseTransientBottomBar.this.zn;
            if (i4Var == null) {
                return;
            }
            if (i4Var.getParent() != null) {
                BaseTransientBottomBar.this.zn.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.zn.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.j();
            } else {
                BaseTransientBottomBar.this.ut();
            }
        }
    }

    public static class z {
        public y.n3 y;

        public z(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.b(0.1f);
            swipeDismissBehavior.a8(0.6f);
            swipeDismissBehavior.k5(0);
        }

        public void n3(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.fh(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.y.zn().i9(this.y);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.y.zn().f(this.y);
            }
        }

        public boolean y(View view) {
            return view instanceof i4;
        }

        public void zn(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.y = baseTransientBottomBar.z;
        }
    }

    public class zn extends AnimatorListenerAdapter {
        public final /* synthetic */ int y;

        public zn(int i) {
            this.y = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.x(this.y);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull z2.n3 n3Var) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (n3Var == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.y = viewGroup;
        this.f2788gv = n3Var;
        this.n3 = context;
        o2.f.y(context);
        i4 i4Var = (i4) LayoutInflater.from(context).inflate(rz(), viewGroup, false);
        this.zn = i4Var;
        if (view instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout) view).zn(i4Var.getActionTextColorAlpha());
        }
        i4Var.addView(view);
        ViewGroup.LayoutParams layoutParams = i4Var.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f2786f = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        ut.g(i4Var, 1);
        ut.o0(i4Var, 1);
        ut.pq(i4Var, true);
        ut.ad(i4Var, new tl());
        ut.g3(i4Var, new wz());
        this.f2785co = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final boolean a8() {
        CoordinatorLayout.a layoutParams = this.zn.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.a) && (layoutParams.a() instanceof SwipeDismissBehavior);
    }

    public void b() {
        com.google.android.material.snackbar.y.zn().c5(this.z);
        List<co<B>> list = this.f2791p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2791p.get(size).n3(this);
            }
        }
    }

    @NonNull
    public SwipeDismissBehavior<? extends View> c() {
        return new Behavior();
    }

    public void co() {
        this.zn.post(new y());
    }

    public final int d() {
        int[] iArr = new int[2];
        this.zn.getLocationOnScreen(iArr);
        return iArr[1] + this.zn.getHeight();
    }

    public final ValueAnimator d0(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(t1.y.f8180gv);
        valueAnimatorOfFloat.addUpdateListener(new v());
        return valueAnimatorOfFloat;
    }

    public final void ej(int i) {
        if (vl() && this.zn.getVisibility() == 0) {
            z(i);
        } else {
            x(i);
        }
    }

    public final ValueAnimator f3(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(t1.y.y);
        valueAnimatorOfFloat.addUpdateListener(new gv());
        return valueAnimatorOfFloat;
    }

    public final int fh() {
        WindowManager windowManager = (WindowManager) this.n3.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final boolean hw() {
        return this.f2797xc > 0 && !this.f2783a && a8();
    }

    public void i4(int i) {
        com.google.android.material.snackbar.y.zn().n3(this.z, i);
    }

    public final void j() {
        ValueAnimator valueAnimatorF3 = f3(0.0f, 1.0f);
        ValueAnimator valueAnimatorD0 = d0(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorF3, valueAnimatorD0);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new n3());
        animatorSet.start();
    }

    public void j5() {
        com.google.android.material.snackbar.y.zn().tl(n(), this.z);
    }

    public final void k() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.zn.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f2786f) == null) {
            Log.w(f3, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f2787fb != null ? this.w : this.f2793t);
        marginLayoutParams.leftMargin = rect.left + this.f2794tl;
        marginLayoutParams.rightMargin = rect.right + this.f2796wz;
        this.zn.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !hw()) {
            return;
        }
        this.zn.removeCallbacks(this.f2789i9);
        this.zn.post(this.f2789i9);
    }

    @NonNull
    public B k5(int i) {
        this.f2795v = i;
        return this;
    }

    public final int mg() {
        int height = this.zn.getHeight();
        ViewGroup.LayoutParams layoutParams = this.zn.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public int n() {
        return this.f2795v;
    }

    public final void o() {
        if (vl()) {
            co();
            return;
        }
        if (this.zn.getParent() != null) {
            this.zn.setVisibility(0);
        }
        b();
    }

    public final void oz(int i) {
        ValueAnimator valueAnimatorF3 = f3(1.0f, 0.0f);
        valueAnimatorF3.setDuration(75L);
        valueAnimatorF3.addListener(new zn(i));
        valueAnimatorF3.start();
    }

    public final void q9(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, mg());
        valueAnimator.setInterpolator(t1.y.n3);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new s(i));
        valueAnimator.addUpdateListener(new c5());
        valueAnimator.start();
    }

    public final void qn() {
        this.zn.setOnAttachStateChangeListener(new w());
        if (this.zn.getParent() == null) {
            CoordinatorLayout.a layoutParams = this.zn.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.a) {
                yt(layoutParams);
            }
            this.w = r();
            k();
            this.zn.setVisibility(4);
            this.y.addView(this.zn);
        }
        if (ut.q9(this.zn)) {
            o();
        } else {
            this.zn.setOnLayoutChangeListener(new p());
        }
    }

    public final int r() {
        View view = this.f2787fb;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.y.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.y.getHeight()) - i;
    }

    public int rz() {
        return z6() ? R$layout.f2269r : R$layout.n3;
    }

    @NonNull
    public View ta() {
        return this.zn;
    }

    public boolean ud() {
        return com.google.android.material.snackbar.y.zn().v(this.z);
    }

    public final void ut() {
        int iMg = mg();
        if (f2782x4) {
            ut.xg(this.zn, iMg);
        } else {
            this.zn.setTranslationY(iMg);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iMg, 0);
        valueAnimator.setInterpolator(t1.y.n3);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new a());
        valueAnimator.addUpdateListener(new fb(iMg));
        valueAnimator.start();
    }

    public boolean vl() {
        AccessibilityManager accessibilityManager = this.f2785co;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void x(int i) {
        com.google.android.material.snackbar.y.zn().s(this.z);
        List<co<B>> list = this.f2791p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2791p.get(size).y(this, i);
            }
        }
        ViewParent parent = this.zn.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zn);
        }
    }

    public void x4() {
        i4(3);
    }

    public final void yt(CoordinatorLayout.a aVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorC = this.f2790mt;
        if (swipeDismissBehaviorC == null) {
            swipeDismissBehaviorC = c();
        }
        if (swipeDismissBehaviorC instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorC).hw(this);
        }
        swipeDismissBehaviorC.x(new mt());
        aVar.xc(swipeDismissBehaviorC);
        if (this.f2787fb == null) {
            aVar.fb = 80;
        }
    }

    public final void z(int i) {
        if (this.zn.getAnimationMode() == 1) {
            oz(i);
        } else {
            q9(i);
        }
    }

    public boolean z6() {
        TypedArray typedArrayObtainStyledAttributes = this.n3.obtainStyledAttributes(f2780i4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }
}
