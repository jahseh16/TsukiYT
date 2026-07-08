package cl1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final il1.y n3;
    public final xk1.y y;
    public final fl1.y zn;

    public n3(xk1.y koin, il1.y scope, fl1.y yVar) {
        Intrinsics.checkNotNullParameter(koin, "koin");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.y = koin;
        this.n3 = scope;
        this.zn = yVar;
    }

    public final fl1.y n3() {
        return this.zn;
    }

    public final xk1.y y() {
        return this.y;
    }

    public final il1.y zn() {
        return this.n3;
    }

    public /* synthetic */ n3(xk1.y yVar, il1.y yVar2, fl1.y yVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, yVar2, (i & 4) != 0 ? null : yVar3);
    }
}
