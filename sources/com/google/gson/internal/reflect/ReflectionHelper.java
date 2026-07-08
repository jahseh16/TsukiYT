package com.google.gson.internal.reflect;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.JsonIOException;
import com.google.gson.internal.TroubleshootingGuide;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public class ReflectionHelper {
    public static final RecordHelper y;

    public static abstract class RecordHelper {
        public RecordHelper() {
        }

        public abstract Method getAccessor(Class<?> cls, Field field);

        public abstract <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls);

        public abstract boolean n3(Class<?> cls);

        public abstract String[] y(Class<?> cls);
    }

    public static class RecordNotSupportedHelper extends RecordHelper {
        public RecordNotSupportedHelper() {
            super();
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public boolean n3(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public String[] y(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }
    }

    public static class RecordSupportedHelper extends RecordHelper {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Method f3104gv;
        public final Method n3;
        public final Method y;
        public final Method zn;

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e4) {
                throw ReflectionHelper.zn(e4);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.n3.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.f3104gv.invoke(objArr[i], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e4) {
                throw ReflectionHelper.zn(e4);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public boolean n3(Class<?> cls) {
            try {
                return ((Boolean) this.y.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e4) {
                throw ReflectionHelper.zn(e4);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public String[] y(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.n3.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.zn.invoke(objArr[i], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e4) {
                throw ReflectionHelper.zn(e4);
            }
        }

        public RecordSupportedHelper() throws NoSuchMethodException, ClassNotFoundException {
            super();
            this.y = Class.class.getMethod("isRecord", null);
            this.n3 = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.zn = cls.getMethod("getName", null);
            this.f3104gv = cls.getMethod("getType", null);
        }
    }

    static {
        RecordHelper recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new RecordSupportedHelper();
        } catch (ReflectiveOperationException unused) {
            recordNotSupportedHelper = new RecordNotSupportedHelper();
        }
        y = recordNotSupportedHelper;
    }

    public static String constructorToString(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        n3(constructor, sb);
        return sb.toString();
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String fieldToString(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String getAccessibleObjectDescription(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + fieldToString((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            n3(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + constructorToString((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method getAccessor(Class<?> cls, Field field) {
        return y.getAccessor(cls, field);
    }

    public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
        return y.getCanonicalRecordConstructor(cls);
    }

    public static String[] getRecordComponentNames(Class<?> cls) {
        return y.y(cls);
    }

    public static String gv(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        String message = exc.getMessage();
        return "\nSee " + TroubleshootingGuide.createUrl((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        return !isStatic(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public static boolean isRecord(Class<?> cls) {
        return y.n3(cls);
    }

    public static boolean isStatic(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void makeAccessible(AccessibleObject accessibleObject) throws JsonIOException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e4) {
            throw new JsonIOException("Failed making " + getAccessibleObjectDescription(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + gv(e4), e4);
        }
    }

    public static void n3(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e4) {
            return "Failed making constructor '" + constructorToString(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e4.getMessage() + gv(e4);
        }
    }

    public static RuntimeException zn(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }
}
