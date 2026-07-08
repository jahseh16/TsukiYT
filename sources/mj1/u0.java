package mj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends jz {
    public final String zn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kj1.a primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.zn = primitive.s() + "Array";
    }

    @Override // kj1.a
    public String s() {
        return this.zn;
    }
}
