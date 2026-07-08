package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$animator;
import java.util.ArrayList;
import java.util.Iterator;
import qn.ut;
import y2.wz;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2736a;
    public final v2.n3 c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public float f2737c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2739f;
    public ArrayList<c5> f3;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public n2.y f2741gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f2742i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public float f2743i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public float f2744mt;
    public final FloatingActionButton n;

    @Nullable
    public y2.fb n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public t1.s f2745p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final o2.a f2748t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    @Nullable
    public ViewTreeObserver.OnPreDrawListener f2749ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public t1.s f2750tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Drawable f2751v;

    @Nullable
    public t1.s w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public t1.s f2752wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f2753x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public Animator f2754xc;

    @Nullable
    public y2.f y;
    public int z;

    @Nullable
    public Drawable zn;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f2731d = t1.y.zn;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final int[] f2735z6 = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final int[] f2732ej = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final int[] f2733ud = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public static final int[] f2729a8 = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f2734x = {R.attr.state_enabled};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f2730b = new int[0];

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f2740fb = true;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public float f2738co = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2746r = 0;
    public final Rect d0 = new Rect();
    public final RectF fh = new RectF();
    public final RectF rz = new RectF();
    public final Matrix mg = new Matrix();

    public class a extends t {
        public a() {
            super(y.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.y.t
        public float y() {
            return 0.0f;
        }
    }

    public interface c5 {
        void n3();

        void y();
    }

    public class f extends t {
        public f() {
            super(y.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.y.t
        public float y() {
            return y.this.f2747s;
        }
    }

    public class fb extends t {
        public fb() {
            super(y.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.y.t
        public float y() {
            y yVar = y.this;
            return yVar.f2747s + yVar.f2737c5;
        }
    }

    public class gv implements TypeEvaluator<Float> {
        public FloatEvaluator y = new FloatEvaluator();

        public gv() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f3, Float f4, Float f5) {
            float fFloatValue = this.y.evaluate(f3, (Number) f4, (Number) f5).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public interface i9 {
        void n3();

        void y();
    }

    public class n3 extends AnimatorListenerAdapter {
        public final /* synthetic */ i9 n3;
        public final /* synthetic */ boolean y;

        public n3(boolean z, i9 i9Var) {
            this.y = z;
            this.n3 = i9Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y.this.f2746r = 0;
            y.this.f2754xc = null;
            i9 i9Var = this.n3;
            if (i9Var != null) {
                i9Var.y();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            y.this.n.n3(0, this.y);
            y.this.f2746r = 2;
            y.this.f2754xc = animator;
        }
    }

    public class s extends t {
        public s() {
            super(y.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.y.t
        public float y() {
            y yVar = y.this;
            return yVar.f2747s + yVar.f2743i9;
        }
    }

    public abstract class t extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public float n3;
        public boolean y;
        public float zn;

        public t() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y.this.ct((int) this.zn);
            this.y = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.y) {
                y2.fb fbVar = y.this.n3;
                this.n3 = fbVar == null ? 0.0f : fbVar.i4();
                this.zn = y();
                this.y = true;
            }
            y yVar = y.this;
            float f3 = this.n3;
            yVar.ct((int) (f3 + ((this.zn - f3) * valueAnimator.getAnimatedFraction())));
        }

        public abstract float y();

        public /* synthetic */ t(y yVar, C0067y c0067y) {
            this();
        }
    }

    public class v implements ViewTreeObserver.OnPreDrawListener {
        public v() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            y.this.z6();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.y$y, reason: collision with other inner class name */
    public class C0067y extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean n3;
        public boolean y;
        public final /* synthetic */ i9 zn;

        public C0067y(boolean z, i9 i9Var) {
            this.n3 = z;
            this.zn = i9Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.y = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y.this.f2746r = 0;
            y.this.f2754xc = null;
            if (this.y) {
                return;
            }
            FloatingActionButton floatingActionButton = y.this.n;
            boolean z = this.n3;
            floatingActionButton.n3(z ? 8 : 4, z);
            i9 i9Var = this.zn;
            if (i9Var != null) {
                i9Var.n3();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            y.this.n.n3(0, this.n3);
            y.this.f2746r = 1;
            y.this.f2754xc = animator;
            this.y = false;
        }
    }

    public class zn extends t1.fb {
        public zn() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f3, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            y.this.f2738co = f3;
            return super.evaluate(f3, matrix, matrix2);
        }
    }

    public y(FloatingActionButton floatingActionButton, v2.n3 n3Var) {
        this.n = floatingActionButton;
        this.c = n3Var;
        o2.a aVar = new o2.a();
        this.f2748t = aVar;
        aVar.y(f2735z6, c5(new s()));
        aVar.y(f2732ej, c5(new fb()));
        aVar.y(f2733ud, c5(new fb()));
        aVar.y(f2729a8, c5(new fb()));
        aVar.y(f2734x, c5(new f()));
        aVar.y(f2730b, c5(new a()));
        this.f2744mt = floatingActionButton.getRotation();
    }

    public void a(@NonNull c5 c5Var) {
        if (this.f3 == null) {
            this.f3 = new ArrayList<>();
        }
        this.f3.add(c5Var);
    }

    public boolean a8() {
        throw null;
    }

    public void b(@Nullable PorterDuff.Mode mode) {
        y2.fb fbVar = this.n3;
        if (fbVar != null) {
            fbVar.setTintMode(mode);
        }
    }

    public void c() {
        throw null;
    }

    @NonNull
    public final ValueAnimator c5(@NonNull t tVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f2731d);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(tVar);
        valueAnimator.addUpdateListener(tVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float co() {
        return this.f2743i9;
    }

    public void ct(float f3) {
        y2.fb fbVar = this.n3;
        if (fbVar != null) {
            fbVar.q9(f3);
        }
    }

    public void d(@NonNull Rect rect) {
        j5.s.s(this.f2751v, "Didn't initialize content background");
        if (!f7()) {
            this.c.n3(this.f2751v);
        } else {
            this.c.n3(new InsetDrawable(this.f2751v, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void d0() {
        y2.fb fbVar = this.n3;
        if (fbVar != null) {
            y2.s.a(this.n, fbVar);
        }
        if (a8()) {
            this.n.getViewTreeObserver().addOnPreDrawListener(p());
        }
    }

    public final void dm() {
        Rect rect = this.d0;
        mt(rect);
        d(rect);
        this.c.y(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void ej() {
        ArrayList<c5> arrayList = this.f3;
        if (arrayList != null) {
            Iterator<c5> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().n3();
            }
        }
    }

    public final boolean en() {
        return ut.q9(this.n) && !this.n.isInEditMode();
    }

    public final t1.s f() {
        if (this.f2752wz == null) {
            this.f2752wz = t1.s.zn(this.n.getContext(), R$animator.y);
        }
        return (t1.s) j5.s.fb(this.f2752wz);
    }

    public boolean f3() {
        return this.n.getVisibility() == 0 ? this.f2746r == 1 : this.f2746r != 2;
    }

    public boolean f7() {
        throw null;
    }

    public final void fb(float f3, @NonNull Matrix matrix) {
        matrix.reset();
        if (this.n.getDrawable() == null || this.z == 0) {
            return;
        }
        RectF rectF = this.fh;
        RectF rectF2 = this.rz;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i = this.z;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i5 = this.z;
        matrix.postScale(f3, f3, i5 / 2.0f, i5 / 2.0f);
    }

    public void fh() {
        throw null;
    }

    public void gv(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f2742i4 == null) {
            this.f2742i4 = new ArrayList<>();
        }
        this.f2742i4.add(animatorListener);
    }

    public final void hw(float f3) {
        if (this.f2737c5 != f3) {
            this.f2737c5 = f3;
            ta(this.f2747s, f3, this.f2743i9);
        }
    }

    public void i4(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    @Nullable
    public final Drawable i9() {
        return this.f2751v;
    }

    public final void j(float f3) {
        if (this.f2743i9 != f3) {
            this.f2743i9 = f3;
            ta(this.f2747s, this.f2737c5, f3);
        }
    }

    public final void j5(float f3) {
        this.f2738co = f3;
        Matrix matrix = this.mg;
        fb(f3, matrix);
        this.n.setImageMatrix(matrix);
    }

    public final boolean jz() {
        return !this.f2736a || this.n.getSizeDimension() >= this.f2739f;
    }

    public final void k(@Nullable t1.s sVar) {
        this.w = sVar;
    }

    public final void k5(float f3) {
        if (this.f2747s != f3) {
            this.f2747s = f3;
            ta(f3, this.f2737c5, this.f2743i9);
        }
    }

    public void mg(int[] iArr) {
        throw null;
    }

    public void mt(@NonNull Rect rect) {
        int sizeDimension = this.f2736a ? (this.f2739f - this.n.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.f2740fb ? tl() + this.f2743i9 : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public boolean n() {
        return this.n.getVisibility() != 0 ? this.f2746r == 2 : this.f2746r != 1;
    }

    public void o(int i) {
        this.f2739f = i;
    }

    public final void o4(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new gv());
    }

    public void oz(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.zn;
        if (drawable != null) {
            a8.y.xc(drawable, u2.n3.gv(colorStateList));
        }
    }

    @NonNull
    public final ViewTreeObserver.OnPreDrawListener p() {
        if (this.f2749ta == null) {
            this.f2749ta = new v();
        }
        return this.f2749ta;
    }

    public final void q9(@NonNull y2.f fVar) {
        this.y = fVar;
        y2.fb fbVar = this.n3;
        if (fbVar != null) {
            fbVar.setShapeAppearanceModel(fVar);
        }
        Object obj = this.zn;
        if (obj instanceof wz) {
            ((wz) obj).setShapeAppearanceModel(fVar);
        }
        n2.y yVar = this.f2741gv;
        if (yVar != null) {
            yVar.a(fVar);
        }
    }

    public final void qn(int i) {
        if (this.z != i) {
            this.z = i;
            xg();
        }
    }

    @Nullable
    public final t1.s r() {
        return this.w;
    }

    public void rz() {
        ViewTreeObserver viewTreeObserver = this.n.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f2749ta;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f2749ta = null;
        }
    }

    @NonNull
    public final AnimatorSet s(@NonNull t1.s sVar, float f3, float f4, float f5) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.n, (Property<FloatingActionButton, Float>) View.ALPHA, f3);
        sVar.v("opacity").y(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.n, (Property<FloatingActionButton, Float>) View.SCALE_X, f4);
        sVar.v("scale").y(objectAnimatorOfFloat2);
        o4(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.n, (Property<FloatingActionButton, Float>) View.SCALE_Y, f4);
        sVar.v("scale").y(objectAnimatorOfFloat3);
        o4(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        fb(f5, this.mg);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.n, new t1.a(), new zn(), new Matrix(this.mg));
        sVar.v("iconScale").y(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        t1.n3.y(animatorSet, arrayList);
        return animatorSet;
    }

    public final t1.s t() {
        if (this.f2750tl == null) {
            this.f2750tl = t1.s.zn(this.n.getContext(), R$animator.n3);
        }
        return (t1.s) j5.s.fb(this.f2750tl);
    }

    public void ta(float f3, float f4, float f5) {
        throw null;
    }

    public float tl() {
        throw null;
    }

    public void u(@Nullable i9 i9Var, boolean z) {
        if (n()) {
            return;
        }
        Animator animator = this.f2754xc;
        if (animator != null) {
            animator.cancel();
        }
        if (!en()) {
            this.n.n3(0, z);
            this.n.setAlpha(1.0f);
            this.n.setScaleY(1.0f);
            this.n.setScaleX(1.0f);
            j5(1.0f);
            if (i9Var != null) {
                i9Var.y();
                return;
            }
            return;
        }
        if (this.n.getVisibility() != 0) {
            this.n.setAlpha(0.0f);
            this.n.setScaleY(0.0f);
            this.n.setScaleX(0.0f);
            j5(0.0f);
        }
        t1.s sVarT = this.w;
        if (sVarT == null) {
            sVarT = t();
        }
        AnimatorSet animatorSetS = s(sVarT, 1.0f, 1.0f, 1.0f);
        animatorSetS.addListener(new n3(z, i9Var));
        ArrayList<Animator.AnimatorListener> arrayList = this.f2753x4;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetS.addListener(it.next());
            }
        }
        animatorSetS.start();
    }

    public void ud() {
        ArrayList<c5> arrayList = this.f3;
        if (arrayList != null) {
            Iterator<c5> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().y();
            }
        }
    }

    public void ut(boolean z) {
        this.f2740fb = z;
        dm();
    }

    public void v(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f2753x4 == null) {
            this.f2753x4 = new ArrayList<>();
        }
        this.f2753x4.add(animatorListener);
    }

    public final void vl(@Nullable t1.s sVar) {
        this.f2745p = sVar;
    }

    public float w() {
        return this.f2737c5;
    }

    public boolean wz() {
        return this.f2736a;
    }

    public void x(@Nullable ColorStateList colorStateList) {
        y2.fb fbVar = this.n3;
        if (fbVar != null) {
            fbVar.setTintList(colorStateList);
        }
        n2.y yVar = this.f2741gv;
        if (yVar != null) {
            yVar.zn(colorStateList);
        }
    }

    public void x4(@Nullable i9 i9Var, boolean z) {
        if (f3()) {
            return;
        }
        Animator animator = this.f2754xc;
        if (animator != null) {
            animator.cancel();
        }
        if (!en()) {
            this.n.n3(z ? 8 : 4, z);
            if (i9Var != null) {
                i9Var.n3();
                return;
            }
            return;
        }
        t1.s sVarF = this.f2745p;
        if (sVarF == null) {
            sVarF = f();
        }
        AnimatorSet animatorSetS = s(sVarF, 0.0f, 0.0f, 0.0f);
        animatorSetS.addListener(new C0067y(z, i9Var));
        ArrayList<Animator.AnimatorListener> arrayList = this.f2742i4;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetS.addListener(it.next());
            }
        }
        animatorSetS.start();
    }

    @Nullable
    public final t1.s xc() {
        return this.f2745p;
    }

    public final void xg() {
        j5(this.f2738co);
    }

    public void y5() {
        throw null;
    }

    public void yt(boolean z) {
        this.f2736a = z;
    }

    @Nullable
    public final y2.f z() {
        return this.y;
    }

    public void z6() {
        float rotation = this.n.getRotation();
        if (this.f2744mt != rotation) {
            this.f2744mt = rotation;
            y5();
        }
    }
}
