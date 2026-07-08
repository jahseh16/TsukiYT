package t2;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class n3 {
    public static int gv(@NonNull View view, int i) {
        return zn(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static boolean n3(@NonNull Context context, int i, boolean z) {
        TypedValue typedValueY = y(context, i);
        return (typedValueY == null || typedValueY.type != 18) ? z : typedValueY.data != 0;
    }

    @Nullable
    public static TypedValue y(@NonNull Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int zn(@NonNull Context context, int i, @NonNull String str) {
        TypedValue typedValueY = y(context, i);
        if (typedValueY != null) {
            return typedValueY.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
