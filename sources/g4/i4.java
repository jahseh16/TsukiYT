package g4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {
    public static final Method n3;
    public static final Object y;
    public static final Method zn;

    static {
        Object objN3 = n3();
        y = objN3;
        n3 = objN3 == null ? null : y();
        zn = objN3 != null ? gv(objN3) : null;
    }

    public static Method gv(Object obj) {
        try {
            Method methodZn = zn("getStackTraceDepth", Throwable.class);
            if (methodZn == null) {
                return null;
            }
            methodZn.invoke(obj, new Throwable());
            return methodZn;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object n3() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void v(Throwable th) {
        xc.t(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static Method y() {
        return zn("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    public static Method zn(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (Throwable unused) {
            return null;
        }
    }
}
