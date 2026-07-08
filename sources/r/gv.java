package r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class gv extends Drawable {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public PorterDuffColorFilter f7480c5;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Rect f7483gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public ColorStateList f7484i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f7485s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f7486v;
    public float y;
    public final RectF zn;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7479a = false;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f7482fb = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f7481f = PorterDuff.Mode.SRC_IN;
    public final Paint n3 = new Paint(5);

    public gv(ColorStateList colorStateList, float f3) {
        this.y = f3;
        v(colorStateList);
        this.zn = new RectF();
        this.f7483gv = new Rect();
    }

    public void a(@Nullable ColorStateList colorStateList) {
        v(colorStateList);
        invalidateSelf();
    }

    public final void c5(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.zn.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f7483gv.set(rect);
        if (this.f7479a) {
            this.f7483gv.inset((int) Math.ceil(v.y(this.f7486v, this.y, this.f7482fb)), (int) Math.ceil(v.n3(this.f7486v, this.y, this.f7482fb)));
            this.zn.set(this.f7483gv);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.n3;
        if (this.f7480c5 == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f7480c5);
            z = true;
        }
        RectF rectF = this.zn;
        float f3 = this.y;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public void fb(float f3, boolean z, boolean z5) {
        if (f3 == this.f7486v && this.f7479a == z && this.f7482fb == z5) {
            return;
        }
        this.f7486v = f3;
        this.f7479a = z;
        this.f7482fb = z5;
        c5(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f7483gv, this.y);
    }

    public float gv() {
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f7484i9;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f7485s) != null && colorStateList.isStateful()) || super.isStateful();
    }

    public ColorStateList n3() {
        return this.f7485s;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c5(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f7485s;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.n3.getColor();
        if (z) {
            this.n3.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f7484i9;
        if (colorStateList2 == null || (mode = this.f7481f) == null) {
            return z;
        }
        this.f7480c5 = y(colorStateList2, mode);
        return true;
    }

    public void s(float f3) {
        if (f3 == this.y) {
            return;
        }
        this.y = f3;
        c5(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.n3.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.n3.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f7484i9 = colorStateList;
        this.f7480c5 = y(colorStateList, this.f7481f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f7481f = mode;
        this.f7480c5 = y(this.f7484i9, mode);
        invalidateSelf();
    }

    public final void v(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f7485s = colorStateList;
        this.n3.setColor(colorStateList.getColorForState(getState(), this.f7485s.getDefaultColor()));
    }

    public final PorterDuffColorFilter y(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public float zn() {
        return this.f7486v;
    }
}
