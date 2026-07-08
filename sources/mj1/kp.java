package mj1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kp {
    public static final void y(int i, int i5, kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i8 = (~i) & i5;
        for (int i10 = 0; i10 < 32; i10++) {
            if ((i8 & 1) != 0) {
                arrayList.add(descriptor.v(i10));
            }
            i8 >>>= 1;
        }
        throw new ij1.gv(arrayList, descriptor.s());
    }
}
