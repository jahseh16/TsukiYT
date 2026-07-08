package ap;

import kotlin.jvm.internal.Intrinsics;
import yg.y;

/* JADX INFO: loaded from: classes.dex */
public final class vl {
    public static final yg.y y(j5 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof androidx.lifecycle.a ? ((androidx.lifecycle.a) owner).getDefaultViewModelCreationExtras() : y.C0200y.n3;
    }
}
