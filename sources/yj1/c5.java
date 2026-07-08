package yj1;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import sj1.d0;
import sj1.r;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {
    public static final c5 y = new c5();

    public final boolean n3(d0 d0Var, Proxy.Type type) {
        return !d0Var.fb() && type == Proxy.Type.HTTP;
    }

    public final String y(d0 request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.s());
        sb.append(' ');
        c5 c5Var = y;
        if (c5Var.n3(request, proxyType)) {
            sb.append(request.t());
        } else {
            sb.append(c5Var.zn(request.t()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String zn(r url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strV = url.v();
        String strFb = url.fb();
        if (strFb == null) {
            return strV;
        }
        return strV + '?' + ((Object) strFb);
    }
}
