package mj1;

import kj1.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements ij1.zn<Boolean> {
    public static final c5 y = new c5();
    public static final kj1.a n3 = new y4("kotlin.Boolean", v.y.y);

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, boolean z) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.z(z);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((Boolean) obj).booleanValue());
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.z());
    }
}
