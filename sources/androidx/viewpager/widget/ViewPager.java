package androidx.viewpager.widget;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import d.y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public int f1028ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1029b;
    public Drawable c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public ClassLoader f1030co;
    public int ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1031d;
    public int d0;
    public int dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1032e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public boolean f1033eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public float f1034ej;
    public float en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PagerAdapter f1035f;
    public s f3;
    public float f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final gv f1036fb;
    public int fh;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f1037g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public int f1038g3;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public boolean f1039hw;
    public boolean j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public boolean f1040j5;
    public float jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1041k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public fb f1042kp;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public EdgeEffect f1043lc;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<View> f1044m;
    public int n;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public EdgeEffect f1045nf;
    public int o;
    public int o4;
    public boolean oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Parcelable f1046p;
    public int q9;
    public boolean qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1047r;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f1048ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public List<a> f1049rb;
    public int rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f1050s;
    public boolean s8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1051t;
    public float u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1052u0;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public int f1053ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList<gv> f1054v;
    public int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1055x;
    public VelocityTracker xg;
    public int y;
    public int y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public fb f1056yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public List<fb> f1057yg;
    public Scroller z;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    public static final int[] f1027bk = {R.attr.layout_gravity};
    public static final Comparator<gv> y4 = new y();
    public static final Interpolator tg = new n3();
    public static final c5 pz = new c5();

    public interface a {
        void y(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    public interface fb {
        void n3(int i);

        void y(int i, float f3, int i5);

        void zn(int i);
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface zn {
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public static boolean r(@NonNull View view) {
        return view.getClass().getAnnotation(zn.class) != null;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1040j5 != z) {
            this.f1040j5 = z;
        }
    }

    public boolean a(View view, boolean z, int i, int i5, int i8) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i5 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i8 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && a(childAt, true, i, i11 - childAt.getLeft(), i10 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public final boolean a8() {
        this.y5 = -1;
        wz();
        this.f1043lc.onRelease();
        this.f1045nf.onRelease();
        return this.f1043lc.isFinished() || this.f1045nf.isFinished();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i5) {
        gv gvVarMt;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() == 0 && (gvVarMt = mt(childAt)) != null && gvVarMt.n3 == this.f1051t) {
                    childAt.addFocusables(arrayList, i, i5);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i5 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        gv gvVarMt;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (gvVarMt = mt(childAt)) != null && gvVarMt.n3 == this.f1051t) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        v vVar = (v) layoutParams;
        boolean zR = vVar.y | r(view);
        vVar.y = zR;
        if (!this.f1039hw) {
            super.addView(view, i, layoutParams);
        } else {
            if (zR) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            vVar.gv = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public void b(int i, boolean z) {
        this.qn = false;
        k5(i, z, false);
    }

    public boolean c() {
        PagerAdapter pagerAdapter = this.f1035f;
        if (pagerAdapter == null || this.f1051t >= pagerAdapter.getCount() - 1) {
            return false;
        }
        b(this.f1051t + 1, true);
        return true;
    }

    public final int c5(int i, float f3, int i5, int i8) {
        if (Math.abs(i8) <= this.o4 || Math.abs(i5) <= this.dm) {
            i += (int) (f3 + (i >= this.f1051t ? 0.4f : 0.6f));
        } else if (i5 <= 0) {
            i++;
        }
        if (this.f1054v.size() <= 0) {
            return i;
        }
        return Math.max(this.f1054v.get(0).n3, Math.min(i, this.f1054v.get(r4.size() - 1).n3));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f1035f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f1031d)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1034ej));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof v) && super.checkLayoutParams(layoutParams);
    }

    public final gv co() {
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f4 = clientWidth > 0 ? this.n / clientWidth : 0.0f;
        gv gvVar = null;
        float f5 = 0.0f;
        int i5 = -1;
        int i8 = 0;
        boolean z = true;
        while (i8 < this.f1054v.size()) {
            gv gvVar2 = this.f1054v.get(i8);
            if (!z && gvVar2.n3 != (i = i5 + 1)) {
                gvVar2 = this.f1036fb;
                gvVar2.v = f3 + f5 + f4;
                gvVar2.n3 = i;
                gvVar2.gv = this.f1035f.getPageWidth(i);
                i8--;
            }
            gv gvVar3 = gvVar2;
            f3 = gvVar3.v;
            float f7 = gvVar3.gv + f3 + f4;
            if (!z && scrollX < f3) {
                return gvVar;
            }
            if (scrollX < f7 || i8 == this.f1054v.size() - 1) {
                return gvVar3;
            }
            int i10 = gvVar3.n3;
            float f8 = gvVar3.gv;
            i8++;
            z = false;
            i5 = i10;
            f5 = f8;
            gvVar = gvVar3;
        }
        return gvVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f1047r = true;
        if (this.z.isFinished() || !this.z.computeScrollOffset()) {
            fb(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.z.getCurrX();
        int currY = this.z.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!d0(currX)) {
                this.z.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ut.lc(this);
    }

    public final void d() {
        int i = 0;
        while (i < getChildCount()) {
            if (!getChildAt(i).getLayoutParams().y) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public final boolean d0(int i) {
        if (this.f1054v.size() == 0) {
            if (this.f1048ra) {
                return false;
            }
            this.s8 = false;
            i4(0, 0.0f, 0);
            if (this.s8) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        gv gvVarCo = co();
        int clientWidth = getClientWidth();
        int i5 = this.n;
        int i8 = clientWidth + i5;
        float f3 = clientWidth;
        int i10 = gvVarCo.n3;
        float f4 = ((i / f3) - gvVarCo.v) / (gvVarCo.gv + (i5 / f3));
        this.s8 = false;
        i4(i10, f4, (int) (i8 * f4));
        if (this.s8) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || xc(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        gv gvVarMt;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (gvVarMt = mt(childAt)) != null && gvVarMt.n3 == this.f1051t && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f1035f) != null && pagerAdapter.getCount() > 1)) {
            if (!this.f1043lc.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f1031d * width);
                this.f1043lc.setSize(height, width);
                zDraw = this.f1043lc.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f1045nf.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f1034ej + 1.0f)) * width2);
                this.f1045nf.setSize(height2, width2);
                zDraw |= this.f1045nf.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f1043lc.finish();
            this.f1045nf.finish();
        }
        if (zDraw) {
            ut.lc(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void ej(@NonNull fb fbVar) {
        List<fb> list = this.f1057yg;
        if (list != null) {
            list.remove(fbVar);
        }
    }

    public final void f(int i) {
        fb fbVar = this.f1056yc;
        if (fbVar != null) {
            fbVar.zn(i);
        }
        List<fb> list = this.f1057yg;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                fb fbVar2 = this.f1057yg.get(i5);
                if (fbVar2 != null) {
                    fbVar2.zn(i);
                }
            }
        }
        fb fbVar3 = this.f1042kp;
        if (fbVar3 != null) {
            fbVar3.zn(i);
        }
    }

    public final void f3(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.y5) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f7 = motionEvent.getX(i);
            this.y5 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.xg;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void fb(boolean z) {
        boolean z5 = this.f1052u0 == 2;
        if (z5) {
            setScrollingCacheEnabled(false);
            if (!this.z.isFinished()) {
                this.z.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.z.getCurrX();
                int currY = this.z.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        d0(currX);
                    }
                }
            }
        }
        this.qn = false;
        for (int i = 0; i < this.f1054v.size(); i++) {
            gv gvVar = this.f1054v.get(i);
            if (gvVar.zn) {
                gvVar.zn = false;
                z5 = true;
            }
        }
        if (z5) {
            if (z) {
                ut.nf(this, this.f1037g);
            } else {
                this.f1037g.run();
            }
        }
    }

    public final boolean fh(float f3) {
        boolean z;
        boolean z5;
        float f4 = this.f7 - f3;
        this.f7 = f3;
        float scrollX = getScrollX() + f4;
        float clientWidth = getClientWidth();
        float f5 = this.f1031d * clientWidth;
        float f7 = this.f1034ej * clientWidth;
        boolean z7 = false;
        gv gvVar = this.f1054v.get(0);
        ArrayList<gv> arrayList = this.f1054v;
        gv gvVar2 = arrayList.get(arrayList.size() - 1);
        if (gvVar.n3 != 0) {
            f5 = gvVar.v * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (gvVar2.n3 != this.f1035f.getCount() - 1) {
            f7 = gvVar2.v * clientWidth;
            z5 = false;
        } else {
            z5 = true;
        }
        if (scrollX < f5) {
            if (z) {
                this.f1043lc.onPull(Math.abs(f5 - scrollX) / clientWidth);
                z7 = true;
            }
            scrollX = f5;
        } else if (scrollX > f7) {
            if (z5) {
                this.f1045nf.onPull(Math.abs(scrollX - f7) / clientWidth);
                z7 = true;
            }
            scrollX = f7;
        }
        int i = (int) scrollX;
        this.f7 += scrollX - i;
        scrollTo(i, getScrollY());
        d0(i);
        return z7;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new v();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.f1035f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i5) {
        if (this.f1038g3 == 2) {
            i5 = (i - 1) - i5;
        }
        return this.f1044m.get(i5).getLayoutParams().a;
    }

    public int getCurrentItem() {
        return this.f1051t;
    }

    public int getOffscreenPageLimit() {
        return this.o;
    }

    public int getPageMargin() {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean gv(int r5) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.gv(int):boolean");
    }

    public final void hw() {
        if (this.f1038g3 != 0) {
            ArrayList<View> arrayList = this.f1044m;
            if (arrayList == null) {
                this.f1044m = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f1044m.add(getChildAt(i));
            }
            Collections.sort(this.f1044m, pz);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i4(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f1028ap
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$v r8 = (androidx.viewpager.widget.ViewPager.v) r8
            boolean r9 = r8.y
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.n3
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.i9(r12, r13, r14)
            r11.s8 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.i4(int, float, int):void");
    }

    public final void i9(int i, float f3, int i5) {
        fb fbVar = this.f1056yc;
        if (fbVar != null) {
            fbVar.y(i, f3, i5);
        }
        List<fb> list = this.f1057yg;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                fb fbVar2 = this.f1057yg.get(i8);
                if (fbVar2 != null) {
                    fbVar2.y(i, f3, i5);
                }
            }
        }
        fb fbVar3 = this.f1042kp;
        if (fbVar3 != null) {
            fbVar3.y(i, f3, i5);
        }
    }

    public void k5(int i, boolean z, boolean z5) {
        yt(i, z, z5, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[PHI: r7 r10 r15
      0x00cb: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mg(int r18) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mg(int):void");
    }

    public gv mt(View view) {
        for (int i = 0; i < this.f1054v.size(); i++) {
            gv gvVar = this.f1054v.get(i);
            if (this.f1035f.isViewFromObject(view, gvVar.y)) {
                return gvVar;
            }
        }
        return null;
    }

    public boolean n() {
        int i = this.f1051t;
        if (i <= 0) {
            return false;
        }
        b(i - 1, true);
        return true;
    }

    public void n3(@NonNull a aVar) {
        if (this.f1049rb == null) {
            this.f1049rb = new ArrayList();
        }
        this.f1049rb.add(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1048ra = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1037g);
        Scroller scroller = this.z;
        if (scroller != null && !scroller.isFinished()) {
            this.z.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f3;
        float f4;
        super.onDraw(canvas);
        if (this.n <= 0 || this.c == null || this.f1054v.size() <= 0 || this.f1035f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f5 = this.n / width;
        int i5 = 0;
        gv gvVar = this.f1054v.get(0);
        float f7 = gvVar.v;
        int size = this.f1054v.size();
        int i8 = gvVar.n3;
        int i10 = this.f1054v.get(size - 1).n3;
        while (i8 < i10) {
            while (true) {
                i = gvVar.n3;
                if (i8 <= i || i5 >= size) {
                    break;
                }
                i5++;
                gvVar = this.f1054v.get(i5);
            }
            if (i8 == i) {
                float f8 = gvVar.v;
                float f9 = gvVar.gv;
                f3 = (f8 + f9) * width;
                f7 = f8 + f9 + f5;
            } else {
                float pageWidth = this.f1035f.getPageWidth(i8);
                f3 = (f7 + pageWidth) * width;
                f7 += pageWidth + f5;
            }
            if (this.n + f3 > scrollX) {
                f4 = f5;
                this.c.setBounds(Math.round(f3), this.d0, Math.round(this.n + f3), this.fh);
                this.c.draw(canvas);
            } else {
                f4 = f5;
            }
            if (f3 > scrollX + r2) {
                return;
            }
            i8++;
            f5 = f4;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            a8();
            return false;
        }
        if (action != 0) {
            if (this.j) {
                return true;
            }
            if (this.oz) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.jz = x2;
            this.f7 = x2;
            float y = motionEvent.getY();
            this.u = y;
            this.en = y;
            this.y5 = motionEvent.getPointerId(0);
            this.oz = false;
            this.f1047r = true;
            this.z.computeScrollOffset();
            if (this.f1052u0 != 2 || Math.abs(this.z.getFinalX() - this.z.getCurrX()) <= this.rs) {
                fb(false);
                this.j = false;
            } else {
                this.z.abortAnimation();
                this.qn = false;
                rz();
                this.j = true;
                ud(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.y5;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x5 = motionEvent.getX(iFindPointerIndex);
                float f3 = x5 - this.f7;
                float fAbs = Math.abs(f3);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y3 - this.u);
                if (f3 != 0.0f && !x4(this.f7, f3) && a(this, false, (int) f3, (int) x5, (int) y3)) {
                    this.f7 = x5;
                    this.en = y3;
                    this.oz = true;
                    return false;
                }
                int i5 = this.f1041k;
                if (fAbs > i5 && fAbs * 0.5f > fAbs2) {
                    this.j = true;
                    ud(true);
                    setScrollState(1);
                    float f4 = this.jz;
                    float f5 = this.f1041k;
                    this.f7 = f3 > 0.0f ? f4 + f5 : f4 - f5;
                    this.en = y3;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i5) {
                    this.oz = true;
                }
                if (this.j && fh(x5)) {
                    ut.lc(this);
                }
            }
        } else if (action == 6) {
            f3(motionEvent);
        }
        if (this.xg == null) {
            this.xg = VelocityTracker.obtain();
        }
        this.xg.addMovement(motionEvent);
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i5;
        int i8;
        int i10;
        gv gvVarMt;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i8 = childCount;
            i5 = 0;
            i10 = 1;
        } else {
            i5 = childCount - 1;
            i8 = -1;
            i10 = -1;
        }
        while (i5 != i8) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (gvVarMt = mt(childAt)) != null && gvVarMt.n3 == this.f1051t && childAt.requestFocus(i, rect)) {
                return true;
            }
            i5 += i10;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.y());
        PagerAdapter pagerAdapter = this.f1035f;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.s, savedState.f);
            k5(savedState.fb, false, true);
        } else {
            this.w = savedState.fb;
            this.f1046p = savedState.s;
            this.f1030co = savedState.f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.fb = this.f1051t;
        PagerAdapter pagerAdapter = this.f1035f;
        if (pagerAdapter != null) {
            savedState.s = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i5, int i8, int i10) {
        super.onSizeChanged(i, i5, i8, i10);
        if (i != i8) {
            int i11 = this.n;
            ta(i, i8, i11, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public gv p(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return mt(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f1039hw) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void rz() {
        mg(this.f1051t);
    }

    public void s() {
        int count = this.f1035f.getCount();
        this.y = count;
        boolean z = this.f1054v.size() < (this.o * 2) + 1 && this.f1054v.size() < count;
        int iMax = this.f1051t;
        int i = 0;
        boolean z5 = false;
        while (i < this.f1054v.size()) {
            gv gvVar = this.f1054v.get(i);
            int itemPosition = this.f1035f.getItemPosition(gvVar.y);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f1054v.remove(i);
                    i--;
                    if (!z5) {
                        this.f1035f.startUpdate((ViewGroup) this);
                        z5 = true;
                    }
                    this.f1035f.destroyItem((ViewGroup) this, gvVar.n3, gvVar.y);
                    int i5 = this.f1051t;
                    if (i5 == gvVar.n3) {
                        iMax = Math.max(0, Math.min(i5, count - 1));
                    }
                } else {
                    int i8 = gvVar.n3;
                    if (i8 != itemPosition) {
                        if (i8 == this.f1051t) {
                            iMax = itemPosition;
                        }
                        gvVar.n3 = itemPosition;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z5) {
            this.f1035f.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f1054v, y4);
        if (z) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                v layoutParams = getChildAt(i10).getLayoutParams();
                if (!layoutParams.y) {
                    layoutParams.zn = 0.0f;
                }
            }
            k5(iMax, false, true);
            requestLayout();
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f1035f;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.f1035f.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f1054v.size(); i++) {
                gv gvVar = this.f1054v.get(i);
                this.f1035f.destroyItem((ViewGroup) this, gvVar.n3, gvVar.y);
            }
            this.f1035f.finishUpdate((ViewGroup) this);
            this.f1054v.clear();
            d();
            this.f1051t = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f1035f;
        this.f1035f = pagerAdapter;
        this.y = 0;
        if (pagerAdapter != null) {
            if (this.f3 == null) {
                this.f3 = new s(this);
            }
            this.f1035f.setViewPagerObserver(this.f3);
            this.qn = false;
            boolean z = this.f1048ra;
            this.f1048ra = true;
            this.y = this.f1035f.getCount();
            if (this.w >= 0) {
                this.f1035f.restoreState(this.f1046p, this.f1030co);
                k5(this.w, false, true);
                this.w = -1;
                this.f1046p = null;
                this.f1030co = null;
            } else if (z) {
                requestLayout();
            } else {
                rz();
            }
        }
        List<a> list = this.f1049rb;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f1049rb.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f1049rb.get(i5).y(this, pagerAdapter3, pagerAdapter);
        }
    }

    public void setCurrentItem(int i) {
        this.qn = false;
        k5(i, !this.f1048ra, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.o) {
            this.o = i;
            rz();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(fb fbVar) {
        this.f1056yc = fbVar;
    }

    public void setPageMargin(int i) {
        int i5 = this.n;
        this.n = i;
        int width = getWidth();
        ta(width, width, i, i5);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f1052u0 == i) {
            return;
        }
        this.f1052u0 = i;
        t(i);
    }

    public final void t(int i) {
        fb fbVar = this.f1056yc;
        if (fbVar != null) {
            fbVar.n3(i);
        }
        List<fb> list = this.f1057yg;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                fb fbVar2 = this.f1057yg.get(i5);
                if (fbVar2 != null) {
                    fbVar2.n3(i);
                }
            }
        }
        fb fbVar3 = this.f1042kp;
        if (fbVar3 != null) {
            fbVar3.n3(i);
        }
    }

    public final void ta(int i, int i5, int i8, int i10) {
        if (i5 > 0 && !this.f1054v.isEmpty()) {
            if (!this.z.isFinished()) {
                this.z.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i5 - getPaddingLeft()) - getPaddingRight()) + i10)) * (((i - getPaddingLeft()) - getPaddingRight()) + i8)), getScrollY());
                return;
            }
        }
        gv gvVarZ = z(this.f1051t);
        int iMin = (int) ((gvVarZ != null ? Math.min(gvVarZ.v, this.f1034ej) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            fb(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public float tl(float f3) {
        return (float) Math.sin((f3 - 0.5f) * 0.47123894f);
    }

    public final void ud(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void v(gv gvVar, int i, gv gvVar2) {
        int i5;
        int i8;
        gv gvVar3;
        gv gvVar4;
        int count = this.f1035f.getCount();
        int clientWidth = getClientWidth();
        float f3 = clientWidth > 0 ? this.n / clientWidth : 0.0f;
        if (gvVar2 != null) {
            int i10 = gvVar2.n3;
            int i11 = gvVar.n3;
            if (i10 < i11) {
                float pageWidth = gvVar2.v + gvVar2.gv + f3;
                int i12 = i10 + 1;
                int i13 = 0;
                while (i12 <= gvVar.n3 && i13 < this.f1054v.size()) {
                    gv gvVar5 = this.f1054v.get(i13);
                    while (true) {
                        gvVar4 = gvVar5;
                        if (i12 <= gvVar4.n3 || i13 >= this.f1054v.size() - 1) {
                            break;
                        }
                        i13++;
                        gvVar5 = this.f1054v.get(i13);
                    }
                    while (i12 < gvVar4.n3) {
                        pageWidth += this.f1035f.getPageWidth(i12) + f3;
                        i12++;
                    }
                    gvVar4.v = pageWidth;
                    pageWidth += gvVar4.gv + f3;
                    i12++;
                }
            } else if (i10 > i11) {
                int size = this.f1054v.size() - 1;
                float pageWidth2 = gvVar2.v;
                while (true) {
                    i10--;
                    if (i10 < gvVar.n3 || size < 0) {
                        break;
                    }
                    gv gvVar6 = this.f1054v.get(size);
                    while (true) {
                        gvVar3 = gvVar6;
                        if (i10 >= gvVar3.n3 || size <= 0) {
                            break;
                        }
                        size--;
                        gvVar6 = this.f1054v.get(size);
                    }
                    while (i10 > gvVar3.n3) {
                        pageWidth2 -= this.f1035f.getPageWidth(i10) + f3;
                        i10--;
                    }
                    pageWidth2 -= gvVar3.gv + f3;
                    gvVar3.v = pageWidth2;
                }
            }
        }
        int size2 = this.f1054v.size();
        float pageWidth3 = gvVar.v;
        int i14 = gvVar.n3;
        int i15 = i14 - 1;
        this.f1031d = i14 == 0 ? pageWidth3 : -3.4028235E38f;
        int i16 = count - 1;
        this.f1034ej = i14 == i16 ? (gvVar.gv + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i17 = i - 1;
        while (i17 >= 0) {
            gv gvVar7 = this.f1054v.get(i17);
            while (true) {
                i8 = gvVar7.n3;
                if (i15 <= i8) {
                    break;
                }
                pageWidth3 -= this.f1035f.getPageWidth(i15) + f3;
                i15--;
            }
            pageWidth3 -= gvVar7.gv + f3;
            gvVar7.v = pageWidth3;
            if (i8 == 0) {
                this.f1031d = pageWidth3;
            }
            i17--;
            i15--;
        }
        float pageWidth4 = gvVar.v + gvVar.gv + f3;
        int i18 = gvVar.n3 + 1;
        int i19 = i + 1;
        while (i19 < size2) {
            gv gvVar8 = this.f1054v.get(i19);
            while (true) {
                i5 = gvVar8.n3;
                if (i18 >= i5) {
                    break;
                }
                pageWidth4 += this.f1035f.getPageWidth(i18) + f3;
                i18++;
            }
            if (i5 == i16) {
                this.f1034ej = (gvVar8.gv + pageWidth4) - 1.0f;
            }
            gvVar8.v = pageWidth4;
            pageWidth4 += gvVar8.gv + f3;
            i19++;
            i18++;
        }
        this.f1032e = false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }

    public void vl(int i, int i5, int i8) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.z;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f1047r ? this.z.getCurrX() : this.z.getStartX();
            this.z.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i10 = scrollX;
        int scrollY = getScrollY();
        int i11 = i - i10;
        int i12 = i5 - scrollY;
        if (i11 == 0 && i12 == 0) {
            fb(false);
            rz();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i13 = clientWidth / 2;
        float f3 = clientWidth;
        float f4 = i13;
        float fTl = f4 + (tl(Math.min(1.0f, (Math.abs(i11) * 1.0f) / f3)) * f4);
        int iAbs = Math.abs(i8);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fTl / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i11) / ((f3 * this.f1035f.getPageWidth(this.f1051t)) + this.n)) + 1.0f) * 100.0f), 600);
        this.f1047r = false;
        this.z.startScroll(i10, scrollY, i11, i12, iMin);
        ut.lc(this);
    }

    public final Rect w(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final void wz() {
        this.j = false;
        this.oz = false;
        VelocityTracker velocityTracker = this.xg;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.xg = null;
        }
    }

    public final void x(int i, boolean z, int i5, boolean z5) {
        gv gvVarZ = z(i);
        int clientWidth = gvVarZ != null ? (int) (getClientWidth() * Math.max(this.f1031d, Math.min(gvVarZ.v, this.f1034ej))) : 0;
        if (z) {
            vl(clientWidth, 0, i5);
            if (z5) {
                f(i);
                return;
            }
            return;
        }
        if (z5) {
            f(i);
        }
        fb(false);
        scrollTo(clientWidth, 0);
        d0(clientWidth);
    }

    public final boolean x4(float f3, float f4) {
        return (f3 < ((float) this.q9) && f4 > 0.0f) || (f3 > ((float) (getWidth() - this.q9)) && f4 < 0.0f);
    }

    public boolean xc(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? n() : gv(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? c() : gv(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return gv(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return gv(1);
                }
            }
        }
        return false;
    }

    public gv y(int i, int i5) {
        gv gvVar = new gv();
        gvVar.n3 = i;
        gvVar.y = this.f1035f.instantiateItem((ViewGroup) this, i);
        gvVar.gv = this.f1035f.getPageWidth(i);
        if (i5 < 0 || i5 >= this.f1054v.size()) {
            this.f1054v.add(gvVar);
        } else {
            this.f1054v.add(i5, gvVar);
        }
        return gvVar;
    }

    public void yt(int i, boolean z, boolean z5, int i5) {
        PagerAdapter pagerAdapter = this.f1035f;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z5 && this.f1051t == i && this.f1054v.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f1035f.getCount()) {
            i = this.f1035f.getCount() - 1;
        }
        int i8 = this.o;
        int i10 = this.f1051t;
        if (i > i10 + i8 || i < i10 - i8) {
            for (int i11 = 0; i11 < this.f1054v.size(); i11++) {
                this.f1054v.get(i11).zn = true;
            }
        }
        boolean z7 = this.f1051t != i;
        if (!this.f1048ra) {
            mg(i);
            x(i, z, i5, z7);
        } else {
            this.f1051t = i;
            if (z7) {
                f(i);
            }
            requestLayout();
        }
    }

    public gv z(int i) {
        for (int i5 = 0; i5 < this.f1054v.size(); i5++) {
            gv gvVar = this.f1054v.get(i5);
            if (gvVar.n3 == i) {
                return gvVar;
            }
        }
        return null;
    }

    public void z6(@NonNull a aVar) {
        List<a> list = this.f1049rb;
        if (list != null) {
            list.remove(aVar);
        }
    }

    public void zn(@NonNull fb fbVar) {
        if (this.f1057yg == null) {
            this.f1057yg = new ArrayList();
        }
        this.f1057yg.add(fbVar);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new v(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(y.getDrawable(getContext(), i));
    }
}
