package v3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oz {
    public static Object a(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(c5(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (Exception e4) {
            throw new ut(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e4);
        }
    }

    public static Method c5(Class cls, String str, Class... clsArr) {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new ut(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    public static Object fb(Class cls, String str, Class cls2, Class cls3, Object obj, Class cls4, Object obj2) {
        try {
            return cls2.cast(c5(cls, "optimizedPathFor", cls3, cls4).invoke(null, obj, obj2));
        } catch (Exception e4) {
            throw new ut(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e4);
        }
    }

    public static Object gv(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(c5(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e4) {
            throw new ut(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e4);
        }
    }

    public static j n3(Object obj, String str, Class cls) {
        return new j(obj, s(obj, str), cls);
    }

    public static Field s(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new ut(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    public static Object v(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(c5(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e4) {
            throw new ut(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e4);
        }
    }

    public static o y(Object obj, String str, Class cls) {
        return new o(obj, s(obj, str), cls);
    }

    public static Object zn(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(null);
        } catch (Exception e4) {
            throw new ut(String.format("Failed to invoke default constructor on class %s", cls.getName()), e4);
        }
    }
}
