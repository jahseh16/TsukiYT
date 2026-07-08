package v0;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class zn {

    @Nullable
    public static Method n3;

    @Nullable
    public static Method y;

    public static void gv(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        Method method = n3;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                n3 = method2;
                method2.setAccessible(true);
                method = n3;
            } catch (NoSuchMethodException e4) {
                r.fb("BundleUtil", "Failed to retrieve putIBinder method", e4);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
            r.fb("BundleUtil", "Failed to invoke putIBinder via reflection", e5);
        }
    }

    @Nullable
    public static IBinder n3(Bundle bundle, @Nullable String str) {
        Method method = y;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                y = method2;
                method2.setAccessible(true);
                method = y;
            } catch (NoSuchMethodException e4) {
                r.fb("BundleUtil", "Failed to retrieve getIBinder method", e4);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
            r.fb("BundleUtil", "Failed to invoke getIBinder via reflection", e5);
            return null;
        }
    }

    @Nullable
    public static IBinder y(Bundle bundle, @Nullable String str) {
        return ut.y >= 18 ? bundle.getBinder(str) : n3(bundle, str);
    }

    public static void zn(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (ut.y >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            gv(bundle, str, iBinder);
        }
    }
}
