package ix;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class a8 implements ServiceWorkerClientBoundaryInterface {
    public final ro.n3 y;

    public a8(@NonNull ro.n3 n3Var) {
        this.y = n3Var;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest) {
        return this.y.y(webResourceRequest);
    }
}
