package yg;

import ap.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v<T extends b> {
    public final Function1<y, T> n3;
    public final Class<T> y;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Class<T> clazz, Function1<? super y, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.y = clazz;
        this.n3 = initializer;
    }

    public final Function1<y, T> n3() {
        return this.n3;
    }

    public final Class<T> y() {
        return this.y;
    }
}
