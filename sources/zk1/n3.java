package zk1;

import bl1.gv;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements zn {
    public static xk1.y n3;
    public static final n3 y = new n3();
    public static xk1.n3 zn;

    public final void gv(xk1.n3 n3Var) throws gv {
        if (n3 != null) {
            throw new gv("A Koin Application has already been started");
        }
        zn = n3Var;
        n3 = n3Var.n3();
    }

    @Override // zk1.zn
    public xk1.n3 n3(Function1<? super xk1.n3, Unit> appDeclaration) {
        xk1.n3 n3VarY;
        Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
        synchronized (this) {
            n3VarY = xk1.n3.zn.y();
            y.gv(n3VarY);
            appDeclaration.invoke(n3VarY);
            n3VarY.y();
        }
        return n3VarY;
    }

    @Override // zk1.zn
    public void y(el1.y module) {
        Intrinsics.checkNotNullParameter(module, "module");
        synchronized (this) {
            xk1.y.fb(y.zn(), CollectionsKt.listOf(module), false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public xk1.y zn() {
        xk1.y yVar = n3;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }
}
