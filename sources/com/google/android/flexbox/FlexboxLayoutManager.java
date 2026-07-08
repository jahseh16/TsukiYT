package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c5;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.n3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends RecyclerView.w implements c1.y, RecyclerView.d0.n3 {

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public static final Rect f2090ut = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2091b;
    public t c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final com.google.android.flexbox.n3 f2092co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2093d;
    public t d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f2094ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2095f;
    public zn f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f2096fb;
    public SavedState fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public boolean f2097hw;
    public int j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public SparseArray<View> f2098j5;
    public n3 n;
    public View o;
    public n3.C0061n3 oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<com.google.android.flexbox.y> f2099p;
    public final Context qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView.fh f2100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2102t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2103v;
    public boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2104x;
    public int y;
    public RecyclerView.i4 z;

    public class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2111a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f2112fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f2113gv;
        public int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f2115v;
        public int y;
        public int zn;

        public n3() {
            this.f2113gv = 0;
        }

        public static /* synthetic */ int t(n3 n3Var, int i) {
            int i5 = n3Var.f2113gv + i;
            n3Var.f2113gv = i5;
            return i5;
        }

        public final void co(View view) {
            t tVar = FlexboxLayoutManager.this.f2103v == 0 ? FlexboxLayoutManager.this.d0 : FlexboxLayoutManager.this.c;
            if (FlexboxLayoutManager.this.i9() || !FlexboxLayoutManager.this.f2102t) {
                if (this.f2115v) {
                    this.zn = tVar.gv(view) + tVar.w();
                } else {
                    this.zn = tVar.fb(view);
                }
            } else if (this.f2115v) {
                this.zn = tVar.fb(view) + tVar.w();
            } else {
                this.zn = tVar.gv(view);
            }
            this.y = FlexboxLayoutManager.this.getPosition(view);
            this.f2112fb = false;
            int[] iArr = FlexboxLayoutManager.this.f2092co.zn;
            int i = this.y;
            if (i == -1) {
                i = 0;
            }
            int i5 = iArr[i];
            this.n3 = i5 != -1 ? i5 : 0;
            if (FlexboxLayoutManager.this.f2099p.size() > this.n3) {
                this.y = ((com.google.android.flexbox.y) FlexboxLayoutManager.this.f2099p.get(this.n3)).f2157xc;
            }
        }

        public final void mt() {
            if (FlexboxLayoutManager.this.i9() || !FlexboxLayoutManager.this.f2102t) {
                this.zn = this.f2115v ? FlexboxLayoutManager.this.c.c5() : FlexboxLayoutManager.this.c.wz();
            } else {
                this.zn = this.f2115v ? FlexboxLayoutManager.this.c.c5() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.c.wz();
            }
        }

        @NonNull
        public String toString() {
            return "AnchorInfo{mPosition=" + this.y + ", mFlexLinePosition=" + this.n3 + ", mCoordinate=" + this.zn + ", mPerpendicularCoordinate=" + this.f2113gv + ", mLayoutFromEnd=" + this.f2115v + ", mValid=" + this.f2111a + ", mAssignedFromSavedState=" + this.f2112fb + '}';
        }

        public final void z() {
            this.y = -1;
            this.n3 = -1;
            this.zn = Integer.MIN_VALUE;
            this.f2111a = false;
            this.f2112fb = false;
            if (FlexboxLayoutManager.this.i9()) {
                if (FlexboxLayoutManager.this.f2103v == 0) {
                    this.f2115v = FlexboxLayoutManager.this.y == 1;
                    return;
                } else {
                    this.f2115v = FlexboxLayoutManager.this.f2103v == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.f2103v == 0) {
                this.f2115v = FlexboxLayoutManager.this.y == 3;
            } else {
                this.f2115v = FlexboxLayoutManager.this.f2103v == 2;
            }
        }
    }

    public static class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2116a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f2117c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f2118fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f2119gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public boolean f2120i9;
        public boolean n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2121s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2122v;
        public int y;
        public int zn;

        public zn() {
            this.f2121s = 1;
            this.f2117c5 = 1;
        }

        public static /* synthetic */ int c5(zn znVar, int i) {
            int i5 = znVar.y - i;
            znVar.y = i5;
            return i5;
        }

        public static /* synthetic */ int gv(zn znVar, int i) {
            int i5 = znVar.f2122v - i;
            znVar.f2122v = i5;
            return i5;
        }

        public static /* synthetic */ int p(zn znVar, int i) {
            int i5 = znVar.f2116a + i;
            znVar.f2116a = i5;
            return i5;
        }

        public static /* synthetic */ int r(zn znVar, int i) {
            int i5 = znVar.f2119gv + i;
            znVar.f2119gv = i5;
            return i5;
        }

        public static /* synthetic */ int t(zn znVar) {
            int i = znVar.zn;
            znVar.zn = i + 1;
            return i;
        }

        public static /* synthetic */ int tl(zn znVar) {
            int i = znVar.zn;
            znVar.zn = i - 1;
            return i;
        }

        public static /* synthetic */ int wz(zn znVar, int i) {
            int i5 = znVar.zn + i;
            znVar.zn = i5;
            return i5;
        }

        public static /* synthetic */ int x4(zn znVar, int i) {
            int i5 = znVar.f2119gv - i;
            znVar.f2119gv = i5;
            return i5;
        }

        public static /* synthetic */ int zn(zn znVar, int i) {
            int i5 = znVar.f2122v + i;
            znVar.f2122v = i5;
            return i5;
        }

        public final boolean mg(RecyclerView.fh fhVar, List<com.google.android.flexbox.y> list) {
            int i;
            int i5 = this.f2119gv;
            return i5 >= 0 && i5 < fhVar.n3() && (i = this.zn) >= 0 && i < list.size();
        }

        @NonNull
        public String toString() {
            return "LayoutState{mAvailable=" + this.y + ", mFlexLinePosition=" + this.zn + ", mPosition=" + this.f2119gv + ", mOffset=" + this.f2122v + ", mScrollingOffset=" + this.f2116a + ", mLastScrollDelta=" + this.f2118fb + ", mItemDirection=" + this.f2121s + ", mLayoutDirection=" + this.f2117c5 + '}';
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    private void ensureLayoutState() {
        if (this.f3 == null) {
            this.f3 = new zn();
        }
    }

    public static boolean isMeasurementUpToDate(int i, int i5, int i8) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i8 > 0 && i != i8) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private boolean shouldMeasureChild(View view, int i, int i5, RecyclerView.p pVar) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
    }

    @Override // c1.y
    public void a(com.google.android.flexbox.y yVar) {
    }

    public final int a8(com.google.android.flexbox.y yVar, zn znVar) {
        return i9() ? x(yVar, znVar) : b(yVar, znVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.flexbox.y r26, com.google.android.flexbox.FlexboxLayoutManager.zn r27) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b(com.google.android.flexbox.y, com.google.android.flexbox.FlexboxLayoutManager$zn):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View c(android.view.View r6, com.google.android.flexbox.y r7) {
        /*
            r5 = this;
            boolean r0 = r5.i9()
            int r1 = r5.getChildCount()
            int r1 = r1 + (-2)
            int r2 = r5.getChildCount()
            int r7 = r7.f2152s
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.getChildAt(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.f2102t
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            androidx.recyclerview.widget.t r3 = r5.c
            int r3 = r3.fb(r6)
            androidx.recyclerview.widget.t r4 = r5.c
            int r4 = r4.fb(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            androidx.recyclerview.widget.t r3 = r5.c
            int r3 = r3.gv(r6)
            androidx.recyclerview.widget.t r4 = r5.c
            int r4 = r4.gv(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c(android.view.View, com.google.android.flexbox.y):android.view.View");
    }

    @Override // c1.y
    public int c5(View view, int i, int i5) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (i9()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    public boolean canScrollHorizontally() {
        if (this.f2103v == 0) {
            return i9();
        }
        if (i9()) {
            int width = getWidth();
            View view = this.o;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    public boolean canScrollVertically() {
        if (this.f2103v == 0) {
            return !i9();
        }
        if (i9()) {
            return true;
        }
        int height = getHeight();
        View view = this.o;
        return height > (view != null ? view.getHeight() : 0);
    }

    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof LayoutParams;
    }

    public final boolean co(View view, int i) {
        return (i9() || !this.f2102t) ? this.c.gv(view) <= i : this.c.s() - this.c.fb(view) <= i;
    }

    public int computeHorizontalScrollExtent(@NonNull RecyclerView.fh fhVar) {
        return computeScrollExtent(fhVar);
    }

    public int computeHorizontalScrollOffset(@NonNull RecyclerView.fh fhVar) {
        return computeScrollOffset(fhVar);
    }

    public int computeHorizontalScrollRange(@NonNull RecyclerView.fh fhVar) {
        return computeScrollRange(fhVar);
    }

    public final int computeScrollExtent(RecyclerView.fh fhVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iN3 = fhVar.n3();
        r();
        View viewI4 = i4(iN3);
        View viewN = n(iN3);
        if (fhVar.n3() == 0 || viewI4 == null || viewN == null) {
            return 0;
        }
        return Math.min(this.c.xc(), this.c.gv(viewN) - this.c.fb(viewI4));
    }

    public final int computeScrollOffset(RecyclerView.fh fhVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iN3 = fhVar.n3();
        View viewI4 = i4(iN3);
        View viewN = n(iN3);
        if (fhVar.n3() != 0 && viewI4 != null && viewN != null) {
            int position = getPosition(viewI4);
            int position2 = getPosition(viewN);
            int iAbs = Math.abs(this.c.gv(viewN) - this.c.fb(viewI4));
            int i = this.f2092co.zn[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((r4[position2] - i) + 1))) + (this.c.wz() - this.c.fb(viewI4)));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.fh fhVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iN3 = fhVar.n3();
        View viewI4 = i4(iN3);
        View viewN = n(iN3);
        if (fhVar.n3() == 0 || viewI4 == null || viewN == null) {
            return 0;
        }
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        return (int) ((Math.abs(this.c.gv(viewN) - this.c.fb(viewI4)) / ((findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1)) * fhVar.n3());
    }

    public PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i5 = i < getPosition(childAt) ? -1 : 1;
        return i9() ? new PointF(0.0f, i5) : new PointF(i5, 0.0f);
    }

    public int computeVerticalScrollExtent(@NonNull RecyclerView.fh fhVar) {
        return computeScrollExtent(fhVar);
    }

    public int computeVerticalScrollOffset(@NonNull RecyclerView.fh fhVar) {
        return computeScrollOffset(fhVar);
    }

    public int computeVerticalScrollRange(@NonNull RecyclerView.fh fhVar) {
        return computeScrollRange(fhVar);
    }

    public final int d(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    public final View d0(int i, int i5, boolean z) {
        int i8 = i5 > i ? 1 : -1;
        while (i != i5) {
            View childAt = getChildAt(i);
            if (ud(childAt, z)) {
                return childAt;
            }
            i += i8;
        }
        return null;
    }

    public final int ej(int i) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        r();
        boolean zI9 = i9();
        View view = this.o;
        int width = zI9 ? view.getWidth() : view.getHeight();
        int width2 = zI9 ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                iMin = Math.min((width2 + this.n.f2113gv) - width, iAbs);
            } else {
                if (this.n.f2113gv + i <= 0) {
                    return i;
                }
                iMin = this.n.f2113gv;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - this.n.f2113gv) - width, i);
            }
            if (this.n.f2113gv + i >= 0) {
                return i;
            }
            iMin = this.n.f2113gv;
        }
        return -iMin;
    }

    public final void en(int i) {
        int i5;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z = false;
        if (i9()) {
            int i8 = this.f2104x;
            if (i8 != Integer.MIN_VALUE && i8 != width) {
                z = true;
            }
            i5 = this.f3.n3 ? this.qn.getResources().getDisplayMetrics().heightPixels : this.f3.y;
        } else {
            int i10 = this.f2091b;
            if (i10 != Integer.MIN_VALUE && i10 != height) {
                z = true;
            }
            i5 = this.f3.n3 ? this.qn.getResources().getDisplayMetrics().widthPixels : this.f3.y;
        }
        int i11 = i5;
        this.f2104x = width;
        this.f2091b = height;
        int i12 = this.j;
        if (i12 == -1 && (this.f2093d != -1 || z)) {
            if (this.n.f2115v) {
                return;
            }
            this.f2099p.clear();
            this.oz.y();
            if (i9()) {
                this.f2092co.v(this.oz, iMakeMeasureSpec, iMakeMeasureSpec2, i11, this.n.y, this.f2099p);
            } else {
                this.f2092co.s(this.oz, iMakeMeasureSpec, iMakeMeasureSpec2, i11, this.n.y, this.f2099p);
            }
            this.f2099p = this.oz.y;
            this.f2092co.w(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f2092co.k();
            n3 n3Var = this.n;
            n3Var.n3 = this.f2092co.zn[n3Var.y];
            this.f3.zn = this.n.n3;
            return;
        }
        int iMin = i12 != -1 ? Math.min(i12, this.n.y) : this.n.y;
        this.oz.y();
        if (i9()) {
            if (this.f2099p.size() > 0) {
                this.f2092co.i9(this.f2099p, iMin);
                this.f2092co.n3(this.oz, iMakeMeasureSpec, iMakeMeasureSpec2, i11, iMin, this.n.y, this.f2099p);
            } else {
                this.f2092co.co(i);
                this.f2092co.gv(this.oz, iMakeMeasureSpec, iMakeMeasureSpec2, i11, 0, this.f2099p);
            }
        } else if (this.f2099p.size() > 0) {
            this.f2092co.i9(this.f2099p, iMin);
            this.f2092co.n3(this.oz, iMakeMeasureSpec2, iMakeMeasureSpec, i11, iMin, this.n.y, this.f2099p);
        } else {
            this.f2092co.co(i);
            this.f2092co.fb(this.oz, iMakeMeasureSpec, iMakeMeasureSpec2, i11, 0, this.f2099p);
        }
        this.f2099p = this.oz.y;
        this.f2092co.p(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
        this.f2092co.f7(iMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View f3(android.view.View r6, com.google.android.flexbox.y r7) {
        /*
            r5 = this;
            boolean r0 = r5.i9()
            int r7 = r7.f2152s
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.getChildAt(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.f2102t
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.t r3 = r5.c
            int r3 = r3.gv(r6)
            androidx.recyclerview.widget.t r4 = r5.c
            int r4 = r4.gv(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            androidx.recyclerview.widget.t r3 = r5.c
            int r3 = r3.fb(r6)
            androidx.recyclerview.widget.t r4 = r5.c
            int r4 = r4.fb(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.f3(android.view.View, com.google.android.flexbox.y):android.view.View");
    }

    public final void f7(int i) {
        if (i >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.f2092co.z(childCount);
        this.f2092co.r(childCount);
        this.f2092co.co(childCount);
        if (i >= this.f2092co.zn.length) {
            return;
        }
        this.j = i;
        View childClosestToStart = getChildClosestToStart();
        if (childClosestToStart == null) {
            return;
        }
        this.f2093d = getPosition(childClosestToStart);
        if (i9() || !this.f2102t) {
            this.f2094ej = this.c.fb(childClosestToStart) - this.c.wz();
        } else {
            this.f2094ej = this.c.gv(childClosestToStart) + this.c.i9();
        }
    }

    @Override // c1.y
    public View fb(int i) {
        return zn(i);
    }

    public final View fh(int i, int i5, int i8) {
        int position;
        r();
        ensureLayoutState();
        int iWz = this.c.wz();
        int iC5 = this.c.c5();
        int i10 = i5 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i5) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i8) {
                if (childAt.getLayoutParams().zn()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.c.fb(childAt) >= iWz && this.c.gv(childAt) <= iC5) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i10;
        }
        return view != null ? view : view2;
    }

    public int findFirstVisibleItemPosition() {
        View viewD0 = d0(0, getChildCount(), false);
        if (viewD0 == null) {
            return -1;
        }
        return getPosition(viewD0);
    }

    public int findLastVisibleItemPosition() {
        View viewD0 = d0(getChildCount() - 1, -1, false);
        if (viewD0 == null) {
            return -1;
        }
        return getPosition(viewD0);
    }

    public final int fixLayoutEndGap(int i, RecyclerView.i4 i4Var, RecyclerView.fh fhVar, boolean z) {
        int iZ6;
        int iC5;
        if (i9() || !this.f2102t) {
            int iC52 = this.c.c5() - i;
            if (iC52 <= 0) {
                return 0;
            }
            iZ6 = -z6(-iC52, i4Var, fhVar);
        } else {
            int iWz = i - this.c.wz();
            if (iWz <= 0) {
                return 0;
            }
            iZ6 = z6(iWz, i4Var, fhVar);
        }
        int i5 = i + iZ6;
        if (!z || (iC5 = this.c.c5() - i5) <= 0) {
            return iZ6;
        }
        this.c.co(iC5);
        return iC5 + iZ6;
    }

    public final int fixLayoutStartGap(int i, RecyclerView.i4 i4Var, RecyclerView.fh fhVar, boolean z) {
        int iZ6;
        int iWz;
        if (i9() || !this.f2102t) {
            int iWz2 = i - this.c.wz();
            if (iWz2 <= 0) {
                return 0;
            }
            iZ6 = -z6(iWz2, i4Var, fhVar);
        } else {
            int iC5 = this.c.c5() - i;
            if (iC5 <= 0) {
                return 0;
            }
            iZ6 = z6(-iC5, i4Var, fhVar);
        }
        int i5 = i + iZ6;
        if (!z || (iWz = i5 - this.c.wz()) <= 0) {
            return iZ6;
        }
        this.c.co(-iWz);
        return iZ6 - iWz;
    }

    public RecyclerView.p generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // c1.y
    public int getAlignContent() {
        return 5;
    }

    @Override // c1.y
    public int getAlignItems() {
        return this.f2101s;
    }

    public final View getChildClosestToStart() {
        return getChildAt(0);
    }

    @Override // c1.y
    public int getFlexDirection() {
        return this.y;
    }

    @Override // c1.y
    public int getFlexItemCount() {
        return this.f2100r.n3();
    }

    @Override // c1.y
    public List<com.google.android.flexbox.y> getFlexLinesInternal() {
        return this.f2099p;
    }

    @Override // c1.y
    public int getFlexWrap() {
        return this.f2103v;
    }

    @Override // c1.y
    public int getLargestMainSize() {
        if (this.f2099p.size() == 0) {
            return 0;
        }
        int size = this.f2099p.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, this.f2099p.get(i).f2155v);
        }
        return iMax;
    }

    @Override // c1.y
    public int getMaxLine() {
        return this.f2095f;
    }

    @Override // c1.y
    public int getSumOfCrossSize() {
        int size = this.f2099p.size();
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i += this.f2099p.get(i5).f2147fb;
        }
        return i;
    }

    @Override // c1.y
    public int gv(int i, int i5, int i8) {
        return RecyclerView.w.getChildMeasureSpec(getHeight(), getHeightMode(), i5, i8, canScrollVertically());
    }

    public final void hw() {
        int heightMode = i9() ? getHeightMode() : getWidthMode();
        this.f3.n3 = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final View i4(int i) {
        View viewFh = fh(0, getChildCount(), i);
        if (viewFh == null) {
            return null;
        }
        int i5 = this.f2092co.zn[getPosition(viewFh)];
        if (i5 == -1) {
            return null;
        }
        return f3(viewFh, this.f2099p.get(i5));
    }

    @Override // c1.y
    public boolean i9() {
        int i = this.y;
        return i == 0 || i == 1;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void j(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i5 = this.f2103v;
        if (i5 != i) {
            if (i5 == 0 || i == 0) {
                removeAllViews();
                z();
            }
            this.f2103v = i;
            this.c = null;
            this.d0 = null;
            requestLayout();
        }
    }

    public final void j5() {
        int layoutDirection = getLayoutDirection();
        int i = this.y;
        if (i == 0) {
            this.f2102t = layoutDirection == 1;
            this.w = this.f2103v == 2;
            return;
        }
        if (i == 1) {
            this.f2102t = layoutDirection != 1;
            this.w = this.f2103v == 2;
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            this.f2102t = z;
            if (this.f2103v == 2) {
                this.f2102t = !z;
            }
            this.w = false;
            return;
        }
        if (i != 3) {
            this.f2102t = false;
            this.w = false;
            return;
        }
        boolean z5 = layoutDirection == 1;
        this.f2102t = z5;
        if (this.f2103v == 2) {
            this.f2102t = !z5;
        }
        this.w = true;
    }

    public final void jz(int i, int i5) {
        this.f3.f2117c5 = i;
        boolean zI9 = i9();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z = !zI9 && this.f2102t;
        if (i == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt == null) {
                return;
            }
            this.f3.f2122v = this.c.gv(childAt);
            int position = getPosition(childAt);
            View viewC = c(childAt, this.f2099p.get(this.f2092co.zn[position]));
            this.f3.f2121s = 1;
            zn znVar = this.f3;
            znVar.f2119gv = position + znVar.f2121s;
            if (this.f2092co.zn.length <= this.f3.f2119gv) {
                this.f3.zn = -1;
            } else {
                zn znVar2 = this.f3;
                znVar2.zn = this.f2092co.zn[znVar2.f2119gv];
            }
            if (z) {
                this.f3.f2122v = this.c.fb(viewC);
                this.f3.f2116a = (-this.c.fb(viewC)) + this.c.wz();
                zn znVar3 = this.f3;
                znVar3.f2116a = Math.max(znVar3.f2116a, 0);
            } else {
                this.f3.f2122v = this.c.gv(viewC);
                this.f3.f2116a = this.c.gv(viewC) - this.c.c5();
            }
            if ((this.f3.zn == -1 || this.f3.zn > this.f2099p.size() - 1) && this.f3.f2119gv <= getFlexItemCount()) {
                int i8 = i5 - this.f3.f2116a;
                this.oz.y();
                if (i8 > 0) {
                    if (zI9) {
                        this.f2092co.gv(this.oz, iMakeMeasureSpec, iMakeMeasureSpec2, i8, this.f3.f2119gv, this.f2099p);
                    } else {
                        this.f2092co.fb(this.oz, iMakeMeasureSpec, iMakeMeasureSpec2, i8, this.f3.f2119gv, this.f2099p);
                    }
                    this.f2092co.p(iMakeMeasureSpec, iMakeMeasureSpec2, this.f3.f2119gv);
                    this.f2092co.f7(this.f3.f2119gv);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 == null) {
                return;
            }
            this.f3.f2122v = this.c.fb(childAt2);
            int position2 = getPosition(childAt2);
            View viewF3 = f3(childAt2, this.f2099p.get(this.f2092co.zn[position2]));
            this.f3.f2121s = 1;
            int i10 = this.f2092co.zn[position2];
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f3.f2119gv = position2 - this.f2099p.get(i10 - 1).n3();
            } else {
                this.f3.f2119gv = -1;
            }
            this.f3.zn = i10 > 0 ? i10 - 1 : 0;
            if (z) {
                this.f3.f2122v = this.c.gv(viewF3);
                this.f3.f2116a = this.c.gv(viewF3) - this.c.c5();
                zn znVar4 = this.f3;
                znVar4.f2116a = Math.max(znVar4.f2116a, 0);
            } else {
                this.f3.f2122v = this.c.fb(viewF3);
                this.f3.f2116a = (-this.c.fb(viewF3)) + this.c.wz();
            }
        }
        zn znVar5 = this.f3;
        znVar5.y = i5 - znVar5.f2116a;
    }

    public final void k(RecyclerView.fh fhVar, n3 n3Var) {
        if (q9(fhVar, n3Var, this.fh) || ut(fhVar, n3Var)) {
            return;
        }
        n3Var.mt();
        n3Var.y = 0;
        n3Var.n3 = 0;
    }

    public final void k5(RecyclerView.i4 i4Var, zn znVar) {
        if (znVar.f2120i9) {
            if (znVar.f2117c5 == -1) {
                yt(i4Var, znVar);
            } else {
                vl(i4Var, znVar);
            }
        }
    }

    public final int mg(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    public final boolean mt(View view, int i) {
        return (i9() || !this.f2102t) ? this.c.fb(view) >= this.c.s() - i : this.c.gv(view) <= i;
    }

    public final View n(int i) {
        View viewFh = fh(getChildCount() - 1, -1, i);
        if (viewFh == null) {
            return null;
        }
        return c(viewFh, this.f2099p.get(this.f2092co.zn[getPosition(viewFh)]));
    }

    @Override // c1.y
    public int n3(int i, int i5, int i8) {
        return RecyclerView.w.getChildMeasureSpec(getWidth(), getWidthMode(), i5, i8, canScrollHorizontally());
    }

    public void o(int i) {
        if (this.y != i) {
            removeAllViews();
            this.y = i;
            this.c = null;
            this.d0 = null;
            z();
            requestLayout();
        }
    }

    public void onAdapterChanged(RecyclerView.s sVar, RecyclerView.s sVar2) {
        removeAllViews();
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.o = (View) recyclerView.getParent();
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.i4 i4Var) {
        super.onDetachedFromWindow(recyclerView, i4Var);
        if (this.f2097hw) {
            removeAndRecycleAllViews(i4Var);
            i4Var.zn();
        }
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i5) {
        super.onItemsAdded(recyclerView, i, i5);
        f7(i);
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i5, int i8) {
        super.onItemsMoved(recyclerView, i, i5, i8);
        f7(Math.min(i, i5));
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i5) {
        super.onItemsRemoved(recyclerView, i, i5);
        f7(i);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i5, Object obj) {
        super.onItemsUpdated(recyclerView, i, i5, obj);
        f7(i);
    }

    public void onLayoutChildren(RecyclerView.i4 i4Var, RecyclerView.fh fhVar) {
        int i;
        int i5;
        this.z = i4Var;
        this.f2100r = fhVar;
        int iN3 = fhVar.n3();
        if (iN3 == 0 && fhVar.v()) {
            return;
        }
        j5();
        r();
        ensureLayoutState();
        this.f2092co.z(iN3);
        this.f2092co.r(iN3);
        this.f2092co.co(iN3);
        this.f3.f2120i9 = false;
        SavedState savedState = this.fh;
        if (savedState != null && savedState.fb(iN3)) {
            this.f2093d = this.fh.y;
        }
        if (!this.n.f2111a || this.f2093d != -1 || this.fh != null) {
            this.n.z();
            k(fhVar, this.n);
            this.n.f2111a = true;
        }
        detachAndScrapAttachedViews(i4Var);
        if (this.n.f2115v) {
            y5(this.n, false, true);
        } else {
            u(this.n, false, true);
        }
        en(iN3);
        x4(i4Var, fhVar, this.f3);
        if (this.n.f2115v) {
            i5 = this.f3.f2122v;
            u(this.n, true, false);
            x4(i4Var, fhVar, this.f3);
            i = this.f3.f2122v;
        } else {
            i = this.f3.f2122v;
            y5(this.n, true, false);
            x4(i4Var, fhVar, this.f3);
            i5 = this.f3.f2122v;
        }
        if (getChildCount() > 0) {
            if (this.n.f2115v) {
                fixLayoutStartGap(i5 + fixLayoutEndGap(i, i4Var, fhVar, true), i4Var, fhVar, false);
            } else {
                fixLayoutEndGap(i + fixLayoutStartGap(i5, i4Var, fhVar, true), i4Var, fhVar, false);
            }
        }
    }

    public void onLayoutCompleted(RecyclerView.fh fhVar) {
        super.onLayoutCompleted(fhVar);
        this.fh = null;
        this.f2093d = -1;
        this.f2094ej = Integer.MIN_VALUE;
        this.j = -1;
        this.n.z();
        this.f2098j5.clear();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.fh = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        if (this.fh != null) {
            return new SavedState(this.fh);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            View childClosestToStart = getChildClosestToStart();
            savedState.y = getPosition(childClosestToStart);
            savedState.f2110v = this.c.fb(childClosestToStart) - this.c.wz();
        } else {
            savedState.s();
        }
        return savedState;
    }

    public void oz(int i) {
        if (this.f2096fb != i) {
            this.f2096fb = i;
            requestLayout();
        }
    }

    public final boolean q9(RecyclerView.fh fhVar, n3 n3Var, SavedState savedState) {
        int i;
        View childAt;
        if (!fhVar.v() && (i = this.f2093d) != -1) {
            if (i >= 0 && i < fhVar.n3()) {
                n3Var.y = this.f2093d;
                n3Var.n3 = this.f2092co.zn[n3Var.y];
                SavedState savedState2 = this.fh;
                if (savedState2 != null && savedState2.fb(fhVar.n3())) {
                    n3Var.zn = this.c.wz() + savedState.f2110v;
                    n3Var.f2112fb = true;
                    n3Var.n3 = -1;
                    return true;
                }
                if (this.f2094ej != Integer.MIN_VALUE) {
                    if (i9() || !this.f2102t) {
                        n3Var.zn = this.c.wz() + this.f2094ej;
                    } else {
                        n3Var.zn = this.f2094ej - this.c.i9();
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.f2093d);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                        n3Var.f2115v = this.f2093d < getPosition(childAt);
                    }
                    n3Var.mt();
                } else {
                    if (this.c.v(viewFindViewByPosition) > this.c.xc()) {
                        n3Var.mt();
                        return true;
                    }
                    if (this.c.fb(viewFindViewByPosition) - this.c.wz() < 0) {
                        n3Var.zn = this.c.wz();
                        n3Var.f2115v = false;
                        return true;
                    }
                    if (this.c.c5() - this.c.gv(viewFindViewByPosition) < 0) {
                        n3Var.zn = this.c.c5();
                        n3Var.f2115v = true;
                        return true;
                    }
                    n3Var.zn = n3Var.f2115v ? this.c.gv(viewFindViewByPosition) + this.c.w() : this.c.fb(viewFindViewByPosition);
                }
                return true;
            }
            this.f2093d = -1;
            this.f2094ej = Integer.MIN_VALUE;
        }
        return false;
    }

    public void qn(int i) {
        int i5 = this.f2101s;
        if (i5 != i) {
            if (i5 == 4 || i == 4) {
                removeAllViews();
                z();
            }
            this.f2101s = i;
            requestLayout();
        }
    }

    public final void r() {
        if (this.c != null) {
            return;
        }
        if (i9()) {
            if (this.f2103v == 0) {
                this.c = t.y(this);
                this.d0 = t.zn(this);
                return;
            } else {
                this.c = t.zn(this);
                this.d0 = t.y(this);
                return;
            }
        }
        if (this.f2103v == 0) {
            this.c = t.zn(this);
            this.d0 = t.y(this);
        } else {
            this.c = t.y(this);
            this.d0 = t.zn(this);
        }
    }

    public final void recycleChildren(RecyclerView.i4 i4Var, int i, int i5) {
        while (i5 >= i) {
            removeAndRecycleViewAt(i5, i4Var);
            i5--;
        }
    }

    public final int rz(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // c1.y
    public void s(int i, View view) {
        this.f2098j5.put(i, view);
    }

    public int scrollHorizontallyBy(int i, RecyclerView.i4 i4Var, RecyclerView.fh fhVar) {
        if (!i9() || this.f2103v == 0) {
            int iZ6 = z6(i, i4Var, fhVar);
            this.f2098j5.clear();
            return iZ6;
        }
        int iEj = ej(i);
        n3.t(this.n, iEj);
        this.d0.co(-iEj);
        return iEj;
    }

    public void scrollToPosition(int i) {
        this.f2093d = i;
        this.f2094ej = Integer.MIN_VALUE;
        SavedState savedState = this.fh;
        if (savedState != null) {
            savedState.s();
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.i4 i4Var, RecyclerView.fh fhVar) {
        if (i9() || (this.f2103v == 0 && !i9())) {
            int iZ6 = z6(i, i4Var, fhVar);
            this.f2098j5.clear();
            return iZ6;
        }
        int iEj = ej(i);
        n3.t(this.n, iEj);
        this.d0.co(-iEj);
        return iEj;
    }

    @Override // c1.y
    public void setFlexLines(List<com.google.android.flexbox.y> list) {
        this.f2099p = list;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.fh fhVar, int i) {
        c5 c5Var = new c5(recyclerView.getContext());
        c5Var.setTargetPosition(i);
        startSmoothScroll(c5Var);
    }

    public final int ta(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    public final void u(n3 n3Var, boolean z, boolean z5) {
        if (z5) {
            hw();
        } else {
            this.f3.n3 = false;
        }
        if (i9() || !this.f2102t) {
            this.f3.y = this.c.c5() - n3Var.zn;
        } else {
            this.f3.y = n3Var.zn - getPaddingRight();
        }
        this.f3.f2119gv = n3Var.y;
        this.f3.f2121s = 1;
        this.f3.f2117c5 = 1;
        this.f3.f2122v = n3Var.zn;
        this.f3.f2116a = Integer.MIN_VALUE;
        this.f3.zn = n3Var.n3;
        if (!z || this.f2099p.size() <= 1 || n3Var.n3 < 0 || n3Var.n3 >= this.f2099p.size() - 1) {
            return;
        }
        com.google.android.flexbox.y yVar = this.f2099p.get(n3Var.n3);
        zn.t(this.f3);
        zn.r(this.f3, yVar.n3());
    }

    public final boolean ud(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int iMg = mg(view);
        int iD = d(view);
        int iTa = ta(view);
        int iRz = rz(view);
        return z ? (paddingLeft <= iMg && width >= iTa) && (paddingTop <= iD && height >= iRz) : (iMg >= width || iTa >= paddingLeft) && (iD >= height || iRz >= paddingTop);
    }

    public final boolean ut(RecyclerView.fh fhVar, n3 n3Var) {
        if (getChildCount() == 0) {
            return false;
        }
        View viewN = n3Var.f2115v ? n(fhVar.n3()) : i4(fhVar.n3());
        if (viewN == null) {
            return false;
        }
        n3Var.co(viewN);
        if (fhVar.v() || !supportsPredictiveItemAnimations()) {
            return true;
        }
        if (this.c.fb(viewN) < this.c.c5() && this.c.gv(viewN) >= this.c.wz()) {
            return true;
        }
        n3Var.zn = n3Var.f2115v ? this.c.c5() : this.c.wz();
        return true;
    }

    @Override // c1.y
    public int v(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (i9()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    public final void vl(RecyclerView.i4 i4Var, zn znVar) {
        int childCount;
        View childAt;
        if (znVar.f2116a < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        int i = this.f2092co.zn[getPosition(childAt)];
        int i5 = -1;
        if (i == -1) {
            return;
        }
        com.google.android.flexbox.y yVar = this.f2099p.get(i);
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt2 = getChildAt(i8);
            if (childAt2 != null) {
                if (!co(childAt2, znVar.f2116a)) {
                    break;
                }
                if (yVar.w != getPosition(childAt2)) {
                    continue;
                } else if (i >= this.f2099p.size() - 1) {
                    i5 = i8;
                    break;
                } else {
                    i += znVar.f2117c5;
                    yVar = this.f2099p.get(i);
                    i5 = i8;
                }
            }
            i8++;
        }
        recycleChildren(i4Var, 0, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x(com.google.android.flexbox.y r22, com.google.android.flexbox.FlexboxLayoutManager.zn r23) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.x(com.google.android.flexbox.y, com.google.android.flexbox.FlexboxLayoutManager$zn):int");
    }

    public final int x4(RecyclerView.i4 i4Var, RecyclerView.fh fhVar, zn znVar) {
        if (znVar.f2116a != Integer.MIN_VALUE) {
            if (znVar.y < 0) {
                zn.p(znVar, znVar.y);
            }
            k5(i4Var, znVar);
        }
        int i = znVar.y;
        int iY = znVar.y;
        boolean zI9 = i9();
        int iA8 = 0;
        while (true) {
            if ((iY <= 0 && !this.f3.n3) || !znVar.mg(fhVar, this.f2099p)) {
                break;
            }
            com.google.android.flexbox.y yVar = this.f2099p.get(znVar.zn);
            znVar.f2119gv = yVar.f2157xc;
            iA8 += a8(yVar, znVar);
            if (zI9 || !this.f2102t) {
                zn.zn(znVar, yVar.y() * znVar.f2117c5);
            } else {
                zn.gv(znVar, yVar.y() * znVar.f2117c5);
            }
            iY -= yVar.y();
        }
        zn.c5(znVar, iA8);
        if (znVar.f2116a != Integer.MIN_VALUE) {
            zn.p(znVar, iA8);
            if (znVar.y < 0) {
                zn.p(znVar, znVar.y);
            }
            k5(i4Var, znVar);
        }
        return i - znVar.y;
    }

    @Override // c1.y
    public void y(View view, int i, int i5, com.google.android.flexbox.y yVar) {
        calculateItemDecorationsForChild(view, f2090ut);
        if (i9()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            yVar.f2155v += leftDecorationWidth;
            yVar.f2144a += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            yVar.f2155v += topDecorationHeight;
            yVar.f2144a += topDecorationHeight;
        }
    }

    public final void y5(n3 n3Var, boolean z, boolean z5) {
        if (z5) {
            hw();
        } else {
            this.f3.n3 = false;
        }
        if (i9() || !this.f2102t) {
            this.f3.y = n3Var.zn - this.c.wz();
        } else {
            this.f3.y = (this.o.getWidth() - n3Var.zn) - this.c.wz();
        }
        this.f3.f2119gv = n3Var.y;
        this.f3.f2121s = 1;
        this.f3.f2117c5 = -1;
        this.f3.f2122v = n3Var.zn;
        this.f3.f2116a = Integer.MIN_VALUE;
        this.f3.zn = n3Var.n3;
        if (!z || n3Var.n3 <= 0 || this.f2099p.size() <= n3Var.n3) {
            return;
        }
        com.google.android.flexbox.y yVar = this.f2099p.get(n3Var.n3);
        zn.tl(this.f3);
        zn.x4(this.f3, yVar.n3());
    }

    public final void yt(RecyclerView.i4 i4Var, zn znVar) {
        int childCount;
        int i;
        View childAt;
        int i5;
        if (znVar.f2116a < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(childCount - 1)) == null || (i5 = this.f2092co.zn[getPosition(childAt)]) == -1) {
            return;
        }
        com.google.android.flexbox.y yVar = this.f2099p.get(i5);
        int i8 = i;
        while (true) {
            if (i8 < 0) {
                break;
            }
            View childAt2 = getChildAt(i8);
            if (childAt2 != null) {
                if (!mt(childAt2, znVar.f2116a)) {
                    break;
                }
                if (yVar.f2157xc != getPosition(childAt2)) {
                    continue;
                } else if (i5 <= 0) {
                    childCount = i8;
                    break;
                } else {
                    i5 += znVar.f2117c5;
                    yVar = this.f2099p.get(i5);
                    childCount = i8;
                }
            }
            i8--;
        }
        recycleChildren(i4Var, childCount, i);
    }

    public final void z() {
        this.f2099p.clear();
        this.n.z();
        this.n.f2113gv = 0;
    }

    public final int z6(int i, RecyclerView.i4 i4Var, RecyclerView.fh fhVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        r();
        int i5 = 1;
        this.f3.f2120i9 = true;
        boolean z = !i9() && this.f2102t;
        if (!z ? i <= 0 : i >= 0) {
            i5 = -1;
        }
        int iAbs = Math.abs(i);
        jz(i5, iAbs);
        int iX4 = this.f3.f2116a + x4(i4Var, fhVar, this.f3);
        if (iX4 < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iX4) {
                i = (-i5) * iX4;
            }
        } else if (iAbs > iX4) {
            i = i5 * iX4;
        }
        this.c.co(-i);
        this.f3.f2118fb = i;
        return i;
    }

    @Override // c1.y
    public View zn(int i) {
        View view = this.f2098j5.get(i);
        return view != null ? view : this.z.xc(i);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2110v;
        public int y;

        public class y implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean fb(int i) {
            int i5 = this.y;
            return i5 >= 0 && i5 < i;
        }

        public final void s() {
            this.y = -1;
        }

        @NonNull
        public String toString() {
            return "SavedState{mAnchorPosition=" + this.y + ", mAnchorOffset=" + this.f2110v + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.y);
            parcel.writeInt(this.f2110v);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.y = parcel.readInt();
            this.f2110v = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.y = savedState.y;
            this.f2110v = savedState.f2110v;
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i5) {
        this.f2095f = -1;
        this.f2099p = new ArrayList();
        this.f2092co = new com.google.android.flexbox.n3(this);
        this.n = new n3();
        this.f2093d = -1;
        this.f2094ej = Integer.MIN_VALUE;
        this.f2104x = Integer.MIN_VALUE;
        this.f2091b = Integer.MIN_VALUE;
        this.f2098j5 = new SparseArray<>();
        this.j = -1;
        this.oz = new n3.C0061n3();
        o(i);
        j(i5);
        qn(4);
        this.qn = context;
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i5) {
        super.onItemsUpdated(recyclerView, i, i5);
        f7(i);
    }

    public static class LayoutParams extends RecyclerView.p implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new y();

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f2105co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2106f;
        public int f3;
        public boolean n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f2107p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2108r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f2109t;
        public int w;
        public int z;

        public class y implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2106f = 0.0f;
            this.f2109t = 1.0f;
            this.w = -1;
            this.f2107p = -1.0f;
            this.f2108r = 16777215;
            this.f3 = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void c(int i) {
            this.z = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int co() {
            return this.f2105co;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float d() {
            return this.f2107p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.flexbox.FlexItem
        public int eb() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.flexbox.FlexItem
        public int m() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.flexbox.FlexItem
        public int n() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int oz() {
            return this.f2108r;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.flexbox.FlexItem
        public int rs() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float rz() {
            return this.f2106f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
            this.f2105co = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int t() {
            return this.w;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int u0() {
            return this.z;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float w() {
            return this.f2109t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f2106f);
            parcel.writeFloat(this.f2109t);
            parcel.writeInt(this.w);
            parcel.writeFloat(this.f2107p);
            parcel.writeInt(this.f2105co);
            parcel.writeInt(this.z);
            parcel.writeInt(this.f2108r);
            parcel.writeInt(this.f3);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int y4() {
            return this.f3;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean yt() {
            return this.n;
        }

        public LayoutParams(int i, int i5) {
            super(i, i5);
            this.f2106f = 0.0f;
            this.f2109t = 1.0f;
            this.w = -1;
            this.f2107p = -1.0f;
            this.f2108r = 16777215;
            this.f3 = 16777215;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f2106f = 0.0f;
            this.f2109t = 1.0f;
            this.w = -1;
            this.f2107p = -1.0f;
            this.f2108r = 16777215;
            this.f3 = 16777215;
            this.f2106f = parcel.readFloat();
            this.f2109t = parcel.readFloat();
            this.w = parcel.readInt();
            this.f2107p = parcel.readFloat();
            this.f2105co = parcel.readInt();
            this.z = parcel.readInt();
            this.f2108r = parcel.readInt();
            this.f3 = parcel.readInt();
            this.n = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        this.f2095f = -1;
        this.f2099p = new ArrayList();
        this.f2092co = new com.google.android.flexbox.n3(this);
        this.n = new n3();
        this.f2093d = -1;
        this.f2094ej = Integer.MIN_VALUE;
        this.f2104x = Integer.MIN_VALUE;
        this.f2091b = Integer.MIN_VALUE;
        this.f2098j5 = new SparseArray<>();
        this.j = -1;
        this.oz = new n3.C0061n3();
        RecyclerView.w.gv properties = RecyclerView.w.getProperties(context, attributeSet, i, i5);
        int i8 = properties.y;
        if (i8 != 0) {
            if (i8 == 1) {
                if (properties.zn) {
                    o(3);
                } else {
                    o(2);
                }
            }
        } else if (properties.zn) {
            o(1);
        } else {
            o(0);
        }
        j(1);
        qn(4);
        this.qn = context;
    }
}
