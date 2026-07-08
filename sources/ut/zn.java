package ut;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static boolean n3;
    public static Field y;

    public static class n3 {
        public static Drawable y(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static class y {
        public static void gv(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }

        public static PorterDuff.Mode n3(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        public static ColorStateList y(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        public static void zn(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }
    }

    public static void gv(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        y.gv(compoundButton, mode);
    }

    @Nullable
    public static ColorStateList n3(@NonNull CompoundButton compoundButton) {
        return y.y(compoundButton);
    }

    @Nullable
    public static Drawable y(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n3.y(compoundButton);
        }
        if (!n3) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e4);
            }
            n3 = true;
        }
        Field field = y;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e5) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e5);
                y = null;
            }
        }
        return null;
    }

    public static void zn(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        y.zn(compoundButton, colorStateList);
    }
}
