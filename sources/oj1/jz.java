package oj1;

import kj1.f;
import kj1.i9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jz {
    public static final en n3(nj1.y yVar, kj1.a desc) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        kj1.i9 kind = desc.getKind();
        if (kind instanceof kj1.gv) {
            return en.POLY_OBJ;
        }
        if (Intrinsics.areEqual(kind, f.n3.y)) {
            return en.LIST;
        }
        if (!Intrinsics.areEqual(kind, f.zn.y)) {
            return en.OBJ;
        }
        kj1.a aVarY = y(desc.fb(0), yVar.y());
        kj1.i9 kind2 = aVarY.getKind();
        if ((kind2 instanceof kj1.v) || Intrinsics.areEqual(kind2, i9.n3.y)) {
            return en.MAP;
        }
        if (yVar.v().n3()) {
            return en.LIST;
        }
        throw fh.gv(aVarY);
    }

    public static final kj1.a y(kj1.a aVar, pj1.zn module) {
        kj1.a aVarY;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(aVar.getKind(), i9.y.y)) {
            return aVar.isInline() ? y(aVar.fb(0), module) : aVar;
        }
        kj1.a aVarN3 = kj1.n3.n3(module, aVar);
        return (aVarN3 == null || (aVarY = y(aVarN3, module)) == null) ? aVar : aVarY;
    }
}
