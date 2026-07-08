package ta;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f8198a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final Handler f8199fb = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Method f8200gv;
    public static final Field n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Method f8201v;
    public static final Class<?> y;
    public static final Field zn;

    static {
        Class<?> clsY = y();
        y = clsY;
        n3 = n3();
        zn = a();
        f8200gv = gv(clsY);
        f8201v = zn(clsY);
        f8198a = v(clsY);
    }

    public static Field a() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c5(@NonNull Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (fb() && f8198a == null) {
            return false;
        }
        if (f8201v == null && f8200gv == null) {
            return false;
        }
        try {
            Object obj2 = zn.get(activity);
            if (obj2 == null || (obj = n3.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            gv gvVar = new gv(activity);
            application.registerActivityLifecycleCallbacks(gvVar);
            Handler handler = f8199fb;
            handler.post(new y(gvVar, obj2));
            try {
                if (fb()) {
                    Method method = f8198a;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new n3(application, gvVar));
                return true;
            } catch (Throwable th) {
                f8199fb.post(new n3(application, gvVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean fb() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static Method gv(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field n3() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean s(Object obj, int i, Activity activity) {
        try {
            Object obj2 = zn.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f8199fb.postAtFrontOfQueue(new zn(n3.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static Method v(Class<?> cls) {
        if (fb() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Class<?> y() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method zn(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
