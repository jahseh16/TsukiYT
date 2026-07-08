package androidx.lifecycle;

import androidx.annotation.Nullable;
import androidx.lifecycle.s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class n3 {
    public static n3 zn = new n3();
    public final Map<Class<?>, y> y = new HashMap();
    public final Map<Class<?>, Boolean> n3 = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.n3$n3, reason: collision with other inner class name */
    @Deprecated
    public static final class C0011n3 {
        public final Method n3;
        public final int y;

        public C0011n3(int i, Method method) {
            this.y = i;
            this.n3 = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0011n3)) {
                return false;
            }
            C0011n3 c0011n3 = (C0011n3) obj;
            return this.y == c0011n3.y && this.n3.getName().equals(c0011n3.n3.getName());
        }

        public int hashCode() {
            return (this.y * 31) + this.n3.getName().hashCode();
        }

        public void y(ap.mt mtVar, s.y yVar, Object obj) {
            try {
                int i = this.y;
                if (i == 0) {
                    this.n3.invoke(obj, null);
                } else if (i == 1) {
                    this.n3.invoke(obj, mtVar);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.n3.invoke(obj, mtVar, yVar);
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to call observer method", e5.getCause());
            }
        }
    }

    @Deprecated
    public static class y {
        public final Map<C0011n3, s.y> n3;
        public final Map<s.y, List<C0011n3>> y = new HashMap();

        public y(Map<C0011n3, s.y> map) {
            this.n3 = map;
            for (Map.Entry<C0011n3, s.y> entry : map.entrySet()) {
                s.y value = entry.getValue();
                List<C0011n3> arrayList = this.y.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.y.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void n3(List<C0011n3> list, ap.mt mtVar, s.y yVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).y(mtVar, yVar, obj);
                }
            }
        }

        public void y(ap.mt mtVar, s.y yVar, Object obj) {
            n3(this.y.get(yVar), mtVar, yVar, obj);
            n3(this.y.get(s.y.ON_ANY), mtVar, yVar, obj);
        }
    }

    public boolean gv(Class<?> cls) {
        Boolean bool = this.n3.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrN3 = n3(cls);
        for (Method method : methodArrN3) {
            if (((w) method.getAnnotation(w.class)) != null) {
                y(cls, methodArrN3);
                return true;
            }
        }
        this.n3.put(cls, Boolean.FALSE);
        return false;
    }

    public final Method[] n3(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    public final void v(Map<C0011n3, s.y> map, C0011n3 c0011n3, s.y yVar, Class<?> cls) {
        s.y yVar2 = map.get(c0011n3);
        if (yVar2 == null || yVar == yVar2) {
            if (yVar2 == null) {
                map.put(c0011n3, yVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0011n3.n3.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + yVar2 + ", new value " + yVar);
    }

    public final y y(Class<?> cls, @Nullable Method[] methodArr) {
        int i;
        y yVarZn;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (yVarZn = zn(superclass)) != null) {
            map.putAll(yVarZn.n3);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0011n3, s.y> entry : zn(cls2).n3.entrySet()) {
                v(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = n3(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            w wVar = (w) method.getAnnotation(w.class);
            if (wVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ap.mt.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                s.y yVarValue = wVar.value();
                if (parameterTypes.length > 1) {
                    if (!s.y.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (yVarValue != s.y.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                v(map, new C0011n3(i, method), yVarValue, cls);
                z = true;
            }
        }
        y yVar = new y(map);
        this.y.put(cls, yVar);
        this.n3.put(cls, Boolean.valueOf(z));
        return yVar;
    }

    public y zn(Class<?> cls) {
        y yVar = this.y.get(cls);
        return yVar != null ? yVar : y(cls, null);
    }
}
