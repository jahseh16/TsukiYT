package mb;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.a;
import lb.co;
import lb.f;
import lb.fb;
import lb.i9;
import lb.s;
import lb.v;
import lb.x4;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Class<? extends Annotation> f6496gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f6497v;
    public static final Class<?> zn;
    public static final Set<Annotation> y = Collections.emptySet();
    public static final Type[] n3 = new Type[0];

    /* JADX INFO: renamed from: mb.n3$n3, reason: collision with other inner class name */
    public static final class C0129n3 implements ParameterizedType {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final Type[] f6498fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Type f6499v;
        public final Type y;

        public C0129n3(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || x4.fb(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.y = type == null ? null : n3.y(type);
            this.f6499v = n3.y(type2);
            this.f6498fb = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f6498fb;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                n3.n3(this.f6498fb[i]);
                Type[] typeArr3 = this.f6498fb;
                typeArr3[i] = n3.y(typeArr3[i]);
                i++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && x4.gv(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f6498fb.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.y;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f6499v;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f6498fb) ^ this.f6499v.hashCode()) ^ n3.a(this.y);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f6498fb.length + 1) * 30);
            sb.append(n3.r(this.f6499v));
            if (this.f6498fb.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(n3.r(this.f6498fb[0]));
            for (int i = 1; i < this.f6498fb.length; i++) {
                sb.append(", ");
                sb.append(n3.r(this.f6498fb[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class y implements GenericArrayType {
        public final Type y;

        public y(Type type) {
            this.y = n3.y(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && x4.gv(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.y;
        }

        public int hashCode() {
            return this.y.hashCode();
        }

        public String toString() {
            return n3.r(this.y) + "[]";
        }
    }

    public static final class zn implements WildcardType {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Type f6500v;
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
                n3.n3(typeArr[0]);
                this.f6500v = null;
                this.y = n3.y(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            n3.n3(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f6500v = n3.y(typeArr2[0]);
            this.y = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && x4.gv(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f6500v;
            return type != null ? new Type[]{type} : n3.n3;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.y};
        }

        public int hashCode() {
            Type type = this.f6500v;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.y.hashCode() + 31);
        }

        public String toString() {
            if (this.f6500v != null) {
                return "? super " + n3.r(this.f6500v);
            }
            if (this.y == Object.class) {
                return "?";
            }
            return "? extends " + n3.r(this.y);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f6496gv = cls;
        zn = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f6497v = Collections.unmodifiableMap(linkedHashMap);
    }

    public static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static boolean c5(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static RuntimeException co(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static Set<? extends Annotation> f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(i9.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : y;
    }

    public static int fb(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static a<?> gv(co coVar, Type type, Class<?> cls) throws NoSuchMethodException {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        fb fbVar = (fb) cls.getAnnotation(fb.class);
        Class<?> cls2 = null;
        if (fbVar == null || !fbVar.generateAdapter()) {
            return null;
        }
        try {
            try {
                Class<?> cls3 = Class.forName(x4.v(cls.getName()), true, cls.getClassLoader());
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(co.class, Type[].class);
                            objArr = new Object[]{coVar, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            Object[] objArr2 = {coVar};
                            declaredConstructor = cls3.getDeclaredConstructor(co.class);
                            objArr = objArr2;
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls3.getDeclaredConstructor(null);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((a) declaredConstructor.newInstance(objArr)).gv();
                } catch (NoSuchMethodException e4) {
                    e = e4;
                    cls2 = cls3;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
            } catch (NoSuchMethodException e5) {
                e = e5;
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e6);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e9);
        } catch (InvocationTargetException e10) {
            throw co(e10);
        }
    }

    public static Set<? extends Annotation> i9(AnnotatedElement annotatedElement) {
        return f(annotatedElement.getAnnotations());
    }

    public static Type mt(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsZn = zn(typeVariable);
        if (clsZn == null) {
            return typeVariable;
        }
        Type typeV = v(type, cls, clsZn);
        if (!(typeV instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeV).getActualTypeArguments()[fb(clsZn.getTypeParameters(), typeVariable)];
    }

    public static void n3(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static Type p(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = mt(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeP = p(type, cls, componentType, collection);
                return componentType == typeP ? cls2 : x4.n3(typeP);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeP2 = p(type, cls, genericComponentType, collection);
            return genericComponentType == typeP2 ? genericArrayType : x4.n3(typeP2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeP3 = p(type, cls, ownerType, collection);
            boolean z = typeP3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeP4 = p(type, cls, actualTypeArguments[i], collection);
                if (typeP4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeP4;
                }
            }
            return z ? new C0129n3(typeP3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z5 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z5) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeP5 = p(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (typeP5 != lowerBounds[0]) {
                    return x4.t(typeP5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeP6 = p(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (typeP6 != upperBounds[0]) {
                        return x4.f(typeP6);
                    }
                }
            }
        }
        return type3;
    }

    public static String r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static boolean s(Class<?> cls) {
        Class<? extends Annotation> cls2 = f6496gv;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static String t(String str, AnnotatedElement annotatedElement) {
        return tl(str, (v) annotatedElement.getAnnotation(v.class));
    }

    public static String tl(String str, v vVar) {
        if (vVar == null) {
            return str;
        }
        String strName = vVar.name();
        return "\u0000".equals(strName) ? str : strName;
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

    public static Type w(Type type, Class<?> cls, Type type2) {
        return p(type, cls, type2, new LinkedHashSet());
    }

    public static s wz(String str, String str2, f fVar) {
        String path = fVar.getPath();
        return new s(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, path) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path));
    }

    public static s x4(String str, String str2, f fVar) {
        String path = fVar.getPath();
        return new s(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, path) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path));
    }

    public static Type xc(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type y(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new y(y(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof C0129n3) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0129n3(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof y ? type : new y(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof zn)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new zn(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static String z(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static Class<?> zn(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }
}
