package mj1;

import kj1.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements ij1.zn<Short> {
    public static final ad y = new ad();
    public static final kj1.a n3 = new y4("kotlin.Short", v.s.y);

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, short s3) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.p(s3);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((Number) obj).shortValue());
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Short deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.xc());
    }
}
