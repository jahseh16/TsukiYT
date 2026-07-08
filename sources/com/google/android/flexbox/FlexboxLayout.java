package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.flexbox.n3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements c1.y {
    public SparseIntArray c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f2074co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n3.C0061n3 f2075d;
    public n3 d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2076f;
    public int f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f2077fb;
    public List<y> fh;
    public int[] n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Drawable f2078p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2081t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2082v;

    @Nullable
    public Drawable w;
    public int y;
    public int z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // c1.y
    public void a(y yVar) {
        if (i9()) {
            if ((this.z & 4) > 0) {
                int i = yVar.f2155v;
                int i5 = this.f3;
                yVar.f2155v = i + i5;
                yVar.f2144a += i5;
                return;
            }
            return;
        }
        if ((this.f2074co & 4) > 0) {
            int i8 = yVar.f2155v;
            int i10 = this.f2079r;
            yVar.f2155v = i8 + i10;
            yVar.f2144a += i10;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.c == null) {
            this.c = new SparseIntArray(getChildCount());
        }
        this.n = this.d0.wz(view, i, layoutParams, this.c);
        super.addView(view, i, layoutParams);
    }

    public final void c(int i, int i5, int i8, int i10) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i10 = View.combineMeasuredStates(i10, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i5, i10);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i5, i10);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i10 = View.combineMeasuredStates(i10, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i5, i10);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i10 = View.combineMeasuredStates(i10, NotificationCompat.FLAG_LOCAL_ONLY);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i8, i10);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i8, i10);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i10 = View.combineMeasuredStates(i10, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i8, i10);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // c1.y
    public int c5(View view, int i, int i5) {
        int i8;
        int i10;
        if (i9()) {
            i8 = co(i, i5) ? this.f3 : 0;
            if ((this.z & 4) <= 0) {
                return i8;
            }
            i10 = this.f3;
        } else {
            i8 = co(i, i5) ? this.f2079r : 0;
            if ((this.f2074co & 4) <= 0) {
                return i8;
            }
            i10 = this.f2079r;
        }
        return i8 + i10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final boolean co(int i, int i5) {
        return t(i, i5) ? i9() ? (this.z & 1) != 0 : (this.f2074co & 1) != 0 : i9() ? (this.z & 2) != 0 : (this.f2074co & 2) != 0;
    }

    public final void d0() {
        if (this.w == null && this.f2078p == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    public final boolean f(int i) {
        for (int i5 = 0; i5 < i; i5++) {
            if (this.fh.get(i5).zn() > 0) {
                return false;
            }
        }
        return true;
    }

    public final void f3(int i, int i5) {
        this.fh.clear();
        this.f2075d.y();
        this.d0.zn(this.f2075d, i, i5);
        this.fh = this.f2075d.y;
        this.d0.w(i, i5);
        if (this.f2080s == 3) {
            for (y yVar : this.fh) {
                int iMax = Integer.MIN_VALUE;
                for (int i8 = 0; i8 < yVar.f2152s; i8++) {
                    View viewMt = mt(yVar.f2157xc + i8);
                    if (viewMt != null && viewMt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewMt.getLayoutParams();
                        iMax = this.f2082v != 2 ? Math.max(iMax, viewMt.getMeasuredHeight() + Math.max(yVar.f2153t - viewMt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewMt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((yVar.f2153t - viewMt.getMeasuredHeight()) + viewMt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                yVar.f2147fb = iMax;
            }
        }
        this.d0.xc(i, i5, getPaddingTop() + getPaddingBottom());
        this.d0.k();
        c(this.y, i, i5, this.f2075d.n3);
    }

    @Override // c1.y
    public View fb(int i) {
        return mt(i);
    }

    @Override // c1.y
    public int getAlignContent() {
        return this.f2076f;
    }

    @Override // c1.y
    public int getAlignItems() {
        return this.f2080s;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.w;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.f2078p;
    }

    @Override // c1.y
    public int getFlexDirection() {
        return this.y;
    }

    @Override // c1.y
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<y> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.fh.size());
        for (y yVar : this.fh) {
            if (yVar.zn() != 0) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    @Override // c1.y
    public List<y> getFlexLinesInternal() {
        return this.fh;
    }

    @Override // c1.y
    public int getFlexWrap() {
        return this.f2082v;
    }

    public int getJustifyContent() {
        return this.f2077fb;
    }

    @Override // c1.y
    public int getLargestMainSize() {
        Iterator<y> it = this.fh.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f2155v);
        }
        return iMax;
    }

    @Override // c1.y
    public int getMaxLine() {
        return this.f2081t;
    }

    public int getShowDividerHorizontal() {
        return this.f2074co;
    }

    public int getShowDividerVertical() {
        return this.z;
    }

    @Override // c1.y
    public int getSumOfCrossSize() {
        int size = this.fh.size();
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            y yVar = this.fh.get(i5);
            if (z(i5)) {
                i += i9() ? this.f2079r : this.f3;
            }
            if (r(i5)) {
                i += i9() ? this.f2079r : this.f3;
            }
            i += yVar.f2147fb;
        }
        return i;
    }

    @Override // c1.y
    public int gv(int i, int i5, int i8) {
        return ViewGroup.getChildMeasureSpec(i, i5, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i4(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.i4(boolean, boolean, int, int, int, int):void");
    }

    @Override // c1.y
    public boolean i9() {
        int i = this.y;
        return i == 0 || i == 1;
    }

    public View mt(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.n;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final void n(int i, int i5) {
        this.fh.clear();
        this.f2075d.y();
        this.d0.a(this.f2075d, i, i5);
        this.fh = this.f2075d.y;
        this.d0.w(i, i5);
        this.d0.xc(i, i5, getPaddingLeft() + getPaddingRight());
        this.d0.k();
        c(this.y, i, i5, this.f2075d.n3);
    }

    @Override // c1.y
    public int n3(int i, int i5, int i8) {
        return ViewGroup.getChildMeasureSpec(i, i5, i8);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f2078p == null && this.w == null) {
            return;
        }
        if (this.f2074co == 0 && this.z == 0) {
            return;
        }
        int iTa = ut.ta(this);
        int i = this.y;
        if (i == 0) {
            tl(canvas, iTa == 1, this.f2082v == 2);
            return;
        }
        if (i == 1) {
            tl(canvas, iTa != 1, this.f2082v == 2);
            return;
        }
        if (i == 2) {
            boolean z = iTa == 1;
            if (this.f2082v == 2) {
                z = !z;
            }
            wz(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z5 = iTa == 1;
        if (this.f2082v == 2) {
            z5 = !z5;
        }
        wz(canvas, z5, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        boolean z5;
        int iTa = ut.ta(this);
        int i11 = this.y;
        if (i11 == 0) {
            x4(iTa == 1, i, i5, i8, i10);
            return;
        }
        if (i11 == 1) {
            x4(iTa != 1, i, i5, i8, i10);
            return;
        }
        if (i11 == 2) {
            z5 = iTa == 1;
            i4(this.f2082v == 2 ? !z5 : z5, false, i, i5, i8, i10);
        } else if (i11 == 3) {
            z5 = iTa == 1;
            i4(this.f2082v == 2 ? !z5 : z5, true, i, i5, i8, i10);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.y);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i5) {
        if (this.c == null) {
            this.c = new SparseIntArray(getChildCount());
        }
        if (this.d0.vl(this.c)) {
            this.n = this.d0.tl(this.c);
        }
        int i8 = this.y;
        if (i8 == 0 || i8 == 1) {
            f3(i, i5);
            return;
        }
        if (i8 == 2 || i8 == 3) {
            n(i, i5);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.y);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final boolean r(int i) {
        if (i < 0 || i >= this.fh.size()) {
            return false;
        }
        for (int i5 = i + 1; i5 < this.fh.size(); i5++) {
            if (this.fh.get(i5).zn() > 0) {
                return false;
            }
        }
        return i9() ? (this.f2074co & 4) != 0 : (this.z & 4) != 0;
    }

    @Override // c1.y
    public void s(int i, View view) {
    }

    public void setAlignContent(int i) {
        if (this.f2076f != i) {
            this.f2076f = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f2080s != i) {
            this.f2080s = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.w) {
            return;
        }
        this.w = drawable;
        if (drawable != null) {
            this.f2079r = drawable.getIntrinsicHeight();
        } else {
            this.f2079r = 0;
        }
        d0();
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.f2078p) {
            return;
        }
        this.f2078p = drawable;
        if (drawable != null) {
            this.f3 = drawable.getIntrinsicWidth();
        } else {
            this.f3 = 0;
        }
        d0();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.y != i) {
            this.y = i;
            requestLayout();
        }
    }

    @Override // c1.y
    public void setFlexLines(List<y> list) {
        this.fh = list;
    }

    public void setFlexWrap(int i) {
        if (this.f2082v != i) {
            this.f2082v = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f2077fb != i) {
            this.f2077fb = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f2081t != i) {
            this.f2081t = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f2074co) {
            this.f2074co = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.z) {
            this.z = i;
            requestLayout();
        }
    }

    public final boolean t(int i, int i5) {
        for (int i8 = 1; i8 <= i5; i8++) {
            View viewMt = mt(i - i8);
            if (viewMt != null && viewMt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    public final void tl(Canvas canvas, boolean z, boolean z5) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.fh.size();
        for (int i = 0; i < size; i++) {
            y yVar = this.fh.get(i);
            for (int i5 = 0; i5 < yVar.f2152s; i5++) {
                int i8 = yVar.f2157xc + i5;
                View viewMt = mt(i8);
                if (viewMt != null && viewMt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewMt.getLayoutParams();
                    if (co(i8, i5)) {
                        w(canvas, z ? viewMt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewMt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f3, yVar.n3, yVar.f2147fb);
                    }
                    if (i5 == yVar.f2152s - 1 && (this.z & 4) > 0) {
                        w(canvas, z ? (viewMt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f3 : viewMt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, yVar.n3, yVar.f2147fb);
                    }
                }
            }
            if (z(i)) {
                xc(canvas, paddingLeft, z5 ? yVar.f2148gv : yVar.n3 - this.f2079r, iMax);
            }
            if (r(i) && (this.f2074co & 4) > 0) {
                xc(canvas, paddingLeft, z5 ? yVar.n3 - this.f2079r : yVar.f2148gv, iMax);
            }
        }
    }

    @Override // c1.y
    public int v(View view) {
        return 0;
    }

    public final void w(Canvas canvas, int i, int i5, int i8) {
        Drawable drawable = this.f2078p;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i5, this.f3 + i, i8 + i5);
        this.f2078p.draw(canvas);
    }

    public final void wz(Canvas canvas, boolean z, boolean z5) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.fh.size();
        for (int i = 0; i < size; i++) {
            y yVar = this.fh.get(i);
            for (int i5 = 0; i5 < yVar.f2152s; i5++) {
                int i8 = yVar.f2157xc + i5;
                View viewMt = mt(i8);
                if (viewMt != null && viewMt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewMt.getLayoutParams();
                    if (co(i8, i5)) {
                        xc(canvas, yVar.y, z5 ? viewMt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewMt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f2079r, yVar.f2147fb);
                    }
                    if (i5 == yVar.f2152s - 1 && (this.f2074co & 4) > 0) {
                        xc(canvas, yVar.y, z5 ? (viewMt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f2079r : viewMt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, yVar.f2147fb);
                    }
                }
            }
            if (z(i)) {
                w(canvas, z ? yVar.zn : yVar.y - this.f3, paddingTop, iMax);
            }
            if (r(i) && (this.z & 4) > 0) {
                w(canvas, z ? yVar.y - this.f3 : yVar.zn, paddingTop, iMax);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x4(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.x4(boolean, int, int, int, int):void");
    }

    public final void xc(Canvas canvas, int i, int i5, int i8) {
        Drawable drawable = this.w;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i5, i8 + i, this.f2079r + i5);
        this.w.draw(canvas);
    }

    @Override // c1.y
    public void y(View view, int i, int i5, y yVar) {
        if (co(i, i5)) {
            if (i9()) {
                int i8 = yVar.f2155v;
                int i10 = this.f3;
                yVar.f2155v = i8 + i10;
                yVar.f2144a += i10;
                return;
            }
            int i11 = yVar.f2155v;
            int i12 = this.f2079r;
            yVar.f2155v = i11 + i12;
            yVar.f2144a += i12;
        }
    }

    public final boolean z(int i) {
        if (i < 0 || i >= this.fh.size()) {
            return false;
        }
        return f(i) ? i9() ? (this.f2074co & 1) != 0 : (this.z & 1) != 0 : i9() ? (this.f2074co & 2) != 0 : (this.z & 2) != 0;
    }

    @Override // c1.y
    public View zn(int i) {
        return getChildAt(i);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2081t = -1;
        this.d0 = new n3(this);
        this.fh = new ArrayList();
        this.f2075d = new n3.C0061n3();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.n3, i, 0);
        this.y = typedArrayObtainStyledAttributes.getInt(R$styleable.f2134s, 0);
        this.f2082v = typedArrayObtainStyledAttributes.getInt(R$styleable.f2124c5, 0);
        this.f2077fb = typedArrayObtainStyledAttributes.getInt(R$styleable.f2130i9, 0);
        this.f2080s = typedArrayObtainStyledAttributes.getInt(R$styleable.f2128gv, 0);
        this.f2076f = typedArrayObtainStyledAttributes.getInt(R$styleable.zn, 0);
        this.f2081t = typedArrayObtainStyledAttributes.getInt(R$styleable.f2126f, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.f2137v);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.f2123a);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.f2127fb);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.f2135t, 0);
        if (i5 != 0) {
            this.z = i5;
            this.f2074co = i5;
        }
        int i8 = typedArrayObtainStyledAttributes.getInt(R$styleable.f2138wz, 0);
        if (i8 != 0) {
            this.z = i8;
        }
        int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.f2136tl, 0);
        if (i10 != 0) {
            this.f2074co = i10;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new y();

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f2083co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2084f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public float f2085fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2086p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2087s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2088t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f2089v;
        public int w;
        public int y;
        public boolean z;

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
            this.y = 1;
            this.f2089v = 0.0f;
            this.f2085fb = 1.0f;
            this.f2087s = -1;
            this.f2084f = -1.0f;
            this.f2088t = -1;
            this.w = -1;
            this.f2086p = 16777215;
            this.f2083co = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2140xc);
            this.y = typedArrayObtainStyledAttributes.getInt(R$styleable.f3, 1);
            this.f2089v = typedArrayObtainStyledAttributes.getFloat(R$styleable.f2131mt, 0.0f);
            this.f2085fb = typedArrayObtainStyledAttributes.getFloat(R$styleable.f2125co, 1.0f);
            this.f2087s = typedArrayObtainStyledAttributes.getInt(R$styleable.w, -1);
            this.f2084f = typedArrayObtainStyledAttributes.getFraction(R$styleable.f2132p, 1, 1, -1.0f);
            this.f2088t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f2129i4, -1);
            this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f2139x4, -1);
            this.f2086p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f2133r, 16777215);
            this.f2083co = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.z, 16777215);
            this.z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.n, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public void c(int i) {
            this.w = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int co() {
            return this.f2088t;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float d() {
            return this.f2084f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int eb() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.y;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int m() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int n() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int oz() {
            return this.f2086p;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int rs() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float rz() {
            return this.f2089v;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
            this.f2088t = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int t() {
            return this.f2087s;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int u0() {
            return this.w;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float w() {
            return this.f2085fb;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.y);
            parcel.writeFloat(this.f2089v);
            parcel.writeFloat(this.f2085fb);
            parcel.writeInt(this.f2087s);
            parcel.writeFloat(this.f2084f);
            parcel.writeInt(this.f2088t);
            parcel.writeInt(this.w);
            parcel.writeInt(this.f2086p);
            parcel.writeInt(this.f2083co);
            parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int y4() {
            return this.f2083co;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean yt() {
            return this.z;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.y = 1;
            this.f2089v = 0.0f;
            this.f2085fb = 1.0f;
            this.f2087s = -1;
            this.f2084f = -1.0f;
            this.f2088t = -1;
            this.w = -1;
            this.f2086p = 16777215;
            this.f2083co = 16777215;
            this.y = layoutParams.y;
            this.f2089v = layoutParams.f2089v;
            this.f2085fb = layoutParams.f2085fb;
            this.f2087s = layoutParams.f2087s;
            this.f2084f = layoutParams.f2084f;
            this.f2088t = layoutParams.f2088t;
            this.w = layoutParams.w;
            this.f2086p = layoutParams.f2086p;
            this.f2083co = layoutParams.f2083co;
            this.z = layoutParams.z;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.y = 1;
            this.f2089v = 0.0f;
            this.f2085fb = 1.0f;
            this.f2087s = -1;
            this.f2084f = -1.0f;
            this.f2088t = -1;
            this.w = -1;
            this.f2086p = 16777215;
            this.f2083co = 16777215;
        }

        public LayoutParams(int i, int i5) {
            super(new ViewGroup.LayoutParams(i, i5));
            this.y = 1;
            this.f2089v = 0.0f;
            this.f2085fb = 1.0f;
            this.f2087s = -1;
            this.f2084f = -1.0f;
            this.f2088t = -1;
            this.w = -1;
            this.f2086p = 16777215;
            this.f2083co = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.y = 1;
            this.f2089v = 0.0f;
            this.f2085fb = 1.0f;
            this.f2087s = -1;
            this.f2084f = -1.0f;
            this.f2088t = -1;
            this.w = -1;
            this.f2086p = 16777215;
            this.f2083co = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.y = 1;
            this.f2089v = 0.0f;
            this.f2085fb = 1.0f;
            this.f2087s = -1;
            this.f2084f = -1.0f;
            this.f2088t = -1;
            this.w = -1;
            this.f2086p = 16777215;
            this.f2083co = 16777215;
            this.y = parcel.readInt();
            this.f2089v = parcel.readFloat();
            this.f2085fb = parcel.readFloat();
            this.f2087s = parcel.readInt();
            this.f2084f = parcel.readFloat();
            this.f2088t = parcel.readInt();
            this.w = parcel.readInt();
            this.f2086p = parcel.readInt();
            this.f2083co = parcel.readInt();
            this.z = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
