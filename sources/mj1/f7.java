package mj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends jz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(kj1.a elementDesc) {
        super(elementDesc, null);
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
    }

    @Override // kj1.a
    public String s() {
        return "kotlin.collections.LinkedHashSet";
    }
}
