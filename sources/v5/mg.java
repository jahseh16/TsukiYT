package v5;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mg extends IOException {
    public final long bytesLoaded;
    public final r0.p dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public mg(r0.p pVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.dataSpec = pVar;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j;
    }
}
