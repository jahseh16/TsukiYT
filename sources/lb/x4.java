package lb;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import mb.n3;

/* JADX INFO: loaded from: classes.dex */
public final class x4 {
    public static Type a(Type type) {
        Class<?> clsFb = fb(type);
        return mb.n3.w(type, clsFb, clsFb.getGenericSuperclass());
    }

    public static Type[] c5(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeS = s(type, cls, Map.class);
        return typeS instanceof ParameterizedType ? ((ParameterizedType) typeS).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static WildcardType f(Type type) {
        return new n3.zn(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, mb.n3.n3);
    }

    public static Class<?> fb(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(fb(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return fb(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static boolean gv(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? gv(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return gv(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof n3.C0129n3 ? ((n3.C0129n3) parameterizedType).f6498fb : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof n3.C0129n3 ? ((n3.C0129n3) parameterizedType2).f6498fb : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return gv(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return gv(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static ParameterizedType i9(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new n3.C0129n3(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    public static GenericArrayType n3(Type type) {
        return new n3.y(type);
    }

    public static Type s(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return mb.n3.w(type, cls, mb.n3.v(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static WildcardType t(Type type) {
        return new n3.zn(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String v(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    public static Type y(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    public static Type zn(Type type, Class<?> cls) {
        Type typeS = s(type, cls, Collection.class);
        if (typeS instanceof WildcardType) {
            typeS = ((WildcardType) typeS).getUpperBounds()[0];
        }
        return typeS instanceof ParameterizedType ? ((ParameterizedType) typeS).getActualTypeArguments()[0] : Object.class;
    }
}
