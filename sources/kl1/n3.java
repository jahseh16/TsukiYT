package kl1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static /* synthetic */ el1.y n3(boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return y(z, function1);
    }

    public static final el1.y y(boolean z, Function1<? super el1.y, Unit> moduleDeclaration) {
        Intrinsics.checkNotNullParameter(moduleDeclaration, "moduleDeclaration");
        el1.y yVar = new el1.y(z);
        moduleDeclaration.invoke(yVar);
        return yVar;
    }
}
