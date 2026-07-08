package pl1;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
public class d {

    @IgnoreJRERequirement
    public static class n3 extends d {
        @Override // pl1.d
        public Object n3(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
            return z.y(method, cls, obj, objArr);
        }

        @Override // pl1.d
        public String y(Method method, int i) {
            Parameter parameter = method.getParameters()[i];
            if (!parameter.isNamePresent()) {
                return super.y(method, i);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // pl1.d
        public boolean zn(Method method) {
            return method.isDefault();
        }
    }

    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    @IgnoreJRERequirement
    public static final class y extends d {
        @Override // pl1.d
        public Object n3(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return z.y(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // pl1.d
        public boolean zn(Method method) {
            return method.isDefault();
        }
    }

    public Object n3(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    public String y(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public boolean zn(Method method) {
        return false;
    }
}
