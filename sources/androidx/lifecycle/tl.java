package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public static final ap.wz y(s sVar) {
        i9 i9Var;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        do {
            i9 i9Var2 = (i9) sVar.zn().get();
            if (i9Var2 != null) {
                return i9Var2;
            }
            i9Var = new i9(sVar, SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
        } while (!ap.w.y(sVar.zn(), null, i9Var));
        i9Var.v();
        return i9Var;
    }
}
