package ap;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class x4 {
    public static final x4 y = new x4();
    public static final Map<Class<?>, Integer> n3 = new HashMap();
    public static final Map<Class<?>, List<Constructor<? extends androidx.lifecycle.v>>> zn = new HashMap();

    public static final androidx.lifecycle.t a(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof androidx.lifecycle.t;
        boolean z5 = object instanceof fb;
        if (z && z5) {
            return new androidx.lifecycle.gv((fb) object, (androidx.lifecycle.t) object);
        }
        if (z5) {
            return new androidx.lifecycle.gv((fb) object, null);
        }
        if (z) {
            return (androidx.lifecycle.t) object;
        }
        Class<?> cls = object.getClass();
        x4 x4Var = y;
        if (x4Var.gv(cls) != 2) {
            return new androidx.lifecycle.co(object);
        }
        List<Constructor<? extends androidx.lifecycle.v>> list = zn.get(cls);
        Intrinsics.checkNotNull(list);
        List<Constructor<? extends androidx.lifecycle.v>> list2 = list;
        if (list2.size() == 1) {
            return new androidx.lifecycle.d0(x4Var.y(list2.get(0), object));
        }
        int size = list2.size();
        androidx.lifecycle.v[] vVarArr = new androidx.lifecycle.v[size];
        for (int i = 0; i < size; i++) {
            vVarArr[i] = y.y(list2.get(i), object);
        }
        return new androidx.lifecycle.zn(vVarArr);
    }

    public static final String zn(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.replace$default(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    public final int fb(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends androidx.lifecycle.v> constructorN3 = n3(cls);
        if (constructorN3 != null) {
            zn.put(cls, CollectionsKt.listOf(constructorN3));
            return 2;
        }
        if (androidx.lifecycle.n3.zn.gv(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (v(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (gv(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends androidx.lifecycle.v>> list = zn.get(superclass);
            Intrinsics.checkNotNull(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (v(intrface)) {
                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (gv(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends androidx.lifecycle.v>> list2 = zn.get(intrface);
                Intrinsics.checkNotNull(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        zn.put(cls, arrayList);
        return 2;
    }

    public final int gv(Class<?> cls) {
        Map<Class<?>, Integer> map = n3;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iFb = fb(cls);
        map.put(cls, Integer.valueOf(iFb));
        return iFb;
    }

    public final Constructor<? extends androidx.lifecycle.v> n3(Class<?> cls) {
        try {
            Package r1 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r1 != null ? r1.getName() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strZn = zn(name);
            if (fullPackage.length() != 0) {
                strZn = fullPackage + '.' + strZn;
            }
            Class<?> cls2 = Class.forName(strZn);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final boolean v(Class<?> cls) {
        return cls != null && p.class.isAssignableFrom(cls);
    }

    public final androidx.lifecycle.v y(Constructor<? extends androidx.lifecycle.v> constructor, Object obj) {
        try {
            androidx.lifecycle.v vVarNewInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(vVarNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return vVarNewInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }
}
