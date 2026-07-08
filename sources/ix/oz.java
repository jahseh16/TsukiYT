package ix;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class oz implements j {
    public final WebViewProviderFactoryBoundaryInterface y;

    public oz(@NonNull WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.y = webViewProviderFactoryBoundaryInterface;
    }

    @Override // ix.j
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        return (WebViewProviderBoundaryInterface) kk1.y.y(WebViewProviderBoundaryInterface.class, this.y.createWebView(webView));
    }

    @Override // ix.j
    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) kk1.y.y(ServiceWorkerControllerBoundaryInterface.class, this.y.getServiceWorkerController());
    }

    @Override // ix.j
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) kk1.y.y(StaticsBoundaryInterface.class, this.y.getStatics());
    }

    @Override // ix.j
    @NonNull
    public String[] y() {
        return this.y.getSupportedFeatures();
    }
}
