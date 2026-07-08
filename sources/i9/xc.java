package i9;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f5652a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static Field f5653fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static boolean f5654gv;
    public static boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f5655s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Field f5656v;
    public static Field y;
    public static Class<?> zn;

    public static void gv(@NonNull Resources resources) {
        Object obj;
        if (!f5655s) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f5653fb = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
            }
            f5655s = true;
        }
        Field field = f5653fb;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e5) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e5);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!n3) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                y = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
            }
            n3 = true;
        }
        Field field2 = y;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e8);
            }
        }
        if (obj2 != null) {
            v(obj2);
        }
    }

    public static void n3(@NonNull Resources resources) {
        Map map;
        if (!n3) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e4);
            }
            n3 = true;
        }
        Field field = y;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e5);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void v(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f5654gv) {
            try {
                zn = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e4) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e4);
            }
            f5654gv = true;
        }
        Class<?> cls = zn;
        if (cls == null) {
            return;
        }
        if (!f5652a) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f5656v = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e5);
            }
            f5652a = true;
        }
        Field field = f5656v;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e6) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e6);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static void y(@NonNull Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            gv(resources);
        } else if (i >= 23) {
            zn(resources);
        } else {
            n3(resources);
        }
    }

    public static void zn(@NonNull Resources resources) {
        Object obj;
        if (!n3) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e4);
            }
            n3 = true;
        }
        Field field = y;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e5);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        v(obj);
    }
}
