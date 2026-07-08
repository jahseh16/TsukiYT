package xj1;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final IOException gv() {
        return this.lastConnectException;
    }

    public final IOException n3() {
        return this.firstConnectException;
    }

    public final void y(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        ExceptionsKt.addSuppressed(this.firstConnectException, e4);
        this.lastConnectException = e4;
    }
}
