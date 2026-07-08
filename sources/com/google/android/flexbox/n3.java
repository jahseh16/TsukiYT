package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import qn.co;

/* JADX INFO: loaded from: classes.dex */
public class n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public long[] f2141gv;
    public boolean[] n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public long[] f2142v;
    public final c1.y y;

    @Nullable
    public int[] zn;

    /* JADX INFO: renamed from: com.google.android.flexbox.n3$n3, reason: collision with other inner class name */
    public static class C0061n3 {
        public int n3;
        public List<com.google.android.flexbox.y> y;

        public void y() {
            this.y = null;
            this.n3 = 0;
        }
    }

    public static class zn implements Comparable<zn> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2143v;
        public int y;

        public zn() {
        }

        @NonNull
        public String toString() {
            return "Order{order=" + this.f2143v + ", index=" + this.y + '}';
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull zn znVar) {
            int i = this.f2143v;
            int i5 = znVar.f2143v;
            return i != i5 ? i - i5 : this.y - znVar.y;
        }
    }

    public n3(c1.y yVar) {
        this.y = yVar;
    }

    public void a(C0061n3 c0061n3, int i, int i5) {
        n3(c0061n3, i5, i, Reader.READ_DONE, 0, -1, null);
    }

    public final int a8(boolean z) {
        return z ? this.y.getPaddingTop() : this.y.getPaddingStart();
    }

    public final int b(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    public final int c(int i, FlexItem flexItem, int i5) {
        c1.y yVar = this.y;
        int iGv = yVar.gv(i, yVar.getPaddingTop() + this.y.getPaddingBottom() + flexItem.n() + flexItem.rs() + i5, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iGv);
        return size > flexItem.y4() ? View.MeasureSpec.makeMeasureSpec(flexItem.y4(), View.MeasureSpec.getMode(iGv)) : size < flexItem.u0() ? View.MeasureSpec.makeMeasureSpec(flexItem.u0(), View.MeasureSpec.getMode(iGv)) : iGv;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c5(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.co()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.co()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.oz()
            if (r1 <= r3) goto L26
            int r1 = r0.oz()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.u0()
            if (r2 >= r5) goto L32
            int r2 = r0.u0()
            goto L3e
        L32:
            int r5 = r0.y4()
            if (r2 <= r5) goto L3d
            int r2 = r0.y4()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.en(r8, r1, r0, r7)
            c1.y r0 = r6.y
            r0.s(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.n3.c5(android.view.View, int):void");
    }

    public void co(int i) {
        int[] iArr = this.zn;
        if (iArr == null) {
            this.zn = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.zn = Arrays.copyOf(this.zn, Math.max(iArr.length * 2, i));
        }
    }

    public final int d(FlexItem flexItem, boolean z) {
        return z ? flexItem.getHeight() : flexItem.getWidth();
    }

    public final int d0(int i, FlexItem flexItem, int i5) {
        c1.y yVar = this.y;
        int iN3 = yVar.n3(i, yVar.getPaddingLeft() + this.y.getPaddingRight() + flexItem.eb() + flexItem.m() + i5, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iN3);
        return size > flexItem.oz() ? View.MeasureSpec.makeMeasureSpec(flexItem.oz(), View.MeasureSpec.getMode(iN3)) : size < flexItem.co() ? View.MeasureSpec.makeMeasureSpec(flexItem.co(), View.MeasureSpec.getMode(iN3)) : iN3;
    }

    public final int ej(boolean z) {
        return z ? this.y.getPaddingBottom() : this.y.getPaddingEnd();
    }

    public final void en(int i, int i5, int i8, View view) {
        long[] jArr = this.f2141gv;
        if (jArr != null) {
            jArr[i] = o(i5, i8);
        }
        long[] jArr2 = this.f2142v;
        if (jArr2 != null) {
            jArr2[i] = o(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final List<com.google.android.flexbox.y> f(List<com.google.android.flexbox.y> list, int i, int i5) {
        int i8 = (i - i5) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.y yVar = new com.google.android.flexbox.y();
        yVar.f2147fb = i8;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 == 0) {
                arrayList.add(yVar);
            }
            arrayList.add(list.get(i10));
            if (i10 == list.size() - 1) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    public int f3(long j) {
        return (int) (j >> 32);
    }

    public void f7(int i) {
        View viewFb;
        if (i >= this.y.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.y.getFlexDirection();
        if (this.y.getAlignItems() != 4) {
            for (com.google.android.flexbox.y yVar : this.y.getFlexLinesInternal()) {
                for (Integer num : yVar.f2156wz) {
                    View viewFb2 = this.y.fb(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        q9(viewFb2, yVar.f2147fb, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        ut(viewFb2, yVar.f2147fb, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.zn;
        List<com.google.android.flexbox.y> flexLinesInternal = this.y.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i] : 0; i5 < size; i5++) {
            com.google.android.flexbox.y yVar2 = flexLinesInternal.get(i5);
            int i8 = yVar2.f2152s;
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = yVar2.f2157xc + i10;
                if (i10 < this.y.getFlexItemCount() && (viewFb = this.y.fb(i11)) != null && viewFb.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewFb.getLayoutParams();
                    if (flexItem.t() == -1 || flexItem.t() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            q9(viewFb, yVar2.f2147fb, i11);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            ut(viewFb, yVar2.f2147fb, i11);
                        }
                    }
                }
            }
        }
    }

    public void fb(C0061n3 c0061n3, int i, int i5, int i8, int i10, @Nullable List<com.google.android.flexbox.y> list) {
        n3(c0061n3, i5, i, i8, i10, -1, list);
    }

    public final int fh(FlexItem flexItem, boolean z) {
        return z ? flexItem.rs() : flexItem.m();
    }

    public void gv(C0061n3 c0061n3, int i, int i5, int i8, int i10, @Nullable List<com.google.android.flexbox.y> list) {
        n3(c0061n3, i, i5, i8, i10, -1, list);
    }

    public final boolean hw(View view, int i, int i5, int i8, int i10, FlexItem flexItem, int i11, int i12, int i13) {
        if (this.y.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.yt()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.y.getMaxLine();
        if (maxLine != -1 && maxLine <= i13 + 1) {
            return false;
        }
        int iC5 = this.y.c5(view, i11, i12);
        if (iC5 > 0) {
            i10 += iC5;
        }
        return i5 < i8 + i10;
    }

    public final void i4(int i, int i5, com.google.android.flexbox.y yVar, int i8, int i10, boolean z) {
        int i11;
        int i12;
        int iMax;
        double d4;
        int i13;
        double d5;
        float f3 = yVar.f2149i9;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i8 < (i11 = yVar.f2155v)) {
            return;
        }
        float f5 = (i8 - i11) / f3;
        yVar.f2155v = i10 + yVar.f2144a;
        if (!z) {
            yVar.f2147fb = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        float f7 = 0.0f;
        while (i14 < yVar.f2152s) {
            int i16 = yVar.f2157xc + i14;
            View viewFb = this.y.fb(i16);
            if (viewFb == null || viewFb.getVisibility() == 8) {
                i12 = i11;
            } else {
                FlexItem flexItem = (FlexItem) viewFb.getLayoutParams();
                int flexDirection = this.y.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i17 = i11;
                    int measuredWidth = viewFb.getMeasuredWidth();
                    long[] jArr = this.f2142v;
                    if (jArr != null) {
                        measuredWidth = n(jArr[i16]);
                    }
                    int measuredHeight = viewFb.getMeasuredHeight();
                    long[] jArr2 = this.f2142v;
                    i12 = i17;
                    if (jArr2 != null) {
                        measuredHeight = f3(jArr2[i16]);
                    }
                    if (!this.n3[i16] && flexItem.rz() > 0.0f) {
                        float fRz = measuredWidth + (flexItem.rz() * f5);
                        if (i14 == yVar.f2152s - 1) {
                            fRz += f7;
                            f7 = 0.0f;
                        }
                        int iRound = Math.round(fRz);
                        if (iRound > flexItem.oz()) {
                            iRound = flexItem.oz();
                            this.n3[i16] = true;
                            yVar.f2149i9 -= flexItem.rz();
                            z5 = true;
                        } else {
                            f7 += fRz - iRound;
                            double d6 = f7;
                            if (d6 > 1.0d) {
                                iRound++;
                                d4 = d6 - 1.0d;
                            } else if (d6 < -1.0d) {
                                iRound--;
                                d4 = d6 + 1.0d;
                            }
                            f7 = (float) d4;
                        }
                        int iC = c(i5, flexItem, yVar.f2154tl);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewFb.measure(iMakeMeasureSpec, iC);
                        int measuredWidth2 = viewFb.getMeasuredWidth();
                        int measuredHeight2 = viewFb.getMeasuredHeight();
                        en(i16, iMakeMeasureSpec, iC, viewFb);
                        this.y.s(i16, viewFb);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i15, measuredHeight + flexItem.n() + flexItem.rs() + this.y.v(viewFb));
                    yVar.f2155v += measuredWidth + flexItem.eb() + flexItem.m();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewFb.getMeasuredHeight();
                    long[] jArr3 = this.f2142v;
                    if (jArr3 != null) {
                        measuredHeight3 = f3(jArr3[i16]);
                    }
                    int measuredWidth3 = viewFb.getMeasuredWidth();
                    long[] jArr4 = this.f2142v;
                    if (jArr4 != null) {
                        measuredWidth3 = n(jArr4[i16]);
                    }
                    if (this.n3[i16] || flexItem.rz() <= f4) {
                        i13 = i11;
                    } else {
                        float fRz2 = measuredHeight3 + (flexItem.rz() * f5);
                        if (i14 == yVar.f2152s - 1) {
                            fRz2 += f7;
                            f7 = 0.0f;
                        }
                        int iRound2 = Math.round(fRz2);
                        if (iRound2 > flexItem.y4()) {
                            iRound2 = flexItem.y4();
                            this.n3[i16] = true;
                            yVar.f2149i9 -= flexItem.rz();
                            i13 = i11;
                            z5 = true;
                        } else {
                            f7 += fRz2 - iRound2;
                            i13 = i11;
                            double d7 = f7;
                            if (d7 > 1.0d) {
                                iRound2++;
                                d5 = d7 - 1.0d;
                            } else if (d7 < -1.0d) {
                                iRound2--;
                                d5 = d7 + 1.0d;
                            }
                            f7 = (float) d5;
                        }
                        int iD0 = d0(i, flexItem, yVar.f2154tl);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewFb.measure(iD0, iMakeMeasureSpec2);
                        measuredWidth3 = viewFb.getMeasuredWidth();
                        int measuredHeight4 = viewFb.getMeasuredHeight();
                        en(i16, iD0, iMakeMeasureSpec2, viewFb);
                        this.y.s(i16, viewFb);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i15, measuredWidth3 + flexItem.eb() + flexItem.m() + this.y.v(viewFb));
                    yVar.f2155v += measuredHeight3 + flexItem.n() + flexItem.rs();
                    i12 = i13;
                }
                yVar.f2147fb = Math.max(yVar.f2147fb, iMax);
                i15 = iMax;
            }
            i14++;
            i11 = i12;
            f4 = 0.0f;
        }
        int i18 = i11;
        if (!z5 || i18 == yVar.f2155v) {
            return;
        }
        i4(i, i5, yVar, i8, i10, true);
    }

    public void i9(List<com.google.android.flexbox.y> list, int i) {
        int i5 = this.zn[i];
        if (i5 == -1) {
            i5 = 0;
        }
        if (list.size() > i5) {
            list.subList(i5, list.size()).clear();
        }
        int[] iArr = this.zn;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f2141gv;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final void j(int i, int i5, com.google.android.flexbox.y yVar, int i8, int i10, boolean z) {
        int i11;
        int i12;
        int iMax;
        int i13 = yVar.f2155v;
        float f3 = yVar.f2146f;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i8 > i13) {
            return;
        }
        float f5 = (i13 - i8) / f3;
        yVar.f2155v = i10 + yVar.f2144a;
        if (!z) {
            yVar.f2147fb = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        float f7 = 0.0f;
        while (i14 < yVar.f2152s) {
            int i16 = yVar.f2157xc + i14;
            View viewFb = this.y.fb(i16);
            if (viewFb == null || viewFb.getVisibility() == 8) {
                i11 = i13;
                i12 = i14;
            } else {
                FlexItem flexItem = (FlexItem) viewFb.getLayoutParams();
                int flexDirection = this.y.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i11 = i13;
                    int i17 = i14;
                    int measuredWidth = viewFb.getMeasuredWidth();
                    long[] jArr = this.f2142v;
                    if (jArr != null) {
                        measuredWidth = n(jArr[i16]);
                    }
                    int measuredHeight = viewFb.getMeasuredHeight();
                    long[] jArr2 = this.f2142v;
                    if (jArr2 != null) {
                        measuredHeight = f3(jArr2[i16]);
                    }
                    if (this.n3[i16] || flexItem.w() <= 0.0f) {
                        i12 = i17;
                    } else {
                        float fW = measuredWidth - (flexItem.w() * f5);
                        i12 = i17;
                        if (i12 == yVar.f2152s - 1) {
                            fW += f7;
                            f7 = 0.0f;
                        }
                        int iRound = Math.round(fW);
                        if (iRound < flexItem.co()) {
                            iRound = flexItem.co();
                            this.n3[i16] = true;
                            yVar.f2146f -= flexItem.w();
                            z5 = true;
                        } else {
                            f7 += fW - iRound;
                            double d4 = f7;
                            if (d4 > 1.0d) {
                                iRound++;
                                f7 -= 1.0f;
                            } else if (d4 < -1.0d) {
                                iRound--;
                                f7 += 1.0f;
                            }
                        }
                        int iC = c(i5, flexItem, yVar.f2154tl);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewFb.measure(iMakeMeasureSpec, iC);
                        int measuredWidth2 = viewFb.getMeasuredWidth();
                        int measuredHeight2 = viewFb.getMeasuredHeight();
                        en(i16, iMakeMeasureSpec, iC, viewFb);
                        this.y.s(i16, viewFb);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i15, measuredHeight + flexItem.n() + flexItem.rs() + this.y.v(viewFb));
                    yVar.f2155v += measuredWidth + flexItem.eb() + flexItem.m();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewFb.getMeasuredHeight();
                    long[] jArr3 = this.f2142v;
                    if (jArr3 != null) {
                        measuredHeight3 = f3(jArr3[i16]);
                    }
                    int measuredWidth3 = viewFb.getMeasuredWidth();
                    long[] jArr4 = this.f2142v;
                    if (jArr4 != null) {
                        measuredWidth3 = n(jArr4[i16]);
                    }
                    if (this.n3[i16] || flexItem.w() <= f4) {
                        i11 = i13;
                        i12 = i14;
                    } else {
                        float fW2 = measuredHeight3 - (flexItem.w() * f5);
                        if (i14 == yVar.f2152s - 1) {
                            fW2 += f7;
                            f7 = 0.0f;
                        }
                        int iRound2 = Math.round(fW2);
                        if (iRound2 < flexItem.u0()) {
                            iRound2 = flexItem.u0();
                            this.n3[i16] = true;
                            yVar.f2146f -= flexItem.w();
                            i11 = i13;
                            i12 = i14;
                            z5 = true;
                        } else {
                            f7 += fW2 - iRound2;
                            i11 = i13;
                            i12 = i14;
                            double d5 = f7;
                            if (d5 > 1.0d) {
                                iRound2++;
                                f7 -= 1.0f;
                            } else if (d5 < -1.0d) {
                                iRound2--;
                                f7 += 1.0f;
                            }
                        }
                        int iD0 = d0(i, flexItem, yVar.f2154tl);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewFb.measure(iD0, iMakeMeasureSpec2);
                        measuredWidth3 = viewFb.getMeasuredWidth();
                        int measuredHeight4 = viewFb.getMeasuredHeight();
                        en(i16, iD0, iMakeMeasureSpec2, viewFb);
                        this.y.s(i16, viewFb);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i15, measuredWidth3 + flexItem.eb() + flexItem.m() + this.y.v(viewFb));
                    yVar.f2155v += measuredHeight3 + flexItem.n() + flexItem.rs();
                }
                yVar.f2147fb = Math.max(yVar.f2147fb, iMax);
                i15 = iMax;
            }
            i14 = i12 + 1;
            i13 = i11;
            f4 = 0.0f;
        }
        int i18 = i13;
        if (!z5 || i18 == yVar.f2155v) {
            return;
        }
        j(i, i5, yVar, i8, i10, true);
    }

    public void j5(View view, com.google.android.flexbox.y yVar, int i, int i5, int i8, int i10) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.y.getAlignItems();
        if (flexItem.t() != -1) {
            alignItems = flexItem.t();
        }
        int i11 = yVar.f2147fb;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.y.getFlexWrap() == 2) {
                    view.layout(i, (i5 - i11) + view.getMeasuredHeight() + flexItem.n(), i8, (i10 - i11) + view.getMeasuredHeight() + flexItem.n());
                    return;
                } else {
                    int i12 = i5 + i11;
                    view.layout(i, (i12 - view.getMeasuredHeight()) - flexItem.rs(), i8, i12 - flexItem.rs());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i11 - view.getMeasuredHeight()) + flexItem.n()) - flexItem.rs()) / 2;
                if (this.y.getFlexWrap() != 2) {
                    int i13 = i5 + measuredHeight;
                    view.layout(i, i13, i8, view.getMeasuredHeight() + i13);
                    return;
                } else {
                    int i14 = i5 - measuredHeight;
                    view.layout(i, i14, i8, view.getMeasuredHeight() + i14);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.y.getFlexWrap() != 2) {
                    int iMax = Math.max(yVar.f2153t - view.getBaseline(), flexItem.n());
                    view.layout(i, i5 + iMax, i8, i10 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((yVar.f2153t - view.getMeasuredHeight()) + view.getBaseline(), flexItem.rs());
                    view.layout(i, i5 - iMax2, i8, i10 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.y.getFlexWrap() != 2) {
            view.layout(i, i5 + flexItem.n(), i8, i10 + flexItem.n());
        } else {
            view.layout(i, i5 - flexItem.rs(), i8, i10 - flexItem.rs());
        }
    }

    public void k() {
        f7(0);
    }

    public final int k5(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    public final int mg(FlexItem flexItem, boolean z) {
        return z ? flexItem.n() : flexItem.eb();
    }

    public final void mt(int i) {
        boolean[] zArr = this.n3;
        if (zArr == null) {
            this.n3 = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.n3 = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public int n(long j) {
        return (int) j;
    }

    public void n3(C0061n3 c0061n3, int i, int i5, int i8, int i10, int i11, @Nullable List<com.google.android.flexbox.y> list) {
        int i12;
        C0061n3 c0061n32;
        int i13;
        int i14;
        int i15;
        List<com.google.android.flexbox.y> list2;
        int i16;
        View view;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        com.google.android.flexbox.y yVar;
        int i25;
        int i26 = i;
        int i27 = i5;
        int i28 = i11;
        boolean zI9 = this.y.i9();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<com.google.android.flexbox.y> arrayList = list == null ? new ArrayList() : list;
        c0061n3.y = arrayList;
        boolean z = i28 == -1;
        int iX = x(zI9);
        int iUd = ud(zI9);
        int iA8 = a8(zI9);
        int iEj = ej(zI9);
        com.google.android.flexbox.y yVar2 = new com.google.android.flexbox.y();
        int i29 = i10;
        yVar2.f2157xc = i29;
        int i30 = iUd + iX;
        yVar2.f2155v = i30;
        int flexItemCount = this.y.getFlexItemCount();
        boolean z5 = z;
        int i31 = 0;
        int iCombineMeasuredStates = 0;
        int i32 = 0;
        int i33 = Integer.MIN_VALUE;
        while (true) {
            if (i29 >= flexItemCount) {
                i12 = iCombineMeasuredStates;
                c0061n32 = c0061n3;
                break;
            }
            View viewFb = this.y.fb(i29);
            if (viewFb != null) {
                if (viewFb.getVisibility() != 8) {
                    if (viewFb instanceof CompoundButton) {
                        x4((CompoundButton) viewFb);
                    }
                    FlexItem flexItem = (FlexItem) viewFb.getLayoutParams();
                    int i34 = flexItemCount;
                    if (flexItem.t() == 4) {
                        yVar2.f2156wz.add(Integer.valueOf(i29));
                    }
                    int iZ6 = z6(flexItem, zI9);
                    if (flexItem.d() != -1.0f && mode == 1073741824) {
                        iZ6 = Math.round(size * flexItem.d());
                    }
                    if (zI9) {
                        int iN3 = this.y.n3(i26, i30 + ta(flexItem, true) + rz(flexItem, true), iZ6);
                        i13 = size;
                        i14 = mode;
                        int iGv = this.y.gv(i27, iA8 + iEj + mg(flexItem, true) + fh(flexItem, true) + i31, d(flexItem, true));
                        viewFb.measure(iN3, iGv);
                        en(i29, iN3, iGv, viewFb);
                        i15 = iN3;
                    } else {
                        i13 = size;
                        i14 = mode;
                        int iN32 = this.y.n3(i27, iA8 + iEj + mg(flexItem, false) + fh(flexItem, false) + i31, d(flexItem, false));
                        int iGv2 = this.y.gv(i26, ta(flexItem, false) + i30 + rz(flexItem, false), iZ6);
                        viewFb.measure(iN32, iGv2);
                        en(i29, iN32, iGv2, viewFb);
                        i15 = iGv2;
                    }
                    this.y.s(i29, viewFb);
                    c5(viewFb, i29);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewFb.getMeasuredState());
                    int i35 = i31;
                    int i36 = i30;
                    com.google.android.flexbox.y yVar3 = yVar2;
                    int i37 = i29;
                    list2 = arrayList;
                    int i38 = i15;
                    if (hw(viewFb, i14, i13, yVar2.f2155v, rz(flexItem, zI9) + k5(viewFb, zI9) + ta(flexItem, zI9), flexItem, i37, i32, arrayList.size())) {
                        i29 = i37;
                        if (yVar3.zn() > 0) {
                            if (i29 > 0) {
                                i25 = i29 - 1;
                                yVar = yVar3;
                            } else {
                                yVar = yVar3;
                                i25 = 0;
                            }
                            y(list2, yVar, i25, i35);
                            i31 = yVar.f2147fb + i35;
                        } else {
                            i31 = i35;
                        }
                        if (!zI9) {
                            i16 = i5;
                            view = viewFb;
                            i19 = -1;
                            if (flexItem.getWidth() == -1) {
                                c1.y yVar4 = this.y;
                                view.measure(yVar4.n3(i16, yVar4.getPaddingLeft() + this.y.getPaddingRight() + flexItem.eb() + flexItem.m() + i31, flexItem.getWidth()), i38);
                                c5(view, i29);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            c1.y yVar5 = this.y;
                            i16 = i5;
                            i19 = -1;
                            view = viewFb;
                            view.measure(i38, yVar5.gv(i16, yVar5.getPaddingTop() + this.y.getPaddingBottom() + flexItem.n() + flexItem.rs() + i31, flexItem.getHeight()));
                            c5(view, i29);
                        } else {
                            i16 = i5;
                            view = viewFb;
                            i19 = -1;
                        }
                        yVar2 = new com.google.android.flexbox.y();
                        i18 = 1;
                        yVar2.f2152s = 1;
                        i17 = i36;
                        yVar2.f2155v = i17;
                        yVar2.f2157xc = i29;
                        i20 = 0;
                        i21 = Integer.MIN_VALUE;
                    } else {
                        i16 = i5;
                        i29 = i37;
                        view = viewFb;
                        yVar2 = yVar3;
                        i17 = i36;
                        i18 = 1;
                        i19 = -1;
                        yVar2.f2152s++;
                        i20 = i32 + 1;
                        i31 = i35;
                        i21 = i33;
                    }
                    yVar2.f2151p |= flexItem.rz() != 0.0f;
                    yVar2.f2150mt |= flexItem.w() != 0.0f;
                    int[] iArr = this.zn;
                    if (iArr != null) {
                        iArr[i29] = list2.size();
                    }
                    yVar2.f2155v += k5(view, zI9) + ta(flexItem, zI9) + rz(flexItem, zI9);
                    yVar2.f2149i9 += flexItem.rz();
                    yVar2.f2146f += flexItem.w();
                    this.y.y(view, i29, i20, yVar2);
                    int iMax = Math.max(i21, b(view, zI9) + mg(flexItem, zI9) + fh(flexItem, zI9) + this.y.v(view));
                    yVar2.f2147fb = Math.max(yVar2.f2147fb, iMax);
                    if (zI9) {
                        if (this.y.getFlexWrap() != 2) {
                            yVar2.f2153t = Math.max(yVar2.f2153t, view.getBaseline() + flexItem.n());
                        } else {
                            yVar2.f2153t = Math.max(yVar2.f2153t, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.rs());
                        }
                    }
                    i22 = i34;
                    if (yt(i29, i22, yVar2)) {
                        y(list2, yVar2, i29, i31);
                        i31 += yVar2.f2147fb;
                    }
                    i23 = i11;
                    if (i23 == i19 || list2.size() <= 0 || list2.get(list2.size() - i18).w < i23 || i29 < i23 || z5) {
                        i24 = i8;
                    } else {
                        i31 = -yVar2.y();
                        i24 = i8;
                        z5 = true;
                    }
                    if (i31 > i24 && z5) {
                        c0061n32 = c0061n3;
                        i12 = iCombineMeasuredStates;
                        break;
                    }
                    i32 = i20;
                    i33 = iMax;
                    i29++;
                    i26 = i;
                    flexItemCount = i22;
                    i27 = i16;
                    i30 = i17;
                    arrayList = list2;
                    size = i13;
                    mode = i14;
                    i28 = i23;
                } else {
                    yVar2.f2145c5++;
                    yVar2.f2152s++;
                    if (yt(i29, flexItemCount, yVar2)) {
                        y(arrayList, yVar2, i29, i31);
                    }
                }
            } else if (yt(i29, flexItemCount, yVar2)) {
                y(arrayList, yVar2, i29, i31);
            }
            i13 = size;
            i14 = mode;
            i16 = i27;
            i23 = i28;
            i17 = i30;
            list2 = arrayList;
            i22 = flexItemCount;
            i29++;
            i26 = i;
            flexItemCount = i22;
            i27 = i16;
            i30 = i17;
            arrayList = list2;
            size = i13;
            mode = i14;
            i28 = i23;
        }
        c0061n32.n3 = i12;
    }

    public long o(int i, int i5) {
        return (((long) i) & 4294967295L) | (((long) i5) << 32);
    }

    public final int[] oz(int i, List<zn> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i5 = 0;
        for (zn znVar : list) {
            int i8 = znVar.y;
            iArr[i5] = i8;
            sparseIntArray.append(i8, znVar.f2143v);
            i5++;
        }
        return iArr;
    }

    public void p(int i, int i5, int i8) {
        int size;
        int paddingLeft;
        int paddingRight;
        mt(this.y.getFlexItemCount());
        if (i8 >= this.y.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.y.getFlexDirection();
        int flexDirection2 = this.y.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.y.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.y.getPaddingLeft();
            paddingRight = this.y.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i5);
            size = View.MeasureSpec.getSize(i5);
            if (mode2 != 1073741824) {
                size = this.y.getLargestMainSize();
            }
            paddingLeft = this.y.getPaddingTop();
            paddingRight = this.y.getPaddingBottom();
        }
        int i10 = paddingLeft + paddingRight;
        int[] iArr = this.zn;
        List<com.google.android.flexbox.y> flexLinesInternal = this.y.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i11 = iArr != null ? iArr[i8] : 0; i11 < size2; i11++) {
            com.google.android.flexbox.y yVar = flexLinesInternal.get(i11);
            int i12 = yVar.f2155v;
            if (i12 < size && yVar.f2151p) {
                i4(i, i5, yVar, size, i10, false);
            } else if (i12 > size && yVar.f2150mt) {
                j(i, i5, yVar, size, i10, false);
            }
        }
    }

    public final void q9(View view, int i, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.n()) - flexItem.rs()) - this.y.v(view), flexItem.u0()), flexItem.y4());
        long[] jArr = this.f2142v;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? n(jArr[i5]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        en(i5, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.y.s(i5, view);
    }

    public void qn(View view, com.google.android.flexbox.y yVar, boolean z, int i, int i5, int i8, int i10) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.y.getAlignItems();
        if (flexItem.t() != -1) {
            alignItems = flexItem.t();
        }
        int i11 = yVar.f2147fb;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z) {
                    view.layout((i - i11) + view.getMeasuredWidth() + flexItem.eb(), i5, (i8 - i11) + view.getMeasuredWidth() + flexItem.eb(), i10);
                    return;
                } else {
                    view.layout(((i + i11) - view.getMeasuredWidth()) - flexItem.m(), i5, ((i8 + i11) - view.getMeasuredWidth()) - flexItem.m(), i10);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i11 - view.getMeasuredWidth()) + co.n3(marginLayoutParams)) - co.y(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - measuredWidth, i5, i8 - measuredWidth, i10);
                    return;
                } else {
                    view.layout(i + measuredWidth, i5, i8 + measuredWidth, i10);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.m(), i5, i8 - flexItem.m(), i10);
        } else {
            view.layout(i + flexItem.eb(), i5, i8 + flexItem.eb(), i10);
        }
    }

    public void r(int i) {
        long[] jArr = this.f2142v;
        if (jArr == null) {
            this.f2142v = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f2142v = Arrays.copyOf(this.f2142v, Math.max(jArr.length * 2, i));
        }
    }

    public final int rz(FlexItem flexItem, boolean z) {
        return z ? flexItem.m() : flexItem.rs();
    }

    public void s(C0061n3 c0061n3, int i, int i5, int i8, int i10, List<com.google.android.flexbox.y> list) {
        n3(c0061n3, i5, i, i8, 0, i10, list);
    }

    @NonNull
    public final List<zn> t(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            FlexItem flexItem = (FlexItem) this.y.zn(i5).getLayoutParams();
            zn znVar = new zn();
            znVar.f2143v = flexItem.getOrder();
            znVar.y = i5;
            arrayList.add(znVar);
        }
        return arrayList;
    }

    public final int ta(FlexItem flexItem, boolean z) {
        return z ? flexItem.eb() : flexItem.n();
    }

    public int[] tl(SparseIntArray sparseIntArray) {
        int flexItemCount = this.y.getFlexItemCount();
        return oz(flexItemCount, t(flexItemCount), sparseIntArray);
    }

    public final int ud(boolean z) {
        return z ? this.y.getPaddingEnd() : this.y.getPaddingBottom();
    }

    public final void ut(View view, int i, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.eb()) - flexItem.m()) - this.y.v(view), flexItem.co()), flexItem.oz());
        long[] jArr = this.f2142v;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? f3(jArr[i5]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        en(i5, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.y.s(i5, view);
    }

    public void v(C0061n3 c0061n3, int i, int i5, int i8, int i10, List<com.google.android.flexbox.y> list) {
        n3(c0061n3, i, i5, i8, 0, i10, list);
    }

    public boolean vl(SparseIntArray sparseIntArray) {
        int flexItemCount = this.y.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewZn = this.y.zn(i);
            if (viewZn != null && ((FlexItem) viewZn.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void w(int i, int i5) {
        p(i, i5, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] wz(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.y.getFlexItemCount();
        List<zn> listT = t(flexItemCount);
        zn znVar = new zn();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            znVar.f2143v = 1;
        } else {
            znVar.f2143v = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= this.y.getFlexItemCount()) {
            znVar.y = flexItemCount;
        } else {
            znVar.y = i;
            while (i < flexItemCount) {
                listT.get(i).y++;
                i++;
            }
        }
        listT.add(znVar);
        return oz(flexItemCount + 1, listT, sparseIntArray);
    }

    public final int x(boolean z) {
        return z ? this.y.getPaddingStart() : this.y.getPaddingTop();
    }

    public final void x4(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int iCo = flexItem.co();
        int iU0 = flexItem.u0();
        Drawable drawableY = ut.zn.y(compoundButton);
        int minimumWidth = drawableY == null ? 0 : drawableY.getMinimumWidth();
        int minimumHeight = drawableY != null ? drawableY.getMinimumHeight() : 0;
        if (iCo == -1) {
            iCo = minimumWidth;
        }
        flexItem.setMinWidth(iCo);
        if (iU0 == -1) {
            iU0 = minimumHeight;
        }
        flexItem.c(iU0);
    }

    public void xc(int i, int i5, int i8) {
        int mode;
        int size;
        int flexDirection = this.y.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i5);
            int size2 = View.MeasureSpec.getSize(i5);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<com.google.android.flexbox.y> flexLinesInternal = this.y.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.y.getSumOfCrossSize() + i8;
            int i10 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f2147fb = size - i8;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.y.getAlignContent();
                if (alignContent == 1) {
                    int i11 = size - sumOfCrossSize;
                    com.google.android.flexbox.y yVar = new com.google.android.flexbox.y();
                    yVar.f2147fb = i11;
                    flexLinesInternal.add(0, yVar);
                    return;
                }
                if (alignContent == 2) {
                    this.y.setFlexLines(f(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i10 < size4) {
                        arrayList.add(flexLinesInternal.get(i10));
                        if (i10 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.y yVar2 = new com.google.android.flexbox.y();
                            if (i10 == flexLinesInternal.size() - 2) {
                                yVar2.f2147fb = Math.round(f3 + size3);
                                f3 = 0.0f;
                            } else {
                                yVar2.f2147fb = Math.round(size3);
                            }
                            int i12 = yVar2.f2147fb;
                            f3 += size3 - i12;
                            if (f3 > 1.0f) {
                                yVar2.f2147fb = i12 + 1;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                yVar2.f2147fb = i12 - 1;
                                f3 += 1.0f;
                            }
                            arrayList.add(yVar2);
                        }
                        i10++;
                    }
                    this.y.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.y.setFlexLines(f(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.y yVar3 = new com.google.android.flexbox.y();
                    yVar3.f2147fb = size5;
                    for (com.google.android.flexbox.y yVar4 : flexLinesInternal) {
                        arrayList2.add(yVar3);
                        arrayList2.add(yVar4);
                        arrayList2.add(yVar3);
                    }
                    this.y.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f4 = 0.0f;
                    while (i10 < size7) {
                        com.google.android.flexbox.y yVar5 = flexLinesInternal.get(i10);
                        float f5 = yVar5.f2147fb + size6;
                        if (i10 == flexLinesInternal.size() - 1) {
                            f5 += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(f5);
                        f4 += f5 - iRound;
                        if (f4 > 1.0f) {
                            iRound++;
                            f4 -= 1.0f;
                        } else if (f4 < -1.0f) {
                            iRound--;
                            f4 += 1.0f;
                        }
                        yVar5.f2147fb = iRound;
                        i10++;
                    }
                }
            }
        }
    }

    public final void y(List<com.google.android.flexbox.y> list, com.google.android.flexbox.y yVar, int i, int i5) {
        yVar.f2154tl = i5;
        this.y.a(yVar);
        yVar.w = i;
        list.add(yVar);
    }

    public final boolean yt(int i, int i5, com.google.android.flexbox.y yVar) {
        return i == i5 - 1 && yVar.zn() != 0;
    }

    public void z(int i) {
        long[] jArr = this.f2141gv;
        if (jArr == null) {
            this.f2141gv = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f2141gv = Arrays.copyOf(this.f2141gv, Math.max(jArr.length * 2, i));
        }
    }

    public final int z6(FlexItem flexItem, boolean z) {
        return z ? flexItem.getWidth() : flexItem.getHeight();
    }

    public void zn(C0061n3 c0061n3, int i, int i5) {
        n3(c0061n3, i, i5, Reader.READ_DONE, 0, -1, null);
    }
}
