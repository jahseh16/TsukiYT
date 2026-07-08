package bl1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
