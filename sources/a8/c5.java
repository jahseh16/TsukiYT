package a8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c5 extends s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Method f36p;

    public c5(Drawable drawable) {
        super(drawable);
        fb();
    }

    public final void fb() {
        if (f36p == null) {
            try {
                f36p = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e4) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Rect getDirtyBounds() {
        return this.f41t.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        this.f41t.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f41t;
        if (drawable == null || (method = f36p) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e4) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e4);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f3, float f4) {
        this.f41t.setHotspot(f3, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i5, int i8, int i10) {
        this.f41t.setHotspotBounds(i, i5, i8, i10);
    }

    @Override // a8.s, android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // a8.s, android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (zn()) {
            super.setTint(i);
        } else {
            this.f41t.setTint(i);
        }
    }

    @Override // a8.s, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (zn()) {
            super.setTintList(colorStateList);
        } else {
            this.f41t.setTintList(colorStateList);
        }
    }

    @Override // a8.s, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (zn()) {
            super.setTintMode(mode);
        } else {
            this.f41t.setTintMode(mode);
        }
    }

    @Override // a8.s
    public boolean zn() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f41t;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public c5(i9 i9Var, Resources resources) {
        super(i9Var, resources);
        fb();
    }
}
