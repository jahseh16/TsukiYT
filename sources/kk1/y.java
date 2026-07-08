package kk1;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: kk1.y$y, reason: collision with other inner class name */
    public static class C0118y implements InvocationHandler {
        public final Object y;

        public C0118y(@NonNull Object obj) {
            this.y = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return y.gv(method, this.y.getClass().getClassLoader()).invoke(this.y, objArr);
            } catch (InvocationTargetException e4) {
                throw e4.getTargetException();
            } catch (ReflectiveOperationException e5) {
                throw new RuntimeException("Reflection failed for method " + method, e5);
            }
        }
    }

    public static Method gv(Method method, ClassLoader classLoader) throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static boolean n3(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (v()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean v() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    @Nullable
    public static <T> T y(@NonNull Class<T> cls, @Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(y.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    @Nullable
    public static InvocationHandler zn(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0118y(obj);
    }
}
