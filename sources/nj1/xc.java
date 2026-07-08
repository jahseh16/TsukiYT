package nj1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xc {
    public static /* synthetic */ y n3(y yVar, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            yVar = y.f6974gv;
        }
        return y(yVar, function1);
    }

    public static final y y(y from, Function1<? super gv, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        gv gvVar = new gv(from);
        builderAction.invoke(gvVar);
        return new wz(gvVar.y(), gvVar.n3());
    }
}
