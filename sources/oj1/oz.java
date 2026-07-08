package oj1;

import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oz {
    public static final Set<kj1.a> y = SetsKt.setOf((Object[]) new kj1.a[]{jj1.y.r(UInt.Companion).getDescriptor(), jj1.y.x4(ULong.Companion).getDescriptor(), jj1.y.z(UByte.Companion).getDescriptor(), jj1.y.i4(UShort.Companion).getDescriptor()});

    public static final boolean y(kj1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.isInline() && y.contains(aVar);
    }
}
