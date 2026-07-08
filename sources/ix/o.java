package ix;

import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import ro.s;

/* JADX INFO: loaded from: classes.dex */
public class o {
    public WebViewProviderBoundaryInterface y;

    public o(@NonNull WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.y = webViewProviderBoundaryInterface;
    }

    @NonNull
    public WebViewClient n3() {
        return this.y.getWebViewClient();
    }

    public void y(@NonNull String str, @NonNull String[] strArr, @NonNull s.y yVar) {
        this.y.addWebMessageListener(str, strArr, kk1.y.zn(new vl(yVar)));
    }

    public void zn(@NonNull String str) {
        this.y.removeWebMessageListener(str);
    }
}
