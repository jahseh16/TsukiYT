package pl1;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public abstract class yt<T> {
    public static <T> yt<T> n3(k5 k5Var, Class<?> cls, Method method) {
        x xVarN3 = x.n3(k5Var, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (j5.i9(genericReturnType)) {
            throw j5.wz(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return x4.a(k5Var, method, xVarN3);
        }
        throw j5.wz(method, "Service methods cannot return void.", new Object[0]);
    }

    public abstract T y(Object obj, Object[] objArr);
}
