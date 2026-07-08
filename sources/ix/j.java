package ix;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public interface j {
    @NonNull
    WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView);

    @NonNull
    ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    @NonNull
    StaticsBoundaryInterface getStatics();

    @NonNull
    String[] y();
}
