package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k.zn;
import o.b;
import o.ud;
import o2.t;
import qn.rs;
import qn.ut;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.zn<V> {
    public static final int f7 = R$style.f2296fb;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2542a;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public int f2543a8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2544b;
    public int c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f2545c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f2546co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2547d;
    public float d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public k.zn f2548ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2549f;
    public int f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f2550fb;
    public int fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public float f2551gv;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f2552hw;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @Nullable
    public ValueAnimator f2553i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public y2.fb f2554i9;
    public int j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @NonNull
    public final ArrayList<fb> f2555j5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zn.AbstractC0112zn f2556k;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public int f2557k5;
    public boolean mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public int f2558mt;
    public int n;
    public boolean n3;
    public int o;
    public boolean oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2559p;
    public int q9;

    @Nullable
    public VelocityTracker qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2560r;
    public float rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2561s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2562t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public boolean f2563ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public boolean f2564tl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public boolean f2565ud;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    @Nullable
    public Map<View, Integer> f2566ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2567v;

    @Nullable
    public WeakReference<V> vl;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f2568wz;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2569x;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public BottomSheetBehavior<V>.s f2570x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public boolean f2571xc;
    public int y;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public int f2572yt;
    public f z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public int f2573z6;
    public boolean zn;

    public class a implements b {
        public final /* synthetic */ int y;

        public a(int i) {
            this.y = i;
        }

        public boolean y(@NonNull View view, @Nullable b.y yVar) {
            BottomSheetBehavior.this.tg(this.y);
            return true;
        }
    }

    public static abstract class fb {
        public abstract void n3(@NonNull View view, int i);

        public abstract void y(@NonNull View view, float f3);
    }

    public class gv implements t.zn {
        public final /* synthetic */ boolean y;

        public gv(boolean z) {
            this.y = z;
        }

        @Override // o2.t.zn
        public rs y(View view, rs rsVar, t.gv gvVar) {
            BottomSheetBehavior.this.f2546co = rsVar.tl();
            boolean zGv = t.gv(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f2568wz) {
                BottomSheetBehavior.this.f2558mt = rsVar.i9();
                paddingBottom = gvVar.f7097gv + BottomSheetBehavior.this.f2558mt;
            }
            if (BottomSheetBehavior.this.f2571xc) {
                paddingLeft = (zGv ? gvVar.zn : gvVar.y) + rsVar.f();
            }
            if (BottomSheetBehavior.this.w) {
                paddingRight = (zGv ? gvVar.y : gvVar.zn) + rsVar.t();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.y) {
                BottomSheetBehavior.this.f2562t = rsVar.fb().f8392gv;
            }
            if (BottomSheetBehavior.this.f2568wz || this.y) {
                BottomSheetBehavior.this.qj(false);
            }
            return rsVar;
        }
    }

    public class n3 implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f2579v;
        public final /* synthetic */ View y;

        public n3(View view, int i) {
            this.y = view;
            this.f2579v = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.cr(this.y, this.f2579v);
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f2580fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f2582v;
        public final View y;

        public s(View view, int i) {
            this.y = view;
            this.f2580fb = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.zn znVar = BottomSheetBehavior.this.f2548ej;
            if (znVar == null || !znVar.tl(true)) {
                BottomSheetBehavior.this.pz(this.f2580fb);
            } else {
                ut.nf(this.y, this);
            }
            this.f2582v = false;
        }
    }

    public class v extends zn.AbstractC0112zn {
        public v() {
        }

        @Override // k.zn.AbstractC0112zn
        public void f(@NonNull View view, int i, int i5, int i8, int i10) {
            BottomSheetBehavior.this.jz(i5);
        }

        @Override // k.zn.AbstractC0112zn
        public void i9(int i) {
            if (i == 1 && BottomSheetBehavior.this.f2547d) {
                BottomSheetBehavior.this.pz(1);
            }
        }

        @Override // k.zn.AbstractC0112zn
        public int n3(@NonNull View view, int i, int i5) {
            int iXg = BottomSheetBehavior.this.xg();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b.y.n3(i, iXg, bottomSheetBehavior.mg ? bottomSheetBehavior.f2572yt : bottomSheetBehavior.fh);
        }

        @Override // k.zn.AbstractC0112zn
        public void t(@NonNull View view, float f3, float f4) {
            int iXg;
            int i = 6;
            if (f4 < 0.0f) {
                if (BottomSheetBehavior.this.n3) {
                    iXg = BottomSheetBehavior.this.n;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i5 = bottomSheetBehavior.c;
                    if (top > i5) {
                        iXg = i5;
                    } else {
                        iXg = bottomSheetBehavior.xg();
                    }
                }
                i = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.mg && bottomSheetBehavior2.xb(view, f4)) {
                    if ((Math.abs(f3) >= Math.abs(f4) || f4 <= 500.0f) && !wz(view)) {
                        if (BottomSheetBehavior.this.n3) {
                            iXg = BottomSheetBehavior.this.n;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.xg()) < Math.abs(view.getTop() - BottomSheetBehavior.this.c)) {
                            iXg = BottomSheetBehavior.this.xg();
                        } else {
                            iXg = BottomSheetBehavior.this.c;
                        }
                        i = 3;
                    } else {
                        iXg = BottomSheetBehavior.this.f2572yt;
                        i = 5;
                    }
                } else if (f4 == 0.0f || Math.abs(f3) > Math.abs(f4)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.n3) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i8 = bottomSheetBehavior3.c;
                        if (top2 < i8) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior3.fh)) {
                                iXg = BottomSheetBehavior.this.xg();
                                i = 3;
                            } else {
                                iXg = BottomSheetBehavior.this.c;
                            }
                        } else if (Math.abs(top2 - i8) < Math.abs(top2 - BottomSheetBehavior.this.fh)) {
                            iXg = BottomSheetBehavior.this.c;
                        } else {
                            iXg = BottomSheetBehavior.this.fh;
                            i = 4;
                        }
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.n) < Math.abs(top2 - BottomSheetBehavior.this.fh)) {
                        iXg = BottomSheetBehavior.this.n;
                        i = 3;
                    } else {
                        iXg = BottomSheetBehavior.this.fh;
                        i = 4;
                    }
                } else {
                    if (BottomSheetBehavior.this.n3) {
                        iXg = BottomSheetBehavior.this.fh;
                    } else {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.c) < Math.abs(top3 - BottomSheetBehavior.this.fh)) {
                            iXg = BottomSheetBehavior.this.c;
                        } else {
                            iXg = BottomSheetBehavior.this.fh;
                        }
                    }
                    i = 4;
                }
            }
            BottomSheetBehavior.this.wf(view, i, iXg, true);
        }

        @Override // k.zn.AbstractC0112zn
        public boolean tl(@NonNull View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i5 = bottomSheetBehavior.f2573z6;
            if (i5 == 1 || bottomSheetBehavior.oz) {
                return false;
            }
            if (i5 == 3 && bottomSheetBehavior.o == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f2552hw;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.vl;
            return weakReference2 != null && weakReference2.get() == view;
        }

        @Override // k.zn.AbstractC0112zn
        public int v(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.mg ? bottomSheetBehavior.f2572yt : bottomSheetBehavior.fh;
        }

        public final boolean wz(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f2572yt + bottomSheetBehavior.xg()) / 2;
        }

        @Override // k.zn.AbstractC0112zn
        public int y(@NonNull View view, int i, int i5) {
            return view.getLeft();
        }
    }

    public class y implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ViewGroup.LayoutParams f2584v;
        public final /* synthetic */ View y;

        public y(View view, ViewGroup.LayoutParams layoutParams) {
            this.y = view;
            this.f2584v = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.y.setLayoutParams(this.f2584v);
        }
    }

    public class zn implements ValueAnimator.AnimatorUpdateListener {
        public zn() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f2554i9 != null) {
                BottomSheetBehavior.this.f2554i9.f7(fFloatValue);
            }
        }
    }

    public BottomSheetBehavior() {
        this.y = 0;
        this.n3 = true;
        this.zn = false;
        this.f2549f = -1;
        this.f2570x4 = null;
        this.d0 = 0.5f;
        this.rz = -1.0f;
        this.f2547d = true;
        this.f2573z6 = 4;
        this.f2555j5 = new ArrayList<>();
        this.q9 = -1;
        this.f2556k = new v();
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> y5(@NonNull V v6) {
        CoordinatorLayout.a layoutParams = v6.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.a)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.zn znVarA = layoutParams.a();
        if (znVarA instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) znVarA;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final void ad() {
        V v6;
        WeakReference<V> weakReference = this.vl;
        if (weakReference == null || (v6 = weakReference.get()) == null) {
            return;
        }
        ut.e(v6, 524288);
        ut.e(v6, 262144);
        ut.e(v6, 1048576);
        int i = this.q9;
        if (i != -1) {
            ut.e(v6, i);
        }
        if (!this.n3 && this.f2573z6 != 6) {
            this.q9 = qn(v6, R$string.y, 6);
        }
        if (this.mg && this.f2573z6 != 5) {
            nf(v6, ud.y.n, 5);
        }
        int i5 = this.f2573z6;
        if (i5 == 3) {
            nf(v6, ud.y.f3, this.n3 ? 4 : 6);
            return;
        }
        if (i5 == 4) {
            nf(v6, ud.y.i4, this.n3 ? 3 : 6);
        } else {
            if (i5 != 6) {
                return;
            }
            nf(v6, ud.y.f3, 4);
            nf(v6, ud.y.i4, 3);
        }
    }

    public void ap(boolean z) {
        this.f2547d = z;
    }

    public void bk(int i) {
        this.y = i;
    }

    public void cr(@NonNull View view, int i) {
        int iXg;
        int i5;
        if (i == 4) {
            iXg = this.fh;
        } else if (i == 6) {
            iXg = this.c;
            if (this.n3 && iXg <= (i5 = this.n)) {
                iXg = i5;
                i = 3;
            }
        } else if (i == 3) {
            iXg = xg();
        } else {
            if (!this.mg || i != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i);
            }
            iXg = this.f2572yt;
        }
        wf(view, i, iXg, false);
    }

    public int ct() {
        return this.f2573z6;
    }

    public final void cy(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f2560r != z) {
            this.f2560r = z;
            if (this.f2554i9 == null || (valueAnimator = this.f2553i4) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f2553i4.reverse();
                return;
            }
            float f3 = z ? 0.0f : 1.0f;
            this.f2553i4.setFloatValues(1.0f - f3, f3);
            this.f2553i4.start();
        }
    }

    public boolean d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull View view, @NonNull View view2, int i, int i5) {
        this.f2543a8 = 0;
        this.f2569x = false;
        return (i & 2) != 0;
    }

    public y2.fb dm() {
        return this.f2554i9;
    }

    public final void e(@NonNull SavedState savedState) {
        int i = this.y;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f2567v = savedState.f2576s;
        }
        if (i == -1 || (i & 2) == 2) {
            this.n3 = savedState.f2574f;
        }
        if (i == -1 || (i & 4) == 4) {
            this.mg = savedState.f2577t;
        }
        if (i == -1 || (i & 8) == 8) {
            this.f2563ta = savedState.w;
        }
    }

    public boolean eb() {
        return this.mg;
    }

    public final void en() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2553i4 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f2553i4.addUpdateListener(new zn());
    }

    public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull MotionEvent motionEvent) {
        k.zn znVar;
        if (!v6.isShown() || !this.f2547d) {
            this.f2565ud = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ra();
        }
        if (this.qn == null) {
            this.qn = VelocityTracker.obtain();
        }
        this.qn.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.j = (int) motionEvent.getY();
            if (this.f2573z6 != 2) {
                WeakReference<View> weakReference = this.f2552hw;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.fh(view, x2, this.j)) {
                    this.o = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.oz = true;
                }
            }
            this.f2565ud = this.o == -1 && !coordinatorLayout.fh(v6, x2, this.j);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.oz = false;
            this.o = -1;
            if (this.f2565ud) {
                this.f2565ud = false;
                return false;
            }
        }
        if (!this.f2565ud && (znVar = this.f2548ej) != null && znVar.hw(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f2552hw;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f2565ud || this.f2573z6 == 1 || coordinatorLayout.fh(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2548ej == null || Math.abs(((float) this.j) - motionEvent.getY()) <= ((float) this.f2548ej.c())) ? false : true;
    }

    public void f3(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.f3(coordinatorLayout, v6, savedState.y());
        e(savedState);
        int i = savedState.f2575fb;
        if (i == 1 || i == 2) {
            this.f2573z6 = 4;
        } else {
            this.f2573z6 = i;
        }
    }

    public final void f7(@NonNull Context context, AttributeSet attributeSet, boolean z, @Nullable ColorStateList colorStateList) {
        if (this.f2545c5) {
            this.z = f.v(context, attributeSet, R$attr.f2180v, f7).tl();
            y2.fb fbVar = new y2.fb(this.z);
            this.f2554i9 = fbVar;
            fbVar.k5(context);
            if (z && colorStateList != null) {
                this.f2554i9.k(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f2554i9.setTint(typedValue.data);
        }
    }

    public void fb(@NonNull CoordinatorLayout.a aVar) {
        super.fb(aVar);
        this.vl = null;
        this.f2548ej = null;
    }

    public void g(int i) {
        u0(i, false);
    }

    public void g3(boolean z) {
        if (this.mg != z) {
            this.mg = z;
            if (!z && this.f2573z6 == 5) {
                tg(4);
            }
            ad();
        }
    }

    public void i9() {
        super.i9();
        this.vl = null;
        this.f2548ej = null;
    }

    public final void j() {
        int iUt = ut();
        if (this.n3) {
            this.fh = Math.max(this.f2572yt - iUt, this.n);
        } else {
            this.fh = this.f2572yt - iUt;
        }
    }

    public void jz(int i) {
        float f3;
        float fXg;
        V v6 = this.vl.get();
        if (v6 == null || this.f2555j5.isEmpty()) {
            return;
        }
        int i5 = this.fh;
        if (i > i5 || i5 == xg()) {
            int i8 = this.fh;
            f3 = i8 - i;
            fXg = this.f2572yt - i8;
        } else {
            int i10 = this.fh;
            f3 = i10 - i;
            fXg = i10 - xg();
        }
        float f4 = f3 / fXg;
        for (int i11 = 0; i11 < this.f2555j5.size(); i11++) {
            this.f2555j5.get(i11).y(v6, f4);
        }
    }

    public final void k(@NonNull Context context, AttributeSet attributeSet, boolean z) {
        f7(context, attributeSet, z, null);
    }

    public void kp(boolean z) {
        this.f2564tl = z;
    }

    public void lc(@NonNull fb fbVar) {
        this.f2555j5.remove(fbVar);
    }

    public void m(int i) {
        this.f2549f = i;
    }

    public boolean mg(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull MotionEvent motionEvent) {
        if (!v6.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2573z6 == 1 && actionMasked == 0) {
            return true;
        }
        k.zn znVar = this.f2548ej;
        if (znVar != null) {
            znVar.d(motionEvent);
        }
        if (actionMasked == 0) {
            ra();
        }
        if (this.qn == null) {
            this.qn = VelocityTracker.obtain();
        }
        this.qn.addMovement(motionEvent);
        if (this.f2548ej != null && actionMasked == 2 && !this.f2565ud && Math.abs(this.j - motionEvent.getY()) > this.f2548ej.c()) {
            this.f2548ej.n3(v6, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f2565ud;
    }

    @NonNull
    public Parcelable n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6) {
        return new SavedState(super.n(coordinatorLayout, v6), (BottomSheetBehavior<?>) this);
    }

    public final void nf(V v6, ud.y yVar, int i) {
        ut.ap(v6, yVar, (CharSequence) null, q9(i));
    }

    public void o(@NonNull fb fbVar) {
        if (this.f2555j5.contains(fbVar)) {
            return;
        }
        this.f2555j5.add(fbVar);
    }

    public final void o0(int i) {
        V v6 = this.vl.get();
        if (v6 == null) {
            return;
        }
        ViewParent parent = v6.getParent();
        if (parent != null && parent.isLayoutRequested() && ut.ut(v6)) {
            v6.post(new n3(v6, i));
        } else {
            cr(v6, i);
        }
    }

    public final float o4() {
        VelocityTracker velocityTracker = this.qn;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f2551gv);
        return this.qn.getYVelocity(this.o);
    }

    public final void oz() {
        this.c = (int) (this.f2572yt * (1.0f - this.d0));
    }

    public void p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull View view, int i, int i5, @NonNull int[] iArr, int i8) {
        if (i8 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f2552hw;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v6.getTop();
        int i10 = top - i5;
        if (i5 > 0) {
            if (i10 < xg()) {
                int iXg = top - xg();
                iArr[1] = iXg;
                ut.xg(v6, -iXg);
                pz(3);
            } else {
                if (!this.f2547d) {
                    return;
                }
                iArr[1] = i5;
                ut.xg(v6, -i5);
                pz(1);
            }
        } else if (i5 < 0 && !view.canScrollVertically(-1)) {
            int i11 = this.fh;
            if (i10 > i11 && !this.mg) {
                int i12 = top - i11;
                iArr[1] = i12;
                ut.xg(v6, -i12);
                pz(4);
            } else {
                if (!this.f2547d) {
                    return;
                }
                iArr[1] = i5;
                ut.xg(v6, -i5);
                pz(1);
            }
        }
        jz(v6.getTop());
        this.f2543a8 = i5;
        this.f2569x = true;
    }

    public final void pq(@NonNull View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || rs() || this.f2542a) ? false : true;
        if (this.f2568wz || this.f2571xc || this.w || z) {
            t.y(view, new gv(z));
        }
    }

    public void pz(int i) {
        V v6;
        if (this.f2573z6 == i) {
            return;
        }
        this.f2573z6 = i;
        WeakReference<V> weakReference = this.vl;
        if (weakReference == null || (v6 = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            qk(true);
        } else if (i == 6 || i == 5 || i == 4) {
            qk(false);
        }
        cy(i);
        for (int i5 = 0; i5 < this.f2555j5.size(); i5++) {
            this.f2555j5.get(i5).n3(v6, i);
        }
        ad();
    }

    public final b q9(int i) {
        return new a(i);
    }

    public final void qj(boolean z) {
        V v6;
        if (this.vl != null) {
            j();
            if (this.f2573z6 != 4 || (v6 = this.vl.get()) == null) {
                return;
            }
            if (z) {
                o0(this.f2573z6);
            } else {
                v6.requestLayout();
            }
        }
    }

    public final void qk(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.vl;
        if (weakReference == null) {
            return;
        }
        CoordinatorLayout parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f2566ut != null) {
                    return;
                } else {
                    this.f2566ut = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.vl.get()) {
                    if (z) {
                        this.f2566ut.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.zn) {
                            ut.o0(childAt, 4);
                        }
                    } else if (this.zn && (map = this.f2566ut) != null && map.containsKey(childAt)) {
                        ut.o0(childAt, this.f2566ut.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.f2566ut = null;
            } else if (this.zn) {
                this.vl.get().sendAccessibilityEvent(8);
            }
        }
    }

    public final int qn(V v6, int i, int i5) {
        return ut.zn(v6, v6.getResources().getString(i), q9(i5));
    }

    public final void ra() {
        this.o = -1;
        VelocityTracker velocityTracker = this.qn;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.qn = null;
        }
    }

    public void rb(float f3) {
        if (f3 <= 0.0f || f3 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.d0 = f3;
        if (this.vl != null) {
            oz();
        }
    }

    public boolean rs() {
        return this.f2564tl;
    }

    public void rz(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull View view, int i) {
        int iXg;
        int i5 = 3;
        if (v6.getTop() == xg()) {
            pz(3);
            return;
        }
        WeakReference<View> weakReference = this.f2552hw;
        if (weakReference != null && view == weakReference.get() && this.f2569x) {
            if (this.f2543a8 > 0) {
                if (this.n3) {
                    iXg = this.n;
                } else {
                    int top = v6.getTop();
                    int i8 = this.c;
                    if (top > i8) {
                        iXg = i8;
                        i5 = 6;
                    } else {
                        iXg = xg();
                    }
                }
            } else if (this.mg && xb(v6, o4())) {
                iXg = this.f2572yt;
                i5 = 5;
            } else if (this.f2543a8 == 0) {
                int top2 = v6.getTop();
                if (!this.n3) {
                    int i10 = this.c;
                    if (top2 < i10) {
                        if (top2 < Math.abs(top2 - this.fh)) {
                            iXg = xg();
                        } else {
                            iXg = this.c;
                        }
                    } else if (Math.abs(top2 - i10) < Math.abs(top2 - this.fh)) {
                        iXg = this.c;
                    } else {
                        iXg = this.fh;
                        i5 = 4;
                    }
                    i5 = 6;
                } else if (Math.abs(top2 - this.n) < Math.abs(top2 - this.fh)) {
                    iXg = this.n;
                } else {
                    iXg = this.fh;
                    i5 = 4;
                }
            } else {
                if (this.n3) {
                    iXg = this.fh;
                } else {
                    int top3 = v6.getTop();
                    if (Math.abs(top3 - this.c) < Math.abs(top3 - this.fh)) {
                        iXg = this.c;
                        i5 = 6;
                    } else {
                        iXg = this.fh;
                    }
                }
                i5 = 4;
            }
            wf(v6, i5, iXg, false);
            this.f2569x = false;
        }
    }

    @Deprecated
    public void s8(fb fbVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f2555j5.clear();
        if (fbVar != null) {
            this.f2555j5.add(fbVar);
        }
    }

    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, int i) {
        y2.fb fbVar;
        if (ut.fh(coordinatorLayout) && !ut.fh(v6)) {
            v6.setFitsSystemWindows(true);
        }
        if (this.vl == null) {
            this.f2550fb = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.n3);
            pq(v6);
            this.vl = new WeakReference<>(v6);
            if (this.f2545c5 && (fbVar = this.f2554i9) != null) {
                ut.u0(v6, fbVar);
            }
            y2.fb fbVar2 = this.f2554i9;
            if (fbVar2 != null) {
                float fN = this.rz;
                if (fN == -1.0f) {
                    fN = ut.n(v6);
                }
                fbVar2.q9(fN);
                boolean z = this.f2573z6 == 3;
                this.f2560r = z;
                this.f2554i9.f7(z ? 0.0f : 1.0f);
            }
            ad();
            if (ut.rz(v6) == 0) {
                ut.o0(v6, 1);
            }
            int measuredWidth = v6.getMeasuredWidth();
            int i5 = this.f2549f;
            if (measuredWidth > i5 && i5 != -1) {
                ViewGroup.LayoutParams layoutParams = v6.getLayoutParams();
                layoutParams.width = this.f2549f;
                v6.post(new y(v6, layoutParams));
            }
        }
        if (this.f2548ej == null) {
            this.f2548ej = k.zn.xc(coordinatorLayout, this.f2556k);
        }
        int top = v6.getTop();
        coordinatorLayout.ud(v6, i);
        this.f2557k5 = coordinatorLayout.getWidth();
        this.f2572yt = coordinatorLayout.getHeight();
        int height = v6.getHeight();
        this.f2544b = height;
        int i8 = this.f2572yt;
        int i10 = i8 - height;
        int i11 = this.f2546co;
        if (i10 < i11) {
            if (this.f2559p) {
                this.f2544b = i8;
            } else {
                this.f2544b = i8 - i11;
            }
        }
        this.n = Math.max(0, i8 - this.f2544b);
        oz();
        j();
        int i12 = this.f2573z6;
        if (i12 == 3) {
            ut.xg(v6, xg());
        } else if (i12 == 6) {
            ut.xg(v6, this.c);
        } else if (this.mg && i12 == 5) {
            ut.xg(v6, this.f2572yt);
        } else if (i12 == 4) {
            ut.xg(v6, this.fh);
        } else if (i12 == 1 || i12 == 2) {
            ut.xg(v6, top - v6.getTop());
        }
        this.f2552hw = new WeakReference<>(u(v6));
        return true;
    }

    public void tg(int i) {
        if (i == this.f2573z6) {
            return;
        }
        if (this.vl != null) {
            o0(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.mg && i == 5)) {
            this.f2573z6 = i;
        }
    }

    @Nullable
    public View u(View view) {
        if (ut.k(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewU = u(viewGroup.getChildAt(i));
            if (viewU != null) {
                return viewU;
            }
        }
        return null;
    }

    public final void u0(int i, boolean z) {
        if (i == -1) {
            if (this.f2542a) {
                return;
            } else {
                this.f2542a = true;
            }
        } else {
            if (!this.f2542a && this.f2567v == i) {
                return;
            }
            this.f2542a = false;
            this.f2567v = Math.max(0, i);
        }
        qj(z);
    }

    public final int ut() {
        int i;
        return this.f2542a ? Math.min(Math.max(this.f2550fb, this.f2572yt - ((this.f2557k5 * 9) / 16)), this.f2544b) + this.f2558mt : (this.f2564tl || this.f2568wz || (i = this.f2562t) <= 0) ? this.f2567v + this.f2558mt : Math.max(this.f2567v, i + this.f2561s);
    }

    public void wf(View view, int i, int i5, boolean z) {
        k.zn znVar = this.f2548ej;
        if (znVar == null || (!z ? znVar.j5(view, view.getLeft(), i5) : znVar.vl(view.getLeft(), i5))) {
            pz(i);
            return;
        }
        pz(2);
        cy(i);
        if (this.f2570x4 == null) {
            this.f2570x4 = new s(view, i);
        }
        if (this.f2570x4.f2582v) {
            this.f2570x4.f2580fb = i;
            return;
        }
        BottomSheetBehavior<V>.s sVar = this.f2570x4;
        sVar.f2580fb = i;
        ut.nf(view, sVar);
        this.f2570x4.f2582v = true;
    }

    public boolean xb(@NonNull View view, float f3) {
        if (this.f2563ta) {
            return true;
        }
        if (view.getTop() < this.fh) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f3 * 0.1f)) - ((float) this.fh)) / ((float) ut()) > 0.5f;
    }

    public boolean xc(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull View view, float f3, float f4) {
        WeakReference<View> weakReference = this.f2552hw;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f2573z6 != 3 || super.xc(coordinatorLayout, v6, view, f3, f4);
    }

    public int xg() {
        if (this.n3) {
            return this.n;
        }
        return Math.max(this.f3, this.f2559p ? 0 : this.f2546co);
    }

    public void y4(boolean z) {
        this.f2563ta = z;
    }

    public void yc(boolean z) {
        if (this.n3 == z) {
            return;
        }
        this.n3 = z;
        if (this.vl != null) {
            j();
        }
        pz((this.n3 && this.f2573z6 == 6) ? 3 : this.f2573z6);
        ad();
    }

    public void yg(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f3 = i;
    }

    public void z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull View view, int i, int i5, int i8, int i10, int i11, @NonNull int[] iArr) {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2574f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f2575fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2576s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f2577t;
        public boolean w;

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
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f2575fb = parcel.readInt();
            this.f2576s = parcel.readInt();
            this.f2574f = parcel.readInt() == 1;
            this.f2577t = parcel.readInt() == 1;
            this.w = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2575fb);
            parcel.writeInt(this.f2576s);
            parcel.writeInt(this.f2574f ? 1 : 0);
            parcel.writeInt(this.f2577t ? 1 : 0);
            parcel.writeInt(this.w ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f2575fb = bottomSheetBehavior.f2573z6;
            this.f2576s = bottomSheetBehavior.f2567v;
            this.f2574f = bottomSheetBehavior.n3;
            this.f2577t = bottomSheetBehavior.mg;
            this.w = bottomSheetBehavior.f2563ta;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.y = 0;
        this.n3 = true;
        this.zn = false;
        this.f2549f = -1;
        this.f2570x4 = null;
        this.d0 = 0.5f;
        this.rz = -1.0f;
        this.f2547d = true;
        this.f2573z6 = 4;
        this.f2555j5 = new ArrayList<>();
        this.q9 = -1;
        this.f2556k = new v();
        this.f2561s = context.getResources().getDimensionPixelSize(R$dimen.f2217ut);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2439ut);
        this.f2545c5 = typedArrayObtainStyledAttributes.hasValue(R$styleable.f2333e);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.f7);
        if (zHasValue) {
            f7(context, attributeSet, zHasValue, t2.zn.y(context, typedArrayObtainStyledAttributes, R$styleable.f7));
        } else {
            k(context, attributeSet, zHasValue);
        }
        en();
        this.rz = typedArrayObtainStyledAttributes.getDimension(R$styleable.f2374k, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.q9)) {
            m(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.q9, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.dm);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            g(i);
        } else {
            g(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.dm, -1));
        }
        g3(typedArrayObtainStyledAttributes.getBoolean(R$styleable.xg, false));
        kp(typedArrayObtainStyledAttributes.getBoolean(R$styleable.rs, false));
        yc(typedArrayObtainStyledAttributes.getBoolean(R$styleable.u, true));
        y4(typedArrayObtainStyledAttributes.getBoolean(R$styleable.o4, false));
        ap(typedArrayObtainStyledAttributes.getBoolean(R$styleable.en, true));
        bk(typedArrayObtainStyledAttributes.getInt(R$styleable.ct, 0));
        rb(typedArrayObtainStyledAttributes.getFloat(R$styleable.y5, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(R$styleable.jz);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            yg(typedValuePeekValue2.data);
        } else {
            yg(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.jz, 0));
        }
        this.f2568wz = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f2336eb, false);
        this.f2571xc = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f2382lc, false);
        this.w = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f2397nf, false);
        this.f2559p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f2418ra, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f2551gv = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
