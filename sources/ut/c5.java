package ut;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class c5 {
    public static void gv(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        y.gv(imageView, mode);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || y.y(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    @Nullable
    public static PorterDuff.Mode n3(@NonNull ImageView imageView) {
        return y.n3(imageView);
    }

    @Nullable
    public static ColorStateList y(@NonNull ImageView imageView) {
        return y.y(imageView);
    }

    public static void zn(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        y.zn(imageView, colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || y.y(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
