package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.R$styleable;
import o.b;
import o.ud;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public static boolean f1063hw = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f1064b;
    public cs.n3 c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public Parcelable f1065co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1066d;
    public androidx.viewpager2.widget.gv d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f1067ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1068f;
    public androidx.viewpager2.widget.v f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public androidx.viewpager2.widget.y f1069fb;
    public RecyclerView.tl fh;
    public androidx.viewpager2.widget.y n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1070p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.tl f1071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView.i9 f1073t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f1074v;
    public LinearLayoutManager w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1075x;
    public final Rect y;
    public RecyclerView z;

    public class a extends v {
        public a() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public boolean f(int i) {
            if (n3(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public boolean gv() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void i9(@NonNull ud udVar) {
            if (ViewPager2.this.v()) {
                return;
            }
            udVar.dm(ud.y.mt);
            udVar.dm(ud.y.p);
            udVar.wf(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public boolean n3(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.v();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public CharSequence wz() {
            if (gv()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class c5 {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f3, int i5) {
        }

        public void onPageSelected(int i) {
        }
    }

    public interface f {
        void transformPage(@NonNull View view, float f3);
    }

    public static abstract class fb extends RecyclerView.i9 {
        public fb() {
        }

        public abstract void onChanged();

        public final void onItemRangeChanged(int i, int i5) {
            onChanged();
        }

        public final void onItemRangeInserted(int i, int i5) {
            onChanged();
        }

        public final void onItemRangeMoved(int i, int i5, int i8) {
            onChanged();
        }

        public final void onItemRangeRemoved(int i, int i5) {
            onChanged();
        }

        public /* synthetic */ fb(y yVar) {
            this();
        }

        public final void onItemRangeChanged(int i, int i5, @Nullable Object obj) {
            onChanged();
        }
    }

    public class gv implements RecyclerView.mt {
        public gv() {
        }

        public void n3(@NonNull View view) {
            RecyclerView.p layoutParams = view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        public void y(@NonNull View view) {
        }
    }

    public class i9 extends v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public RecyclerView.i9 f1078gv;
        public final b n3;
        public final b zn;

        public i9() {
            super(ViewPager2.this, null);
            this.n3 = new y(this);
            this.zn = new n3(this);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void a(@Nullable RecyclerView.s<?> sVar) {
            if (sVar != null) {
                sVar.unregisterAdapterDataObserver(this.f1078gv);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void c5(AccessibilityNodeInfo accessibilityNodeInfo) {
            z(accessibilityNodeInfo);
            r(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void co() {
            i4();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public String fb() {
            if (y()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        public void i4() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            ut.e(viewPager2, R.id.accessibilityActionPageLeft);
            ut.e(viewPager2, R.id.accessibilityActionPageRight);
            ut.e(viewPager2, R.id.accessibilityActionPageUp);
            ut.e(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.v()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f1072s < itemCount - 1) {
                    ut.ap(viewPager2, new ud.y(R.id.accessibilityActionPageDown, (CharSequence) null), (CharSequence) null, this.n3);
                }
                if (ViewPager2.this.f1072s > 0) {
                    ut.ap(viewPager2, new ud.y(R.id.accessibilityActionPageUp, (CharSequence) null), (CharSequence) null, this.zn);
                    return;
                }
                return;
            }
            boolean zGv = ViewPager2.this.gv();
            int i5 = zGv ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
            if (zGv) {
                i = R.id.accessibilityActionPageRight;
            }
            if (ViewPager2.this.f1072s < itemCount - 1) {
                ut.ap(viewPager2, new ud.y(i5, (CharSequence) null), (CharSequence) null, this.n3);
            }
            if (ViewPager2.this.f1072s > 0) {
                ut.ap(viewPager2, new ud.y(i, (CharSequence) null), (CharSequence) null, this.zn);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void mt() {
            i4();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void p() {
            i4();
        }

        public final void r(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.s adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.v()) {
                return;
            }
            if (ViewPager2.this.f1072s > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f1072s < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void s(@NonNull androidx.viewpager2.widget.y yVar, @NonNull RecyclerView recyclerView) {
            ut.o0(recyclerView, 2);
            this.f1078gv = new zn(this);
            if (ut.rz(ViewPager2.this) == 0) {
                ut.o0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public boolean t(int i, Bundle bundle) {
            if (!zn(i, bundle)) {
                throw new IllegalStateException();
            }
            x4(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void tl() {
            i4();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void v(@Nullable RecyclerView.s<?> sVar) {
            i4();
            if (sVar != null) {
                sVar.registerAdapterDataObserver(this.f1078gv);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void w() {
            i4();
        }

        public void x4(int i) {
            if (ViewPager2.this.v()) {
                ViewPager2.this.f(i, true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public void xc(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(fb());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public boolean y() {
            return true;
        }

        public final void z(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() == null) {
                itemCount = 0;
            } else {
                if (ViewPager2.this.getOrientation() != 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 0;
                    ud.w2(accessibilityNodeInfo).ap(ud.a.y(itemCount, itemCount2, false, 0));
                }
                itemCount = ViewPager2.this.getAdapter().getItemCount();
            }
            itemCount2 = 0;
            ud.w2(accessibilityNodeInfo).ap(ud.a.y(itemCount, itemCount2, false, 0));
        }

        @Override // androidx.viewpager2.widget.ViewPager2.v
        public boolean zn(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }
    }

    public class n3 extends c5 {
        public n3() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c5
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ViewPager2.this.xc();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c5
        public void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f1072s != i) {
                viewPager2.f1072s = i;
                viewPager2.f1064b.p();
            }
        }
    }

    public class s extends LinearLayoutManager {
        public s(Context context) {
            super(context);
        }

        public void calculateExtraLayoutSpace(@NonNull RecyclerView.fh fhVar, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(fhVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.i4 i4Var, @NonNull RecyclerView.fh fhVar, @NonNull ud udVar) {
            super/*androidx.recyclerview.widget.RecyclerView.w*/.onInitializeAccessibilityNodeInfo(i4Var, fhVar, udVar);
            ViewPager2.this.f1064b.i9(udVar);
        }

        public boolean performAccessibilityAction(@NonNull RecyclerView.i4 i4Var, @NonNull RecyclerView.fh fhVar, int i, @Nullable Bundle bundle) {
            return ViewPager2.this.f1064b.n3(i) ? ViewPager2.this.f1064b.f(i) : super/*androidx.recyclerview.widget.RecyclerView.w*/.performAccessibilityAction(i4Var, fhVar, i, bundle);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z5) {
            return false;
        }
    }

    public class t extends androidx.recyclerview.widget.tl {
        public t() {
        }

        @Nullable
        public View findSnapView(RecyclerView.w wVar) {
            if (ViewPager2.this.zn()) {
                return null;
            }
            return super.findSnapView(wVar);
        }
    }

    public class tl extends RecyclerView {
        public tl(@NonNull Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f1064b.gv() ? ViewPager2.this.f1064b.wz() : super.getAccessibilityClassName();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            ViewPager2.super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f1072s);
            accessibilityEvent.setToIndex(ViewPager2.this.f1072s);
            ViewPager2.this.f1064b.xc(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.v() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.v() && super.onTouchEvent(motionEvent);
        }
    }

    public abstract class v {
        public v() {
        }

        public void a(@Nullable RecyclerView.s<?> sVar) {
        }

        public void c5(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void co() {
        }

        public boolean f(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        public String fb() {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean gv() {
            return false;
        }

        public void mt() {
        }

        public boolean n3(int i) {
            return false;
        }

        public void p() {
        }

        public void s(@NonNull androidx.viewpager2.widget.y yVar, @NonNull RecyclerView recyclerView) {
        }

        public boolean t(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void tl() {
        }

        public void v(@Nullable RecyclerView.s<?> sVar) {
        }

        public void w() {
        }

        public CharSequence wz() {
            throw new IllegalStateException("Not implemented.");
        }

        public void xc(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public boolean y() {
            return false;
        }

        public boolean zn(int i, Bundle bundle) {
            return false;
        }

        public /* synthetic */ v(ViewPager2 viewPager2, y yVar) {
            this();
        }

        public void i9(@NonNull ud udVar) {
        }
    }

    public static class wz implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final RecyclerView f1080v;
        public final int y;

        public wz(int i, RecyclerView recyclerView) {
            this.y = i;
            this.f1080v = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1080v.smoothScrollToPosition(this.y);
        }
    }

    public class y extends fb {
        public y() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.fb
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f1068f = true;
            viewPager2.f3.i9();
        }
    }

    public class zn extends c5 {
        public zn() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c5
        public void onPageSelected(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.z.requestFocus(2);
            }
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.y = new Rect();
        this.f1074v = new Rect();
        this.f1069fb = new androidx.viewpager2.widget.y(3);
        this.f1068f = false;
        this.f1073t = new y();
        this.f1070p = -1;
        this.fh = null;
        this.f1066d = false;
        this.f1067ej = true;
        this.f1075x = -1;
        n3(context, null);
    }

    public final void a(@Nullable RecyclerView.s<?> sVar) {
        if (sVar != null) {
            sVar.registerAdapterDataObserver(this.f1073t);
        }
    }

    public final void c5() {
        le.zn adapter;
        if (this.f1070p == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f1065co;
        if (parcelable != null) {
            if (adapter instanceof le.zn) {
                adapter.zn(parcelable);
            }
            this.f1065co = null;
        }
        int iMax = Math.max(0, Math.min(this.f1070p, adapter.getItemCount() - 1));
        this.f1072s = iMax;
        this.f1070p = -1;
        this.z.scrollToPosition(iMax);
        this.f1064b.tl();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.z.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.z.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).y;
            sparseArray.put(this.z.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c5();
    }

    public void f(int i, boolean z) {
        RecyclerView.s adapter = getAdapter();
        if (adapter == null) {
            if (this.f1070p != -1) {
                this.f1070p = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        if (iMin == this.f1072s && this.f3.s()) {
            return;
        }
        int i5 = this.f1072s;
        if (iMin == i5 && z) {
            return;
        }
        double dV = i5;
        this.f1072s = iMin;
        this.f1064b.p();
        if (!this.f3.s()) {
            dV = this.f3.v();
        }
        this.f3.f(iMin, z);
        if (!z) {
            this.z.scrollToPosition(iMin);
            return;
        }
        double d4 = iMin;
        if (Math.abs(d4 - dV) <= 3.0d) {
            this.z.smoothScrollToPosition(iMin);
            return;
        }
        this.z.scrollToPosition(d4 > dV ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.z;
        recyclerView.post(new wz(iMin, recyclerView));
    }

    public void fb(@NonNull c5 c5Var) {
        this.f1069fb.y(c5Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f1064b.y() ? this.f1064b.fb() : super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.s getAdapter() {
        return this.z.getAdapter();
    }

    public int getCurrentItem() {
        return this.f1072s;
    }

    public int getItemDecorationCount() {
        return this.z.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f1075x;
    }

    public int getOrientation() {
        return this.w.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.z;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f3.a();
    }

    public boolean gv() {
        return this.w.getLayoutDirection() == 1;
    }

    public void i9(int i, boolean z) {
        if (zn()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        f(i, z);
    }

    public final void n3(Context context, AttributeSet attributeSet) {
        this.f1064b = f1063hw ? new i9() : new a();
        RecyclerView tlVar = new tl(context);
        this.z = tlVar;
        tlVar.setId(ut.tl());
        this.z.setDescendantFocusability(131072);
        s sVar = new s(context);
        this.w = sVar;
        this.z.setLayoutManager(sVar);
        this.z.setScrollingTouchSlop(1);
        t(context, attributeSet);
        this.z.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.z.addOnChildAttachStateChangeListener(y());
        androidx.viewpager2.widget.v vVar = new androidx.viewpager2.widget.v(this);
        this.f3 = vVar;
        this.c = new cs.n3(this, vVar, this.z);
        t tVar = new t();
        this.f1071r = tVar;
        tVar.attachToRecyclerView(this.z);
        this.z.addOnScrollListener(this.f3);
        androidx.viewpager2.widget.y yVar = new androidx.viewpager2.widget.y(3);
        this.n = yVar;
        this.f3.tl(yVar);
        n3 n3Var = new n3();
        zn znVar = new zn();
        this.n.y(n3Var);
        this.n.y(znVar);
        this.f1064b.s(this.n, this.z);
        this.n.y(this.f1069fb);
        androidx.viewpager2.widget.gv gvVar = new androidx.viewpager2.widget.gv(this.w);
        this.d0 = gvVar;
        this.n.y(gvVar);
        RecyclerView recyclerView = this.z;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f1064b.c5(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        int measuredWidth = this.z.getMeasuredWidth();
        int measuredHeight = this.z.getMeasuredHeight();
        this.y.left = getPaddingLeft();
        this.y.right = (i8 - i) - getPaddingRight();
        this.y.top = getPaddingTop();
        this.y.bottom = (i10 - i5) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.y, this.f1074v);
        RecyclerView recyclerView = this.z;
        Rect rect = this.f1074v;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f1068f) {
            xc();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i5) {
        measureChild(this.z, i, i5);
        int measuredWidth = this.z.getMeasuredWidth();
        int measuredHeight = this.z.getMeasuredHeight();
        int measuredState = this.z.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i5, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1070p = savedState.f1077v;
        this.f1065co = savedState.f1076fb;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.y = this.z.getId();
        int i = this.f1070p;
        if (i == -1) {
            i = this.f1072s;
        }
        savedState.f1077v = i;
        Parcelable parcelable = this.f1065co;
        if (parcelable != null) {
            savedState.f1076fb = parcelable;
        } else {
            le.zn adapter = this.z.getAdapter();
            if (adapter instanceof le.zn) {
                savedState.f1076fb = adapter.y();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.f1064b.zn(i, bundle) ? this.f1064b.t(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void s() {
        if (this.d0.y() == null) {
            return;
        }
        double dV = this.f3.v();
        int i = (int) dV;
        float f3 = (float) (dV - ((double) i));
        this.d0.onPageScrolled(i, f3, Math.round(getPageSize() * f3));
    }

    public void setAdapter(@Nullable RecyclerView.s sVar) {
        RecyclerView.s<?> adapter = this.z.getAdapter();
        this.f1064b.a(adapter);
        tl(adapter);
        this.z.setAdapter(sVar);
        this.f1072s = 0;
        c5();
        this.f1064b.v(sVar);
        a(sVar);
    }

    public void setCurrentItem(int i) {
        i9(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f1064b.w();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f1075x = i;
        this.z.requestLayout();
    }

    public void setOrientation(int i) {
        this.w.setOrientation(i);
        this.f1064b.mt();
    }

    public void setPageTransformer(@Nullable f fVar) {
        if (fVar != null) {
            if (!this.f1066d) {
                this.fh = this.z.getItemAnimator();
                this.f1066d = true;
            }
            this.z.setItemAnimator((RecyclerView.tl) null);
        } else if (this.f1066d) {
            this.z.setItemAnimator(this.fh);
            this.fh = null;
            this.f1066d = false;
        }
        if (fVar == this.d0.y()) {
            return;
        }
        this.d0.n3(fVar);
        s();
    }

    public void setUserInputEnabled(boolean z) {
        this.f1067ej = z;
        this.f1064b.co();
    }

    public final void t(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1059fb);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, R$styleable.f1059fb, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.f1061s, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void tl(@Nullable RecyclerView.s<?> sVar) {
        if (sVar != null) {
            sVar.unregisterAdapterDataObserver(this.f1073t);
        }
    }

    public boolean v() {
        return this.f1067ej;
    }

    public void wz(@NonNull c5 c5Var) {
        this.f1069fb.n3(c5Var);
    }

    public void xc() {
        androidx.recyclerview.widget.tl tlVar = this.f1071r;
        if (tlVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = tlVar.findSnapView(this.w);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.w.getPosition(viewFindSnapView);
        if (position != this.f1072s && getScrollState() == 0) {
            this.n.onPageSelected(position);
        }
        this.f1068f = false;
    }

    public final RecyclerView.mt y() {
        return new gv();
    }

    public boolean zn() {
        return this.c.y();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public Parcelable f1076fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1077v;
        public int y;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            y(parcel, classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.y);
            parcel.writeInt(this.f1077v);
            parcel.writeParcelable(this.f1076fb, i);
        }

        public final void y(Parcel parcel, ClassLoader classLoader) {
            this.y = parcel.readInt();
            this.f1077v = parcel.readInt();
            this.f1076fb = parcel.readParcelable(classLoader);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            y(parcel, null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new Rect();
        this.f1074v = new Rect();
        this.f1069fb = new androidx.viewpager2.widget.y(3);
        this.f1068f = false;
        this.f1073t = new y();
        this.f1070p = -1;
        this.fh = null;
        this.f1066d = false;
        this.f1067ej = true;
        this.f1075x = -1;
        n3(context, attributeSet);
    }
}
