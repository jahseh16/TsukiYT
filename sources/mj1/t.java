package mj1;

import kj1.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ij1.zn<Byte> {
    public static final t y = new t();
    public static final kj1.a n3 = new y4("kotlin.Byte", v.n3.y);

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, byte b4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.fb(b4);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((Number) obj).byteValue());
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.z6());
    }
}
