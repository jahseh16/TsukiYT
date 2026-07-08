package androidx.navigation;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.navigation.xc;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@xc.n3(NotificationCompat.CATEGORY_NAVIGATION)
public class i9 extends xc<c5> {
    public final w zn;

    public i9(w navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.zn = navigatorProvider;
    }

    @Override // androidx.navigation.xc
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public c5 y() {
        return new c5(this);
    }

    public final void tl(zn znVar, t tVar, xc.y yVar) {
        s sVarV = znVar.v();
        Intrinsics.checkNotNull(sVarV, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        c5 c5Var = (c5) sVarV;
        Bundle bundleZn = znVar.zn();
        int iD = c5Var.d();
        String strZ6 = c5Var.z6();
        if (iD == 0 && strZ6 == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + c5Var.c5()).toString());
        }
        s sVarRz = strZ6 != null ? c5Var.rz(strZ6, false) : c5Var.d0(iD, false);
        if (sVarRz != null) {
            this.zn.gv(sVarRz.f()).v(CollectionsKt.listOf(n3().y(sVarRz, sVarRz.v(bundleZn))), tVar, yVar);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + c5Var.ta() + " is not a direct child of this NavGraph");
    }

    @Override // androidx.navigation.xc
    public void v(List<zn> entries, t tVar, xc.y yVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator<zn> it = entries.iterator();
        while (it.hasNext()) {
            tl(it.next(), tVar, yVar);
        }
    }
}
