package mj1;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class yg {
    public static final <T> ij1.zn<T> a(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        int i5 = 0;
        boolean z = false;
        while (true) {
            if (i5 >= length) {
                if (!z) {
                    break;
                }
            } else {
                Field field2 = declaredFields[i5];
                if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    if (z) {
                        break;
                    }
                    field = field2;
                    z = true;
                }
                i5++;
            }
        }
        field = null;
        if (field == null) {
            return null;
        }
        Object obj = field.get(null);
        Method[] methods = cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        int length2 = methods.length;
        Method method = null;
        boolean z5 = false;
        while (true) {
            if (i >= length2) {
                if (!z5) {
                    break;
                }
            } else {
                Method method2 = methods[i];
                if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), ij1.zn.class)) {
                        if (z5) {
                            break;
                        }
                        method = method2;
                        z5 = true;
                    }
                }
                i++;
            }
        }
        method = null;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(obj, null);
        if (objInvoke instanceof ij1.zn) {
            return (ij1.zn) objInvoke;
        }
        return null;
    }

    public static final boolean c5(Object obj, KClass<?> kclass) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        return JvmClassMappingKt.getJavaObjectType(kclass).isInstance(obj);
    }

    public static final <T> boolean f(Class<T> cls) {
        if (cls.getAnnotation(ij1.v.class) != null) {
            return true;
        }
        ij1.c5 c5Var = (ij1.c5) cls.getAnnotation(ij1.c5.class);
        return c5Var != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(c5Var.with()), Reflection.getOrCreateKotlinClass(ij1.a.class));
    }

    public static final <T> ij1.zn<T> fb(Class<T> cls) {
        ij1.c5 c5Var = (ij1.c5) cls.getAnnotation(ij1.c5.class);
        if (c5Var == null || Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(c5Var.with()), Reflection.getOrCreateKotlinClass(ij1.a.class))) {
            return new ij1.a(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    public static final <T> ij1.zn<T> gv(KClass<T> kClass, ij1.zn<Object>... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return zn(JvmClassMappingKt.getJavaClass(kClass), (ij1.zn[]) Arrays.copyOf(args, args.length));
    }

    public static final <T> boolean i9(Class<T> cls) {
        return cls.getAnnotation(ij1.c5.class) == null && cls.getAnnotation(ij1.v.class) == null;
    }

    public static final <T> ij1.zn<T> n3(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return gv(kClass, new ij1.zn[0]);
    }

    public static final <T> ij1.zn<T> s(Class<?> cls, ij1.zn<Object>... znVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Object objY = y(cls);
        if (objY == null) {
            return null;
        }
        try {
            if (znVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = znVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = ij1.zn.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = objY.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(objY, Arrays.copyOf(znVarArr, znVarArr.length));
            if (objInvoke instanceof ij1.zn) {
                return (ij1.zn) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                throw e4;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e4.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean t(KClass<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass(rootClass).isArray();
    }

    public static final Void tl(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        yc.gv(kClass);
        throw new KotlinNothingValueException();
    }

    public static final <T> ij1.zn<T> v(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "canonicalName");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new z6(canonicalName, (Enum[]) enumConstants);
    }

    public static final <T, E extends T> E[] wz(ArrayList<E> arrayList, KClass<T> eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass(eClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return eArr;
    }

    public static final Object y(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> ij1.zn<T> zn(Class<T> cls, ij1.zn<Object>... args) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Field field;
        ij1.zn<T> znVarFb;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && i9(cls)) {
            return v(cls);
        }
        if (cls.isInterface() && (znVarFb = fb(cls)) != null) {
            return znVarFb;
        }
        ij1.zn<T> znVarS = s(cls, (ij1.zn[]) Arrays.copyOf(args, args.length));
        if (znVarS != null) {
            return znVarS;
        }
        ij1.zn<T> znVarA = a(cls);
        if (znVarA != null) {
            return znVarA;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "declaredClasses");
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Class<?> cls3 = declaredClasses[i];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                } else if (!z) {
                }
            }
            cls2 = null;
            obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
        } catch (NoSuchFieldException unused) {
        }
        ij1.zn<T> znVar = obj instanceof ij1.zn ? (ij1.zn) obj : null;
        if (znVar != null) {
            return znVar;
        }
        if (f(cls)) {
            return new ij1.a(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }
}
