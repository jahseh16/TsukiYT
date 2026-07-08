package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f1887fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f1888v;
    public final zn y;

    public interface n3 {
    }

    public final class zn implements Runnable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f1890fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f1891s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f1892v;
        public float y;

        public zn() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1891s = false;
            AspectRatioFrameLayout.y(AspectRatioFrameLayout.this);
        }

        public void y(float f3, float f4, boolean z) {
            this.y = f3;
            this.f1892v = f4;
            this.f1890fb = z;
            if (this.f1891s) {
                return;
            }
            this.f1891s = true;
            AspectRatioFrameLayout.this.post(this);
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1887fb = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.y, 0, 0);
            try {
                this.f1887fb = typedArrayObtainStyledAttributes.getInt(R$styleable.n3, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.y = new zn();
    }

    public static /* synthetic */ n3 y(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f1887fb;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i5) {
        float f3;
        float f4;
        super.onMeasure(i, i5);
        if (this.f1888v <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f5 = measuredWidth;
        float f7 = measuredHeight;
        float f8 = f5 / f7;
        float f9 = (this.f1888v / f8) - 1.0f;
        if (Math.abs(f9) <= 0.01f) {
            this.y.y(this.f1888v, f8, false);
            return;
        }
        int i8 = this.f1887fb;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    f3 = this.f1888v;
                } else if (i8 == 4) {
                    if (f9 > 0.0f) {
                        f3 = this.f1888v;
                    } else {
                        f4 = this.f1888v;
                    }
                }
                measuredWidth = (int) (f7 * f3);
            } else {
                f4 = this.f1888v;
            }
            measuredHeight = (int) (f5 / f4);
        } else if (f9 > 0.0f) {
            f4 = this.f1888v;
            measuredHeight = (int) (f5 / f4);
        } else {
            f3 = this.f1888v;
            measuredWidth = (int) (f7 * f3);
        }
        this.y.y(this.f1888v, f8, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f3) {
        if (this.f1888v != f3) {
            this.f1888v = f3;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable n3 n3Var) {
    }

    public void setResizeMode(int i) {
        if (this.f1887fb != i) {
            this.f1887fb = i;
            requestLayout();
        }
    }
}
