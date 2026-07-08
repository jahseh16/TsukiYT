package ix;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class z6 extends ServiceWorkerClient {
    public final ro.n3 y;

    public z6(@NonNull ro.n3 n3Var) {
        this.y = n3Var;
    }

    @Override // android.webkit.ServiceWorkerClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest) {
        return this.y.y(webResourceRequest);
    }
}
