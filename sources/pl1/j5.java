package pl1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class j5 {
    public static boolean n3 = true;
    public static final Type[] y = new Type[0];

    public static final class n3 implements ParameterizedType {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final Type[] f7306fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Type f7307v;
        public final Type y;

        public n3(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                j5.n3(type3);
            }
            this.y = type;
            this.f7307v = type2;
            this.f7306fb = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && j5.gv(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f7306fb.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.y;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f7307v;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f7306fb) ^ this.f7307v.hashCode();
            Type type = this.y;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f7306fb;
            if (typeArr.length == 0) {
                return j5.r(this.f7307v);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(j5.r(this.f7307v));
            sb.append("<");
            sb.append(j5.r(this.f7306fb[0]));
            for (int i = 1; i < this.f7306fb.length; i++) {
                sb.append(", ");
                sb.append(j5.r(this.f7306fb[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class y implements GenericArrayType {
        public final Type y;

        public y(Type type) {
            this.y = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && j5.gv(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.y;
        }

        public int hashCode() {
            return this.y.hashCode();
        }

        public String toString() {
            return j5.r(this.y) + "[]";
        }
    }

    public static final class zn implements WildcardType {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Type f7308v;
        public final Type y;

        public zn(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                j5.n3(typeArr[0]);
                this.f7308v = null;
                this.y = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            j5.n3(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f7308v = typeArr2[0];
            this.y = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && j5.gv(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f7308v;
            return type != null ? new Type[]{type} : j5.y;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.y};
        }

        public int hashCode() {
            Type type = this.f7308v;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.y.hashCode() + 31);
        }

        public String toString() {
            if (this.f7308v != null) {
                return "? super " + j5.r(this.f7308v);
            }
            if (this.y == Object.class) {
                return "?";
            }
            return "? extends " + j5.r(this.y);
        }
    }

    public static Type a(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static Type c5(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return mt(type, cls, v(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static Type co(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsZn = zn(typeVariable);
        if (clsZn == null) {
            return typeVariable;
        }
        Type typeV = v(type, cls, clsZn);
        if (!(typeV instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeV).getActualTypeArguments()[f(clsZn.getTypeParameters(), typeVariable)];
    }

    public static int f(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static Type fb(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    public static boolean gv(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
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

    public static boolean i9(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (i9(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return i9(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static Type mt(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeCo = co(type, cls, typeVariable);
            if (typeCo == typeVariable) {
                return typeCo;
            }
            type3 = typeCo;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeMt = mt(type, cls, componentType);
                return componentType == typeMt ? cls2 : new y(typeMt);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeMt2 = mt(type, cls, genericComponentType);
            return genericComponentType == typeMt2 ? genericArrayType : new y(typeMt2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeMt3 = mt(type, cls, ownerType);
            boolean z = typeMt3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeMt4 = mt(type, cls, actualTypeArguments[i]);
                if (typeMt4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeMt4;
                }
            }
            return z ? new n3(typeMt3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z5 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z5) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeMt5 = mt(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeMt5 != lowerBounds[0]) {
                    return new zn(new Type[]{Object.class}, new Type[]{typeMt5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeMt6 = mt(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeMt6 != upperBounds[0]) {
                        return new zn(new Type[]{typeMt6}, y);
                    }
                }
            }
        }
        return type4;
    }

    public static void n3(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static RuntimeException p(Method method, Throwable th, int i, String str, Object... objArr) {
        return xc(method, th, str + " (" + mg.n3.y(method, i) + ")", objArr);
    }

    public static String r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Class<?> s(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(s(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return s(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static boolean t(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tl(Type type) {
        return n3 && type == Unit.class;
    }

    public static Type v(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return v(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return v(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static RuntimeException w(Method method, int i, String str, Object... objArr) {
        return wz(method, str + " (" + mg.n3.y(method, i) + ")", objArr);
    }

    public static RuntimeException wz(Method method, String str, Object... objArr) {
        return xc(method, null, str, objArr);
    }

    public static RuntimeException xc(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    public static sj1.mg y(sj1.mg mgVar) throws IOException {
        hk1.v vVar = new hk1.v();
        mgVar.source().hw(vVar);
        return sj1.mg.create(mgVar.contentType(), mgVar.contentLength(), (hk1.fb) vVar);
    }

    public static void z(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static Class<?> zn(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }
}
