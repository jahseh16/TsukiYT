package o2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public class gv extends LinearLayoutCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7079b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f7080d;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final Rect f7081ej;

    @Nullable
    public Drawable fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public boolean f7082hw;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7083x;

    public gv(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(@NonNull Canvas canvas) {
        super/*android.view.ViewGroup*/.draw(canvas);
        Drawable drawable = this.fh;
        if (drawable != null) {
            if (this.f7082hw) {
                this.f7082hw = false;
                Rect rect = this.f7080d;
                Rect rect2 = this.f7081ej;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f7079b) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f7083x, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(21)
    public void drawableHotspotChanged(float f3, float f4) {
        super/*android.view.ViewGroup*/.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.fh;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        super/*android.view.ViewGroup*/.drawableStateChanged();
        Drawable drawable = this.fh;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.fh.setState(getDrawableState());
    }

    @Nullable
    public Drawable getForeground() {
        return this.fh;
    }

    public int getForegroundGravity() {
        return this.f7083x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void jumpDrawablesToCurrentState() {
        super/*android.view.ViewGroup*/.jumpDrawablesToCurrentState();
        Drawable drawable = this.fh;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        this.f7082hw = z | this.f7082hw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i5, int i8, int i10) {
        super/*android.view.ViewGroup*/.onSizeChanged(i, i5, i8, i10);
        this.f7082hw = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.fh;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.fh);
            }
            this.fh = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f7083x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setForegroundGravity(int i) {
        if (this.f7083x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f7083x = i;
            if (i == 119 && this.fh != null) {
                this.fh.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean verifyDrawable(Drawable drawable) {
        return super/*android.view.ViewGroup*/.verifyDrawable(drawable) || drawable == this.fh;
    }

    public gv(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7080d = new Rect();
        this.f7081ej = new Rect();
        this.f7083x = 119;
        this.f7079b = true;
        this.f7082hw = false;
        TypedArray typedArrayS = f.s(context, attributeSet, R$styleable.hj, i, 0, new int[0]);
        this.f7083x = typedArrayS.getInt(R$styleable.hf, this.f7083x);
        Drawable drawable = typedArrayS.getDrawable(R$styleable.sh);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f7079b = typedArrayS.getBoolean(R$styleable.w7, true);
        typedArrayS.recycle();
    }
}
