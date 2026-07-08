package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o2.t;
import qn.ut;
import t2.zn;
import y2.f;
import y2.s;
import y2.wz;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, wz {
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f2596co;
    public int d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public n3 f2597f;
    public int f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public final z1.y f2598fb;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Drawable f2599p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<y> f2601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f2602t;

    @Nullable
    public ColorStateList w;
    public int z;
    public static final int[] fh = {R.attr.state_checkable};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2594d = {R.attr.state_checked};

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final int f2595ej = R$style.f2307wz;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f2603fb;

        public static class y implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void n3(@NonNull Parcel parcel) {
            this.f2603fb = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2603fb ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            n3(parcel);
        }
    }

    public interface n3 {
        void y(MaterialButton materialButton, boolean z);
    }

    public interface y {
        void y(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2174r);
    }

    @NonNull
    private String getA11yClassName() {
        return (n3() ? CompoundButton.class : Button.class).getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ut.ta(this) == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c5() {
        if (gv()) {
            ut.wz.i9(this, this.f2599p, null, null, null);
        } else if (zn()) {
            ut.wz.i9(this, null, null, this.f2599p, null);
        } else if (v()) {
            ut.wz.i9(this, null, this.f2599p, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i, int i5) {
        if (this.f2599p == null || getLayout() == null) {
            return;
        }
        if (!gv() && !zn()) {
            if (v()) {
                this.z = 0;
                if (this.d0 == 16) {
                    this.f2600r = 0;
                    i9(false);
                    return;
                }
                int intrinsicHeight = this.f2596co;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f2599p.getIntrinsicHeight();
                }
                int textHeight = (((((i5 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f3) - getPaddingBottom()) / 2;
                if (this.f2600r != textHeight) {
                    this.f2600r = textHeight;
                    i9(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2600r = 0;
        int i8 = this.d0;
        if (i8 == 1 || i8 == 3) {
            this.z = 0;
            i9(false);
            return;
        }
        int intrinsicWidth = this.f2596co;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f2599p.getIntrinsicWidth();
        }
        int textWidth = (((((i - getTextWidth()) - ut.ud(this)) - intrinsicWidth) - this.f3) - ut.a8(this)) / 2;
        if (a() != (this.d0 == 4)) {
            textWidth = -textWidth;
        }
        if (this.z != textWidth) {
            this.z = textWidth;
            i9(false);
        }
    }

    public final boolean fb() {
        z1.y yVar = this.f2598fb;
        return (yVar == null || yVar.xc()) ? false : true;
    }

    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (fb()) {
            return this.f2598fb.n3();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2599p;
    }

    public int getIconGravity() {
        return this.d0;
    }

    public int getIconPadding() {
        return this.f3;
    }

    public int getIconSize() {
        return this.f2596co;
    }

    public ColorStateList getIconTint() {
        return this.w;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2602t;
    }

    public int getInsetBottom() {
        return this.f2598fb.zn();
    }

    public int getInsetTop() {
        return this.f2598fb.gv();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (fb()) {
            return this.f2598fb.s();
        }
        return null;
    }

    @NonNull
    public f getShapeAppearanceModel() {
        if (fb()) {
            return this.f2598fb.c5();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (fb()) {
            return this.f2598fb.i9();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (fb()) {
            return this.f2598fb.f();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return fb() ? this.f2598fb.t() : super.getSupportBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return fb() ? this.f2598fb.tl() : super.getSupportBackgroundTintMode();
    }

    public final boolean gv() {
        int i = this.d0;
        return i == 1 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i9(boolean z) {
        Drawable drawable = this.f2599p;
        if (drawable != null) {
            Drawable drawableMutate = a8.y.mt(drawable).mutate();
            this.f2599p = drawableMutate;
            a8.y.xc(drawableMutate, this.w);
            PorterDuff.Mode mode = this.f2602t;
            if (mode != null) {
                a8.y.w(this.f2599p, mode);
            }
            int intrinsicWidth = this.f2596co;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f2599p.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f2596co;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f2599p.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2599p;
            int i = this.z;
            int i5 = this.f2600r;
            drawable2.setBounds(i, i5, intrinsicWidth + i, intrinsicHeight + i5);
        }
        if (z) {
            c5();
            return;
        }
        Drawable[] drawableArrY = ut.wz.y(this);
        Drawable drawable3 = drawableArrY[0];
        Drawable drawable4 = drawableArrY[1];
        Drawable drawable5 = drawableArrY[2];
        if ((!gv() || drawable3 == this.f2599p) && ((!zn() || drawable5 == this.f2599p) && (!v() || drawable4 == this.f2599p))) {
            return;
        }
        c5();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.n;
    }

    public boolean n3() {
        z1.y yVar = this.f2598fb;
        return yVar != null && yVar.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.Button*/.onAttachedToWindow();
        if (fb()) {
            s.a(this, this.f2598fb.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super/*android.widget.Button*/.onCreateDrawableState(i + 2);
        if (n3()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, fh);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2594d);
        }
        return iArrOnCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(n3());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        z1.y yVar;
        super.onLayout(z, i, i5, i8, i10);
        if (Build.VERSION.SDK_INT != 21 || (yVar = this.f2598fb) == null) {
            return;
        }
        yVar.ej(i10 - i5, i8 - i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super/*android.widget.Button*/.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super/*android.widget.Button*/.onRestoreInstanceState(savedState.y());
        setChecked(savedState.f2603fb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super/*android.widget.Button*/.onSaveInstanceState());
        savedState.f2603fb = this.n;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i5, int i8, int i10) {
        super/*android.widget.Button*/.onSizeChanged(i, i5, i8, i10);
        f(i, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i5, int i8) {
        super.onTextChanged(charSequence, i, i5, i8);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        toggle();
        return super/*android.widget.Button*/.performClick();
    }

    public void s(@NonNull y yVar) {
        this.f2601s.remove(yVar);
    }

    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundColor(int i) {
        if (fb()) {
            this.f2598fb.mt(i);
        } else {
            super/*android.widget.Button*/.setBackgroundColor(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!fb()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f2598fb.co();
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? f.n3.gv(getContext(), i) : null);
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (fb()) {
            this.f2598fb.z(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (n3() && isEnabled() && this.n != z) {
            this.n = z;
            refreshDrawableState();
            if (this.c) {
                return;
            }
            this.c = true;
            Iterator<y> it = this.f2601s.iterator();
            while (it.hasNext()) {
                it.next().y(this, this.n);
            }
            this.c = false;
        }
    }

    public void setCornerRadius(int i) {
        if (fb()) {
            this.f2598fb.r(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCornerRadiusResource(int i) {
        if (fb()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f3) {
        super/*android.widget.Button*/.setElevation(f3);
        if (fb()) {
            this.f2598fb.a().q9(f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(@Nullable Drawable drawable) {
        if (this.f2599p != drawable) {
            this.f2599p = drawable;
            i9(true);
            f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconGravity(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconPadding(int i) {
        if (this.f3 != i) {
            this.f3 = i;
            setCompoundDrawablePadding(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconResource(int i) {
        setIcon(i != 0 ? f.n3.gv(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2596co != i) {
            this.f2596co = i;
            i9(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            i9(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2602t != mode) {
            this.f2602t = mode;
            i9(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconTintResource(int i) {
        setIconTint(f.n3.zn(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f2598fb.x4(i);
    }

    public void setInsetTop(int i) {
        this.f2598fb.i4(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable n3 n3Var) {
        this.f2597f = n3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        n3 n3Var = this.f2597f;
        if (n3Var != null) {
            n3Var.y(this, z);
        }
        super/*android.widget.Button*/.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (fb()) {
            this.f2598fb.f3(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRippleColorResource(int i) {
        if (fb()) {
            setRippleColor(f.n3.zn(getContext(), i));
        }
    }

    @Override // y2.wz
    public void setShapeAppearanceModel(@NonNull f fVar) {
        if (!fb()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2598fb.n(fVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (fb()) {
            this.f2598fb.c(z);
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (fb()) {
            this.f2598fb.d0(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColorResource(int i) {
        if (fb()) {
            setStrokeColor(f.n3.zn(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (fb()) {
            this.f2598fb.fh(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidthResource(int i) {
        if (fb()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (fb()) {
            this.f2598fb.rz(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (fb()) {
            this.f2598fb.mg(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.n);
    }

    public final boolean v() {
        int i = this.d0;
        return i == 16 || i == 32;
    }

    public void y(@NonNull y yVar) {
        this.f2601s.add(yVar);
    }

    public final boolean zn() {
        int i = this.d0;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5 = f2595ej;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        this.f2601s = new LinkedHashSet<>();
        this.n = false;
        this.c = false;
        Context context2 = getContext();
        TypedArray typedArrayS = o2.f.s(context2, attributeSet, R$styleable.t7, i, i5, new int[0]);
        this.f3 = typedArrayS.getDimensionPixelSize(R$styleable.ng, 0);
        this.f2602t = t.v(typedArrayS.getInt(R$styleable.t3, -1), PorterDuff.Mode.SRC_IN);
        this.w = zn.y(getContext(), typedArrayS, R$styleable.t6);
        this.f2599p = zn.gv(getContext(), typedArrayS, R$styleable.cp);
        this.d0 = typedArrayS.getInteger(R$styleable.gd, 1);
        this.f2596co = typedArrayS.getDimensionPixelSize(R$styleable.y0, 0);
        z1.y yVar = new z1.y(this, f.v(context2, attributeSet, i, i5).tl());
        this.f2598fb = yVar;
        yVar.p(typedArrayS);
        typedArrayS.recycle();
        setCompoundDrawablePadding(this.f3);
        i9(this.f2599p != null);
    }
}
