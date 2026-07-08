package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import x4.s;

/* JADX INFO: loaded from: classes.dex */
public class FragmentFactory {
    private static final s<ClassLoader, s<String, Class<?>>> sClassCacheMap = new s<>();

    public static boolean isFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    private static Class<?> loadClass(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        s<ClassLoader, s<String, Class<?>>> sVar = sClassCacheMap;
        s<String, Class<?>> sVar2 = sVar.get(classLoader);
        if (sVar2 == null) {
            sVar2 = new s<>();
            sVar.put(classLoader, sVar2);
        }
        Class<?> cls = sVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        sVar2.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends Fragment> loadFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassCastException e4) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e4);
        } catch (ClassNotFoundException e5) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e5);
        }
    }

    @NonNull
    public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e4) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (InstantiationException e5) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e8) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e8);
        }
    }
}
