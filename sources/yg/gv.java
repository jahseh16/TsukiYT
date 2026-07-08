package yg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.y;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends y {
    /* JADX WARN: Multi-variable type inference failed */
    public gv() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // yg.y
    public <T> T y(y.n3<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) n3().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void zn(y.n3<T> key, T t3) {
        Intrinsics.checkNotNullParameter(key, "key");
        n3().put(key, t3);
    }

    public gv(y initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        n3().putAll(initialExtras.n3());
    }

    public /* synthetic */ gv(y yVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? y.C0200y.n3 : yVar);
    }
}
