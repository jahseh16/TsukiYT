package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$styleable;
import qn.ut;
import z2.n3;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements n3 {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f2806fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2807s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Button f2808v;
    public TextView y;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.hu);
        this.f2806fb = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.oh, -1);
        this.f2807s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f2442v5, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void gv(@NonNull View view, int i, int i5) {
        if (ut.f7(view)) {
            ut.cy(view, ut.a8(view), i, ut.ud(view), i5);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i5);
        }
    }

    public Button getActionView() {
        return this.f2808v;
    }

    public TextView getMessageView() {
        return this.y;
    }

    @Override // z2.n3
    public void n3(int i, int i5) {
        this.y.setAlpha(1.0f);
        long j = i5;
        long j4 = i;
        this.y.animate().alpha(0.0f).setDuration(j).setStartDelay(j4).start();
        if (this.f2808v.getVisibility() == 0) {
            this.f2808v.setAlpha(1.0f);
            this.f2808v.animate().alpha(0.0f).setDuration(j).setStartDelay(j4).start();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.y = (TextView) findViewById(R$id.f2230a8);
        this.f2808v = (Button) findViewById(R$id.f2251ud);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (this.f2806fb > 0) {
            int measuredWidth = getMeasuredWidth();
            int i8 = this.f2806fb;
            if (measuredWidth > i8) {
                i = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                super.onMeasure(i, i5);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.f2201fb);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.f2193a);
        boolean z = this.y.getLayout().getLineCount() > 1;
        if (!z || this.f2807s <= 0 || this.f2808v.getMeasuredWidth() <= this.f2807s) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!v(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!v(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i5);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f2807s = i;
    }

    public final boolean v(int i, int i5, int i8) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.y.getPaddingTop() == i5 && this.y.getPaddingBottom() == i8) {
            return z;
        }
        gv(this.y, i5, i8);
        return true;
    }

    @Override // z2.n3
    public void y(int i, int i5) {
        this.y.setAlpha(0.0f);
        long j = i5;
        long j4 = i;
        this.y.animate().alpha(1.0f).setDuration(j).setStartDelay(j4).start();
        if (this.f2808v.getVisibility() == 0) {
            this.f2808v.setAlpha(0.0f);
            this.f2808v.animate().alpha(1.0f).setDuration(j).setStartDelay(j4).start();
        }
    }

    public void zn(float f3) {
        if (f3 != 1.0f) {
            this.f2808v.setTextColor(g2.y.s(g2.y.gv(this, R$attr.f2181wz), this.f2808v.getCurrentTextColor(), f3));
        }
    }
}
