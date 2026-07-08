package dk1;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final y f3213gv = new y(null);
    public final Method n3;
    public final Method y;
    public final Method zn;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i9 y() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new i9(method3, method2, method);
        }

        public y() {
        }
    }

    public i9(Method method, Method method2, Method method3) {
        this.y = method;
        this.n3 = method2;
        this.zn = method3;
    }

    public final boolean n3(Object obj) {
        if (obj != null) {
            try {
                Method method = this.zn;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final Object y(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.y;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.n3;
                Intrinsics.checkNotNull(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
