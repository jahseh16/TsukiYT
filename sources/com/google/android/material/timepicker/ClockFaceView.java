package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.timepicker.ClockHandView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import m3.zn;
import o.ud;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends zn implements ClockHandView.zn {
    public final int ct;
    public final int dm;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public final ColorStateList f2953eb;
    public final qn.y en;
    public final SparseArray<TextView> f7;
    public final int[] jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f2954k;
    public String[] o4;
    public final Rect q9;
    public float rs;
    public final float[] u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public final ClockHandView f2955ut;
    public final int xg;
    public final int y5;

    public class n3 extends qn.y {
        public n3() {
        }

        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            int iIntValue = ((Integer) view.getTag(R$id.f2256xc)).intValue();
            if (iIntValue > 0) {
                udVar.vp((View) ClockFaceView.this.f7.get(iIntValue - 1));
            }
            udVar.yg(ud.fb.y(0, 1, iIntValue, 1, false, view.isSelected()));
        }
    }

    public class y implements ViewTreeObserver.OnPreDrawListener {
        public y() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.i4(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f2955ut.fb()) - ClockFaceView.this.y5);
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f3);
    }

    public static float d(float f3, float f4, float f5) {
        return Math.max(Math.max(f3, f4), f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ej(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f7.size();
        for (int i5 = 0; i5 < Math.max(this.o4.length, size); i5++) {
            TextView textView = this.f7.get(i5);
            if (i5 >= this.o4.length) {
                removeView(textView);
                this.f7.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R$layout.f2260c5, (ViewGroup) this, false);
                    this.f7.put(i5, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.o4[i5]);
                textView.setTag(R$id.f2256xc, Integer.valueOf(i5));
                ut.g3(textView, this.en);
                textView.setTextColor(this.f2953eb);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.o4[i5]));
                }
            }
        }
    }

    @Override // m3.zn
    public void i4(int i) {
        if (i != x4()) {
            super.i4(i);
            this.f2955ut.i9(x4());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mg() {
        RectF rectFGv = this.f2955ut.gv();
        for (int i = 0; i < this.f7.size(); i++) {
            TextView textView = this.f7.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.q9);
                this.q9.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.q9);
                this.f2954k.set(this.q9);
                textView.getPaint().setShader(ta(rectFGv, this.f2954k));
                textView.invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.ViewGroup*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ud.w2(accessibilityNodeInfo).ap(ud.a.y(1, this.o4.length, false, 1));
    }

    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        mg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i5) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iD = (int) (this.ct / d(this.xg / displayMetrics.heightPixels, this.dm / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iD, 1073741824);
        setMeasuredDimension(iD, iD);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public final RadialGradient ta(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.f2954k.left, rectF.centerY() - this.f2954k.top, rectF.width() * 0.5f, this.jz, this.u, Shader.TileMode.CLAMP);
        }
        return null;
    }

    @Override // com.google.android.material.timepicker.ClockHandView.zn
    public void y(float f3, boolean z) {
        if (Math.abs(this.rs - f3) > 0.001f) {
            this.rs = f3;
            mg();
        }
    }

    public void z6(String[] strArr, int i) {
        this.o4 = strArr;
        ej(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q9 = new Rect();
        this.f2954k = new RectF();
        this.f7 = new SparseArray<>();
        this.u = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2437uo, i, R$style.c);
        Resources resources = getResources();
        ColorStateList colorStateListY = t2.zn.y(context, typedArrayObtainStyledAttributes, R$styleable.f2387mh);
        this.f2953eb = colorStateListY;
        LayoutInflater.from(context).inflate(R$layout.f2266i9, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R$id.f2241i9);
        this.f2955ut = clockHandView;
        this.y5 = resources.getDimensionPixelSize(R$dimen.f2213t);
        int colorForState = colorStateListY.getColorForState(new int[]{R.attr.state_selected}, colorStateListY.getDefaultColor());
        this.jz = new int[]{colorForState, colorForState, colorStateListY.getDefaultColor()};
        clockHandView.n3(this);
        int defaultColor = f.n3.zn(context, R$color.f2186a).getDefaultColor();
        ColorStateList colorStateListY2 = t2.zn.y(context, typedArrayObtainStyledAttributes, R$styleable.f2366im);
        setBackgroundColor(colorStateListY2 != null ? colorStateListY2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new y());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.en = new n3();
        String[] strArr = new String[12];
        Arrays.fill(strArr, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        z6(strArr, 0);
        this.xg = resources.getDimensionPixelSize(R$dimen.n);
        this.dm = resources.getDimensionPixelSize(R$dimen.c);
        this.ct = resources.getDimensionPixelSize(R$dimen.f2219wz);
    }
}
