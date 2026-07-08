package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.R$attr;
import androidx.fragment.app.FragmentTransaction;
import com.google.protobuf.Reader;
import o.ud;
import o.x;
import qn.c;
import qn.d0;
import qn.fh;
import qn.mg;
import qn.ta;
import qn.ut;
import ut.s;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements mg, d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f795b;
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f796co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f797d;
    public int d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f798ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public EdgeEffect f799f;
    public VelocityTracker f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Rect f800fb;
    public int fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public int f801hw;
    public final fh j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public int f802j5;
    public boolean n;
    public final ta o;
    public float oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f803p;
    public SavedState qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public OverScroller f805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public EdgeEffect f806t;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public zn f807ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f808v;
    public int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f809x;
    public final float y;
    public View z;
    public static final float q9 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y f794k = new y();
    public static final int[] f7 = {R.attr.fillViewport};

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();
        public int y;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.y + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.y);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.y = parcel.readInt();
        }
    }

    public static class n3 {
        public static boolean y(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public static class y extends qn.y {
        public void a(View view, AccessibilityEvent accessibilityEvent) {
            super.a(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            x.y(accessibilityEvent, nestedScrollView.getScrollX());
            x.n3(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void fb(View view, ud udVar) {
            int scrollRange;
            super.fb(view, udVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            udVar.e(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            udVar.wf(true);
            if (nestedScrollView.getScrollY() > 0) {
                udVar.n3(ud.y.mt);
                udVar.n3(ud.y.rz);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                udVar.n3(ud.y.p);
                udVar.n3(ud.y.ta);
            }
        }

        public boolean i9(View view, int i, Bundle bundle) {
            if (super.i9(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.ut(0, iMax, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.ut(0, iMin, true);
            return true;
        }
    }

    public interface zn {
        void y(@NonNull NestedScrollView nestedScrollView, int i, int i5, int i8, int i10);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.zn);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.oz == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.oz = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.oz;
    }

    public static boolean ta(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && ta((View) parent, view2);
    }

    public static int v(int i, int i5, int i8) {
        if (i5 >= i8 || i < 0) {
            return 0;
        }
        return i5 + i > i8 ? i8 - i5 : i;
    }

    public int a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i8 = rect.bottom;
        if (i8 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i8 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public boolean a8(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f800fb.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f800fb;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f800fb.top = getScrollY() - height;
            Rect rect2 = this.f800fb;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f800fb;
        int i5 = rect3.top;
        int i8 = height + i5;
        rect3.bottom = i8;
        return yt(i, i5, i8);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f799f
            float r0 = ut.s.n3(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f799f
            float r4 = -r4
            float r4 = ut.s.gv(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f799f
            float r5 = ut.s.n3(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f799f
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f806t
            float r0 = ut.s.n3(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f806t
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = ut.s.gv(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f806t
            float r5 = ut.s.n3(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f806t
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L64
            r3.invalidate()
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.b(int, float):int");
    }

    public final void c() {
        VelocityTracker velocityTracker = this.f3;
        if (velocityTracker == null) {
            this.f3 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public void c5(@NonNull View view, @NonNull View view2, int i, int i5) {
        this.o.zn(view, view2, i, i5);
        q9(2, i5);
    }

    public boolean co(@NonNull KeyEvent keyEvent) {
        this.f800fb.setEmpty();
        if (!gv()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? x4(33) : n3(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? x4(130) : n3(130);
        }
        if (keyCode == 62) {
            a8(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return x4(33);
        }
        if (keyCode == 93) {
            return x4(130);
        }
        if (keyCode == 122) {
            a8(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        a8(130);
        return false;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f805s.isFinished()) {
            return;
        }
        this.f805s.computeScrollOffset();
        int currY = this.f805s.getCurrY();
        int iFb = fb(currY - this.f802j5);
        this.f802j5 = currY;
        int[] iArr = this.f795b;
        iArr[1] = 0;
        s(0, iFb, iArr, null, 1);
        int i = iFb - this.f795b[1];
        int scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY = getScrollY();
            ud(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i5 = i - scrollY2;
            int[] iArr2 = this.f795b;
            iArr2[1] = 0;
            t(0, scrollY2, 0, i5, this.f809x, 1, iArr2);
            i = i5 - this.f795b[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i < 0) {
                    if (this.f799f.isFinished()) {
                        this.f799f.onAbsorb((int) this.f805s.getCurrVelocity());
                    }
                } else if (this.f806t.isFinished()) {
                    this.f806t.onAbsorb((int) this.f805s.getCurrVelocity());
                }
            }
            y();
        }
        if (this.f805s.isFinished()) {
            f7(1);
        } else {
            ut.lc(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public final boolean d(View view, int i, int i5) {
        view.getDrawingRect(this.f800fb);
        offsetDescendantRectToMyCoords(view, this.f800fb);
        return this.f800fb.bottom + i >= getScrollY() && this.f800fb.top - i <= getScrollY() + i5;
    }

    public final void d0() {
        this.f805s = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.d0 = viewConfiguration.getScaledTouchSlop();
        this.fh = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f797d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || co(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z) {
        return this.j.y(f3, f4, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return this.j.n3(f3, f4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i5, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return s(i, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i5, int i8, int i10, @Nullable int[] iArr) {
        return this.j.a(i, i5, i8, i10, iArr);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f799f.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (n3.y(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (n3.y(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f799f.setSize(width, height);
            if (this.f799f.draw(canvas)) {
                ut.lc(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f806t.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (n3.y(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (n3.y(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f806t.setSize(width2, height2);
        if (this.f806t.draw(canvas)) {
            ut.lc(this);
        }
        canvas.restoreToCount(iSave2);
    }

    public final void ej(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f798ej) {
            int i = actionIndex == 0 ? 1 : 0;
            this.w = (int) motionEvent.getY(i);
            this.f798ej = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void f(@NonNull View view, int i, int i5, @NonNull int[] iArr, int i8) {
        s(i, i5, iArr, null, i8);
    }

    public boolean f3(int i) {
        return this.j.t(i);
    }

    public void f7(int i) {
        this.j.co(i);
    }

    public int fb(int i) {
        int height = getHeight();
        if (i > 0 && s.n3(this.f799f) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * s.gv(this.f799f, ((-i) * 4.0f) / height, 0.5f));
            if (iRound != i) {
                this.f799f.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || s.n3(this.f806t) == 0.0f) {
            return i;
        }
        float f3 = height;
        int iRound2 = Math.round((f3 / 4.0f) * s.gv(this.f806t, (i * 4.0f) / f3, 0.5f));
        if (iRound2 != i) {
            this.f806t.finish();
        }
        return i - iRound2;
    }

    public final void fh() {
        if (this.f3 == null) {
            this.f3 = VelocityTracker.obtain();
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.o.y();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final boolean gv() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return f3(0);
    }

    public final void hw(View view) {
        view.getDrawingRect(this.f800fb);
        offsetDescendantRectToMyCoords(view, this.f800fb);
        int iA = a(this.f800fb);
        if (iA != 0) {
            scrollBy(0, iA);
        }
    }

    public final float i4(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.y * 0.015f));
        float f3 = q9;
        return (float) (((double) (this.y * 0.015f)) * Math.exp((((double) f3) / (((double) f3) - 1.0d)) * dLog));
    }

    public void i9(@NonNull View view, int i) {
        this.o.v(view, i);
        f7(i);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.j.tl();
    }

    public final void j(int i, int i5, int i8, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f808v > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f805s.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, i8);
            k5(z);
        } else {
            if (!this.f805s.isFinished()) {
                y();
            }
            scrollBy(i, i5);
        }
        this.f808v = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean j5(Rect rect, boolean z) {
        int iA = a(rect);
        boolean z5 = iA != 0;
        if (z5) {
            if (z) {
                scrollBy(0, iA);
            } else {
                o(0, iA);
            }
        }
        return z5;
    }

    public final boolean k(MotionEvent motionEvent) {
        boolean z;
        if (s.n3(this.f799f) != 0.0f) {
            s.gv(this.f799f, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (s.n3(this.f806t) == 0.0f) {
            return z;
        }
        s.gv(this.f806t, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void k5(boolean z) {
        if (z) {
            q9(2, 1);
        } else {
            f7(1);
        }
        this.f802j5 = getScrollY();
        ut.lc(this);
    }

    @Override // android.view.ViewGroup
    public void measureChild(@NonNull View view, int i, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i5, int i8, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean mg(View view) {
        return !d(view, 0, getHeight());
    }

    public final void mt() {
        this.f798ej = -1;
        this.f804r = false;
        x();
        f7(0);
        this.f799f.onRelease();
        this.f806t.onRelease();
    }

    public final boolean n(int i, int i5) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i5 >= childAt.getTop() - scrollY && i5 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    public boolean n3(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !d(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            vl(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f800fb);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f800fb);
            vl(a(this.f800fb), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && mg(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final void o(int i, int i5) {
        j(i, i5, 250, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f796co = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        float axisValue;
        int width;
        if (motionEvent.getAction() != 8 || this.f804r) {
            return false;
        }
        if (c.y(motionEvent, 2)) {
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if (c.y(motionEvent, 4194304)) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            axisValue = axisValue2;
        } else {
            axisValue = 0.0f;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        vl(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, c.y(motionEvent, FragmentTransaction.TRANSIT_FRAGMENT_CLOSE));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        int measuredHeight = 0;
        this.f803p = false;
        View view = this.z;
        if (view != null && ta(view, this)) {
            hw(this.z);
        }
        this.z = null;
        if (!this.f796co) {
            if (this.qn != null) {
                scrollTo(getScrollX(), this.qn.y);
                this.qn = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i10 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iV = v(scrollY, paddingTop, measuredHeight);
            if (iV != scrollY) {
                scrollTo(getScrollX(), iV);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f796co = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (this.n && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f3, float f4, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        r((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f3, float f4) {
        return dispatchNestedPreFling(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(@NonNull View view, int i, int i5, @NonNull int[] iArr) {
        f(view, i, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(@NonNull View view, int i, int i5, int i8, int i10) {
        z6(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        c5(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i5, boolean z, boolean z5) {
        super.scrollTo(i, i5);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || mg(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.qn = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.y = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i5, int i8, int i10) {
        super.onScrollChanged(i, i5, i8, i10);
        zn znVar = this.f807ut;
        if (znVar != null) {
            znVar.y(this, i, i5, i8, i10);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i5, int i8, int i10) {
        super.onSizeChanged(i, i5, i8, i10);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !d(viewFindFocus, 0, i10)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f800fb);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f800fb);
        w(a(this.f800fb));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return xc(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(@NonNull View view) {
        i9(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        fh();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f801hw = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f801hw);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3;
                velocityTracker.computeCurrentVelocity(1000, this.f797d);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f798ej);
                if (Math.abs(yVelocity) >= this.fh) {
                    if (!p(yVelocity)) {
                        int i = -yVelocity;
                        float f3 = i;
                        if (!dispatchNestedPreFling(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            r(i);
                        }
                    }
                } else if (this.f805s.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ut.lc(this);
                }
                mt();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f798ej);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f798ej + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.w - y3;
                    int iB = i5 - b(i5, motionEvent.getX(iFindPointerIndex));
                    if (!this.f804r && Math.abs(iB) > this.d0) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f804r = true;
                        iB = iB > 0 ? iB - this.d0 : iB + this.d0;
                    }
                    if (this.f804r) {
                        int iVl = vl(iB, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.w = y3 - iVl;
                        this.f801hw += iVl;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f804r && getChildCount() > 0 && this.f805s.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ut.lc(this);
                }
                mt();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.w = (int) motionEvent.getY(actionIndex);
                this.f798ej = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                ej(motionEvent);
                this.w = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f798ej));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f804r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f805s.isFinished()) {
                y();
            }
            rz((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f3;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void oz(int i, int i5, int i8, boolean z) {
        j(i - getScrollX(), i5 - getScrollY(), i8, z);
    }

    public final boolean p(int i) {
        if (s.n3(this.f799f) != 0.0f) {
            if (qn(this.f799f, i)) {
                this.f799f.onAbsorb(i);
            } else {
                r(-i);
            }
        } else {
            if (s.n3(this.f806t) == 0.0f) {
                return false;
            }
            int i5 = -i;
            if (qn(this.f806t, i5)) {
                this.f806t.onAbsorb(i5);
            } else {
                r(i5);
            }
        }
        return true;
    }

    public boolean q9(int i, int i5) {
        return this.j.p(i, i5);
    }

    public final boolean qn(@NonNull EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return i4(-i) < s.n3(edgeEffect) * ((float) getHeight());
    }

    public void r(int i) {
        if (getChildCount() > 0) {
            this.f805s.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Reader.READ_DONE, 0, 0);
            k5(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f803p) {
            this.z = view2;
        } else {
            hw(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return j5(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f803p = true;
        super.requestLayout();
    }

    public final void rz(int i, int i5) {
        this.w = i;
        this.f798ej = i5;
        q9(2, 0);
    }

    public boolean s(int i, int i5, @Nullable int[] iArr, @Nullable int[] iArr2, int i8) {
        return this.j.gv(i, i5, iArr, iArr2, i8);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iV = v(i, width, width2);
            int iV2 = v(i5, height, height2);
            if (iV == getScrollX() && iV2 == getScrollY()) {
                return;
            }
            super.scrollTo(iV, iV2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.n) {
            this.n = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.j.wz(z);
    }

    public void setOnScrollChangeListener(@Nullable zn znVar) {
        this.f807ut = znVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.c = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return q9(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        f7(0);
    }

    public void t(int i, int i5, int i8, int i10, @Nullable int[] iArr, int i11, @NonNull int[] iArr2) {
        this.j.v(i, i5, i8, i10, iArr, i11, iArr2);
    }

    public void tl(@NonNull View view, int i, int i5, int i8, int i10, int i11, @NonNull int[] iArr) {
        z6(i10, i11, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ud(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.f3(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f805s
            r8 = 0
            int r9 = r12.getScrollRange()
            r10 = 0
            r11 = 0
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r10
            r17 = r11
            r18 = r8
            r19 = r9
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.ud(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public void ut(int i, int i5, boolean z) {
        oz(i, i5, 250, z);
    }

    public final int vl(int i, int i5, int i8, boolean z) {
        int i10;
        int i11;
        if (i8 == 1) {
            q9(2, i8);
        }
        boolean z5 = false;
        if (s(0, i, this.f795b, this.f809x, i8)) {
            i10 = i - this.f795b[1];
            i11 = this.f809x[1];
        } else {
            i10 = i;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z7 = zn() && !z;
        boolean z8 = ud(0, i10, 0, scrollY, 0, scrollRange, 0, 0, true) && !f3(i8);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f795b;
        iArr[1] = 0;
        t(0, scrollY2, 0, i10 - scrollY2, this.f809x, i8, iArr);
        int i12 = i11 + this.f809x[1];
        int i13 = i10 - this.f795b[1];
        int i14 = scrollY + i13;
        if (i14 < 0) {
            if (z7) {
                s.gv(this.f799f, (-i13) / getHeight(), i5 / getWidth());
                if (!this.f806t.isFinished()) {
                    this.f806t.onRelease();
                }
            }
        } else if (i14 > scrollRange && z7) {
            s.gv(this.f806t, i13 / getHeight(), 1.0f - (i5 / getWidth()));
            if (!this.f799f.isFinished()) {
                this.f799f.onRelease();
            }
        }
        if (this.f799f.isFinished() && this.f806t.isFinished()) {
            z5 = z8;
        } else {
            ut.lc(this);
        }
        if (z5 && i8 == 0) {
            this.f3.clear();
        }
        if (i8 == 1) {
            f7(i8);
            this.f799f.onRelease();
            this.f806t.onRelease();
        }
        return i12;
    }

    public final void w(int i) {
        if (i != 0) {
            if (this.c) {
                o(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public void wz(@NonNull View view, int i, int i5, int i8, int i10, int i11) {
        z6(i10, i11, null);
    }

    public final void x() {
        VelocityTracker velocityTracker = this.f3;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3 = null;
        }
    }

    public boolean x4(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f800fb;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f800fb.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f800fb;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f800fb;
        return yt(i, rect3.top, rect3.bottom);
    }

    public boolean xc(@NonNull View view, @NonNull View view2, int i, int i5) {
        return (i & 2) != 0;
    }

    public final void y() {
        this.f805s.abortAnimation();
        f7(1);
    }

    public final boolean yt(int i, int i5, int i8) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z = false;
        boolean z5 = i == 33;
        View viewZ = z(z5, i5, i8);
        if (viewZ == null) {
            viewZ = this;
        }
        if (i5 < scrollY || i8 > i10) {
            vl(z5 ? i5 - scrollY : i8 - i10, 0, 1, true);
            z = true;
        }
        if (viewZ != findFocus()) {
            viewZ.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View z(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.z(boolean, int, int):android.view.View");
    }

    public final void z6(int i, int i5, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.j.v(0, scrollY2, 0, i - scrollY2, (int[]) null, i5, iArr);
    }

    public final boolean zn() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f800fb = new Rect();
        this.f803p = true;
        this.f796co = false;
        this.z = null;
        this.f804r = false;
        this.c = true;
        this.f798ej = -1;
        this.f809x = new int[2];
        this.f795b = new int[2];
        this.f799f = s.y(context, attributeSet);
        this.f806t = s.y(context, attributeSet);
        this.y = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        d0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.o = new ta(this);
        this.j = new fh(this);
        setNestedScrollingEnabled(true);
        ut.g3(this, f794k);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
