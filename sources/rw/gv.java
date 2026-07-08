package rw;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public static final String n3(String str) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strEncode = URLEncoder.encode(str, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return StringsKt.replace$default(strEncode, "+", "%20", false, 4, (Object) null);
    }

    public static final String y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return zn.y.n3().y(str);
    }
}
