package t2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import w.ad;

/* JADX INFO: loaded from: classes.dex */
public class zn {
    @Nullable
    public static gv a(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new gv(context, resourceId);
    }

    public static boolean fb(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    @Nullable
    public static Drawable gv(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableGv;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableGv = f.n3.gv(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableGv;
    }

    @Nullable
    public static ColorStateList n3(@NonNull Context context, @NonNull ad adVar, int i) {
        int iWz;
        ColorStateList colorStateListZn;
        return (!adVar.co(i) || (iWz = adVar.wz(i, 0)) == 0 || (colorStateListZn = f.n3.zn(context, iWz)) == null) ? adVar.zn(i) : colorStateListZn;
    }

    public static boolean s(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static int v(@NonNull TypedArray typedArray, int i, int i5) {
        return typedArray.hasValue(i) ? i : i5;
    }

    @Nullable
    public static ColorStateList y(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListZn;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListZn = f.n3.zn(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListZn;
    }

    public static int zn(@NonNull Context context, @NonNull TypedArray typedArray, int i, int i5) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i5);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i5);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}
