package ut;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static boolean f8697gv;
    public static boolean n3;
    public static Method y;
    public static Field zn;

    public static class n3 {
        public static void gv(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        public static int n3(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static boolean y(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static void zn(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }
    }

    public static class y {
        public static void y(PopupWindow popupWindow, View view, int i, int i5, int i8) {
            popupWindow.showAsDropDown(view, i, i5, i8);
        }
    }

    public static void n3(@NonNull PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            n3.gv(popupWindow, i);
            return;
        }
        if (!n3) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                y = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            n3 = true;
        }
        Method method = y;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static void y(@NonNull PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            n3.zn(popupWindow, z);
            return;
        }
        if (!f8697gv) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                zn = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e4);
            }
            f8697gv = true;
        }
        Field field = zn;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e5) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e5);
            }
        }
    }

    public static void zn(@NonNull PopupWindow popupWindow, @NonNull View view, int i, int i5, int i8) {
        y.y(popupWindow, view, i, i5, i8);
    }
}
