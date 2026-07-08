package mj1;

import kj1.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ij1.zn<Integer> {
    public static final j y = new j();
    public static final kj1.a n3 = new y4("kotlin.Int", v.a.y);

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mg(i);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((Number) obj).intValue());
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.s());
    }
}
