package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.badge.BadgeDrawable;
import com.google.protobuf.Reader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.ud;
import o2.f;
import o2.t;
import qn.a8;
import qn.co;
import qn.ut;
import ut.wz;
import w.qk;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.zn
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2814b;
    public PorterDuff.Mode c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public ColorStateList f2815co;

    @Nullable
    public PagerAdapter ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2816d;
    public float d0;

    @Nullable
    public ViewPager dm;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public n3 f2817eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f2818ej;
    public com.google.android.material.tabs.y en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2819f;

    @NonNull
    public Drawable f3;
    public boolean f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public final a f2820fb;
    public float fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final int f2821hw;
    public int j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public int f2822j5;

    @Nullable
    public zn jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2823k;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public boolean f2824lc;
    public int n;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public final j5.v<c5> f2825nf;
    public int o;
    public DataSetObserver o4;
    public int oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2826p;
    public boolean q9;
    public int qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f2827r;
    public s rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2829t;
    public final ArrayList<zn> u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public boolean f2830ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public fb f2831v;
    public int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2832x;
    public ValueAnimator xg;
    public final ArrayList<fb> y;

    @Nullable
    public zn y5;
    public ColorStateList z;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final int f2813ra = R$style.f2293c5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j5.v<fb> f2812e = new j5.fb(16);

    public class a extends LinearLayout {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public float f2834fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2835s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2836v;
        public ValueAnimator y;

        public class n3 extends AnimatorListenerAdapter {
            public final /* synthetic */ int y;

            public n3(int i) {
                this.y = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.f2836v = this.y;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a.this.f2836v = this.y;
            }
        }

        public class y implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View n3;
            public final /* synthetic */ View y;

            public y(View view, View view2) {
                this.y = view;
                this.n3 = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                a.this.fb(this.y, this.n3, valueAnimator.getAnimatedFraction());
            }
        }

        public a(Context context) {
            super(context);
            this.f2836v = -1;
            this.f2835s = -1;
            setWillNotDraw(false);
        }

        public void a(int i) {
            Rect bounds = TabLayout.this.f3.getBounds();
            TabLayout.this.f3.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f3.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f3.getIntrinsicHeight();
            }
            int i = TabLayout.this.j;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f3.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f3.getBounds();
                TabLayout.this.f3.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawableMt = tabLayout.f3;
                if (tabLayout.n != 0) {
                    drawableMt = a8.y.mt(drawableMt);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawableMt.setColorFilter(TabLayout.this.n, PorterDuff.Mode.SRC_IN);
                    } else {
                        a8.y.wz(drawableMt, TabLayout.this.n);
                    }
                }
                drawableMt.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void fb(View view, View view2, float f3) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f3;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f3.getBounds().bottom);
            } else {
                com.google.android.material.tabs.y yVar = TabLayout.this.en;
                TabLayout tabLayout = TabLayout.this;
                yVar.zn(tabLayout, view, view2, f3, tabLayout.f3);
            }
            ut.lc(this);
        }

        public final void gv() {
            View childAt = getChildAt(this.f2836v);
            com.google.android.material.tabs.y yVar = TabLayout.this.en;
            TabLayout tabLayout = TabLayout.this;
            yVar.gv(tabLayout, childAt, tabLayout.f3);
        }

        public void n3(int i, int i5) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.y.cancel();
            }
            s(true, i, i5);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i5, int i8, int i10) {
            super.onLayout(z, i, i5, i8, i10);
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                gv();
            } else {
                s(false, this.f2836v, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i5) {
            super.onMeasure(i, i5);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.qn == 1 || tabLayout.oz == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) t.n3(getContext(), 16)) * 2)) {
                    boolean z5 = false;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i10).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z5 = true;
                        }
                    }
                    z = z5;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.qn = 0;
                    tabLayout2.hw(false);
                }
                if (z) {
                    super.onMeasure(i, i5);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f2835s == i) {
                return;
            }
            requestLayout();
            this.f2835s = i;
        }

        public final void s(boolean z, int i, int i5) {
            View childAt = getChildAt(this.f2836v);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                gv();
                return;
            }
            y yVar = new y(childAt, childAt2);
            if (!z) {
                this.y.removeAllUpdateListeners();
                this.y.addUpdateListener(yVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.y = valueAnimator;
            valueAnimator.setInterpolator(t1.y.n3);
            valueAnimator.setDuration(i5);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(yVar);
            valueAnimator.addListener(new n3(i));
            valueAnimator.start();
        }

        public void v(int i, float f3) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.y.cancel();
            }
            this.f2836v = i;
            this.f2834fb = f3;
            fb(getChildAt(i), getChildAt(this.f2836v + 1), this.f2834fb);
        }

        public boolean zn() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class c5 extends LinearLayout {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        @Nullable
        public Drawable f2837co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public BadgeDrawable f2838f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public ImageView f2839fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public ImageView f2840p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public View f2842s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public View f2843t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f2844v;

        @Nullable
        public TextView w;
        public fb y;
        public int z;

        public class y implements View.OnLayoutChangeListener {
            public final /* synthetic */ View y;

            public y(View view) {
                this.y = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i5, int i8, int i10, int i11, int i12, int i13, int i14) {
                if (this.y.getVisibility() == 0) {
                    c5.this.co(this.y);
                }
            }
        }

        public c5(@NonNull Context context) {
            super(context);
            this.z = 2;
            r(context);
            ut.cy(this, TabLayout.this.f2828s, TabLayout.this.f2819f, TabLayout.this.f2829t, TabLayout.this.w);
            setGravity(17);
            setOrientation(!TabLayout.this.f2830ut ? 1 : 0);
            setClickable(true);
            ut.qk(this, a8.n3(getContext(), 1002));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f2838f;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if (this.f2838f == null) {
                this.f2838f = BadgeDrawable.zn(getContext());
            }
            mt();
            BadgeDrawable badgeDrawable = this.f2838f;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a(@Nullable View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new y(view));
        }

        @NonNull
        public final FrameLayout c5() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public final void co(@NonNull View view) {
            if (t() && view == this.f2842s) {
                com.google.android.material.badge.y.zn(this.f2838f, view, f(view));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f2837co;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f2837co.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Nullable
        public final FrameLayout f(@NonNull View view) {
            if ((view == this.f2839fb || view == this.f2844v) && com.google.android.material.badge.y.y) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final float fb(@NonNull Layout layout, int i, float f3) {
            return layout.getLineWidth(i) * (f3 / layout.getPaint().getTextSize());
        }

        public int getContentHeight() {
            View[] viewArr = {this.f2844v, this.f2839fb, this.f2843t};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f2844v, this.f2839fb, this.f2843t};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        @Nullable
        public fb getTab() {
            return this.y;
        }

        public final void i4(@Nullable TextView textView, @Nullable ImageView imageView) {
            fb fbVar = this.y;
            Drawable drawableMutate = (fbVar == null || fbVar.a() == null) ? null : a8.y.mt(this.y.a()).mutate();
            fb fbVar2 = this.y;
            CharSequence charSequenceI9 = fbVar2 != null ? fbVar2.i9() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceI9);
            if (textView != null) {
                if (zIsEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(charSequenceI9);
                    if (this.y.f2848fb == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iN3 = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) t.n3(getContext(), 8);
                if (TabLayout.this.f2830ut) {
                    if (iN3 != co.y(marginLayoutParams)) {
                        co.zn(marginLayoutParams, iN3);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iN3 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iN3;
                    co.zn(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            fb fbVar3 = this.y;
            CharSequence charSequence = fbVar3 != null ? fbVar3.f2849gv : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (zIsEmpty) {
                    charSequenceI9 = charSequence;
                }
                qk.y(this, charSequenceI9);
            }
        }

        public final void i9(@NonNull Canvas canvas) {
            Drawable drawable = this.f2837co;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f2837co.draw(canvas);
            }
        }

        public final void mt() {
            fb fbVar;
            fb fbVar2;
            if (t()) {
                if (this.f2843t != null) {
                    p();
                    return;
                }
                if (this.f2839fb != null && (fbVar2 = this.y) != null && fbVar2.a() != null) {
                    View view = this.f2842s;
                    ImageView imageView = this.f2839fb;
                    if (view == imageView) {
                        co(imageView);
                        return;
                    } else {
                        p();
                        w(this.f2839fb);
                        return;
                    }
                }
                if (this.f2844v == null || (fbVar = this.y) == null || fbVar.s() != 1) {
                    p();
                    return;
                }
                View view2 = this.f2842s;
                TextView textView = this.f2844v;
                if (view2 == textView) {
                    co(textView);
                } else {
                    p();
                    w(this.f2844v);
                }
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f2838f;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f2838f.fb()));
            }
            ud udVarW2 = ud.w2(accessibilityNodeInfo);
            udVarW2.yg(ud.fb.y(0, 1, this.y.fb(), 1, false, isSelected()));
            if (isSelected()) {
                udVarW2.s8(false);
                udVarW2.dm(ud.y.c5);
            }
            udVarW2.o0(getResources().getString(R$string.f2286s));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i5) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f2818ej, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i5);
            if (this.f2844v != null) {
                float f3 = TabLayout.this.d0;
                int i8 = this.z;
                ImageView imageView = this.f2839fb;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f2844v;
                    if (textView != null && textView.getLineCount() > 1) {
                        f3 = TabLayout.this.fh;
                    }
                } else {
                    i8 = 1;
                }
                float textSize = this.f2844v.getTextSize();
                int lineCount = this.f2844v.getLineCount();
                int iGv = wz.gv(this.f2844v);
                if (f3 != textSize || (iGv >= 0 && i8 != iGv)) {
                    if (TabLayout.this.oz != 1 || f3 <= textSize || lineCount != 1 || ((layout = this.f2844v.getLayout()) != null && fb(layout, 0, f3) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f2844v.setTextSize(0, f3);
                        this.f2844v.setMaxLines(i8);
                        super.onMeasure(i, i5);
                    }
                }
            }
        }

        public final void p() {
            if (t()) {
                s(true);
                View view = this.f2842s;
                if (view != null) {
                    com.google.android.material.badge.y.n3(this.f2838f, view);
                    this.f2842s = null;
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.y == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.y.tl();
            return true;
        }

        public final void r(Context context) {
            int i = TabLayout.this.f2816d;
            if (i != 0) {
                Drawable drawableGv = f.n3.gv(context, i);
                this.f2837co = drawableGv;
                if (drawableGv != null && drawableGv.isStateful()) {
                    this.f2837co.setState(getDrawableState());
                }
            } else {
                this.f2837co = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (TabLayout.this.f2827r != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListY = u2.n3.y(TabLayout.this.f2827r);
                boolean z = TabLayout.this.f7;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListY, gradientDrawable3, z ? null : gradientDrawable2);
            }
            ut.u0(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        public final void s(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.f2844v;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f2839fb;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f2843t;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable fb fbVar) {
            if (fbVar != this.y) {
                this.y = fbVar;
                z();
            }
        }

        public final boolean t() {
            return this.f2838f != null;
        }

        public final void tl() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.y.y) {
                FrameLayout frameLayoutC5 = c5();
                addView(frameLayoutC5, 0);
                viewGroup = frameLayoutC5;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R$layout.f2264gv, viewGroup, false);
            this.f2839fb = imageView;
            viewGroup.addView(imageView, 0);
        }

        public final void w(@Nullable View view) {
            if (t() && view != null) {
                s(false);
                com.google.android.material.badge.y.y(this.f2838f, view, f(view));
                this.f2842s = view;
            }
        }

        public final void wz() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.y.y) {
                FrameLayout frameLayoutC5 = c5();
                addView(frameLayoutC5);
                viewGroup = frameLayoutC5;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.f2273v, viewGroup, false);
            this.f2844v = textView;
            viewGroup.addView(textView);
        }

        public final void x4() {
            setOrientation(!TabLayout.this.f2830ut ? 1 : 0);
            TextView textView = this.w;
            if (textView == null && this.f2840p == null) {
                i4(this.f2844v, this.f2839fb);
            } else {
                i4(textView, this.f2840p);
            }
        }

        public void xc() {
            setTab(null);
            setSelected(false);
        }

        public final void z() {
            fb fbVar = this.y;
            Drawable drawableMutate = null;
            View viewV = fbVar != null ? fbVar.v() : null;
            if (viewV != null) {
                ViewParent parent = viewV.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewV);
                    }
                    addView(viewV);
                }
                this.f2843t = viewV;
                TextView textView = this.f2844v;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2839fb;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2839fb.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewV.findViewById(R.id.text1);
                this.w = textView2;
                if (textView2 != null) {
                    this.z = wz.gv(textView2);
                }
                this.f2840p = (ImageView) viewV.findViewById(R.id.icon);
            } else {
                View view = this.f2843t;
                if (view != null) {
                    removeView(view);
                    this.f2843t = null;
                }
                this.w = null;
                this.f2840p = null;
            }
            if (this.f2843t == null) {
                if (this.f2839fb == null) {
                    tl();
                }
                if (fbVar != null && fbVar.a() != null) {
                    drawableMutate = a8.y.mt(fbVar.a()).mutate();
                }
                if (drawableMutate != null) {
                    a8.y.xc(drawableMutate, TabLayout.this.z);
                    PorterDuff.Mode mode = TabLayout.this.c;
                    if (mode != null) {
                        a8.y.w(drawableMutate, mode);
                    }
                }
                if (this.f2844v == null) {
                    wz();
                    this.z = wz.gv(this.f2844v);
                }
                wz.xc(this.f2844v, TabLayout.this.f2826p);
                ColorStateList colorStateList = TabLayout.this.f2815co;
                if (colorStateList != null) {
                    this.f2844v.setTextColor(colorStateList);
                }
                i4(this.f2844v, this.f2839fb);
                mt();
                a(this.f2839fb);
                a(this.f2844v);
            } else {
                TextView textView3 = this.w;
                if (textView3 != null || this.f2840p != null) {
                    i4(textView3, this.f2840p);
                }
            }
            if (fbVar != null && !TextUtils.isEmpty(fbVar.f2849gv)) {
                setContentDescription(fbVar.f2849gv);
            }
            setSelected(fbVar != null && fbVar.f());
        }
    }

    public static class fb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public View f2846a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @NonNull
        public c5 f2847c5;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public CharSequence f2849gv;

        @Nullable
        public Drawable n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public TabLayout f2851s;

        @Nullable
        public Object y;

        @Nullable
        public CharSequence zn;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2852v = -1;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f2848fb = 1;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f2850i9 = -1;

        @Nullable
        public Drawable a() {
            return this.n3;
        }

        @Nullable
        public Object c5() {
            return this.y;
        }

        @NonNull
        public fb co(@Nullable Object obj) {
            this.y = obj;
            return this;
        }

        public boolean f() {
            TabLayout tabLayout = this.f2851s;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f2852v;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public int fb() {
            return this.f2852v;
        }

        @Nullable
        public CharSequence i9() {
            return this.zn;
        }

        public void mt(int i) {
            this.f2852v = i;
        }

        @NonNull
        public fb p(@Nullable Drawable drawable) {
            this.n3 = drawable;
            TabLayout tabLayout = this.f2851s;
            if (tabLayout.qn == 1 || tabLayout.oz == 2) {
                tabLayout.hw(true);
            }
            r();
            if (com.google.android.material.badge.y.y && this.f2847c5.t() && this.f2847c5.f2838f.isVisible()) {
                this.f2847c5.invalidate();
            }
            return this;
        }

        public void r() {
            c5 c5Var = this.f2847c5;
            if (c5Var != null) {
                c5Var.z();
            }
        }

        public int s() {
            return this.f2848fb;
        }

        public void t() {
            this.f2851s = null;
            this.f2847c5 = null;
            this.y = null;
            this.n3 = null;
            this.f2850i9 = -1;
            this.zn = null;
            this.f2849gv = null;
            this.f2852v = -1;
            this.f2846a = null;
        }

        public void tl() {
            TabLayout tabLayout = this.f2851s;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.z6(this);
        }

        @Nullable
        public View v() {
            return this.f2846a;
        }

        @NonNull
        public fb w(@Nullable View view) {
            this.f2846a = view;
            r();
            return this;
        }

        @NonNull
        public fb wz(@Nullable CharSequence charSequence) {
            this.f2849gv = charSequence;
            r();
            return this;
        }

        @NonNull
        public fb xc(int i) {
            return w(LayoutInflater.from(this.f2847c5.getContext()).inflate(i, (ViewGroup) this.f2847c5, false));
        }

        @NonNull
        public fb z(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f2849gv) && !TextUtils.isEmpty(charSequence)) {
                this.f2847c5.setContentDescription(charSequence);
            }
            this.zn = charSequence;
            r();
            return this;
        }
    }

    public interface gv extends zn<fb> {
    }

    public static class i9 implements gv {
        public final ViewPager y;

        public i9(ViewPager viewPager) {
            this.y = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.zn
        public void n3(fb fbVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.zn
        public void y(@NonNull fb fbVar) {
            this.y.setCurrentItem(fbVar.fb());
        }

        @Override // com.google.android.material.tabs.TabLayout.zn
        public void zn(fb fbVar) {
        }
    }

    public class n3 implements ViewPager.a {
        public boolean y;

        public n3() {
        }

        public void n3(boolean z) {
            this.y = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.a
        public void y(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.dm == viewPager) {
                tabLayout.ud(pagerAdapter2, this.y);
            }
        }
    }

    public static class s implements ViewPager.fb {
        public int n3;

        @NonNull
        public final WeakReference<TabLayout> y;
        public int zn;

        public s(TabLayout tabLayout) {
            this.y = new WeakReference<>(tabLayout);
        }

        public void gv() {
            this.zn = 0;
            this.n3 = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.fb
        public void n3(int i) {
            this.n3 = this.zn;
            this.zn = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.fb
        public void y(int i, float f3, int i5) {
            TabLayout tabLayout = this.y.get();
            if (tabLayout != null) {
                int i8 = this.zn;
                tabLayout.x(i, f3, i8 != 2 || this.n3 == 1, (i8 == 2 && this.n3 == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.fb
        public void zn(int i) {
            TabLayout tabLayout = this.y.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i5 = this.zn;
            tabLayout.ej(tabLayout.n(i), i5 == 0 || (i5 == 2 && this.n3 == 0));
        }
    }

    public class v extends DataSetObserver {
        public v() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.fh();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.fh();
        }
    }

    public class y implements ValueAnimator.AnimatorUpdateListener {
        public y() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    @Deprecated
    public interface zn<T extends fb> {
        void n3(T t3);

        void y(T t3);

        void zn(T t3);
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2160a8);
    }

    private int getDefaultHeight() {
        int size = this.y.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            fb fbVar = this.y.get(i);
            if (fbVar == null || fbVar.a() == null || TextUtils.isEmpty(fbVar.i9())) {
                i++;
            } else if (!this.f2830ut) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f2832x;
        if (i != -1) {
            return i;
        }
        int i5 = this.oz;
        if (i5 == 0 || i5 == 2) {
            return this.f2821hw;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f2820fb.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @NonNull
    public static ColorStateList p(int i, int i5) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i5, i});
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f2820fb.getChildCount();
        if (i < childCount) {
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = this.f2820fb.getChildAt(i5);
                boolean z = true;
                childAt.setSelected(i5 == i);
                if (i5 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i5++;
            }
        }
    }

    public void a(@NonNull fb fbVar, int i, boolean z) {
        if (fbVar.f2851s != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        w(fbVar, i);
        c5(fbVar);
        if (z) {
            fbVar.tl();
        }
    }

    public void a8(int i, float f3, boolean z) {
        x(i, f3, z, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        i9(view);
    }

    public void b(@Nullable ViewPager viewPager, boolean z) {
        k5(viewPager, z, false);
    }

    public boolean c() {
        return this.q9;
    }

    public final void c5(@NonNull fb fbVar) {
        c5 c5Var = fbVar.f2847c5;
        c5Var.setSelected(false);
        c5Var.setActivated(false);
        this.f2820fb.addView(c5Var, fbVar.fb(), mt());
    }

    public fb co() {
        fb fbVarN3 = f2812e.n3();
        return fbVarN3 == null ? new fb() : fbVarN3;
    }

    public final void d(int i) {
        c5 c5Var = (c5) this.f2820fb.getChildAt(i);
        this.f2820fb.removeViewAt(i);
        if (c5Var != null) {
            c5Var.xc();
            this.f2825nf.y(c5Var);
        }
        requestLayout();
    }

    @NonNull
    public fb d0() {
        fb fbVarCo = co();
        fbVarCo.f2851s = this;
        fbVarCo.f2847c5 = z(fbVarCo);
        if (fbVarCo.f2850i9 != -1) {
            fbVarCo.f2847c5.setId(fbVarCo.f2850i9);
        }
        return fbVarCo;
    }

    public void ej(@Nullable fb fbVar, boolean z) {
        fb fbVar2 = this.f2831v;
        if (fbVar2 == fbVar) {
            if (fbVar2 != null) {
                r(fbVar);
                f(fbVar.fb());
                return;
            }
            return;
        }
        int iFb = fbVar != null ? fbVar.fb() : -1;
        if (z) {
            if ((fbVar2 == null || fbVar2.fb() == -1) && iFb != -1) {
                a8(iFb, 0.0f, true);
            } else {
                f(iFb);
            }
            if (iFb != -1) {
                setSelectedTabView(iFb);
            }
        }
        this.f2831v = fbVar;
        if (fbVar2 != null) {
            i4(fbVar2);
        }
        if (fbVar != null) {
            x4(fbVar);
        }
    }

    public final void f(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !ut.q9(this) || this.f2820fb.zn()) {
            a8(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iWz = wz(i, 0.0f);
        if (scrollX != iWz) {
            f3();
            this.xg.setIntValues(scrollX, iWz);
            this.xg.start();
        }
        this.f2820fb.n3(i, this.o);
    }

    public final void f3() {
        if (this.xg == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.xg = valueAnimator;
            valueAnimator.setInterpolator(t1.y.n3);
            this.xg.setDuration(this.o);
            this.xg.addUpdateListener(new y());
        }
    }

    public void fb(@NonNull fb fbVar, boolean z) {
        a(fbVar, this.y.size(), z);
    }

    public void fh() {
        int currentItem;
        mg();
        PagerAdapter pagerAdapter = this.ct;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                fb(d0().z(this.ct.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.dm;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            z6(n(currentItem));
        }
    }

    public int getSelectedTabPosition() {
        fb fbVar = this.f2831v;
        if (fbVar != null) {
            return fbVar.fb();
        }
        return -1;
    }

    public int getTabCount() {
        return this.y.size();
    }

    public int getTabGravity() {
        return this.qn;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.z;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f2823k;
    }

    public int getTabIndicatorGravity() {
        return this.j;
    }

    public int getTabMaxWidth() {
        return this.f2818ej;
    }

    public int getTabMode() {
        return this.oz;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f2827r;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f3;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f2815co;
    }

    public void gv(@NonNull gv gvVar) {
        zn(gvVar);
    }

    public void hw(boolean z) {
        for (int i = 0; i < this.f2820fb.getChildCount(); i++) {
            View childAt = this.f2820fb.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            vl((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final void i4(@NonNull fb fbVar) {
        for (int size = this.u.size() - 1; size >= 0; size--) {
            this.u.get(size).n3(fbVar);
        }
    }

    public final void i9(View view) {
        if (!(view instanceof a3.n3)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        s((a3.n3) view);
    }

    public final void k5(@Nullable ViewPager viewPager, boolean z, boolean z5) {
        ViewPager viewPager2 = this.dm;
        if (viewPager2 != null) {
            s sVar = this.rs;
            if (sVar != null) {
                viewPager2.ej(sVar);
            }
            n3 n3Var = this.f2817eb;
            if (n3Var != null) {
                this.dm.z6(n3Var);
            }
        }
        zn znVar = this.y5;
        if (znVar != null) {
            ta(znVar);
            this.y5 = null;
        }
        if (viewPager != null) {
            this.dm = viewPager;
            if (this.rs == null) {
                this.rs = new s(this);
            }
            this.rs.gv();
            viewPager.zn(this.rs);
            i9 i9Var = new i9(viewPager);
            this.y5 = i9Var;
            zn(i9Var);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                ud(adapter, z);
            }
            if (this.f2817eb == null) {
                this.f2817eb = new n3();
            }
            this.f2817eb.n3(z);
            viewPager.n3(this.f2817eb);
            a8(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.dm = null;
            ud(null, false);
        }
        this.f2824lc = z5;
    }

    public void mg() {
        for (int childCount = this.f2820fb.getChildCount() - 1; childCount >= 0; childCount--) {
            d(childCount);
        }
        Iterator<fb> it = this.y.iterator();
        while (it.hasNext()) {
            fb next = it.next();
            it.remove();
            next.t();
            rz(next);
        }
        this.f2831v = null;
    }

    @NonNull
    public final LinearLayout.LayoutParams mt() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        vl(layoutParams);
        return layoutParams;
    }

    @Nullable
    public fb n(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.y.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y2.s.v(this);
        if (this.dm == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                k5((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2824lc) {
            setupWithViewPager(null);
            this.f2824lc = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        for (int i = 0; i < this.f2820fb.getChildCount(); i++) {
            View childAt = this.f2820fb.getChildAt(i);
            if (childAt instanceof c5) {
                ((c5) childAt).i9(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ud.w2(accessibilityNodeInfo).ap(ud.a.y(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = o2.t.n3(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f2814b
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = o2.t.n3(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f2818ej = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.oz
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final void r(@NonNull fb fbVar) {
        for (int size = this.u.size() - 1; size >= 0; size--) {
            this.u.get(size).zn(fbVar);
        }
    }

    public boolean rz(fb fbVar) {
        return f2812e.y(fbVar);
    }

    public final void s(@NonNull a3.n3 n3Var) {
        fb fbVarD0 = d0();
        CharSequence charSequence = n3Var.y;
        if (charSequence != null) {
            fbVarD0.z(charSequence);
        }
        Drawable drawable = n3Var.f29v;
        if (drawable != null) {
            fbVarD0.p(drawable);
        }
        int i = n3Var.f28fb;
        if (i != 0) {
            fbVarD0.xc(i);
        }
        if (!TextUtils.isEmpty(n3Var.getContentDescription())) {
            fbVarD0.wz(n3Var.getContentDescription());
        }
        v(fbVarD0);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        y2.s.gv(this, f3);
    }

    public void setInlineLabel(boolean z) {
        if (this.f2830ut != z) {
            this.f2830ut = z;
            for (int i = 0; i < this.f2820fb.getChildCount(); i++) {
                View childAt = this.f2820fb.getChildAt(i);
                if (childAt instanceof c5) {
                    ((c5) childAt).x4();
                }
            }
            tl();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable gv gvVar) {
        setOnTabSelectedListener((zn) gvVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f3();
        this.xg.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (this.f3 != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f3 = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.n = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.j != i) {
            this.j = i;
            ut.lc(this.f2820fb);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f2820fb.a(i);
    }

    public void setTabGravity(int i) {
        if (this.qn != i) {
            this.qn = i;
            tl();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            yt();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(f.n3.zn(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f2823k = i;
        if (i == 0) {
            this.en = new com.google.android.material.tabs.y();
        } else {
            if (i == 1) {
                this.en = new a3.y();
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.q9 = z;
        ut.lc(this.f2820fb);
    }

    public void setTabMode(int i) {
        if (i != this.oz) {
            this.oz = i;
            tl();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f2827r != colorStateList) {
            this.f2827r = colorStateList;
            for (int i = 0; i < this.f2820fb.getChildCount(); i++) {
                View childAt = this.f2820fb.getChildAt(i);
                if (childAt instanceof c5) {
                    ((c5) childAt).r(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(f.n3.zn(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f2815co != colorStateList) {
            this.f2815co = colorStateList;
            yt();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        ud(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f7 != z) {
            this.f7 = z;
            for (int i = 0; i < this.f2820fb.getChildCount(); i++) {
                View childAt = this.f2820fb.getChildAt(i);
                if (childAt instanceof c5) {
                    ((c5) childAt).r(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        b(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f2820fb.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f2820fb.setGravity(8388611);
    }

    @Deprecated
    public void ta(@Nullable zn znVar) {
        this.u.remove(znVar);
    }

    public final void tl() {
        int i = this.oz;
        ut.cy(this.f2820fb, (i == 0 || i == 2) ? Math.max(0, this.f2822j5 - this.f2828s) : 0, 0, 0, 0);
        int i5 = this.oz;
        if (i5 == 0) {
            t(this.qn);
        } else if (i5 == 1 || i5 == 2) {
            if (this.qn == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f2820fb.setGravity(1);
        }
        hw(true);
    }

    public void ud(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.ct;
        if (pagerAdapter2 != null && (dataSetObserver = this.o4) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.ct = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.o4 == null) {
                this.o4 = new v();
            }
            pagerAdapter.registerDataSetObserver(this.o4);
        }
        fh();
    }

    public void v(@NonNull fb fbVar) {
        fb(fbVar, this.y.isEmpty());
    }

    public final void vl(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.oz == 1 && this.qn == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public final void w(@NonNull fb fbVar, int i) {
        fbVar.mt(i);
        this.y.add(i, fbVar);
        int size = this.y.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.y.get(i).mt(i);
            }
        }
    }

    public final int wz(int i, float f3) {
        int i5 = this.oz;
        if (i5 != 0 && i5 != 2) {
            return 0;
        }
        View childAt = this.f2820fb.getChildAt(i);
        int i8 = i + 1;
        View childAt2 = i8 < this.f2820fb.getChildCount() ? this.f2820fb.getChildAt(i8) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i10 = (int) ((width + width2) * 0.5f * f3);
        return ut.ta(this) == 0 ? left + i10 : left - i10;
    }

    public void x(int i, float f3, boolean z, boolean z5) {
        int iRound = Math.round(i + f3);
        if (iRound < 0 || iRound >= this.f2820fb.getChildCount()) {
            return;
        }
        if (z5) {
            this.f2820fb.v(i, f3);
        }
        ValueAnimator valueAnimator = this.xg;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.xg.cancel();
        }
        scrollTo(wz(i, f3), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    public final void x4(@NonNull fb fbVar) {
        for (int size = this.u.size() - 1; size >= 0; size--) {
            this.u.get(size).y(fbVar);
        }
    }

    public void xc() {
        this.u.clear();
    }

    public final void yt() {
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            this.y.get(i).r();
        }
    }

    @NonNull
    public final c5 z(@NonNull fb fbVar) {
        j5.v<c5> vVar = this.f2825nf;
        c5 c5VarN3 = vVar != null ? vVar.n3() : null;
        if (c5VarN3 == null) {
            c5VarN3 = new c5(getContext());
        }
        c5VarN3.setTab(fbVar);
        c5VarN3.setFocusable(true);
        c5VarN3.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fbVar.f2849gv)) {
            c5VarN3.setContentDescription(fbVar.zn);
        } else {
            c5VarN3.setContentDescription(fbVar.f2849gv);
        }
        return c5VarN3;
    }

    public void z6(@Nullable fb fbVar) {
        ej(fbVar, true);
    }

    @Deprecated
    public void zn(@Nullable zn znVar) {
        if (this.u.contains(znVar)) {
            return;
        }
        this.u.add(znVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5 = f2813ra;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        this.y = new ArrayList<>();
        this.f3 = new GradientDrawable();
        this.n = 0;
        this.f2818ej = Reader.READ_DONE;
        this.u = new ArrayList<>();
        this.f2825nf = new j5.a(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        a aVar = new a(context2);
        this.f2820fb = aVar;
        super.addView(aVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayS = f.s(context2, attributeSet, R$styleable.f2454x9, i, i5, R$styleable.f2319bm);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            y2.fb fbVar = new y2.fb();
            fbVar.k(ColorStateList.valueOf(colorDrawable.getColor()));
            fbVar.k5(context2);
            fbVar.q9(ut.n(this));
            ut.u0(this, fbVar);
        }
        setSelectedTabIndicator(t2.zn.gv(context2, typedArrayS, R$styleable.f2361i7));
        setSelectedTabIndicatorColor(typedArrayS.getColor(R$styleable.f2411qg, 0));
        aVar.a(typedArrayS.getDimensionPixelSize(R$styleable.f2371jh, -1));
        setSelectedTabIndicatorGravity(typedArrayS.getInt(R$styleable.f2320bp, 0));
        setTabIndicatorFullWidth(typedArrayS.getBoolean(R$styleable.f2402ok, true));
        setTabIndicatorAnimationMode(typedArrayS.getInt(R$styleable.f2429td, 0));
        int dimensionPixelSize = typedArrayS.getDimensionPixelSize(R$styleable.f2353h6, 0);
        this.w = dimensionPixelSize;
        this.f2829t = dimensionPixelSize;
        this.f2819f = dimensionPixelSize;
        this.f2828s = dimensionPixelSize;
        this.f2828s = typedArrayS.getDimensionPixelSize(R$styleable.f2399nr, dimensionPixelSize);
        this.f2819f = typedArrayS.getDimensionPixelSize(R$styleable.f2404os, this.f2819f);
        this.f2829t = typedArrayS.getDimensionPixelSize(R$styleable.f2406pv, this.f2829t);
        this.w = typedArrayS.getDimensionPixelSize(R$styleable.f2423sd, this.w);
        int resourceId = typedArrayS.getResourceId(R$styleable.f2319bm, R$style.n3);
        this.f2826p = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, androidx.appcompat.R$styleable.p4);
        try {
            this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R$styleable.ik, 0);
            this.f2815co = t2.zn.y(context2, typedArrayObtainStyledAttributes, androidx.appcompat.R$styleable.st);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayS.hasValue(R$styleable.f2335e7)) {
                this.f2815co = t2.zn.y(context2, typedArrayS, R$styleable.f2335e7);
            }
            if (typedArrayS.hasValue(R$styleable.f2372jn)) {
                this.f2815co = p(this.f2815co.getDefaultColor(), typedArrayS.getColor(R$styleable.f2372jn, 0));
            }
            this.z = t2.zn.y(context2, typedArrayS, R$styleable.f2384lf);
            this.c = t.v(typedArrayS.getInt(R$styleable.f2389mo, -1), null);
            this.f2827r = t2.zn.y(context2, typedArrayS, R$styleable.f2356hx);
            this.o = typedArrayS.getInt(R$styleable.f2331de, 300);
            this.f2832x = typedArrayS.getDimensionPixelSize(R$styleable.f2438ur, -1);
            this.f2814b = typedArrayS.getDimensionPixelSize(R$styleable.f2398np, -1);
            this.f2816d = typedArrayS.getResourceId(R$styleable.f2313ao, 0);
            this.f2822j5 = typedArrayS.getDimensionPixelSize(R$styleable.f2431tn, 0);
            this.oz = typedArrayS.getInt(R$styleable.f2422s6, 1);
            this.qn = typedArrayS.getInt(R$styleable.f2365ig, 0);
            this.f2830ut = typedArrayS.getBoolean(R$styleable.f2447w3, false);
            this.f7 = typedArrayS.getBoolean(R$styleable.A, false);
            typedArrayS.recycle();
            Resources resources = getResources();
            this.fh = resources.getDimensionPixelSize(R$dimen.f2196c5);
            this.f2821hw = resources.getDimensionPixelSize(R$dimen.f2212s);
            tl();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        i9(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable zn znVar) {
        zn znVar2 = this.jz;
        if (znVar2 != null) {
            ta(znVar2);
        }
        this.jz = znVar;
        if (znVar != null) {
            zn(znVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        i9(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(f.n3.gv(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i9(view);
    }
}
