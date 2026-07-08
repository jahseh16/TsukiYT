package oj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z6 {
    public static final <T> void y(nj1.y yVar, hw writer, ij1.f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new j(writer, yVar, en.OBJ, new nj1.tl[en.values().length]).c5(serializer, t3);
    }
}
