package sj1;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xc {
    public static final xc y = new xc();

    public static final String y(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.stringPlus("Basic ", hk1.s.fb.zn(username + ':' + password, charset).y());
    }
}
