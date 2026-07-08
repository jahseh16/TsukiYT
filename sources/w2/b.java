package w2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static boolean f8962gv;
    public static boolean n3;
    public static Method y;
    public static Field zn;

    public void a(@NonNull View view, float f3) {
        throw null;
    }

    public void c5(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }

    public void fb(@NonNull View view, int i) {
        if (!f8962gv) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                zn = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f8962gv = true;
        }
        Field field = zn;
        if (field != null) {
            try {
                zn.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void gv(@NonNull View view) {
        throw null;
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    public final void n3() {
        if (n3) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            y = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e4) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e4);
        }
        n3 = true;
    }

    public void s(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }

    public void v(@NonNull View view, int i, int i5, int i8, int i10) {
        n3();
        Method method = y;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i8), Integer.valueOf(i10));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
    }

    public void y(@NonNull View view) {
        throw null;
    }

    public float zn(@NonNull View view) {
        throw null;
    }
}
