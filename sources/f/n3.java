package f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ej.zn;
import java.util.WeakHashMap;
import w.g;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class n3 {
    public static final ThreadLocal<TypedValue> y = new ThreadLocal<>();
    public static final WeakHashMap<Context, SparseArray<y>> n3 = new WeakHashMap<>(0);
    public static final Object zn = new Object();

    public static class y {
        public final Configuration n3;
        public final ColorStateList y;

        public y(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration) {
            this.y = colorStateList;
            this.n3 = configuration;
        }
    }

    @Nullable
    public static ColorStateList a(Context context, int i) {
        if (fb(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return zn.y(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e4) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            return null;
        }
    }

    public static boolean fb(@NonNull Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValueV = v();
        resources.getValue(i, typedValueV, true);
        int i5 = typedValueV.type;
        return i5 >= 28 && i5 <= 31;
    }

    @Nullable
    public static Drawable gv(@NonNull Context context, int i) {
        return g.s().i9(context, i);
    }

    @Nullable
    public static ColorStateList n3(@NonNull Context context, int i) {
        y yVar;
        synchronized (zn) {
            try {
                SparseArray<y> sparseArray = n3.get(context);
                if (sparseArray != null && sparseArray.size() > 0 && (yVar = sparseArray.get(i)) != null) {
                    if (yVar.n3.equals(context.getResources().getConfiguration())) {
                        return yVar.y;
                    }
                    sparseArray.remove(i);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public static TypedValue v() {
        ThreadLocal<TypedValue> threadLocal = y;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static void y(@NonNull Context context, int i, @NonNull ColorStateList colorStateList) {
        synchronized (zn) {
            try {
                WeakHashMap<Context, SparseArray<y>> weakHashMap = n3;
                SparseArray<y> sparseArray = weakHashMap.get(context);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(context, sparseArray);
                }
                sparseArray.append(i, new y(colorStateList, context.getResources().getConfiguration()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ColorStateList zn(@NonNull Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList colorStateListN3 = n3(context, i);
        if (colorStateListN3 != null) {
            return colorStateListN3;
        }
        ColorStateList colorStateListA = a(context, i);
        if (colorStateListA == null) {
            return d.y.getColorStateList(context, i);
        }
        y(context, i, colorStateListA);
        return colorStateListA;
    }
}
