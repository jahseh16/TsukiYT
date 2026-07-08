package sj1;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final xj1.fb y;

    public f(xj1.fb delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.y = delegate;
    }

    public final xj1.fb y() {
        return this.y;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(int i, long j, TimeUnit timeUnit) {
        this(new xj1.fb(wj1.v.f9019c5, i, j, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public f() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
