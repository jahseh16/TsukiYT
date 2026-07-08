package pl1;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static Constructor<MethodHandles.Lookup> y;

    @IgnoreJRERequirement
    public static Object y(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> declaredConstructor = y;
        if (declaredConstructor == null) {
            declaredConstructor = xc.y().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            y = declaredConstructor;
        }
        return w.y(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
