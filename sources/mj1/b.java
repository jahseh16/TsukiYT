package mj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ct {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kj1.a keyDesc, kj1.a valueDesc) {
        super("kotlin.collections.HashMap", keyDesc, valueDesc, null);
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
