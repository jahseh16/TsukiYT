package o2;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R$id;
import com.google.protobuf.Reader;
import qn.co;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class zn extends ViewGroup {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f7132fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7133s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7134v;
    public int y;

    public static int y(int i, int i5, int i8) {
        return i5 != Integer.MIN_VALUE ? i5 != 1073741824 ? i8 : i : Math.min(i8, i);
    }

    public int getItemSpacing() {
        return this.f7134v;
    }

    public int getLineSpacing() {
        return this.y;
    }

    public int getRowCount() {
        return this.f7133s;
    }

    public int n3(@NonNull View view) {
        Object tag = view.getTag(R$id.f2258z6);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        int iY;
        int iN3;
        if (getChildCount() == 0) {
            this.f7133s = 0;
            return;
        }
        this.f7133s = 1;
        boolean z5 = ut.ta(this) == 1;
        int paddingRight = z5 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z5 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i11 = (i8 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i12 = paddingTop;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R$id.f2258z6, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iN3 = co.n3(marginLayoutParams);
                    iY = co.y(marginLayoutParams);
                } else {
                    iY = 0;
                    iN3 = 0;
                }
                int measuredWidth2 = measuredWidth + iN3 + childAt.getMeasuredWidth();
                if (!this.f7132fb && measuredWidth2 > i11) {
                    i12 = this.y + paddingTop;
                    this.f7133s++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R$id.f2258z6, Integer.valueOf(this.f7133s - 1));
                int i14 = measuredWidth + iN3;
                int measuredWidth3 = childAt.getMeasuredWidth() + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z5) {
                    childAt.layout(i11 - measuredWidth3, i12, (i11 - measuredWidth) - iN3, measuredHeight);
                } else {
                    childAt.layout(i14, i12, measuredWidth3, measuredHeight);
                }
                measuredWidth += iN3 + iY + childAt.getMeasuredWidth() + this.f7134v;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i5) {
        int i8;
        int i10;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Reader.READ_DONE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i12 = paddingTop;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i8 = marginLayoutParams.leftMargin;
                    i10 = marginLayoutParams.rightMargin;
                } else {
                    i8 = 0;
                    i10 = 0;
                }
                int i15 = paddingLeft2;
                if (paddingLeft2 + i8 + childAt.getMeasuredWidth() <= paddingRight || zn()) {
                    paddingLeft = i15;
                } else {
                    paddingLeft = getPaddingLeft();
                    i12 = this.y + paddingTop;
                }
                int measuredWidth = paddingLeft + i8 + childAt.getMeasuredWidth();
                int measuredHeight = i12 + childAt.getMeasuredHeight();
                if (measuredWidth > i13) {
                    i13 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i8 + i10 + childAt.getMeasuredWidth() + this.f7134v;
                if (i14 == getChildCount() - 1) {
                    i13 += i10;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(y(size, mode, i13 + getPaddingRight()), y(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.f7134v = i;
    }

    public void setLineSpacing(int i) {
        this.y = i;
    }

    public void setSingleLine(boolean z) {
        this.f7132fb = z;
    }

    public boolean zn() {
        return this.f7132fb;
    }
}
