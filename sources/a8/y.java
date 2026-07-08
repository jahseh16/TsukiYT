package a8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static boolean f43gv;
    public static boolean n3;
    public static Method y;
    public static Method zn;

    public static class n3 {
        public static void a(Drawable drawable, int i, int i5, int i8, int i10) {
            drawable.setHotspotBounds(i, i5, i8, i10);
        }

        public static void c5(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        public static void fb(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        public static void gv(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static boolean n3(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static void s(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void v(Drawable drawable, float f3, float f4) {
            drawable.setHotspot(f3, f4);
        }

        public static void y(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static ColorFilter zn(Drawable drawable) {
            return drawable.getColorFilter();
        }
    }

    /* JADX INFO: renamed from: a8.y$y, reason: collision with other inner class name */
    public static class C0002y {
        public static boolean gv(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public static Drawable n3(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        public static void v(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }

        public static int y(Drawable drawable) {
            return drawable.getAlpha();
        }

        public static Drawable zn(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }
    }

    public static class zn {
        public static boolean n3(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }

        public static int y(Drawable drawable) {
            return drawable.getLayoutDirection();
        }
    }

    public static int a(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return zn.y(drawable);
        }
        if (!f43gv) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                zn = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e4);
            }
            f43gv = true;
        }
        Method method = zn;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e5) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e5);
            zn = null;
            return 0;
        }
    }

    @Deprecated
    public static void c5(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void f(@NonNull Drawable drawable, float f3, float f4) {
        n3.v(drawable, f3, f4);
    }

    public static void fb(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        n3.gv(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static int gv(@NonNull Drawable drawable) {
        return C0002y.y(drawable);
    }

    public static void i9(@NonNull Drawable drawable, boolean z) {
        C0002y.v(drawable, z);
    }

    @NonNull
    public static Drawable mt(@NonNull Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof a)) ? new c5(drawable) : drawable;
    }

    public static boolean n3(@NonNull Drawable drawable) {
        return n3.n3(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T p(@NonNull Drawable drawable) {
        return drawable instanceof fb ? (T) ((fb) drawable).y() : drawable;
    }

    public static boolean s(@NonNull Drawable drawable) {
        return C0002y.gv(drawable);
    }

    public static void t(@NonNull Drawable drawable, int i, int i5, int i8, int i10) {
        n3.a(drawable, i, i5, i8, i10);
    }

    public static boolean tl(@NonNull Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return zn.n3(drawable, i);
        }
        if (!n3) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                y = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e4);
            }
            n3 = true;
        }
        Method method = y;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e5) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e5);
                y = null;
            }
        }
        return false;
    }

    @Nullable
    public static ColorFilter v(@NonNull Drawable drawable) {
        return n3.zn(drawable);
    }

    public static void w(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        n3.c5(drawable, mode);
    }

    public static void wz(@NonNull Drawable drawable, int i) {
        n3.fb(drawable, i);
    }

    public static void xc(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        n3.s(drawable, colorStateList);
    }

    public static void y(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        n3.y(drawable, theme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zn(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            zn(C0002y.zn((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof fb) {
            zn(((fb) drawable).y());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable drawableN3 = C0002y.n3(drawableContainerState, i);
            if (drawableN3 != null) {
                zn(drawableN3);
            }
        }
    }
}
