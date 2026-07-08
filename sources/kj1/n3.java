package kj1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import mj1.pq;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final a n3(pj1.zn znVar, a descriptor) {
        ij1.zn znVarZn;
        Intrinsics.checkNotNullParameter(znVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> kClassY = y(descriptor);
        if (kClassY == null || (znVarZn = pj1.zn.zn(znVar, kClassY, null, 2, null)) == null) {
            return null;
        }
        return znVarZn.getDescriptor();
    }

    public static final KClass<?> y(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof zn) {
            return ((zn) aVar).n3;
        }
        if (aVar instanceof pq) {
            return y(((pq) aVar).i9());
        }
        return null;
    }

    public static final a zn(a aVar, KClass<?> context) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new zn(aVar, context);
    }
}
