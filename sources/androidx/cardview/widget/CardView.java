package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.R$attr;
import androidx.cardview.R$color;
import androidx.cardview.R$style;
import androidx.cardview.R$styleable;
import r.n3;
import r.zn;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final zn f655co;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f656p = {R.attr.colorBackground};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f657f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f658fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f660t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f661v;
    public final n3 w;
    public boolean y;

    public class y implements n3 {
        public Drawable y;

        public y() {
        }

        @Override // r.n3
        public View a() {
            return CardView.this;
        }

        @Override // r.n3
        public Drawable gv() {
            return this.y;
        }

        @Override // r.n3
        public void n3(Drawable drawable) {
            this.y = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // r.n3
        public boolean v() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // r.n3
        public void y(int i, int i5, int i8, int i10) {
            CardView.this.f660t.set(i, i5, i8, i10);
            CardView cardView = CardView.this;
            Rect rect = cardView.f657f;
            CardView.super.setPadding(i + rect.left, i5 + rect.top, i8 + rect.right, i10 + rect.bottom);
        }

        @Override // r.n3
        public boolean zn() {
            return CardView.this.getUseCompatPadding();
        }
    }

    static {
        r.y yVar = new r.y();
        f655co = yVar;
        yVar.t();
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.y);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f655co.fb(this.w);
    }

    public float getCardElevation() {
        return f655co.s(this.w);
    }

    public int getContentPaddingBottom() {
        return this.f657f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f657f.left;
    }

    public int getContentPaddingRight() {
        return this.f657f.right;
    }

    public int getContentPaddingTop() {
        return this.f657f.top;
    }

    public float getMaxCardElevation() {
        return f655co.c5(this.w);
    }

    public boolean getPreventCornerOverlap() {
        return this.f661v;
    }

    public float getRadius() {
        return f655co.f(this.w);
    }

    public boolean getUseCompatPadding() {
        return this.y;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i5) {
        if (f655co instanceof r.y) {
            super.onMeasure(i, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.i9(this.w)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.n3(this.w)), View.MeasureSpec.getSize(i5)), mode2);
        }
        super.onMeasure(i, i5);
    }

    public void setCardBackgroundColor(int i) {
        f655co.wz(this.w, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f3) {
        f655co.zn(this.w, f3);
    }

    public void setMaxCardElevation(float f3) {
        f655co.tl(this.w, f3);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f659s = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f658fb = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i5, int i8, int i10) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i5, int i8, int i10) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f661v) {
            this.f661v = z;
            f655co.gv(this.w);
        }
    }

    public void setRadius(float f3) {
        f655co.a(this.w, f3);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.y != z) {
            this.y = z;
            f655co.v(this.w);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f657f = rect;
        this.f660t = new Rect();
        y yVar = new y();
        this.w = yVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.y, i, R$style.y);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f648gv)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.f648gv);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f656p);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R$color.n3) : getResources().getColor(R$color.y));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.f653v, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.f644a, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.f647fb, 0.0f);
        this.y = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f645c5, false);
        this.f661v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f650s, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f649i9, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f651t, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f654wz, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f652tl, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f646f, dimensionPixelSize);
        float f3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f658fb = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.n3, 0);
        this.f659s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.zn, 0);
        typedArrayObtainStyledAttributes.recycle();
        f655co.y(yVar, context, colorStateList, dimension, dimension2, f3);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        f655co.wz(this.w, colorStateList);
    }
}
