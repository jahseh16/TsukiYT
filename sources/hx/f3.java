package hx;

import android.net.Uri;
import v0.qn;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {
    public final int n3;
    public final long y;
    public final Uri zn;

    public f3(long j, int i, Uri uri) {
        this.y = j;
        this.n3 = i;
        this.zn = uri;
    }

    public static Uri n3(String str, Uri uri) {
        v0.y.y(((String) v0.y.v(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) v0.y.v(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        if (string.endsWith("/")) {
            return qn.v(string, str);
        }
        return qn.v(string + "/", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k4.r<hx.f3> y(java.lang.String r18, android.net.Uri r19) throws ft.q {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx.f3.y(java.lang.String, android.net.Uri):k4.r");
    }
}
