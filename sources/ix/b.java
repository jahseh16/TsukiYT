package ix;

import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class b extends ro.gv {
    public ServiceWorkerWebSettingsBoundaryInterface n3;
    public ServiceWorkerWebSettings y;

    public b(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.y = serviceWorkerWebSettings;
    }

    public b(@NonNull InvocationHandler invocationHandler) {
        this.n3 = (ServiceWorkerWebSettingsBoundaryInterface) kk1.y.y(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
