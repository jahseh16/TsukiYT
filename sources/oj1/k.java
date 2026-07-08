package oj1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final <T> T n3(nj1.y yVar, String discriminator, nj1.r element, ij1.n3<T> deserializer) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) new ud(yVar, element, discriminator, deserializer.getDescriptor()).i4(deserializer);
    }

    public static final <T> T y(nj1.y yVar, nj1.s element, ij1.n3<T> deserializer) {
        lj1.v taVar;
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof nj1.r) {
            taVar = new ud(yVar, (nj1.r) element, null, null, 12, null);
        } else if (element instanceof nj1.n3) {
            taVar = new x(yVar, (nj1.n3) element);
        } else {
            if (!(element instanceof nj1.w ? true : Intrinsics.areEqual(element, nj1.co.f6955fb))) {
                throw new NoWhenBranchMatchedException();
            }
            taVar = new ta(yVar, (nj1.f3) element);
        }
        return (T) taVar.i4(deserializer);
    }
}
