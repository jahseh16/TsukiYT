package a8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class s extends Drawable implements Drawable.Callback, fb, a {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f39fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i9 f40s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f41t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f42v;
    public int y;

    public s(@NonNull i9 i9Var, @Nullable Resources resources) {
        this.f40s = i9Var;
        v(resources);
    }

    public final boolean a(int[] iArr) {
        if (!zn()) {
            return false;
        }
        i9 i9Var = this.f40s;
        ColorStateList colorStateList = i9Var.zn;
        PorterDuff.Mode mode = i9Var.f37gv;
        if (colorStateList == null || mode == null) {
            this.f39fb = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f39fb || colorForState != this.y || mode != this.f42v) {
                setColorFilter(colorForState, mode);
                this.y = colorForState;
                this.f42v = mode;
                this.f39fb = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f41t.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        i9 i9Var = this.f40s;
        return changingConfigurations | (i9Var != null ? i9Var.getChangingConfigurations() : 0) | this.f41t.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        i9 i9Var = this.f40s;
        if (i9Var == null || !i9Var.y()) {
            return null;
        }
        this.f40s.y = getChangingConfigurations();
        return this.f40s;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f41t.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f41t.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f41t.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return y.a(this.f41t);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f41t.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f41t.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f41t.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f41t.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public int[] getState() {
        return this.f41t.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f41t.getTransparentRegion();
    }

    @NonNull
    public final i9 gv() {
        return new i9(this.f40s);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return y.s(this.f41t);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        i9 i9Var;
        ColorStateList colorStateList = (!zn() || (i9Var = this.f40s) == null) ? null : i9Var.zn;
        return (colorStateList != null && colorStateList.isStateful()) || this.f41t.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f41t.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f38f && super.mutate() == this) {
            this.f40s = gv();
            Drawable drawable = this.f41t;
            if (drawable != null) {
                drawable.mutate();
            }
            i9 i9Var = this.f40s;
            if (i9Var != null) {
                Drawable drawable2 = this.f41t;
                i9Var.n3 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f38f = true;
        }
        return this;
    }

    @Override // a8.fb
    public final void n3(Drawable drawable) {
        Drawable drawable2 = this.f41t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f41t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            i9 i9Var = this.f40s;
            if (i9Var != null) {
                i9Var.n3 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f41t;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return y.tl(this.f41t, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f41t.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f41t.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        y.i9(this.f41t, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f41t.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f41t.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f41t.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f41t.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        return a(iArr) || this.f41t.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f40s.zn = colorStateList;
        a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.f40s.f37gv = mode;
        a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z5) {
        return super.setVisible(z, z5) || this.f41t.setVisible(z, z5);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void v(@Nullable Resources resources) {
        Drawable.ConstantState constantState;
        i9 i9Var = this.f40s;
        if (i9Var == null || (constantState = i9Var.n3) == null) {
            return;
        }
        n3(constantState.newDrawable(resources));
    }

    @Override // a8.fb
    public final Drawable y() {
        return this.f41t;
    }

    public boolean zn() {
        throw null;
    }

    public s(@Nullable Drawable drawable) {
        this.f40s = gv();
        n3(drawable);
    }
}
