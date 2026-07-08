package mj1;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g3 {
    public static final int y(kj1.a aVar, kj1.a[] typeParams) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (aVar.s().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<kj1.a> iterableY = kj1.s.y(aVar);
        Iterator<kj1.a> it = iterableY.iterator();
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = i * 31;
            String strS = it.next().s();
            if (strS != null) {
                iHashCode3 = strS.hashCode();
            }
            i = i5 + iHashCode3;
        }
        Iterator<kj1.a> it2 = iterableY.iterator();
        while (it2.hasNext()) {
            int i8 = iHashCode2 * 31;
            kj1.i9 kind = it2.next().getKind();
            iHashCode2 = i8 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }
}
