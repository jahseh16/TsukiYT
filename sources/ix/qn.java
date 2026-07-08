package ix;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class qn {

    public static class y {
        public static final j y = qn.y();
    }

    @NonNull
    public static ClassLoader gv() {
        return Build.VERSION.SDK_INT >= 28 ? ta.n3() : v().getClass().getClassLoader();
    }

    public static InvocationHandler n3() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, gv()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static Object v() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @NonNull
    public static j y() {
        try {
            return new oz((WebViewProviderFactoryBoundaryInterface) kk1.y.y(WebViewProviderFactoryBoundaryInterface.class, n3()));
        } catch (ClassNotFoundException unused) {
            return new ej();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @NonNull
    public static j zn() {
        return y.y;
    }
}
