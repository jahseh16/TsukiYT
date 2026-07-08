package ix;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class p {
    public static int a(@NonNull WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    @NonNull
    public static b c5(@NonNull ServiceWorkerController serviceWorkerController) {
        return new b(s(serviceWorkerController));
    }

    public static void f(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowContentAccess(z);
    }

    @NonNull
    public static ServiceWorkerController fb() {
        return ServiceWorkerController.getInstance();
    }

    public static int gv(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    public static boolean i9(@NonNull WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    public static boolean n3(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    public static void p(@NonNull ServiceWorkerController serviceWorkerController, @NonNull ro.n3 n3Var) {
        serviceWorkerController.setServiceWorkerClient(new z6(n3Var));
    }

    @NonNull
    public static ServiceWorkerWebSettings s(@NonNull ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    public static void t(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowFileAccess(z);
    }

    public static void tl(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z);
    }

    @NonNull
    public static File v(@NonNull Context context) {
        return context.getDataDir();
    }

    public static void w(@NonNull ServiceWorkerController serviceWorkerController, @Nullable ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    public static void wz(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, int i) {
        serviceWorkerWebSettings.setCacheMode(i);
    }

    public static void xc(@NonNull WebSettings webSettings, int i) {
        webSettings.setDisabledActionModeMenuItems(i);
    }

    public static boolean y(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    public static boolean zn(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }
}
